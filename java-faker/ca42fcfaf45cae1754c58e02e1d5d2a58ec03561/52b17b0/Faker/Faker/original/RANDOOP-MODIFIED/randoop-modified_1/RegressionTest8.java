import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options4 = faker3.options();
        com.github.javafaker.Internet internet5 = faker3.internet();
        com.github.javafaker.Address address6 = faker3.address();
        java.lang.String str8 = faker3.bothify("italien (Italie)");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italien (Italie)" + "'", str8, "italien (Italie)");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        java.lang.Object obj85 = null; // flaky: locale83.clone();
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
// flaky:         org.junit.Assert.assertNotNull(obj85);
// flaky:         org.junit.Assert.assertEquals(obj85.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj85), "fr");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "fr");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.util.Random random1 = new java.util.Random((long) (-1800157150));
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints(1557051528, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8665371f + "'", float2 == 0.8665371f);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        java.lang.String str55 = locale42.getVariant();
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
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category10, locale14);
        java.util.Locale.Builder builder16 = builder9.setLocale(locale14);
        java.lang.String str17 = locale5.getDisplayCountry(locale14);
        java.util.Set<java.lang.String> strSet18 = locale14.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        long long5 = random0.nextLong();
        int int6 = random0.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7332320983998514589L + "'", long5 == 7332320983998514589L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1354632253 + "'", int6 == 1354632253);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale1.getDisplayName(locale8);
        java.util.Locale locale12 = new java.util.Locale("zh-cn", "JPN");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale1.getDisplayCountry(locale12);
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale12.toString(), "zh-cn_JPN");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.IntStream intStream4 = random1.ints((long) 736765878);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.util.Locale locale2 = new java.util.Locale("de", "Japan");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getExtension('x');
        java.util.Locale locale7 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale3);
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_JAPAN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JAPAN" + "'", str9, "JAPAN");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Options options9 = faker0.options();
        java.lang.String str11 = faker0.letterify("ko");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ko" + "'", str11, "ko");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getCountry();
        java.util.Random random3 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream5 = random3.doubles((long) 10);
        int int6 = random3.nextInt();
        java.util.stream.DoubleStream doubleStream7 = random3.doubles();
        double double8 = random3.nextGaussian();
        int int9 = random3.nextInt();
        double double10 = random3.nextDouble();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random3.doubles((long) (-894135949), (double) 1053970733, (double) 1491051916);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1157793070) + "'", int6 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.3325983427023256d) + "'", double8 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1408064384) + "'", int9 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.24411725056425315d + "'", double10 == 0.24411725056425315d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.util.Locale locale3 = new java.util.Locale("FRA", "FRA", "fr");
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.util.Random random15 = new java.util.Random();
        java.util.stream.LongStream longStream16 = random15.longs();
        float float17 = random15.nextFloat();
        java.util.stream.IntStream intStream18 = random15.ints();
        int int19 = random15.nextInt();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale14, random15);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale11, random15);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random15);
        java.lang.String str24 = faker22.bothify("it");
        com.github.javafaker.Address address25 = faker22.address();
        java.lang.String str27 = faker22.regexify("en-gb (ZH-TW)");
        boolean boolean28 = locale3.equals((java.lang.Object) "en-gb (ZH-TW)");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_FRA_fr");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra (FRA,fr)" + "'", str4, "fra (FRA,fr)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.9737166f + "'", float17 == 0.9737166f);
        org.junit.Assert.assertNotNull(intStream18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-14957691) + "'", int19 == (-14957691));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "it" + "'", str24, "it");
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-gb ZH-TW" + "'", str27, "en-gb ZH-TW");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.util.Locale locale1 = new java.util.Locale("\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale2.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale2.getDisplayVariant(locale9);
        java.lang.String str11 = locale1.getDisplayVariant(locale9);
        java.lang.String str12 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-TW" + "'", str3, "zh-TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TWN" + "'", str4, "TWN");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)" + "'", str12, "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream8 = random0.ints(100L, (int) (byte) -1, (int) ' ');
        boolean boolean9 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((long) '#', (double) 0.14342493f, (double) 6);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5786487f + "'", float2 == 0.5786487f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.util.Random random1 = new java.util.Random((long) 27);
        long long2 = random1.nextLong();
        int int4 = random1.nextInt(33);
        long long5 = random1.nextLong();
        java.util.stream.IntStream intStream8 = random1.ints(795965107, 1947844456);
        java.util.stream.IntStream intStream12 = random1.ints((long) 3, (-364391464), 443638859);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4947896108136290151L) + "'", long2 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7314023144807116478L + "'", long5 == 7314023144807116478L);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        java.lang.String str10 = faker5.letterify("cinese (Cina)");
        com.github.javafaker.Code code11 = faker5.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cinese (Cina)" + "'", str10, "cinese (Cina)");
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-cn" + "'", str4, "zh-cn");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-cn" + "'", str5, "zh-cn");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = locale7.getDisplayVariant();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Random random12 = new java.util.Random();
        java.util.stream.LongStream longStream13 = random12.longs();
        java.util.stream.LongStream longStream15 = random12.longs(0L);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale11, random12);
        java.lang.String str17 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale18 = locale7.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension('#', "TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream3 = random0.longs(0L);
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 1);
        float float6 = random0.nextFloat();
        double double7 = random0.nextGaussian();
        java.util.stream.IntStream intStream8 = random0.ints();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.15910548f + "'", float6 == 0.15910548f);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.046024731872221586d + "'", double7 == 0.046024731872221586d);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("japan");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        com.github.javafaker.Address address8 = faker0.address();
        com.github.javafaker.Lorem lorem9 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "italien");
        java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("french");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.util.Locale locale2 = new java.util.Locale("Japon", "fra (FRA,fr)");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale7.getDisplayScript(locale11);
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale17.getExtension('x');
        java.util.Locale.setDefault(locale17);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale17.getDisplayLanguage(locale21);
        java.lang.String str23 = locale7.getDisplayCountry(locale21);
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale7.getDisplayScript(locale24);
        java.lang.String str26 = locale24.getISO3Country();
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = locale27.getDisplayScript();
        java.lang.String str30 = locale27.getVariant();
        java.lang.String str31 = locale27.getISO3Language();
        java.lang.String str32 = locale24.getDisplayName(locale27);
        java.util.Set<java.lang.Character> charSet33 = locale27.getExtensionKeys();
        java.util.Locale locale34 = locale27.stripExtensions();
        java.lang.String str35 = locale2.getDisplayCountry(locale34);
        java.util.Set<java.lang.String> strSet36 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "japon_FRA (FRA,FR)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "jpn" + "'", str31, "jpn");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u82f1\u8a9e" + "'", str32, "\u82f1\u8a9e");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "FRA (FRA,FR)" + "'", str35, "FRA (FRA,FR)");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale7 = new java.util.Locale("English United Kingdom", "zh-CN", "JPN");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale0.getDisplayVariant(locale11);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale11);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals(locale7.toString(), "english united kingdom_ZH-CN_JPN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JPN" + "'", str8, "JPN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", (double) (-1590961789));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.590961789E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.util.Locale locale3 = new java.util.Locale("us_ZH-CN (JPN)", "", "\u82f1\u6587");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.util.Random random1 = new java.util.Random((-4962768465676381896L));
        java.util.Random random3 = new java.util.Random(1L);
        java.util.Random random5 = new java.util.Random((long) (short) 1);
        java.util.Random random7 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream9 = random7.doubles((long) 10);
        int int10 = random7.nextInt();
        java.util.stream.DoubleStream doubleStream11 = random7.doubles();
        java.util.stream.IntStream intStream12 = random7.ints();
        java.util.Random random14 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream16 = random14.doubles((long) 10);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random14.nextBytes(byteArray20);
        random7.nextBytes(byteArray20);
        random5.nextBytes(byteArray20);
        random3.nextBytes(byteArray20);
        random1.nextBytes(byteArray20);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1157793070) + "'", int10 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-15, 83, -84]");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.util.Locale locale3 = new java.util.Locale("CA", "hi!__hi!", "Twi");
        org.junit.Assert.assertEquals(locale3.toString(), "ca_HI!__HI!_Twi");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        java.lang.Object obj17 = locale15.clone();
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
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "zh_TW");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.util.Locale locale3 = new java.util.Locale("en-gb", "fr-FR", "");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "en-gb_FR-FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-gb (FR-FR)" + "'", str4, "en-gb (FR-FR)");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("french");
        java.util.Collection<java.lang.String> strCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = java.util.Locale.filterTags(languageRangeList1, strCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.Random random4 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) (byte) -1, (long) 190001823);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.LongStream longStream11 = random10.longs();
        java.util.stream.LongStream longStream13 = random10.longs(0L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        java.util.Random random16 = new java.util.Random(100L);
        java.util.stream.LongStream longStream18 = random16.longs((long) (short) 0);
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        int int23 = random20.nextInt();
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        java.util.stream.IntStream intStream25 = random20.ints();
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) 10);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random27.nextBytes(byteArray33);
        random20.nextBytes(byteArray33);
        random16.nextBytes(byteArray33);
        random10.nextBytes(byteArray33);
        random4.nextBytes(byteArray33);
        int int39 = random4.nextInt();
        java.util.Random random41 = new java.util.Random((long) (-1900217354));
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.util.Random random43 = new java.util.Random();
        java.util.stream.LongStream longStream44 = random43.longs();
        java.util.stream.LongStream longStream46 = random43.longs(0L);
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(locale42, random43);
        java.util.Random random49 = new java.util.Random(100L);
        java.util.stream.LongStream longStream51 = random49.longs((long) (short) 0);
        java.util.Random random53 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream55 = random53.doubles((long) 10);
        int int56 = random53.nextInt();
        java.util.stream.DoubleStream doubleStream57 = random53.doubles();
        java.util.stream.IntStream intStream58 = random53.ints();
        java.util.Random random60 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream62 = random60.doubles((long) 10);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random60.nextBytes(byteArray66);
        random53.nextBytes(byteArray66);
        random49.nextBytes(byteArray66);
        random43.nextBytes(byteArray66);
        random41.nextBytes(byteArray66);
        random4.nextBytes(byteArray66);
        random1.nextBytes(byteArray66);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[96, -76, 32]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-723955400) + "'", int39 == (-723955400));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream44);
        org.junit.Assert.assertNotNull(longStream46);
        org.junit.Assert.assertNotNull(longStream51);
        org.junit.Assert.assertNotNull(doubleStream55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1157793070) + "'", int56 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream57);
        org.junit.Assert.assertNotNull(intStream58);
        org.junit.Assert.assertNotNull(doubleStream62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-46, 122, -3]");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.util.Locale locale3 = new java.util.Locale("", "zh-CN", "jpn_HI! (CHINESE (CHINA))");
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale10.getDisplayScript(locale14);
        java.lang.String str17 = locale5.getDisplayCountry(locale10);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder18.setVariant("");
        java.util.Locale.Builder builder21 = builder18.clear();
        java.util.Locale locale22 = builder21.build();
        java.lang.String str23 = locale22.getCountry();
        java.lang.String str24 = locale5.getDisplayLanguage(locale22);
        java.lang.String str25 = locale5.getDisplayName();
        java.util.Random random26 = new java.util.Random();
        java.util.stream.LongStream longStream27 = random26.longs();
        float float28 = random26.nextFloat();
        java.util.stream.IntStream intStream29 = random26.ints();
        java.util.stream.LongStream longStream33 = random26.longs((long) '#', (long) (byte) 1, (long) 100);
        random26.setSeed((long) 591553211);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale5, random26);
        java.util.Set<java.lang.String> strSet37 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.lang.String str40 = locale38.getDisplayName(locale39);
        java.lang.String str41 = locale39.getDisplayCountry();
        java.util.Locale.Category category42 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet45 = locale43.getExtensionKeys();
        java.util.Locale.setDefault(category42, locale43);
        java.util.Locale locale47 = java.util.Locale.getDefault(category42);
        java.lang.String str49 = locale47.getExtension('a');
        java.lang.String str50 = locale47.getCountry();
        java.lang.String str51 = locale39.getDisplayCountry(locale47);
        java.lang.String str52 = locale5.getDisplayName(locale47);
        java.lang.String str53 = locale3.getDisplayCountry(locale47);
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code55 = faker54.code();
        com.github.javafaker.Book book56 = faker54.book();
        com.github.javafaker.Hacker hacker57 = faker54.hacker();
        java.lang.String str59 = faker54.letterify("fr");
        com.github.javafaker.PhoneNumber phoneNumber60 = faker54.phoneNumber();
        com.github.javafaker.Business business61 = faker54.business();
        com.github.javafaker.Company company62 = faker54.company();
        com.github.javafaker.Internet internet63 = faker54.internet();
        boolean boolean64 = locale3.equals((java.lang.Object) faker54);
        org.junit.Assert.assertEquals(locale3.toString(), "_ZH-CN_jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn_HI! (CHINESE (CHINA))" + "'", str4, "jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese" + "'", str24, "Chinese");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "cinese (Cina)" + "'", str25, "cinese (Cina)");
        org.junit.Assert.assertNotNull(longStream27);
