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
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french" + "'", str3, "french");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.Locale locale3 = new java.util.Locale("Italienisch", "fr-FR", "fran\347ais");
        org.junit.Assert.assertEquals(locale3.toString(), "italienisch_FR-FR_fran\347ais");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=korean (south korea)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinesisch (China)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch(china)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder12 = builder5.setExtension('x', "English");
        java.util.Locale.Builder builder14 = builder5.removeUnicodeLocaleAttribute("English");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Number number9 = faker8.number();
        java.lang.String str11 = faker8.letterify("German");
        com.github.javafaker.Name name12 = faker8.name();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "German" + "'", str11, "German");
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.Random random1 = new java.util.Random((long) 428558259);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getISO3Country();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHN" + "'", str2, "CHN");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.Locale locale3 = new java.util.Locale("japan", "\u672a\u5b9a\u8bed\u79cd", "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u672a\u5b9a\u8bed\u79cd_zh_CN");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u56fd", (double) (-1140488501));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.140488501E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u6cd5\u56fd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("coreano", (double) 1594312834);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.594312834E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.Locale locale3 = new java.util.Locale("Chinesisch (Taiwan)", "chinese (china)", "Japan");
        org.junit.Assert.assertEquals(locale3.toString(), "chinesisch (taiwan)_CHINESE (CHINA)_Japan");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.Locale locale2 = new java.util.Locale("us", "zh-cn (JPN)");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "us_ZH-CN (JPN)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us_ZH-CN (JPN)" + "'", str3, "us_ZH-CN (JPN)");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.setVariant("ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ita [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.lang.String str16 = locale9.getDisplayName(locale13);
        java.lang.String str18 = locale9.getExtension('x');
        java.util.Locale locale20 = new java.util.Locale("fra");
        java.lang.String str21 = locale9.getDisplayScript(locale20);
        java.util.Locale locale22 = locale9.stripExtensions();
        java.lang.String str23 = locale7.getDisplayLanguage(locale22);
        java.lang.String str24 = locale7.getDisplayScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals(locale20.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "french" + "'", str23, "french");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        int int9 = random6.nextInt();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1107254586 + "'", int9 == 1107254586);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.lang.String str9 = locale8.getISO3Country();
        java.lang.String str10 = locale8.getCountry();
        java.util.Locale locale11 = locale8.stripExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder6.removeUnicodeLocaleAttribute("English");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream5 = random1.ints((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random1.ints(1499498498, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.getDefault(category9);
        java.util.Locale locale17 = java.util.Locale.getDefault(category9);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        java.util.Locale locale23 = java.util.Locale.getDefault(category0);
        java.util.Locale locale25 = new java.util.Locale("fr");
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale.Builder builder30 = builder27.clear();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getLanguage();
        java.util.Locale.Builder builder34 = builder30.setLocale(locale32);
        java.lang.String str35 = locale26.getDisplayCountry(locale32);
        java.lang.String str36 = locale26.getDisplayName();
        java.lang.String str37 = locale25.getDisplayScript(locale26);
        java.util.Locale.setDefault(category0, locale26);
        java.lang.String str39 = locale26.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fr" + "'", str33, "fr");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Italian" + "'", str36, "Italian");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        double double3 = random0.nextGaussian();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.14532173f + "'", float2 == 0.14532173f);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9659058970072599d + "'", double3 == 0.9659058970072599d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ENGLISH", (double) 0.99127567f);
        boolean boolean4 = languageRange2.equals((java.lang.Object) "italian");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        java.lang.String str8 = faker4.regexify("ita");
        java.lang.String str10 = faker4.numerify("de");
        com.github.javafaker.Business business11 = faker4.business();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ita" + "'", str8, "ita");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de" + "'", str10, "de");
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.Random random1 = new java.util.Random((long) 74589158);
        int int3 = random1.nextInt(1699180332);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((double) (-820982641), (double) 0.23210937f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 757477532 + "'", int3 == 757477532);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder10 = builder5.setUnicodeLocaleKeyword("it", "English");
        java.util.Locale.Builder builder13 = builder10.setExtension('x', "x-lvariant-JPN");
        java.util.Locale.Builder builder15 = builder10.setRegion("CA");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.Random random1 = new java.util.Random((long) (-144180575));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream5 = random1.longs((long) (-389258033), (long) 1447301737);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("Allemagne");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Allemagne [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        double double8 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream11 = random1.doubles((double) 0.94697636f, (double) 0.98024064f);
        random1.setSeed((long) 2043360656);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24411725056425315d + "'", double8 == 0.24411725056425315d);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) 1180466361);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Number number5 = faker0.number();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale0.getExtension('a');
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str12 = locale8.getExtension('a');
        boolean boolean13 = locale8.hasExtensions();
        java.util.Set<java.lang.Character> charSet14 = locale8.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale15.getDisplayName(locale16);
        java.lang.String str18 = locale8.getDisplayName(locale16);
        java.lang.String str19 = locale0.getDisplayCountry(locale8);
        java.lang.String str20 = locale8.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Englisch (Kanada)" + "'", str17, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italienisch" + "'", str18, "Italienisch");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category14);
        java.util.Locale locale20 = java.util.Locale.getDefault(category14);
        java.util.Locale locale21 = java.util.Locale.getDefault(category14);
        java.util.Locale locale22 = java.util.Locale.getDefault(category14);
        java.util.Locale.Builder builder23 = builder10.setLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder23.setUnicodeLocaleKeyword("french", "DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: french [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        java.lang.String str5 = faker0.numerify("fr");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "China");
        java.util.Locale.Builder builder12 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("GB", "ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=27.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        com.github.javafaker.Company company7 = faker0.company();
        java.lang.String str9 = faker0.letterify("Twi");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Twi" + "'", str9, "Twi");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.Locale locale3 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.Locale locale2 = new java.util.Locale("hi!", "x-lvariant-fr");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_X-LVARIANT-FR");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Color color7 = faker0.color();
        java.lang.String str9 = faker0.bothify("und-FR");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und-FR" + "'", str9, "und-FR");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.util.Locale.Builder builder9 = builder4.setLocale(locale8);
        java.lang.String str10 = locale8.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book2 = faker1.book();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Number number4 = faker1.number();
        java.lang.String str6 = faker1.bothify("Japan");
        com.github.javafaker.App app7 = faker1.app();
        com.github.javafaker.Internet internet8 = faker1.internet();
        com.github.javafaker.Name name9 = faker1.name();
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Japan" + "'", str6, "Japan");
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zho", 0.7924908613121775d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category14);
        java.util.Locale locale20 = java.util.Locale.getDefault(category14);
        java.util.Locale locale21 = java.util.Locale.getDefault(category14);
        java.util.Locale locale22 = java.util.Locale.getDefault(category14);
        java.util.Locale.Builder builder23 = builder10.setLocale(locale22);
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleKeys();
        boolean boolean25 = locale22.hasExtensions();
        java.lang.String str26 = locale22.toLanguageTag();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr" + "'", str26, "fr");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("English United Kingdom", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englishunitedkingdom");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale4.getDisplayCountry(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale4.getDisplayScript(locale21);
        java.lang.String str23 = locale21.getDisplayScript();
        java.util.Random random25 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale21, random25);
        com.github.javafaker.Color color27 = faker26.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        java.lang.String str13 = locale0.getCountry();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setVariant("");
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.lang.String str19 = locale0.getDisplayCountry(locale18);
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale18.getDisplayName();
        boolean boolean22 = locale18.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CN" + "'", str13, "CN");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Book book5 = faker0.book();
        java.lang.String str7 = faker0.numerify("");
        com.github.javafaker.Name name8 = faker0.name();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) (byte) 0);
        int int5 = random1.nextInt(795965107);
        java.util.stream.LongStream longStream7 = random1.longs(4233101705359871616L);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 773776253 + "'", int5 == 773776253);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setRegion("italien");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: italien [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.util.Locale locale1 = new java.util.Locale("zh,CN");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh,cn could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "zh,cn");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.Locale locale2 = new java.util.Locale("de", "Chinese (China)");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale7.getDisplayScript(locale11);
        java.lang.String str14 = locale2.getDisplayVariant(locale11);
        java.util.Locale locale15 = locale11.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str18 = locale16.getDisplayLanguage(locale17);
        java.lang.String str19 = locale16.getVariant();
        java.lang.String str20 = locale16.getDisplayName();
        java.lang.String str21 = locale15.getDisplayName(locale16);
        java.lang.String str22 = locale16.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "de_CHINESE (CHINA)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u97d3\u6587" + "'", str18, "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean" + "'", str20, "Korean");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str21, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ko" + "'", str22, "ko");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.Locale locale3 = new java.util.Locale("GB", "", "Englisch (Kanada)");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "gb__Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gb__Englisch (Kanada)" + "'", str4, "gb__Englisch (Kanada)");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Options options8 = faker4.options();
        com.github.javafaker.Color color9 = faker4.color();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker4.phoneNumber();
        com.github.javafaker.Code code11 = faker4.code();
        com.github.javafaker.Color color12 = faker4.color();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese (China)");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.lang.String str9 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale6.getDisplayScript(locale10);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale6.getDisplayCountry(locale20);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale6.getDisplayScript(locale23);
        java.lang.String str25 = locale23.getDisplayScript();
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale1.getDisplayScript(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = locale23.getUnicodeLocaleType("Italienisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Italienisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Random random1 = new java.util.Random(0L);
        double double2 = random1.nextGaussian();
        boolean boolean3 = random1.nextBoolean();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream5 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles((long) (-429436262), (double) (-1155484576), (double) 0.7172592f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("x-lvariant-fr", (double) 0.8585435f);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8585435152053833d + "'", double3 == 0.8585435152053833d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.regexify("eng");
        com.github.javafaker.Internet internet9 = faker5.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ITA", 0.8733440484689767d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.Locale locale3 = new java.util.Locale("French", "coreano", "\u65e5\u672c");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u65e5\u672c");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.Random random7 = new java.util.Random(1L);
        java.util.Random random9 = new java.util.Random((long) (short) 1);
        java.util.Random random11 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream13 = random11.doubles((long) 10);
        int int14 = random11.nextInt();
        java.util.stream.DoubleStream doubleStream15 = random11.doubles();
        java.util.stream.IntStream intStream16 = random11.ints();
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random18.nextBytes(byteArray24);
        random11.nextBytes(byteArray24);
        random9.nextBytes(byteArray24);
        random7.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1157793070) + "'", int14 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[73, -90, 100]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder7 = builder0.setVariant("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("deu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: deu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.util.Locale locale1 = new java.util.Locale("und");
        java.lang.String str3 = locale1.getExtension('u');
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "und");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder10.build();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder16 = builder10.setLocale(locale15);
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        int int21 = random18.nextInt();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random18);
        java.util.stream.LongStream longStream23 = random18.longs();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale15, random18);
        com.github.javafaker.Company company25 = faker24.company();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(company25);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder6.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("zh-cn (JPN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-cn (JPN) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguage("JPN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder11 = builder7.setRegion("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        random1.setSeed((long) 1408303951);
        java.util.stream.LongStream longStream7 = random1.longs();
        java.util.stream.LongStream longStream8 = random1.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("french", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("ita", strMap7);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str12 = languageRange11.getRange();
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] { languageRange11, languageRange15, languageRange18, languageRange21, languageRange24 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.setVariant("");
        java.util.Locale locale34 = builder31.build();
        java.util.Locale locale38 = new java.util.Locale("", "", "");
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.lang.String str43 = locale38.getDisplayLanguage(locale42);
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.lang.String str53 = locale48.getDisplayLanguage(locale52);
        java.util.Locale locale57 = new java.util.Locale("", "", "");
        java.lang.String str59 = locale57.getExtension('x');
        java.util.Locale.setDefault(locale57);
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.util.Locale locale63 = locale62.stripExtensions();
        java.lang.String str64 = locale63.getISO3Country();
        java.util.Locale locale68 = new java.util.Locale("", "", "");
        java.util.Locale locale72 = new java.util.Locale("", "", "");
        java.lang.String str73 = locale68.getDisplayLanguage(locale72);
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.util.Locale locale76 = locale75.stripExtensions();
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.util.Locale locale82 = new java.util.Locale("hi!");
        java.util.Locale locale83 = locale82.stripExtensions();
        java.util.Locale[] localeArray84 = new java.util.Locale[] { locale34, locale38, locale44, locale52, locale57, locale63, locale72, locale75, locale78, locale80, locale82 };
        java.util.ArrayList<java.util.Locale> localeList85 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList85, localeArray84);
        java.util.Locale.FilteringMode filteringMode87 = null;
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList85, filteringMode87);
        java.util.Locale locale89 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap91 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.parse("fr", strMap91);
        java.util.Locale locale93 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet94 = locale93.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode95 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList92, (java.util.Collection<java.lang.String>) strSet94, filteringMode95);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList85, filteringMode95);
        java.util.Locale locale98 = java.util.Locale.lookup(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList97);
        java.util.Locale locale99 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList97);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertEquals(locale82.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(localeList88);
// flaky:         org.junit.Assert.assertNotNull(locale89);
// flaky:         org.junit.Assert.assertEquals(locale89.toString(), "fr");
        org.junit.Assert.assertNotNull(languageRangeList92);
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertTrue("'" + filteringMode95 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode95.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNull(locale98);
        org.junit.Assert.assertNull(locale99);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.util.Locale locale1 = new java.util.Locale("Twi");
        org.junit.Assert.assertEquals(locale1.toString(), "twi");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random(100L);
        double double4 = random3.nextGaussian();
        random3.setSeed((long) (-1157793070));
        double double7 = random3.nextGaussian();
        boolean boolean8 = random3.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Internet internet11 = faker10.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09760425216810112d + "'", double7 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder10.build();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder15.setVariant("");
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale locale19 = builder17.build();
        java.lang.String str20 = locale14.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet23 = locale21.getExtensionKeys();
        java.lang.String str24 = locale19.getDisplayLanguage(locale21);
        java.lang.String str25 = locale21.toLanguageTag();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fr" + "'", str25, "fr");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        random1.setSeed((long) 'a');
        java.util.stream.LongStream longStream13 = random1.longs((-6139822020582680716L), (long) 74589158);
        java.util.stream.IntStream intStream17 = random1.ints((long) 1078116549, (-445402448), 2043360656);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream9 = random8.longs();
        float float10 = random8.nextFloat();
        java.util.stream.IntStream intStream11 = random8.ints();
        int int12 = random8.nextInt();
        random8.setSeed((long) (-1155869325));
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random8);
        java.lang.String str17 = faker15.bothify("fra");
        java.lang.String str19 = faker15.bothify("chinois");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.46980608f + "'", float10 == 0.46980608f);
        org.junit.Assert.assertNotNull(intStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-722350264) + "'", int12 == (-722350264));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fra" + "'", str17, "fra");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chinois" + "'", str19, "chinois");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinese china", (double) 127135246);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.27135246E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Company company6 = faker0.company();
        java.lang.String str8 = faker0.numerify("cinese (Cina)");
        com.github.javafaker.Code code9 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cinese (Cina)" + "'", str8, "cinese (Cina)");
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Name name5 = faker0.name();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale12 = null;
        java.lang.String str13 = null; // flaky: locale11.getDisplayScript(locale12);
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category14);
        java.lang.String str21 = locale19.getExtension('a');
        java.lang.String str22 = locale19.getCountry();
        boolean boolean23 = locale19.hasExtensions();
        java.lang.String str24 = locale11.getDisplayScript(locale19);
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale29 = new java.util.Locale("", "German", "");
        java.util.Locale.setDefault(category0, locale29);
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder34.setVariant("");
        java.util.Locale.Builder builder38 = builder34.setVariant("");
        java.util.Locale locale39 = builder38.build();
        java.lang.String str40 = locale32.getDisplayName(locale39);
        java.lang.String str41 = locale39.getDisplayCountry();
        java.lang.String str42 = locale29.getDisplayScript(locale39);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale29.toString(), "_GERMAN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Options options7 = faker0.options();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.util.Locale locale2 = new java.util.Locale("x-lvariant-JPN", "\u97d3\u6587");
        java.lang.String str3 = locale2.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.lang.String str6 = locale3.getISO3Country();
        java.lang.String str7 = locale3.toLanguageTag();
        java.util.Random random9 = new java.util.Random((long) 1947844456);
        long long10 = random9.nextLong();
        java.util.stream.LongStream longStream13 = random9.longs((long) (-1165217776), (long) 32);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale3, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!__hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3781791188705226281L + "'", long10 == 3781791188705226281L);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder12 = builder7.setExtension('u', "Japan");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.setLanguageTag("zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setVariant("CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder14 = builder11.clear();
        java.util.Locale.Builder builder16 = builder11.setScript("");
        java.util.Locale.Builder builder18 = builder16.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder21 = builder16.setExtension('u', "");
        java.util.Locale.Builder builder24 = builder21.setExtension('u', "");
        java.util.Locale locale25 = builder21.build();
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder27 = builder21.setLocale(locale26);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder32 = builder30.setVariant("");
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.lang.String str34 = locale33.getVariant();
        java.util.Locale.Builder builder35 = builder30.setLocale(locale33);
        java.lang.String str36 = locale26.getDisplayLanguage(locale33);
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale26, random37);
        java.util.Locale.Builder builder39 = builder5.setLocale(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder41 = builder5.removeUnicodeLocaleAttribute("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("gb__Englisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: gb__Englisch (Kanada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.Locale locale3 = new java.util.Locale("en-GB", "it", "");
        java.util.Locale locale4 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "en-gb_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en-gb_IT");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.Random random1 = new java.util.Random((long) 102643840);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream4 = random1.ints((long) 1947844456);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder7.clear();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.removeUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder11.setUnicodeLocaleKeyword("hi! (CHINESE (CHINA))", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! (CHINESE (CHINA)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        double double3 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((-0.17443001093835708d), (double) (-1139614796));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8673886034754649d) + "'", double3 == (-0.8673886034754649d));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getDisplayVariant();
        java.lang.String str10 = locale0.getCountry();
        java.util.Random random12 = new java.util.Random((long) (short) 0);
        int int13 = random12.nextInt();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random12);
        com.github.javafaker.Color color15 = faker14.color();
        com.github.javafaker.Business business16 = faker14.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GB" + "'", str10, "GB");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1155484576) + "'", int13 == (-1155484576));
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(business16);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian", strMap1);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str18 = languageRange17.getRange();
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] { languageRange5, languageRange8, languageRange11, languageRange14, languageRange17, languageRange21 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale locale31 = builder28.build();
        java.util.Locale locale35 = new java.util.Locale("", "", "");
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.lang.String str40 = locale35.getDisplayLanguage(locale39);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale45.getDisplayLanguage(locale49);
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.lang.String str56 = locale54.getExtension('x');
        java.util.Locale.setDefault(locale54);
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.lang.String str61 = locale60.getISO3Country();
        java.util.Locale locale65 = new java.util.Locale("", "", "");
        java.util.Locale locale69 = new java.util.Locale("", "", "");
        java.lang.String str70 = locale65.getDisplayLanguage(locale69);
        java.util.Locale locale72 = new java.util.Locale("hi!");
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale locale79 = new java.util.Locale("hi!");
        java.util.Locale locale80 = locale79.stripExtensions();
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale31, locale35, locale41, locale49, locale54, locale60, locale69, locale72, locale75, locale77, locale79 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale.FilteringMode filteringMode84 = null;
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList82, filteringMode84);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale locale87 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList82);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(localeList85);
// flaky:         org.junit.Assert.assertNotNull(locale86);
// flaky:         org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertNull(locale87);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0.51154464f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.util.Locale locale3 = new java.util.Locale("x-lvariant-JPN", "JPN", "en_GB");
        org.junit.Assert.assertEquals(locale3.toString(), "x-lvariant-jpn_JPN_en_GB");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.Random random1 = new java.util.Random((long) (-1742583156));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.lang.String str14 = locale8.getDisplayVariant();
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category15, locale19);
        java.lang.String str22 = locale19.getExtension('x');
        java.lang.String str23 = locale19.getDisplayScript();
        java.lang.String str24 = locale19.getDisplayScript();
        java.lang.String str25 = locale19.getDisplayName();
        java.lang.String str26 = locale8.getDisplayLanguage(locale19);
        java.util.Random random28 = new java.util.Random((long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale19, random28);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese" + "'", str26, "Chinese");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u6587\u82f1\u56fd)", (double) 0.23805428f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category12, locale16);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale16);
        java.lang.String str19 = locale16.getScript();
        java.util.Locale.Builder builder20 = builder8.setLocale(locale16);
        java.util.Locale.Builder builder22 = builder20.setLanguageTag("English");
        java.util.Locale.Builder builder23 = builder22.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder22.setUnicodeLocaleKeyword("und-FR", "english (_FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: und-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.util.Locale locale2 = new java.util.Locale("cinese (Cina)", "English");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: cinese (cina)_ENGLISH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "cinese (cina)_ENGLISH");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale4.getDisplayCountry(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale4.getDisplayScript(locale21);
        java.lang.String str23 = locale21.getDisplayScript();
        java.util.Random random25 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale21, random25);
        java.util.Set<java.lang.String> strSet27 = locale21.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = locale21.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream8 = random0.ints(100L, (int) (byte) -1, (int) ' ');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company11 = faker10.company();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9946545f + "'", float2 == 0.9946545f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.Random random1 = new java.util.Random(3484186600379647945L);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getDisplayCountry();
        java.lang.String str6 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Finance finance8 = faker4.finance();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        random1.setSeed((long) (-572239868));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles(4269302690360740192L, (double) 0.84620744f, (-1.2314051132402917d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.App app7 = faker0.app();
        com.github.javafaker.Hacker hacker8 = faker0.hacker();
        com.github.javafaker.Options options9 = faker0.options();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Color color5 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.LongStream longStream5 = random1.longs();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder2.build();
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale5.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(0L, (double) (short) 0, (double) 0.9816493f);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book12 = faker11.book();
        com.github.javafaker.Book book13 = faker11.book();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-417959428) + "'", int4 == (-417959428));
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertNotNull(book13);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-682588711), (double) 0.113836765f);
        java.util.stream.IntStream intStream13 = random0.ints((-509927405), 2088989465);
        java.util.stream.IntStream intStream14 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs(0L, (long) (-894135949));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.78453636f + "'", float2 == 0.78453636f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1250992364) + "'", int4 == (-1250992364));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.lang.String str9 = locale5.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra" + "'", str9, "fra");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "fr_FR");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs(0L);
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        float float7 = random0.nextFloat();
        double double8 = random0.nextGaussian();
        long long9 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1777210702 + "'", int4 == 1777210702);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2401558996911791356L + "'", long5 == 2401558996911791356L);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5053006f + "'", float7 == 0.5053006f);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.3941634653382416d) + "'", double8 == (-0.3941634653382416d));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-8296616994221593755L) + "'", long9 == (-8296616994221593755L));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.LongStream longStream17 = random16.longs();
        float float18 = random16.nextFloat();
        java.util.stream.IntStream intStream19 = random16.ints();
        int int20 = random16.nextInt();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale12, random16);
        java.lang.String str23 = locale12.getDisplayName();
        java.util.Locale.Builder builder24 = builder6.setLocale(locale12);
        java.util.Locale locale28 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str29 = locale12.getDisplayLanguage(locale28);
        boolean boolean31 = locale12.equals((java.lang.Object) (-376085176));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.34564477f + "'", float18 == 0.34564477f);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-71066819) + "'", int20 == (-71066819));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French" + "'", str23, "French");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale28.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "French" + "'", str29, "French");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("ita");
        com.github.javafaker.App app4 = faker1.app();
        java.lang.String str6 = faker1.bothify("en-gb");
        java.lang.String str8 = faker1.letterify("cinese (Cina)");
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-gb" + "'", str6, "en-gb");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cinese (Cina)" + "'", str8, "cinese (Cina)");
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random9.longs();
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream12 = random9.ints();
        int int13 = random9.nextInt();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale5, random9);
        java.lang.String str17 = faker15.numerify("French");
        com.github.javafaker.Lorem lorem18 = faker15.lorem();
        com.github.javafaker.DateAndTime dateAndTime19 = faker15.date();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.14112848f + "'", float11 == 0.14112848f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1385411462) + "'", int13 == (-1385411462));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(lorem18);
        org.junit.Assert.assertNotNull(dateAndTime19);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        int int7 = random1.nextInt();
        boolean boolean8 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1690734402) + "'", int7 == (-1690734402));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str10 = locale6.getExtension('a');
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet12 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet14 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale0.getDisplayVariant(locale6);
        java.util.Random random17 = new java.util.Random(0L);
        double double18 = random17.nextGaussian();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale6, random17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = random17.nextInt((-1082863525));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8025330637390305d + "'", double18 == 0.8025330637390305d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale5.getDisplayLanguage();
        java.lang.String str8 = locale5.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais" + "'", str7, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category14);
        java.util.Locale locale20 = java.util.Locale.getDefault(category14);
        java.util.Locale locale21 = java.util.Locale.getDefault(category14);
        java.util.Locale locale22 = java.util.Locale.getDefault(category14);
        java.util.Locale.Builder builder23 = builder10.setLocale(locale22);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale22);
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("");
        java.lang.String str27 = locale26.getLanguage();
        java.lang.String str28 = locale22.getDisplayScript(locale26);
        java.lang.String str29 = locale22.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = locale0.getDisplayCountry(locale10);
        java.lang.String str14 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Japon" + "'", str13, "Japon");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japanese" + "'", str14, "Japanese");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        java.lang.String str7 = faker0.regexify("\u6cd5\u6587");
        java.lang.String str9 = faker0.bothify("hi! (CHINESE (CHINA))");
        com.github.javafaker.Finance finance10 = faker0.finance();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (CHINESE (CHINA))" + "'", str9, "hi! (CHINESE (CHINA))");
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.util.Locale locale2 = new java.util.Locale("ITA", "Twi");
        org.junit.Assert.assertEquals(locale2.toString(), "ita_TWI");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.Locale locale3 = new java.util.Locale("en", "italien (italie)", "\u6cd5\u6587,fran\347ais)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587,fran\347ais)");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-TW");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("ita", strMap3);
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str8 = languageRange7.getRange();
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange11, languageRange14, languageRange17, languageRange20 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale locale30 = builder27.build();
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.util.Locale locale38 = new java.util.Locale("", "", "");
        java.lang.String str39 = locale34.getDisplayLanguage(locale38);
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str49 = locale44.getDisplayLanguage(locale48);
        java.util.Locale locale53 = new java.util.Locale("", "", "");
        java.lang.String str55 = locale53.getExtension('x');
        java.util.Locale.setDefault(locale53);
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale59.getISO3Country();
        java.util.Locale locale64 = new java.util.Locale("", "", "");
        java.util.Locale locale68 = new java.util.Locale("", "", "");
        java.lang.String str69 = locale64.getDisplayLanguage(locale68);
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.util.Locale locale72 = locale71.stripExtensions();
        java.util.Locale locale74 = new java.util.Locale("hi!");
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.util.Locale locale79 = locale78.stripExtensions();
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale30, locale34, locale40, locale48, locale53, locale59, locale68, locale71, locale74, locale76, locale78 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale.FilteringMode filteringMode83 = null;
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList81, filteringMode83);
        java.util.Locale locale85 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.parse("fr", strMap87);
        java.util.Locale locale89 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet90 = locale89.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList88, (java.util.Collection<java.lang.String>) strSet90, filteringMode91);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList81, filteringMode91);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList93);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr" + "'", str8, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(localeList84);
