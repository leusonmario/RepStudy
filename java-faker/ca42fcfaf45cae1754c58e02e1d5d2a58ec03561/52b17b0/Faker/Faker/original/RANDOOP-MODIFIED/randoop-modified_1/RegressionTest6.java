import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u6587", (double) 0.13015121f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        random0.setSeed((long) 591553211);
        double double10 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.35780215f + "'", float2 == 0.35780215f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.3824364219884113d) + "'", double10 == (-1.3824364219884113d));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en_ca", (-0.5415416948085652d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.5415416948085652");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.util.Locale locale2 = new java.util.Locale("GBR", "zh,CN");
        org.junit.Assert.assertEquals(locale2.toString(), "gbr_ZH,CN");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.util.Locale locale3 = new java.util.Locale("italien (Italie)", "ITA", "zh_CN");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: italien (italie)_ITA_zh_CN could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italien (italie)_ITA_zh_CN");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Englisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englisch (kanada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Random random4 = new java.util.Random(100L);
        double double5 = random4.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random4.doubles();
        java.util.stream.DoubleStream doubleStream8 = random4.doubles((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6246292191371761d + "'", double5 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ja-JP", (double) 0.75667953f);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("French", strMap4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strSet9);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = java.util.Locale.lookupTag(languageRangeList12, (java.util.Collection<java.lang.String>) strSet14);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strSet14);
        java.lang.String str17 = java.util.Locale.lookupTag(languageRangeList5, (java.util.Collection<java.lang.String>) strList16);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList19, strMap20);
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
        java.util.Locale locale83 = java.util.Locale.lookup(languageRangeList21, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale locale84 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strSet85);
        java.util.Locale locale87 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strSet88);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strList89, filteringMode90);
        boolean boolean92 = languageRange2.equals((java.lang.Object) filteringMode90);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeList21);
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
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode90.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian" + "'", str2, "italian");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        com.github.javafaker.App app8 = faker6.app();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Name name7 = faker0.name();
        com.github.javafaker.Number number8 = faker0.number();
        com.github.javafaker.Options options9 = faker0.options();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder2.build();
        boolean boolean6 = locale5.hasExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.util.Locale locale1 = new java.util.Locale("French");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("deu");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("fr", strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("German");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str14 = languageRange13.getRange();
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] { languageRange13, languageRange17, languageRange20, languageRange23, languageRange26 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder33.setVariant("");
        java.util.Locale locale36 = builder33.build();
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.lang.String str45 = locale40.getDisplayLanguage(locale44);
        java.util.Locale locale46 = java.util.Locale.FRENCH;
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.lang.String str55 = locale50.getDisplayLanguage(locale54);
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.lang.String str61 = locale59.getExtension('x');
        java.util.Locale.setDefault(locale59);
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale locale65 = locale64.stripExtensions();
        java.lang.String str66 = locale65.getISO3Country();
        java.util.Locale locale70 = new java.util.Locale("", "", "");
        java.util.Locale locale74 = new java.util.Locale("", "", "");
        java.lang.String str75 = locale70.getDisplayLanguage(locale74);
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.util.Locale locale82 = new java.util.Locale("hi!");
        java.util.Locale locale84 = new java.util.Locale("hi!");
        java.util.Locale locale85 = locale84.stripExtensions();
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale36, locale40, locale46, locale54, locale59, locale65, locale74, locale77, locale80, locale82, locale84 };
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.Locale.FilteringMode filteringMode89 = null;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList87, filteringMode89);
        java.util.Locale locale91 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList87, filteringMode92);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Locale.FilteringMode filteringMode95 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList94, filteringMode95);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap98 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList99 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap98);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr" + "'", str14, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertEquals(locale82.toString(), "hi!");
        org.junit.Assert.assertEquals(locale84.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(localeList90);
// flaky:         org.junit.Assert.assertNotNull(locale91);
// flaky:         org.junit.Assert.assertEquals(locale91.toString(), "fr");
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode92.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertTrue("'" + filteringMode95 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode95.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(languageRangeList99);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder9 = builder8.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Business business9 = faker5.business();
        com.github.javafaker.Name name10 = faker5.name();
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.Options options12 = faker5.options();
        com.github.javafaker.Lorem lorem13 = faker5.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.util.Locale locale3 = new java.util.Locale("", "\u6cd5\u56fd)", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getDisplayCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd)_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u56fd)" + "'", str4, "\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u56fd)" + "'", str5, "\u6cd5\u56fd)");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.IntStream intStream5 = random1.ints((long) (short) 10);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs((long) 2002825273, (long) (-1458279790));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Address address5 = faker0.address();
        java.lang.String str7 = faker0.numerify("Englisch (Kanada)");
        com.github.javafaker.Company company8 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Englisch (Kanada)" + "'", str7, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.util.Random random1 = new java.util.Random((long) 1370835837);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 1124570179, (double) (-125456132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        com.github.javafaker.Lorem lorem20 = faker19.lorem();
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
        org.junit.Assert.assertNotNull(lorem20);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("cinese (Cina)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: cinese (Cina) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.util.Locale locale3 = new java.util.Locale("en-gb", "Korean (South Korea)", "x-lvariant-zh-CN");
        org.junit.Assert.assertEquals(locale3.toString(), "en-gb_KOREAN (SOUTH KOREA)_x-lvariant-zh-CN");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale.Builder builder9 = builder6.setExtension('x', "FRA");
        java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.addUnicodeLocaleAttribute("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream10 = random0.longs((long) (-266083962), (long) 'a');
        java.util.stream.LongStream longStream14 = random0.longs((long) (byte) 100, (long) (-196947104), (long) (byte) -1);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color17 = faker16.color();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.17121649f + "'", float2 == 0.17121649f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("French");
        java.util.Locale.Builder builder10 = builder7.setExtension('u', "FRA");
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        java.util.Locale locale14 = new java.util.Locale("", "french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.setLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRENCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale14.toString(), "_FRENCH");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        java.lang.String str27 = locale7.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "french" + "'", str27, "french");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.util.Locale locale3 = new java.util.Locale("CA", "en", "JP");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "ca_EN_JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JP" + "'", str4, "JP");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder10 = builder7.setExtension('u', "chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("italien Italie");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: italien Italie [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        java.lang.String str17 = locale6.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "de" + "'", str17, "de");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        long long3 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 977291951);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options7 = faker6.options();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-6139822020582680716L) + "'", long3 == (-6139822020582680716L));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Internet internet5 = faker1.internet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ja");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        com.github.javafaker.App app21 = faker18.app();
        com.github.javafaker.Lorem lorem22 = faker18.lorem();
        com.github.javafaker.Business business23 = faker18.business();
        com.github.javafaker.Number number24 = faker18.number();
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
        org.junit.Assert.assertNotNull(app21);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertNotNull(business23);
        org.junit.Assert.assertNotNull(number24);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        java.lang.String str4 = faker0.numerify("ITA");
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Color color6 = faker0.color();
        com.github.javafaker.Code code7 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Options options6 = faker1.options();
        com.github.javafaker.Options options7 = faker1.options();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        java.lang.Class<?> wildcardClass9 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        java.util.Locale.Builder builder67 = builder66.clear();
        java.util.Locale.Builder builder68 = builder67.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder71 = builder68.setExtension(' ', "cor\351en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
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
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream21 = random1.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-8, 22, 21]");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(longStream21);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!__hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!__hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        java.util.stream.DoubleStream doubleStream13 = random1.doubles();
        boolean boolean14 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.util.Locale locale2 = new java.util.Locale("fra FRA,fr", "und_FRA");
        org.junit.Assert.assertEquals(locale2.toString(), "fra fra,fr_UND_FRA");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str7 = locale4.getISO3Language();
        java.lang.String str8 = locale4.getScript();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.lang.String str19 = locale15.getExtension('a');
        java.util.Set<java.lang.String> strSet20 = locale15.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet21 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale15.getVariant();
        java.util.Set<java.lang.String> strSet23 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale9.getDisplayVariant(locale15);
        java.util.Random random26 = new java.util.Random(0L);
        double double27 = random26.nextGaussian();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale15, random26);
        float float29 = random26.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale4, random26);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.8025330637390305d + "'", double27 == 0.8025330637390305d);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.6374174f + "'", float29 == 0.6374174f);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien (Italie)", (double) 0.44563425f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italien (italie)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.util.Locale locale1 = new java.util.Locale("JPN");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getDisplayScript();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.lang.String str7 = locale1.getDisplayCountry(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "China");
        java.util.Locale.Builder builder12 = builder0.clear();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder16 = builder14.setScript("");
        java.util.Locale.Builder builder18 = builder14.setLanguageTag("jpn");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale locale13 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.lang.String str15 = locale14.getDisplayScript();
        java.lang.String str16 = locale14.getDisplayScript();
        java.util.Locale locale20 = new java.util.Locale("", "", "");
        java.lang.String str22 = locale20.getExtension('x');
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.lang.String str25 = locale20.getDisplayLanguage(locale24);
        java.lang.String str26 = locale24.getDisplayVariant();
        java.lang.String str27 = locale14.getDisplayCountry(locale24);
        java.lang.String str28 = locale13.getDisplayName(locale14);
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.lang.String str32 = locale29.getExtension('x');
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder33.setVariant("");
        java.util.Locale.Builder builder36 = builder33.clear();
        java.util.Locale.Builder builder38 = builder33.setScript("");
        java.util.Locale locale39 = builder33.build();
        java.lang.String str40 = locale29.getDisplayLanguage(locale39);
        java.lang.String str41 = locale14.getDisplayCountry(locale29);
        java.lang.String str42 = locale8.getDisplayCountry(locale29);
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
        org.junit.Assert.assertEquals(locale13.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Japon" + "'", str27, "Japon");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)" + "'", str28, "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chinese" + "'", str40, "Chinese");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u65e5\u672c" + "'", str41, "\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder11 = builder5.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.util.Locale locale87 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder88 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder90 = builder88.setVariant("");
        java.util.Locale.Builder builder91 = builder88.clear();
        java.util.Locale locale92 = builder91.build();
        java.util.Locale locale93 = java.util.Locale.FRENCH;
        java.lang.String str94 = locale93.getLanguage();
        java.util.Locale.Builder builder95 = builder91.setLocale(locale93);
        java.lang.String str96 = locale87.getDisplayCountry(locale93);
        java.lang.String str97 = null; // flaky: locale83.getDisplayScript(locale93);
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
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "it");
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "");
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "fr" + "'", str94, "fr");
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
// flaky:         org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.Locale locale3 = new java.util.Locale("Englisch (Kanada)", "GB", "");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguage("GB");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder14 = builder11.setLanguageTag("de");
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str20 = locale18.getExtension('x');
        java.util.Locale.setDefault(locale18);
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.lang.String str23 = locale18.getDisplayLanguage(locale22);
        java.lang.String str24 = locale18.getISO3Language();
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.lang.String str30 = locale28.getExtension('x');
        java.util.Locale.setDefault(locale28);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale28.getDisplayLanguage(locale32);
        java.lang.String str34 = locale18.getDisplayVariant(locale28);
        boolean boolean35 = locale28.hasExtensions();
        java.util.Locale.setDefault(locale28);
        java.util.Locale.Builder builder37 = builder14.setLocale(locale28);
        java.lang.String str38 = locale3.getDisplayCountry(locale28);
        org.junit.Assert.assertEquals(locale3.toString(), "englisch (kanada)_GB");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "United Kingdom" + "'", str38, "United Kingdom");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.Locale locale3 = new java.util.Locale("TW", "und-FR", "en_ca");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "tw_UND-FR_en_ca");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "tw_UND-FR_en_ca");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "tw_UND-FR_en_ca");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "tw_UND-FR_en_ca");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.util.Random random1 = new java.util.Random((-1501966224973652799L));
        java.util.stream.IntStream intStream3 = random1.ints((long) 1370835837);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.util.Random random1 = new java.util.Random((long) (-1900217354));
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Random random3 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random3.longs();
        java.util.stream.LongStream longStream6 = random3.longs(0L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random3);
        java.util.Random random9 = new java.util.Random(100L);
        java.util.stream.LongStream longStream11 = random9.longs((long) (short) 0);
        java.util.Random random13 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream15 = random13.doubles((long) 10);
        int int16 = random13.nextInt();
        java.util.stream.DoubleStream doubleStream17 = random13.doubles();
        java.util.stream.IntStream intStream18 = random13.ints();
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random20.nextBytes(byteArray26);
        random13.nextBytes(byteArray26);
        random9.nextBytes(byteArray26);
        random3.nextBytes(byteArray26);
        random1.nextBytes(byteArray26);
        java.util.stream.IntStream intStream34 = random1.ints((-592993904), 1699180332);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1157793070) + "'", int16 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-103, -31, 74]");
        org.junit.Assert.assertNotNull(intStream34);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs(0L, 7676145377811632764L);
        int int8 = random1.nextInt(329950233);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 249940428 + "'", int8 == 249940428);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.lang.String str27 = locale7.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "french" + "'", str27, "french");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setLanguage("\u82f1\u6587\u82f1\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Address address9 = faker5.address();
        com.github.javafaker.App app10 = faker5.app();
        com.github.javafaker.Number number11 = faker5.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        java.util.stream.DoubleStream doubleStream13 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random1.ints(329950233, 78707950);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Internet internet4 = faker0.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("ko");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet3 = faker2.internet();
        java.lang.String str5 = faker2.numerify("");
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587", "\u4e2d\u6587", "ita");
        java.lang.String str4 = locale3.getLanguage();
        java.util.Locale locale8 = new java.util.Locale("und", "de", "fr");
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.lang.String str16 = locale9.getDisplayVariant(locale13);
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str18 = locale13.getDisplayScript(locale17);
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = locale8.getDisplayLanguage(locale19);
        java.util.Locale locale24 = new java.util.Locale("FRA", "FRA", "fr");
        java.lang.String str25 = locale24.getDisplayName();
        java.lang.String str26 = locale24.getDisplayLanguage();
        java.lang.String str27 = locale19.getDisplayName(locale24);
        java.lang.String str28 = locale3.getDisplayVariant(locale19);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u4e2d\u6587_ita");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587" + "'", str4, "\u6cd5\u6587");
        org.junit.Assert.assertEquals(locale8.toString(), "und_DE_fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u672a\u5b9a\u8bed\u79cd" + "'", str20, "\u672a\u5b9a\u8bed\u79cd");
        org.junit.Assert.assertEquals(locale24.toString(), "fra_FRA_fr");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fra (FRA,fr)" + "'", str25, "fra (FRA,fr)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fra" + "'", str26, "fra");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ita" + "'", str28, "ita");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.util.Locale locale2 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("zh-cn");
        java.lang.String str6 = locale2.getDisplayVariant(locale5);
        java.util.Locale locale10 = new java.util.Locale("FRA", "FRA", "fr");
        java.util.Locale locale11 = java.util.Locale.JAPAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale16.getISO3Language();
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str28 = locale26.getExtension('x');
        java.util.Locale.setDefault(locale26);
        java.util.Locale locale30 = java.util.Locale.FRENCH;
        java.lang.String str31 = locale26.getDisplayLanguage(locale30);
        java.lang.String str32 = locale16.getDisplayVariant(locale26);
        java.util.Locale locale33 = locale16.stripExtensions();
        java.util.Locale locale34 = locale16.stripExtensions();
        java.lang.String str35 = locale10.getDisplayScript(locale16);
        boolean boolean36 = locale5.equals((java.lang.Object) locale10);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fra (FRA,fr)" + "'", str12, "fra (FRA,fr)");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream5 = random1.ints((long) (short) 1);
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setRegion("");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("CA");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: TW [at index 0]");
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
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.Locale locale2 = new java.util.Locale("x-lvariant-jpn", "jpn");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code4 = faker3.code();
        com.github.javafaker.Book book5 = faker3.book();
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        com.github.javafaker.Company company7 = faker3.company();
        java.lang.String str9 = faker3.letterify("zh-CN");
        com.github.javafaker.Color color10 = faker3.color();
        com.github.javafaker.Number number11 = faker3.number();
        com.github.javafaker.Lorem lorem12 = faker3.lorem();
        com.github.javafaker.Name name13 = faker3.name();
        com.github.javafaker.Book book14 = faker3.book();
        boolean boolean15 = locale2.equals((java.lang.Object) book14);
        org.junit.Assert.assertEquals(locale2.toString(), "x-lvariant-jpn_JPN");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Chinese (China)");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale17.getExtension('x');
        java.lang.String str20 = locale13.getDisplayVariant(locale17);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale17.getDisplayScript(locale21);
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale27.getExtension('x');
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.lang.String str32 = locale27.getDisplayLanguage(locale31);
        java.lang.String str33 = locale17.getDisplayCountry(locale31);
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale17.getDisplayScript(locale34);
        java.lang.String str36 = locale34.getDisplayScript();
        java.util.Set<java.lang.String> strSet37 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale12.getDisplayScript(locale34);
        java.util.Locale.setDefault(category0, locale34);
        java.util.Locale locale40 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random9);
        java.lang.String str18 = faker16.regexify("China");
        java.lang.String str20 = faker16.numerify("Korean (South Korea)");
        com.github.javafaker.Hacker hacker21 = faker16.hacker();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.14260155f + "'", float11 == 0.14260155f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-448990769) + "'", int13 == (-448990769));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "China" + "'", str18, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean (South Korea)" + "'", str20, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(hacker21);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale locale11 = builder5.build();
        java.util.Locale.Builder builder12 = builder5.clear();
        java.util.Locale.Builder builder14 = builder5.setVariant("Japon");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setVariant("DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: DE [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.IntStream intStream9 = random0.ints((long) 1358566768);
        int int10 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) 834941583);
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3347264f + "'", float2 == 0.3347264f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(intStream9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1811023350) + "'", int10 == (-1811023350));
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        java.util.stream.IntStream intStream2 = random1.ints();
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.LongStream longStream5 = random1.longs(0L);
        random1.setSeed((-6316680932552115425L));
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        java.lang.String str15 = locale6.getVariant();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale6);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles(0L);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder15 = builder13.setLanguage("GB");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList17, strMap18);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("und");
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
        java.util.Locale locale85 = java.util.Locale.lookup(languageRangeList23, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter(languageRangeList21, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale locale87 = java.util.Locale.lookup(languageRangeList17, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale.Builder builder88 = builder13.setLocale(locale87);
        java.util.Locale.setDefault(category0, locale87);
        java.util.Locale locale90 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale.setDefault(category0, locale90);
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
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
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "");
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "fr_CA");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getLanguage();
        java.util.Locale.Builder builder8 = builder4.setLocale(locale6);
        java.lang.String str9 = locale0.getDisplayCountry(locale6);
        java.lang.String str10 = locale0.getDisplayName();
        java.lang.String str11 = locale0.getScript();
        java.lang.String str12 = locale0.getScript();
        java.util.Locale locale13 = locale0.stripExtensions();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinook jargon (KOREAN)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinookjargon(korean)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi! (hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi! (hi!)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.util.Locale locale3 = new java.util.Locale("zh-CN", "Twi", "Italienisch");
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cn_TWI_Italienisch");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("und-a-chinese-u-china");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.util.Locale locale3 = new java.util.Locale("Korean (South Korea)", "zh-TW", "\u53f0\u6e7e");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u53f0\u6e7e");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale0);
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
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Internet internet10 = faker9.internet();
        com.github.javafaker.Code code11 = faker9.code();
        com.github.javafaker.Lorem lorem12 = faker9.lorem();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("JAPAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder7.removeUnicodeLocaleAttribute("\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? (??,fr) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "China");
        java.util.Locale.Builder builder12 = builder0.clear();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder16.clear();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.util.Locale.Builder builder23 = builder19.setLocale(locale21);
        java.lang.String str24 = locale15.getDisplayCountry(locale21);
        java.util.Locale.Builder builder25 = builder12.setLocale(locale15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
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
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cinese (Cina)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale1.getDisplayName(locale8);
        java.lang.String str10 = locale8.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder9 = builder5.setRegion("US");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setVariant("gb__Englisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: gb__Englisch (Kanada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("ita");
        com.github.javafaker.App app4 = faker1.app();
        java.lang.String str6 = faker1.bothify("en-gb");
        com.github.javafaker.Hacker hacker7 = faker1.hacker();
        java.lang.String str9 = faker1.bothify("Chinesisch Taiwan");
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        com.github.javafaker.Finance finance11 = faker1.finance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-gb" + "'", str6, "en-gb");
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinesisch Taiwan" + "'", str9, "Chinesisch Taiwan");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.Random random1 = new java.util.Random((-4947896108136290151L));
        float float2 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.85266495f + "'", float2 == 0.85266495f);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = locale10.getDisplayScript(locale14);
        java.util.Locale locale16 = locale14.stripExtensions();
        java.util.Locale.Builder builder17 = builder5.setLocale(locale14);
        java.util.Locale locale20 = new java.util.Locale("de", "Chinese (China)");
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale25.getExtension('x');
        java.lang.String str28 = locale21.getDisplayVariant(locale25);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale29.getLanguage();
        java.lang.String str31 = locale25.getDisplayScript(locale29);
        java.lang.String str32 = locale20.getDisplayVariant(locale29);
        java.util.Locale.Builder builder33 = builder5.setLocale(locale29);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals(locale20.toString(), "de_CHINESE (CHINA)");
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
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.util.Locale locale2 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Locale locale4 = new java.util.Locale("\u6cd5\u6587");
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale4.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertEquals(locale4.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! (CHINESE (CHINA))" + "'", str5, "hi! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.util.Random random1 = new java.util.Random((long) 443638859);
        java.util.stream.LongStream longStream3 = random1.longs((long) 591553211);
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.31297841730090237d + "'", double4 == 0.31297841730090237d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.LongStream longStream6 = random1.longs();
        java.util.stream.IntStream intStream9 = random1.ints((-1142367176), 540195050);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension('x', "\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.util.Locale locale2 = new java.util.Locale("English", "CN");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale7.getDisplayScript(locale11);
        java.util.Locale locale13 = locale11.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str16 = locale11.getDisplayLanguage(locale15);
        java.lang.String str17 = locale11.getDisplayVariant();
        java.lang.String str18 = locale2.getDisplayName(locale11);
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.lang.String str28 = locale22.getISO3Country();
        java.lang.String str29 = locale11.getDisplayName(locale22);
        org.junit.Assert.assertEquals(locale2.toString(), "english_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd)" + "'", str18, "\u4e2d\u56fd)");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese (China)" + "'", str29, "Chinese (China)");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.Number number8 = faker0.number();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.lang.String str10 = locale3.getDisplayVariant();
        java.lang.String str11 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.util.Locale locale3 = new java.util.Locale("hi! (hi!)", "Korean", "und-de (ITALIAN,Chinese (China))");
        org.junit.Assert.assertEquals(locale3.toString(), "hi! (hi!)_KOREAN_und-de (ITALIAN,Chinese (China))");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("us");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("en_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        double double8 = random1.nextDouble();
        int int9 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((long) 1777210702, 784223937, (-1155869325));
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-778209333) + "'", int9 == (-778209333));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream12 = random1.longs(0L);
        random1.setSeed((long) (byte) -1);
        int int15 = random1.nextInt();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1155099827 + "'", int15 == 1155099827);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Address address9 = faker5.address();
        com.github.javafaker.Color color10 = faker5.color();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        com.github.javafaker.Number number12 = faker5.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(number12);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("JPN", (double) 2898173593284639382L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.8981735932846392E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clear();
        java.util.Locale.Builder builder9 = builder0.setVariant("china");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 27);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = random1.nextInt((-1752090028));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getExtension('x');
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet5 = locale0.getExtensionKeys();
        java.util.Random random7 = new java.util.Random((long) (-1950768727));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random7.longs((long) (-1382879107));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale.Builder builder9 = builder6.setExtension('x', "FRA");
        java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder13 = builder6.setLanguage("GB");
        java.util.Locale locale14 = builder13.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "gb__#u-ita-x-fra");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        java.lang.String str8 = locale5.getCountry();
        boolean boolean9 = locale5.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale5.getDisplayVariant(locale10);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale10);
        com.github.javafaker.DateAndTime dateAndTime13 = faker12.date();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateAndTime13);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguage("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("\u53f0\u6e7e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale5.getExtension('x');
        java.lang.String str9 = locale3.getDisplayName(locale5);
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale13.getISO3Country();
        java.util.Locale locale20 = locale13.stripExtensions();
        java.util.Locale.setDefault(locale13);
        java.lang.String str22 = locale3.getDisplayLanguage(locale13);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet25 = locale23.getExtensionKeys();
        java.util.Locale locale29 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str30 = locale23.getDisplayVariant(locale29);
        java.util.Random random31 = new java.util.Random();
        java.util.stream.LongStream longStream32 = random31.longs();
        float float33 = random31.nextFloat();
        java.util.stream.IntStream intStream34 = random31.ints();
        java.util.stream.LongStream longStream38 = random31.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream41 = random31.longs((long) (-266083962), (long) 'a');
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(locale23, random31);
        java.lang.String str43 = locale3.getDisplayVariant(locale23);
        java.lang.String str44 = locale3.toLanguageTag();
        java.lang.String str45 = locale3.toLanguageTag();
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder48 = builder46.setVariant("");
        java.util.Locale.Builder builder50 = builder48.setVariant("");
        java.util.Locale.Builder builder52 = builder48.setLanguage("French");
        java.util.Locale locale53 = builder52.build();
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleKeys();
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.lang.String str61 = locale59.getExtension('x');
        java.lang.String str62 = locale55.getDisplayName(locale59);
        java.lang.String str64 = locale55.getExtension('x');
        java.util.Locale locale66 = new java.util.Locale("fra");
        java.lang.String str67 = locale55.getDisplayScript(locale66);
        java.util.Locale locale68 = locale55.stripExtensions();
        java.lang.String str69 = locale53.getDisplayLanguage(locale68);
        java.lang.String str70 = locale3.getDisplayVariant(locale68);
        java.lang.String str72 = locale68.getExtension('a');
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals(locale29.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.75876874f + "'", float33 == 0.75876874f);
        org.junit.Assert.assertNotNull(intStream34);
        org.junit.Assert.assertNotNull(longStream38);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "und-FR" + "'", str44, "und-FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "und-FR" + "'", str45, "und-FR");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "french");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "French" + "'", str62, "French");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals(locale66.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "french" + "'", str69, "french");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str17 = locale13.getUnicodeLocaleType("fr");
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.setDefault(locale19);
        java.lang.String str22 = locale19.getISO3Language();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale19);
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale.Builder builder28 = builder27.clearExtensions();
        java.util.Locale.Builder builder29 = builder27.clear();
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.lang.String str31 = locale30.getISO3Country();
        java.lang.String str32 = locale30.getDisplayVariant();
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Set<java.lang.Character> charSet36 = locale34.getExtensionKeys();
        java.lang.String str37 = locale34.getCountry();
        java.lang.String str38 = locale30.getDisplayVariant(locale34);
        java.util.Locale.Builder builder39 = builder27.setLocale(locale30);
        java.lang.String str40 = locale30.getDisplayCountry();
        java.lang.String str41 = locale19.getDisplayName(locale30);
        java.util.Locale.setDefault(category0, locale30);
        java.util.Locale locale43 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ita" + "'", str20, "ita");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ita" + "'", str22, "ita");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Italienisch" + "'", str41, "Italienisch");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.util.Locale locale2 = new java.util.Locale("en_GB", "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        java.lang.String str3 = locale2.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder8.build();
        java.util.Locale locale15 = new java.util.Locale("", "", "");
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.lang.String str20 = locale15.getDisplayLanguage(locale19);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.lang.String str30 = locale25.getDisplayLanguage(locale29);
        java.util.Locale locale34 = new java.util.Locale("", "", "");
        java.lang.String str36 = locale34.getExtension('x');
        java.util.Locale.setDefault(locale34);
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale40.getISO3Country();
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.util.Locale locale49 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale45.getDisplayLanguage(locale49);
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale locale60 = locale59.stripExtensions();
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale11, locale15, locale21, locale29, locale34, locale40, locale49, locale52, locale55, locale57, locale59 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.Locale.FilteringMode filteringMode64 = null;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList62, filteringMode64);
        java.util.Locale locale66 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.lang.String str68 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap69);
        java.util.Locale locale74 = new java.util.Locale("", "", "");
        java.lang.String str76 = locale74.getExtension('x');
        java.util.Locale.setDefault(locale74);
        java.util.Locale locale78 = java.util.Locale.FRENCH;
        java.lang.String str79 = locale74.getDisplayLanguage(locale78);
        java.lang.String str80 = locale74.getISO3Language();
        java.util.Locale locale84 = new java.util.Locale("", "", "");
        java.lang.String str86 = locale84.getExtension('x');
        java.util.Locale.setDefault(locale84);
        java.util.Locale locale88 = java.util.Locale.FRENCH;
        java.lang.String str89 = locale84.getDisplayLanguage(locale88);
        java.lang.String str90 = locale74.getDisplayVariant(locale84);
        boolean boolean91 = locale84.hasExtensions();
        java.util.Locale.setDefault(locale84);
        java.util.Set<java.lang.String> strSet93 = locale84.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags(languageRangeList70, (java.util.Collection<java.lang.String>) strSet93, filteringMode94);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList95);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals(locale84.toString(), "");
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode94.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        int int4 = random1.nextInt();
        float float5 = random1.nextFloat();
        java.util.stream.IntStream intStream8 = random1.ints((-144180575), (-3446641));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1193959466) + "'", int4 == (-1193959466));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7346627f + "'", float5 == 0.7346627f);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        java.util.Locale locale15 = new java.util.Locale("en_CA", "FR");
        java.lang.String str16 = locale7.getDisplayLanguage(locale15);
        java.lang.String str17 = locale15.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.9777882f + "'", float3 == 0.9777882f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1857872092) + "'", int5 == (-1857872092));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals(locale15.toString(), "en_ca_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "und-FR" + "'", str17, "und-FR");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.lang.String str10 = locale6.getUnicodeLocaleType("fr");
        java.util.Locale locale11 = locale6.stripExtensions();
        java.lang.String str12 = locale0.getDisplayVariant(locale11);
        java.util.Locale locale15 = new java.util.Locale("de", "Japan");
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str19 = locale16.getExtension('x');
        java.util.Locale locale20 = locale16.stripExtensions();
        java.util.Set<java.lang.Character> charSet21 = locale16.getExtensionKeys();
        java.lang.String str22 = locale15.getDisplayCountry(locale16);
        java.util.Locale locale25 = new java.util.Locale("italien (Italie)", "it");
        java.lang.String str26 = locale15.getDisplayCountry(locale25);
        java.lang.String str27 = locale0.getDisplayVariant(locale25);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder32 = builder30.setVariant("");
        java.util.Locale.Builder builder34 = builder30.setLanguage("French");
        java.util.Locale locale35 = builder34.build();
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.lang.String str37 = locale35.getDisplayScript();
        boolean boolean38 = locale35.hasExtensions();
        java.lang.String str39 = locale0.getDisplayCountry(locale35);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale15.toString(), "de_JAPAN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JAPAN" + "'", str22, "JAPAN");
        org.junit.Assert.assertEquals(locale25.toString(), "italien (italie)_IT");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JAPAN" + "'", str26, "JAPAN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "french");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("cor\351en", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=core?en");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=x-lvariant-jpn(jpn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale11.getISO3Country();
        java.lang.String str13 = locale11.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        java.lang.String str23 = locale22.getISO3Country();
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CHN" + "'", str23, "CHN");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("tw", 0.2227720902128787d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u56fd)", "zh-TW");
        org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u56fd)_ZH-TW");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.util.Random random1 = new java.util.Random(0L);
        double double2 = random1.nextGaussian();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((long) (-1152021836));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
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
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1157793070) + "'", int21 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[56, 81, -39]");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.util.Random random1 = new java.util.Random((long) (-1279776254));
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Hacker hacker8 = faker0.hacker();
        java.lang.String str10 = faker0.numerify("chinois (Chine)");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinois (Chine)" + "'", str10, "chinois (Chine)");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setExtension('a', "hi! ITALIEN ITALIE,fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: hi! ITALIEN ITALIE,fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Address address5 = faker0.address();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream7 = random5.doubles((long) 10);
        int int8 = random5.nextInt();
        java.util.stream.DoubleStream doubleStream9 = random5.doubles();
        java.util.stream.DoubleStream doubleStream11 = random5.doubles(1397386546144374610L);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Internet internet13 = faker12.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.util.Random random1 = new java.util.Random((long) 341469127);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setUnicodeLocaleKeyword("United Kingdom", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale5.getExtension('a');
        java.lang.String str10 = locale5.getDisplayVariant();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale5);
        java.lang.String str13 = faker11.bothify("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        java.util.Set<java.lang.Character> charSet24 = locale21.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet25 = locale21.getExtensionKeys();
        java.lang.String str26 = locale21.getCountry();
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
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        boolean boolean2 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale7 = new java.util.Locale("und");
        java.lang.String str9 = locale7.getExtension('u');
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "und");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "und");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        float float9 = random6.nextFloat();
        java.util.stream.LongStream longStream13 = random6.longs(8838767171837691191L, (long) (-1501435335), (long) 32);
        java.util.stream.DoubleStream doubleStream16 = random6.doubles((double) 0.2583719f, (double) 10L);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25780278f + "'", float9 == 0.25780278f);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = builder7.build();
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str35 = locale33.getExtension('x');
        java.util.Locale.setDefault(locale33);
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale39.getISO3Country();
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str49 = locale44.getDisplayLanguage(locale48);
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.util.Locale locale52 = locale51.stripExtensions();
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale10, locale14, locale20, locale28, locale33, locale39, locale48, locale51, locale54, locale56, locale58 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale.FilteringMode filteringMode63 = null;
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList61, filteringMode63);
        java.util.Locale locale65 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList61);
        java.lang.String str66 = locale65.toLanguageTag();
        java.lang.Object obj67 = locale65.clone();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "und" + "'", str66, "und");
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(locale7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0.22372353f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        float float3 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random0.ints((long) 2, 763927369, (-1429538713));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6026154f + "'", float2 == 0.6026154f);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.55157363f + "'", float3 == 0.55157363f);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("chinois");
        java.util.Locale.Builder builder11 = builder7.addUnicodeLocaleAttribute("francese");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange6, languageRange9, languageRange12, languageRange15 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setVariant("");
        java.util.Locale locale25 = builder22.build();
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale29.getDisplayLanguage(locale33);
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.lang.String str44 = locale39.getDisplayLanguage(locale43);
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale48.getExtension('x');
        java.util.Locale.setDefault(locale48);
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Locale locale54 = locale53.stripExtensions();
        java.lang.String str55 = locale54.getISO3Country();
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.util.Locale locale63 = new java.util.Locale("", "", "");
        java.lang.String str64 = locale59.getDisplayLanguage(locale63);
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.util.Locale locale74 = locale73.stripExtensions();
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale25, locale29, locale35, locale43, locale48, locale54, locale63, locale66, locale69, locale71, locale73 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale.FilteringMode filteringMode78 = null;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList76, filteringMode78);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList76);
        com.github.javafaker.Faker faker81 = null; // flaky: new com.github.javafaker.Faker(locale80);
        boolean boolean82 = false; // flaky: locale80.hasExtensions();
        java.lang.String str84 = null; // flaky: locale80.getExtension('x');
        java.util.Random random86 = new java.util.Random((long) (-1152021836));
        com.github.javafaker.Faker faker87 = null; // flaky: new com.github.javafaker.Faker(locale80, random86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localeList79);