// flaky:         org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.55170125f + "'", float28 == 0.55170125f);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(longStream33);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Englisch (Kanada)" + "'", str40, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.FORMAT + "'", category42.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "chinois (Chine)" + "'", str52, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ZH-CN" + "'", str53, "ZH-CN");
        org.junit.Assert.assertNotNull(code55);
        org.junit.Assert.assertNotNull(book56);
        org.junit.Assert.assertNotNull(hacker57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "fr" + "'", str59, "fr");
        org.junit.Assert.assertNotNull(phoneNumber60);
        org.junit.Assert.assertNotNull(business61);
        org.junit.Assert.assertNotNull(company62);
        org.junit.Assert.assertNotNull(internet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh,CN", (double) 0.9636359f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh,cn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("GB");
        java.util.Random random3 = new java.util.Random(100L);
        java.util.stream.LongStream longStream5 = random3.longs((long) (short) 0);
        random3.setSeed((long) 'x');
        java.util.stream.LongStream longStream11 = random3.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random3);
        java.util.stream.LongStream longStream14 = random3.longs(0L);
        java.util.stream.IntStream intStream16 = random3.ints(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: gb could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "gb");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("French");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.LongStream longStream9 = random0.longs((long) 1358566768, (long) (-1690734402), (long) (-1279776254));
        boolean boolean10 = random0.nextBoolean();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book12 = faker11.book();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u56fd)", "cinese (Cina)", "GBR");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd)_CINESE (CINA)_GBR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GBR" + "'", str4, "GBR");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder11 = builder8.setExtension('x', "Italian");
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder8.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u6587");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587" + "'", str2, "\u6cd5\u6587");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.util.Locale locale3 = new java.util.Locale("\u97d3\u6587", "\u82f1\u6587\u82f1\u56fd)", "italien (Italie)");
        boolean boolean4 = locale3.hasExtensions();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u6587\u82f1\u6587\u82f1\u56fd)_italien (Italie)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.util.Locale locale2 = new java.util.Locale("_FR", "hi!");
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "_fr_HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_fr" + "'", str3, "_fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_fr (HI!)" + "'", str4, "_fr (HI!)");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 0.03924471f);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder6.setScript("");
        java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder16 = builder11.setExtension('a', "Chinese");
        java.util.Locale locale17 = builder11.build();
        java.util.Locale.Builder builder18 = builder11.clear();
        java.util.Locale.Builder builder20 = builder11.setVariant("Japon");
        boolean boolean21 = languageRange2.equals((java.lang.Object) builder11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03924471139907837d + "'", double4 == 0.03924471139907837d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.Lorem lorem7 = faker5.lorem();
        com.github.javafaker.Finance finance8 = faker5.finance();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker5.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.util.Locale locale3 = new java.util.Locale("English (United Kingdom)", "italien Italie", "de");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.util.Locale.setDefault(category4, locale12);
        java.util.Locale locale19 = new java.util.Locale("FRA", "China", "zh_CN");
        java.util.Locale.setDefault(category4, locale19);
        boolean boolean21 = locale3.equals((java.lang.Object) locale19);
        org.junit.Assert.assertEquals(locale3.toString(), "english (united kingdom)_ITALIEN ITALIE_de");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale19.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.util.Locale locale2 = new java.util.Locale("FRA", "und-Chinese");
        org.junit.Assert.assertEquals(locale2.toString(), "fra_UND-CHINESE");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: HI! [at index 0]");
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
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale locale6 = builder0.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.util.Locale locale3 = new java.util.Locale("und-DE", "Italian", "Chinese (China)");
        java.util.Locale locale5 = new java.util.Locale("Korean (South Korea)");
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale3.getDisplayName(locale5);
        java.lang.Object obj8 = locale5.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "und-de_ITALIAN_Chinese (China)");
        org.junit.Assert.assertEquals(locale5.toString(), "korean (south korea)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und-de (ITALIAN,Chinese (China))" + "'", str7, "und-de (ITALIAN,Chinese (China))");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "korean (south korea)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "korean (south korea)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "korean (south korea)");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder12 = builder8.setRegion("TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder8.setRegion("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: China [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        java.util.Locale locale12 = new java.util.Locale("zh-cn", "JPN");
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale6.getDisplayScript();
        java.lang.String str15 = locale6.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "zh-cn_JPN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        java.util.Set<java.lang.String> strSet24 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale21.toLanguageTag();
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
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 0.56643444f);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deu" + "'", str3, "deu");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.util.Locale locale36 = new java.util.Locale("FRA", "FRA", "fr");
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.lang.String str38 = locale36.getDisplayName(locale37);
        java.util.Locale.setDefault(category0, locale36);
        java.lang.String str40 = locale36.toString();
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
        org.junit.Assert.assertEquals(locale36.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fra (FRA,fr)" + "'", str38, "fra (FRA,fr)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "fra_FRA_fr" + "'", str40, "fra_FRA_fr");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien Italie", (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.Random random4 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) (byte) -1, (long) 190001823);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.LongStream longStream11 = random10.longs();
        java.util.stream.LongStream longStream13 = random10.longs(0L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        java.util.Random random16 = new java.util.Random(100L);
        java.util.stream.LongStream longStream18 = random16.longs((long) (short) 0);
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        int int23 = random20.nextInt();
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        java.util.stream.IntStream intStream25 = random20.ints();
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) 10);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random27.nextBytes(byteArray33);
        random20.nextBytes(byteArray33);
        random16.nextBytes(byteArray33);
        random10.nextBytes(byteArray33);
        random4.nextBytes(byteArray33);
        int int39 = random4.nextInt();
        java.util.Random random41 = new java.util.Random((long) (-1900217354));
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.util.Random random43 = new java.util.Random();
        java.util.stream.LongStream longStream44 = random43.longs();
        java.util.stream.LongStream longStream46 = random43.longs(0L);
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(locale42, random43);
        java.util.Random random49 = new java.util.Random(100L);
        java.util.stream.LongStream longStream51 = random49.longs((long) (short) 0);
        java.util.Random random53 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream55 = random53.doubles((long) 10);
        int int56 = random53.nextInt();
        java.util.stream.DoubleStream doubleStream57 = random53.doubles();
        java.util.stream.IntStream intStream58 = random53.ints();
        java.util.Random random60 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream62 = random60.doubles((long) 10);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random60.nextBytes(byteArray66);
        random53.nextBytes(byteArray66);
        random49.nextBytes(byteArray66);
        random43.nextBytes(byteArray66);
        random41.nextBytes(byteArray66);
        random4.nextBytes(byteArray66);
        random1.nextBytes(byteArray66);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[96, -76, 32]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-723955400) + "'", int39 == (-723955400));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream44);
        org.junit.Assert.assertNotNull(longStream46);
        org.junit.Assert.assertNotNull(longStream51);
        org.junit.Assert.assertNotNull(doubleStream55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1157793070) + "'", int56 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream57);
        org.junit.Assert.assertNotNull(intStream58);
        org.junit.Assert.assertNotNull(doubleStream62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[115, -43, 26]");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Random random4 = new java.util.Random(100L);
        java.util.stream.LongStream longStream6 = random4.longs((long) (short) 0);
        random4.setSeed((long) 'x');
        java.util.stream.LongStream longStream12 = random4.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random4);
        java.util.stream.LongStream longStream15 = random4.longs(0L);
        java.util.stream.IntStream intStream17 = random4.ints(0L);
        java.util.stream.DoubleStream doubleStream21 = random4.doubles(3484186600379647945L, (double) (-1742583156), (double) 0.6744004f);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale0, random4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.util.Locale locale3 = new java.util.Locale("", "zh-CN", "fr");
        java.util.Locale locale7 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.util.Locale.setDefault(locale7);
        java.lang.String str10 = locale7.getScript();
        java.lang.String str11 = locale3.getDisplayScript(locale7);
        java.util.Set<java.lang.Character> charSet12 = locale7.getExtensionKeys();
        java.lang.String str13 = locale7.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "_ZH-CN_fr");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und" + "'", str13, "und");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setVariant("French");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.util.Random random1 = new java.util.Random((long) (-1641365002));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 1463422709, 0.26488679955459327d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("FRA", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.lang.String[] strArray51 = new java.lang.String[] { "Chinese", "x-lvariant-JPN", "Chine", "zho", "JPN", "TW", "Chinese", "zh", "und", "chinese", "eng", "German", "French", "\u4e2d\u6587\u4e2d\u56fd)", "Chinese (China)", "\u4e2d\u6587\u4e2d\u56fd)", "GB", "us", "\u6cd5\u56fd", "US", "\u4e2d\u6587", "it", "English United Kingdom", "\u4e2d\u56fd", "", "ENGLISH", "Korean", "ja_JP", "zh_CN", "Italian", "China", "x-lvariant-JPN", "Korean (South Korea)", "chinese (china)", "\u97d3\u6587", "China", "und", "ja-JP", "zho", "zh-CN", "zh_CN", "Chine", "France" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strList52);
        java.lang.String str55 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap56);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "italian" + "'", str55, "italian");
        org.junit.Assert.assertNotNull(languageRangeList57);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("und");
        java.lang.String str9 = locale7.getExtension('u');
        java.lang.String str10 = locale0.getDisplayScript(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale11.getDisplayName();
        java.lang.String str14 = locale11.getDisplayCountry();
        java.lang.String str15 = locale11.getLanguage();
        java.util.Random random17 = new java.util.Random((long) 32);
        java.util.Random random18 = new java.util.Random();
        java.util.stream.LongStream longStream21 = random18.longs((long) (-1), (long) (short) 10);
        int int22 = random18.nextInt();
        double double23 = random18.nextGaussian();
        java.util.Random random25 = new java.util.Random((long) 1);
        java.util.Random random27 = new java.util.Random((long) (short) 1);
        int int28 = random27.nextInt();
        java.util.stream.LongStream longStream32 = random27.longs(10L, 0L, (long) (short) 100);
        java.util.Random random34 = new java.util.Random(1L);
        java.util.Random random36 = new java.util.Random((long) (short) 1);
        java.util.Random random38 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream40 = random38.doubles((long) 10);
        int int41 = random38.nextInt();
        java.util.stream.DoubleStream doubleStream42 = random38.doubles();
        java.util.stream.IntStream intStream43 = random38.ints();
        java.util.Random random45 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream47 = random45.doubles((long) 10);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random45.nextBytes(byteArray51);
        random38.nextBytes(byteArray51);
        random36.nextBytes(byteArray51);
        random34.nextBytes(byteArray51);
        random27.nextBytes(byteArray51);
        random25.nextBytes(byteArray51);
        random18.nextBytes(byteArray51);
        random17.nextBytes(byteArray51);
        com.github.javafaker.Faker faker60 = new com.github.javafaker.Faker(locale11, random17);
        java.lang.String str61 = locale0.getDisplayScript(locale11);
        java.util.Random random63 = new java.util.Random((long) 0);
        random63.setSeed((long) (byte) 100);
        java.util.stream.DoubleStream doubleStream66 = random63.doubles();
        java.util.stream.IntStream intStream70 = random63.ints(1397386546144374610L, 14, 1991855488);
        long long71 = random63.nextLong();
        java.util.stream.DoubleStream doubleStream74 = random63.doubles((double) 0.023669124f, (double) 1552812408);
        com.github.javafaker.Faker faker75 = new com.github.javafaker.Faker(locale11, random63);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale7.toString(), "und");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French" + "'", str13, "French");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertNotNull(longStream21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 222208614 + "'", int22 == 222208614);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5654398423813509d + "'", double23 == 0.5654398423813509d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1155869325) + "'", int28 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream32);
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1157793070) + "'", int41 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream42);
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(doubleStream47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-61, -42, 100]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(doubleStream66);
        org.junit.Assert.assertNotNull(intStream70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-5128016860359238732L) + "'", long71 == (-5128016860359238732L));
        org.junit.Assert.assertNotNull(doubleStream74);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Address address6 = faker0.address();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        java.lang.String str25 = locale22.getDisplayName();
        java.lang.String str27 = locale22.getExtension('a');
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "French" + "'", str25, "French");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream8 = random7.longs();
        java.util.stream.LongStream longStream10 = random7.longs(0L);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale6, random7);
        java.lang.String str12 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder13 = builder5.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        java.lang.Object obj20 = locale8.clone();
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "it");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale locale5 = new java.util.Locale("und");
        java.lang.String str7 = locale5.getExtension('u');
        java.lang.Object obj8 = locale5.clone();
        boolean boolean9 = languageRange2.equals((java.lang.Object) locale5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals(locale5.toString(), "und");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "und");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "und");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "und");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        long long16 = random15.nextLong();
        java.util.stream.LongStream longStream18 = random15.longs((long) (short) 1);
        int int19 = random15.nextInt();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random15);
        java.lang.Object obj21 = locale0.clone();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4972683369271453960L) + "'", long16 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107254586 + "'", int19 == 1107254586);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "ja_JP");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean6 = random1.nextBoolean();
        long long7 = random1.nextLong();
        long long8 = random1.nextLong();
        int int9 = random1.nextInt();
        int int11 = random1.nextInt((int) 'a');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7565764793372639993L + "'", long7 == 7565764793372639993L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1595801860587364354L) + "'", long8 == (-1595801860587364354L));
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-735278389) + "'", int9 == (-735278389));
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("und-Chinese");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.util.Locale locale1 = new java.util.Locale("ENG");
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CAN", (double) 0.80456084f);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.lang.String[] strArray48 = new java.lang.String[] { "Chinese", "x-lvariant-JPN", "Chine", "zho", "JPN", "TW", "Chinese", "zh", "und", "chinese", "eng", "German", "French", "\u4e2d\u6587\u4e2d\u56fd)", "Chinese (China)", "\u4e2d\u6587\u4e2d\u56fd)", "GB", "us", "\u6cd5\u56fd", "US", "\u4e2d\u6587", "it", "English United Kingdom", "\u4e2d\u56fd", "", "ENGLISH", "Korean", "ja_JP", "zh_CN", "Italian", "China", "x-lvariant-JPN", "Korean (South Korea)", "chinese (china)", "\u97d3\u6587", "China", "und", "ja-JP", "zho", "zh-CN", "zh_CN", "Chine", "France" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap52);
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet56 = locale54.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags(languageRangeList53, (java.util.Collection<java.lang.String>) strSet56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList53, strMap58);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeList59);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        java.util.Random random1 = new java.util.Random((long) (-1416232043));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.lang.String str6 = faker4.letterify("_FR");
        com.github.javafaker.Number number7 = faker4.number();
        com.github.javafaker.DateAndTime dateAndTime8 = faker4.date();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_FR" + "'", str6, "_FR");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("anglais");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strSet9);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale locale19 = builder16.build();
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str28 = locale23.getDisplayLanguage(locale27);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.lang.String str38 = locale33.getDisplayLanguage(locale37);
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.lang.String str44 = locale42.getExtension('x');
        java.util.Locale.setDefault(locale42);
        java.util.Locale locale47 = new java.util.Locale("hi!");
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = locale48.getISO3Country();
        java.util.Locale locale53 = new java.util.Locale("", "", "");
        java.util.Locale locale57 = new java.util.Locale("", "", "");
        java.lang.String str58 = locale53.getDisplayLanguage(locale57);
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.util.Locale locale61 = locale60.stripExtensions();
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.util.Locale locale65 = new java.util.Locale("hi!");
        java.util.Locale locale67 = new java.util.Locale("hi!");
        java.util.Locale locale68 = locale67.stripExtensions();
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale19, locale23, locale29, locale37, locale42, locale48, locale57, locale60, locale63, locale65, locale67 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale.FilteringMode filteringMode72 = null;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList70, filteringMode72);
        java.util.Locale locale74 = java.util.Locale.lookup(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Locale locale76 = java.util.Locale.lookup(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Locale locale77 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList70);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertNotNull(localeList75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertNull(locale77);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Japan", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("fr", strMap4);
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strSet7, filteringMode8);
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.lang.String str12 = java.util.Locale.lookupTag(languageRangeList5, (java.util.Collection<java.lang.String>) strSet11);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList14, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setVariant("");
        java.util.Locale locale23 = builder20.build();
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.util.Locale locale31 = new java.util.Locale("", "", "");
        java.lang.String str32 = locale27.getDisplayLanguage(locale31);
        java.util.Locale locale33 = java.util.Locale.FRENCH;
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.lang.String str42 = locale37.getDisplayLanguage(locale41);
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.lang.String str48 = locale46.getExtension('x');
        java.util.Locale.setDefault(locale46);
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.util.Locale locale52 = locale51.stripExtensions();
        java.lang.String str53 = locale52.getISO3Country();
        java.util.Locale locale57 = new java.util.Locale("", "", "");
        java.util.Locale locale61 = new java.util.Locale("", "", "");
        java.lang.String str62 = locale57.getDisplayLanguage(locale61);
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale locale65 = locale64.stripExtensions();
        java.util.Locale locale67 = new java.util.Locale("hi!");
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.util.Locale locale72 = locale71.stripExtensions();
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale23, locale27, locale33, locale41, locale46, locale52, locale61, locale64, locale67, locale69, locale71 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale.FilteringMode filteringMode76 = null;
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList74, filteringMode76);
        java.util.Locale locale78 = java.util.Locale.lookup(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale locale79 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList16, (java.util.Collection<java.lang.String>) strSet80);
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strList81, filteringMode82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList83);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode82.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Color color5 = faker0.color();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("hi! ITALIEN ITALIE,fr");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setExtension('4', "en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.util.Locale locale2 = new java.util.Locale("", "chinese china");
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "_CHINESE CHINA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHINESE CHINA" + "'", str3, "CHINESE CHINA");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.util.Random random1 = new java.util.Random((long) 1233943240);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Korean", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u56fd", "hi! (ITALIEN (ITALIE),fr)");
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd_HI! (ITALIEN (ITALIE),FR)");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        java.lang.String str36 = faker33.bothify("German");
        com.github.javafaker.Book book37 = faker33.book();
        com.github.javafaker.Company company38 = faker33.company();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "German" + "'", str36, "German");
        org.junit.Assert.assertNotNull(book37);
        org.junit.Assert.assertNotNull(company38);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.lang.String str10 = locale7.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        java.util.Locale locale12 = new java.util.Locale("zh-cn", "JPN");
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "zh-cn_JPN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream8 = random7.longs();
        float float9 = random7.nextFloat();
        double double10 = random7.nextGaussian();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random7);
        java.lang.String str13 = faker11.letterify("gbr");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.662162f + "'", float3 == 0.662162f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-377370363) + "'", int5 == (-377370363));
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25785822f + "'", float9 == 0.25785822f);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.042243328714022d + "'", double10 == 0.042243328714022d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gbr" + "'", str13, "gbr");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.regexify("eng");
        java.lang.String str10 = faker5.regexify("Japan");
        com.github.javafaker.Finance finance11 = faker5.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Japan" + "'", str10, "Japan");
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        java.util.Locale locale36 = new java.util.Locale("FRA", "FRA", "fr");
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.lang.String str38 = locale36.getDisplayName(locale37);
        java.util.Locale.setDefault(category0, locale36);
        java.util.Locale locale40 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.setVariant("");
        java.util.Locale.Builder builder44 = builder41.clear();
        java.util.Locale.Builder builder46 = builder41.setScript("");
        java.util.Locale.Builder builder48 = builder46.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder51 = builder46.setExtension('a', "Chinese");
        java.util.Locale.Builder builder53 = builder51.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale54 = builder53.build();
        java.util.Locale locale58 = new java.util.Locale("", "", "");
        java.lang.String str60 = locale58.getExtension('x');
        java.util.Locale.setDefault(locale58);
        java.util.Locale locale62 = java.util.Locale.FRENCH;
        java.lang.String str63 = locale58.getDisplayLanguage(locale62);
        boolean boolean64 = locale62.hasExtensions();
        java.lang.String str65 = locale62.getDisplayVariant();
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.util.Random random67 = new java.util.Random();
        java.util.stream.LongStream longStream68 = random67.longs();
        java.util.stream.LongStream longStream70 = random67.longs(0L);
        com.github.javafaker.Faker faker71 = new com.github.javafaker.Faker(locale66, random67);
        java.lang.String str72 = locale62.getDisplayVariant(locale66);
        java.lang.String str73 = locale54.getDisplayLanguage(locale62);
        java.util.Locale.setDefault(category0, locale62);
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
        org.junit.Assert.assertEquals(locale36.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fra (FRA,fr)" + "'", str38, "fra (FRA,fr)");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream68);
        org.junit.Assert.assertNotNull(longStream70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        java.util.stream.IntStream intStream27 = random18.ints((-1072555495), 905585588);
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
        org.junit.Assert.assertNotNull(intStream27);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale0.getDisplayScript(locale7);
        boolean boolean9 = locale7.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.4174567f + "'", float3 == 0.4174567f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-708078968) + "'", int5 == (-708078968));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.util.Locale locale2 = new java.util.Locale("en-gb (ZH-TW)", "und-DE");
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale12 = new java.util.Locale("de", "\u6cd5\u6587");
        java.lang.String str13 = locale6.getDisplayLanguage(locale12);
        java.lang.String str14 = locale6.getDisplayScript();
        java.lang.String str15 = locale2.getDisplayCountry(locale6);
        org.junit.Assert.assertEquals(locale2.toString(), "en-gb (zh-tw)_UND-DE");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UND-DE" + "'", str15, "UND-DE");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ita", strMap1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale4.getScript();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str7 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet6);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder14 = builder10.setLanguage("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Internet internet4 = faker0.internet();
        java.lang.String str6 = faker0.regexify("Chinese");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        java.util.Locale locale3 = new java.util.Locale("ja-JP", "Chinesisch (Taiwan)", "en_GB");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("und-Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: und-Chinese");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "ja-jp_CHINESISCH (TAIWAN)_en_GB");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.App app7 = faker5.app();
        java.lang.String str9 = faker5.letterify("ita-x-lvariant-und");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita-x-lvariant-und" + "'", str9, "ita-x-lvariant-und");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("chinese");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("italian", "Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: italian [at index 0]");
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
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.util.Random random1 = new java.util.Random(6875854121430089799L);
        int int2 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1872187718) + "'", int2 == (-1872187718));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setRegion("CHINESE (CHINA) (ITALIEN (ITALIE),CHINESE)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHINESE (CHINA) (ITALIEN (ITALIE),CHINESE) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.App app4 = faker0.app();
        java.lang.String str6 = faker0.numerify("it");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Finance finance8 = faker0.finance();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.util.Random random1 = new java.util.Random((long) (-268554284));
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.lang.String str5 = faker3.regexify("und");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.24406683f + "'", float2 == 0.24406683f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ja-JP");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("de");
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.lang.String str16 = locale14.getExtension('x');
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.lang.String str20 = locale14.getISO3Language();
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str26 = locale24.getExtension('x');
        java.util.Locale.setDefault(locale24);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        java.lang.String str30 = locale14.getDisplayVariant(locale24);
        boolean boolean31 = locale24.hasExtensions();
        java.util.Locale.setDefault(locale24);
        java.util.Locale.Builder builder33 = builder10.setLocale(locale24);
        java.lang.String str34 = locale24.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder10 = builder0.addUnicodeLocaleAttribute("Chine");
        java.util.Locale.Builder builder12 = builder10.setLanguage("eng");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        com.github.javafaker.App app34 = faker33.app();
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
        org.junit.Assert.assertNotNull(app34);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str6 = faker4.regexify("\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        long long5 = random0.nextLong();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem7 = faker6.lorem();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 840582499520648709L + "'", long5 == 840582499520648709L);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder11 = builder6.setExtension('x', "French");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.util.Locale.Builder builder12 = builder5.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder13.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        java.util.Locale locale3 = new java.util.Locale("CHN", "\u53f0\u6e7e", "fr");
        java.lang.String str4 = locale3.getLanguage();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u53f0\u6e7e_fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chn" + "'", str4, "chn");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
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
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "und" + "'", str12, "und");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0.40622473f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder7.build();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
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
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr_CA");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        com.github.javafaker.Code code10 = faker0.code();
        com.github.javafaker.Hacker hacker11 = faker0.hacker();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(hacker11);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.util.Locale locale1 = new java.util.Locale("\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder10 = builder5.setScript("");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder15 = builder10.setExtension('u', "");
        java.util.Locale.Builder builder18 = builder15.setExtension('u', "");
        java.util.Locale locale19 = builder15.build();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setVariant("");
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale locale24 = builder22.build();
        java.lang.String str25 = locale19.getDisplayVariant(locale24);
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.lang.String str30 = locale24.getDisplayLanguage(locale29);
        java.util.Locale locale33 = new java.util.Locale("zh-cn", "");
        java.lang.String str35 = locale33.getExtension('x');
        java.lang.String str36 = locale29.getDisplayName(locale33);
        java.util.Locale locale37 = locale33.stripExtensions();
        java.lang.String str38 = locale4.getDisplayLanguage(locale33);
        java.lang.String str39 = locale4.getCountry();
        java.lang.String str40 = locale4.getISO3Language();
        java.lang.String str41 = locale1.getDisplayScript(locale4);
        java.util.Set<java.lang.Character> charSet42 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "zh-cn");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh-cn");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charSet42);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.lang.String str3 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.lang.String str3 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fra FRA,fr");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.util.Locale locale2 = new java.util.Locale("CAN", "\u53f0\u6e7e");
        java.lang.String str3 = locale2.getDisplayName();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u6e7e");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u6e7e)" + "'", str3, "\u53f0\u6e7e)");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        java.util.stream.IntStream intStream6 = random1.ints((-303169301), 0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Hacker hacker8 = faker7.hacker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.lang.String str10 = locale3.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale3.getUnicodeLocaleType("\u30d5\u30e9\u30f3\u30b9\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder9 = builder4.setScript("");
        java.util.Locale locale10 = builder4.build();
        java.lang.String str11 = locale0.getDisplayLanguage(locale10);
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale locale14 = java.util.Locale.getDefault(category12);
        java.util.Locale locale15 = java.util.Locale.JAPAN;
        java.lang.String str16 = locale15.getDisplayScript();
        java.lang.String str17 = locale15.getDisplayScript();
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale21.getExtension('x');
        java.util.Locale.setDefault(locale21);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.lang.String str26 = locale21.getDisplayLanguage(locale25);
        java.lang.String str27 = locale25.getDisplayVariant();
        java.lang.String str28 = locale15.getDisplayCountry(locale25);
        java.util.Locale.setDefault(category12, locale15);
        java.lang.String str30 = locale15.toLanguageTag();
        java.lang.String str31 = locale15.getScript();
        boolean boolean32 = locale0.equals((java.lang.Object) str31);
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
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Japon" + "'", str28, "Japon");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ja-JP" + "'", str30, "ja-JP");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("en-gb");
        java.util.Locale.Builder builder12 = builder7.setExtension('a', "TW");
        java.util.Locale.Builder builder13 = builder7.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "und");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.util.Locale locale3 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder10 = builder6.setLanguage("French");
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.util.Locale.setDefault(category13, locale14);
        java.util.Random random19 = new java.util.Random((long) (byte) 10);
        long long20 = random19.nextLong();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale14, random19);
        java.util.Random random23 = new java.util.Random(8220501950349663546L);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale14, random23);
        java.lang.String str25 = locale3.getDisplayVariant(locale14);
        java.lang.String str26 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "french");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4972683369271453960L) + "'", long20 == (-4972683369271453960L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "English (United Kingdom)" + "'", str25, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "English (United Kingdom)" + "'", str26, "English (United Kingdom)");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str4 = faker2.bothify("zh,CN");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh,CN" + "'", str4, "zh,CN");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.String str6 = faker0.letterify("Chinese");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean6 = random1.nextBoolean();
        long long7 = random1.nextLong();
        long long8 = random1.nextLong();
        java.util.Random random10 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream12 = random10.doubles((long) 10);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random10.nextBytes(byteArray16);
        random1.nextBytes(byteArray16);
        java.util.stream.DoubleStream doubleStream21 = random1.doubles(0.06286501710382131d, (double) 0.32771218f);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3238451783514024357L) + "'", long7 == (-3238451783514024357L));
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4365974858868083132L + "'", long8 == 4365974858868083132L);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[41, 76, 17]");
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale12 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str13 = locale7.getDisplayName(locale12);
        java.lang.String str14 = locale7.getDisplayName();
        java.util.Locale.Builder builder15 = builder6.setLocale(locale7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale12.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (United Kingdom)" + "'", str13, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English (United Kingdom)" + "'", str14, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.Book book9 = faker0.book();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        long long16 = random15.nextLong();
        java.util.stream.LongStream longStream18 = random15.longs((long) (short) 1);
        int int19 = random15.nextInt();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random15);
        com.github.javafaker.Name name21 = faker20.name();
        com.github.javafaker.Address address22 = faker20.address();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4972683369271453960L) + "'", long16 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1107254586 + "'", int19 == 1107254586);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(address22);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale25.getExtension('x');
        java.lang.String str28 = locale21.getDisplayVariant(locale25);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale29.getLanguage();
        java.lang.String str31 = locale25.getDisplayScript(locale29);
        java.lang.String str32 = locale20.getDisplayScript(locale25);
        java.util.Locale locale35 = new java.util.Locale("de", "FRA");
        java.lang.String str36 = locale25.getDisplayVariant(locale35);
        java.lang.String str37 = locale6.getDisplayScript(locale35);
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr" + "'", str30, "fr");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale35.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale5.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Company company7 = faker0.company();
        com.github.javafaker.Name name8 = faker0.name();
        com.github.javafaker.Business business9 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("chinese");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder8.setUnicodeLocaleKeyword("CA", "UND-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: UND-DE [at index 4]");
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
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        java.util.Random random1 = new java.util.Random((long) 27);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name3 = faker2.name();
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
            java.util.stream.DoubleStream doubleStream23 = random17.doubles((long) (-1723639948), (double) (-1656932537), (double) (-7229401253428516892L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
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
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.lang.String str9 = locale8.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setVariant("English United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: English United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        com.github.javafaker.Business business16 = faker15.business();
        com.github.javafaker.App app17 = faker15.app();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.16840947f + "'", float11 == 0.16840947f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1472328353) + "'", int13 == (-1472328353));
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(app17);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.getDisplayScript();
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.lang.String str11 = locale9.getExtension('x');
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale9.getDisplayLanguage(locale13);
        java.lang.String str15 = locale13.getDisplayVariant();
        java.lang.String str16 = locale3.getDisplayCountry(locale13);
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str18 = locale3.toLanguageTag();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale.Builder builder23 = builder19.setVariant("");
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale27 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str28 = locale24.getDisplayCountry(locale27);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category30, locale34);
        java.util.Locale.Builder builder36 = builder29.setLocale(locale34);
        java.lang.String str37 = locale34.getScript();
        java.lang.String str38 = locale24.getDisplayCountry(locale34);
        java.lang.String str39 = locale3.getDisplayLanguage(locale24);
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder40.setVariant("");
        java.util.Locale.Builder builder44 = builder42.setVariant("");
        java.util.Locale locale45 = builder44.build();
        java.lang.String str46 = locale45.getDisplayCountry();
        java.lang.String str47 = locale3.getDisplayScript(locale45);
        java.util.Locale locale49 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd)");
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        boolean boolean51 = locale50.hasExtensions();
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder52.setVariant("");
        java.util.Locale.Builder builder55 = builder52.clear();
        java.util.Locale locale56 = builder55.build();
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        java.lang.String str58 = locale56.getDisplayName(locale57);
        java.lang.String str60 = locale56.getUnicodeLocaleType("fr");
        java.util.Locale locale61 = locale56.stripExtensions();
        java.lang.String str62 = locale50.getDisplayVariant(locale61);
        java.lang.String str63 = locale49.getDisplayScript(locale50);
        java.util.Set<java.lang.String> strSet64 = locale49.getUnicodeLocaleKeys();
        java.lang.String str65 = locale45.getDisplayVariant(locale49);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Japon" + "'", str16, "Japon");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ja-JP" + "'", str18, "ja-JP");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Japanese" + "'", str39, "Japanese");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale49.toString(), "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        long long5 = random0.nextLong();
        random0.setSeed((long) (-1332689415));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random0.longs((long) (-144180575), 4365974858868083132L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-722087732) + "'", int4 == (-722087732));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-8605368457785405230L) + "'", long5 == (-8605368457785405230L));
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        java.util.Locale locale3 = new java.util.Locale("cinese (Cina)", "fra (fra,fr)_GERMAN_Italian", "\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u6cd5\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=x-lvariant-jpn(jpn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(0L, (double) (short) 0, (double) 0.9816493f);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        float float13 = random0.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-178478249) + "'", int4 == (-178478249));
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.63918126f + "'", float13 == 0.63918126f);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale11.getISO3Language();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setVariant("");
        java.util.Locale locale17 = builder14.build();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale11.getDisplayVariant(locale17);
        java.lang.String str20 = locale11.getDisplayVariant();
        java.lang.String str21 = locale11.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        com.github.javafaker.Lorem lorem8 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        com.github.javafaker.Options options16 = faker15.options();
        com.github.javafaker.Code code17 = faker15.code();
        com.github.javafaker.DateAndTime dateAndTime18 = faker15.date();
        com.github.javafaker.Code code19 = faker15.code();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = faker15.resolve("hi!__hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 4.620552E-4f + "'", float11 == 4.620552E-4f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-486589960) + "'", int13 == (-486589960));
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(code19);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet10 = locale3.getExtensionKeys();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = null;
        java.lang.String str14 = null; // flaky: locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale12.getISO3Country();
        java.lang.String str16 = locale3.getDisplayLanguage(locale12);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale21.getExtension('x');
        java.lang.String str24 = locale17.getDisplayVariant(locale21);
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str26 = locale21.getDisplayScript(locale25);
        java.util.Locale locale27 = locale25.stripExtensions();
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale.Builder builder33 = builder31.setVariant("");
        java.util.Locale.Builder builder35 = builder31.setLanguage("French");
        java.util.Locale locale36 = builder35.build();
        java.lang.String str37 = locale36.toLanguageTag();
        java.lang.String str38 = locale36.toLanguageTag();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder41 = builder39.setVariant("");
        java.util.Locale.Builder builder42 = builder39.clear();
        java.util.Locale locale43 = builder42.build();
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.lang.String str45 = locale44.getLanguage();
        java.util.Locale.Builder builder46 = builder42.setLocale(locale44);
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.util.Random random48 = new java.util.Random();
        java.util.stream.LongStream longStream49 = random48.longs();
        float float50 = random48.nextFloat();
        java.util.stream.IntStream intStream51 = random48.ints();
        int int52 = random48.nextInt();
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(locale47, random48);
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker(locale44, random48);
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder57 = builder55.setVariant("");
        java.util.Locale.Builder builder58 = builder55.clear();
        java.util.Locale locale59 = builder58.build();
        java.util.Locale locale60 = java.util.Locale.FRENCH;
        java.lang.String str61 = locale60.getLanguage();
        java.util.Locale.Builder builder62 = builder58.setLocale(locale60);
        java.util.Locale locale63 = java.util.Locale.ITALY;
        java.util.Random random64 = new java.util.Random();
        java.util.stream.LongStream longStream65 = random64.longs();
        float float66 = random64.nextFloat();
        java.util.stream.IntStream intStream67 = random64.ints();
        int int68 = random64.nextInt();
        com.github.javafaker.Faker faker69 = new com.github.javafaker.Faker(locale63, random64);
        com.github.javafaker.Faker faker70 = new com.github.javafaker.Faker(locale60, random64);
        java.lang.String str71 = locale60.getDisplayName();
        java.util.Set<java.lang.String> strSet72 = locale60.getUnicodeLocaleKeys();
        java.lang.String str73 = locale44.getDisplayCountry(locale60);
        java.lang.String str74 = locale36.getDisplayVariant(locale60);
        java.lang.String str75 = locale27.getDisplayVariant(locale60);
        java.lang.String str76 = locale3.getDisplayScript(locale27);
        java.lang.String str77 = locale27.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "french");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "french" + "'", str37, "french");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "french" + "'", str38, "french");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "fr" + "'", str45, "fr");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream49);