// flaky:         org.junit.Assert.assertNotNull(locale85);
// flaky:         org.junit.Assert.assertEquals(locale85.toString(), "fr");
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode91.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(localeList94);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Color color5 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream5 = random1.ints((long) (short) 10);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random7.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) '#');
        java.util.Random random14 = new java.util.Random(1L);
        java.util.Random random16 = new java.util.Random((long) (short) 1);
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        int int21 = random18.nextInt();
        java.util.stream.DoubleStream doubleStream22 = random18.doubles();
        java.util.stream.IntStream intStream23 = random18.ints();
        java.util.Random random25 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream27 = random25.doubles((long) 10);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random25.nextBytes(byteArray31);
        random18.nextBytes(byteArray31);
        random16.nextBytes(byteArray31);
        random14.nextBytes(byteArray31);
        random7.nextBytes(byteArray31);
        random1.nextBytes(byteArray31);
        double double38 = random1.nextGaussian();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random1);
        boolean boolean40 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[96, -76, 32]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.1460540722898627d + "'", double38 == 1.1460540722898627d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und-a-chinese-u-china", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("Italienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Italienisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.Locale locale3 = new java.util.Locale("English United Kingdom", "zh-CN", "JPN");
        java.lang.String str4 = locale3.getDisplayVariant();
        boolean boolean6 = locale3.equals((java.lang.Object) 341469127);
        org.junit.Assert.assertEquals(locale3.toString(), "english united kingdom_ZH-CN_JPN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JPN" + "'", str4, "JPN");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) ' ');
        random1.setSeed((long) (-1155484576));
        int int9 = random1.nextInt();
        java.util.stream.LongStream longStream12 = random1.longs((-6139822020582680716L), (long) 102643840);
        float float13 = random1.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1764305998) + "'", int9 == (-1764305998));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.36276585f + "'", float13 == 0.36276585f);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        com.github.javafaker.Book book9 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.util.Locale locale2 = new java.util.Locale("hi! ITALIEN ITALIE,fr", "chinese (china)");
        org.junit.Assert.assertEquals(locale2.toString(), "hi! italien italie,fr_CHINESE (CHINA)");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker5.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.lang.String[] strArray6 = new java.lang.String[] { "und", "ITA", "Chinese (China)", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder15.setVariant("");
        java.util.Locale locale18 = builder15.build();
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.lang.String str37 = locale32.getDisplayLanguage(locale36);
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str43 = locale41.getExtension('x');
        java.util.Locale.setDefault(locale41);
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.util.Locale locale47 = locale46.stripExtensions();
        java.lang.String str48 = locale47.getISO3Country();
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.util.Locale locale56 = new java.util.Locale("", "", "");
        java.lang.String str57 = locale52.getDisplayLanguage(locale56);
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale18, locale22, locale28, locale36, locale41, locale47, locale56, locale59, locale62, locale64, locale66 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale.FilteringMode filteringMode71 = null;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList69, filteringMode71);
        java.util.Locale locale73 = java.util.Locale.lookup(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale74 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList69);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und" + "'", str9, "und");
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals(locale46.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.util.Locale locale1 = new java.util.Locale("und-DE");
        org.junit.Assert.assertEquals(locale1.toString(), "und-de");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        java.lang.String str12 = locale9.getDisplayScript();
        java.lang.String str13 = locale9.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getDisplayVariant();
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = locale10.getCountry();
        java.lang.String str14 = locale6.getDisplayVariant(locale10);
        java.util.Locale.Builder builder15 = builder3.setLocale(locale6);
        java.util.Locale.Builder builder17 = builder3.setVariant("japan");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale1.getDisplayName(locale8);
        java.util.Random random11 = new java.util.Random();
        java.util.stream.LongStream longStream12 = random11.longs();
        float float13 = random11.nextFloat();
        java.util.stream.IntStream intStream14 = random11.ints();
        java.util.stream.LongStream longStream18 = random11.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream21 = random11.longs((long) (-266083962), (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale1, random11);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(longStream12);
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.78583556f + "'", float13 == 0.78583556f);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(longStream21);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        double double7 = random1.nextGaussian();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream11 = random8.longs((long) (-1), (long) (short) 10);
        int int12 = random8.nextInt();
        double double13 = random8.nextGaussian();
        java.util.Random random15 = new java.util.Random((long) 1);
        java.util.Random random17 = new java.util.Random((long) (short) 1);
        int int18 = random17.nextInt();
        java.util.stream.LongStream longStream22 = random17.longs(10L, 0L, (long) (short) 100);
        java.util.Random random24 = new java.util.Random(1L);
        java.util.Random random26 = new java.util.Random((long) (short) 1);
        java.util.Random random28 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream30 = random28.doubles((long) 10);
        int int31 = random28.nextInt();
        java.util.stream.DoubleStream doubleStream32 = random28.doubles();
        java.util.stream.IntStream intStream33 = random28.ints();
        java.util.Random random35 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream37 = random35.doubles((long) 10);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random35.nextBytes(byteArray41);
        random28.nextBytes(byteArray41);
        random26.nextBytes(byteArray41);
        random24.nextBytes(byteArray41);
        random17.nextBytes(byteArray41);
        random15.nextBytes(byteArray41);
        random8.nextBytes(byteArray41);
        random1.nextBytes(byteArray41);
        java.util.stream.IntStream intStream53 = random1.ints((long) 723195425, 387629116, 1833922823);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream57 = random1.ints((long) 2073616612, 1517814891, 540195050);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0175240265721812d + "'", double7 == 1.0175240265721812d);
        org.junit.Assert.assertNotNull(longStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2084439155 + "'", int12 == 2084439155);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.6181828598768614d) + "'", double13 == (-0.6181828598768614d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1155869325) + "'", int18 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1157793070) + "'", int31 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(doubleStream37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[65, -1, 79]");
        org.junit.Assert.assertNotNull(intStream53);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random0.ints(1370835837, (-1332689415));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("deu", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("und", strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale locale12 = builder9.build();
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.lang.String str31 = locale26.getDisplayLanguage(locale30);
        java.util.Locale locale35 = new java.util.Locale("", "", "");
        java.lang.String str37 = locale35.getExtension('x');
        java.util.Locale.setDefault(locale35);
        java.util.Locale locale40 = new java.util.Locale("hi!");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale41.getISO3Country();
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.lang.String str51 = locale46.getDisplayLanguage(locale50);
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Locale locale54 = locale53.stripExtensions();
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.util.Locale locale61 = locale60.stripExtensions();
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale12, locale16, locale22, locale30, locale35, locale41, locale50, locale53, locale56, locale58, locale60 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.Locale.FilteringMode filteringMode65 = null;
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList63, filteringMode65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.parse("fr", strMap68);
        java.util.Locale locale70 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList69, (java.util.Collection<java.lang.String>) strSet71, filteringMode72);
        java.util.List<java.util.Locale> localeList74 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList63, filteringMode72);
        java.util.Locale locale75 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap76);
        java.util.Locale locale79 = new java.util.Locale("hi!");
        java.util.Locale locale81 = java.util.Locale.forLanguageTag("");
        java.lang.String str82 = locale79.getDisplayLanguage(locale81);
        java.lang.String str83 = locale79.getDisplayLanguage();
        java.lang.String str84 = locale79.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet85 = locale79.getUnicodeLocaleKeys();
        java.lang.String str86 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet85);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode72.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(localeList74);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getLanguage();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.util.Locale locale11 = builder6.build();
        java.lang.String str12 = locale1.getDisplayName(locale11);
        java.lang.String str13 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet14 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale1.getDisplayName(locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet5 = locale0.getExtensionKeys();
        java.util.Random random7 = new java.util.Random((long) (-1950768727));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random7);
        java.lang.String str9 = locale0.toLanguageTag();
        java.lang.String str10 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder9.setExtension('4', "fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.Locale locale2 = new java.util.Locale("french", "fr");
        java.util.Locale locale5 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Locale locale7 = new java.util.Locale("\u6cd5\u6587");
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.lang.String str9 = locale7.getDisplayName();
        java.lang.String str10 = locale2.getDisplayVariant(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for french");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertEquals(locale7.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (CHINESE (CHINA))" + "'", str8, "hi! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587" + "'", str9, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.lang.String str9 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale6.getDisplayScript(locale10);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale6.getDisplayCountry(locale20);
        java.lang.String str23 = locale0.getDisplayCountry(locale20);
        java.util.Locale locale24 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Locale locale26 = locale24.stripExtensions();
        java.lang.String str27 = locale24.getDisplayVariant();
        java.lang.String str28 = locale20.getDisplayVariant(locale24);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chine" + "'", str23, "Chine");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str7 = locale4.getExtension('x');
        java.lang.String str8 = locale4.getDisplayScript();
        java.lang.String str9 = locale4.getDisplayScript();
        java.lang.String str10 = locale4.getVariant();
        java.lang.String str11 = locale4.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Business business9 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("Japon");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Japon [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) ' ');
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("China", (double) 0.42617488f);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4261748790740967d + "'", double3 == 0.4261748790740967d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "china" + "'", str4, "china");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.util.Random random1 = new java.util.Random((long) 27);
        java.util.stream.LongStream longStream3 = random1.longs((long) 0);
        java.util.stream.IntStream intStream6 = random1.ints((-1332689415), 591553211);
        int int7 = random1.nextInt();
        int int8 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1152021836) + "'", int7 == (-1152021836));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1761585305 + "'", int8 == 1761585305);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.util.Random random1 = new java.util.Random((long) 190001823);
        java.util.Random random3 = new java.util.Random((long) 1);
        java.util.Random random5 = new java.util.Random((long) (short) 1);
        int int6 = random5.nextInt();
        java.util.stream.LongStream longStream10 = random5.longs(10L, 0L, (long) (short) 100);
        java.util.Random random12 = new java.util.Random(1L);
        java.util.Random random14 = new java.util.Random((long) (short) 1);
        java.util.Random random16 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream18 = random16.doubles((long) 10);
        int int19 = random16.nextInt();
        java.util.stream.DoubleStream doubleStream20 = random16.doubles();
        java.util.stream.IntStream intStream21 = random16.ints();
        java.util.Random random23 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream25 = random23.doubles((long) 10);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random23.nextBytes(byteArray29);
        random16.nextBytes(byteArray29);
        random14.nextBytes(byteArray29);
        random12.nextBytes(byteArray29);
        random5.nextBytes(byteArray29);
        random3.nextBytes(byteArray29);
        random1.nextBytes(byteArray29);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1155869325) + "'", int6 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1157793070) + "'", int19 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[23, -121, -62]");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale4.getDisplayCountry(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale4.getDisplayScript(locale21);
        java.lang.String str23 = locale21.getDisplayScript();
        java.util.Random random25 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale21, random25);
        java.util.Random random28 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream30 = random28.doubles((long) 10);
        int int31 = random28.nextInt();
        long long32 = random28.nextLong();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale21, random28);
        com.github.javafaker.Name name34 = faker33.name();
        java.lang.String str36 = faker33.letterify("zh");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1157793070) + "'", int31 == (-1157793070));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 8220501950349663546L + "'", long32 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(name34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "zh" + "'", str36, "zh");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und-DE", 0.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.lang.String str8 = locale4.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.util.Locale locale2 = new java.util.Locale("Korean", "en-gb (ZH-TW)");
        org.junit.Assert.assertEquals(locale2.toString(), "korean_EN-GB (ZH-TW)");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Color color5 = faker0.color();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.lang.String str11 = locale10.getLanguage();
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        java.lang.String str16 = locale10.getDisplayScript(locale14);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.Random random1 = new java.util.Random((-4964420948893066024L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random1.longs((long) (-1082863525), (-6688467811848818630L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.lang.String str17 = locale10.getDisplayVariant(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = locale14.getDisplayScript(locale18);
        java.lang.String str21 = locale9.getDisplayScript(locale14);
        java.util.Locale locale24 = new java.util.Locale("de", "FRA");
        java.lang.String str25 = locale14.getDisplayVariant(locale24);
        java.lang.String str26 = locale7.getDisplayVariant(locale14);
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale.Builder builder30 = builder27.clear();
        java.util.Locale.Builder builder32 = builder27.setScript("");
        java.util.Locale.Builder builder34 = builder32.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder37 = builder32.setExtension('u', "");
        java.util.Locale.Builder builder40 = builder37.setExtension('u', "");
        java.util.Locale locale41 = builder37.build();
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder43 = builder37.setLocale(locale42);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder44.setVariant("");
        java.util.Locale.Builder builder48 = builder46.setVariant("");
        java.util.Locale locale49 = java.util.Locale.PRC;
        java.lang.String str50 = locale49.getVariant();
        java.util.Locale.Builder builder51 = builder46.setLocale(locale49);
        java.lang.String str52 = locale42.getDisplayLanguage(locale49);
        java.lang.String str53 = locale42.getCountry();
        java.lang.String str54 = locale14.getDisplayName(locale42);
        java.lang.String str55 = locale14.getDisplayScript();
        java.lang.String str56 = locale14.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale24.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u4e2d\u6587" + "'", str52, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "TW" + "'", str53, "TW");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale.Builder builder16 = builder13.clear();
        java.util.Locale locale17 = builder16.build();
        java.lang.String str18 = locale17.getCountry();
        java.lang.String str19 = locale0.getDisplayLanguage(locale17);
        java.lang.String str20 = locale0.getDisplayName();
        java.util.Random random21 = new java.util.Random();
        java.util.stream.LongStream longStream22 = random21.longs();
        float float23 = random21.nextFloat();
        java.util.stream.IntStream intStream24 = random21.ints();
        java.util.stream.LongStream longStream28 = random21.longs((long) '#', (long) (byte) 1, (long) 100);
        random21.setSeed((long) 591553211);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale0, random21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream33 = random21.ints((long) (-1142367176));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese" + "'", str19, "Chinese");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese (China)" + "'", str20, "Chinese (China)");
        org.junit.Assert.assertNotNull(longStream22);
// flaky:         org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.09285617f + "'", float23 == 0.09285617f);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(longStream28);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale4.getUnicodeLocaleType("fr");
        java.lang.String str9 = locale4.getISO3Language();
        java.lang.String str10 = locale4.getDisplayScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale.Builder builder11 = builder7.setLanguage("French");
        java.util.Locale locale12 = builder7.build();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = locale13.getVariant();
        java.util.Random random16 = new java.util.Random(100L);
        double double17 = random16.nextGaussian();
        random16.setSeed((long) (-1157793070));
        double double20 = random16.nextGaussian();
        boolean boolean21 = random16.nextBoolean();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale13, random16);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale27.getExtension('x');
        java.lang.String str30 = locale23.getDisplayName(locale27);
        java.lang.String str32 = locale23.getExtension('x');
        java.util.Locale locale34 = new java.util.Locale("fra");
        java.lang.String str35 = locale23.getDisplayScript(locale34);
        java.util.Locale locale36 = locale23.stripExtensions();
        java.lang.String str37 = locale13.getDisplayScript(locale36);
        java.lang.String str38 = locale13.getScript();
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.util.Locale locale44 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str45 = locale39.getDisplayName(locale44);
        java.util.Set<java.lang.Character> charSet46 = locale39.getExtensionKeys();
        java.lang.String str47 = locale13.getDisplayVariant(locale39);
        java.util.Locale.Builder builder48 = builder7.setLocale(locale13);
        java.lang.String str49 = locale13.getLanguage();
        java.lang.String str50 = locale3.getDisplayLanguage(locale13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "french");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6246292191371761d + "'", double17 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.09760425216810112d + "'", double20 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "French" + "'", str30, "French");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals(locale34.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals(locale44.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "English (United Kingdom)" + "'", str45, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zh" + "'", str49, "zh");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr_CA" + "'", str2, "fr_CA");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs(10L, 0L, (long) (short) 100);
        java.util.Random random8 = new java.util.Random(1L);
        java.util.Random random10 = new java.util.Random((long) (short) 1);
        java.util.Random random12 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream14 = random12.doubles((long) 10);
        int int15 = random12.nextInt();
        java.util.stream.DoubleStream doubleStream16 = random12.doubles();
        java.util.stream.IntStream intStream17 = random12.ints();
        java.util.Random random19 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream21 = random19.doubles((long) 10);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random19.nextBytes(byteArray25);
        random12.nextBytes(byteArray25);
        random10.nextBytes(byteArray25);
        random8.nextBytes(byteArray25);
        random1.nextBytes(byteArray25);
        java.util.stream.LongStream longStream31 = random1.longs();
        java.util.stream.IntStream intStream35 = random1.ints(0L, (-1979931612), 10846315);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1157793070) + "'", int15 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-40, -100, -72]");
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertNotNull(intStream35);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setVariant("zh,CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh,CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        boolean boolean8 = random0.nextBoolean();
        long long9 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.04883635f + "'", float2 == 0.04883635f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2027332310 + "'", int4 == 2027332310);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 7778920967000952751L + "'", long9 == 7778920967000952751L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        java.lang.String str9 = faker5.bothify("\u4e2d\u6587");
        com.github.javafaker.Address address10 = faker5.address();
        com.github.javafaker.Internet internet11 = faker5.internet();
        com.github.javafaker.Finance finance12 = faker5.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(finance12);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.setVariant("FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0.39339328f);
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getCountry();
        boolean boolean13 = languageRange2.equals((java.lang.Object) locale10);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("en,CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en,CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("Italian", strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("German");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str13 = languageRange12.getRange();
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] { languageRange12, languageRange16, languageRange19, languageRange22, languageRange25 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder32.setVariant("");
        java.util.Locale locale35 = builder32.build();
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.lang.String str44 = locale39.getDisplayLanguage(locale43);
        java.util.Locale locale45 = java.util.Locale.FRENCH;
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.util.Locale locale53 = new java.util.Locale("", "", "");
        java.lang.String str54 = locale49.getDisplayLanguage(locale53);
        java.util.Locale locale58 = new java.util.Locale("", "", "");
        java.lang.String str60 = locale58.getExtension('x');
        java.util.Locale.setDefault(locale58);
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.util.Locale locale64 = locale63.stripExtensions();
        java.lang.String str65 = locale64.getISO3Country();
        java.util.Locale locale69 = new java.util.Locale("", "", "");
        java.util.Locale locale73 = new java.util.Locale("", "", "");
        java.lang.String str74 = locale69.getDisplayLanguage(locale73);
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale locale77 = locale76.stripExtensions();
        java.util.Locale locale79 = new java.util.Locale("hi!");
        java.util.Locale locale81 = new java.util.Locale("hi!");
        java.util.Locale locale83 = new java.util.Locale("hi!");
        java.util.Locale locale84 = locale83.stripExtensions();
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale35, locale39, locale45, locale53, locale58, locale64, locale73, locale76, locale79, locale81, locale83 };
        java.util.ArrayList<java.util.Locale> localeList86 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList86, localeArray85);
        java.util.Locale.FilteringMode filteringMode88 = null;
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList86, filteringMode88);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList86, filteringMode91);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.Locale locale94 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList93);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale95 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertEquals(locale81.toString(), "hi!");
        org.junit.Assert.assertEquals(locale83.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(localeList89);
// flaky:         org.junit.Assert.assertNotNull(locale90);
// flaky:         org.junit.Assert.assertEquals(locale90.toString(), "fr");
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode91.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNull(locale94);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("China");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder14 = builder9.setScript("");
        java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder19 = builder14.setExtension('u', "");
        java.util.Locale.Builder builder22 = builder19.setExtension('u', "");
        java.util.Locale locale23 = builder19.build();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale locale28 = builder26.build();
        java.lang.String str29 = locale23.getDisplayVariant(locale28);
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale28.getDisplayLanguage(locale33);
        java.util.Locale locale37 = new java.util.Locale("zh-cn", "");
        java.lang.String str39 = locale37.getExtension('x');
        java.lang.String str40 = locale33.getDisplayName(locale37);
        java.util.Set<java.lang.String> strSet41 = locale37.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags(languageRangeList8, (java.util.Collection<java.lang.String>) strSet41);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet41);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale37.toString(), "zh-cn");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        random0.setSeed((long) 591553211);
        java.util.stream.IntStream intStream10 = random0.ints();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3098817f + "'", float2 == 0.3098817f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("en-gb");
        java.util.Locale locale12 = new java.util.Locale("cinese (Cina)", "English");
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.util.Locale.setDefault(category13, locale14);
        java.util.Locale locale18 = java.util.Locale.getDefault(category13);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale18);
        java.lang.String str20 = locale12.getDisplayCountry(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder9.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: cinese (cina) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "und");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "cinese (cina)_ENGLISH");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ENGLISH" + "'", str20, "ENGLISH");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getDisplayLanguage();
        java.lang.String str6 = locale1.getDisplayLanguage();
        java.lang.String str7 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Address address6 = faker5.address();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.Company company8 = faker5.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("und");
        java.util.Locale locale9 = builder8.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        java.lang.String str5 = faker0.numerify("fr");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        java.util.Random random8 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream10 = random8.doubles((long) 10);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random8.nextBytes(byteArray14);
        random1.nextBytes(byteArray14);
        java.util.stream.LongStream longStream19 = random1.longs((long) (-1950768727), (long) (-1157793070));
        float float20 = random1.nextFloat();
        double double21 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-8, 22, 21]");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.25780278f + "'", float20 == 0.25780278f);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.4129126974821382d + "'", double21 == 0.4129126974821382d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Business business8 = faker0.business();
        java.lang.String str10 = faker0.regexify("italien (Italie)");
        com.github.javafaker.Company company11 = faker0.company();
        java.lang.String str13 = faker0.regexify("en_CA");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien Italie" + "'", str10, "italien Italie");
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en_CA" + "'", str13, "en_CA");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale.setDefault(locale0);
        java.util.Random random2 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random2.longs();
        java.util.stream.LongStream longStream5 = random2.longs(0L);
        int int7 = random2.nextInt(44);
        float float8 = random2.nextFloat();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random2);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.9017133f + "'", float8 == 0.9017133f);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale3.getDisplayName(locale10);
        java.util.Random random13 = new java.util.Random((long) 27);
        long long14 = random13.nextLong();
        int int16 = random13.nextInt(33);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random13);
        java.util.Locale locale20 = new java.util.Locale("und", "FRA");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.lang.String str23 = locale10.getDisplayVariant(locale20);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4947896108136290151L) + "'", long14 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertEquals(locale20.toString(), "und_FRA");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setUnicodeLocaleKeyword("GBR", "zh,CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.util.Locale locale1 = new java.util.Locale("x-lvariant-JPN");
        org.junit.Assert.assertEquals(locale1.toString(), "x-lvariant-jpn");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        java.util.stream.LongStream longStream8 = random0.longs(8849569814870478533L, (long) (byte) 0, (long) 74589158);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.035599947f + "'", float2 == 0.035599947f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1258941448) + "'", int4 == (-1258941448));
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.Locale locale2 = new java.util.Locale("German", "fr");
        org.junit.Assert.assertEquals(locale2.toString(), "german_FR");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.Locale locale2 = new java.util.Locale("de", "Japan");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getExtension('x');
        java.util.Locale locale7 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale3);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Random random11 = new java.util.Random();
        java.util.stream.LongStream longStream12 = random11.longs();
        java.util.stream.LongStream longStream14 = random11.longs(0L);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale10, random11);
        boolean boolean16 = random11.nextBoolean();
        java.util.stream.DoubleStream doubleStream17 = random11.doubles();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale3, random11);
        org.junit.Assert.assertEquals(locale2.toString(), "de_JAPAN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JAPAN" + "'", str9, "JAPAN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Options options8 = faker4.options();
        com.github.javafaker.Color color9 = faker4.color();
        com.github.javafaker.Options options10 = faker4.options();
        java.lang.String str12 = faker4.regexify("x-lvariant-JPN");
        java.lang.String str14 = faker4.letterify("\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "x-lvariant-JPN" + "'", str12, "x-lvariant-JPN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str14, "\u82f1\u6587\u82f1\u56fd)");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        long long5 = random0.nextLong();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color8 = faker7.color();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-338045060221006775L) + "'", long5 == (-338045060221006775L));
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        double double7 = random1.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream12 = random1.doubles((long) 1505962604, (double) 0.22363782f, (double) 0.73096776f);
        java.util.stream.IntStream intStream13 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random1.doubles((double) 0.22395283f, (double) (-8322955419528109991L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5446150395016334d + "'", double7 == 0.5446150395016334d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream6 = random1.ints((long) 1947844456);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        java.util.stream.DoubleStream doubleStream11 = random1.doubles((double) 0.35605824f, 0.7291761519325576d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.util.Locale locale3 = new java.util.Locale("italien (Italie)", "ITA", "zh_CN");
        java.lang.String str5 = locale3.getExtension('x');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: italien (italie)_ITA_zh_CN could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italien (italie)_ITA_zh_CN");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.util.Locale locale3 = new java.util.Locale("it", "de", "eng");
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category4);
        java.lang.String str11 = locale9.getExtension('a');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale9);
        java.lang.String str13 = locale3.getDisplayCountry(locale9);
        java.lang.String str14 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "it_DE_eng");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Allemagne" + "'", str13, "Allemagne");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Allemagne" + "'", str14, "Allemagne");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getVariant();
        boolean boolean4 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        java.lang.String str4 = faker0.letterify("\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Allemagne", (double) 736442293137335911L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=7.3644229313733594E17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("en,CA", "Japon");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en,CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.util.Locale.Builder builder12 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale15 = java.util.Locale.getDefault(category10);
        java.util.Locale locale16 = java.util.Locale.getDefault(category10);
        java.util.Locale locale17 = java.util.Locale.getDefault(category10);
        java.util.Random random18 = new java.util.Random();
        java.util.stream.LongStream longStream19 = random18.longs();
        float float20 = random18.nextFloat();
        java.util.stream.IntStream intStream21 = random18.ints();
        int int22 = random18.nextInt();
        random18.setSeed((long) (-1155869325));
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale17, random18);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale27 = locale17.stripExtensions();
        java.lang.String str28 = locale27.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(longStream19);
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4951238f + "'", float20 == 0.4951238f);
        org.junit.Assert.assertNotNull(intStream21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2124736044 + "'", int22 == 2124736044);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setRegion("coreano");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: coreano [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japanese", (double) (-668239466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-6.68239466E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale4.getDisplayCountry(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale4.getDisplayScript(locale21);
        java.lang.String str23 = locale21.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.lang.String str25 = locale24.getDisplayScript();
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str27 = locale24.getVariant();
        java.lang.String str28 = locale24.getISO3Language();
        java.lang.String str29 = locale21.getDisplayName(locale24);
        java.util.Set<java.lang.Character> charSet30 = locale24.getExtensionKeys();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale24);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "jpn" + "'", str28, "jpn");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u82f1\u8a9e" + "'", str29, "\u82f1\u8a9e");
        org.junit.Assert.assertNotNull(charSet30);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.Locale locale1 = new java.util.Locale("zh-tw_CHINE");
        org.junit.Assert.assertEquals(locale1.toString(), "zh-tw_chine");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("en_CA");
        com.github.javafaker.Company company3 = faker0.company();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_CA" + "'", str2, "en_CA");
        org.junit.Assert.assertNotNull(company3);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale4.getDisplayCountry(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale4.getDisplayScript(locale21);
        java.util.Set<java.lang.Character> charSet23 = locale4.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charSet23);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale.Builder builder7 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.App app4 = faker0.app();
        java.lang.String str6 = faker0.numerify("it");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.App app8 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.lang.String str17 = locale10.getDisplayVariant(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = locale14.getDisplayScript(locale18);
        java.lang.String str21 = locale9.getDisplayScript(locale14);
        java.util.Locale locale24 = new java.util.Locale("de", "FRA");
        java.lang.String str25 = locale14.getDisplayVariant(locale24);
        java.lang.String str26 = locale7.getDisplayVariant(locale14);
        java.lang.String str27 = locale14.getDisplayLanguage();
        java.util.Locale locale28 = locale14.stripExtensions();
        java.lang.String str29 = locale14.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "french" + "'", str8, "french");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale24.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setScript("french (FRA,und)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: french (FRA,und) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("US");
        java.util.Locale.Builder builder14 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setRegion("English United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: English United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u6cd5\u6587,fran\347ais)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=twn(??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("de");
        java.util.Locale locale13 = new java.util.Locale("zh,CN", "Italienisch");
        java.lang.String str14 = locale13.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setLocale(locale13);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh,cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale13.toString(), "zh,cn_ITALIENISCH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getLanguage();
        java.util.Locale.Builder builder8 = builder4.setLocale(locale6);
        java.lang.String str9 = locale0.getDisplayCountry(locale6);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale6.getDisplayName(locale13);
        java.util.Locale.setDefault(locale6);
        java.util.Set<java.lang.String> strSet16 = locale6.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Business business9 = faker5.business();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker5.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        java.util.Random random8 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream10 = random8.doubles((long) 10);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random8.nextBytes(byteArray14);
        random1.nextBytes(byteArray14);
        java.util.stream.LongStream longStream19 = random1.longs((long) 822110444, (long) 1839438880);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-8, 22, 21]");
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((double) 100.0f, (double) 190001823);
        java.util.stream.DoubleStream doubleStream6 = random0.doubles();
        java.util.stream.IntStream intStream7 = random0.ints();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3526249f + "'", float2 == 0.3526249f);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        java.util.Locale locale15 = new java.util.Locale("de", "FRA");
        java.lang.String str16 = locale5.getDisplayVariant(locale15);
        java.lang.String str17 = locale5.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale15.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getDisplayVariant();
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = locale10.getCountry();
        java.lang.String str14 = locale6.getDisplayVariant(locale10);
        java.util.Locale.Builder builder15 = builder3.setLocale(locale6);
        java.util.Set<java.lang.String> strSet16 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zho", (double) 0.25256002f);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.Locale locale1 = new java.util.Locale("jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals(locale1.toString(), "jpn_hi! (chinese (china))");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.util.Random random1 = new java.util.Random((long) 829054079);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u56fd", "fra (FRA,fr)", "hi! (CHINESE (CHINA))");
        java.util.Random random5 = new java.util.Random((long) 0);
        int int7 = random5.nextInt((int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random5);
        double double9 = random5.nextDouble();
        java.util.stream.LongStream longStream13 = random5.longs((long) 'u', (long) (-572239868), (long) 'u');
        java.util.stream.DoubleStream doubleStream15 = random5.doubles((long) 1894354479);
        int int16 = random5.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: ??_FRA (FRA,FR)_hi! (CHINESE (CHINA)) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd_FRA (FRA,FR)_hi! (CHINESE (CHINA))");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8314409887870612d + "'", double9 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1690734402) + "'", int16 == (-1690734402));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.LongStream longStream9 = random0.longs((long) 1358566768, (long) (-1690734402), (long) (-1279776254));
        boolean boolean10 = random0.nextBoolean();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        java.lang.String str13 = faker11.regexify("gb__Englisch (Kanada)");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gb__Englisch Kanada" + "'", str13, "gb__Englisch Kanada");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setUnicodeLocaleKeyword("GBR", "TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Color color9 = faker0.color();
        com.github.javafaker.Color color10 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder10.build();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder16 = builder10.setLocale(locale15);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder17.setVariant("");
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale22.getVariant();
        java.util.Locale.Builder builder24 = builder19.setLocale(locale22);
        java.lang.String str25 = locale15.getDisplayLanguage(locale22);
        java.util.Random random26 = null;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale15, random26);
        java.lang.String str28 = locale15.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "TWN" + "'", str28, "TWN");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder10.removeUnicodeLocaleAttribute("chinese (JPN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: chinese (JPN) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.Locale locale2 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Locale locale4 = new java.util.Locale("\u6cd5\u6587");
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale4.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertEquals(locale4.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! (CHINESE (CHINA))" + "'", str5, "hi! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.util.Locale locale3 = new java.util.Locale("ita", "", "\u6cd5\u56fd");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: ita__?? could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder11.setLanguage("French");
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.lang.String str26 = locale19.getDisplayVariant(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale27.getLanguage();
        java.lang.String str29 = locale23.getDisplayScript(locale27);
        java.lang.String str30 = locale18.getDisplayScript(locale23);
        java.util.Locale locale33 = new java.util.Locale("de", "FRA");
        java.lang.String str34 = locale23.getDisplayVariant(locale33);
        java.lang.String str35 = locale16.getDisplayVariant(locale23);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder36.setVariant("");
        java.util.Locale.Builder builder39 = builder36.clear();
        java.util.Locale.Builder builder41 = builder36.setScript("");
        java.util.Locale.Builder builder43 = builder41.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder46 = builder41.setExtension('u', "");
        java.util.Locale.Builder builder49 = builder46.setExtension('u', "");
        java.util.Locale locale50 = builder46.build();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder52 = builder46.setLocale(locale51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder53.setVariant("");
        java.util.Locale.Builder builder57 = builder55.setVariant("");
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.lang.String str59 = locale58.getVariant();
        java.util.Locale.Builder builder60 = builder55.setLocale(locale58);
        java.lang.String str61 = locale51.getDisplayLanguage(locale58);
        java.lang.String str62 = locale51.getCountry();
        java.lang.String str63 = locale23.getDisplayName(locale51);
        java.util.Locale.Builder builder64 = builder0.setLocale(locale23);
        java.util.Locale.Builder builder66 = builder64.setRegion("ja");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "french");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "french" + "'", str17, "french");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e2d\u6587" + "'", str61, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "TW" + "'", str62, "TW");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.getDefault(category9);
        java.util.Locale locale17 = java.util.Locale.getDefault(category9);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str23 = locale20.getExtension('x');
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder24.clear();
        java.util.Locale.Builder builder29 = builder24.setScript("");
        java.util.Locale locale30 = builder24.build();
        java.lang.String str31 = locale20.getDisplayLanguage(locale30);
        java.util.Locale.setDefault(category0, locale30);
        java.util.Locale locale36 = new java.util.Locale("", "fr", "");
        java.lang.String str37 = locale36.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str41 = locale38.getExtension('x');
        java.lang.String str42 = locale36.getDisplayName(locale38);
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.lang.String str51 = locale46.getDisplayLanguage(locale50);
        java.lang.String str52 = locale46.getISO3Country();
        java.util.Locale locale53 = locale46.stripExtensions();
        java.util.Locale.setDefault(locale46);
        java.lang.String str55 = locale36.getDisplayLanguage(locale46);
        boolean boolean56 = locale46.hasExtensions();
        java.util.Locale.setDefault(category0, locale46);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese" + "'", str31, "Chinese");
        org.junit.Assert.assertEquals(locale36.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "FRA" + "'", str37, "FRA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u6cd5\u56fd" + "'", str42, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet8);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale.Builder builder17 = builder13.setLanguage("French");
        java.util.Locale locale18 = builder17.build();
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet19, filteringMode20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap22);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Locale locale29 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str30 = locale24.getDisplayName(locale29);
        java.util.Set<java.lang.Character> charSet31 = locale24.getExtensionKeys();
        java.util.Set<java.lang.String> strSet32 = locale24.getUnicodeLocaleKeys();
        java.lang.String str33 = locale24.getDisplayVariant();
        java.util.Set<java.lang.String> strSet34 = locale24.getUnicodeLocaleKeys();
        java.lang.String str35 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet34);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "french");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals(locale29.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "English (United Kingdom)" + "'", str30, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("cinese (Cina)", (double) 0.9253477f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese (cina)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.util.Locale locale3 = new java.util.Locale("US", "DE", "Allemagne");
        org.junit.Assert.assertEquals(locale3.toString(), "us_DE_Allemagne");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.util.Locale locale2 = new java.util.Locale("en-GB", "zh-TW");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "en-gb_ZH-TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-gb_ZH-TW" + "'", str3, "en-gb_ZH-TW");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder10.build();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder16 = builder10.setLocale(locale15);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder17.setVariant("");
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale22.getVariant();
        java.util.Locale.Builder builder24 = builder19.setLocale(locale22);
        java.lang.String str25 = locale15.getDisplayLanguage(locale22);
        java.lang.String str26 = locale15.getLanguage();
        java.lang.String str27 = locale15.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet28 = locale15.getUnicodeLocaleAttributes();
        java.lang.Object obj29 = locale15.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "zh_TW");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder11.setLanguage("French");
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.lang.String str26 = locale19.getDisplayVariant(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale27.getLanguage();
        java.lang.String str29 = locale23.getDisplayScript(locale27);
        java.lang.String str30 = locale18.getDisplayScript(locale23);
        java.util.Locale locale33 = new java.util.Locale("de", "FRA");
        java.lang.String str34 = locale23.getDisplayVariant(locale33);
        java.lang.String str35 = locale16.getDisplayVariant(locale23);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder36.setVariant("");
        java.util.Locale.Builder builder39 = builder36.clear();
        java.util.Locale.Builder builder41 = builder36.setScript("");
        java.util.Locale.Builder builder43 = builder41.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder46 = builder41.setExtension('u', "");
        java.util.Locale.Builder builder49 = builder46.setExtension('u', "");
        java.util.Locale locale50 = builder46.build();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder52 = builder46.setLocale(locale51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder53.setVariant("");
        java.util.Locale.Builder builder57 = builder55.setVariant("");
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.lang.String str59 = locale58.getVariant();
        java.util.Locale.Builder builder60 = builder55.setLocale(locale58);
        java.lang.String str61 = locale51.getDisplayLanguage(locale58);
        java.lang.String str62 = locale51.getCountry();
        java.lang.String str63 = locale23.getDisplayName(locale51);
        java.util.Locale.Builder builder64 = builder0.setLocale(locale23);
        java.util.Locale.Builder builder66 = builder0.removeUnicodeLocaleAttribute("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder68 = builder0.removeUnicodeLocaleAttribute("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "french");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "french" + "'", str17, "french");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e2d\u6587" + "'", str61, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "TW" + "'", str62, "TW");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.util.Random random1 = new java.util.Random(0L);
        double double2 = random1.nextGaussian();
        boolean boolean3 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random1.ints((long) 74589158, 0, (-685475890));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.util.Locale locale3 = new java.util.Locale("", "Italienisch", "CN");
        org.junit.Assert.assertEquals(locale3.toString(), "_ITALIENISCH_CN");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder7 = builder5.setRegion("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u56fd", "\u65e5\u672c");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u56fd\u65e5\u672c");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "China");
        java.util.Locale.Builder builder12 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder0.setExtension('#', "GBR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale locale6 = builder0.build();
        java.lang.String str7 = locale6.getLanguage();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder14 = builder10.setLanguage("French");
        java.util.Locale locale15 = builder10.build();
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.lang.String str17 = locale16.getVariant();
        java.util.Random random19 = new java.util.Random(100L);
        double double20 = random19.nextGaussian();
        random19.setSeed((long) (-1157793070));
        double double23 = random19.nextGaussian();
        boolean boolean24 = random19.nextBoolean();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale16, random19);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.lang.String str32 = locale30.getExtension('x');
        java.lang.String str33 = locale26.getDisplayName(locale30);
        java.lang.String str35 = locale26.getExtension('x');
        java.util.Locale locale37 = new java.util.Locale("fra");
        java.lang.String str38 = locale26.getDisplayScript(locale37);
        java.util.Locale locale39 = locale26.stripExtensions();
        java.lang.String str40 = locale16.getDisplayScript(locale39);
        java.lang.String str41 = locale16.getScript();
        java.util.Locale locale42 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.util.Locale locale47 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str48 = locale42.getDisplayName(locale47);
        java.util.Set<java.lang.Character> charSet49 = locale42.getExtensionKeys();
        java.lang.String str50 = locale16.getDisplayVariant(locale42);
        java.util.Locale.Builder builder51 = builder10.setLocale(locale16);
        java.lang.String str52 = locale6.getDisplayCountry(locale16);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "french");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6246292191371761d + "'", double20 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.09760425216810112d + "'", double23 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "French" + "'", str33, "French");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals(locale37.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals(locale47.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "English (United Kingdom)" + "'", str48, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("zh-CN");
        java.lang.String str4 = languageRange3.getRange();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("fr", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("French");
        java.lang.String str10 = languageRange9.getRange();
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str14 = languageRange13.getRange();
        java.lang.String str15 = languageRange13.getRange();
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("zho");
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("zh-CN", (double) 0.55340016f);
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("French");
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.lang.String str26 = languageRange25.getRange();
        java.lang.String str27 = languageRange25.getRange();
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        double double31 = languageRange30.getWeight();
        java.util.Locale.LanguageRange languageRange34 = new java.util.Locale.LanguageRange("French", 0.6671595726539502d);
        java.lang.String str35 = languageRange34.getRange();
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("FRA");
        java.util.Locale.LanguageRange languageRange40 = new java.util.Locale.LanguageRange("fr", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange43 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        double double44 = languageRange43.getWeight();
        java.util.Locale.LanguageRange languageRange47 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("China", (double) 0.32771218f);
        java.util.Locale.LanguageRange languageRange52 = new java.util.Locale.LanguageRange("Chinese");
        double double53 = languageRange52.getWeight();
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("French", 0.6671595726539502d);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] { languageRange3, languageRange7, languageRange9, languageRange13, languageRange17, languageRange20, languageRange22, languageRange25, languageRange30, languageRange34, languageRange37, languageRange40, languageRange43, languageRange47, languageRange50, languageRange52, languageRange56 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Locale locale62 = new java.util.Locale("zh-cn", "JPN");
        java.util.Set<java.lang.String> strSet63 = locale62.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strSet63);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet63);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-cn" + "'", str4, "zh-cn");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "french" + "'", str10, "french");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr" + "'", str14, "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fra" + "'", str26, "fra");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fra" + "'", str27, "fra");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "french" + "'", str35, "french");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals(locale62.toString(), "zh-cn_JPN");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList65);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale5.getExtension('x');
        java.lang.String str9 = locale3.getDisplayName(locale5);
        java.util.Random random10 = new java.util.Random();
        java.util.stream.LongStream longStream11 = random10.longs();
        float float12 = random10.nextFloat();
        java.util.stream.DoubleStream doubleStream15 = random10.doubles((double) 100.0f, (double) 190001823);
        java.util.stream.DoubleStream doubleStream16 = random10.doubles();
        boolean boolean17 = locale3.equals((java.lang.Object) doubleStream16);
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(longStream11);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.63733506f + "'", float12 == 0.63733506f);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category14);
        java.util.Locale locale20 = java.util.Locale.getDefault(category14);
        java.util.Locale locale21 = java.util.Locale.getDefault(category14);
        java.util.Locale locale22 = java.util.Locale.getDefault(category14);
        java.util.Locale.Builder builder23 = builder10.setLocale(locale22);
        java.util.Locale.Builder builder25 = builder10.setLanguageTag("French");
        java.util.Locale.Builder builder27 = builder25.setLanguage("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder27.setScript("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream3 = random1.ints();
        java.lang.Class<?> wildcardClass4 = random1.getClass();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.util.Locale locale3 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale4.getDisplayScript();
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.util.Locale.setDefault(locale10);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale10.getDisplayLanguage(locale14);
        java.lang.String str16 = locale14.getDisplayVariant();
        java.lang.String str17 = locale4.getDisplayCountry(locale14);
        java.lang.String str18 = locale3.getDisplayName(locale4);
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.lang.String str22 = locale19.getExtension('x');
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setVariant("");
        java.util.Locale.Builder builder26 = builder23.clear();
        java.util.Locale.Builder builder28 = builder23.setScript("");
        java.util.Locale locale29 = builder23.build();
        java.lang.String str30 = locale19.getDisplayLanguage(locale29);
        java.lang.String str31 = locale4.getDisplayCountry(locale19);
        java.lang.String str32 = locale19.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japon" + "'", str17, "Japon");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)" + "'", str18, "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u65e5\u672c" + "'", str31, "\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zho" + "'", str32, "zho");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder9 = builder4.setScript("");
        java.util.Locale locale10 = builder4.build();
        java.lang.String str11 = locale0.getDisplayLanguage(locale10);
        java.lang.String str12 = locale10.getLanguage();
        java.util.Locale locale13 = null;
        java.lang.String str14 = null; // flaky: locale10.getDisplayScript(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("x-lvariant-jpn");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale4.getUnicodeLocaleType("fr");
        java.lang.String str9 = locale4.getISO3Language();
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.util.Locale.setDefault(locale13);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale13.getISO3Language();
        java.lang.String str20 = locale4.getDisplayCountry(locale13);
        java.util.Set<java.lang.Character> charSet21 = locale13.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charSet21);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und-a-chinese-u-china", (double) 2102639409);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.102639409E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u6587");
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.util.Locale locale2 = new java.util.Locale("zh-CN", "China");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh-cn_CHINA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn_CHINA");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random9.longs();
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream12 = random9.ints();
        int int13 = random9.nextInt();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale5, random9);
        java.lang.String str17 = faker15.numerify("French");
        com.github.javafaker.Color color18 = faker15.color();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.7750797f + "'", float11 == 0.7750797f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 486920839 + "'", int13 == 486920839);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random1.longs((long) (-1608557193), (long) (-370182532), (long) (-1193959466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.69229555f + "'", float3 == 0.69229555f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1029165123) + "'", int5 == (-1029165123));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        double double3 = languageRange2.getWeight();
        java.lang.Object obj4 = null;
        boolean boolean5 = languageRange2.equals(obj4);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Company company5 = faker0.company();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587", "hi! (CHINESE (CHINA))", "en_GB");
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587_HI! (CHINESE (CHINA))_en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_GB" + "'", str4, "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder2.addUnicodeLocaleAttribute("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder2.removeUnicodeLocaleAttribute("ja-JP");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja-JP [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587\u4e2d\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        boolean boolean3 = random1.nextBoolean();
        long long4 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random1.ints((long) (-1083682081), 44, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4437113781045784766L + "'", long4 == 4437113781045784766L);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.lang.String str16 = locale9.getDisplayName(locale13);
        java.lang.String str18 = locale9.getExtension('x');
        java.util.Locale locale20 = new java.util.Locale("fra");
        java.lang.String str21 = locale9.getDisplayScript(locale20);
        java.util.Locale locale22 = locale9.stripExtensions();
        java.lang.String str23 = locale7.getDisplayLanguage(locale22);
        java.lang.String str25 = locale7.getExtension('x');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals(locale20.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "french" + "'", str23, "french");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.App app7 = faker0.app();
        com.github.javafaker.Internet internet8 = faker0.internet();
        com.github.javafaker.Finance finance9 = faker0.finance();
        java.lang.String str11 = faker0.bothify("deu");
        java.lang.String str13 = faker0.numerify("Japon");
        com.github.javafaker.Name name14 = faker0.name();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "deu" + "'", str11, "deu");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Japon" + "'", str13, "Japon");
        org.junit.Assert.assertNotNull(name14);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream7 = random1.ints(0L, (int) '#', (int) (byte) 100);
        java.util.stream.LongStream longStream9 = random1.longs((long) 1627973114);
        boolean boolean10 = random1.nextBoolean();
        double double11 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.1460540722898627d + "'", double11 == 1.1460540722898627d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHINESISCH (TAIWAN)", (double) (-1590961789));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.590961789E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh_CN");
        com.github.javafaker.Options options7 = faker0.options();
        java.lang.String str9 = faker0.bothify("italien");
        com.github.javafaker.PhoneNumber phoneNumber10 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italien" + "'", str9, "italien");
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale0.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.setDefault(locale7);
        java.lang.String str10 = locale7.getISO3Language();
        java.util.Locale locale14 = new java.util.Locale("English United Kingdom", "zh-CN", "JPN");
        java.lang.String str15 = locale14.getDisplayVariant();
        java.lang.String str16 = locale7.getDisplayScript(locale14);
        java.lang.String str17 = locale0.getDisplayScript(locale14);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("zh,CN");
        java.lang.String str20 = locale0.getDisplayName(locale19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anglais" + "'", str6, "anglais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ita" + "'", str8, "ita");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertEquals(locale14.toString(), "english united kingdom_ZH-CN_JPN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JPN" + "'", str15, "JPN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English (Canada)" + "'", str20, "English (Canada)");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francese" + "'", str1, "francese");
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.util.Random random1 = new java.util.Random(0L);
        double double2 = random1.nextGaussian();
        java.util.stream.IntStream intStream3 = random1.ints();
        java.util.stream.LongStream longStream6 = random1.longs((long) (-141660695), (long) 2102639409);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.lang.String str7 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-cn (JPN)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh-cn(jpn)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.Lorem lorem7 = faker5.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker5.resolve("en");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random9.longs();
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream12 = random9.ints();
        int int13 = random9.nextInt();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale5, random9);
        java.lang.String str17 = faker15.numerify("French");
        com.github.javafaker.Business business18 = faker15.business();
        com.github.javafaker.Lorem lorem19 = faker15.lorem();
        java.lang.String str21 = faker15.bothify("Englisch (Kanada)");
        com.github.javafaker.PhoneNumber phoneNumber22 = faker15.phoneNumber();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.70778835f + "'", float11 == 0.70778835f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-469336362) + "'", int13 == (-469336362));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Englisch (Kanada)" + "'", str21, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(phoneNumber22);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.util.Random random1 = new java.util.Random((-1L));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category4, locale8);
        java.util.Locale.Builder builder10 = builder3.setLocale(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale20 = new java.util.Locale("de", "\u6cd5\u6587");
        java.lang.String str21 = locale14.getDisplayLanguage(locale20);
        java.lang.String str22 = locale8.getDisplayVariant(locale14);
        java.lang.String str23 = locale0.getDisplayScript(locale14);
        java.lang.String str24 = locale14.getLanguage();
        java.lang.String str25 = locale14.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "italien");
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Random random15 = new java.util.Random();
        java.util.stream.LongStream longStream16 = random15.longs();
        java.util.stream.LongStream longStream18 = random15.longs(0L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale14, random15);
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Locale.setDefault(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale23.getDisplayLanguage(locale27);
        java.lang.String str29 = locale27.getDisplayVariant();
        java.lang.String str30 = locale14.getDisplayCountry(locale27);
        java.util.Locale.Builder builder31 = builder13.setLocale(locale27);
        java.lang.String str32 = locale27.getISO3Country();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chine" + "'", str30, "Chine");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CN", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale13.getISO3Country();
        java.lang.String str15 = locale13.getDisplayVariant();
        java.lang.String str16 = locale0.getDisplayScript(locale13);
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale13.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "deu" + "'", str18, "deu");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getLanguage();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.util.Locale locale11 = builder6.build();
        java.lang.String str12 = locale1.getDisplayName(locale11);
        java.lang.String str13 = locale1.getDisplayLanguage();
        java.lang.String str14 = locale1.getVariant();
        boolean boolean15 = locale1.hasExtensions();
        java.lang.Object obj16 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Company company7 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        com.github.javafaker.Book book9 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.util.Random random1 = new java.util.Random((long) (-388136581));
        double double2 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5015041674080956d + "'", double2 == 1.5015041674080956d);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(9);
        java.util.stream.LongStream longStream6 = random1.longs(0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zho", (double) 1.0f);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd)", "en_CA", "Korean (South Korea)");
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587\u82f1\u56fd)_EN_CA_Korean (South Korea)");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.LongStream longStream9 = random0.longs((long) 1358566768, (long) (-1690734402), (long) (-1279776254));
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random0.ints((long) (-1473218428), (-196947104), (-1950768727));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) 1802692291);
        java.util.stream.LongStream longStream9 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((long) (byte) 100, (long) (-469336362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("China");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("German");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str9 = languageRange8.getRange();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange12, languageRange15, languageRange18, languageRange21 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale locale31 = builder28.build();
        java.util.Locale locale35 = new java.util.Locale("", "", "");
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.lang.String str40 = locale35.getDisplayLanguage(locale39);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale45.getDisplayLanguage(locale49);
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.lang.String str56 = locale54.getExtension('x');
        java.util.Locale.setDefault(locale54);
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.lang.String str61 = locale60.getISO3Country();
        java.util.Locale locale65 = new java.util.Locale("", "", "");
        java.util.Locale locale69 = new java.util.Locale("", "", "");
        java.lang.String str70 = locale65.getDisplayLanguage(locale69);
        java.util.Locale locale72 = new java.util.Locale("hi!");
        java.util.Locale locale73 = locale72.stripExtensions();
        java.util.Locale locale75 = new java.util.Locale("hi!");
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale locale79 = new java.util.Locale("hi!");
        java.util.Locale locale80 = locale79.stripExtensions();
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale31, locale35, locale41, locale49, locale54, locale60, locale69, locale72, locale75, locale77, locale79 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale.FilteringMode filteringMode84 = null;
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList82, filteringMode84);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList82, filteringMode87);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList89, filteringMode90);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(localeList85);
// flaky:         org.junit.Assert.assertNotNull(locale86);
// flaky:         org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode90.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList91);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("french");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("deu", strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("und", strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale locale14 = builder11.build();
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale18.getDisplayLanguage(locale22);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale28.getDisplayLanguage(locale32);
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.lang.String str39 = locale37.getExtension('x');
        java.util.Locale.setDefault(locale37);
        java.util.Locale locale42 = new java.util.Locale("hi!");
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale43.getISO3Country();
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.lang.String str53 = locale48.getDisplayLanguage(locale52);
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.util.Locale locale56 = locale55.stripExtensions();
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale14, locale18, locale24, locale32, locale37, locale43, locale52, locale55, locale58, locale60, locale62 };
        java.util.ArrayList<java.util.Locale> localeList65 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList65, localeArray64);
        java.util.Locale.FilteringMode filteringMode67 = null;
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList65, filteringMode67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.parse("fr", strMap70);
        java.util.Locale locale72 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags(languageRangeList71, (java.util.Collection<java.lang.String>) strSet73, filteringMode74);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList65, filteringMode74);
        java.util.Locale locale77 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap78);
        java.util.Locale.Builder builder80 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder82 = builder80.setVariant("");
        java.util.Locale.Builder builder83 = builder80.clear();
        java.util.Locale locale84 = builder83.build();
        java.util.Locale locale85 = java.util.Locale.ITALIAN;
        java.lang.String str86 = locale84.getDisplayName(locale85);
        java.util.Set<java.lang.String> strSet87 = locale85.getUnicodeLocaleKeys();
        java.lang.String str89 = locale85.getExtension('a');
        java.util.Set<java.lang.String> strSet90 = locale85.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet91 = locale85.getUnicodeLocaleAttributes();
        java.lang.String str92 = locale85.getVariant();
        java.util.Set<java.lang.String> strSet93 = locale85.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList79, (java.util.Collection<java.lang.String>) strSet93);
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals(locale42.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode74.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "it");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Random random7 = new java.util.Random(100L);
        double double8 = random7.nextGaussian();
        double double9 = random7.nextDouble();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5, random7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random7.ints((long) (-1072555495));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6246292191371761d + "'", double8 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6671595726539502d + "'", double9 == 0.6671595726539502d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.Random random3 = new java.util.Random((long) (short) 1);
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream7 = random5.doubles((long) 10);
        int int8 = random5.nextInt();
        java.util.stream.DoubleStream doubleStream9 = random5.doubles();
        java.util.stream.IntStream intStream10 = random5.ints();
        java.util.Random random12 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream14 = random12.doubles((long) 10);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random12.nextBytes(byteArray18);
        random5.nextBytes(byteArray18);
        random3.nextBytes(byteArray18);
        random1.nextBytes(byteArray18);
        double double23 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[115, -43, 26]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.8673886034754649d) + "'", double23 == (-0.8673886034754649d));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.LongStream longStream9 = random0.longs((long) 1358566768, (long) (-1690734402), (long) (-1279776254));
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        float float11 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((long) (-894135949));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.39938325f + "'", float11 == 0.39938325f);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.util.Locale locale2 = new java.util.Locale("x-lvariant-jpn", "");
        org.junit.Assert.assertEquals(locale2.toString(), "x-lvariant-jpn");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chine");
        java.util.Locale locale5 = new java.util.Locale("x-lvariant-JPN", "jpn", "\u6cd5\u56fd");
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale1.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chine");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u6cd5\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u56fd)" + "'", str6, "\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chine" + "'", str7, "chine");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale locale11 = builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        int int13 = random1.nextInt();
        boolean boolean14 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random1.doubles((long) 2102639409, (double) 0.6295393f, (double) 0.25256002f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1189342480) + "'", int13 == (-1189342480));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs(10L, 0L, (long) (short) 100);
        java.util.Random random8 = new java.util.Random(1L);
        java.util.Random random10 = new java.util.Random((long) (short) 1);
        java.util.Random random12 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream14 = random12.doubles((long) 10);
        int int15 = random12.nextInt();
        java.util.stream.DoubleStream doubleStream16 = random12.doubles();
        java.util.stream.IntStream intStream17 = random12.ints();
        java.util.Random random19 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream21 = random19.doubles((long) 10);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random19.nextBytes(byteArray25);
        random12.nextBytes(byteArray25);
        random10.nextBytes(byteArray25);
        random8.nextBytes(byteArray25);
        random1.nextBytes(byteArray25);
        double double31 = random1.nextGaussian();
        float float32 = random1.nextFloat();
        java.util.stream.LongStream longStream33 = random1.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1157793070) + "'", int15 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-40, -100, -72]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.4123569817688534d) + "'", double31 == (-0.4123569817688534d));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.332717f + "'", float32 == 0.332717f);
        org.junit.Assert.assertNotNull(longStream33);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder5.setLanguage("French");
        java.util.Locale locale10 = builder9.build();
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale17.getExtension('x');
        java.lang.String str20 = locale13.getDisplayVariant(locale17);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale17.getDisplayScript(locale21);
        java.lang.String str24 = locale12.getDisplayScript(locale17);
        java.util.Locale locale27 = new java.util.Locale("de", "FRA");
        java.lang.String str28 = locale17.getDisplayVariant(locale27);
        java.lang.String str29 = locale10.getDisplayVariant(locale17);
        java.lang.String str30 = locale1.getDisplayLanguage(locale17);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.lang.String str38 = locale36.getExtension('x');
        java.lang.String str39 = locale32.getDisplayVariant(locale36);
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.lang.String str41 = locale40.getLanguage();
        java.lang.String str42 = locale36.getDisplayScript(locale40);
        java.lang.String str43 = locale31.getDisplayScript(locale36);
        java.lang.String str44 = locale31.getDisplayVariant();
        java.lang.String str45 = locale1.getDisplayCountry(locale31);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "french");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french" + "'", str11, "french");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale27.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "fr" + "'", str41, "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setScript("italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Address address6 = faker5.address();
        com.github.javafaker.Address address7 = faker5.address();
        java.lang.String str9 = faker5.regexify("inglese");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "inglese" + "'", str9, "inglese");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book2 = faker1.book();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Number number4 = faker1.number();
        java.lang.String str6 = faker1.bothify("Japan");
        com.github.javafaker.App app7 = faker1.app();
        com.github.javafaker.Internet internet8 = faker1.internet();
        com.github.javafaker.Business business9 = faker1.business();
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Japan" + "'", str6, "Japan");
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.lang.Object obj14 = locale8.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "zh_CN");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.Locale locale3 = new java.util.Locale("French", "FRA", "und");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FRA");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRA_und");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en-GB", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.LongStream longStream6 = random1.longs();
        java.util.stream.LongStream longStream7 = random1.longs();
        int int9 = random1.nextInt((int) (byte) 1);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Business business3 = faker2.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker2.resolve("chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean (South Korea)", (double) 1078116549);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.078116549E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder7.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.util.Random random1 = new java.util.Random((long) 14);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 784223937, (double) 0.34564477f, (double) 0.7819709f);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien", (double) 1913984760);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.91398476E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (FRA,und)", (double) 1627973114);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.627973114E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random(100L);
        double double4 = random3.nextGaussian();
        random3.setSeed((long) (-1157793070));
        double double7 = random3.nextGaussian();
        boolean boolean8 = random3.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.lang.String str17 = locale10.getDisplayName(locale14);
        java.lang.String str19 = locale10.getExtension('x');
        java.util.Locale locale21 = new java.util.Locale("fra");
        java.lang.String str22 = locale10.getDisplayScript(locale21);
        java.util.Locale locale23 = locale10.stripExtensions();
        java.lang.String str24 = locale0.getDisplayScript(locale23);
        java.lang.String str25 = locale0.getScript();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale locale31 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str32 = locale26.getDisplayName(locale31);
        java.util.Set<java.lang.Character> charSet33 = locale26.getExtensionKeys();
        java.lang.String str34 = locale0.getDisplayVariant(locale26);
        java.util.Set<java.lang.String> strSet35 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str43 = locale41.getExtension('x');
        java.lang.String str44 = locale37.getDisplayVariant(locale41);
        java.util.Locale locale45 = java.util.Locale.FRENCH;
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale41.getDisplayScript(locale45);
        java.lang.String str48 = locale36.getDisplayScript(locale41);
        java.lang.String str50 = locale36.getExtension('u');
        java.lang.String str51 = locale0.getDisplayCountry(locale36);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09760425216810112d + "'", double7 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals(locale21.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals(locale31.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English (United Kingdom)" + "'", str32, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fr" + "'", str46, "fr");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "China" + "'", str51, "China");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str15 = languageRange14.getRange();
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange5, languageRange8, languageRange11, languageRange14, languageRange18 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setVariant("");
        java.util.Locale locale28 = builder25.build();
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.lang.String str37 = locale32.getDisplayLanguage(locale36);
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale42.getDisplayLanguage(locale46);
        java.util.Locale locale51 = new java.util.Locale("", "", "");
        java.lang.String str53 = locale51.getExtension('x');
        java.util.Locale.setDefault(locale51);
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.lang.String str58 = locale57.getISO3Country();
        java.util.Locale locale62 = new java.util.Locale("", "", "");
        java.util.Locale locale66 = new java.util.Locale("", "", "");
        java.lang.String str67 = locale62.getDisplayLanguage(locale66);
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale locale70 = locale69.stripExtensions();
        java.util.Locale locale72 = new java.util.Locale("hi!");
        java.util.Locale locale74 = new java.util.Locale("hi!");
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale locale77 = locale76.stripExtensions();
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale28, locale32, locale38, locale46, locale51, locale57, locale66, locale69, locale72, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.Locale.FilteringMode filteringMode81 = null;
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList79, filteringMode81);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList79);
        java.lang.String str84 = null; // flaky: locale83.getDisplayCountry();
        java.lang.String str86 = null; // flaky: locale83.getExtension('a');
        com.github.javafaker.Faker faker87 = null; // flaky: new com.github.javafaker.Faker(locale83);
        java.util.Set<java.lang.Character> charSet88 = null; // flaky: locale83.getExtensionKeys();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(localeList82);