// flaky:         org.junit.Assert.assertNotNull(locale80);
// flaky:         org.junit.Assert.assertEquals(locale80.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = builder7.build();
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str35 = locale33.getExtension('x');
        java.util.Locale.setDefault(locale33);
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale39.getISO3Country();
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str49 = locale44.getDisplayLanguage(locale48);
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.util.Locale locale52 = locale51.stripExtensions();
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale10, locale14, locale20, locale28, locale33, locale39, locale48, locale51, locale54, locale56, locale58 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale.FilteringMode filteringMode63 = null;
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList61, filteringMode63);
        java.util.Locale locale65 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList61);
        java.lang.String str66 = locale65.toLanguageTag();
        java.util.Locale.Category category67 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale68 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet70 = locale68.getExtensionKeys();
        java.util.Locale.setDefault(category67, locale68);
        java.util.Locale locale72 = java.util.Locale.getDefault(category67);
        java.util.Locale locale73 = java.util.Locale.getDefault(category67);
        java.util.Locale locale74 = java.util.Locale.getDefault(category67);
        java.util.Locale locale75 = java.util.Locale.getDefault(category67);
        java.util.Locale.Builder builder76 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder78 = builder76.setVariant("");
        java.util.Locale.Builder builder79 = builder76.clear();
        java.util.Locale.Builder builder81 = builder79.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder82 = builder81.clear();
        java.util.Locale.Builder builder83 = builder81.clearExtensions();
        java.util.Locale locale84 = java.util.Locale.PRC;
        java.lang.String str85 = locale84.getISO3Language();
        java.util.Locale.Builder builder86 = builder83.setLocale(locale84);
        java.util.Locale.setDefault(category67, locale84);
        java.lang.String str88 = locale65.getDisplayName(locale84);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "und" + "'", str66, "und");
        org.junit.Assert.assertTrue("'" + category67 + "' != '" + java.util.Locale.Category.FORMAT + "'", category67.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(charSet70);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "zho" + "'", str85, "zho");
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.util.Locale locale3 = new java.util.Locale("\u610f\u5927\u5229\u6587", "ja", "de");
        java.lang.String str4 = locale3.getScript();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        org.junit.Assert.assertEquals(locale3.toString(), "\u610f\u5927\u5229\u6587_JA_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = builder7.build();
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale14.getDisplayLanguage(locale18);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Locale locale24 = new java.util.Locale("", "", "");
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale24.getDisplayLanguage(locale28);
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str35 = locale33.getExtension('x');
        java.util.Locale.setDefault(locale33);
        java.util.Locale locale38 = new java.util.Locale("hi!");
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale39.getISO3Country();
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str49 = locale44.getDisplayLanguage(locale48);
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.util.Locale locale52 = locale51.stripExtensions();
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale58 = new java.util.Locale("hi!");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale10, locale14, locale20, locale28, locale33, locale39, locale48, locale51, locale54, locale56, locale58 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale.FilteringMode filteringMode63 = null;
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList61, filteringMode63);
        java.util.Locale locale65 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Locale locale66 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet67);
        java.util.Locale.Builder builder69 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder71 = builder69.setVariant("");
        java.util.Locale.Builder builder72 = builder69.clear();
        java.util.Locale locale73 = builder72.build();
        java.util.Locale locale74 = java.util.Locale.FRENCH;
        java.lang.String str75 = locale74.getLanguage();
        java.util.Locale.Builder builder76 = builder72.setLocale(locale74);
        java.util.Locale locale77 = java.util.Locale.ITALY;
        java.util.Random random78 = new java.util.Random();
        java.util.stream.LongStream longStream79 = random78.longs();
        float float80 = random78.nextFloat();
        java.util.stream.IntStream intStream81 = random78.ints();
        int int82 = random78.nextInt();
        com.github.javafaker.Faker faker83 = new com.github.javafaker.Faker(locale77, random78);
        com.github.javafaker.Faker faker84 = new com.github.javafaker.Faker(locale74, random78);
        java.lang.String str85 = locale74.getDisplayName();
        java.util.Set<java.lang.String> strSet86 = locale74.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet86);
        java.util.Locale locale89 = java.util.Locale.forLanguageTag("");
        java.lang.String str90 = locale89.getLanguage();
        java.util.Locale locale91 = locale89.stripExtensions();
        java.util.Set<java.lang.String> strSet92 = locale91.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet92);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "fr" + "'", str75, "fr");
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream79);
// flaky:         org.junit.Assert.assertTrue("'" + float80 + "' != '" + 0.23905742f + "'", float80 == 0.23905742f);
        org.junit.Assert.assertNotNull(intStream81);