// flaky:         org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.43814576f + "'", float50 == 0.43814576f);
        org.junit.Assert.assertNotNull(intStream51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1762973332 + "'", int52 == 1762973332);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "fr" + "'", str61, "fr");
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream65);
// flaky:         org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.19446772f + "'", float66 == 0.19446772f);
        org.junit.Assert.assertNotNull(intStream67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 602393714 + "'", int68 == 602393714);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "French" + "'", str71, "French");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Chinese" + "'", str77, "Chinese");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA", strMap1);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getLanguage();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale locale14 = builder9.build();
        java.lang.String str15 = locale4.getDisplayName(locale14);
        java.lang.String str16 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet17 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap19);
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale25.getExtension('x');
        java.lang.String str28 = locale21.getDisplayVariant(locale25);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale29.getLanguage();
        java.lang.String str31 = locale25.getDisplayScript(locale29);
        java.util.Locale locale35 = new java.util.Locale("", "", "");
        java.lang.String str37 = locale35.getExtension('x');
        java.util.Locale.setDefault(locale35);
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.lang.String str40 = locale35.getDisplayLanguage(locale39);
        java.lang.String str41 = locale25.getDisplayCountry(locale39);
        java.lang.String str42 = locale25.toLanguageTag();
        java.lang.String str43 = locale25.getLanguage();
        java.util.Set<java.lang.String> strSet44 = locale25.getUnicodeLocaleAttributes();
        java.lang.String str45 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet44);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr" + "'", str30, "fr");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "und" + "'", str42, "und");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.IntStream intStream9 = random0.ints((long) 1358566768);
        int int10 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((long) (-1473218428));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.66742665f + "'", float2 == 0.66742665f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(intStream9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-400252799) + "'", int10 == (-400252799));
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.util.Locale locale2 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str5 = locale2.getUnicodeLocaleType("it");
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        java.util.Locale locale3 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("Korean");
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        java.util.Set<java.lang.Character> charSet7 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "korean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Twi" + "'", str6, "Twi");
        org.junit.Assert.assertNotNull(charSet7);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        double double8 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 431529176 + "'", int5 == 431529176);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.4123569817688534d) + "'", double8 == (-0.4123569817688534d));
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.util.Random random1 = new java.util.Random((long) (-1192810430));
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("");
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        java.lang.String str18 = locale14.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.util.Random random20 = new java.util.Random();
        java.util.stream.LongStream longStream21 = random20.longs();
        java.util.stream.LongStream longStream23 = random20.longs(0L);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale19, random20);
        java.lang.String str25 = locale19.getDisplayName();
        java.lang.String str26 = locale14.getDisplayVariant(locale19);
        java.lang.String str27 = locale14.getDisplayLanguage();
        java.lang.String str28 = locale10.getDisplayScript(locale14);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese (China)" + "'", str25, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        java.util.Locale locale3 = new java.util.Locale("en_GB", "ZH-CN", "hi! (ITALIEN (ITALIE),fr)");
        org.junit.Assert.assertEquals(locale3.toString(), "en_gb_ZH-CN_hi! (ITALIEN (ITALIE),fr)");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra_FRA_fr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra_fra_fr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.util.Locale locale3 = new java.util.Locale("France", "\u672a\u5b9a\u8bed\u79cd", "English United Kingdom");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u672a\u5b9a\u8bed\u79cd_English United Kingdom");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        com.github.javafaker.Internet internet13 = faker0.internet();
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
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Options options3 = faker2.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.util.Locale locale2 = new java.util.Locale("und-a-chinese-u-china", "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for und-a-chinese-u-china");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "und-a-chinese-u-china_ITALIAN");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.App app7 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        java.util.Locale locale3 = new java.util.Locale("jpn_HI! (CHINESE (CHINA))", "en_GB", "");
        java.lang.String str4 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "jpn_hi! (chinese (china))_EN_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("ita");
        com.github.javafaker.App app4 = faker1.app();
        java.lang.String str6 = faker1.bothify("en-gb");
        java.lang.String str8 = faker1.numerify("Italian");
        java.lang.String str10 = faker1.numerify("Chinese");
        java.lang.String str12 = faker1.bothify("Undetermined");
        com.github.javafaker.Book book13 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-gb" + "'", str6, "en-gb");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Undetermined" + "'", str12, "Undetermined");
        org.junit.Assert.assertNotNull(book13);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.App app6 = faker0.app();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        java.util.Random random1 = new java.util.Random((long) (-303169301));
        double double2 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8224951570032952d + "'", double2 == 0.8224951570032952d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.lang.String str6 = faker4.numerify("hi!__hi!");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!__hi!" + "'", str6, "hi!__hi!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.util.Locale locale2 = new java.util.Locale("francese", "\u65e5\u672c");
        java.lang.String str3 = locale2.getDisplayLanguage();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese" + "'", str3, "francese");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("und", strMap6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale locale22 = builder19.build();
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.lang.String str31 = locale26.getDisplayLanguage(locale30);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.lang.String str41 = locale36.getDisplayLanguage(locale40);
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale45.getExtension('x');
        java.util.Locale.setDefault(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.util.Locale locale51 = locale50.stripExtensions();
        java.lang.String str52 = locale51.getISO3Country();
        java.util.Locale locale56 = new java.util.Locale("", "", "");
        java.util.Locale locale60 = new java.util.Locale("", "", "");
        java.lang.String str61 = locale56.getDisplayLanguage(locale60);
        java.util.Locale locale63 = new java.util.Locale("hi!");
        java.util.Locale locale64 = locale63.stripExtensions();
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.util.Locale locale68 = new java.util.Locale("hi!");
        java.util.Locale locale70 = new java.util.Locale("hi!");
        java.util.Locale locale71 = locale70.stripExtensions();
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale22, locale26, locale32, locale40, locale45, locale51, locale60, locale63, locale66, locale68, locale70 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale.FilteringMode filteringMode75 = null;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList73, filteringMode75);
        java.util.Locale locale77 = java.util.Locale.lookup(languageRangeList15, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter(languageRangeList13, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale79 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale81 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList73);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals(locale63.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertEquals(locale68.toString(), "hi!");
        org.junit.Assert.assertEquals(locale70.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.util.Locale locale2 = new java.util.Locale("french", "\u4e2d\u6587");
        boolean boolean4 = locale2.equals((java.lang.Object) 336522226);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("JAPAN", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        java.util.Random random1 = new java.util.Random((long) (-388136581));
        java.util.Random random3 = new java.util.Random((long) 0);
        int int5 = random3.nextInt((int) '4');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random3);
        double double7 = random3.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        boolean boolean10 = random3.nextBoolean();
        java.util.Random random12 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream14 = random12.doubles((long) 10);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random12.nextBytes(byteArray18);
        random3.nextBytes(byteArray18);
        random1.nextBytes(byteArray18);
        double double22 = random1.nextDouble();
        int int23 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8314409887870612d + "'", double7 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-18, -111, -105]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.7802865894136035d + "'", double22 == 0.7802865894136035d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 999117845 + "'", int23 == 999117845);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.lang.String str11 = locale10.getISO3Country();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale10.getDisplayName(locale12);
        java.lang.String str14 = locale12.getCountry();
        java.util.Locale.Builder builder15 = builder8.setLocale(locale12);
        java.lang.String str16 = locale12.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "German" + "'", str13, "German");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "US" + "'", str14, "US");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.lang.String str8 = locale4.getVariant();
        java.util.Set<java.lang.Character> charSet9 = locale4.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker0.resolve("china");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.IntStream intStream9 = random1.ints((long) 591553211);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.lang.String str12 = faker10.letterify("\u4e2d\u6587");
        com.github.javafaker.Hacker hacker13 = faker10.hacker();
        java.lang.Class<?> wildcardClass14 = faker10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getLanguage();
        java.util.Random random6 = new java.util.Random((long) 32);
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream10 = random7.longs((long) (-1), (long) (short) 10);
        int int11 = random7.nextInt();
        double double12 = random7.nextGaussian();
        java.util.Random random14 = new java.util.Random((long) 1);
        java.util.Random random16 = new java.util.Random((long) (short) 1);
        int int17 = random16.nextInt();
        java.util.stream.LongStream longStream21 = random16.longs(10L, 0L, (long) (short) 100);
        java.util.Random random23 = new java.util.Random(1L);
        java.util.Random random25 = new java.util.Random((long) (short) 1);
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) 10);
        int int30 = random27.nextInt();
        java.util.stream.DoubleStream doubleStream31 = random27.doubles();
        java.util.stream.IntStream intStream32 = random27.ints();
        java.util.Random random34 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream36 = random34.doubles((long) 10);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random34.nextBytes(byteArray40);
        random27.nextBytes(byteArray40);
        random25.nextBytes(byteArray40);
        random23.nextBytes(byteArray40);
        random16.nextBytes(byteArray40);
        random14.nextBytes(byteArray40);
        random7.nextBytes(byteArray40);
        random6.nextBytes(byteArray40);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale0, random6);
        java.lang.String str50 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1091078510 + "'", int11 == 1091078510);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.5370384966036594d) + "'", double12 == (-0.5370384966036594d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1155869325) + "'", int17 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1157793070) + "'", int30 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-61, -42, 100]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.util.Random random1 = new java.util.Random((long) (short) 100);
        int int2 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1193959466) + "'", int2 == (-1193959466));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(0L, (double) (short) 0, (double) 0.9816493f);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random0.longs((-5128016860359238732L), (long) 2073616612, (long) 723195425);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 763047086 + "'", int4 == 763047086);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder14 = builder10.setLanguage("French");
        java.util.Locale locale15 = builder14.build();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.lang.String str24 = locale22.getExtension('x');
        java.lang.String str25 = locale18.getDisplayVariant(locale22);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = locale26.getLanguage();
        java.lang.String str28 = locale22.getDisplayScript(locale26);
        java.lang.String str29 = locale17.getDisplayScript(locale22);
        java.util.Locale locale32 = new java.util.Locale("de", "FRA");
        java.lang.String str33 = locale22.getDisplayVariant(locale32);
        java.lang.String str34 = locale15.getDisplayVariant(locale22);
        java.lang.String str35 = locale6.getDisplayLanguage(locale22);
        java.util.Locale.Builder builder36 = builder0.setLocale(locale6);
        java.util.Locale.Builder builder37 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder0.setLanguage("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "french");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "french" + "'", str16, "french");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fr" + "'", str27, "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale32.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "China");
        java.util.Locale.Builder builder12 = builder0.clear();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder16 = builder14.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder14.setRegion("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en_GB [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        boolean boolean5 = random0.nextBoolean();
        double double6 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(1732584844371194899L, 1.1813479769181745d, (double) 6816276727925371051L);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1104662745) + "'", int4 == (-1104662745));
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5009080857925177d + "'", double6 == 0.5009080857925177d);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        java.util.Random random1 = new java.util.Random((long) (-1083682081));
        java.util.stream.IntStream intStream5 = random1.ints(0L, 486920839, 1833922823);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        double double8 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream11 = random1.doubles((double) 0.94697636f, (double) 0.98024064f);
        int int12 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random1.longs((long) 1839438880, (-7145214100349226740L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24411725056425315d + "'", double8 == 0.24411725056425315d);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-778209333) + "'", int12 == (-778209333));
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("ITA");
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        java.lang.String str10 = faker5.letterify("cinese (Cina)");
        com.github.javafaker.Company company11 = faker5.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cinese (Cina)" + "'", str10, "cinese (Cina)");
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getCountry();
        java.util.Random random3 = new java.util.Random(100L);
        java.util.stream.LongStream longStream5 = random3.longs((long) (short) 0);
        random3.setSeed((long) 'x');
        java.util.stream.LongStream longStream11 = random3.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random3);
        java.util.stream.LongStream longStream14 = random3.longs(0L);
        java.util.stream.IntStream intStream16 = random3.ints(0L);
        java.util.stream.LongStream longStream20 = random3.longs((long) (short) 1, (-6139822020582680716L), (long) (-1528827163));
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Color color22 = faker21.color();
        com.github.javafaker.Internet internet23 = faker21.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(internet23);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        java.util.Random random1 = new java.util.Random(4233101705359871616L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = random1.nextInt((-408683759));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        double double5 = random0.nextGaussian();
        java.util.Random random7 = new java.util.Random((long) 1);
        java.util.Random random9 = new java.util.Random((long) (short) 1);
        int int10 = random9.nextInt();
        java.util.stream.LongStream longStream14 = random9.longs(10L, 0L, (long) (short) 100);
        java.util.Random random16 = new java.util.Random(1L);
        java.util.Random random18 = new java.util.Random((long) (short) 1);
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        int int23 = random20.nextInt();
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        java.util.stream.IntStream intStream25 = random20.ints();
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) 10);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random27.nextBytes(byteArray33);
        random20.nextBytes(byteArray33);
        random18.nextBytes(byteArray33);
        random16.nextBytes(byteArray33);
        random9.nextBytes(byteArray33);
        random7.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        boolean boolean41 = random0.nextBoolean();
        float float42 = random0.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1293634977 + "'", int4 == 1293634977);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.547122629626343d + "'", double5 == 0.547122629626343d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-41, 127, -47]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.4800291f + "'", float42 == 0.4800291f);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        java.util.Locale locale2 = new java.util.Locale("JP", "\u97d3\u6587");
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale locale12 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale6.getDisplayCountry(locale12);
        java.lang.String str15 = locale12.getDisplayScript();
        java.lang.String str16 = locale2.getDisplayVariant(locale12);
        java.util.Locale locale17 = locale12.stripExtensions();
        java.lang.String str18 = locale12.getDisplayVariant();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u97d3\u6587");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.util.Random random1 = new java.util.Random((long) 1802692291);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 0.7676484f, (double) (-1855441849));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        java.util.Random random1 = new java.util.Random((long) ' ');
        long long2 = random1.nextLong();
        int int3 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs();
        float float5 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5015647950085110473L) + "'", long2 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1434703326) + "'", int3 == (-1434703326));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.24137181f + "'", float5 == 0.24137181f);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Color color4 = faker0.color();
        java.lang.String str6 = faker0.bothify("italien Italie");
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien Italie" + "'", str6, "italien Italie");
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        long long9 = random1.nextLong();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8220501950349663546L + "'", long9 == 8220501950349663546L);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("");
        java.lang.String str17 = locale14.getDisplayLanguage(locale16);
        java.lang.String str18 = locale14.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.util.Random random20 = new java.util.Random();
        java.util.stream.LongStream longStream21 = random20.longs();
        java.util.stream.LongStream longStream23 = random20.longs(0L);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale19, random20);
        java.lang.String str25 = locale19.getDisplayName();
        java.lang.String str26 = locale14.getDisplayVariant(locale19);
        java.lang.String str27 = locale14.getDisplayLanguage();
        java.lang.String str28 = locale10.getDisplayScript(locale14);
        java.lang.String str29 = locale10.getDisplayLanguage();
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
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese (China)" + "'", str25, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.lang.String str8 = faker6.bothify("");
        com.github.javafaker.Hacker hacker9 = faker6.hacker();
        com.github.javafaker.DateAndTime dateAndTime10 = faker6.date();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setLanguage("ja");
        java.util.Locale locale8 = new java.util.Locale("chinese china", "fra (FRA,fr)");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: chinese china [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "chinese china_FRA (FRA,FR)");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Address address9 = faker6.address();
        com.github.javafaker.Internet internet10 = faker6.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.26996928f + "'", float3 == 0.26996928f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 729895872 + "'", int5 == 729895872);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(internet10);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.util.Random random1 = new java.util.Random((long) 1641039410);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("it");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random(100L);
        double double3 = random2.nextGaussian();
        long long4 = random2.nextLong();
        java.util.stream.DoubleStream doubleStream6 = random2.doubles((long) 977291951);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6246292191371761d + "'", double3 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-6139822020582680716L) + "'", long4 == (-6139822020582680716L));
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.util.Locale locale3 = new java.util.Locale("zh", "us", "en-gb (FR-FR)");
        org.junit.Assert.assertEquals(locale3.toString(), "zh_US_en-gb (FR-FR)");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        java.util.Random random1 = new java.util.Random(2401558996911791356L);
        java.lang.Class<?> wildcardClass2 = random1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet8);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet8);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = locale11.getVariant();
        java.util.Random random14 = new java.util.Random(100L);
        double double15 = random14.nextGaussian();
        random14.setSeed((long) (-1157793070));
        double double18 = random14.nextGaussian();
        boolean boolean19 = random14.nextBoolean();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale11, random14);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale25.getExtension('x');
        java.lang.String str28 = locale21.getDisplayName(locale25);
        java.lang.String str30 = locale21.getExtension('x');
        java.util.Locale locale32 = new java.util.Locale("fra");
        java.lang.String str33 = locale21.getDisplayScript(locale32);
        java.util.Locale locale34 = locale21.stripExtensions();
        java.lang.String str35 = locale11.getDisplayScript(locale34);
        java.lang.String str36 = locale11.getScript();
        java.util.Locale locale37 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        java.util.Locale locale42 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str43 = locale37.getDisplayName(locale42);
        java.util.Set<java.lang.Character> charSet44 = locale37.getExtensionKeys();
        java.lang.String str45 = locale11.getDisplayVariant(locale37);
        java.util.Set<java.lang.String> strSet46 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet46, filteringMode47);
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6246292191371761d + "'", double15 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.09760425216810112d + "'", double18 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "French" + "'", str28, "French");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals(locale32.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals(locale42.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "English (United Kingdom)" + "'", str43, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Finance finance6 = faker0.finance();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.IntStream intStream8 = random1.ints((long) 190001823);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Finance finance8 = faker0.finance();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap84);
        java.util.Collection<java.lang.String> strCollection86 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str87 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strCollection86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(languageRangeList85);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('u', "\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Options options6 = faker1.options();
        com.github.javafaker.App app7 = faker1.app();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale10 = new java.util.Locale("hi!");
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = locale10.toLanguageTag();
        java.lang.String str14 = locale7.getDisplayName(locale10);
        java.lang.String str15 = locale7.getVariant();
        java.util.Locale.setDefault(locale7);
        java.lang.String str17 = locale7.getISO3Language();
        java.util.Locale locale20 = new java.util.Locale("", "");
        java.lang.String str21 = locale7.getDisplayLanguage(locale20);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und" + "'", str13, "und");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        java.util.Locale locale3 = new java.util.Locale("de", "_FR", "fra (FRA,fr)");
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale9 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str10 = locale4.getDisplayName(locale9);
        java.util.Set<java.lang.Character> charSet11 = locale4.getExtensionKeys();
        java.util.Set<java.lang.String> strSet12 = locale4.getUnicodeLocaleKeys();
        java.util.Locale locale13 = locale4.stripExtensions();
        java.lang.String str14 = locale13.getLanguage();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleKeys();
        java.lang.String str16 = locale3.getDisplayName(locale13);
        org.junit.Assert.assertEquals(locale3.toString(), "de__FR_fra (FRA,fr)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals(locale9.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English (United Kingdom)" + "'", str10, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(strSet15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German (_FR,fra (FRA,fr))" + "'", str16, "German (_FR,fra (FRA,fr))");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und-FR", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale8 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category11, locale15);
        java.util.Locale.Builder builder17 = builder10.setLocale(locale15);
        java.lang.String str18 = locale15.getScript();
        java.lang.String str19 = locale5.getDisplayCountry(locale15);
        java.util.Set<java.lang.String> strSet20 = locale5.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale8.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        com.github.javafaker.Name name13 = faker0.name();
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
        org.junit.Assert.assertNotNull(name13);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale15.getDisplayVariant();
        java.util.Random random20 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale15, random20);
        java.lang.String str22 = locale14.getDisplayVariant(locale15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.util.Random random1 = new java.util.Random((long) (-23211725));
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.util.Locale locale2 = new java.util.Locale("US", "chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for us");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "us_CHINESE");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        float float6 = random0.nextFloat();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.41194028f + "'", float6 == 0.41194028f);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.lang.String str9 = locale2.getDisplayVariant(locale6);
        java.lang.String str10 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale12 = locale6.stripExtensions();
        java.util.Set<java.lang.String> strSet13 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale0.getDisplayLanguage(locale6);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "German" + "'", str14, "German");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder14 = builder10.setLanguage("chinois");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder16 = builder14.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale11.getISO3Language();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setVariant("");
        java.util.Locale locale17 = builder14.build();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale11.getDisplayVariant(locale17);
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Locale.setDefault(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale23.getDisplayLanguage(locale27);
        java.lang.String str29 = locale23.getISO3Language();
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str35 = locale33.getExtension('x');
        java.util.Locale.setDefault(locale33);
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.lang.String str38 = locale33.getDisplayLanguage(locale37);
        java.lang.String str39 = locale23.getDisplayVariant(locale33);
        boolean boolean40 = locale23.hasExtensions();
        java.lang.String str41 = locale17.getDisplayName(locale23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA (FRA,FR)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra(fra");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        java.util.stream.LongStream longStream8 = random0.longs(8849569814870478533L, (long) (byte) 0, (long) 74589158);
        double double9 = random0.nextGaussian();
        java.util.stream.LongStream longStream13 = random0.longs(0L, (long) 200959200, (long) 445843723);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.1823358f + "'", float2 == 0.1823358f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 854132842 + "'", int4 == 854132842);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.371684322804478d) + "'", double9 == (-1.371684322804478d));
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("JAPAN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("de");
        java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("chinese");
        java.util.Locale.Builder builder14 = builder12.setLanguageTag("GBR");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder0.clear();
        java.util.Locale.Builder builder10 = builder0.setLanguageTag("x-lvariant-fr");
        java.util.Locale.Builder builder13 = builder0.setExtension('a', "fr");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        java.util.Locale.Builder builder68 = builder64.setVariant("Japan");
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
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 100);
        java.util.stream.LongStream longStream10 = random0.longs((long) (short) 0, (long) 190001823);
        java.util.stream.LongStream longStream11 = random0.longs();
        boolean boolean12 = random0.nextBoolean();
        java.util.Random random14 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream16 = random14.doubles((long) 10);
        int int17 = random14.nextInt();
        java.util.stream.DoubleStream doubleStream18 = random14.doubles();
        double double19 = random14.nextGaussian();
        int int20 = random14.nextInt();
        double double21 = random14.nextDouble();
        int int22 = random14.nextInt();
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = locale23.getVariant();
        java.util.Random random26 = new java.util.Random(100L);
        double double27 = random26.nextGaussian();
        random26.setSeed((long) (-1157793070));
        double double30 = random26.nextGaussian();
        boolean boolean31 = random26.nextBoolean();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale23, random26);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random26);
        java.util.Random random35 = new java.util.Random((long) (short) 1);
        int int36 = random35.nextInt();
        java.util.stream.LongStream longStream40 = random35.longs(10L, 0L, (long) (short) 100);
        java.util.Random random42 = new java.util.Random(1L);
        java.util.Random random44 = new java.util.Random((long) (short) 1);
        java.util.Random random46 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream48 = random46.doubles((long) 10);
        int int49 = random46.nextInt();
        java.util.stream.DoubleStream doubleStream50 = random46.doubles();
        java.util.stream.IntStream intStream51 = random46.ints();
        java.util.Random random53 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream55 = random53.doubles((long) 10);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random53.nextBytes(byteArray59);
        random46.nextBytes(byteArray59);
        random44.nextBytes(byteArray59);
        random42.nextBytes(byteArray59);
        random35.nextBytes(byteArray59);
        random26.nextBytes(byteArray59);
        random14.nextBytes(byteArray59);
        random0.nextBytes(byteArray59);
        int int69 = random0.nextInt(1894354479);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1157793070) + "'", int17 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.3325983427023256d) + "'", double19 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1408064384) + "'", int20 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.24411725056425315d + "'", double21 == 0.24411725056425315d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-778209333) + "'", int22 == (-778209333));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6246292191371761d + "'", double27 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.09760425216810112d + "'", double30 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1155869325) + "'", int36 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream40);
        org.junit.Assert.assertNotNull(doubleStream48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1157793070) + "'", int49 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertNotNull(doubleStream55);
        org.junit.Assert.assertNotNull(byteArray59);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-102, 29, -51]");
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 119249801 + "'", int69 == 119249801);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("CHINESE CHINA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesechina");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale locale7 = builder0.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.IntStream intStream6 = random1.ints((-1193959466), 78707950);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) 74589158, (double) 591553211);
        long long10 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints(180726124, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-5128016860359238732L) + "'", long10 == (-5128016860359238732L));
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.lang.String str14 = locale12.getExtension('x');
        java.lang.String str15 = locale8.getDisplayVariant(locale12);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale12.getDisplayScript(locale16);
        java.lang.String str19 = locale7.getDisplayCountry(locale12);
        java.lang.String str20 = locale7.getCountry();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder21.setVariant("");
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale locale25 = builder23.build();
        java.lang.String str26 = locale7.getDisplayCountry(locale25);
        java.lang.String str27 = locale7.getDisplayLanguage();
        java.util.Locale.Builder builder28 = builder3.setLocale(locale7);
        java.lang.String str29 = locale7.getDisplayLanguage();
        java.lang.String str30 = locale7.getDisplayCountry();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CN" + "'", str20, "CN");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "China" + "'", str26, "China");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinese (JPN)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        double double4 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.429442932538424d) + "'", double4 == (-0.429442932538424d));
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("french (FRA,und)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: french (FRA,und) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime2 = faker1.date();
        com.github.javafaker.Internet internet3 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(internet3);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs(10L, 0L, (long) (short) 100);
        double double7 = random1.nextDouble();
        double double8 = random1.nextDouble();
        double double9 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.10047321632624884d + "'", double7 == 0.10047321632624884d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4074398012118764d + "'", double8 == 0.4074398012118764d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.2659156285970381d) + "'", double9 == (-0.2659156285970381d));
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinese (china) (ITALIEN (ITALIE),Chinese)");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("gb");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale locale10 = builder6.build();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "gb");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.util.Random random1 = new java.util.Random((long) (-833381869));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        boolean boolean9 = random6.nextBoolean();
        java.util.stream.LongStream longStream12 = random6.longs((long) (-275271), 7616895062557318172L);
        java.util.stream.DoubleStream doubleStream14 = random6.doubles(4269302690360740192L);
        java.util.stream.IntStream intStream16 = random6.ints((long) 2043360656);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u56fd)", (double) 0.4813866f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=x-lvariant-jpn (jpn,??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        java.util.Locale locale2 = new java.util.Locale("hi!", "\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u56fd)");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.lang.String str4 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French" + "'", str4, "French");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.util.Locale locale3 = new java.util.Locale("en-gb_ZH-TW", "und-Chinese", "Chine");
        org.junit.Assert.assertEquals(locale3.toString(), "en-gb_zh-tw_UND-CHINESE_Chine");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale5);
        java.lang.String str14 = locale0.getExtension('u');
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Set<java.lang.Character> charSet18 = locale16.getExtensionKeys();
        java.util.Locale.setDefault(locale16);
        java.lang.String str20 = locale0.getDisplayScript(locale16);
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str26 = locale24.getExtension('x');
        java.util.Locale.setDefault(locale24);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        boolean boolean30 = locale28.hasExtensions();
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.setVariant("");
        java.util.Locale.Builder builder35 = builder33.setVariant("");
        java.util.Locale.Builder builder37 = builder33.setLanguage("French");
        java.util.Locale locale38 = builder37.build();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayScript();
        java.lang.String str41 = locale28.getDisplayLanguage(locale38);
        java.lang.String str42 = locale16.getDisplayLanguage(locale28);
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale43);
        java.lang.String str45 = locale16.getDisplayLanguage(locale43);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "french");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "French" + "'", str41, "French");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        java.util.Locale locale2 = new java.util.Locale("und-a-chinese-u-china", "Cina");
        java.util.Random random4 = new java.util.Random((long) 27);
        java.util.stream.LongStream longStream6 = random4.longs((long) 0);
        java.util.stream.IntStream intStream7 = random4.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: und-a-chinese-u-china_CINA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "und-a-chinese-u-china_CINA");
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        java.util.Locale locale2 = new java.util.Locale("Chinese (China)", "TW");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale4 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (china)_TW");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "chinese (china)_TW");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Company company9 = faker0.company();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Lorem lorem10 = faker9.lorem();
        com.github.javafaker.Number number11 = faker9.number();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream10 = random0.longs((long) (-266083962), (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) 0.70362145f, (double) (byte) 1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream15 = random0.ints();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5596708f + "'", float2 == 0.5596708f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        double double3 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((double) 0.4100808f, (double) 179251573188998827L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8673886034754649d) + "'", double3 == (-0.8673886034754649d));
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.util.Locale locale3 = new java.util.Locale("TW", "", "italien (Italie)");
        org.junit.Assert.assertEquals(locale3.toString(), "tw__italien (Italie)");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jpn" + "'", str3, "jpn");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setUnicodeLocaleKeyword("und_fra (ENGLISH (UNITED KINGDOM))", "und_fra ENGLISH UNITED KINGDOM");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: und_fra (ENGLISH (UNITED KINGDOM)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.regexify("en_GB");
        com.github.javafaker.Number number8 = faker0.number();
        java.lang.Class<?> wildcardClass9 = number8.getClass();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en_GB" + "'", str7, "en_GB");
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book2 = faker1.book();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Number number4 = faker1.number();
        java.lang.String str6 = faker1.bothify("Japan");
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.App app8 = faker1.app();
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Japan" + "'", str6, "Japan");
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "en_CA");
        java.util.Locale.Builder builder13 = builder7.setExtension('a', "de");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        java.util.stream.LongStream longStream32 = random1.longs();
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
        org.junit.Assert.assertNotNull(longStream32);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        java.util.Locale locale2 = new java.util.Locale("CHN", "Korean");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getLanguage();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Locale locale11 = new java.util.Locale("CAN", "chinese (china) (ITALIEN (ITALIE),Chinese)", "chinese (china) (ITALIEN (ITALIE),Chinese)");
        java.lang.String str12 = locale11.getCountry();
        java.lang.String str13 = locale2.getDisplayVariant(locale11);
        org.junit.Assert.assertEquals(locale2.toString(), "chn_KOREAN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinook jargon (KOREAN)" + "'", str7, "Chinook jargon (KOREAN)");
        org.junit.Assert.assertEquals(locale11.toString(), "can_CHINESE (CHINA) (ITALIEN (ITALIE),CHINESE)_chinese (china) (ITALIEN (ITALIE),Chinese)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHINESE (CHINA) (ITALIEN (ITALIE),CHINESE)" + "'", str12, "CHINESE (CHINA) (ITALIEN (ITALIE),CHINESE)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("TWN");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("Japan");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(0L, (double) (short) 0, (double) 0.9816493f);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random0);
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.util.Random random14 = new java.util.Random();
        java.util.stream.LongStream longStream15 = random14.longs();
        java.util.stream.LongStream longStream17 = random14.longs(0L);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale13, random14);
        java.util.stream.DoubleStream doubleStream19 = random14.doubles();
        java.util.stream.LongStream longStream20 = random14.longs();
        java.util.stream.LongStream longStream23 = random14.longs(0L, (long) 127135246);
        java.util.Random random25 = new java.util.Random((long) 32);
        java.util.Random random26 = new java.util.Random();
        java.util.stream.LongStream longStream29 = random26.longs((long) (-1), (long) (short) 10);
        int int30 = random26.nextInt();
        double double31 = random26.nextGaussian();
        java.util.Random random33 = new java.util.Random((long) 1);
        java.util.Random random35 = new java.util.Random((long) (short) 1);
        int int36 = random35.nextInt();
        java.util.stream.LongStream longStream40 = random35.longs(10L, 0L, (long) (short) 100);
        java.util.Random random42 = new java.util.Random(1L);
        java.util.Random random44 = new java.util.Random((long) (short) 1);
        java.util.Random random46 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream48 = random46.doubles((long) 10);
        int int49 = random46.nextInt();
        java.util.stream.DoubleStream doubleStream50 = random46.doubles();
        java.util.stream.IntStream intStream51 = random46.ints();
        java.util.Random random53 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream55 = random53.doubles((long) 10);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random53.nextBytes(byteArray59);
        random46.nextBytes(byteArray59);
        random44.nextBytes(byteArray59);
        random42.nextBytes(byteArray59);
        random35.nextBytes(byteArray59);
        random33.nextBytes(byteArray59);
        random26.nextBytes(byteArray59);
        random25.nextBytes(byteArray59);
        random14.nextBytes(byteArray59);
        random0.nextBytes(byteArray59);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 993087226 + "'", int4 == 993087226);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(longStream29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1865077206 + "'", int30 == 1865077206);