// flaky:         org.junit.Assert.assertNotNull(locale83);
// flaky:         org.junit.Assert.assertEquals(locale83.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNull(str86);
// flaky:         org.junit.Assert.assertNotNull(charSet88);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream6 = random1.ints((long) 1947844456);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        float float9 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.831441f + "'", float9 == 0.831441f);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        int int11 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream12 = random1.doubles();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1189342480) + "'", int11 == (-1189342480));
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder9 = builder5.setRegion("US");
        java.util.Locale.Builder builder11 = builder5.setLanguage("Japan");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("Italienisch");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.43266338f, 0.6246292191371761d);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        java.lang.String str7 = faker5.numerify("ko");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ko" + "'", str7, "ko");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("und-DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "_DE");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.util.Locale locale2 = new java.util.Locale("de", "Chinese (China)");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale7.getDisplayScript(locale11);
        java.lang.String str14 = locale2.getDisplayVariant(locale11);
        java.util.Locale locale15 = locale11.stripExtensions();
        boolean boolean16 = locale11.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "de_CHINESE (CHINA)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        float float5 = random0.nextFloat();
        random0.setSeed(736442293137335911L);
        boolean boolean8 = random0.nextBoolean();
        java.util.stream.IntStream intStream12 = random0.ints((long) 9, 161103366, 1129532480);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9636359f + "'", float2 == 0.9636359f);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.3278405f + "'", float5 == 0.3278405f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.util.Locale locale2 = new java.util.Locale("English (United Kingdom)", "eng");
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_ENG");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Company company7 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        java.lang.String str10 = faker0.numerify("zho");
        java.lang.String str12 = faker0.regexify("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker0.resolve("\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.Options options7 = faker0.options();
        java.lang.Class<?> wildcardClass8 = options7.getClass();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinese");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) 78707950, (long) 2002825273);
        java.util.stream.LongStream longStream16 = random1.longs((long) 1078116549, (long) 1370835837, 3781791188705226281L);
        boolean boolean17 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.IntStream intStream7 = random0.ints();
        double double8 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((long) (-539800044), (long) 1129532480, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 703911421 + "'", int4 == 703911421);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41785874984746374d + "'", double8 == 0.41785874984746374d);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("x-lvariant-fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream7 = random5.doubles((long) 10);
        int int8 = random5.nextInt();
        java.util.stream.DoubleStream doubleStream9 = random5.doubles();
        java.util.stream.IntStream intStream10 = random5.ints();
        java.util.Random random12 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream14 = random12.doubles((long) 10);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random12.nextBytes(byteArray18);
        random5.nextBytes(byteArray18);
        random1.nextBytes(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream25 = random1.ints(0L, 1499498498, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-42, -97, -43]");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.util.Random random1 = new java.util.Random((long) 991634924);
        float float2 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9866732f + "'", float2 == 0.9866732f);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        int int4 = random1.nextInt();
        int int5 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random1.longs((long) (-796391428), (long) 74692140, (long) 476097028);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1193959466) + "'", int4 == (-1193959466));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1139614796) + "'", int5 == (-1139614796));
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        java.lang.String str4 = faker0.numerify("ITA");
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.Company company7 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Code code6 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "JPN");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream7 = random5.doubles((long) 10);
        int int8 = random5.nextInt();
        double double9 = random5.nextDouble();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        double double11 = random5.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale2, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh-cn_JPN could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn_JPN");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4456342944175421d + "'", double9 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4129126974821382d + "'", double11 == 0.4129126974821382d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("deu");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("\u82f1\u6587\u82f1\u56fd)", "chinese (JPN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = locale10.toLanguageTag();
        java.lang.String str14 = locale7.getDisplayName(locale10);
        java.util.Set<java.lang.String> strSet15 = locale7.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und" + "'", str13, "und");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Number number8 = faker0.number();
        com.github.javafaker.Number number9 = faker0.number();
        com.github.javafaker.Business business10 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.util.Locale locale2 = new java.util.Locale("US", "chinese");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getDisplayScript();
        java.lang.String str5 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "us_CHINESE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us (CHINESE)" + "'", str3, "us (CHINESE)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zho", 0.7924908613121775d);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.lang.String str9 = locale7.getExtension('a');
        java.lang.String str11 = locale7.getExtension('u');
        boolean boolean12 = languageRange2.equals((java.lang.Object) 'u');
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.util.Random random1 = new java.util.Random((long) (-268554284));
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles(7616895062557318172L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs((long) (-1478279269), (long) ' ', 2898173593284639382L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.24406683f + "'", float2 == 0.24406683f);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.Random random1 = new java.util.Random((long) 1949998615);
        double double2 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6592010988112803d) + "'", double2 == (-0.6592010988112803d));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("Japanese", "ENGLISH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Japanese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.Locale locale3 = new java.util.Locale("zh", "China", "Twi");
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CHINA_Twi");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u672a\u5b9a\u8bed\u79cd", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale7 = java.util.Locale.getDefault(category2);
        java.lang.String str9 = locale7.getExtension('a');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category12, locale16);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale16);
        java.lang.String str19 = locale7.getDisplayCountry(locale16);
        boolean boolean20 = languageRange1.equals((java.lang.Object) locale16);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.util.Locale locale3 = new java.util.Locale("deu", "English (Canada)", "chinois (Chine)");
        org.junit.Assert.assertEquals(locale3.toString(), "deu_ENGLISH (CANADA)_chinois (Chine)");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0.22747606f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japan", 0.9114582547571894d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.util.Random random1 = new java.util.Random((long) (-389258033));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en_ca", (double) (-1855441849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.855441849E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Random random3 = new java.util.Random((long) 0);
        int int5 = random3.nextInt((int) '4');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random3);
        double double7 = random3.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        int int11 = random3.nextInt();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8314409887870612d + "'", double7 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1690734402) + "'", int11 == (-1690734402));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.IntStream intStream9 = random1.ints((long) 591553211);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random1.longs((long) (-275271), (long) 2027332310, (long) 2073616612);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italian", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        com.github.javafaker.Hacker hacker8 = faker0.hacker();
        com.github.javafaker.Code code9 = faker0.code();
        com.github.javafaker.Hacker hacker10 = faker0.hacker();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        java.util.stream.LongStream longStream5 = random1.longs();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        long long7 = random1.nextLong();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5128016860359238732L) + "'", long7 == (-5128016860359238732L));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinese");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.util.Locale locale3 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("Korean");
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        java.lang.Object obj7 = locale5.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "korean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Twi" + "'", str6, "Twi");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "korean");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "korean");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "korean");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        java.util.stream.LongStream longStream5 = random0.longs((long) 443638859);
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getUnicodeLocaleType("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinois");
        double double2 = languageRange1.getWeight();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        float float6 = random4.nextFloat();
        java.util.stream.IntStream intStream7 = random4.ints();
        int int8 = random4.nextInt();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale3, random4);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale3.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale10.getDisplayLanguage(locale12);
        boolean boolean15 = languageRange1.equals((java.lang.Object) str14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.2534272f + "'", float6 == 0.2534272f);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1324414354 + "'", int8 == 1324414354);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u6cd5\u6587" + "'", str14, "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str5 = locale4.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Options options8 = faker4.options();
        com.github.javafaker.Color color9 = faker4.color();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker4.phoneNumber();
        com.github.javafaker.Code code11 = faker4.code();
        com.github.javafaker.Name name12 = faker4.name();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.lang.String str16 = locale9.getDisplayVariant(locale13);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale17.getLanguage();
        java.lang.String str19 = locale13.getDisplayScript(locale17);
        java.lang.String str20 = locale8.getDisplayScript(locale13);
        java.util.Locale locale23 = new java.util.Locale("de", "FRA");
        java.lang.String str24 = locale13.getDisplayVariant(locale23);
        java.lang.String str25 = locale5.getDisplayVariant(locale13);
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.getDefault(category26);
        java.lang.String str28 = locale13.getDisplayScript(locale27);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.lang.String str31 = locale13.getDisplayCountry(locale29);
        java.lang.String str32 = locale29.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale23.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "fr_CA" + "'", str32, "fr_CA");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale0.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.lang.String str11 = locale7.getDisplayLanguage(locale9);
        java.lang.String str12 = locale7.getLanguage();
        java.lang.String str13 = locale7.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.9775283f + "'", float3 == 0.9775283f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1115909453 + "'", int5 == 1115909453);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) 1802692291);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints((long) (-1752090028), (int) '4', (-280082280));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.util.Locale locale3 = new java.util.Locale("fra (FRA,fr)", "GB", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.Object obj4 = locale3.clone();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(obj4);
// flaky:         org.junit.Assert.assertEquals(obj4.toString(), "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("JAPAN", (double) 0.89409524f);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale4.getDisplayCountry(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale4.getDisplayScript(locale21);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale27.getExtension('x');
        java.lang.String str30 = locale23.getDisplayName(locale27);
        java.lang.String str32 = locale23.getExtension('x');
        java.util.Locale locale34 = new java.util.Locale("fra");
        java.lang.String str35 = locale23.getDisplayScript(locale34);
        java.util.Locale locale36 = locale23.stripExtensions();
        java.lang.String str37 = locale4.getDisplayCountry(locale23);
        java.lang.String str38 = locale23.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "French" + "'", str30, "French");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals(locale34.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getDisplayVariant();
        java.lang.String str10 = locale0.getCountry();
        java.util.Random random12 = new java.util.Random((long) (short) 0);
        int int13 = random12.nextInt();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random12);
        double double15 = random12.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random12.doubles();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem18 = faker17.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GB" + "'", str10, "GB");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1155484576) + "'", int13 == (-1155484576));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.1460540722898627d + "'", double15 == 1.1460540722898627d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(lorem18);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("Korean", strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale locale16 = builder13.build();
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale20.getDisplayLanguage(locale24);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.lang.String str35 = locale30.getDisplayLanguage(locale34);
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.lang.String str41 = locale39.getExtension('x');
        java.util.Locale.setDefault(locale39);
        java.util.Locale locale44 = new java.util.Locale("hi!");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale45.getISO3Country();
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.lang.String str55 = locale50.getDisplayLanguage(locale54);
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.util.Locale locale58 = locale57.stripExtensions();
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.util.Locale locale62 = new java.util.Locale("hi!");
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale locale65 = locale64.stripExtensions();
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale16, locale20, locale26, locale34, locale39, locale45, locale54, locale57, locale60, locale62, locale64 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale.FilteringMode filteringMode69 = null;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList67, filteringMode69);
        java.util.Locale locale71 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale locale72 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList67);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Color color5 = faker0.color();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.Code code7 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getDisplayVariant();
        java.lang.String str10 = locale0.getCountry();
        java.util.Set<java.lang.Character> charSet11 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet12 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale0.getDisplayVariant(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GB" + "'", str10, "GB");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        java.util.stream.IntStream intStream14 = random1.ints(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random1.ints(1839438880, 583837061);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("French");
        java.lang.String str3 = locale2.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "french");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TW");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setScript("");
        java.util.Locale.Builder builder11 = builder3.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale13.getISO3Country();
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        java.lang.String str17 = locale15.getCountry();
        java.util.Locale.Builder builder18 = builder11.setLocale(locale15);
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random19);
        boolean boolean21 = languageRange1.equals((java.lang.Object) faker20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tw" + "'", str2, "tw");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German" + "'", str16, "German");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "US" + "'", str17, "US");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Options options6 = faker1.options();
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.Color color8 = faker1.color();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random7.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) '#');
        java.util.Random random14 = new java.util.Random(1L);
        java.util.Random random16 = new java.util.Random((long) (short) 1);
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles((long) 10);
        int int21 = random18.nextInt();
        java.util.stream.DoubleStream doubleStream22 = random18.doubles();
        java.util.stream.IntStream intStream23 = random18.ints();
        java.util.Random random25 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream27 = random25.doubles((long) 10);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random25.nextBytes(byteArray31);
        random18.nextBytes(byteArray31);
        random16.nextBytes(byteArray31);
        random14.nextBytes(byteArray31);
        random7.nextBytes(byteArray31);
        random0.nextBytes(byteArray31);
        java.util.stream.LongStream longStream40 = random0.longs((long) (-1442101864), (long) (-685475890));
        java.util.stream.LongStream longStream42 = random0.longs((long) 'x');
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7102197f + "'", float2 == 0.7102197f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(byteArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-118, 2, 104]");
        org.junit.Assert.assertNotNull(longStream40);
        org.junit.Assert.assertNotNull(longStream42);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.App app5 = faker0.app();
        java.lang.String str7 = faker0.numerify("zh");
        com.github.javafaker.Company company8 = faker0.company();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getDisplayVariant();
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = locale10.getCountry();
        java.lang.String str14 = locale6.getDisplayVariant(locale10);
        java.util.Locale.Builder builder15 = builder3.setLocale(locale6);
        java.lang.String str16 = locale6.getDisplayCountry();
        java.lang.String str17 = locale6.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.util.Locale locale1 = new java.util.Locale("en-GB");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for en-gb");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "en-gb");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.util.Random random1 = new java.util.Random((long) 102643840);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.regexify("jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn_HI! CHINESE CHINA" + "'", str4, "jpn_HI! CHINESE CHINA");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-tw_CHINE", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh-tw_chine");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Random random7 = new java.util.Random(100L);
        double double8 = random7.nextGaussian();
        double double9 = random7.nextDouble();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5, random7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random7.ints((-4962768465676381896L), 1078116549, 822110444);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6246292191371761d + "'", double8 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6671595726539502d + "'", double9 == 0.6671595726539502d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale10 = java.util.Locale.getDefault(category5);
        java.util.Locale locale11 = java.util.Locale.getDefault(category5);
        java.util.Locale locale12 = java.util.Locale.getDefault(category5);
        java.util.Locale locale13 = java.util.Locale.getDefault(category5);
        java.util.Locale locale14 = java.util.Locale.getDefault(category5);
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale17 = null;
        java.lang.String str18 = null; // flaky: locale16.getDisplayScript(locale17);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.util.Locale.setDefault(category19, locale20);
        java.util.Locale locale24 = java.util.Locale.getDefault(category19);
        java.lang.String str26 = locale24.getExtension('a');
        java.lang.String str27 = locale24.getCountry();
        boolean boolean28 = locale24.hasExtensions();
        java.lang.String str29 = locale16.getDisplayScript(locale24);
        java.util.Locale.setDefault(category5, locale24);
        java.util.Locale locale31 = java.util.Locale.getDefault(category5);
        java.lang.String str32 = locale1.getDisplayLanguage(locale31);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("gb__Englisch (Kanada)", (double) (-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.15779307E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.util.Locale locale2 = new java.util.Locale("fr_CA", "JP");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_ca_JP");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.util.Random random1 = new java.util.Random((long) 1509824815);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u97d3\u6587", (double) 0.16571379f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.util.Locale locale1 = new java.util.Locale("francese");
        org.junit.Assert.assertEquals(locale1.toString(), "francese");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream8 = random7.longs();
        java.util.stream.LongStream longStream10 = random7.longs(0L);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale6, random7);
        java.lang.String str12 = locale6.getDisplayName();
        java.lang.String str13 = locale1.getDisplayVariant(locale6);
        java.lang.String str14 = locale1.getVariant();
        java.util.Random random16 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream18 = random16.doubles((long) 10);
        int int19 = random16.nextInt();
        double double20 = random16.nextDouble();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random16);
        java.util.stream.DoubleStream doubleStream23 = random16.doubles((long) 1802692291);
        java.util.stream.LongStream longStream24 = random16.longs();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale1, random16);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1157793070) + "'", int19 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4456342944175421d + "'", double20 == 0.4456342944175421d);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(longStream24);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GB", (double) 0.80456084f);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gb" + "'", str3, "gb");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (-925427400), 0.1783094015617872d, (double) 0.8884572f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = locale9.getCountry();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet12 = locale9.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        java.util.Locale locale11 = null;
        java.lang.String str12 = null; // flaky: locale7.getDisplayCountry(locale11);
        java.lang.String str14 = locale7.getExtension('a');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "french" + "'", str9, "french");
        org.junit.Assert.assertNotNull(charSet10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.util.Locale locale2 = new java.util.Locale("Chinese (China)", "\u53f0\u6e7e");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u6e7e");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        java.lang.String str4 = faker0.numerify("anglais (Royaume-Uni)");
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais (Royaume-Uni)" + "'", str4, "anglais (Royaume-Uni)");
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.getDisplayScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        float float3 = random0.nextFloat();
        java.util.stream.LongStream longStream5 = random0.longs((long) ' ');
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9822287f + "'", float2 == 0.9822287f);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.7589086f + "'", float3 == 0.7589086f);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.util.Locale locale2 = new java.util.Locale("US", "chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for CHINESE");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "us_CHINESE");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextDouble();
        java.util.stream.IntStream intStream8 = random1.ints((long) 443638859);
        long long9 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8314409887870612d + "'", double6 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-7261648964369397258L) + "'", long9 == (-7261648964369397258L));
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Options options8 = faker4.options();
        com.github.javafaker.Color color9 = faker4.color();
        com.github.javafaker.Options options10 = faker4.options();
        java.lang.String str12 = faker4.regexify("x-lvariant-JPN");
        com.github.javafaker.Address address13 = faker4.address();
        com.github.javafaker.Finance finance14 = faker4.finance();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "x-lvariant-JPN" + "'", str12, "x-lvariant-JPN");
        org.junit.Assert.assertNotNull(address13);
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale3.getDisplayName(locale10);
        java.util.Random random13 = new java.util.Random((long) 27);
        long long14 = random13.nextLong();
        int int16 = random13.nextInt(33);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random13);
        com.github.javafaker.Internet internet18 = faker17.internet();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4947896108136290151L) + "'", long14 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertNotNull(internet18);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien", (double) 0.6207161f);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6207160949707031d + "'", double3 == 0.6207160949707031d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        random1.setSeed((long) (-572239868));
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color8 = faker7.color();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.util.Random random1 = new java.util.Random((long) (-1950768727));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = random1.longs((long) (-1140311278));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder9 = builder4.setScript("");
        java.util.Locale locale10 = builder4.build();
        java.lang.String str11 = locale0.getDisplayLanguage(locale10);
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.lang.String str13 = locale12.getVariant();
        java.util.Random random15 = new java.util.Random(100L);
        double double16 = random15.nextGaussian();
        random15.setSeed((long) (-1157793070));
        double double19 = random15.nextGaussian();
        boolean boolean20 = random15.nextBoolean();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale12, random15);
        com.github.javafaker.Address address22 = faker21.address();
        java.lang.String str24 = faker21.numerify("Chinese");
        com.github.javafaker.DateAndTime dateAndTime25 = faker21.date();
        boolean boolean26 = locale0.equals((java.lang.Object) faker21);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6246292191371761d + "'", double16 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.09760425216810112d + "'", double19 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese" + "'", str24, "Chinese");
        org.junit.Assert.assertNotNull(dateAndTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.util.Random random1 = new java.util.Random((long) 1491051916);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = random1.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setRegion("anglais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: anglais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream7 = random5.doubles((long) 10);
        boolean boolean8 = random5.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category10);
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.lang.String str14 = locale13.getDisplayScript();
        java.lang.String str15 = locale13.getDisplayScript();
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.lang.String str21 = locale19.getExtension('x');
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = locale19.getDisplayLanguage(locale23);
        java.lang.String str25 = locale23.getDisplayVariant();
        java.lang.String str26 = locale13.getDisplayCountry(locale23);
        java.util.Locale.setDefault(category10, locale13);
        java.util.Locale locale31 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale31.getExtension('x');
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.lang.String str36 = locale31.getDisplayLanguage(locale35);
        java.lang.String str37 = locale31.getISO3Language();
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str43 = locale41.getExtension('x');
        java.util.Locale.setDefault(locale41);
        java.util.Locale locale45 = java.util.Locale.FRENCH;
        java.lang.String str46 = locale41.getDisplayLanguage(locale45);
        java.lang.String str47 = locale31.getDisplayVariant(locale41);
        boolean boolean48 = locale31.hasExtensions();
        java.util.Locale.setDefault(category10, locale31);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str51 = locale31.getDisplayName(locale50);
        java.util.Locale.setDefault(category0, locale31);
        java.lang.String str53 = locale31.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Japon" + "'", str26, "Japon");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", 0.0d);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        java.util.Locale locale8 = new java.util.Locale("", "zh-CN", "jpn_HI! (CHINESE (CHINA))");
        java.util.Locale locale12 = new java.util.Locale("_FR", "de", "zh,CN");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = locale8.getDisplayScript(locale12);
        boolean boolean16 = languageRange2.equals((java.lang.Object) locale12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertEquals(locale8.toString(), "_ZH-CN_jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals(locale12.toString(), "_fr_DE_zh,CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh,CN" + "'", str13, "zh,CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und-DE" + "'", str14, "und-DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder7.clear();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setLanguage("ja");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.util.Random random1 = new java.util.Random((long) 27);
        long long2 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (-1800157150), (double) (-1914897239), (double) (-767083982));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4947896108136290151L) + "'", long2 == (-4947896108136290151L));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Code code4 = faker0.code();
        com.github.javafaker.App app5 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.App app7 = faker0.app();
        java.lang.Class<?> wildcardClass8 = faker0.getClass();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.util.Locale locale1 = new java.util.Locale("JPN");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random(100L);
        double double4 = random3.nextGaussian();
        random3.setSeed((long) (-1157793070));
        double double7 = random3.nextGaussian();
        boolean boolean8 = random3.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Code code11 = faker10.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09760425216810112d + "'", double7 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder14 = builder12.setRegion("ja");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.util.Locale locale2 = new java.util.Locale("italien (Italie)", "gb__Englisch Kanada");
        org.junit.Assert.assertEquals(locale2.toString(), "italien (italie)_GB__ENGLISCH KANADA");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale9 = new java.util.Locale("de", "\u6cd5\u6587");
        java.lang.String str10 = locale3.getDisplayLanguage(locale9);
        java.lang.String str11 = locale3.getDisplayScript();
        java.lang.String str12 = locale3.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "und" + "'", str12, "und");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587", "\u4e2d\u56fd", "zh-TW");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u4e2d\u56fd_zh-TW");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.Class<?> wildcardClass7 = faker5.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.lang.String str14 = locale8.getDisplayVariant();
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category15, locale19);
        java.lang.String str22 = locale19.getExtension('x');
        java.lang.String str23 = locale19.getDisplayScript();
        java.lang.String str24 = locale19.getDisplayScript();
        java.lang.String str25 = locale19.getDisplayName();
        java.lang.String str26 = locale8.getDisplayLanguage(locale19);
        boolean boolean28 = locale19.equals((java.lang.Object) 0.26773185f);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese" + "'", str26, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random9.longs();
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream12 = random9.ints();
        int int13 = random9.nextInt();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale5, random9);
        java.lang.String str17 = faker15.numerify("French");
        com.github.javafaker.Business business18 = faker15.business();
        com.github.javafaker.Lorem lorem19 = faker15.lorem();
        java.lang.String str21 = faker15.bothify("Englisch (Kanada)");
        com.github.javafaker.Options options22 = faker15.options();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.32781136f + "'", float11 == 0.32781136f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 329950233 + "'", int13 == 329950233);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Englisch (Kanada)" + "'", str21, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(options22);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale.setDefault(locale7);
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.util.Locale locale2 = new java.util.Locale("und_FRA", "Undetermined");
        org.junit.Assert.assertEquals(locale2.toString(), "und_fra_UNDETERMINED");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        com.github.javafaker.Internet internet8 = faker6.internet();
        java.lang.String str10 = faker6.numerify("ja");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ja" + "'", str10, "ja");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.util.Locale locale3 = new java.util.Locale("de", "_FR", "fra (FRA,fr)");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder4.setVariant("");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale12 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str13 = locale9.getDisplayCountry(locale12);
        boolean boolean14 = locale3.equals((java.lang.Object) locale9);
        org.junit.Assert.assertEquals(locale3.toString(), "de__FR_fra (FRA,fr)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Code code3 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((-6274663997757565653L), 0.0d, (double) 0.6792973f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.lang.String str3 = locale2.getVariant();
        java.util.Random random5 = new java.util.Random(100L);
        double double6 = random5.nextGaussian();
        random5.setSeed((long) (-1157793070));
        double double9 = random5.nextGaussian();
        boolean boolean10 = random5.nextBoolean();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale2, random5);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Random random14 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream15 = random14.ints();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale2, random14);
        java.lang.String str19 = faker17.letterify("jpn");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09760425216810112d + "'", double9 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "jpn" + "'", str19, "jpn");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Set<java.lang.String> strSet14 = locale11.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und-a-chinese-u-china" + "'", str13, "und-a-chinese-u-china");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        int int7 = random1.nextInt();
        long long8 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1690734402) + "'", int7 == (-1690734402));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-6688467811848818630L) + "'", long8 == (-6688467811848818630L));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder11.setLanguage("French");
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.lang.String str26 = locale19.getDisplayVariant(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale27.getLanguage();
        java.lang.String str29 = locale23.getDisplayScript(locale27);
        java.lang.String str30 = locale18.getDisplayScript(locale23);
        java.util.Locale locale33 = new java.util.Locale("de", "FRA");
        java.lang.String str34 = locale23.getDisplayVariant(locale33);
        java.lang.String str35 = locale16.getDisplayVariant(locale23);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder36.setVariant("");
        java.util.Locale.Builder builder39 = builder36.clear();
        java.util.Locale.Builder builder41 = builder36.setScript("");
        java.util.Locale.Builder builder43 = builder41.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder46 = builder41.setExtension('u', "");
        java.util.Locale.Builder builder49 = builder46.setExtension('u', "");
        java.util.Locale locale50 = builder46.build();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder52 = builder46.setLocale(locale51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder55 = builder53.setVariant("");
        java.util.Locale.Builder builder57 = builder55.setVariant("");
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.lang.String str59 = locale58.getVariant();
        java.util.Locale.Builder builder60 = builder55.setLocale(locale58);
        java.lang.String str61 = locale51.getDisplayLanguage(locale58);
        java.lang.String str62 = locale51.getCountry();
        java.lang.String str63 = locale23.getDisplayName(locale51);
        java.util.Locale.Builder builder64 = builder0.setLocale(locale23);
        java.util.Locale.Builder builder66 = builder64.setLanguageTag("x-lvariant-JPN");
        java.util.Locale locale67 = builder64.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "french");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "french" + "'", str17, "french");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e2d\u6587" + "'", str61, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "TW" + "'", str62, "TW");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Number number5 = faker0.number();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale7.getVariant();
        java.util.Random random10 = new java.util.Random(100L);
        double double11 = random10.nextGaussian();
        random10.setSeed((long) (-1157793070));
        double double14 = random10.nextGaussian();
        boolean boolean15 = random10.nextBoolean();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale7, random10);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale21.getExtension('x');
        java.lang.String str24 = locale17.getDisplayName(locale21);
        java.lang.String str26 = locale17.getExtension('x');
        java.util.Locale locale28 = new java.util.Locale("fra");
        java.lang.String str29 = locale17.getDisplayScript(locale28);
        java.util.Locale locale30 = locale17.stripExtensions();
        java.lang.String str31 = locale7.getDisplayScript(locale30);
        java.lang.String str32 = locale7.getScript();
        java.util.Locale locale33 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        java.util.Locale locale38 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str39 = locale33.getDisplayName(locale38);
        java.util.Set<java.lang.Character> charSet40 = locale33.getExtensionKeys();
        java.lang.String str41 = locale7.getDisplayVariant(locale33);
        java.util.Set<java.lang.String> strSet42 = locale7.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet42);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6246292191371761d + "'", double11 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.09760425216810112d + "'", double14 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French" + "'", str24, "French");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals(locale28.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals(locale38.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "English (United Kingdom)" + "'", str39, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream6 = random1.ints((-1332689415), 0);
        java.util.stream.IntStream intStream7 = random1.ints();
        random1.setSeed((long) (-1176865220));
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale4.getDisplayCountry(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale4.getDisplayScript(locale21);
        java.lang.String str23 = locale21.getDisplayScript();
        java.util.Random random25 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale21, random25);
        java.util.Random random28 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream30 = random28.doubles((long) 10);
        int int31 = random28.nextInt();
        long long32 = random28.nextLong();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale21, random28);
        com.github.javafaker.Name name34 = faker33.name();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = faker33.resolve("UNDETERMINED");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1157793070) + "'", int31 == (-1157793070));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 8220501950349663546L + "'", long32 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(name34);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random9.longs();
        float float11 = random9.nextFloat();
        java.util.stream.IntStream intStream12 = random9.ints();
        int int13 = random9.nextInt();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale5, random9);
        java.lang.String str17 = faker15.numerify("French");
        com.github.javafaker.DateAndTime dateAndTime18 = faker15.date();
        java.lang.Class<?> wildcardClass19 = faker15.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.6160608f + "'", float11 == 0.6160608f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1377016274) + "'", int13 == (-1377016274));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.phoneNumber();
        com.github.javafaker.Book book5 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fr-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.util.Random random1 = new java.util.Random((long) (-217432450));
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Address address9 = faker5.address();
        com.github.javafaker.App app10 = faker5.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker5.resolve("FR");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder10 = builder0.addUnicodeLocaleAttribute("Chine");
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.util.Locale locale1 = new java.util.Locale("fra FRA,fr");
        org.junit.Assert.assertEquals(locale1.toString(), "fra fra,fr");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str15 = locale9.getDisplayName(locale14);
        java.util.Set<java.lang.Character> charSet16 = locale9.getExtensionKeys();
        java.util.Set<java.lang.String> strSet17 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale18 = locale9.stripExtensions();
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = locale18.getCountry();
        java.util.Locale.Builder builder21 = builder0.setLocale(locale18);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals(locale14.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English (United Kingdom)" + "'", str15, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GB" + "'", str20, "GB");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Random random3 = new java.util.Random((long) 0);
        int int5 = random3.nextInt((int) '4');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random3);
        double double7 = random3.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        int int12 = random3.nextInt(34);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8314409887870612d + "'", double7 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.util.Random random1 = new java.util.Random((long) 27);
        long long2 = random1.nextLong();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        long long4 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4947896108136290151L) + "'", long2 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5264020926839611059L) + "'", long4 == (-5264020926839611059L));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        double double2 = random0.nextDouble();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business4 = faker3.business();
        java.lang.String str6 = faker3.regexify("en-GB");
        com.github.javafaker.Name name7 = faker3.name();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30976009772386204d + "'", double2 == 0.30976009772386204d);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-GB" + "'", str6, "en-GB");
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        java.util.Random random3 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream5 = random3.doubles((long) 10);
        int int6 = random3.nextInt();
        java.util.stream.DoubleStream doubleStream7 = random3.doubles();
        java.util.stream.IntStream intStream8 = random3.ints();
        java.util.Random random10 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream12 = random10.doubles((long) 10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random10.nextBytes(byteArray16);
        random3.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet21 = faker20.internet();
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1157793070) + "'", int6 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[115, -43, 26]");
        org.junit.Assert.assertNotNull(internet21);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.util.Locale locale1 = new java.util.Locale("en_CA");
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = locale1.getDisplayCountry(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "en_ca");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.lang.Class<?> wildcardClass6 = locale2.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u6587\u82f1\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.util.Locale locale1 = new java.util.Locale("inglese");
        org.junit.Assert.assertEquals(locale1.toString(), "inglese");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese (China)");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.lang.String str9 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale6.getDisplayScript(locale10);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale6.getDisplayCountry(locale20);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale6.getDisplayScript(locale23);
        java.lang.String str25 = locale23.getDisplayScript();
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale1.getDisplayScript(locale23);
        java.lang.String str28 = locale1.getDisplayCountry();
        java.util.Random random30 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream31 = random30.ints();
        long long32 = random30.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale1, random30);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-4962768465676381896L) + "'", long32 == (-4962768465676381896L));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Internet internet6 = faker0.internet();
        java.lang.String str8 = faker0.regexify("");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale15 = java.util.Locale.getDefault(category10);
        java.util.Locale locale16 = java.util.Locale.getDefault(category10);
        java.util.Locale locale17 = java.util.Locale.getDefault(category10);
        java.util.Locale locale18 = java.util.Locale.getDefault(category10);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.util.Locale.setDefault(category19, locale20);
        java.util.Locale locale24 = java.util.Locale.getDefault(category19);
        java.util.Locale locale25 = java.util.Locale.getDefault(category19);
        java.util.Locale locale26 = java.util.Locale.getDefault(category19);
        java.util.Locale locale27 = java.util.Locale.getDefault(category19);
        java.util.Locale.setDefault(category10, locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault(category10);
        java.lang.String str30 = locale6.getDisplayName(locale29);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fran\347ais" + "'", str30, "fran\347ais");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', (long) (-572239868), (long) 'u');
        java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) 1894354479);
        int int12 = random1.nextInt();
        double double13 = random1.nextGaussian();
        float float14 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream18 = random1.longs((-2725924565570356499L), (long) 2044297607, (long) (-2065160384));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1690734402) + "'", int12 == (-1690734402));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.080920790428163d + "'", double13 == 2.080920790428163d);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.59754527f + "'", float14 == 0.59754527f);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setVariant("German");
        java.util.Locale.Builder builder12 = builder8.setRegion("");
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        java.lang.String str8 = locale7.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.util.Locale locale3 = new java.util.Locale("ita", "", "und");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale locale5 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "ita__und");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ita__und");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.util.Locale locale3 = new java.util.Locale("chinois", "", "ja");
        java.util.Locale locale4 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "chinois__ja");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "chinois__ja");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random(100L);
        double double4 = random3.nextGaussian();
        random3.setSeed((long) (-1157793070));
        double double7 = random3.nextGaussian();
        boolean boolean8 = random3.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.lang.String str17 = locale10.getDisplayName(locale14);
        java.lang.String str19 = locale10.getExtension('x');
        java.util.Locale locale21 = new java.util.Locale("fra");
        java.lang.String str22 = locale10.getDisplayScript(locale21);
        java.util.Locale locale23 = locale10.stripExtensions();
        java.lang.String str24 = locale0.getDisplayScript(locale23);
        java.lang.String str25 = locale23.getLanguage();
        boolean boolean26 = locale23.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09760425216810112d + "'", double7 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals(locale21.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fr" + "'", str25, "fr");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Address address7 = faker0.address();
        com.github.javafaker.Internet internet8 = faker0.internet();
        com.github.javafaker.Business business9 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.util.Locale locale3 = new java.util.Locale("Englisch (Kanada)", "Englisch (Kanada)", "Chinesisch (China)");
        org.junit.Assert.assertEquals(locale3.toString(), "englisch (kanada)_ENGLISCH (KANADA)_Chinesisch (China)");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setLanguageTag("hi! ITALIEN ITALIE,fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! ITALIEN ITALIE,fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.getDefault(category9);
        java.util.Locale locale17 = java.util.Locale.getDefault(category9);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale22 = locale19.stripExtensions();
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale22, random23);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Finance finance6 = faker0.finance();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.lang.String str11 = locale7.getDisplayScript();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Business business13 = faker12.business();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleKeys();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("fr", strMap14);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strSet17, filteringMode18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet21);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList24, strMap25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder30.setVariant("");
        java.util.Locale locale33 = builder30.build();
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str42 = locale37.getDisplayLanguage(locale41);
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Locale locale47 = new java.util.Locale("", "", "");
        java.util.Locale locale51 = new java.util.Locale("", "", "");
        java.lang.String str52 = locale47.getDisplayLanguage(locale51);
        java.util.Locale locale56 = new java.util.Locale("", "", "");
        java.lang.String str58 = locale56.getExtension('x');
        java.util.Locale.setDefault(locale56);
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.util.Locale locale62 = locale61.stripExtensions();
        java.lang.String str63 = locale62.getISO3Country();
        java.util.Locale locale67 = new java.util.Locale("", "", "");
        java.util.Locale locale71 = new java.util.Locale("", "", "");
        java.lang.String str72 = locale67.getDisplayLanguage(locale71);
        java.util.Locale locale74 = new java.util.Locale("hi!");
        java.util.Locale locale75 = locale74.stripExtensions();
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale locale79 = new java.util.Locale("hi!");
        java.util.Locale locale81 = new java.util.Locale("hi!");
        java.util.Locale locale82 = locale81.stripExtensions();
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale33, locale37, locale43, locale51, locale56, locale62, locale71, locale74, locale77, locale79, locale81 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale.FilteringMode filteringMode86 = null;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList84, filteringMode86);
        java.util.Locale locale88 = java.util.Locale.lookup(languageRangeList26, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale89 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet90 = locale89.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList26, (java.util.Collection<java.lang.String>) strSet90);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList91, filteringMode92);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet12, filteringMode92);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap95 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList96 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap95);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode18.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "hi!");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertEquals(locale81.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode92.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(languageRangeList96);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getScript();
        java.lang.String str6 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! (hi!)" + "'", str6, "hi! (hi!)");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.util.Locale locale3 = new java.util.Locale("italien (Italie)", "ITA", "zh_CN");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.lang.String str11 = locale9.getExtension('x');
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale9.getDisplayLanguage(locale13);
        java.lang.String str15 = locale9.getISO3Language();
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.lang.String str21 = locale19.getExtension('x');
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = locale19.getDisplayLanguage(locale23);
        java.lang.String str25 = locale9.getDisplayVariant(locale19);
        java.util.Locale locale26 = locale9.stripExtensions();
        java.lang.String str27 = locale26.getLanguage();
        java.lang.String str28 = locale26.getDisplayCountry();
        java.lang.String str29 = locale3.getDisplayVariant(locale26);
        java.lang.String str30 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "italien (italie)_ITA_zh_CN");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh,CN" + "'", str29, "zh,CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "x-lvariant-zh-CN" + "'", str30, "x-lvariant-zh-CN");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book7 = faker6.book();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.App app2 = faker0.app();
        java.lang.String str4 = faker0.bothify("und");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Korean", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("zh-TW");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale locale15 = builder12.build();
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str24 = locale19.getDisplayLanguage(locale23);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale29.getDisplayLanguage(locale33);
        java.util.Locale locale38 = new java.util.Locale("", "", "");
        java.lang.String str40 = locale38.getExtension('x');
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.util.Locale locale44 = locale43.stripExtensions();
        java.lang.String str45 = locale44.getISO3Country();
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.util.Locale locale53 = new java.util.Locale("", "", "");
        java.lang.String str54 = locale49.getDisplayLanguage(locale53);
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale61 = new java.util.Locale("hi!");
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale15, locale19, locale25, locale33, locale38, locale44, locale53, locale56, locale59, locale61, locale63 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale.FilteringMode filteringMode68 = null;
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList66, filteringMode68);
        java.util.Locale locale70 = java.util.Locale.lookup(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale locale72 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Locale locale73 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap74);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertNotNull(languageRangeList75);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        java.lang.String str8 = faker0.bothify("France");
        java.lang.String str10 = faker0.letterify("china");
        java.lang.String str12 = faker0.bothify("hi! (hi!)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "china" + "'", str10, "china");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! (hi!)" + "'", str12, "hi! (hi!)");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Code code3 = faker0.code();
        java.lang.String str5 = faker0.letterify("Englisch (Kanada)");
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Englisch (Kanada)" + "'", str5, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setVariant("deu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: deu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.util.Random random1 = new java.util.Random((long) 190001823);
        java.util.stream.IntStream intStream3 = random1.ints((long) 1894354479);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-tw_CHINE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getScript();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }
}