// flaky:         org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2025219429 + "'", int82 == 2025219429);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "French" + "'", str85, "French");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "");
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNotNull(strList93);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Language();
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.util.Locale.setDefault(locale13);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale3.getDisplayVariant(locale13);
        boolean boolean20 = locale3.hasExtensions();
        java.lang.String str22 = locale3.getExtension('u');
        java.lang.String str23 = locale3.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayScript();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.Company company9 = faker0.company();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.util.Random random1 = new java.util.Random((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.3952577f, (double) 0.20075262f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder11 = builder7.removeUnicodeLocaleAttribute("JAPAN");
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("Twi");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        java.lang.String str10 = faker0.bothify("und-de (ITALIAN,Chinese (China))");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "und-de (ITALIAN,Chinese (China))" + "'", str10, "und-de (ITALIAN,Chinese (China))");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        random1.setSeed((long) (-1155484576));
        float float6 = random1.nextFloat();
        java.util.stream.IntStream intStream9 = random1.ints((-1192810430), (-1140488501));
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.58921546f + "'", float6 == 0.58921546f);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        long long42 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream46 = random0.doubles((long) 1833922823, 0.0d, (double) 0.8340211f);
        long long47 = random0.nextLong();
        java.util.stream.LongStream longStream49 = random0.longs((long) 431529176);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1416232043) + "'", int4 == (-1416232043));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.46143670913393664d + "'", double5 == 0.46143670913393664d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32, 100, -119]");
        org.junit.Assert.assertNotNull(intStream41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1297134437040710309L + "'", long42 == 1297134437040710309L);
        org.junit.Assert.assertNotNull(doubleStream46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5083023888489526706L + "'", long47 == 5083023888489526706L);
        org.junit.Assert.assertNotNull(longStream49);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Address address9 = faker0.address();
        com.github.javafaker.App app10 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) (-1408064384), (-6274663997757565653L), (long) 341469127);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.95775133f + "'", float2 == 0.95775133f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1008331474) + "'", int4 == (-1008331474));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options4 = faker3.options();
        java.lang.String str6 = faker3.letterify("jpn_HI! (CHINESE (CHINA))");
        com.github.javafaker.Code code7 = faker3.code();
        com.github.javafaker.Book book8 = faker3.book();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jpn_HI! (CHINESE (CHINA))" + "'", str6, "jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = locale21.getExtension('x');
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setVariant("");
        java.util.Locale.Builder builder28 = builder25.clear();
        java.util.Locale.Builder builder30 = builder25.setScript("");
        java.util.Locale locale31 = builder25.build();
        java.lang.String str32 = locale21.getDisplayLanguage(locale31);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale.setDefault(locale21);
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinese" + "'", str32, "Chinese");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.util.Locale locale1 = new java.util.Locale("TWN");
        org.junit.Assert.assertEquals(locale1.toString(), "twn");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str6 = locale4.getExtension('a');
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream11 = random8.longs((long) (-1), (long) (short) 10);
        int int12 = random8.nextInt();
        double double13 = random8.nextGaussian();
        float float14 = random8.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale4, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 142162519 + "'", int12 == 142162519);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.2966659164297334d) + "'", double13 == (-1.2966659164297334d));
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.24965298f + "'", float14 == 0.24965298f);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra (FRA,fr)", (double) 0.93973523f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra (fra,fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.util.Locale locale1 = new java.util.Locale("und_fra (ENGLISH (UNITED KINGDOM))");
        org.junit.Assert.assertEquals(locale1.toString(), "und_fra (english (united kingdom))");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder8 = builder0.setLanguageTag("Japon");
        java.util.Locale.Builder builder10 = builder0.setLanguageTag("italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("JAPAN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: JAPAN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale locale12 = new java.util.Locale("ita", "", "und");
        java.lang.String str13 = locale12.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder5.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale12.toString(), "ita__und");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        boolean boolean9 = locale7.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.getDefault(category9);
        java.util.Random random17 = new java.util.Random();
        java.util.stream.LongStream longStream18 = random17.longs();
        float float19 = random17.nextFloat();
        java.util.stream.IntStream intStream20 = random17.ints();
        int int21 = random17.nextInt();
        random17.setSeed((long) (-1155869325));
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale16, random17);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale5, random17);
        java.lang.String str27 = faker25.bothify("FRA");
        com.github.javafaker.Company company28 = faker25.company();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
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
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.68423945f + "'", float19 == 0.68423945f);
        org.junit.Assert.assertNotNull(intStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1570390798 + "'", int21 == 1570390798);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "FRA" + "'", str27, "FRA");
        org.junit.Assert.assertNotNull(company28);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.lang.String str21 = locale17.getCountry();
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CN" + "'", str21, "CN");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ITA", 0.0d);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        java.util.stream.LongStream longStream7 = random4.longs(0L);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.DateAndTime dateAndTime9 = faker8.date();
        com.github.javafaker.DateAndTime dateAndTime10 = faker8.date();
        java.lang.String str12 = faker8.bothify("\u4e2d\u6587");
        com.github.javafaker.Address address13 = faker8.address();
        boolean boolean14 = languageRange2.equals((java.lang.Object) faker8);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(address13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        java.util.Set<java.lang.String> strSet21 = locale16.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str17 = locale13.getUnicodeLocaleType("fr");
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.setDefault(locale19);
        java.lang.String str22 = locale19.getISO3Language();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale19);
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder24.setVariant("");
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale.Builder builder28 = builder27.clearExtensions();
        java.util.Locale.Builder builder29 = builder27.clear();
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.lang.String str31 = locale30.getISO3Country();
        java.lang.String str32 = locale30.getDisplayVariant();
        java.util.Locale locale34 = new java.util.Locale("hi!");
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Set<java.lang.Character> charSet36 = locale34.getExtensionKeys();
        java.lang.String str37 = locale34.getCountry();
        java.lang.String str38 = locale30.getDisplayVariant(locale34);
        java.util.Locale.Builder builder39 = builder27.setLocale(locale30);
        java.lang.String str40 = locale30.getDisplayCountry();
        java.lang.String str41 = locale19.getDisplayName(locale30);
        java.util.Locale.setDefault(category0, locale30);
        java.util.Set<java.lang.String> strSet43 = locale30.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ita" + "'", str20, "ita");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ita" + "'", str22, "ita");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Italienisch" + "'", str41, "Italienisch");
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet29 = locale27.getExtensionKeys();
        java.util.Locale.setDefault(category26, locale27);
        java.util.Locale locale31 = java.util.Locale.getDefault(category26);
        java.util.Locale locale32 = java.util.Locale.getDefault(category26);
        java.util.Locale locale33 = java.util.Locale.getDefault(category26);
        java.util.Locale locale34 = java.util.Locale.getDefault(category26);
        java.util.Locale locale35 = java.util.Locale.getDefault(category26);
        java.lang.String str36 = locale24.getDisplayScript(locale35);
        java.lang.String str37 = locale35.getDisplayLanguage();
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
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "francese" + "'", str37, "francese");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        java.util.Locale.Builder builder32 = builder13.clearExtensions();
        java.util.Locale locale33 = builder13.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder35 = builder13.removeUnicodeLocaleAttribute("\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: x-lvariant-jpn (JPN,??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ja_JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ja_jp");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Lorem lorem33 = faker32.lorem();
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
// flaky:         org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.40622473f + "'", float23 == 0.40622473f);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNotNull(lorem33);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.IntStream intStream6 = random1.ints((long) 27);
        int int7 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random1.ints(1949998615, (-144180575));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1429538713) + "'", int7 == (-1429538713));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        com.github.javafaker.App app21 = faker20.app();
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1157793070) + "'", int6 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[115, -43, 26]");
        org.junit.Assert.assertNotNull(app21);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        boolean boolean4 = random1.nextBoolean();
        double double5 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random1.nextInt((-442696799));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.3325983427023256d) + "'", double5 == (-1.3325983427023256d));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Color color4 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('u', "Allemagne");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Allemagne [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("chinois");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setRegion("");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("CA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setUnicodeLocaleKeyword("", "zh,cn (ITALIENISCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        int int6 = random0.nextInt((int) '#');
        double double7 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random0.ints((-8322955419528109991L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5717541f + "'", float2 == 0.5717541f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1025935396) + "'", int4 == (-1025935396));
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3147764525059161d + "'", double7 == 0.3147764525059161d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.lang.String str34 = locale21.getVariant();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale21);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.util.Locale locale41 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str42 = locale36.getDisplayName(locale41);
        java.util.Set<java.lang.Character> charSet43 = locale36.getExtensionKeys();
        java.util.Set<java.lang.String> strSet44 = locale36.getUnicodeLocaleKeys();
        java.util.Locale locale45 = locale36.stripExtensions();
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale45.getCountry();
        java.lang.String str48 = locale21.getDisplayVariant(locale45);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals(locale41.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English (United Kingdom)" + "'", str42, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GB" + "'", str47, "GB");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.util.Locale locale2 = new java.util.Locale("deu", "Englisch (Kanada)");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "deu_ENGLISCH (KANADA)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ENGLISCH (KANADA)" + "'", str4, "ENGLISCH (KANADA)");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) (byte) -1, (long) 190001823);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((double) 0.59456676f, (double) 0.7522187f);
        long long9 = random1.nextLong();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-4962768465676381896L) + "'", long9 == (-4962768465676381896L));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Chinese (China)");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale17.getExtension('x');
        java.lang.String str20 = locale13.getDisplayVariant(locale17);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale17.getDisplayScript(locale21);
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale27.getExtension('x');
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.lang.String str32 = locale27.getDisplayLanguage(locale31);
        java.lang.String str33 = locale17.getDisplayCountry(locale31);
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale17.getDisplayScript(locale34);
        java.lang.String str36 = locale34.getDisplayScript();
        java.util.Set<java.lang.String> strSet37 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale12.getDisplayScript(locale34);
        java.util.Locale.setDefault(category0, locale34);
        java.util.Set<java.lang.String> strSet40 = locale34.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder6.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setExtension('#', "X-LVARIANT-JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("chinese");
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder3.build();
        java.util.Locale.Builder builder10 = builder3.removeUnicodeLocaleAttribute("chinese");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.LongStream longStream9 = random8.longs();
        java.util.stream.LongStream longStream11 = random8.longs(0L);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.lang.String str22 = locale20.getDisplayVariant();
        java.lang.String str23 = locale7.getDisplayCountry(locale20);
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale locale25 = java.util.Locale.getDefault(category0);
        java.lang.String str26 = locale25.toString();
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
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chine" + "'", str23, "Chine");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr" + "'", str26, "fr");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.IntStream intStream9 = random1.ints((long) 591553211);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Finance finance11 = faker10.finance();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        int int3 = random1.nextInt(102643840);
        java.util.stream.LongStream longStream4 = random1.longs();
        double double5 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10846315 + "'", int3 == 10846315);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7346627443280227d + "'", double5 == 0.7346627443280227d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        boolean boolean6 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = random1.nextInt((-448990769));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        java.lang.String str53 = faker51.letterify("TWN");
        java.lang.String str55 = faker51.letterify("ko");
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.17646307f + "'", float11 == 0.17646307f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1268696304) + "'", int13 == (-1268696304));
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
// flaky:         org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.12528253f + "'", float27 == 0.12528253f);
        org.junit.Assert.assertNotNull(intStream28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2042992439 + "'", int29 == 2042992439);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "TWN" + "'", str53, "TWN");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ko" + "'", str55, "ko");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ZH-CN", (-0.7806943002401902d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.7806943002401902");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.util.Locale locale2 = new java.util.Locale("fr-FR", "en-GB");
        org.junit.Assert.assertEquals(locale2.toString(), "fr-fr_EN-GB");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.util.Locale locale2 = new java.util.Locale("deu", "Englisch (Kanada)");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: deu_ENGLISCH (KANADA) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "deu_ENGLISCH (KANADA)");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("us");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        java.lang.String str7 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.Book book9 = faker0.book();
        com.github.javafaker.Color color10 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int3 = random1.nextInt();
        random1.setSeed(736442293137335911L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1155869325) + "'", int3 == (-1155869325));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-682588711), (double) 0.113836765f);
        java.util.stream.IntStream intStream13 = random0.ints((-509927405), 2088989465);
        java.util.Random random15 = new java.util.Random((long) (short) 0);
        int int16 = random15.nextInt();
        java.util.stream.LongStream longStream18 = random15.longs((long) '4');
        java.util.stream.DoubleStream doubleStream19 = random15.doubles();
        java.util.stream.DoubleStream doubleStream20 = random15.doubles();
        java.util.Random random21 = new java.util.Random();
        java.util.stream.LongStream longStream24 = random21.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream26 = random21.doubles((long) '#');
        java.util.Random random28 = new java.util.Random(1L);
        java.util.Random random30 = new java.util.Random((long) (short) 1);
        java.util.Random random32 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream34 = random32.doubles((long) 10);
        int int35 = random32.nextInt();
        java.util.stream.DoubleStream doubleStream36 = random32.doubles();
        java.util.stream.IntStream intStream37 = random32.ints();
        java.util.Random random39 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream41 = random39.doubles((long) 10);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random39.nextBytes(byteArray45);
        random32.nextBytes(byteArray45);
        random30.nextBytes(byteArray45);
        random28.nextBytes(byteArray45);
        random21.nextBytes(byteArray45);
        random15.nextBytes(byteArray45);
        random0.nextBytes(byteArray45);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.68982065f + "'", float2 == 0.68982065f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1900279551) + "'", int4 == (-1900279551));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1155484576) + "'", int16 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(doubleStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1157793070) + "'", int35 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(intStream37);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[104, -65, 25]");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange6, languageRange9, languageRange12, languageRange15 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setVariant("");
        java.util.Locale locale25 = builder22.build();
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale29.getDisplayLanguage(locale33);
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.lang.String str44 = locale39.getDisplayLanguage(locale43);
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale48.getExtension('x');
        java.util.Locale.setDefault(locale48);
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Locale locale54 = locale53.stripExtensions();
        java.lang.String str55 = locale54.getISO3Country();
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.util.Locale locale63 = new java.util.Locale("", "", "");
        java.lang.String str64 = locale59.getDisplayLanguage(locale63);
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.util.Locale locale74 = locale73.stripExtensions();
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale25, locale29, locale35, locale43, locale48, locale54, locale63, locale66, locale69, locale71, locale73 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale.FilteringMode filteringMode78 = null;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList76, filteringMode78);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList76);
        com.github.javafaker.Faker faker81 = null; // flaky: new com.github.javafaker.Faker(locale80);
        java.lang.String str82 = null; // flaky: locale80.getLanguage();
        boolean boolean83 = false; // flaky: locale80.hasExtensions();
        java.util.Set<java.lang.Character> charSet84 = null; // flaky: locale80.getExtensionKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localeList79);