// flaky:         org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.6402922016576312d + "'", double31 == 0.6402922016576312d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1155869325) + "'", int36 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream40);
        org.junit.Assert.assertNotNull(doubleStream48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1157793070) + "'", int49 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertNotNull(doubleStream55);
        org.junit.Assert.assertNotNull(byteArray59);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[106, 34, -91]");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.util.Locale locale3 = new java.util.Locale("Korean", "\u5fb7\u6587", "ENGLISCH (KANADA)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u5fb7\u6587_ENGLISCH (KANADA)");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.setExtension('a', "anglais");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setVariant("German");
        java.util.Locale.Builder builder12 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder8.setVariant("de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: de [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????(??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        int int2 = random1.nextInt();
        float float3 = random1.nextFloat();
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.IntStream intStream7 = random1.ints((-910502427), (-764196127));
        java.util.stream.IntStream intStream11 = random1.ints((long) 2042992439, (-1872187718), 222208614);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-196947104) + "'", int2 == (-196947104));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.90741676f + "'", float3 == 0.90741676f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getISO3Country();
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale0.getDisplayVariant(locale7);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!__hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TWN" + "'", str2, "TWN");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder12 = builder8.setLanguageTag("TW");
        java.util.Locale.Builder builder14 = builder8.setLanguage("en");
        java.util.Locale.Builder builder16 = builder14.setLanguageTag("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguage("CHINESE CHINA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: CHINESE CHINA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setLanguageTag("\u97d3\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zho", 0.7924908613121775d);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7924908613121775d + "'", double3 == 0.7924908613121775d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7924908613121775d + "'", double4 == 0.7924908613121775d);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("Undetermined");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Undetermined [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder16.clear();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.util.Locale.Builder builder23 = builder19.setLocale(locale21);
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Random random25 = new java.util.Random();
        java.util.stream.LongStream longStream26 = random25.longs();
        float float27 = random25.nextFloat();
        java.util.stream.IntStream intStream28 = random25.ints();
        int int29 = random25.nextInt();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale24, random25);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale21, random25);
        java.lang.String str32 = locale21.getDisplayName();
        java.util.Set<java.lang.String> strSet33 = locale21.getUnicodeLocaleKeys();
        java.lang.String str34 = locale5.getDisplayCountry(locale21);
        java.util.Locale locale35 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str37 = locale35.getDisplayName();
        java.util.Locale.Category category38 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet41 = locale39.getExtensionKeys();
        java.util.Locale.setDefault(category38, locale39);
        java.util.Random random44 = new java.util.Random((long) (byte) 10);
        long long45 = random44.nextLong();
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(locale39, random44);
        java.util.Random random48 = new java.util.Random(8220501950349663546L);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale39, random48);
        com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(locale35, random48);
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(locale5, random48);
        com.github.javafaker.Code code52 = faker51.code();
        com.github.javafaker.Number number53 = faker51.number();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.046907723f + "'", float11 == 0.046907723f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-648208732) + "'", int13 == (-648208732));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream26);