// flaky:         org.junit.Assert.assertNotNull(locale80);
// flaky:         org.junit.Assert.assertEquals(locale80.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "fr" + "'", str82, "fr");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
// flaky:         org.junit.Assert.assertNotNull(charSet84);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = locale29.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for GERMAN");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.Random random4 = new java.util.Random((long) (short) 0);
        int int5 = random4.nextInt();
        java.util.stream.LongStream longStream7 = random4.longs((long) '4');
        random4.setSeed((long) 1408303951);
        java.util.Random random10 = new java.util.Random();
        java.util.stream.LongStream longStream13 = random10.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream15 = random10.doubles((long) '#');
        java.util.Random random17 = new java.util.Random(1L);
        java.util.Random random19 = new java.util.Random((long) (short) 1);
        java.util.Random random21 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream23 = random21.doubles((long) 10);
        int int24 = random21.nextInt();
        java.util.stream.DoubleStream doubleStream25 = random21.doubles();
        java.util.stream.IntStream intStream26 = random21.ints();
        java.util.Random random28 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream30 = random28.doubles((long) 10);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random28.nextBytes(byteArray34);
        random21.nextBytes(byteArray34);
        random19.nextBytes(byteArray34);
        random17.nextBytes(byteArray34);
        random10.nextBytes(byteArray34);
        random4.nextBytes(byteArray34);
        random1.nextBytes(byteArray34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1155484576) + "'", int5 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1157793070) + "'", int24 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-40, -100, -72]");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("us");
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 27);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Book book6 = faker4.book();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = locale6.getLanguage();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder11 = builder8.clear();
        java.util.Locale locale12 = builder11.build();
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale13.getLanguage();
        java.util.Locale.Builder builder15 = builder11.setLocale(locale13);
        java.util.Locale locale16 = builder11.build();
        java.lang.String str17 = locale6.getDisplayName(locale16);
        java.lang.String str18 = locale3.getDisplayLanguage(locale16);
        java.lang.Class<?> wildcardClass19 = locale16.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr" + "'", str14, "fr");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.Random random7 = new java.util.Random((long) (short) 0);
        int int8 = random7.nextInt();
        java.util.stream.LongStream longStream10 = random7.longs((long) '4');
        long long11 = random7.nextLong();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet15 = locale13.getExtensionKeys();
        java.util.Locale.setDefault(category12, locale13);
        java.util.Random random18 = new java.util.Random((long) (byte) 10);
        long long19 = random18.nextLong();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale13, random18);
        double double21 = random18.nextDouble();
        java.util.stream.LongStream longStream23 = random18.longs(10L);
        java.util.Random random25 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream26 = random25.ints();
        java.util.stream.LongStream longStream29 = random25.longs((long) (byte) -1, (long) 190001823);
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.util.Random random31 = new java.util.Random();
        java.util.stream.LongStream longStream32 = random31.longs();
        java.util.stream.LongStream longStream34 = random31.longs(0L);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale30, random31);
        java.util.Random random37 = new java.util.Random(100L);
        java.util.stream.LongStream longStream39 = random37.longs((long) (short) 0);
        java.util.Random random41 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream43 = random41.doubles((long) 10);
        int int44 = random41.nextInt();
        java.util.stream.DoubleStream doubleStream45 = random41.doubles();
        java.util.stream.IntStream intStream46 = random41.ints();
        java.util.Random random48 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream50 = random48.doubles((long) 10);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random48.nextBytes(byteArray54);
        random41.nextBytes(byteArray54);
        random37.nextBytes(byteArray54);
        random31.nextBytes(byteArray54);
        random25.nextBytes(byteArray54);
        int int60 = random25.nextInt();
        java.util.Random random62 = new java.util.Random((long) (-1900217354));
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.util.Random random64 = new java.util.Random();
        java.util.stream.LongStream longStream65 = random64.longs();
        java.util.stream.LongStream longStream67 = random64.longs(0L);
        com.github.javafaker.Faker faker68 = new com.github.javafaker.Faker(locale63, random64);
        java.util.Random random70 = new java.util.Random(100L);
        java.util.stream.LongStream longStream72 = random70.longs((long) (short) 0);
        java.util.Random random74 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream76 = random74.doubles((long) 10);
        int int77 = random74.nextInt();
        java.util.stream.DoubleStream doubleStream78 = random74.doubles();
        java.util.stream.IntStream intStream79 = random74.ints();
        java.util.Random random81 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream83 = random81.doubles((long) 10);
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random81.nextBytes(byteArray87);
        random74.nextBytes(byteArray87);
        random70.nextBytes(byteArray87);
        random64.nextBytes(byteArray87);
        random62.nextBytes(byteArray87);
        random25.nextBytes(byteArray87);
        random18.nextBytes(byteArray87);
        random7.nextBytes(byteArray87);
        random1.nextBytes(byteArray87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1155484576) + "'", int8 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3109364765729502342L) + "'", long11 == (-3109364765729502342L));
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-4972683369271453960L) + "'", long19 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2578027905957804d + "'", double21 == 0.2578027905957804d);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream32);
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertNotNull(longStream39);
        org.junit.Assert.assertNotNull(doubleStream43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1157793070) + "'", int44 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream45);
        org.junit.Assert.assertNotNull(intStream46);
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[96, -76, 32]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-723955400) + "'", int60 == (-723955400));
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream65);
        org.junit.Assert.assertNotNull(longStream67);
        org.junit.Assert.assertNotNull(longStream72);
        org.junit.Assert.assertNotNull(doubleStream76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1157793070) + "'", int77 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream78);
        org.junit.Assert.assertNotNull(intStream79);
        org.junit.Assert.assertNotNull(doubleStream83);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[56, 81, -39]");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        random1.setSeed((-4757019160717151369L));
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options9 = faker8.options();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.lang.String str8 = faker6.bothify("");
        com.github.javafaker.Hacker hacker9 = faker6.hacker();
        java.lang.Class<?> wildcardClass10 = faker6.getClass();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet29 = locale27.getExtensionKeys();
        java.util.Locale.setDefault(category26, locale27);
        java.util.Locale locale31 = java.util.Locale.getDefault(category26);
        java.util.Locale locale32 = java.util.Locale.getDefault(category26);
        java.util.Locale locale33 = java.util.Locale.getDefault(category26);
        java.util.Locale locale34 = java.util.Locale.getDefault(category26);
        java.util.Locale locale35 = java.util.Locale.getDefault(category26);
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale38 = null;
        java.lang.String str39 = null; // flaky: locale37.getDisplayScript(locale38);
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet43 = locale41.getExtensionKeys();
        java.util.Locale.setDefault(category40, locale41);
        java.util.Locale locale45 = java.util.Locale.getDefault(category40);
        java.lang.String str47 = locale45.getExtension('a');
        java.lang.String str48 = locale45.getCountry();
        boolean boolean49 = locale45.hasExtensions();
        java.lang.String str50 = locale37.getDisplayScript(locale45);
        java.util.Locale.setDefault(category26, locale45);
        java.lang.String str52 = locale23.getDisplayScript(locale45);
        java.util.Locale.setDefault(locale45);
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
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder10 = builder8.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder12 = builder8.setLanguageTag("TW");
        java.util.Locale.Builder builder14 = builder8.setLanguage("en");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setLanguage("en,CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en,CA [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        java.lang.String str34 = locale21.getVariant();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale21);
        java.lang.String str36 = locale21.getDisplayName();
        java.util.Locale locale37 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        java.util.Locale locale42 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str43 = locale37.getDisplayName(locale42);
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(locale37);
        java.lang.String str45 = locale21.getDisplayScript(locale37);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English" + "'", str36, "English");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals(locale42.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "English (United Kingdom)" + "'", str43, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Business business8 = faker0.business();
        java.lang.String str10 = faker0.letterify("italien (Italie)");
        com.github.javafaker.Book book11 = faker0.book();
        com.github.javafaker.Business business12 = faker0.business();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien (Italie)" + "'", str10, "italien (Italie)");
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        long long9 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream13 = random1.doubles((long) 1715556003, (double) 0.49201488f, (double) 0.8449292f);
        java.util.stream.DoubleStream doubleStream14 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8220501950349663546L + "'", long9 == 8220501950349663546L);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.util.Random random1 = new java.util.Random((long) 1957295020);
        long long2 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs(4332063390427078244L, (long) (-1083682081));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7401099607487150525L + "'", long2 == 7401099607487150525L);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.util.Random random1 = new java.util.Random(6875854121430089799L);
        long long2 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8040985019838370092L) + "'", long2 == (-8040985019838370092L));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        random1.setSeed((long) 'a');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("french");
        java.util.Locale.Builder builder9 = builder5.setRegion("US");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        java.lang.String str20 = locale6.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.util.Random random1 = new java.util.Random((long) 14);
        random1.setSeed((long) (-1152021836));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.util.Locale locale3 = new java.util.Locale("GB", "", "Englisch (Kanada)");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream8 = random6.doubles((long) 10);
        int int9 = random6.nextInt();
        java.util.stream.DoubleStream doubleStream10 = random6.doubles();
        double double11 = random6.nextGaussian();
        int int12 = random6.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: gb__Englisch (Kanada) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "gb__Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gb" + "'", str4, "gb");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1157793070) + "'", int9 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.3325983427023256d) + "'", double11 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1408064384) + "'", int12 == (-1408064384));
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", (double) 0.61037153f);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6103715300559998d + "'", double3 == 0.6103715300559998d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6103715300559998d + "'", double4 == 0.6103715300559998d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("gb");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale locale10 = builder6.build();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder15 = builder12.clear();
        java.util.Locale locale16 = builder15.build();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str20 = locale16.getUnicodeLocaleType("fr");
        java.lang.String str21 = locale16.getISO3Language();
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale25.getExtension('x');
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale25.getDisplayLanguage(locale29);
        java.lang.String str31 = locale25.getISO3Language();
        java.lang.String str32 = locale16.getDisplayCountry(locale25);
        java.util.Set<java.lang.Character> charSet33 = locale16.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale16);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "gb");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charSet33);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.util.Locale locale3 = new java.util.Locale("CA", "en", "JP");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "ca_EN_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Catalan (EN,JP)" + "'", str4, "Catalan (EN,JP)");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.util.Locale locale3 = new java.util.Locale("und", "de", "fr");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale8.getExtension('x');
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale8.getDisplayScript(locale12);
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.String str15 = locale3.getDisplayLanguage(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale3.getUnicodeLocaleType("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "und_DE_fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u672a\u5b9a\u8bed\u79cd" + "'", str15, "\u672a\u5b9a\u8bed\u79cd");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.util.Locale locale3 = new java.util.Locale("ita", "", "\u6cd5\u56fd");
        java.lang.String str4 = locale3.getLanguage();
        java.lang.String str5 = locale3.getDisplayCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Business business8 = faker0.business();
        java.lang.String str10 = faker0.regexify("italien (Italie)");
        com.github.javafaker.PhoneNumber phoneNumber11 = faker0.phoneNumber();
        com.github.javafaker.Address address12 = faker0.address();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien Italie" + "'", str10, "italien Italie");
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.Random random3 = new java.util.Random((long) (short) 1);
        int int4 = random3.nextInt();
        java.util.stream.LongStream longStream8 = random3.longs(10L, 0L, (long) (short) 100);
        java.util.Random random10 = new java.util.Random(1L);
        java.util.Random random12 = new java.util.Random((long) (short) 1);
        java.util.Random random14 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream16 = random14.doubles((long) 10);
        int int17 = random14.nextInt();
        java.util.stream.DoubleStream doubleStream18 = random14.doubles();
        java.util.stream.IntStream intStream19 = random14.ints();
        java.util.Random random21 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream23 = random21.doubles((long) 10);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random21.nextBytes(byteArray27);
        random14.nextBytes(byteArray27);
        random12.nextBytes(byteArray27);
        random10.nextBytes(byteArray27);
        random3.nextBytes(byteArray27);
        random1.nextBytes(byteArray27);
        random1.setSeed((long) 1107254586);
        long long36 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream40 = random1.longs((long) (-370182532), (long) (-1434703326), (long) 795965107);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1155869325) + "'", int4 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1157793070) + "'", int17 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[115, -43, 26]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 8838767171837691191L + "'", long36 == 8838767171837691191L);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        com.github.javafaker.Finance finance52 = faker51.finance();
        com.github.javafaker.Name name53 = faker51.name();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.43294257f + "'", float11 == 0.43294257f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-623860862) + "'", int13 == (-623860862));
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
// flaky:         org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5388633f + "'", float27 == 0.5388633f);
        org.junit.Assert.assertNotNull(intStream28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2113463221) + "'", int29 == (-2113463221));
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
        org.junit.Assert.assertNotNull(finance52);
        org.junit.Assert.assertNotNull(name53);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        boolean boolean3 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u6587", 0.488075386492554d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.util.Locale locale3 = new java.util.Locale("italien Italie", "hi! ITALIEN ITALIE,fr", "fra FRA,fr");
        org.junit.Assert.assertEquals(locale3.toString(), "italien italie_HI! ITALIEN ITALIE,FR_fra FRA,fr");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.util.Random random1 = new java.util.Random(9107572003475254883L);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.util.Locale locale2 = new java.util.Locale("hi!", "x-lvariant-fr");
        java.lang.String str3 = locale2.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!_X-LVARIANT-FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_X-LVARIANT-FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UNDETERMINED");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=undetermined");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.util.Locale locale2 = new java.util.Locale("_FR", "Chinese (China)");
        org.junit.Assert.assertEquals(locale2.toString(), "_fr_CHINESE (CHINA)");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.util.Locale locale2 = new java.util.Locale("", "x-lvariant-JPN");
        java.lang.String str3 = locale2.getCountry();
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "_X-LVARIANT-JPN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "X-LVARIANT-JPN" + "'", str3, "X-LVARIANT-JPN");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "_X-LVARIANT-JPN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "_X-LVARIANT-JPN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "_X-LVARIANT-JPN");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.util.Locale locale3 = new java.util.Locale("chinois (Chine)", "Chinese", "zh_CN");
        org.junit.Assert.assertEquals(locale3.toString(), "chinois (chine)_CHINESE_zh_CN");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale5.getExtension('a');
        boolean boolean10 = locale5.hasExtensions();
        java.lang.Class<?> wildcardClass11 = locale5.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u6587,fran\347ais)", (double) 0.42169613f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=twn (??,franc?ais)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder11 = builder5.setLanguage("ita");
        java.util.Locale.Builder builder12 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder5.setVariant("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FR");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8852285028135743d + "'", double7 == 0.8852285028135743d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("inglese", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder14 = builder12.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.PhoneNumber phoneNumber6 = faker5.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setScript("\u53f0\u6e7e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream53 = random6.ints((-7145214100349226740L), 329950233, (-1564740387));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese" + "'", str2, "francese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1695124598) + "'", int11 == (-1695124598));
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.30317408797945067d) + "'", double12 == (-0.30317408797945067d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1155869325) + "'", int17 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1157793070) + "'", int30 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-61, -42, 100]");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        java.util.Random random10 = new java.util.Random(8220501950349663546L);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random10);
        random10.setSeed((long) (-1142367176));
        random10.setSeed((long) 1447301737);
        java.util.stream.DoubleStream doubleStream19 = random10.doubles(1732584844371194899L, (double) (-4797905507370029140L), (double) 0.5485702f);
        java.util.stream.DoubleStream doubleStream22 = random10.doubles(0.31297841730090237d, (double) 0.55340016f);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(doubleStream22);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.setScript("");
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder11 = builder6.setExtension('u', "");
        java.util.Locale.Builder builder14 = builder11.setExtension('u', "");
        java.util.Locale locale15 = builder11.build();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = builder18.build();
        java.lang.String str21 = locale15.getDisplayVariant(locale20);
        java.util.Locale locale25 = new java.util.Locale("", "", "");
        java.lang.String str26 = locale20.getDisplayLanguage(locale25);
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet30 = locale28.getExtensionKeys();
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale locale32 = java.util.Locale.getDefault(category27);
        java.util.Locale locale33 = java.util.Locale.getDefault(category27);
        java.util.Locale locale34 = java.util.Locale.getDefault(category27);
        java.util.Locale locale35 = java.util.Locale.getDefault(category27);
        java.util.Locale locale36 = java.util.Locale.getDefault(category27);
        java.lang.String str37 = locale25.getDisplayScript(locale36);
        java.util.Set<java.lang.String> strSet38 = locale25.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale25);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Address address9 = faker5.address();
        com.github.javafaker.Color color10 = faker5.color();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        com.github.javafaker.Code code12 = faker5.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        java.lang.String str11 = locale5.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en_CA" + "'", str11, "en_CA");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-cn");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Code code10 = faker9.code();
        com.github.javafaker.Color color11 = faker9.color();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        java.lang.String str25 = locale0.getUnicodeLocaleType("it");
        java.util.Set<java.lang.Character> charSet26 = locale0.getExtensionKeys();
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(charSet26);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.Business business3 = faker0.business();
        java.lang.String str5 = faker0.bothify("\u53f0\u6e7e");
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u53f0\u6e7e" + "'", str5, "\u53f0\u6e7e");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.util.Random random1 = new java.util.Random((long) 1839438880);
        int int2 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1101314636) + "'", int2 == (-1101314636));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("X-LVARIANT-JPN");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str17 = locale6.getDisplayScript(locale16);
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        float float7 = random1.nextFloat();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime9 = faker8.date();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.44563425f + "'", float7 == 0.44563425f);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Book book9 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime10 = faker0.date();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh,CN", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh,cn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder10 = builder6.setLanguage("italian");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        float float9 = random1.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.67215943f + "'", float9 == 0.67215943f);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale5.getExtension('a');
        java.util.Set<java.lang.String> strSet10 = locale5.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet11 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale5.getDisplayScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.App app4 = faker0.app();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(app4);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber();
        com.github.javafaker.Options options8 = faker0.options();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        double double3 = random1.nextGaussian();
        java.util.stream.IntStream intStream6 = random1.ints((-936032634), 302228106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8673886034754649d) + "'", double3 == (-0.8673886034754649d));
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 673324482, 0.0d, 0.8314409887870612d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) (-1030689906));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.util.Locale locale3 = new java.util.Locale("\u5fb7\u6587", "Catalan (EN,JP)", "Chinese (China)");
        org.junit.Assert.assertEquals(locale3.toString(), "\u5fb7\u6587_CATALAN (EN,JP)_Chinese (China)");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.util.Locale locale1 = new java.util.Locale("gb__Englisch (Kanada)");
        org.junit.Assert.assertEquals(locale1.toString(), "gb__englisch (kanada)");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        double double3 = random1.nextDouble();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6671595726539502d + "'", double3 == 0.6671595726539502d);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.util.Locale locale2 = new java.util.Locale("Twi", "fr_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "twi_FR_CA");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.util.Locale locale2 = new java.util.Locale("\u610f\u5927\u5229\u6587", "_FR");
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "\u610f\u5927\u5229\u6587__FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random1.doubles((long) (-1042906082));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        java.lang.String str28 = locale23.getISO3Country();
        java.lang.Object obj29 = locale23.clone();
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
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "en");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd)");
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.util.Random random3 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random3.longs();
        float float5 = random3.nextFloat();
        java.util.stream.IntStream intStream6 = random3.ints();
        int int7 = random3.nextInt();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2, random3);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.lang.String str11 = locale2.getDisplayName(locale9);
        java.lang.String str12 = locale1.getDisplayCountry(locale9);
        java.lang.String str13 = locale9.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.49520653f + "'", float5 == 0.49520653f);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 273491855 + "'", int7 == 273491855);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italien (Italie)" + "'", str11, "italien (Italie)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.util.Locale locale1 = new java.util.Locale("fra (FRA,fr)");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra (fra,fr) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "fra (fra,fr)");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale11 = new java.util.Locale("Italienisch", "JAPAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: italienisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale11.toString(), "italienisch_JAPAN");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        java.util.Locale locale59 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str60 = locale54.getDisplayName(locale59);
        java.util.Set<java.lang.String> strSet61 = locale54.getUnicodeLocaleAttributes();
        java.lang.String str62 = java.util.Locale.lookupTag(languageRangeList53, (java.util.Collection<java.lang.String>) strSet61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList53, strMap63);
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder67 = builder65.setVariant("");
        java.util.Locale.Builder builder68 = builder65.clear();
        java.util.Locale.Builder builder70 = builder65.setScript("");
        java.util.Locale.Builder builder72 = builder70.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder75 = builder70.setExtension('u', "");
        java.util.Locale.Builder builder78 = builder75.setExtension('u', "");
        java.util.Locale locale79 = builder75.build();
        java.util.Locale.Builder builder80 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder82 = builder80.setVariant("");
        java.util.Locale.Builder builder83 = builder82.clearExtensions();
        java.util.Locale locale84 = builder82.build();
        java.lang.String str85 = locale79.getDisplayVariant(locale84);
        java.util.Locale locale89 = new java.util.Locale("", "", "");
        java.lang.String str90 = locale84.getDisplayLanguage(locale89);
        java.util.Locale locale93 = new java.util.Locale("zh-cn", "");
        java.lang.String str95 = locale93.getExtension('x');
        java.lang.String str96 = locale89.getDisplayName(locale93);
        java.util.Set<java.lang.String> strSet97 = locale93.getUnicodeLocaleKeys();
        java.lang.String str98 = java.util.Locale.lookupTag(languageRangeList53, (java.util.Collection<java.lang.String>) strSet97);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals(locale59.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "English (United Kingdom)" + "'", str60, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals(locale93.toString(), "zh-cn");
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book2 = faker1.book();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Number number4 = faker1.number();
        com.github.javafaker.Color color5 = faker1.color();
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.util.Random random1 = new java.util.Random((long) 161103366);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale4.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        java.lang.String str5 = faker0.numerify("fra");
        com.github.javafaker.Address address6 = faker0.address();
        java.lang.String str8 = faker0.numerify("TWN");
        com.github.javafaker.Options options9 = faker0.options();
        java.lang.Class<?> wildcardClass10 = options9.getClass();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TWN" + "'", str8, "TWN");
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale7 = new java.util.Locale("English United Kingdom", "zh-CN", "JPN");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder11.setVariant("");
        java.util.Locale.Builder builder15 = builder11.setVariant("");
        java.util.Locale locale16 = builder15.build();
        java.util.Locale locale19 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str20 = locale16.getDisplayCountry(locale19);
        java.util.Set<java.lang.Character> charSet21 = locale19.getExtensionKeys();
        java.lang.String str22 = locale7.getDisplayLanguage(locale19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals(locale7.toString(), "english united kingdom_ZH-CN_JPN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JPN" + "'", str8, "JPN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale19.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english united kingdom" + "'", str22, "english united kingdom");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Lorem lorem6 = faker0.lorem();
        java.lang.String str8 = faker0.letterify("ITA");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.bothify("English (United Kingdom)");
        com.github.javafaker.Finance finance8 = faker0.finance();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        java.lang.String str11 = faker0.regexify("chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English (United Kingdom)" + "'", str7, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chinese" + "'", str11, "chinese");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Locale locale10 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale10.getExtension('x');
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = locale10.getDisplayScript(locale14);
        java.util.Locale locale16 = locale14.stripExtensions();
        java.util.Locale.Builder builder17 = builder5.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setScript("ENGLISCH (KANADA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ENGLISCH (KANADA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jpn" + "'", str3, "jpn");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        random0.setSeed((long) (short) 0);
        double double10 = random0.nextDouble();
        java.util.stream.LongStream longStream13 = random0.longs((long) (-750638973), (long) (-217432450));
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7659389f + "'", float2 == 0.7659389f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.730967787376657d + "'", double10 == 0.730967787376657d);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        long long5 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random0.longs((long) (-1192810430));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-896721136) + "'", int4 == (-896721136));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3817431693179227903L) + "'", long5 == (-3817431693179227903L));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Number number8 = faker0.number();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker0.phoneNumber();
        java.lang.String str11 = faker0.letterify("en-gb");
        com.github.javafaker.Color color12 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-gb" + "'", str11, "en-gb");
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.util.Random random1 = new java.util.Random((long) (-1273295515));
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.40622473f, (double) 0.8884572f);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream8 = random1.longs();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.util.Random random1 = new java.util.Random((-4797905507370029140L));
        double double2 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((long) 34, (long) (-767083982), (long) (-1608557193));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8745976545831446d + "'", double2 == 0.8745976545831446d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        int int3 = random1.nextInt(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.util.Locale locale2 = new java.util.Locale("Italienisch", "");
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "italienisch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        java.util.Locale locale18 = new java.util.Locale("", "fr", "");
        java.lang.String str19 = locale18.getISO3Country();
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str23 = locale20.getExtension('x');
        java.lang.String str24 = locale18.getDisplayName(locale20);
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale28.getDisplayLanguage(locale32);
        java.lang.String str34 = locale28.getISO3Country();
        java.util.Locale locale35 = locale28.stripExtensions();
        java.util.Locale.setDefault(locale28);
        java.lang.String str37 = locale18.getDisplayLanguage(locale28);
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet40 = locale38.getExtensionKeys();
        java.util.Locale locale44 = new java.util.Locale("CN", "zh-TW", "en_CA");
        java.lang.String str45 = locale38.getDisplayVariant(locale44);
        java.util.Random random46 = new java.util.Random();
        java.util.stream.LongStream longStream47 = random46.longs();
        float float48 = random46.nextFloat();
        java.util.stream.IntStream intStream49 = random46.ints();
        java.util.stream.LongStream longStream53 = random46.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream56 = random46.longs((long) (-266083962), (long) 'a');
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(locale38, random46);
        java.lang.String str58 = locale18.getDisplayVariant(locale38);
        java.lang.String str59 = locale1.getDisplayScript(locale18);
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
        org.junit.Assert.assertEquals(locale18.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FRA" + "'", str19, "FRA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u6cd5\u56fd" + "'", str24, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals(locale44.toString(), "cn_ZH-TW_en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(longStream47);
// flaky:         org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.23248905f + "'", float48 == 0.23248905f);
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(longStream53);
        org.junit.Assert.assertNotNull(longStream56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale4.getDisplayScript(locale8);
        java.util.Set<java.lang.String> strSet11 = locale4.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u8a9e", "English (United Kingdom)", "fr");
        boolean boolean4 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e_ENGLISH (UNITED KINGDOM)_fr");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.lang.String str23 = locale21.getExtension('x');
        java.util.Locale.setDefault(locale21);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.lang.String str26 = locale21.getDisplayLanguage(locale25);
        java.lang.String str27 = locale21.getISO3Language();
        java.util.Locale locale31 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale31.getExtension('x');
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.lang.String str36 = locale31.getDisplayLanguage(locale35);
        java.lang.String str37 = locale21.getDisplayVariant(locale31);
        boolean boolean38 = locale21.hasExtensions();
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder42 = builder40.setVariant("");
        java.util.Locale.Builder builder43 = builder40.clear();
        java.util.Locale.Builder builder45 = builder40.setScript("");
        java.util.Locale.Builder builder47 = builder45.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder50 = builder45.setExtension('u', "");
        java.util.Locale.Builder builder53 = builder50.setExtension('u', "");
        java.util.Locale locale54 = builder50.build();
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder57 = builder55.setVariant("");
        java.util.Locale.Builder builder58 = builder57.clearExtensions();
        java.util.Locale locale59 = builder57.build();
        java.lang.String str60 = locale54.getDisplayVariant(locale59);
        java.util.Locale locale64 = new java.util.Locale("", "", "");
        java.lang.String str65 = locale59.getDisplayLanguage(locale64);
        java.util.Locale locale68 = new java.util.Locale("zh-cn", "");
        java.lang.String str70 = locale68.getExtension('x');
        java.lang.String str71 = locale64.getDisplayName(locale68);
        java.lang.String str72 = locale68.getISO3Country();
        java.util.Locale.setDefault(category0, locale68);
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
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals(locale68.toString(), "zh-cn");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.util.Locale locale3 = new java.util.Locale("en-gb", "fr-FR", "");
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "en-gb_FR-FR");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Address address4 = faker0.address();
        java.lang.String str6 = faker0.numerify("tw");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tw" + "'", str6, "tw");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Code code7 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder9 = builder8.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        java.lang.String str8 = faker0.numerify("eng");
        java.lang.String str10 = faker0.bothify("_FR");
        java.lang.String str12 = faker0.letterify("\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_FR" + "'", str10, "_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder12 = builder7.setExtension('u', "Japan");
        java.util.Locale.Builder builder13 = builder7.clear();
        java.util.Locale.Builder builder16 = builder13.setExtension('x', "gb");
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder17.setVariant("");
        java.util.Locale.Builder builder22 = builder17.setExtension('x', "");
        java.util.Locale.Builder builder24 = builder17.setLanguageTag("French");
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.lang.String str32 = locale30.getExtension('x');
        java.lang.String str33 = locale26.getDisplayVariant(locale30);
        java.util.Locale locale34 = java.util.Locale.FRENCH;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale30.getDisplayScript(locale34);
        java.lang.String str37 = locale25.getDisplayScript(locale30);
        java.util.Locale locale40 = new java.util.Locale("de", "FRA");
        java.lang.String str41 = locale30.getDisplayVariant(locale40);
        java.util.Locale.Builder builder42 = builder17.setLocale(locale30);
        java.lang.String str43 = locale30.getISO3Country();
        java.util.Locale.Builder builder44 = builder16.setLocale(locale30);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "fr" + "'", str35, "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale40.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHINESISCH (TAIWAN)", (double) 0.69579434f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) ' ');
        random1.setSeed((long) (-1155484576));
        int int9 = random1.nextInt();
        java.util.stream.LongStream longStream10 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints(1511047390, 1155099827);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1764305998) + "'", int9 == (-1764305998));
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        java.util.Random random21 = new java.util.Random();
        java.util.stream.LongStream longStream22 = random21.longs();
        float float23 = random21.nextFloat();
        java.util.stream.IntStream intStream24 = random21.ints();
        int int25 = random21.nextInt();
        random21.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream29 = random21.doubles((long) (short) 10);
        int int30 = random21.nextInt();
        java.util.stream.IntStream intStream32 = random21.ints((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale16, random21);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
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
        org.junit.Assert.assertNotNull(longStream22);
// flaky:         org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.51508176f + "'", float23 == 0.51508176f);
        org.junit.Assert.assertNotNull(intStream24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1711286835) + "'", int25 == (-1711286835));
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1947844456 + "'", int30 == 1947844456);
        org.junit.Assert.assertNotNull(intStream32);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.util.Locale locale2 = new java.util.Locale("JP", "ja_JP");
        org.junit.Assert.assertEquals(locale2.toString(), "jp_JA_JP");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        long long5 = random0.nextLong();
        long long6 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3875257587509288391L) + "'", long5 == (-3875257587509288391L));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-107340046654150684L) + "'", long6 == (-107340046654150684L));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream23 = random15.longs(2695208297008797996L, (long) 1949998615);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.util.Locale locale2 = new java.util.Locale("\ud504\ub791\uc2a4\uc5b4", "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\ud504\ub791\uc2a4\uc5b4\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Code code7 = faker0.code();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("ja");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TW");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tw" + "'", str2, "tw");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tw" + "'", str3, "tw");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.util.Random random1 = new java.util.Random((long) 190001823);
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1894354479);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.815468261653394d + "'", double2 == 0.815468261653394d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 736765878 + "'", int4 == 736765878);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((-0.4996932076353699d), 0.7924908613121775d);
        double double5 = random1.nextGaussian();
        java.util.stream.IntStream intStream6 = random1.ints();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) 249940428);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8746788966462123d + "'", double5 == 0.8746788966462123d);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        java.lang.String str7 = faker0.letterify("ENGLISH");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ENGLISH" + "'", str7, "ENGLISH");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale2.getDisplayCountry(locale8);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.lang.String str14 = locale13.getLanguage();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.lang.String str16 = locale8.getDisplayName(locale15);
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale19 = locale8.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.util.Locale locale3 = new java.util.Locale("English", "ja_JP", "en");
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "english_JA_JP_en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JA_JP" + "'", str4, "JA_JP");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Color color2 = faker0.color();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Color color6 = faker0.color();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        java.util.Locale locale17 = new java.util.Locale("en_GB", "\u4e2d\u6587\u4e2d\u56fd)");
        java.util.Locale locale19 = new java.util.Locale("_FR");
        java.lang.String str20 = locale17.getDisplayScript(locale19);
        java.lang.String str21 = locale1.getDisplayName(locale17);
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
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals(locale19.toString(), "_fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-TW");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("und");
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
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList81, filteringMode86);
        java.util.Locale locale88 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList87);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
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
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNull(locale88);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.IntStream intStream6 = random1.ints((long) 27);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime8 = faker7.date();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.util.Locale locale2 = new java.util.Locale("hi!", "x-lvariant-fr");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_X-LVARIANT-FR");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        java.lang.String str20 = locale0.getDisplayCountry();
        java.util.Random random22 = new java.util.Random((long) (short) 0);
        int int23 = random22.nextInt();
        java.util.stream.LongStream longStream25 = random22.longs((long) '4');
        java.util.stream.DoubleStream doubleStream26 = random22.doubles();
        double double27 = random22.nextGaussian();
        java.util.stream.LongStream longStream29 = random22.longs((long) 0);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale0, random22);
        com.github.javafaker.Hacker hacker31 = faker30.hacker();
        com.github.javafaker.Name name32 = faker30.name();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "China" + "'", str20, "China");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1155484576) + "'", int23 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.1460540722898627d + "'", double27 == 1.1460540722898627d);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(hacker31);
        org.junit.Assert.assertNotNull(name32);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("FRA", "us (CHINESE)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: FRA [at index 0]");
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
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        java.lang.String str16 = locale5.getDisplayName();
        java.lang.String str17 = locale5.getCountry();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.48860633f + "'", float11 == 0.48860633f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-306876117) + "'", int13 == (-306876117));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book2 = faker1.book();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Number number4 = faker1.number();
        com.github.javafaker.Book book5 = faker1.book();
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.util.Random random1 = new java.util.Random((long) 0);
        random1.setSeed((long) (byte) 100);
        java.util.stream.IntStream intStream6 = random1.ints((-1193959466), 78707950);
        float float7 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) 737715957, (double) 10846315, (double) 0.90779674f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.7220096f + "'", float7 == 0.7220096f);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.util.Locale locale2 = new java.util.Locale("french", "eng");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "french_ENG");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        long long9 = random1.nextLong();
        float float10 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5516509631477292075L) + "'", long9 == (-5516509631477292075L));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.35414237f + "'", float10 == 0.35414237f);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Book book6 = faker0.book();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 0.2124942f);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deu" + "'", str3, "deu");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.21249419450759888d + "'", double4 == 0.21249419450759888d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        java.util.Set<java.lang.Character> charSet26 = locale19.getExtensionKeys();
        java.lang.Object obj27 = locale19.clone();
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
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(9);
        java.util.stream.LongStream longStream8 = random1.longs(4269302690360740192L, (long) (-925427400), (long) 273491855);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.lang.String str8 = locale4.getVariant();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet10 = locale4.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        int int7 = random1.nextInt();
        boolean boolean8 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1408064384) + "'", int7 == (-1408064384));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.util.Random random1 = new java.util.Random((long) (-1));
        java.util.stream.IntStream intStream5 = random1.ints((long) 387629116, (-1690734402), (-668239466));
        float float6 = random1.nextFloat();
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.2689426f + "'", float6 == 0.2689426f);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale2.getDisplayCountry(locale8);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.lang.String str14 = locale13.getLanguage();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.lang.String str16 = locale8.getDisplayName(locale15);
        java.util.Locale.setDefault(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.util.Locale.setDefault(category19, locale20);
        java.util.Locale locale24 = java.util.Locale.getDefault(category19);
        java.util.Locale locale25 = java.util.Locale.getDefault(category19);
        java.util.Locale locale26 = java.util.Locale.getDefault(category19);
        java.util.Locale locale27 = java.util.Locale.getDefault(category19);
        java.util.Locale locale28 = java.util.Locale.getDefault(category19);
        java.util.Locale.setDefault(category0, locale28);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
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
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.lang.String str10 = locale3.getDisplayVariant();
        java.lang.String str11 = locale3.getCountry();
        java.lang.String str12 = locale3.getDisplayCountry();
        java.util.Locale locale13 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHINA", (double) (-820982641));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-8.20982641E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        com.github.javafaker.Hacker hacker8 = faker0.hacker();
        java.lang.String str10 = faker0.bothify("\u6cd5\u6587");
        com.github.javafaker.Book book11 = faker0.book();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587" + "'", str10, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.util.Random random1 = new java.util.Random((long) (-1509809876));
        random1.setSeed((long) 2025219429);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.util.Random random1 = new java.util.Random((long) (-894135949));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("und");
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
        java.util.Locale locale69 = java.util.Locale.lookup(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.Locale locale71 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList65);
        java.lang.String str72 = locale71.getDisplayScript();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
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
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        int int8 = random0.nextInt();
        java.util.stream.IntStream intStream11 = random0.ints((-1277224441), (-936032634));
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.90993345f + "'", float2 == 0.90993345f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-91063411) + "'", int8 == (-91063411));
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        java.util.Locale locale31 = locale24.stripExtensions();
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale24);
        java.lang.String str34 = faker32.bothify("\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
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
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u610f\u5927\u5229\u6587\u7f8e\u56fd)" + "'", str34, "\u610f\u5927\u5229\u6587\u7f8e\u56fd)");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.util.Locale locale2 = new java.util.Locale("de", "Japan");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getExtension('x');
        java.util.Locale locale7 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale3);
        boolean boolean10 = locale2.hasExtensions();
        java.util.Set<java.lang.Character> charSet11 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "de_JAPAN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JAPAN" + "'", str9, "JAPAN");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charSet11);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder9 = builder0.setLanguage("French");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder14 = builder10.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder10.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fra");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.util.Locale locale2 = new java.util.Locale("Japon", "CHN");
        java.lang.String str4 = locale2.getExtension('x');
        java.lang.String str5 = locale2.getDisplayVariant();
        boolean boolean6 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "japon_CHN");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        double double18 = random13.nextGaussian();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4947896108136290151L) + "'", long14 == (-4947896108136290151L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.5484757416122109d) + "'", double18 == (-0.5484757416122109d));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        java.lang.String str8 = locale5.getCountry();
        boolean boolean9 = locale5.hasExtensions();
        java.lang.String str10 = locale5.getDisplayName();
        java.lang.String str11 = locale5.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getLanguage();
        java.util.Locale.Builder builder8 = builder4.setLocale(locale6);
        java.lang.String str9 = locale0.getDisplayCountry(locale6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale6);
        java.lang.String str11 = locale6.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Chinese (China)");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str19 = locale17.getExtension('x');
        java.lang.String str20 = locale13.getDisplayVariant(locale17);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale17.getDisplayScript(locale21);
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale27.getExtension('x');
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.lang.String str32 = locale27.getDisplayLanguage(locale31);
        java.lang.String str33 = locale17.getDisplayCountry(locale31);
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale17.getDisplayScript(locale34);
        java.lang.String str36 = locale34.getDisplayScript();
        java.util.Set<java.lang.String> strSet37 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale12.getDisplayScript(locale34);
        java.util.Locale.setDefault(category0, locale34);
        java.util.Locale locale40 = java.util.Locale.CANADA;
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.lang.String str42 = locale40.getDisplayName(locale41);
        java.util.Locale.setDefault(category0, locale40);
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
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Englisch (Kanada)" + "'", str42, "Englisch (Kanada)");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.util.Random random1 = new java.util.Random((long) (-1900217354));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-910502427));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TWN", (double) 0.2124942f);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.21249419450759888d + "'", double3 == 0.21249419450759888d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.lang.String str11 = locale7.getDisplayScript();
        java.lang.String str12 = locale7.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Color color7 = faker0.color();
        com.github.javafaker.Company company8 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        java.lang.String str20 = locale5.getDisplayScript();
        java.lang.String str21 = locale5.getISO3Country();
        java.util.Set<java.lang.Character> charSet22 = locale5.getExtensionKeys();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextGaussian();
        float float6 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs((long) (-1521488052), (long) 1511047390, 7279813079471902379L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0260899683893219d) + "'", double5 == (-1.0260899683893219d));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7399737f + "'", float6 == 0.7399737f);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.lang.String str4 = faker2.letterify("English (United Kingdom)");
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English (United Kingdom)" + "'", str4, "English (United Kingdom)");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        double double4 = random1.nextGaussian();
        java.util.stream.IntStream intStream6 = random1.ints((long) 27);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        boolean boolean8 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Number number7 = faker0.number();
        com.github.javafaker.Internet internet8 = faker0.internet();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(internet8);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension('4', "hi! (ITALIEN (ITALIE),fr)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
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
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        java.lang.String str19 = faker15.letterify("Chinese (China)");
        java.lang.String str21 = faker15.numerify("zh-TW");
        com.github.javafaker.Address address22 = faker15.address();
        com.github.javafaker.Book book23 = faker15.book();
        com.github.javafaker.Options options24 = faker15.options();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.61751527f + "'", float11 == 0.61751527f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104752767) + "'", int13 == (-104752767));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (China)" + "'", str19, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-TW" + "'", str21, "zh-TW");
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertNotNull(book23);
        org.junit.Assert.assertNotNull(options24);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-682588711), (double) 0.113836765f);
        java.util.stream.IntStream intStream13 = random0.ints((-509927405), 2088989465);
        double double14 = random0.nextDouble();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7742991f + "'", float2 == 0.7742991f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1021011876 + "'", int4 == 1021011876);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4535178753986381d + "'", double14 == 0.4535178753986381d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker4.phoneNumber();
        java.lang.String str8 = faker4.numerify("coreano");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coreano" + "'", str8, "coreano");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        java.lang.String str9 = faker5.bothify("\u4e2d\u6587");
        com.github.javafaker.Company company10 = faker5.company();
        java.lang.String str12 = faker5.bothify("Allemagne");
        com.github.javafaker.PhoneNumber phoneNumber13 = faker5.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Allemagne" + "'", str12, "Allemagne");
        org.junit.Assert.assertNotNull(phoneNumber13);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setScript("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: chinois (Chine) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        java.util.stream.DoubleStream doubleStream30 = random0.doubles();
        java.util.stream.LongStream longStream33 = random0.longs((long) (-1382879107), (long) (-71066819));
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1157793070) + "'", int14 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[60, 114, -61]");
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(longStream33);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale.Builder builder33 = builder29.setLanguage("French");
        java.util.Locale locale34 = builder33.build();
        java.util.Locale.Builder builder35 = builder33.clear();
        java.util.Locale locale36 = builder33.build();
        java.lang.String str37 = locale36.getCountry();
        java.lang.String str38 = locale15.getDisplayVariant(locale36);
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.util.Locale locale44 = new java.util.Locale("", "", "");
        java.lang.String str46 = locale44.getExtension('x');
        java.lang.String str47 = locale40.getDisplayVariant(locale44);
        java.util.Locale locale48 = java.util.Locale.FRENCH;
        java.lang.String str49 = locale48.getLanguage();
        java.lang.String str50 = locale44.getDisplayScript(locale48);
        java.lang.String str51 = locale39.getDisplayCountry(locale44);
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder52.setVariant("");
        java.util.Locale.Builder builder55 = builder52.clear();
        java.util.Locale locale56 = builder55.build();
        java.lang.String str57 = locale56.getCountry();
        java.lang.String str58 = locale39.getDisplayLanguage(locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = null; // flaky: locale56.getDisplayScript(locale59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = locale36.getDisplayName(locale59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "french");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "fr" + "'", str49, "fr");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "China" + "'", str51, "China");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Chinese" + "'", str58, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.util.Random random1 = new java.util.Random((long) (-1900217354));
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Random random3 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random3.longs();
        java.util.stream.LongStream longStream6 = random3.longs(0L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random3);
        java.util.Random random9 = new java.util.Random(100L);
        java.util.stream.LongStream longStream11 = random9.longs((long) (short) 0);
        java.util.Random random13 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream15 = random13.doubles((long) 10);
        int int16 = random13.nextInt();
        java.util.stream.DoubleStream doubleStream17 = random13.doubles();
        java.util.stream.IntStream intStream18 = random13.ints();
        java.util.Random random20 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream22 = random20.doubles((long) 10);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random20.nextBytes(byteArray26);
        random13.nextBytes(byteArray26);
        random9.nextBytes(byteArray26);
        random3.nextBytes(byteArray26);
        random1.nextBytes(byteArray26);
        java.util.stream.LongStream longStream34 = random1.longs((long) (-2058711394), 8849569814870478533L);
        double double35 = random1.nextDouble();
        double double36 = random1.nextDouble();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1157793070) + "'", int16 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-103, -31, 74]");
        org.junit.Assert.assertNotNull(longStream34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.14176538430298058d + "'", double35 == 0.14176538430298058d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.5604042809739372d + "'", double36 == 0.5604042809739372d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        double double3 = random1.nextDouble();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Hacker hacker5 = faker4.hacker();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6671595726539502d + "'", double3 == 0.6671595726539502d);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options4 = faker3.options();
        com.github.javafaker.Internet internet5 = faker3.internet();
        com.github.javafaker.Company company6 = faker3.company();
        com.github.javafaker.App app7 = faker3.app();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        double double3 = languageRange2.getWeight();
        boolean boolean5 = languageRange2.equals((java.lang.Object) "chinese china");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japan" + "'", str3, "Japan");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setScript("");
        java.util.Locale locale6 = builder3.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.util.Locale locale3 = new java.util.Locale("\u610f\u5927\u5229\u6587", "CA", "German");
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\u610f\u5927\u5229\u6587_CA_German");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream5 = random0.ints();
        double double6 = random0.nextDouble();
        int int7 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(0.6271618247171438d, (double) 0.66756254f);
        java.util.stream.IntStream intStream11 = random0.ints();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.01953137f + "'", float2 == 0.01953137f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.29991392504275605d + "'", double6 == 0.29991392504275605d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 378370423 + "'", int7 == 378370423);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.util.Locale locale1 = new java.util.Locale("zh-CN");
        java.lang.String str2 = locale1.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh-cn could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("x-lvariant-fr", 0.0d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u56fd)", "Chinesisch (Taiwan)");
        org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u56fd)_CHINESISCH (TAIWAN)");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.util.Random random1 = new java.util.Random((-4757019160717151369L));
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("German");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u6587", "ITA", "X-LVARIANT-JPN");
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587_ITA_X-LVARIANT-JPN");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.util.Locale locale2 = new java.util.Locale("de", "Japan");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getExtension('x');
        java.util.Locale locale7 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale3);
        java.util.Locale locale12 = new java.util.Locale("italien (Italie)", "it");
        java.lang.String str13 = locale2.getDisplayCountry(locale12);
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getVariant();
        java.util.Random random17 = new java.util.Random(100L);
        double double18 = random17.nextGaussian();
        random17.setSeed((long) (-1157793070));
        double double21 = random17.nextGaussian();
        boolean boolean22 = random17.nextBoolean();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale14, random17);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale28 = new java.util.Locale("", "", "");
        java.lang.String str30 = locale28.getExtension('x');
        java.lang.String str31 = locale24.getDisplayName(locale28);
        java.lang.String str33 = locale24.getExtension('x');
        java.util.Locale locale35 = new java.util.Locale("fra");
        java.lang.String str36 = locale24.getDisplayScript(locale35);
        java.util.Locale locale37 = locale24.stripExtensions();
        java.lang.String str38 = locale14.getDisplayScript(locale37);
        java.lang.String str39 = locale37.getDisplayVariant();
        java.lang.String str40 = locale37.getDisplayScript();
        java.lang.String str41 = locale37.getDisplayVariant();
        java.lang.String str42 = locale2.getDisplayCountry(locale37);
        org.junit.Assert.assertEquals(locale2.toString(), "de_JAPAN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JAPAN" + "'", str9, "JAPAN");
        org.junit.Assert.assertEquals(locale12.toString(), "italien (italie)_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JAPAN" + "'", str13, "JAPAN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6246292191371761d + "'", double18 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.09760425216810112d + "'", double21 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "French" + "'", str31, "French");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals(locale35.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "JAPAN" + "'", str42, "JAPAN");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.util.Locale locale2 = new java.util.Locale("de", "Chinese (China)");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale7.getDisplayScript(locale11);
        java.lang.String str14 = locale2.getDisplayVariant(locale11);
        java.util.Locale locale17 = new java.util.Locale("hi! (ITALIEN (ITALIE),fr)", "TWN");
        java.lang.String str18 = locale11.getDisplayLanguage(locale17);
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
        org.junit.Assert.assertEquals(locale17.toString(), "hi! (italien (italie),fr)_TWN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French" + "'", str18, "French");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Book book6 = faker0.book();
        com.github.javafaker.App app7 = faker0.app();
        java.lang.String str9 = faker0.regexify("CHN");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHN" + "'", str9, "CHN");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        com.github.javafaker.Code code3 = faker1.code();
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale5.getExtension('a');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.PhoneNumber phoneNumber10 = faker9.phoneNumber();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options4 = faker3.options();
        java.lang.String str6 = faker3.letterify("jpn_HI! (CHINESE (CHINA))");
        com.github.javafaker.App app7 = faker3.app();
        com.github.javafaker.Lorem lorem8 = faker3.lorem();
        com.github.javafaker.App app9 = faker3.app();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jpn_HI! (CHINESE (CHINA))" + "'", str6, "jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(app9);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.util.Locale locale3 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder10 = builder6.setLanguage("French");
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        boolean boolean13 = locale3.hasExtensions();
        java.lang.String str14 = locale3.getDisplayLanguage();
        java.lang.String str16 = locale3.getExtension('x');
        boolean boolean17 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "french");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "German" + "'", str14, "German");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Random random3 = new java.util.Random((long) 0);
        int int5 = random3.nextInt((int) '4');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random3);
        double double7 = random3.nextDouble();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Book book11 = faker10.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8314409887870612d + "'", double7 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = new java.util.Locale("hi!");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = locale2.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.util.Locale locale8 = new java.util.Locale("GB", "Englisch (Kanada)", "Japanese");
        java.lang.String str9 = locale1.getDisplayLanguage(locale8);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals(locale8.toString(), "gb_ENGLISCH (KANADA)_Japanese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.util.Locale locale3 = new java.util.Locale("\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)", "Englisch (Kanada)", "Korean");
        org.junit.Assert.assertEquals(locale3.toString(), "\u672a\u5b9a\u8bed\u79cd\u5fb7\u56fd,fr)_ENGLISCH (KANADA)_Korean");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Number number3 = faker0.number();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker0.resolve("x-lvariant-JPN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        java.util.stream.DoubleStream doubleStream29 = random25.doubles((double) 0.021045089f, (double) 1761283695);
        java.util.Random random31 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream33 = random31.doubles((long) 10);
        int int34 = random31.nextInt();
        java.util.stream.DoubleStream doubleStream35 = random31.doubles();
        java.util.stream.IntStream intStream36 = random31.ints();
        java.util.Random random38 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream40 = random38.doubles((long) 10);
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random38.nextBytes(byteArray44);
        random31.nextBytes(byteArray44);
        random25.nextBytes(byteArray44);
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
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1157793070) + "'", int34 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream35);
        org.junit.Assert.assertNotNull(intStream36);
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-42, -97, -43]");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Options options5 = faker0.options();
        java.lang.String str7 = faker0.numerify("English");
        com.github.javafaker.Color color8 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale5.getLanguage();
        java.lang.String str8 = locale5.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.phoneNumber();
        com.github.javafaker.Options options5 = faker1.options();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        long long8 = random1.nextLong();
        double double9 = random1.nextGaussian();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-6047590478893910070L) + "'", long8 == (-6047590478893910070L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.3154613121916803d) + "'", double9 == (-1.3154613121916803d));
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', (long) (-572239868), (long) 'u');
        java.util.stream.DoubleStream doubleStream13 = random1.doubles(736442293137335911L, 0.0d, (double) 0.57876664f);
        double double14 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6063452159973596d + "'", double14 == 0.6063452159973596d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        double double5 = random0.nextGaussian();
        java.util.stream.IntStream intStream7 = random0.ints((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) 0.12687498f, (double) 0.12528253f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.6335064842506837d) + "'", double5 == (-1.6335064842506837d));
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        long long41 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1155652984 + "'", int4 == 1155652984);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6534757056142778d + "'", double5 == 0.6534757056142778d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[16, 96, 12]");
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-8643194533869656942L) + "'", long41 == (-8643194533869656942L));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder8.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale5.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra (CHINA,zh,CN)" + "'", str9, "fra (CHINA,zh,CN)");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder7 = builder5.setRegion("de");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "\u672a\u5b9a\u8bed\u79cd");
        java.util.Locale locale6 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale6.getExtension('x');
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        boolean boolean12 = locale10.hasExtensions();
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleKeys();
        java.lang.String str15 = locale2.getDisplayCountry(locale10);
        java.lang.String str16 = locale2.getCountry();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u672a\u5b9a\u8bed\u79cd");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French" + "'", str13, "French");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u672a\u5b9a\u8bed\u79cd" + "'", str15, "\u672a\u5b9a\u8bed\u79cd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u672a\u5b9a\u8bed\u79cd" + "'", str16, "\u672a\u5b9a\u8bed\u79cd");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        java.lang.String str5 = faker0.numerify("fr");
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        long long42 = random0.nextLong();
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance44 = faker43.finance();
        com.github.javafaker.DateAndTime dateAndTime45 = faker43.date();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1995256660) + "'", int4 == (-1995256660));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7014739017710587d + "'", double5 == 1.7014739017710587d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[45, 76, -15]");
        org.junit.Assert.assertNotNull(intStream41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 6543066883944034281L + "'", long42 == 6543066883944034281L);
        org.junit.Assert.assertNotNull(finance44);
        org.junit.Assert.assertNotNull(dateAndTime45);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        float float22 = random3.nextFloat();
        java.util.stream.DoubleStream doubleStream25 = random3.doubles(0.8058952358350092d, (double) 1297134437040710309L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.72308457f + "'", float22 == 0.72308457f);
        org.junit.Assert.assertNotNull(doubleStream25);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.util.Locale.setDefault(category13, locale14);
        java.util.Locale locale18 = java.util.Locale.getDefault(category13);
        java.lang.String str20 = locale18.getExtension('a');
        java.lang.String str21 = locale18.getCountry();
        boolean boolean22 = locale18.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.lang.String str24 = locale18.getDisplayVariant(locale23);
        java.util.Set<java.lang.String> strSet25 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str26 = locale18.getDisplayScript();
        java.lang.String str27 = locale12.getDisplayVariant(locale18);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.util.Random random1 = new java.util.Random((long) (-1157793070));
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            random1.nextBytes(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        com.github.javafaker.App app21 = faker18.app();
        com.github.javafaker.Name name22 = faker18.name();
        com.github.javafaker.Code code23 = faker18.code();
        com.github.javafaker.Address address24 = faker18.address();
        java.lang.String str26 = faker18.letterify("hi! (ITALIEN (ITALIE),fr)");
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
        org.junit.Assert.assertNotNull(app21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(code23);
        org.junit.Assert.assertNotNull(address24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! (ITALIEN (ITALIE),fr)" + "'", str26, "hi! (ITALIEN (ITALIE),fr)");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.addUnicodeLocaleAttribute("x-lvariant-JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: x-lvariant-JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color6 = faker5.color();
        java.lang.String str8 = faker5.regexify("fra FRA,fr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra FRA,fr" + "'", str8, "fra FRA,fr");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("und");
        java.util.Locale.Builder builder11 = builder6.setExtension('u', "fra");
        java.util.Locale.Builder builder12 = builder11.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        random1.setSeed((long) (-1442101864));
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.58404773f + "'", float3 == 0.58404773f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1456492387) + "'", int5 == (-1456492387));
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.util.Locale locale3 = new java.util.Locale("Twi", "inglese", "\u97d3\u6587");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u6587");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???? (english,ita)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.util.Locale locale3 = new java.util.Locale("jpn_HI! (CHINESE (CHINA))", "TW", "UNDETERMINED");
        org.junit.Assert.assertEquals(locale3.toString(), "jpn_hi! (chinese (china))_TW_UNDETERMINED");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 1);
        int int6 = random1.nextInt((int) '#');
        long long7 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7616895062557318172L + "'", long7 == 7616895062557318172L);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        java.lang.String str6 = faker0.bothify("zh_CN");
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.util.Locale locale1 = new java.util.Locale("italian");
        java.util.Locale locale5 = new java.util.Locale("TW", "English", "ITA");
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.lang.String str7 = locale6.getDisplayScript();
        java.lang.String str8 = locale6.getDisplayScript();
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.lang.String str14 = locale12.getExtension('x');
        java.util.Locale.setDefault(locale12);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.lang.String str17 = locale12.getDisplayLanguage(locale16);
        java.lang.String str18 = locale16.getDisplayVariant();
        java.lang.String str19 = locale6.getDisplayCountry(locale16);
        java.lang.String str20 = locale5.getDisplayName(locale6);
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = locale21.getExtension('x');
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setVariant("");
        java.util.Locale.Builder builder28 = builder25.clear();
        java.util.Locale.Builder builder30 = builder25.setScript("");
        java.util.Locale locale31 = builder25.build();
        java.lang.String str32 = locale21.getDisplayLanguage(locale31);
        java.lang.String str33 = locale6.getDisplayCountry(locale21);
        java.lang.String str34 = locale1.getDisplayCountry(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italian");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertEquals(locale5.toString(), "tw_ENGLISH_ITA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Japon" + "'", str19, "Japon");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)" + "'", str20, "\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinese" + "'", str32, "Chinese");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u65e5\u672c" + "'", str33, "\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getScript();
        java.lang.String str6 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!__hi!" + "'", str6, "hi!__hi!");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguageTag("zh-tw_CHINE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: tw_CHINE [at index 3]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random3.longs();
        java.util.stream.LongStream longStream5 = random3.longs();
        long long6 = random3.nextLong();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random3);
        java.lang.String str9 = locale0.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japan" + "'", str1, "Japan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-5553633455863655373L) + "'", long6 == (-5553633455863655373L));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10);
        boolean boolean9 = random0.nextBoolean();
        java.util.stream.LongStream longStream10 = random0.longs();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4129622f + "'", float2 == 0.4129622f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 77196224 + "'", int4 == 77196224);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1481124439) + "'", int4 == (-1481124439));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9448884905229759d + "'", double5 == 0.9448884905229759d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1155869325) + "'", int10 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1157793070) + "'", int23 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[31, -52, 126]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet43 = locale41.getExtensionKeys();
        java.util.Locale.setDefault(category40, locale41);
        java.util.Random random46 = new java.util.Random((long) (byte) 10);
        long long47 = random46.nextLong();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale41, random46);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale41);
        java.util.Locale.setDefault(category0, locale41);
        java.util.Locale locale51 = locale41.stripExtensions();
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
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-4972683369271453960L) + "'", long47 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("english (_FR)", "Italienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: english (_FR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        boolean boolean9 = locale7.hasExtensions();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder16 = builder12.setLanguage("French");
        java.util.Locale locale17 = builder16.build();
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.lang.String str19 = locale17.getDisplayScript();
        java.lang.String str20 = locale7.getDisplayLanguage(locale17);
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.lang.String str25 = locale22.getDisplayLanguage(locale24);
        java.lang.String str26 = locale22.getDisplayLanguage();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Random random28 = new java.util.Random();
        java.util.stream.LongStream longStream29 = random28.longs();
        java.util.stream.LongStream longStream31 = random28.longs(0L);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale27, random28);
        java.lang.String str33 = locale27.getDisplayName();
        java.lang.String str34 = locale22.getDisplayVariant(locale27);
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.lang.String str41 = locale39.getExtension('x');
        java.lang.String str42 = locale35.getDisplayVariant(locale39);
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.lang.String str44 = locale43.getLanguage();
        java.lang.String str45 = locale39.getDisplayScript(locale43);
        java.lang.String str46 = locale27.getDisplayLanguage(locale43);
        java.lang.String str47 = locale7.getDisplayScript(locale27);
        java.lang.String str48 = locale7.getDisplayScript();
        java.lang.String str50 = locale7.getExtension('x');
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "french");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "French" + "'", str20, "French");
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Chinese (China)" + "'", str33, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "fr" + "'", str44, "fr");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "chinois" + "'", str46, "chinois");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str7 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.lang.String str12 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strSet11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet11);
        java.lang.String str14 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList13);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList16, strMap17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder22.setVariant("");
        java.util.Locale locale25 = builder22.build();
        java.util.Locale locale29 = new java.util.Locale("", "", "");
        java.util.Locale locale33 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale29.getDisplayLanguage(locale33);
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Locale locale39 = new java.util.Locale("", "", "");
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.lang.String str44 = locale39.getDisplayLanguage(locale43);
        java.util.Locale locale48 = new java.util.Locale("", "", "");
        java.lang.String str50 = locale48.getExtension('x');
        java.util.Locale.setDefault(locale48);
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Locale locale54 = locale53.stripExtensions();
        java.lang.String str55 = locale54.getISO3Country();
        java.util.Locale locale59 = new java.util.Locale("", "", "");
        java.util.Locale locale63 = new java.util.Locale("", "", "");
        java.lang.String str64 = locale59.getDisplayLanguage(locale63);
        java.util.Locale locale66 = new java.util.Locale("hi!");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.util.Locale locale71 = new java.util.Locale("hi!");
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.util.Locale locale74 = locale73.stripExtensions();
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale25, locale29, locale35, locale43, locale48, locale54, locale63, locale66, locale69, locale71, locale73 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale.FilteringMode filteringMode78 = null;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList76, filteringMode78);
        java.util.Locale locale80 = java.util.Locale.lookup(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale locale81 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet82 = locale81.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strSet82);
        java.util.Locale locale84 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strSet85);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList86, filteringMode87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap89 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList90 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap89);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap91 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap91);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap93 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList94 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList92, strMap93);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertEquals(locale69.toString(), "hi!");
        org.junit.Assert.assertEquals(locale71.toString(), "hi!");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode87.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(languageRangeList90);
        org.junit.Assert.assertNotNull(languageRangeList92);
        org.junit.Assert.assertNotNull(languageRangeList94);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.util.Random random5 = new java.util.Random((long) 78707950);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: _FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        com.github.javafaker.Lorem lorem7 = faker5.lorem();
        com.github.javafaker.Address address8 = faker5.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (short) 1);
        java.util.stream.LongStream longStream8 = random1.longs((long) 'a', 100L);
        java.util.stream.IntStream intStream11 = random1.ints(1124570179, 1552812408);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Company company7 = faker0.company();
        java.lang.String str9 = faker0.regexify("und_fra (ENGLISH (UNITED KINGDOM))");
        java.lang.String str11 = faker0.bothify("chinois");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und_fra ENGLISH UNITED KINGDOM" + "'", str9, "und_fra ENGLISH UNITED KINGDOM");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chinois" + "'", str11, "chinois");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Business business9 = faker5.business();
        com.github.javafaker.Lorem lorem10 = faker5.lorem();
        com.github.javafaker.Name name11 = faker5.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(name11);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.util.Random random1 = new java.util.Random((-7383253977187128044L));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.lang.String str7 = locale5.getLanguage();
        java.lang.String str8 = locale0.getDisplayLanguage(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Business business4 = faker0.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        random1.setSeed((long) 1408303951);
        java.util.stream.LongStream longStream7 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles((-8643194533869656942L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.util.Locale.setDefault(category9, locale10);
        java.util.Random random15 = new java.util.Random((long) (byte) 10);
        long long16 = random15.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random15);
        java.util.Random random18 = new java.util.Random();
        java.util.stream.LongStream longStream19 = random18.longs();
        float float20 = random18.nextFloat();
        java.util.stream.DoubleStream doubleStream22 = random18.doubles((long) '4');
        java.util.stream.IntStream intStream24 = random18.ints((long) 1);
        java.util.Random random25 = new java.util.Random();
        java.util.stream.LongStream longStream28 = random25.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream30 = random25.doubles((long) '#');
        java.util.Random random32 = new java.util.Random(1L);
        java.util.Random random34 = new java.util.Random((long) (short) 1);
        java.util.Random random36 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream38 = random36.doubles((long) 10);
        int int39 = random36.nextInt();
        java.util.stream.DoubleStream doubleStream40 = random36.doubles();
        java.util.stream.IntStream intStream41 = random36.ints();
        java.util.Random random43 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream45 = random43.doubles((long) 10);
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random43.nextBytes(byteArray49);
        random36.nextBytes(byteArray49);
        random34.nextBytes(byteArray49);
        random32.nextBytes(byteArray49);
        random25.nextBytes(byteArray49);
        random18.nextBytes(byteArray49);
        random15.nextBytes(byteArray49);
        random1.nextBytes(byteArray49);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4972683369271453960L) + "'", long16 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream19);
// flaky:         org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.06671512f + "'", float20 == 0.06671512f);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1157793070) + "'", int39 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(doubleStream45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-72, 107, 113]");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.lang.String str9 = locale0.getExtension('x');
        java.util.Locale locale11 = new java.util.Locale("fra");
        java.lang.String str12 = locale0.getDisplayScript(locale11);
        java.util.Locale locale13 = locale0.stripExtensions();
        java.lang.String str14 = locale13.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals(locale11.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr" + "'", str14, "fr");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.util.Locale locale3 = new java.util.Locale("English United Kingdom", "\u97d3\u6587", "fra (FRA,fr)");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.lang.String str12 = locale7.getDisplayLanguage(locale11);
        java.lang.String str13 = locale7.getISO3Country();
        java.lang.String str14 = locale3.getDisplayName(locale7);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u97d3\u6587_fra (FRA,fr)");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u97d3\u6587,fra (FRA,fr))" + "'", str14, "\u97d3\u6587,fra (FRA,fr))");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        com.github.javafaker.Finance finance35 = faker33.finance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = faker33.resolve("China");
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
        org.junit.Assert.assertNotNull(finance35);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setScript("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.util.Locale locale3 = new java.util.Locale("ITA", "Italian", "und-a-chinese-u-china");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "ita_ITALIAN_und-a-chinese-u-china");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.util.Locale locale3 = new java.util.Locale("chinois", "", "ja");
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "chinois__ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder2.build();
        java.util.Locale.Builder builder9 = builder2.setLanguage("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        int int10 = random1.nextInt(1761283695);
        random1.setSeed(179251573188998827L);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 956992380 + "'", int10 == 956992380);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) '#', (long) (byte) 1, (long) 100);
        java.util.stream.LongStream longStream10 = random0.longs((long) (-266083962), (long) 'a');
        long long11 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73467666f + "'", float2 == 0.73467666f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6479449767295060044L + "'", long11 == 6479449767295060044L);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.util.Locale locale2 = new java.util.Locale("en-gb", "Undetermined");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: en-gb_UNDETERMINED could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "en-gb_UNDETERMINED");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Internet internet2 = faker0.internet();
        com.github.javafaker.Book book3 = faker0.book();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(book3);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        random1.setSeed((-4757019160717151369L));
        float float8 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.66130096f + "'", float8 == 0.66130096f);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = locale9.getCountry();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-GB" + "'", str8, "en-GB");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.util.Random random1 = new java.util.Random((long) (-1152021836));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.bothify("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category4);
        java.lang.String str11 = locale9.getExtension('a');
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale1.getDisplayCountry(locale9);
        java.lang.String str14 = locale9.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.util.Locale.Builder builder9 = builder4.setLocale(locale8);
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.lang.String str15 = locale13.getExtension('x');
        java.util.Locale.setDefault(locale13);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale13.getISO3Language();
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Locale.setDefault(locale23);
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.lang.String str28 = locale23.getDisplayLanguage(locale27);
        java.lang.String str29 = locale13.getDisplayVariant(locale23);
        java.util.Locale locale30 = locale13.stripExtensions();
        java.lang.String str31 = locale8.getDisplayCountry(locale13);
        java.util.Set<java.lang.String> strSet32 = locale8.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien italie", (double) 0.4922914f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italien italie");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.util.Locale locale3 = new java.util.Locale("english (_FR)", "JAPAN", "chinois (Chine)");
        org.junit.Assert.assertEquals(locale3.toString(), "english (_fr)_JAPAN_chinois (Chine)");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u6587", (double) 0.4100808f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.util.Locale locale1 = new java.util.Locale("English (Canada)");
        org.junit.Assert.assertEquals(locale1.toString(), "english (canada)");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.util.Random random1 = new java.util.Random((long) (-1900217354));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.IntStream intStream3 = random1.ints();
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((-3109364765729502342L), (-767083982), 74589158);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7213763f + "'", float2 == 0.7213763f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1563022095 + "'", int4 == 1563022095);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream24 = random1.doubles((long) (-787311256), (double) 1297134437040710309L, (double) 1124570179);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-8, 22, 21]");
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.25780278f + "'", float20 == 0.25780278f);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder0.setScript("und_fra ENGLISH UNITED KINGDOM");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und_fra ENGLISH UNITED KINGDOM [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
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
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("deu", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("German");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str10 = languageRange9.getRange();
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] { languageRange9, languageRange13, languageRange16, languageRange19, languageRange22 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder29.setVariant("");
        java.util.Locale locale32 = builder29.build();
        java.util.Locale locale36 = new java.util.Locale("", "", "");
        java.util.Locale locale40 = new java.util.Locale("", "", "");
        java.lang.String str41 = locale36.getDisplayLanguage(locale40);
        java.util.Locale locale42 = java.util.Locale.FRENCH;
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.util.Locale locale50 = new java.util.Locale("", "", "");
        java.lang.String str51 = locale46.getDisplayLanguage(locale50);
        java.util.Locale locale55 = new java.util.Locale("", "", "");
        java.lang.String str57 = locale55.getExtension('x');
        java.util.Locale.setDefault(locale55);
        java.util.Locale locale60 = new java.util.Locale("hi!");
        java.util.Locale locale61 = locale60.stripExtensions();
        java.lang.String str62 = locale61.getISO3Country();
        java.util.Locale locale66 = new java.util.Locale("", "", "");
        java.util.Locale locale70 = new java.util.Locale("", "", "");
        java.lang.String str71 = locale66.getDisplayLanguage(locale70);
        java.util.Locale locale73 = new java.util.Locale("hi!");
        java.util.Locale locale74 = locale73.stripExtensions();
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.util.Locale locale80 = new java.util.Locale("hi!");
        java.util.Locale locale81 = locale80.stripExtensions();
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale32, locale36, locale42, locale50, locale55, locale61, locale70, locale73, locale76, locale78, locale80 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.Locale.FilteringMode filteringMode85 = null;
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList83, filteringMode85);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList83, filteringMode88);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList83, filteringMode91);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "hi!");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(localeList86);
// flaky:         org.junit.Assert.assertNotNull(locale87);
// flaky:         org.junit.Assert.assertEquals(locale87.toString(), "fr");
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode88.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode91.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList92);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        java.lang.String str4 = faker0.numerify("ITA");
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.numerify("Chinesisch (Taiwan)");
        com.github.javafaker.Company company8 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch (Taiwan)" + "'", str7, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-682588711), (double) 0.113836765f);
        double double11 = random0.nextGaussian();
        random0.setSeed((long) (-623972515));
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.053211868f + "'", float2 == 0.053211868f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1170036919 + "'", int4 == 1170036919);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.4996932076353699d) + "'", double11 == (-0.4996932076353699d));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.util.Locale locale3 = new java.util.Locale("und-de (ITALIAN,Chinese (China))", "\u82f1\u6587", "chinois");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587_chinois");
    }
}