// flaky:         org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5948386f + "'", float27 == 0.5948386f);
        org.junit.Assert.assertNotNull(intStream28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1013344367) + "'", int29 == (-1013344367));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French" + "'", str32, "French");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "English (United Kingdom)" + "'", str37, "English (United Kingdom)");
        org.junit.Assert.assertTrue("'" + category38 + "' != '" + java.util.Locale.Category.FORMAT + "'", category38.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-4972683369271453960L) + "'", long45 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(code52);
        org.junit.Assert.assertNotNull(number53);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        java.lang.String str4 = faker0.numerify("ITA");
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category5, locale9);
        java.util.Locale.Builder builder11 = builder4.setLocale(locale9);
        java.lang.String str12 = locale1.getDisplayName(locale9);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.util.Locale.setDefault(category13, locale14);
        java.util.Random random19 = new java.util.Random((long) (byte) 10);
        long long20 = random19.nextLong();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale14, random19);
        java.util.Random random23 = new java.util.Random(8220501950349663546L);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale14, random23);
        random23.setSeed((long) (-1142367176));
        random23.setSeed((long) 1447301737);
        java.util.stream.DoubleStream doubleStream32 = random23.doubles(1732584844371194899L, (double) (-4797905507370029140L), (double) 0.5485702f);
        java.util.stream.LongStream longStream35 = random23.longs((long) (short) -1, 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale1, random23);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4972683369271453960L) + "'", long20 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertNotNull(longStream35);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale3 = locale0.stripExtensions();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Company company5 = faker4.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.lang.String str11 = locale7.getDisplayScript();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder15 = builder12.clear();
        java.util.Locale locale16 = builder15.build();
        java.util.Locale.Builder builder18 = builder15.setVariant("");
        java.util.Locale locale19 = builder15.build();
        java.lang.String str20 = locale19.getVariant();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.lang.String str22 = locale7.getDisplayScript(locale21);
        java.util.Random random24 = new java.util.Random(100L);
        double double25 = random24.nextGaussian();
        long long26 = random24.nextLong();
        java.util.stream.DoubleStream doubleStream28 = random24.doubles((long) 977291951);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale7, random24);
        double double30 = random24.nextGaussian();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6246292191371761d + "'", double25 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-6139822020582680716L) + "'", long26 == (-6139822020582680716L));
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.8581918080882499d) + "'", double30 == (-0.8581918080882499d));
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        java.util.Random random29 = new java.util.Random(100L);
        java.util.stream.LongStream longStream31 = random29.longs((long) (short) 0);
        random29.setSeed((long) 'x');
        java.util.stream.LongStream longStream37 = random29.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random29);
        java.util.stream.LongStream longStream40 = random29.longs(0L);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale17, random29);
        java.lang.String str42 = locale17.getDisplayCountry();
        java.util.Locale locale43 = null;
        java.lang.String str44 = null; // flaky: locale17.getDisplayCountry(locale43);
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
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.7657909f + "'", float20 == 0.7657909f);
        org.junit.Assert.assertNotNull(intStream21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-536167595) + "'", int22 == (-536167595));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(longStream40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Internet internet7 = faker0.internet();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.util.Random random1 = new java.util.Random((long) (-144180575));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream3 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 200959200);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
            java.lang.String str12 = locale5.getUnicodeLocaleType("hi! (hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi! (hi!)");
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
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        java.util.Random random1 = new java.util.Random(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((-338045060221006775L), (double) 0.9636359f, (double) 0.03924471f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream8 = random1.longs((long) 0);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((long) (-630219714), (long) (-1521488052));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.lang.String str6 = locale3.getDisplayCountry();
        java.lang.String str7 = locale3.getISO3Country();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder11 = builder8.clear();
        java.util.Locale.Builder builder13 = builder8.setScript("");
        java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder18 = builder13.setExtension('u', "");
        java.util.Locale.Builder builder21 = builder18.setExtension('u', "");
        java.util.Locale locale22 = builder18.build();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setVariant("");
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale locale27 = builder25.build();
        java.lang.String str28 = locale22.getDisplayVariant(locale27);
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale27.getDisplayLanguage(locale32);
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet37 = locale35.getExtensionKeys();
        java.util.Locale.setDefault(category34, locale35);
        java.util.Locale locale39 = java.util.Locale.getDefault(category34);
        java.util.Locale locale40 = java.util.Locale.getDefault(category34);
        java.util.Locale locale41 = java.util.Locale.getDefault(category34);
        java.util.Locale locale42 = java.util.Locale.getDefault(category34);
        java.util.Locale locale43 = java.util.Locale.getDefault(category34);
        java.lang.String str44 = locale32.getDisplayScript(locale43);
        java.util.Set<java.lang.String> strSet45 = locale32.getUnicodeLocaleKeys();
        java.lang.String str46 = locale32.getDisplayName();
        java.lang.String str47 = locale32.getISO3Country();
        java.lang.String str48 = locale32.getDisplayVariant();
        java.lang.String str49 = locale3.getDisplayLanguage(locale32);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.FORMAT + "'", category34.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder2.build();
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale5.getDisplayVariant();
        java.util.Random random9 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream11 = random9.doubles((long) 10);
        int int12 = random9.nextInt();
        double double13 = random9.nextDouble();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random9);
        java.util.stream.DoubleStream doubleStream16 = random9.doubles((long) 1802692291);
        java.util.stream.LongStream longStream17 = random9.longs();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale5, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1157793070) + "'", int12 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4456342944175421d + "'", double13 == 0.4456342944175421d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.util.Locale locale1 = new java.util.Locale("en-gb (FR-FR)");
        org.junit.Assert.assertEquals(locale1.toString(), "en-gb (fr-fr)");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        java.util.Random random1 = new java.util.Random((long) 1491193272);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinese china");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese china");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        java.util.Locale locale3 = new java.util.Locale("Chine", "zh,cn (ITALIENISCH)", "chinese (china) (ITALIEN (ITALIE),Chinese)");
        org.junit.Assert.assertEquals(locale3.toString(), "chine_ZH,CN (ITALIENISCH)_chinese (china) (ITALIEN (ITALIE),Chinese)");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setScript("");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder13 = builder8.setExtension('u', "");
        java.util.Locale.Builder builder16 = builder13.setExtension('u', "");
        java.util.Locale locale17 = builder13.build();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder18.setVariant("");
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        java.util.Locale locale22 = builder20.build();
        java.lang.String str23 = locale17.getDisplayVariant(locale22);
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str28 = locale22.getDisplayLanguage(locale27);
        java.util.Locale locale31 = new java.util.Locale("zh-cn", "");
        java.lang.String str33 = locale31.getExtension('x');
        java.lang.String str34 = locale27.getDisplayName(locale31);
        java.util.Locale locale35 = locale31.stripExtensions();
        java.lang.String str36 = locale2.getDisplayLanguage(locale31);
        java.lang.String str37 = locale31.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale31.toString(), "zh-cn");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh-cn");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        java.util.Random random1 = new java.util.Random((long) 1078116549);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.IntStream intStream7 = random0.ints();
        double double8 = random0.nextDouble();
        java.lang.Class<?> wildcardClass9 = random0.getClass();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1449624865 + "'", int4 == 1449624865);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.755028954998142d + "'", double8 == 0.755028954998142d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        double double8 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream11 = random1.doubles((double) 0.94697636f, (double) 0.98024064f);
        random1.setSeed((long) (-1142367176));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.24411725056425315d + "'", double8 == 0.24411725056425315d);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        java.util.Locale locale2 = new java.util.Locale("Japan", "Chinesisch (Taiwan)");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.Class<?> wildcardClass4 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "japan_CHINESISCH (TAIWAN)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "japan" + "'", str3, "japan");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        java.util.stream.LongStream longStream7 = random4.longs(0L);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        java.lang.String str9 = locale3.getDisplayName();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale3);
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale11.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("us", (double) (-196947104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.96947104E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        java.util.Locale locale1 = new java.util.Locale("English United Kingdom");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Chinese (China)");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale8.getDisplayScript(locale12);
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str20 = locale18.getExtension('x');
        java.util.Locale.setDefault(locale18);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale18.getDisplayLanguage(locale22);
        java.lang.String str24 = locale8.getDisplayCountry(locale22);
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale8.getDisplayScript(locale25);
        java.lang.String str27 = locale25.getDisplayScript();
        java.util.Set<java.lang.String> strSet28 = locale25.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale3.getDisplayScript(locale25);
        java.util.Locale locale33 = new java.util.Locale("English United Kingdom", "it", "\u4e2d\u6587");
        java.lang.String str34 = locale25.getDisplayVariant(locale33);
        java.lang.String str35 = locale25.getISO3Language();
        java.lang.String str36 = locale1.getDisplayLanguage(locale25);
        org.junit.Assert.assertEquals(locale1.toString(), "english united kingdom");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "eng" + "'", str35, "eng");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "english united kingdom" + "'", str36, "english united kingdom");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.setLanguage("Japon");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder12.removeUnicodeLocaleAttribute("UND-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: UND-DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u610f\u5927\u5229\u6587\u7f8e\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????(??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale.setDefault(locale6);
        java.lang.String str9 = locale4.getDisplayVariant(locale6);
        java.lang.String str10 = locale4.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        java.lang.String str7 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        com.github.javafaker.Hacker hacker10 = faker0.hacker();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder10.build();
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale14.getCountry();
        java.util.Locale locale19 = new java.util.Locale("CHN", "ita");
        java.lang.String str20 = locale14.getDisplayName(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale19.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ITA");
        } catch (java.util.MissingResourceException e) {
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "chn_ITA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str6 = locale4.getExtension('a');
        java.lang.String str8 = locale4.getExtension('u');
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.getDefault(category9);
        java.util.Locale locale17 = java.util.Locale.getDefault(category9);
        java.util.Locale locale18 = java.util.Locale.getDefault(category9);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale21 = null;
        java.lang.String str22 = null; // flaky: locale20.getDisplayScript(locale21);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet26 = locale24.getExtensionKeys();
        java.util.Locale.setDefault(category23, locale24);
        java.util.Locale locale28 = java.util.Locale.getDefault(category23);
        java.lang.String str30 = locale28.getExtension('a');
        java.lang.String str31 = locale28.getCountry();
        boolean boolean32 = locale28.hasExtensions();
        java.lang.String str33 = locale20.getDisplayScript(locale28);
        java.util.Locale.setDefault(category9, locale28);
        boolean boolean35 = locale4.equals((java.lang.Object) locale28);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale11);
        java.util.Locale locale15 = new java.util.Locale("und");
        java.lang.String str17 = locale15.getExtension('x');
        java.lang.String str18 = locale11.getDisplayVariant(locale15);
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
        org.junit.Assert.assertEquals(locale15.toString(), "und");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        java.util.Random random1 = new java.util.Random((long) (-1690734402));
        java.util.stream.LongStream longStream3 = random1.longs((long) 1115909453);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((double) (-267994359), (double) 0.9946545f);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.lang.String str12 = faker10.numerify("und-DE");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "und-DE" + "'", str12, "und-DE");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Color color5 = faker0.color();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        java.util.Locale locale2 = new java.util.Locale("Japon", "fra (FRA,fr)");
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale6.getISO3Language();
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale6.getDisplayVariant(locale16);
        java.util.Locale locale23 = locale6.stripExtensions();
        java.lang.String str24 = locale2.getDisplayVariant(locale23);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale23);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "japon_FRA (FRA,FR)");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        java.util.Random random1 = new java.util.Random((long) 673324482);
        boolean boolean2 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((long) 2088989465, 14, (-539800044));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Name name11 = faker10.name();
        java.lang.String str13 = faker10.regexify("CA");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CA" + "'", str13, "CA");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        java.util.Random random1 = new java.util.Random((long) 74589158);
        java.lang.Class<?> wildcardClass2 = random1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 27);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.DateAndTime dateAndTime6 = faker4.date();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = locale7.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale7.getDisplayName(locale11);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587" + "'", str12, "\u6cd5\u6587");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        java.util.Random random1 = new java.util.Random((long) (-1397455457));
        double double2 = random1.nextDouble();
        java.util.stream.IntStream intStream5 = random1.ints((-1193959466), 1505131154);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016603023868030142d + "'", double2 == 0.016603023868030142d);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        java.util.stream.IntStream intStream7 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((long) (-796391428), 1091078510, 10846315);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1705531749 + "'", int4 == 1705531749);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7708591398892538867L + "'", long5 == 7708591398892538867L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        java.lang.String str5 = faker0.numerify("zh");
        com.github.javafaker.Finance finance6 = faker0.finance();
        java.lang.String str8 = faker0.bothify("ita-x-lvariant-und");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ita-x-lvariant-und" + "'", str8, "ita-x-lvariant-und");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien (italie)", (double) 0.3448496f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italien (italie)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale19.getDisplayLanguage(locale24);
        java.lang.String str26 = locale24.getDisplayVariant();
        java.lang.Object obj27 = locale24.clone();
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
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        java.util.Locale locale1 = new java.util.Locale("chinois");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "chinois");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        boolean boolean9 = random6.nextBoolean();
        java.util.stream.LongStream longStream12 = random6.longs((long) (-275271), 7616895062557318172L);
        java.util.stream.DoubleStream doubleStream14 = random6.doubles(4269302690360740192L);
        random6.setSeed((long) (-2058711394));
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
        java.util.Random random25 = new java.util.Random((long) (byte) 10);
        random25.setSeed((long) 1699180332);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale21, random25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream31 = random25.ints(41663098, (-1279776254));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
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
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        java.util.Locale locale2 = new java.util.Locale("UNDETERMINED", "");
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale2.getDisplayName(locale7);
        org.junit.Assert.assertEquals(locale2.toString(), "undetermined");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undetermined" + "'", str9, "undetermined");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Hacker hacker2 = faker1.hacker();
        com.github.javafaker.Company company3 = faker1.company();
        org.junit.Assert.assertNotNull(hacker2);
        org.junit.Assert.assertNotNull(company3);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10);
        double double9 = random0.nextGaussian();
        java.util.stream.IntStream intStream10 = random0.ints();
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.23422074f + "'", float2 == 0.23422074f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 941971209 + "'", int4 == 941971209);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.4996932076353699d) + "'", double9 == (-0.4996932076353699d));
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5752375f + "'", float11 == 0.5752375f);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale1.getDisplayName(locale8);
        java.lang.String str10 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.LongStream longStream5 = random1.longs(0L);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        random1.setSeed((long) (-1155484576));
        float float6 = random1.nextFloat();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.58921546f + "'", float6 == 0.58921546f);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguage("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("inglese");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ZH-CN", (double) 0.6248076f);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        java.util.Locale locale3 = new java.util.Locale("und", "\u6cd5\u56fd", "en");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd_en");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.util.Random random1 = new java.util.Random((long) (-2113463221));
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien (Italie)", (double) 0.5866872f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italien (italie)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        java.util.Locale locale1 = new java.util.Locale("\u5fb7\u6587");
        org.junit.Assert.assertEquals(locale1.toString(), "\u5fb7\u6587");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        double double13 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream17 = random1.doubles((long) 1593272353, (double) 0.3682968f, (double) 14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random1.ints((long) (-1811023350));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5003138441739008d + "'", double13 == 0.5003138441739008d);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        long long5 = random0.nextLong();
        random0.setSeed((long) (-1332689415));
        java.util.stream.IntStream intStream11 = random0.ints(0L, (-388136581), 1463422709);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 668479933 + "'", int4 == 668479933);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5835610988286850569L + "'", long5 == 5835610988286850569L);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-TW", (double) 0.49201488f);
        boolean boolean4 = languageRange2.equals((java.lang.Object) "\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Random random5 = new java.util.Random((long) 1957295020);
        java.util.stream.IntStream intStream8 = random5.ints((-1140488501), (-290302496));
        boolean boolean9 = locale0.equals((java.lang.Object) (-1140488501));
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German" + "'", str3, "German");
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u97d3\u6587,fra (FRA,fr))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englishunitedkingdom(??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        java.util.Locale locale1 = new java.util.Locale("und");
        java.lang.String str3 = locale1.getExtension('u');
        java.lang.String str4 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "und");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("chinese");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder11 = builder10.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        java.util.Random random1 = new java.util.Random((long) (-144180575));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.numerify("fra (CHINA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra (CHINA,zh,CN)" + "'", str4, "fra (CHINA,zh,CN)");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA", strMap1);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getLanguage();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale locale14 = builder9.build();
        java.lang.String str15 = locale4.getDisplayName(locale14);
        java.lang.String str16 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet17 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList20, strMap21);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList24, (java.util.Collection<java.lang.String>) strSet26);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str32 = java.util.Locale.lookupTag(languageRangeList29, (java.util.Collection<java.lang.String>) strSet31);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags(languageRangeList24, (java.util.Collection<java.lang.String>) strSet31);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder34.setVariant("");
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale.Builder builder38 = builder37.clearExtensions();
        java.util.Locale.Builder builder40 = builder38.setLanguageTag("fr");
        java.util.Locale.Builder builder42 = builder40.setLanguageTag("de");
        java.util.Locale.Builder builder44 = builder42.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale.Category category46 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category46, locale50);
        java.util.Locale.Builder builder52 = builder45.setLocale(locale50);
        java.lang.String str53 = locale50.getScript();
        java.util.Locale.Builder builder54 = builder42.setLocale(locale50);
        java.util.Locale locale55 = builder42.build();
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags(languageRangeList24, (java.util.Collection<java.lang.String>) strSet56);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strSet56);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.FORMAT + "'", category46.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str6 = locale3.getExtension('u');
        java.lang.String str7 = locale3.getDisplayScript();
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        double double5 = random0.nextGaussian();
        java.util.Random random7 = new java.util.Random((long) 1);
        java.util.Random random9 = new java.util.Random((long) (short) 1);
        int int10 = random9.nextInt();
        java.util.stream.LongStream longStream14 = random9.longs(10L, 0L, (long) (short) 100);
        java.util.Random random16 = new java.util.Random(1L);
        java.util.Random random18 = new java.util.Random((long) (short) 1);
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        int int23 = random20.nextInt();
        java.util.stream.DoubleStream doubleStream24 = random20.doubles();
        java.util.stream.IntStream intStream25 = random20.ints();
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream29 = random27.doubles((long) 10);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random27.nextBytes(byteArray33);
        random20.nextBytes(byteArray33);
        random18.nextBytes(byteArray33);
        random16.nextBytes(byteArray33);
        random9.nextBytes(byteArray33);
        random7.nextBytes(byteArray33);
        random0.nextBytes(byteArray33);
        java.util.stream.IntStream intStream41 = random0.ints();
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream44 = random0.longs();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 989064970 + "'", int4 == 989064970);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6608400949529911d + "'", double5 == 1.6608400949529911d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[92, -89, 103]");
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(longStream44);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale5);
        java.util.Random random8 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream9 = random8.ints();
        java.util.stream.DoubleStream doubleStream10 = random8.doubles();
        java.util.stream.IntStream intStream14 = random8.ints(0L, (int) '#', (int) (byte) 100);
        java.util.stream.LongStream longStream16 = random8.longs((long) 1627973114);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale5, random8);
        com.github.javafaker.Hacker hacker18 = faker17.hacker();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(hacker18);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("TWN");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale11.getDisplayName();
        java.util.Locale.Builder builder14 = builder9.setLocale(locale11);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder16.clear();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.util.Locale.Builder builder23 = builder19.setLocale(locale21);
        java.lang.String str24 = locale15.getDisplayCountry(locale21);
        java.lang.String str25 = locale15.getDisplayName();
        java.lang.String str26 = locale15.getScript();
        java.lang.String str27 = locale15.getScript();
        java.lang.String str28 = locale11.getDisplayScript(locale15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French" + "'", str13, "French");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Italian" + "'", str25, "Italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleKeys();
        java.lang.String str11 = locale0.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        java.util.Random random14 = new java.util.Random((long) 0);
        int int16 = random14.nextInt((int) '4');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale0, random14);
        com.github.javafaker.Book book19 = faker18.book();
        com.github.javafaker.Code code20 = faker18.code();
        com.github.javafaker.Options options21 = faker18.options();
        com.github.javafaker.DateAndTime dateAndTime22 = faker18.date();
        java.lang.String str24 = faker18.regexify("EN,CA");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(dateAndTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EN,CA" + "'", str24, "EN,CA");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream9 = random8.longs();
        float float10 = random8.nextFloat();
        java.util.stream.IntStream intStream11 = random8.ints();
        java.util.stream.LongStream longStream15 = random8.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream18 = random8.longs((long) (-266083962), (long) 'a');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0, random8);
        java.lang.String str20 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.29202592f + "'", float10 == 0.29202592f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "French" + "'", str20, "French");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale8);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getCountry();
        java.util.Random random14 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream16 = random14.doubles((long) 10);
        int int17 = random14.nextInt();
        java.util.stream.DoubleStream doubleStream18 = random14.doubles();
        double double19 = random14.nextGaussian();
        int int20 = random14.nextInt();
        double double21 = random14.nextDouble();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale11, random14);
        java.lang.String str23 = locale11.getISO3Language();
        java.util.Locale.Builder builder24 = builder0.setLocale(locale11);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1157793070) + "'", int17 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.3325983427023256d) + "'", double19 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1408064384) + "'", int20 == (-1408064384));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.24411725056425315d + "'", double21 == 0.24411725056425315d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fra" + "'", str23, "fra");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(9);
        java.util.stream.LongStream longStream8 = random1.longs(4233101705359871616L, (long) 486920839, (long) 1791901469);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Number number8 = faker0.number();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker0.phoneNumber();
        com.github.javafaker.Finance finance10 = faker0.finance();
        com.github.javafaker.Lorem lorem11 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(lorem11);
    }
}
