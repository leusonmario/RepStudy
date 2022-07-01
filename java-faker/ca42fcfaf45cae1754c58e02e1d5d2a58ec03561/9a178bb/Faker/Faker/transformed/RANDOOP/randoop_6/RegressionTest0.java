import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Number number4 = faker1.number();
        java.lang.Class<?> wildcardClass5 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_TW" + "'", str4, "zh_TW");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "en_US");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Number number8 = faker5.number();
        java.lang.Class<?> wildcardClass9 = number8.getClass();
        boolean boolean10 = locale2.equals((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        java.lang.String str43 = locale41.toLanguageTag();
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale46 = java.util.Locale.TAIWAN;
        java.lang.String str47 = locale45.getDisplayScript(locale46);
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        boolean boolean50 = locale49.hasExtensions();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale51.getDisplayLanguage();
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str56 = locale53.getDisplayName(locale55);
        java.util.Locale locale57 = java.util.Locale.US;
        java.util.Locale.setDefault(locale57);
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean61 = locale60.hasExtensions();
        java.lang.String str62 = locale60.toLanguageTag();
        java.util.Locale locale63 = java.util.Locale.US;
        java.util.Locale.setDefault(locale63);
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        boolean boolean66 = locale65.hasExtensions();
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale70 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale71 = java.util.Locale.TAIWAN;
        java.lang.String str72 = locale70.getDisplayScript(locale71);
        java.util.Locale locale74 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean75 = locale74.hasExtensions();
        java.lang.String str76 = locale74.toLanguageTag();
        java.util.Locale locale77 = java.util.Locale.KOREAN;
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale41, locale45, locale48, locale49, locale51, locale55, locale57, locale60, locale63, locale65, locale68, locale70, locale74, locale77 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.Locale locale81 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList79);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-TW" + "'", str43, "zh-TW");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "English" + "'", str52, "English");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English" + "'", str56, "English");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "und" + "'", str62, "und");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "und" + "'", str76, "und");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "ko");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(locale81);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code4 = faker3.code();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code2 = faker1.code;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = random0.ints((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Options options9 = faker1.options;
        java.lang.Class<?> wildcardClass10 = faker1.getClass();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random0.longs((long) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker1.resolve("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs((long) (-1678470588));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((long) (-1), (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream7 = random0.ints((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random6.ints((int) 'x', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        double double11 = random6.nextDouble();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.23105365768728925d + "'", double11 == 0.23105365768728925d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "de");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.Object obj9 = locale5.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "zh_TW");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u6587");
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) (-1), (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.lang.String str5 = faker1.numerify("Chinesisch");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch" + "'", str5, "Chinesisch");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_US" + "'", str3, "en_US");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-TW");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList6);
        java.util.Locale locale10 = new java.util.Locale("");
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale10, locale12, locale13, locale14, locale15 };
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale locale29 = new java.util.Locale("");
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale29, locale31, locale32, locale33, locale34 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(localeList39);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Country();
        boolean boolean3 = locale0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Business business11 = faker1.business;
        java.lang.String str13 = faker1.letterify("en_US");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en_US" + "'", str13, "en_US");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.PhoneNumber phoneNumber11 = faker1.phoneNumber;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company4 = faker3.company;
        com.github.javafaker.Lorem lorem5 = faker3.lorem();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange1.equals(obj3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Lorem lorem23 = faker22.lorem();
        com.github.javafaker.Business business24 = faker22.business;
        com.github.javafaker.Internet internet25 = faker22.internet;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(business24);
        org.junit.Assert.assertNotNull(internet25);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet;
        com.github.javafaker.PhoneNumber phoneNumber10 = faker1.phoneNumber;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Color color7 = faker1.color();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Lorem lorem23 = faker22.lorem();
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Color color26 = faker25.color;
        com.github.javafaker.Options options27 = faker25.options();
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.DateAndTime dateAndTime30 = null;
        faker29.dateAndTime = dateAndTime30;
        com.github.javafaker.Lorem lorem32 = faker29.lorem;
        faker25.lorem = lorem32;
        faker22.lorem = lorem32;
        java.lang.String str36 = faker22.letterify("Chinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lorem23);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(options27);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinese" + "'", str36, "Chinese");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker1.resolve("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker1.dateAndTime = dateAndTime7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker1.resolve("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Locale locale0 = null;
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker10.resolve("en");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale locale0 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        random0.setSeed((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles((long) 732850921, (double) 315664383340106314L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale1.getDisplayLanguage(locale9);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale12.getDisplayCountry(locale14);
        java.lang.String str17 = locale9.getDisplayVariant(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale14.getUnicodeLocaleType("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: United Kingdom");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GBR" + "'", str13, "GBR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GBR" + "'", str15, "GBR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United Kingdom" + "'", str16, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Options options5 = faker1.options();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Business business7 = faker1.business;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        com.github.javafaker.Address address13 = faker9.address;
        com.github.javafaker.Code code14 = faker9.code();
        com.github.javafaker.Company company15 = faker9.company();
        com.github.javafaker.Book book16 = faker9.book();
        faker1.book = book16;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(address13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(company15);
        org.junit.Assert.assertNotNull(book16);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_TW");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("English", "zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList37);
        java.lang.Class<?> wildcardClass39 = localeList37.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem();
        com.github.javafaker.Options options8 = faker1.options;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        com.github.javafaker.Address address11 = faker1.address();
        com.github.javafaker.Book book12 = faker1.book;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension('#', "CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str4 = languageRange3.getRange();
        java.lang.String str5 = languageRange3.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale18, locale20, locale21, locale22, locale23 };
        java.util.ArrayList<java.util.Locale> localeList25 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList25, localeArray24);
        java.util.List<java.util.Locale> localeList27 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale locale37 = new java.util.Locale("");
        java.util.Locale locale39 = new java.util.Locale("");
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale37, locale39, locale40, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList53);
        java.util.Locale locale57 = new java.util.Locale("");
        java.util.Locale locale59 = new java.util.Locale("");
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.util.Locale locale61 = java.util.Locale.ENGLISH;
        java.util.Locale locale62 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray63 = new java.util.Locale[] { locale57, locale59, locale60, locale61, locale62 };
        java.util.ArrayList<java.util.Locale> localeList64 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList64, localeArray63);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList64);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList72);
        java.util.Locale locale76 = new java.util.Locale("");
        java.util.Locale locale78 = new java.util.Locale("");
        java.util.Locale locale79 = java.util.Locale.ENGLISH;
        java.util.Locale locale80 = java.util.Locale.ENGLISH;
        java.util.Locale locale81 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale76, locale78, locale79, locale80, locale81 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList86);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertNull(locale88);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_TW", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_tw");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale1.getDisplayLanguage(locale9);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale12.getDisplayCountry(locale14);
        java.lang.String str17 = locale9.getDisplayVariant(locale14);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.lang.String str22 = locale20.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        boolean boolean24 = locale23.hasExtensions();
        java.lang.String str25 = locale23.getDisplayScript();
        java.lang.String str26 = locale23.getCountry();
        java.lang.String str27 = locale20.getDisplayLanguage(locale23);
        java.lang.String str28 = locale9.getDisplayLanguage(locale20);
        java.lang.String str29 = locale9.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GBR" + "'", str13, "GBR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GBR" + "'", str15, "GBR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United Kingdom" + "'", str16, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-TW" + "'", str22, "zh-TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinesisch" + "'", str27, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u82f1\u6587" + "'", str28, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        boolean boolean4 = languageRange1.equals((java.lang.Object) (-1816352593));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        boolean boolean5 = languageRange1.equals((java.lang.Object) 0.09404057f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.lang.String str12 = faker10.numerify("und");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "und" + "'", str12, "und");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("gbr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: gbr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.PhoneNumber phoneNumber9 = faker1.phoneNumber();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        com.github.javafaker.Options options11 = faker1.options;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.DateAndTime dateAndTime15 = faker13.dateAndTime;
        com.github.javafaker.service.RandomService randomService16 = faker13.randomService;
        com.github.javafaker.Code code17 = faker13.code();
        faker1.code = code17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = faker1.resolve("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(code17);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("\u82f1\u6587", "United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale5.getUnicodeLocaleType("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chinese");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: United States");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.lang.String str4 = locale0.getDisplayCountry(locale3);
        java.lang.String str5 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("eng");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "eng");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "eng");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "eng");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setUnicodeLocaleKeyword("United Kingdom", "Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder8.setScript("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh-TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str2 = locale0.getUnicodeLocaleType("en");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker1.resolve("CA");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Random random4 = new java.util.Random();
        java.util.stream.LongStream longStream5 = random4.longs();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random4.doubles((double) 0.07389319f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Book book11 = faker1.book;
        com.github.javafaker.Business business12 = faker1.business;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        java.lang.String str19 = faker17.numerify("");
        com.github.javafaker.Number number20 = faker17.number();
        faker14.number = number20;
        com.github.javafaker.service.RandomService randomService22 = null;
        faker14.randomService = randomService22;
        com.github.javafaker.Book book24 = faker14.book;
        com.github.javafaker.Business business25 = faker14.business;
        faker1.business = business25;
        java.lang.Class<?> wildcardClass27 = faker1.getClass();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(book24);
        org.junit.Assert.assertNotNull(business25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random0.doubles((-8792295023431898345L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (-1678470588));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Number number11 = faker8.number();
        faker5.number = number11;
        com.github.javafaker.service.RandomService randomService13 = null;
        faker5.randomService = randomService13;
        com.github.javafaker.Book book15 = faker5.book;
        com.github.javafaker.Business business16 = faker5.business;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        java.lang.String str23 = faker21.numerify("");
        com.github.javafaker.Number number24 = faker21.number();
        faker18.number = number24;
        com.github.javafaker.service.RandomService randomService26 = null;
        faker18.randomService = randomService26;
        com.github.javafaker.Book book28 = faker18.book;
        com.github.javafaker.Business business29 = faker18.business;
        faker5.business = business29;
        faker3.business = business29;
        com.github.javafaker.Name name32 = faker3.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(number24);
        org.junit.Assert.assertNotNull(book28);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertNotNull(name32);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random0.nextInt((-644952740));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder8.setScript("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Locale locale2 = new java.util.Locale("en", "en_US");
        org.junit.Assert.assertEquals(locale2.toString(), "en_EN_US");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        com.github.javafaker.Options options11 = faker1.options;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.DateAndTime dateAndTime15 = faker13.dateAndTime;
        com.github.javafaker.service.RandomService randomService16 = faker13.randomService;
        com.github.javafaker.Code code17 = faker13.code();
        faker1.code = code17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        java.lang.String str22 = faker20.numerify("");
        com.github.javafaker.Book book23 = null;
        faker20.book = book23;
        com.github.javafaker.Internet internet25 = faker20.internet();
        com.github.javafaker.Lorem lorem26 = faker20.lorem;
        java.util.Random random27 = null;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.DateAndTime dateAndTime29 = null;
        faker28.dateAndTime = dateAndTime29;
        com.github.javafaker.Lorem lorem31 = faker28.lorem;
        faker20.lorem = lorem31;
        java.util.Random random33 = null;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random33);
        java.lang.String str36 = faker34.numerify("");
        com.github.javafaker.Book book37 = null;
        faker34.book = book37;
        com.github.javafaker.Internet internet39 = faker34.internet();
        faker20.internet = internet39;
        faker1.internet = internet39;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(lorem31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(internet39);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        com.github.javafaker.Options options11 = faker1.options;
        com.github.javafaker.Code code12 = faker1.code;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker1.resolve("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getDisplayName(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        faker1.number = number14;
        com.github.javafaker.Address address16 = faker1.address();
        com.github.javafaker.Number number17 = null;
        faker1.number = number17;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(address16);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream1 = random0.doubles();
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        long long7 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs(315664383340106314L, (long) (-1779109740));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4761938462403306675L + "'", long7 == 4761938462403306675L);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.DateAndTime dateAndTime4 = null;
        faker3.dateAndTime = dateAndTime4;
        com.github.javafaker.Lorem lorem6 = faker3.lorem;
        com.github.javafaker.Address address7 = faker3.address;
        com.github.javafaker.Finance finance8 = faker3.finance();
        boolean boolean9 = languageRange1.equals((java.lang.Object) finance8);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random0.ints((long) (byte) 0, 732850921, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-122, 102]");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.lang.String str8 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "United Kingdom" + "'", str6, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Address address14 = faker12.address;
        com.github.javafaker.Options options15 = faker12.options;
        com.github.javafaker.Business business16 = faker12.business();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color21 = faker20.color;
        faker12.color = color21;
        faker1.color = color21;
        com.github.javafaker.Address address24 = faker1.address();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(address24);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        boolean boolean10 = locale8.hasExtensions();
        boolean boolean11 = locale4.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "United Kingdom" + "'", str6, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("German", "zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: German [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random1.ints((long) (-1779109740), (-1816352593), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Address address14 = faker12.address;
        com.github.javafaker.Options options15 = faker12.options;
        com.github.javafaker.Business business16 = faker12.business();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color21 = faker20.color;
        faker12.color = color21;
        faker1.color = color21;
        com.github.javafaker.Finance finance24 = faker1.finance;
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Color color27 = faker26.color;
        com.github.javafaker.Options options28 = faker26.options();
        faker1.options = options28;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(options28);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setScript("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinesisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Company company7 = faker1.company;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.lang.Object obj8 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "de");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random0.ints((-1L), (int) (byte) 1, (-1816352593));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8507242f + "'", float8 == 0.8507242f);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguage("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Collection<java.lang.String> strCollection39 = null;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection39);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Color color5 = faker4.color;
        com.github.javafaker.Name name6 = faker4.name();
        com.github.javafaker.Options options7 = faker4.options;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Options options11 = faker9.options();
        com.github.javafaker.Color color12 = faker9.color();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.date();
        faker9.dateAndTime = dateAndTime20;
        faker4.dateAndTime = dateAndTime20;
        boolean boolean23 = locale0.equals((java.lang.Object) faker4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Locale locale0 = null;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream5 = random1.longs((long) '#');
        java.util.stream.LongStream longStream7 = random1.longs((long) (short) 0);
        java.util.stream.LongStream longStream9 = random1.longs((long) (byte) 0);
        double double10 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.127474776520055d) + "'", double10 == (-1.127474776520055d));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business5 = faker4.business;
        faker1.business = business5;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        java.lang.String str13 = faker11.numerify("");
        com.github.javafaker.Number number14 = faker11.number();
        faker8.number = number14;
        com.github.javafaker.Options options16 = faker8.options;
        faker1.options = options16;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(options16);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random0.longs(3825383892854141041L, (long) '#', (long) (-1779109740));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Internet internet4 = faker1.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.lang.Class<?> wildcardClass8 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "United Kingdom" + "'", str6, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.DateAndTime dateAndTime8 = faker1.dateAndTime;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream4 = random0.ints();
        java.util.stream.LongStream longStream7 = random0.longs((long) 0, 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs(1L, (long) (-1779109740));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.util.Random random2 = new java.util.Random();
        int int4 = random2.nextInt((int) (short) 1);
        random2.setSeed((long) 100);
        float float7 = random2.nextFloat();
        java.util.stream.LongStream longStream10 = random2.longs(0L, (long) 732850921);
        boolean boolean11 = languageRange1.equals((java.lang.Object) longStream10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.7220096f + "'", float7 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale1.getDisplayLanguage(locale9);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale12.getDisplayCountry(locale14);
        java.lang.String str17 = locale9.getDisplayVariant(locale14);
        java.lang.Class<?> wildcardClass18 = locale14.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GBR" + "'", str13, "GBR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GBR" + "'", str15, "GBR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United Kingdom" + "'", str16, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.lang.String str11 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh_TW" + "'", str11, "zh_TW");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Random random1 = new java.util.Random((long) (-1779109740));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Locale locale2 = new java.util.Locale("GB", "en_US");
        org.junit.Assert.assertEquals(locale2.toString(), "gb_EN_US");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale5.getDisplayScript();
        java.lang.String str8 = locale5.getCountry();
        java.lang.String str9 = locale2.getDisplayLanguage(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale2.getUnicodeLocaleType("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: und");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinesisch" + "'", str9, "Chinesisch");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.removeUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder16.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TW");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        int int8 = random0.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1637860121) + "'", int8 == (-1637860121));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder17 = builder13.setLanguage("gbr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setLanguageTag("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale locale17 = builder13.build();
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale17.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        double double2 = random0.nextGaussian();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22085177454718163d + "'", double2 == 0.22085177454718163d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getISO3Language();
        boolean boolean2 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale8.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str5, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Lorem lorem11 = faker9.lorem();
        com.github.javafaker.Finance finance12 = faker9.finance;
        com.github.javafaker.Number number13 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker9.phoneNumber = phoneNumber14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker9.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService16;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Color color20 = faker19.color;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Number number25 = faker22.number();
        faker19.number = number25;
        com.github.javafaker.service.RandomService randomService27 = null;
        faker19.randomService = randomService27;
        com.github.javafaker.Business business29 = faker19.business;
        faker7.business = business29;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService36 = faker32.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService36;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str5, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(fakeValuesService36);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company;
        com.github.javafaker.Address address2 = faker0.address();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(address2);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.DoubleStream doubleStream15 = random8.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1 };
        random8.nextBytes(byteArray18);
        random0.nextBytes(byteArray18);
        boolean boolean21 = random0.nextBoolean();
        int int22 = random0.nextInt();
        boolean boolean23 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream25 = random0.longs((long) (-1953204083));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(byteArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[120, 34]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1133647525 + "'", int22 == 1133647525);
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Locale locale8 = locale6.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder4 = builder0.setLanguage("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        java.lang.String str5 = faker1.bothify("German");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "German" + "'", str5, "German");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale0.getDisplayName(locale2);
        java.util.Locale locale7 = null;
        java.lang.String str8 = null; // flaky: locale0.getDisplayScript(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (Canada)" + "'", str6, "English (Canada)");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("United States", "German");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.lang.String str6 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str8 = locale0.getDisplayCountry();
        java.util.Locale.setDefault(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        double double7 = random0.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3395952978895302d + "'", double7 == 0.3395952978895302d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.LongStream longStream8 = random0.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Locale locale8 = locale6.stripExtensions();
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        java.lang.Class<?> wildcardClass10 = random0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.IntStream intStream2 = random0.ints();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.Color color9 = faker1.color;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale11.getUnicodeLocaleType("gbr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: gbr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedkingdom");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale locale1 = new java.util.Locale("Chinesisch");
        org.junit.Assert.assertEquals(locale1.toString(), "chinesisch");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Address address7 = null;
        faker1.address = address7;
        com.github.javafaker.Finance finance9 = faker1.finance;
        com.github.javafaker.Book book10 = faker1.book;
        com.github.javafaker.Lorem lorem11 = faker1.lorem;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        java.util.Locale locale3 = java.util.Locale.PRC;
        boolean boolean4 = languageRange1.equals((java.lang.Object) locale3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "zh_TW");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = null;
        faker3.fakeValuesService = fakeValuesService4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.lang.String str12 = faker10.numerify("");
        com.github.javafaker.Number number13 = faker10.number();
        faker7.number = number13;
        com.github.javafaker.Options options15 = faker7.options;
        com.github.javafaker.Color color16 = faker7.color;
        faker3.color = color16;
        com.github.javafaker.Internet internet18 = faker3.internet;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(internet18);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color;
        com.github.javafaker.Options options4 = faker2.options();
        com.github.javafaker.Color color5 = faker2.color();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        java.lang.String str9 = faker7.numerify("");
        com.github.javafaker.Book book10 = null;
        faker7.book = book10;
        com.github.javafaker.Internet internet12 = faker7.internet;
        com.github.javafaker.DateAndTime dateAndTime13 = faker7.date();
        faker2.dateAndTime = dateAndTime13;
        boolean boolean15 = locale0.equals((java.lang.Object) dateAndTime13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tw");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Locale locale1 = new java.util.Locale("TWN");
        org.junit.Assert.assertEquals(locale1.toString(), "twn");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        float float11 = random6.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random6.ints((long) '#', (int) '4', (-530973977));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.26592457f + "'", float11 == 0.26592457f);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Color color4 = faker3.color;
        com.github.javafaker.Options options5 = faker3.options();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime8 = null;
        faker7.dateAndTime = dateAndTime8;
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        faker3.lorem = lorem10;
        com.github.javafaker.Name name12 = faker3.name;
        com.github.javafaker.Business business13 = faker3.business();
        faker0.business = business13;
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("United Kingdom", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedkingdom");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Company company23 = faker22.company;
        com.github.javafaker.Color color24 = faker22.color();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Number number11 = faker10.number;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.LongStream longStream8 = random0.longs((long) '4');
        boolean boolean9 = random0.nextBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Locale locale2 = new java.util.Locale("English (United States)", "TWN");
        java.lang.String str3 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "english (united states)_TWN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setLanguageTag("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale0.getDisplayVariant(locale8);
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale0.getDisplayName(locale11);
        java.lang.String str13 = locale11.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str7, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (United States)" + "'", str12, "English (United States)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder8.removeUnicodeLocaleAttribute("zho");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random0.doubles((-2940033693400677950L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-64, -45]");
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Business business7 = faker1.business;
        com.github.javafaker.Business business8 = faker1.business();
        com.github.javafaker.Lorem lorem9 = faker1.lorem;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh_TW");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream8 = random0.ints((-1637860121), 10);
        java.util.stream.LongStream longStream10 = random0.longs((long) 732850921);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7220096f + "'", float5 == 0.7220096f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker1.phoneNumber();
        com.github.javafaker.Lorem lorem22 = faker1.lorem;
        com.github.javafaker.Options options23 = faker1.options();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertNotNull(options23);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.LongStream longStream8 = random0.longs((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((long) (-1205452174));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        int int11 = random6.nextInt();
        float float12 = random6.nextFloat();
        double double13 = random6.nextDouble();
        long long14 = random6.nextLong();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1035734030) + "'", int11 == (-1035734030));
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.25582486f + "'", float12 == 0.25582486f);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.12769266196192897d + "'", double13 == 0.12769266196192897d);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-114119671957592117L) + "'", long14 == (-114119671957592117L));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Code code4 = faker1.code;
        com.github.javafaker.Number number5 = faker1.number;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.Name name9 = faker7.name();
        faker1.name = name9;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Finance finance6 = faker1.finance;
        com.github.javafaker.Book book7 = faker1.book();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(book7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getCountry();
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        com.github.javafaker.Code code8 = faker7.code;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TW" + "'", str5, "TW");
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Color color5 = faker4.color;
        com.github.javafaker.Name name6 = faker4.name();
        faker1.name = name6;
        com.github.javafaker.Company company8 = faker1.company();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem;
        com.github.javafaker.Address address10 = faker6.address;
        com.github.javafaker.Code code11 = faker6.code();
        faker1.code = code11;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        com.github.javafaker.Address address16 = faker14.address;
        com.github.javafaker.Options options17 = faker14.options;
        com.github.javafaker.DateAndTime dateAndTime18 = faker14.dateAndTime;
        faker1.dateAndTime = dateAndTime18;
        com.github.javafaker.Book book20 = null;
        faker1.book = book20;
        com.github.javafaker.PhoneNumber phoneNumber22 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(phoneNumber22);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.lang.Class<?> wildcardClass9 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Color color8 = faker7.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.setLanguage("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Options options11 = faker9.options();
        com.github.javafaker.Color color12 = faker9.color();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.date();
        faker9.dateAndTime = dateAndTime20;
        faker1.dateAndTime = dateAndTime20;
        java.lang.String str24 = faker1.bothify("und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "und" + "'", str24, "und");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setScript("\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale0.getDisplayVariant(locale8);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str7, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale2.getDisplayCountry(locale6);
        java.util.Locale.setDefault(locale2);
        java.lang.String str11 = locale2.getLanguage();
        java.lang.String str12 = locale0.getDisplayLanguage(locale2);
        java.util.Random random13 = new java.util.Random();
        int int15 = random13.nextInt((int) (short) 1);
        random13.setSeed((long) 100);
        float float18 = random13.nextFloat();
        java.util.stream.IntStream intStream21 = random13.ints((-1637860121), 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-TW" + "'", str8, "zh-TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Japanese" + "'", str12, "Japanese");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.7220096f + "'", float18 == 0.7220096f);
        org.junit.Assert.assertNotNull(intStream21);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Business business11 = faker1.business;
        com.github.javafaker.DateAndTime dateAndTime12 = faker1.date();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        com.github.javafaker.Name name16 = faker14.name();
        com.github.javafaker.Options options17 = faker14.options;
        faker1.options = options17;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale0.getDisplayName(locale2);
        java.lang.String str7 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (Canada)" + "'", str6, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Random random1 = new java.util.Random((long) (-1816352593));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.setScript("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: English (United States) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Company company8 = null;
        faker7.company = company8;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.DateAndTime dateAndTime11 = faker7.dateAndTime;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        com.github.javafaker.Book book14 = faker1.book;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(book14);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) (byte) 10);
        java.util.stream.IntStream intStream12 = random0.ints();
        long long13 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = random0.longs((long) 'x', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-4894608278020295867L) + "'", long13 == (-4894608278020295867L));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayScript(locale3);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale3.getDisplayVariant(locale8);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale8.getDisplayCountry(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-TW" + "'", str5, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayScript(locale3);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale3.getDisplayVariant(locale8);
        java.lang.String str10 = locale3.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-TW" + "'", str5, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese" + "'", str6, "Chinese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese" + "'", str10, "Chinese");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random0.ints((long) (-1205452174), 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Company company11 = faker10.company;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TWN" + "'", str9, "TWN");
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        com.github.javafaker.Options options11 = faker1.options;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.DateAndTime dateAndTime15 = faker13.dateAndTime;
        com.github.javafaker.service.RandomService randomService16 = faker13.randomService;
        com.github.javafaker.Code code17 = faker13.code();
        faker1.code = code17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Color color21 = faker20.color;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        java.lang.String str25 = faker23.numerify("");
        com.github.javafaker.Number number26 = faker23.number();
        faker20.number = number26;
        com.github.javafaker.Company company28 = null;
        faker20.company = company28;
        java.util.Random random30 = null;
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Color color32 = faker31.color;
        com.github.javafaker.Address address33 = faker31.address;
        com.github.javafaker.Options options34 = faker31.options;
        com.github.javafaker.Business business35 = faker31.business();
        java.util.Random random36 = new java.util.Random();
        int int38 = random36.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Color color40 = faker39.color;
        faker31.color = color40;
        faker20.color = color40;
        com.github.javafaker.Finance finance43 = faker20.finance;
        faker1.finance = finance43;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(number26);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(address33);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(business35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(finance43);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u570b");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((long) (byte) -1, (-1910256435), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        float float11 = random6.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random6.longs(100L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.24380875f + "'", float11 == 0.24380875f);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        boolean boolean8 = locale6.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en_US", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_us");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("Chinesisch", "gbr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinesisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        boolean boolean5 = random0.nextBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale.Builder builder18 = builder13.removeUnicodeLocaleAttribute("eng");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        boolean boolean6 = locale4.hasExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("\uc601\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getDisplayScript();
        java.lang.String str10 = locale6.getISO3Language();
        java.lang.String str11 = locale0.getDisplayLanguage(locale6);
        java.lang.String str13 = locale6.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "German" + "'", str11, "German");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "TWN");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("und");
        java.util.Locale.Builder builder15 = builder13.setVariant("");
        java.util.Locale.Builder builder18 = builder13.setExtension('a', "zho");
        java.util.Locale.Builder builder20 = builder18.setLanguageTag("en");
        java.util.Locale.Builder builder21 = builder18.clearExtensions();
        java.util.Locale locale22 = builder18.build();
        boolean boolean23 = languageRange1.equals((java.lang.Object) builder18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles(0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Internet internet8 = null;
        faker1.internet = internet8;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eng");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Address address11 = faker10.address();
        com.github.javafaker.Internet internet12 = faker10.internet;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        java.lang.String str8 = locale5.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "USA" + "'", str8, "USA");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        com.github.javafaker.Lorem lorem24 = faker22.lorem();
        com.github.javafaker.Finance finance25 = faker22.finance;
        faker1.finance = finance25;
        com.github.javafaker.Internet internet27 = faker1.internet();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(lorem24);
        org.junit.Assert.assertNotNull(finance25);
        org.junit.Assert.assertNotNull(internet27);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale42 = new java.util.Locale("GBR", "\u82f1\u570b", "eng");
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet43);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "\u82f1\u570b_eng");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        java.lang.Class<?> wildcardClass21 = faker1.getClass();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getScript();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Random random1 = new java.util.Random((long) (byte) 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        int int9 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = random0.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.02597034f + "'", float8 == 0.02597034f);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-507541683) + "'", int9 == (-507541683));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        boolean boolean2 = locale0.equals((java.lang.Object) (-582069258542454676L));
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder11 = builder8.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream4 = random0.ints();
        java.util.stream.IntStream intStream6 = random0.ints(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) (-1910256435));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_CA" + "'", str1, "fr_CA");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        java.lang.String str5 = faker3.numerify("");
        com.github.javafaker.Book book6 = null;
        faker3.book = book6;
        com.github.javafaker.Internet internet8 = faker3.internet();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker3.phoneNumber();
        boolean boolean10 = languageRange1.equals((java.lang.Object) phoneNumber9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Lorem lorem11 = faker9.lorem();
        com.github.javafaker.Finance finance12 = faker9.finance;
        com.github.javafaker.Number number13 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker9.phoneNumber = phoneNumber14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker9.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService16;
        com.github.javafaker.Book book18 = faker7.book();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business11 = faker10.business();
        com.github.javafaker.service.RandomService randomService12 = faker10.randomService;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(randomService12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Random random1 = new java.util.Random(10L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Locale locale2 = new java.util.Locale("Korean", "\u82f1\u6587\u7f8e\u570b)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Locale locale2 = new java.util.Locale("English (United States)", "TWN");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "english (united states)_TWN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.stream.LongStream longStream23 = random0.longs((long) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5448365f + "'", float16 == 0.5448365f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-59, -92]");
        org.junit.Assert.assertNotNull(longStream23);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet;
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.date();
        com.github.javafaker.Code code12 = faker5.code;
        com.github.javafaker.Code code13 = faker5.code();
        faker1.code = code13;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream26 = random17.longs((long) 1, (long) 732850921, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        com.github.javafaker.Company company8 = faker0.company;
        java.lang.String str10 = faker0.numerify("GBR");
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GBR" + "'", str10, "GBR");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        boolean boolean6 = locale2.hasExtensions();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        java.util.Locale.Builder builder20 = builder18.setVariant("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        java.lang.String str15 = faker13.numerify("");
        com.github.javafaker.Number number16 = faker13.number();
        faker10.number = number16;
        faker1.number = number16;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        java.lang.String str22 = faker20.numerify("");
        com.github.javafaker.Book book23 = null;
        faker20.book = book23;
        com.github.javafaker.Internet internet25 = faker20.internet;
        com.github.javafaker.DateAndTime dateAndTime26 = faker20.date();
        com.github.javafaker.Code code27 = faker20.code;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        com.github.javafaker.Lorem lorem31 = faker29.lorem();
        com.github.javafaker.Finance finance32 = faker29.finance;
        com.github.javafaker.Number number33 = faker29.number();
        faker20.number = number33;
        com.github.javafaker.Address address35 = faker20.address();
        com.github.javafaker.Company company36 = faker20.company;
        faker1.company = company36;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(code27);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(lorem31);
        org.junit.Assert.assertNotNull(finance32);
        org.junit.Assert.assertNotNull(number33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(company36);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Code code8 = faker1.code;
        com.github.javafaker.service.RandomService randomService9 = faker1.randomService;
        com.github.javafaker.Business business10 = faker1.business;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("fr_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fr_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Options options3 = faker1.options();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        faker1.lorem = lorem8;
        com.github.javafaker.Name name10 = faker1.name;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker1.resolve("\uc601\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Color color7 = faker1.color;
        com.github.javafaker.Code code8 = faker1.code();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker1.phoneNumber();
        com.github.javafaker.Lorem lorem22 = faker1.lorem;
        com.github.javafaker.Options options23 = faker1.options;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(phoneNumber21);
        org.junit.Assert.assertNotNull(lorem22);
        org.junit.Assert.assertNotNull(options23);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        int int9 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles(1.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.60684615f + "'", float8 == 0.60684615f);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2082705988 + "'", int9 == 2082705988);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "eng");
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale9.getDisplayCountry(locale13);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.lang.String str19 = locale9.getDisplayLanguage(locale17);
        java.util.Locale locale20 = java.util.Locale.UK;
        java.lang.String str21 = locale20.getISO3Country();
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale22.getISO3Country();
        java.lang.String str24 = locale20.getDisplayCountry(locale22);
        java.lang.String str25 = locale17.getDisplayVariant(locale22);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.lang.String str30 = locale28.toLanguageTag();
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        boolean boolean32 = locale31.hasExtensions();
        java.lang.String str33 = locale31.getDisplayScript();
        java.lang.String str34 = locale31.getCountry();
        java.lang.String str35 = locale28.getDisplayLanguage(locale31);
        java.lang.String str36 = locale17.getDisplayLanguage(locale28);
        java.lang.String str37 = locale17.getDisplayScript();
        java.lang.String str38 = locale3.getDisplayVariant(locale17);
        java.lang.String str39 = locale2.getDisplayLanguage(locale17);
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_ENG");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GBR" + "'", str4, "GBR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GBR" + "'", str6, "GBR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United Kingdom" + "'", str7, "United Kingdom");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GBR" + "'", str21, "GBR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GBR" + "'", str23, "GBR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "United Kingdom" + "'", str24, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-TW" + "'", str30, "zh-TW");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Chinesisch" + "'", str35, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u82f1\u6587" + "'", str36, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "chinese" + "'", str39, "chinese");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        java.util.stream.IntStream intStream11 = random0.ints((-1779109740), 100);
        int int12 = random0.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.3558784f + "'", float8 == 0.3558784f);
        org.junit.Assert.assertNotNull(intStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1020261286) + "'", int12 == (-1020261286));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Book book8 = faker1.book;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.DateAndTime dateAndTime11 = null;
        faker10.dateAndTime = dateAndTime11;
        com.github.javafaker.Lorem lorem13 = faker10.lorem;
        com.github.javafaker.Address address14 = faker10.address;
        com.github.javafaker.Finance finance15 = faker10.finance();
        com.github.javafaker.Number number16 = faker10.number();
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        java.lang.String str20 = faker18.numerify("");
        com.github.javafaker.Number number21 = faker18.number();
        com.github.javafaker.Name name22 = faker18.name();
        faker10.name = name22;
        faker1.name = name22;
        com.github.javafaker.Book book25 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        java.util.Random random16 = new java.util.Random();
        int int18 = random16.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream20 = random16.longs((long) '#');
        java.util.stream.DoubleStream doubleStream23 = random16.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1 };
        random16.nextBytes(byteArray26);
        random8.nextBytes(byteArray26);
        random1.nextBytes(byteArray26);
        random1.setSeed(5152437456759013946L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream35 = random1.longs((long) (-1910256435), 100L, (long) (-1953204083));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-76, -37]");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime8 = null;
        faker7.dateAndTime = dateAndTime8;
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        com.github.javafaker.Address address11 = faker7.address;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        com.github.javafaker.Finance finance20 = faker1.finance();
        com.github.javafaker.Book book21 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale5 = builder2.build();
        java.lang.String str6 = locale5.getISO3Language();
        boolean boolean7 = languageRange1.equals((java.lang.Object) locale5);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        java.lang.String str13 = faker11.numerify("");
        com.github.javafaker.Address address14 = faker11.address;
        com.github.javafaker.DateAndTime dateAndTime15 = faker11.dateAndTime;
        faker1.dateAndTime = dateAndTime15;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(dateAndTime15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Locale locale33 = new java.util.Locale("");
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale31, locale33, locale34, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList46);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = null;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList55);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList56);
        java.util.Locale locale58 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode60 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet59, filteringMode60);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertTrue("'" + filteringMode60 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode60.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList61);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale.setDefault(locale1);
        java.lang.String str10 = locale1.getLanguage();
        java.lang.String str11 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        boolean boolean6 = locale4.hasExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setUnicodeLocaleKeyword("English", "TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap39);
        java.util.Locale locale44 = new java.util.Locale("GBR", "\u82f1\u570b", "eng");
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str46 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet45);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(languageRangeList40);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "\u82f1\u570b_eng");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code2 = faker1.code;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options();
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Lorem lorem11 = faker9.lorem();
        com.github.javafaker.Finance finance12 = faker9.finance;
        com.github.javafaker.Number number13 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker9.phoneNumber = phoneNumber14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker9.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService16;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Color color20 = faker19.color;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        java.lang.String str24 = faker22.numerify("");
        com.github.javafaker.Number number25 = faker22.number();
        faker19.number = number25;
        com.github.javafaker.service.RandomService randomService27 = null;
        faker19.randomService = randomService27;
        com.github.javafaker.Business business29 = faker19.business;
        faker7.business = business29;
        com.github.javafaker.Address address31 = faker7.address;
        com.github.javafaker.Business business32 = faker7.business;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(business32);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        boolean boolean2 = locale0.hasExtensions();
        java.lang.String str3 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Business business6 = faker1.business;
        com.github.javafaker.Company company7 = faker1.company();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Options options12 = faker9.options;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.DateAndTime dateAndTime15 = null;
        faker14.dateAndTime = dateAndTime15;
        com.github.javafaker.Lorem lorem17 = faker14.lorem;
        com.github.javafaker.Address address18 = faker14.address;
        com.github.javafaker.Code code19 = faker14.code();
        faker9.code = code19;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Color color23 = faker22.color;
        com.github.javafaker.Address address24 = faker22.address;
        com.github.javafaker.Options options25 = faker22.options;
        com.github.javafaker.DateAndTime dateAndTime26 = faker22.dateAndTime;
        faker9.dateAndTime = dateAndTime26;
        faker1.dateAndTime = dateAndTime26;
        com.github.javafaker.Company company29 = faker1.company;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(address24);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(company29);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime8 = null;
        faker7.dateAndTime = dateAndTime8;
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        com.github.javafaker.Address address11 = faker7.address;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        com.github.javafaker.Company company20 = null;
        faker1.company = company20;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.LongStream longStream14 = random8.longs((long) (short) 0);
        boolean boolean15 = random8.nextBoolean();
        float float16 = random8.nextFloat();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1 };
        random8.nextBytes(byteArray19);
        random0.nextBytes(byteArray19);
        java.util.stream.IntStream intStream23 = random0.ints(5152437456759013946L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream26 = random0.doubles((double) 10L, (double) (-8792295023431898345L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.77853423f + "'", float16 == 0.77853423f);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-113, -57]");
        org.junit.Assert.assertNotNull(intStream23);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.date();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.DateAndTime dateAndTime11 = null;
        faker10.dateAndTime = dateAndTime11;
        com.github.javafaker.Lorem lorem13 = faker10.lorem;
        com.github.javafaker.Address address14 = faker10.address;
        faker6.address = address14;
        faker1.address = address14;
        org.junit.Assert.assertNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(address14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Options options4 = faker1.options();
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("GBR");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] { languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = null;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList41);
        java.util.Collection<java.util.Locale> localeCollection44 = null;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection44);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(localeList45);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayName(locale5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale1.getDisplayVariant(locale9);
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale1.getDisplayName(locale12);
        boolean boolean14 = locale0.equals((java.lang.Object) locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str8, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (United States)" + "'", str13, "English (United States)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Code code8 = faker1.code;
        java.lang.String str10 = faker1.numerify("zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh_TW" + "'", str10, "zh_TW");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.lang.String str8 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str7, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Options options9 = faker1.options;
        com.github.javafaker.Color color10 = faker1.color;
        com.github.javafaker.Options options11 = null;
        faker1.options = options11;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale5.getDisplayCountry(locale7);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.lang.String str13 = locale0.getDisplayName(locale11);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale locale15 = builder14.build();
        java.util.Locale.Builder builder17 = builder14.addUnicodeLocaleAttribute("zho");
        boolean boolean18 = locale0.equals((java.lang.Object) "zho");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "German" + "'", str13, "German");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.service.RandomService randomService6 = faker1.randomService;
        com.github.javafaker.Business business7 = faker1.business;
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.DateAndTime dateAndTime7 = null;
        faker6.dateAndTime = dateAndTime7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem;
        com.github.javafaker.Address address10 = faker6.address;
        com.github.javafaker.Code code11 = faker6.code();
        faker1.code = code11;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Color color15 = faker14.color;
        com.github.javafaker.Address address16 = faker14.address;
        com.github.javafaker.Options options17 = faker14.options;
        com.github.javafaker.DateAndTime dateAndTime18 = faker14.dateAndTime;
        faker1.dateAndTime = dateAndTime18;
        com.github.javafaker.Name name20 = faker1.name();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertNotNull(name20);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        random0.setSeed((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random0.doubles((-8792295023431898345L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str7 = faker1.numerify("gbr");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Code code4 = faker1.code;
        com.github.javafaker.Finance finance5 = faker1.finance;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Lorem lorem10 = faker1.lorem;
        com.github.javafaker.Color color11 = faker1.color;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale3.getDisplayCountry(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale3);
        java.util.Set<java.lang.Character> charSet9 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etats-Unis" + "'", str7, "Etats-Unis");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (Taiwan)" + "'", str8, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.DateAndTime dateAndTime9 = faker7.dateAndTime;
        com.github.javafaker.service.RandomService randomService10 = faker7.randomService;
        faker1.randomService = randomService10;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        java.lang.String str18 = faker16.numerify("");
        com.github.javafaker.Number number19 = faker16.number();
        faker13.number = number19;
        faker1.number = number19;
        com.github.javafaker.Options options22 = faker1.options();
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(options22);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder8.build();
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale11.getISO3Language();
        java.lang.String str14 = locale11.getDisplayVariant();
        java.lang.String str15 = locale11.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale11);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setScript("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getISO3Country();
        java.util.Random random5 = new java.util.Random();
        int int7 = random5.nextInt((int) (short) 1);
        random5.setSeed((long) 100);
        float float10 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random5.doubles((long) 10);
        java.util.stream.DoubleStream doubleStream14 = random5.doubles(0L);
        java.util.stream.DoubleStream doubleStream17 = random5.doubles((double) (-7066843796264617845L), (double) (-553780171));
        boolean boolean18 = locale0.equals((java.lang.Object) (-553780171));
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "USA" + "'", str4, "USA");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.7220096f + "'", float10 == 0.7220096f);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Business business5 = faker1.business();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color10 = faker9.color;
        faker1.color = color10;
        com.github.javafaker.Name name12 = faker1.name;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setVariant("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh-TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Name name12 = faker10.name();
        com.github.javafaker.Options options13 = faker10.options;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Options options17 = faker15.options();
        com.github.javafaker.Color color18 = faker15.color();
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        java.lang.String str22 = faker20.numerify("");
        com.github.javafaker.Book book23 = null;
        faker20.book = book23;
        com.github.javafaker.Internet internet25 = faker20.internet;
        com.github.javafaker.DateAndTime dateAndTime26 = faker20.date();
        faker15.dateAndTime = dateAndTime26;
        faker10.dateAndTime = dateAndTime26;
        faker1.dateAndTime = dateAndTime26;
        com.github.javafaker.Options options30 = faker1.options();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(options30);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Locale locale3 = new java.util.Locale("Japanese", "GBR", "en");
        org.junit.Assert.assertEquals(locale3.toString(), "japanese_GBR_en");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Address address7 = null;
        faker1.address = address7;
        com.github.javafaker.Finance finance9 = faker1.finance;
        com.github.javafaker.Book book10 = faker1.book;
        com.github.javafaker.Internet internet11 = faker1.internet();
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.DateAndTime dateAndTime14 = null;
        faker13.dateAndTime = dateAndTime14;
        com.github.javafaker.Lorem lorem16 = faker13.lorem;
        faker1.lorem = lorem16;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(lorem16);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_us");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und", 0.7346627443280227d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7346627443280227d + "'", double3 == 0.7346627443280227d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream15 = random0.doubles((long) 'a', 0.3395952978895302d, (double) 8367377884186257788L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.7346627f + "'", float11 == 0.7346627f);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        com.github.javafaker.DateAndTime dateAndTime9 = faker7.dateAndTime;
        com.github.javafaker.service.RandomService randomService10 = faker7.randomService;
        faker1.randomService = randomService10;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        java.lang.String str18 = faker16.numerify("");
        com.github.javafaker.Number number19 = faker16.number();
        faker13.number = number19;
        faker1.number = number19;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(fakeValuesService22);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.numerify("");
        com.github.javafaker.Book book8 = null;
        faker5.book = book8;
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker5.phoneNumber();
        faker1.phoneNumber = phoneNumber11;
        com.github.javafaker.DateAndTime dateAndTime13 = faker1.dateAndTime;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.lang.String str17 = faker15.numerify("");
        com.github.javafaker.Book book18 = null;
        faker15.book = book18;
        com.github.javafaker.Internet internet20 = faker15.internet();
        com.github.javafaker.Lorem lorem21 = faker15.lorem;
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker15.lorem = lorem26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Color color30 = faker29.color;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Number number35 = faker32.number();
        faker29.number = number35;
        com.github.javafaker.Company company37 = null;
        faker29.company = company37;
        com.github.javafaker.Options options39 = faker29.options;
        com.github.javafaker.Code code40 = faker29.code;
        faker15.code = code40;
        faker1.code = code40;
        java.util.Random random43 = null;
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        java.lang.String str46 = faker44.numerify("");
        com.github.javafaker.Book book47 = null;
        faker44.book = book47;
        com.github.javafaker.Internet internet49 = faker44.internet;
        com.github.javafaker.DateAndTime dateAndTime50 = faker44.date();
        com.github.javafaker.Code code51 = faker44.code;
        java.util.Random random52 = null;
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(random52);
        com.github.javafaker.Color color54 = faker53.color;
        com.github.javafaker.Lorem lorem55 = faker53.lorem();
        com.github.javafaker.Finance finance56 = faker53.finance;
        com.github.javafaker.Number number57 = faker53.number();
        faker44.number = number57;
        com.github.javafaker.Address address59 = faker44.address();
        com.github.javafaker.Company company60 = faker44.company;
        faker1.company = company60;
        java.util.Random random62 = null;
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(random62);
        com.github.javafaker.Color color64 = faker63.color;
        com.github.javafaker.Address address65 = faker63.address;
        com.github.javafaker.Options options66 = faker63.options;
        com.github.javafaker.DateAndTime dateAndTime67 = faker63.dateAndTime;
        com.github.javafaker.Business business68 = faker63.business;
        com.github.javafaker.Company company69 = faker63.company();
        java.util.Random random70 = null;
        com.github.javafaker.Faker faker71 = new com.github.javafaker.Faker(random70);
        com.github.javafaker.Color color72 = faker71.color;
        com.github.javafaker.Address address73 = faker71.address;
        com.github.javafaker.Options options74 = faker71.options;
        java.util.Random random75 = null;
        com.github.javafaker.Faker faker76 = new com.github.javafaker.Faker(random75);
        com.github.javafaker.DateAndTime dateAndTime77 = null;
        faker76.dateAndTime = dateAndTime77;
        com.github.javafaker.Lorem lorem79 = faker76.lorem;
        com.github.javafaker.Address address80 = faker76.address;
        com.github.javafaker.Code code81 = faker76.code();
        faker71.code = code81;
        java.util.Random random83 = null;
        com.github.javafaker.Faker faker84 = new com.github.javafaker.Faker(random83);
        com.github.javafaker.Color color85 = faker84.color;
        com.github.javafaker.Address address86 = faker84.address;
        com.github.javafaker.Options options87 = faker84.options;
        com.github.javafaker.DateAndTime dateAndTime88 = faker84.dateAndTime;
        faker71.dateAndTime = dateAndTime88;
        faker63.dateAndTime = dateAndTime88;
        faker1.dateAndTime = dateAndTime88;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(lorem21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(number35);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(dateAndTime50);
        org.junit.Assert.assertNotNull(code51);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(lorem55);
        org.junit.Assert.assertNotNull(finance56);
        org.junit.Assert.assertNotNull(number57);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertNotNull(company60);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(address65);
        org.junit.Assert.assertNotNull(options66);
        org.junit.Assert.assertNotNull(dateAndTime67);
        org.junit.Assert.assertNotNull(business68);
        org.junit.Assert.assertNotNull(company69);
        org.junit.Assert.assertNotNull(color72);
        org.junit.Assert.assertNotNull(address73);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(lorem79);
        org.junit.Assert.assertNotNull(address80);
        org.junit.Assert.assertNotNull(code81);
        org.junit.Assert.assertNotNull(color85);
        org.junit.Assert.assertNotNull(address86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNotNull(dateAndTime88);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Locale locale33 = new java.util.Locale("");
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale31, locale33, locale34, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList46);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = null;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList55);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList56);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Locale locale69 = new java.util.Locale("");
        java.util.Locale locale70 = java.util.Locale.ENGLISH;
        java.util.Locale locale71 = java.util.Locale.ENGLISH;
        java.util.Locale locale72 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale67, locale69, locale70, locale71, locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList82);
        java.util.Locale locale86 = new java.util.Locale("");
        java.util.Locale locale88 = new java.util.Locale("");
        java.util.Locale locale89 = java.util.Locale.ENGLISH;
        java.util.Locale locale90 = java.util.Locale.ENGLISH;
        java.util.Locale locale91 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale86, locale88, locale89, locale90, locale91 };
        java.util.ArrayList<java.util.Locale> localeList93 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList93, localeArray92);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale locale96 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap98 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList99 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap98);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertEquals(locale88.toString(), "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(languageRangeList99);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Locale locale2 = new java.util.Locale("hi!", "zh_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_ZH_TW");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.lang.String str6 = locale1.getCountry();
        java.lang.String str7 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream4 = random0.ints();
        java.util.stream.IntStream intStream6 = random0.ints(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random0.doubles((-2940033693400677950L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Company company13 = null;
        faker12.company = company13;
        com.github.javafaker.Name name15 = faker12.name();
        com.github.javafaker.Internet internet16 = faker12.internet();
        faker10.internet = internet16;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(internet16);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        int int11 = random6.nextInt();
        double double12 = random6.nextDouble();
        double double13 = random6.nextDouble();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1653753823) + "'", int11 == (-1653753823));
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05932575472436785d + "'", double12 == 0.05932575472436785d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2774563313513253d + "'", double13 == 0.2774563313513253d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.DateAndTime dateAndTime6 = faker1.date();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        java.util.Locale.Builder builder19 = builder13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder13.setScript("German");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: German [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1 };
        random0.nextBytes(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = random0.nextInt((-1910256435));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.59915596f + "'", float8 == 0.59915596f);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-60, -50]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code2 = faker1.code;
        com.github.javafaker.Address address3 = faker1.address;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Lorem lorem9 = faker5.lorem();
        faker1.lorem = lorem9;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = null;
        faker1.fakeValuesService = fakeValuesService11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker1.letterify("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        int int15 = random0.nextInt();
        long long16 = random0.nextLong();
        double double17 = random0.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-97, 70]");
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2137023216) + "'", int15 == (-2137023216));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 7959307406216468554L + "'", long16 == 7959307406216468554L);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.11732572243460254d + "'", double17 == 0.11732572243460254d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.lang.String str12 = faker10.numerify("chinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chinese" + "'", str12, "chinese");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Locale locale3 = new java.util.Locale("TWN", "GB", "");
        org.junit.Assert.assertEquals(locale3.toString(), "twn_GB");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = null;
        faker1.company = company2;
        com.github.javafaker.Finance finance4 = faker1.finance();
        com.github.javafaker.Finance finance5 = faker1.finance();
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Options options9 = faker1.options;
        com.github.javafaker.Color color10 = faker1.color;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        java.lang.String str14 = faker12.numerify("");
        com.github.javafaker.Code code15 = faker12.code;
        faker1.code = code15;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(code15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random1 = new java.util.Random();
        int int3 = random1.nextInt((int) (short) 1);
        random1.setSeed((long) 100);
        float float6 = random1.nextFloat();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.PhoneNumber phoneNumber8 = faker7.phoneNumber;
        com.github.javafaker.Finance finance9 = faker7.finance;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7220096f + "'", float6 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getCountry();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        random6.setSeed((long) 100);
        float float11 = random6.nextFloat();
        java.util.stream.LongStream longStream14 = random6.longs(0L, (long) 732850921);
        double double15 = random6.nextDouble();
        long long16 = random6.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.7220096f + "'", float11 == 0.7220096f);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7346627443280227d + "'", double15 == 0.7346627443280227d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-5242502877531146137L) + "'", long16 == (-5242502877531146137L));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getCountry();
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = random6.nextInt((-530973977));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TW" + "'", str5, "TW");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.Locale locale2 = new java.util.Locale("English (United States)", "\u82f1\u6587\u7f8e\u570b)");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Random random1 = new java.util.Random((long) (short) 100);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setLanguage("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Book book6 = faker1.book();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.dateAndTime;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder7 = builder0.setExtension('x', "Taiwan");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.removeUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setScript("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Business business5 = faker1.business();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random12);
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Lorem lorem17 = faker15.lorem();
        com.github.javafaker.Finance finance18 = faker15.finance;
        com.github.javafaker.Number number19 = faker15.number();
        com.github.javafaker.PhoneNumber phoneNumber20 = null;
        faker15.phoneNumber = phoneNumber20;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker15.fakeValuesService;
        faker13.fakeValuesService = fakeValuesService22;
        faker1.fakeValuesService = fakeValuesService22;
        com.github.javafaker.Address address25 = faker1.address;
        com.github.javafaker.PhoneNumber phoneNumber26 = faker1.phoneNumber;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(finance18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(address25);
        org.junit.Assert.assertNotNull(phoneNumber26);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        boolean boolean6 = locale4.hasExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension(' ', "en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        float float9 = random0.nextFloat();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.7220096f + "'", float9 == 0.7220096f);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Code code4 = faker1.code;
        com.github.javafaker.Number number5 = faker1.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker1.fakeValuesService;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.Business business9 = faker1.business;
        com.github.javafaker.service.RandomService randomService10 = faker1.randomService;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Company company15 = null;
        faker14.company = company15;
        com.github.javafaker.Name name17 = faker14.name();
        faker11.name = name17;
        com.github.javafaker.Color color19 = faker11.color();
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Color color22 = faker21.color;
        com.github.javafaker.Options options23 = faker21.options();
        faker11.options = options23;
        faker1.options = options23;
        com.github.javafaker.Color color26 = null;
        faker1.color = color26;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(options23);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Random random1 = new java.util.Random((long) '#');
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList44);
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale51 = java.util.Locale.ENGLISH;
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale48, locale50, locale51, locale52, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strSet59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList66);
        java.util.Locale locale70 = new java.util.Locale("");
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Locale locale73 = java.util.Locale.ENGLISH;
        java.util.Locale locale74 = java.util.Locale.ENGLISH;
        java.util.Locale locale75 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale70, locale72, locale73, locale74, locale75 };
        java.util.ArrayList<java.util.Locale> localeList77 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList77, localeArray76);
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.lang.String[] strArray84 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, (java.util.Collection<java.lang.String>) strList85);
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        java.util.Locale.FilteringMode filteringMode93 = null;
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, (java.util.Collection<java.lang.String>) strList91, filteringMode93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList94);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList95);
        java.lang.String str97 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList96);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_us");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        com.github.javafaker.Number number9 = faker1.number;
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale.setDefault(locale10);
        java.lang.String str12 = locale10.getVariant();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale10);
        com.github.javafaker.Options options14 = faker13.options();
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Color color17 = faker16.color;
        com.github.javafaker.Address address18 = faker16.address;
        com.github.javafaker.Options options19 = faker16.options;
        com.github.javafaker.DateAndTime dateAndTime20 = faker16.dateAndTime;
        com.github.javafaker.Business business21 = faker16.business;
        com.github.javafaker.Company company22 = faker16.company();
        faker13.company = company22;
        com.github.javafaker.DateAndTime dateAndTime24 = faker13.dateAndTime;
        com.github.javafaker.Code code25 = faker13.code();
        faker1.code = code25;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(business21);
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(dateAndTime24);
        org.junit.Assert.assertNotNull(code25);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Number number11 = faker8.number();
        faker5.number = number11;
        com.github.javafaker.service.RandomService randomService13 = null;
        faker5.randomService = randomService13;
        com.github.javafaker.Book book15 = faker5.book;
        com.github.javafaker.Business business16 = faker5.business;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        java.lang.String str23 = faker21.numerify("");
        com.github.javafaker.Number number24 = faker21.number();
        faker18.number = number24;
        com.github.javafaker.service.RandomService randomService26 = null;
        faker18.randomService = randomService26;
        com.github.javafaker.Book book28 = faker18.book;
        com.github.javafaker.Business business29 = faker18.business;
        faker5.business = business29;
        faker3.business = business29;
        java.util.Random random32 = null;
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(random32);
        java.lang.String str35 = faker33.numerify("");
        com.github.javafaker.Book book36 = null;
        faker33.book = book36;
        com.github.javafaker.Internet internet38 = faker33.internet;
        com.github.javafaker.DateAndTime dateAndTime39 = faker33.date();
        com.github.javafaker.Internet internet40 = faker33.internet;
        com.github.javafaker.Business business41 = faker33.business;
        com.github.javafaker.service.RandomService randomService42 = faker33.randomService;
        faker3.randomService = randomService42;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(number24);
        org.junit.Assert.assertNotNull(book28);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(internet38);
        org.junit.Assert.assertNotNull(dateAndTime39);
        org.junit.Assert.assertNotNull(internet40);
        org.junit.Assert.assertNotNull(business41);
        org.junit.Assert.assertNotNull(randomService42);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles(315664383340106314L);
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Random random4 = new java.util.Random();
        int int6 = random4.nextInt((int) (short) 1);
        random4.setSeed((long) 100);
        float float9 = random4.nextFloat();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random4);
        java.util.Random random11 = new java.util.Random();
        int int13 = random11.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream15 = random11.longs((long) '#');
        java.util.stream.LongStream longStream17 = random11.longs((long) (short) 0);
        boolean boolean18 = random11.nextBoolean();
        java.util.Random random19 = new java.util.Random();
        int int21 = random19.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream23 = random19.longs((long) '#');
        java.util.stream.DoubleStream doubleStream26 = random19.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1 };
        random19.nextBytes(byteArray29);
        random11.nextBytes(byteArray29);
        random4.nextBytes(byteArray29);
        random0.nextBytes(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream37 = random0.longs((long) (-1653753823), (long) 19, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.7220096f + "'", float9 == 0.7220096f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(byteArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-91, 7]");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Options options11 = faker9.options();
        com.github.javafaker.Color color12 = faker9.color();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.date();
        faker9.dateAndTime = dateAndTime20;
        faker1.dateAndTime = dateAndTime20;
        com.github.javafaker.Book book23 = faker1.book;
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale.setDefault(locale24);
        java.lang.String str26 = locale24.getVariant();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale24);
        com.github.javafaker.Options options28 = faker27.options();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Color color31 = faker30.color;
        com.github.javafaker.Address address32 = faker30.address;
        com.github.javafaker.Options options33 = faker30.options;
        com.github.javafaker.DateAndTime dateAndTime34 = faker30.dateAndTime;
        com.github.javafaker.Business business35 = faker30.business;
        com.github.javafaker.Company company36 = faker30.company();
        faker27.company = company36;
        com.github.javafaker.DateAndTime dateAndTime38 = faker27.dateAndTime;
        faker1.dateAndTime = dateAndTime38;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(address32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(dateAndTime34);
        org.junit.Assert.assertNotNull(business35);
        org.junit.Assert.assertNotNull(company36);
        org.junit.Assert.assertNotNull(dateAndTime38);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale.Builder builder8 = builder1.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.removeUnicodeLocaleAttribute("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-TW" + "'", str6, "zh-TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Finance finance8 = faker1.finance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.LongStream longStream8 = random0.longs((long) (byte) 0);
        java.util.stream.IntStream intStream11 = random0.ints((-1653753823), 19);
        java.util.stream.LongStream longStream12 = random0.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.Finance finance7 = faker1.finance();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale10, random14);
        java.util.Random random16 = null;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Color color18 = faker17.color;
        com.github.javafaker.Lorem lorem19 = faker17.lorem();
        com.github.javafaker.Finance finance20 = faker17.finance;
        com.github.javafaker.Number number21 = faker17.number();
        com.github.javafaker.PhoneNumber phoneNumber22 = null;
        faker17.phoneNumber = phoneNumber22;
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker17.fakeValuesService;
        faker15.fakeValuesService = fakeValuesService24;
        java.util.Random random26 = null;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.Color color28 = faker27.color;
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        java.lang.String str32 = faker30.numerify("");
        com.github.javafaker.Number number33 = faker30.number();
        faker27.number = number33;
        com.github.javafaker.service.RandomService randomService35 = null;
        faker27.randomService = randomService35;
        com.github.javafaker.Business business37 = faker27.business;
        faker15.business = business37;
        com.github.javafaker.Address address39 = faker15.address;
        com.github.javafaker.Name name40 = faker15.name;
        faker1.name = name40;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-TW" + "'", str12, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertNotNull(finance20);
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(number33);
        org.junit.Assert.assertNotNull(business37);
        org.junit.Assert.assertNotNull(address39);
        org.junit.Assert.assertNotNull(name40);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        java.lang.String str10 = faker1.bothify("chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinese" + "'", str10, "chinese");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        int int8 = random0.nextInt((int) '#');
        double double9 = random0.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 18 + "'", int8 == 18);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08746410642087595d + "'", double9 == 0.08746410642087595d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Name name12 = faker10.name();
        com.github.javafaker.Options options13 = faker10.options;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Options options17 = faker15.options();
        com.github.javafaker.Color color18 = faker15.color();
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        java.lang.String str22 = faker20.numerify("");
        com.github.javafaker.Book book23 = null;
        faker20.book = book23;
        com.github.javafaker.Internet internet25 = faker20.internet;
        com.github.javafaker.DateAndTime dateAndTime26 = faker20.date();
        faker15.dateAndTime = dateAndTime26;
        faker10.dateAndTime = dateAndTime26;
        faker1.dateAndTime = dateAndTime26;
        com.github.javafaker.Business business30 = faker1.business();
        com.github.javafaker.Name name31 = faker1.name();
        com.github.javafaker.Color color32 = faker1.color;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(business30);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.Business business9 = faker1.business;
        com.github.javafaker.service.RandomService randomService10 = faker1.randomService;
        com.github.javafaker.Address address11 = faker1.address();
        com.github.javafaker.Address address12 = faker1.address;
        com.github.javafaker.Book book13 = faker1.book();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = faker1.resolve("und");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Locale locale2 = new java.util.Locale("ZHO", "TW");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "zho_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063" + "'", str3, "\u53f0\u7063");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "USA" + "'", str3, "USA");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u7f8e\u570b" + "'", str3, "\u7f8e\u570b");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business5 = faker4.business;
        faker1.business = business5;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        java.lang.String str13 = faker11.numerify("");
        com.github.javafaker.Number number14 = faker11.number();
        faker8.number = number14;
        faker1.number = number14;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        com.github.javafaker.Address address20 = faker18.address;
        com.github.javafaker.Options options21 = faker18.options;
        com.github.javafaker.Business business22 = faker18.business();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = locale25.toLanguageTag();
        java.lang.String str28 = locale25.getDisplayLanguage();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale25, random29);
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Color color33 = faker32.color;
        com.github.javafaker.Lorem lorem34 = faker32.lorem();
        com.github.javafaker.Finance finance35 = faker32.finance;
        com.github.javafaker.Number number36 = faker32.number();
        com.github.javafaker.PhoneNumber phoneNumber37 = null;
        faker32.phoneNumber = phoneNumber37;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker32.fakeValuesService;
        faker30.fakeValuesService = fakeValuesService39;
        faker18.fakeValuesService = fakeValuesService39;
        com.github.javafaker.Address address42 = faker18.address;
        faker1.address = address42;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(business22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-TW" + "'", str27, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(lorem34);
        org.junit.Assert.assertNotNull(finance35);
        org.junit.Assert.assertNotNull(number36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(address42);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.Random random8 = new java.util.Random();
        int int10 = random8.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream12 = random8.longs((long) '#');
        java.util.stream.DoubleStream doubleStream15 = random8.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1 };
        random8.nextBytes(byteArray18);
        random0.nextBytes(byteArray18);
        boolean boolean21 = random0.nextBoolean();
        int int22 = random0.nextInt();
        boolean boolean23 = random0.nextBoolean();
        long long24 = random0.nextLong();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(byteArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-79, 98]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-808202466) + "'", int22 == (-808202466));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 6128707981280170249L + "'", long24 == 6128707981280170249L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.setExtension('u', "zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("gbr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: gbr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("Etats-Unis", "Korean");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Etats-Unis [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        boolean boolean5 = random0.nextBoolean();
        float float6 = random0.nextFloat();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.7346627f + "'", float6 == 0.7346627f);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business5 = faker4.business;
        faker1.business = business5;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Options options8 = faker1.options;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Address address11 = faker1.address;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Lorem lorem7 = faker1.lorem;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.DateAndTime dateAndTime10 = null;
        faker9.dateAndTime = dateAndTime10;
        com.github.javafaker.Lorem lorem12 = faker9.lorem;
        faker1.lorem = lorem12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        java.lang.String str20 = faker18.numerify("");
        com.github.javafaker.Number number21 = faker18.number();
        faker15.number = number21;
        com.github.javafaker.Company company23 = null;
        faker15.company = company23;
        com.github.javafaker.Options options25 = faker15.options;
        com.github.javafaker.Code code26 = faker15.code;
        faker1.code = code26;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business29 = faker28.business;
        faker1.business = business29;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(code26);
        org.junit.Assert.assertNotNull(business29);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        java.util.stream.LongStream longStream4 = random0.longs((long) (-651874858), (long) (short) -1);
        float float5 = random0.nextFloat();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.02336073f + "'", float5 == 0.02336073f);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale5.getUnicodeLocaleType("Japanese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Japanese");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TW" + "'", str9, "TW");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale1.getDisplayScript(locale4);
        java.lang.Object obj6 = locale4.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "it");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Number number12 = faker9.number();
        com.github.javafaker.Name name13 = faker9.name();
        faker1.name = name13;
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.Book book16 = faker1.book;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(book16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Number number4 = faker1.number();
        com.github.javafaker.Options options5 = faker1.options;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean5 = locale4.hasExtensions();
        java.lang.String str6 = locale4.getScript();
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str8 = locale0.getDisplayVariant(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (Taiwan)" + "'", str2, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\uc601\uc5b4");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "USA" + "'", str2, "USA");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Internet internet2 = faker0.internet;
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(internet2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        faker3.color = color6;
        com.github.javafaker.Lorem lorem8 = faker3.lorem;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker3.resolve("TW");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getISO3Country();
        boolean boolean6 = locale4.hasExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("\u7f8e\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        boolean boolean6 = languageRange1.equals((java.lang.Object) locale5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Company company8 = null;
        faker7.company = company8;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.DateAndTime dateAndTime11 = faker7.dateAndTime;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.lang.String str15 = faker1.bothify("TWN");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "TWN" + "'", str15, "TWN");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale8.getDisplayScript();
        java.lang.String str11 = locale2.getDisplayVariant(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList6);
        java.util.Locale locale10 = new java.util.Locale("");
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale10, locale12, locale13, locale14, locale15 };
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale locale29 = new java.util.Locale("");
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale29, locale31, locale32, locale33, locale34 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList44);
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale51 = java.util.Locale.ENGLISH;
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale48, locale50, locale51, locale52, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale locale59 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList55);
        boolean boolean60 = locale0.equals((java.lang.Object) localeList55);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNull(locale59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        boolean boolean6 = locale2.hasExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2);
        com.github.javafaker.Company company8 = faker7.company();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(company8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale locale2 = new java.util.Locale("English (United States)", "TWN");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for english (united states)");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "english (united states)_TWN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale1.getDisplayLanguage(locale9);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale12.getDisplayCountry(locale14);
        java.lang.String str17 = locale9.getDisplayVariant(locale14);
        java.util.Set<java.lang.String> strSet18 = locale9.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet19 = locale9.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GBR" + "'", str13, "GBR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GBR" + "'", str15, "GBR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United Kingdom" + "'", str16, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(charSet19);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Book book4 = faker1.book();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Color color7 = faker6.color;
        com.github.javafaker.Lorem lorem8 = faker6.lorem();
        com.github.javafaker.Finance finance9 = faker6.finance;
        com.github.javafaker.Number number10 = faker6.number();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Company company13 = null;
        faker12.company = company13;
        com.github.javafaker.Name name15 = faker12.name();
        com.github.javafaker.DateAndTime dateAndTime16 = faker12.dateAndTime;
        com.github.javafaker.Finance finance17 = faker12.finance();
        faker6.finance = finance17;
        faker1.finance = finance17;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(dateAndTime16);
        org.junit.Assert.assertNotNull(finance17);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Company company8 = null;
        faker7.company = company8;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.DateAndTime dateAndTime11 = faker7.dateAndTime;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.lang.Class<?> wildcardClass14 = finance12.getClass();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean5 = locale4.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayCountry(locale8);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale4.getDisplayLanguage(locale12);
        java.lang.String str15 = locale0.getDisplayVariant(locale12);
        java.util.Locale locale16 = java.util.Locale.UK;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale16);
        java.lang.String str18 = locale12.getDisplayLanguage(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-TW" + "'", str10, "zh-TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.Business business9 = faker1.business;
        com.github.javafaker.service.RandomService randomService10 = faker1.randomService;
        com.github.javafaker.Company company11 = faker1.company;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(randomService10);
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Code code8 = faker1.code;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Name name12 = faker10.name();
        com.github.javafaker.Options options13 = faker10.options;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.Options options17 = faker15.options();
        com.github.javafaker.Color color18 = faker15.color();
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        java.lang.String str22 = faker20.numerify("");
        com.github.javafaker.Book book23 = null;
        faker20.book = book23;
        com.github.javafaker.Internet internet25 = faker20.internet;
        com.github.javafaker.DateAndTime dateAndTime26 = faker20.date();
        faker15.dateAndTime = dateAndTime26;
        faker10.dateAndTime = dateAndTime26;
        faker1.dateAndTime = dateAndTime26;
        com.github.javafaker.Business business30 = faker1.business();
        com.github.javafaker.Company company31 = faker1.company;
        com.github.javafaker.Lorem lorem32 = faker1.lorem();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(internet25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(business30);
        org.junit.Assert.assertNotNull(company31);
        org.junit.Assert.assertNotNull(lorem32);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.removeUnicodeLocaleAttribute("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Color color2 = faker0.color;
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale.setDefault(locale3);
        java.lang.String str5 = locale3.getVariant();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
        com.github.javafaker.Options options7 = faker6.options();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Address address11 = faker9.address;
        com.github.javafaker.Options options12 = faker9.options;
        com.github.javafaker.DateAndTime dateAndTime13 = faker9.dateAndTime;
        com.github.javafaker.Business business14 = faker9.business;
        com.github.javafaker.Company company15 = faker9.company();
        faker6.company = company15;
        com.github.javafaker.DateAndTime dateAndTime17 = faker6.dateAndTime;
        com.github.javafaker.Code code18 = faker6.code();
        faker0.code = code18;
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertNotNull(business14);
        org.junit.Assert.assertNotNull(company15);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(code18);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale locale3 = new java.util.Locale("und", "Etats-Unis", "\u5fb7\u570b");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u5fb7\u570b");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Options options11 = faker9.options();
        com.github.javafaker.Color color12 = faker9.color();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        java.lang.String str16 = faker14.numerify("");
        com.github.javafaker.Book book17 = null;
        faker14.book = book17;
        com.github.javafaker.Internet internet19 = faker14.internet;
        com.github.javafaker.DateAndTime dateAndTime20 = faker14.date();
        faker9.dateAndTime = dateAndTime20;
        faker1.dateAndTime = dateAndTime20;
        com.github.javafaker.Book book23 = faker1.book;
        java.util.Random random24 = null;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        java.lang.String str27 = faker25.numerify("");
        com.github.javafaker.Book book28 = null;
        faker25.book = book28;
        com.github.javafaker.Internet internet30 = faker25.internet;
        com.github.javafaker.DateAndTime dateAndTime31 = faker25.date();
        com.github.javafaker.Internet internet32 = faker25.internet;
        com.github.javafaker.Business business33 = faker25.business;
        com.github.javafaker.service.RandomService randomService34 = faker25.randomService;
        com.github.javafaker.Address address35 = faker25.address();
        faker1.address = address35;
        com.github.javafaker.DateAndTime dateAndTime37 = faker1.date();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(internet19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(internet30);
        org.junit.Assert.assertNotNull(dateAndTime31);
        org.junit.Assert.assertNotNull(internet32);
        org.junit.Assert.assertNotNull(business33);
        org.junit.Assert.assertNotNull(randomService34);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(dateAndTime37);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Random random1 = new java.util.Random((long) 'x');
        random1.setSeed((-582069258542454676L));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Locale locale3 = new java.util.Locale("English (United States)", "gbr", "\u82f1\u6587\u7f8e\u570b)");
        java.util.Locale.setDefault(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Address address4 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Code code7 = faker1.code;
        com.github.javafaker.Name name8 = faker1.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random0.ints((-644952740), (-1637860121));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale1.getDisplayCountry(locale5);
        java.util.Locale.setDefault(locale1);
        java.lang.String str10 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "und" + "'", str10, "und");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.dateAndTime;
        com.github.javafaker.Finance finance6 = faker1.finance;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        java.lang.String str10 = faker8.numerify("");
        com.github.javafaker.Book book11 = null;
        faker8.book = book11;
        com.github.javafaker.Internet internet13 = faker8.internet();
        com.github.javafaker.Lorem lorem14 = faker8.lorem;
        com.github.javafaker.Color color15 = faker8.color();
        faker1.color = color15;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Random random4 = new java.util.Random();
        int int6 = random4.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color8 = faker7.color;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.lang.String str12 = faker10.numerify("");
        com.github.javafaker.Book book13 = null;
        faker10.book = book13;
        com.github.javafaker.Internet internet15 = faker10.internet();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker10.phoneNumber();
        faker7.phoneNumber = phoneNumber16;
        faker3.phoneNumber = phoneNumber16;
        com.github.javafaker.Options options19 = faker3.options;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(internet15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(options19);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Color color13 = faker12.color;
        com.github.javafaker.Address address14 = faker12.address;
        com.github.javafaker.Options options15 = faker12.options;
        com.github.javafaker.Business business16 = faker12.business();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color21 = faker20.color;
        faker12.color = color21;
        faker1.color = color21;
        com.github.javafaker.Finance finance24 = faker1.finance();
        com.github.javafaker.Address address25 = faker1.address();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(address25);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale40 = new java.util.Locale("eng");
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet41, filteringMode42);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertEquals(locale40.toString(), "eng");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (-4894608278020295867L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.8946082780202957E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Lorem lorem4 = faker1.lorem;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Code code6 = faker1.code();
        com.github.javafaker.Company company7 = faker1.company();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        java.lang.String str11 = faker9.numerify("");
        com.github.javafaker.Book book12 = null;
        faker9.book = book12;
        com.github.javafaker.Internet internet14 = faker9.internet();
        com.github.javafaker.Lorem lorem15 = faker9.lorem();
        faker1.lorem = lorem15;
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Color color19 = faker18.color;
        com.github.javafaker.Lorem lorem20 = faker18.lorem();
        com.github.javafaker.Finance finance21 = faker18.finance;
        com.github.javafaker.Number number22 = faker18.number();
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Company company25 = null;
        faker24.company = company25;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.DateAndTime dateAndTime28 = faker24.dateAndTime;
        com.github.javafaker.Finance finance29 = faker24.finance();
        faker18.finance = finance29;
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random31);
        java.lang.String str34 = faker32.numerify("");
        com.github.javafaker.Book book35 = null;
        faker32.book = book35;
        com.github.javafaker.Internet internet37 = faker32.internet;
        com.github.javafaker.DateAndTime dateAndTime38 = faker32.date();
        com.github.javafaker.Code code39 = faker32.code;
        java.util.Random random40 = null;
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random40);
        com.github.javafaker.Color color42 = faker41.color;
        com.github.javafaker.Lorem lorem43 = faker41.lorem();
        com.github.javafaker.Finance finance44 = faker41.finance;
        com.github.javafaker.Number number45 = faker41.number();
        faker32.number = number45;
        java.util.Random random47 = null;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.DateAndTime dateAndTime49 = null;
        faker48.dateAndTime = dateAndTime49;
        com.github.javafaker.Lorem lorem51 = faker48.lorem;
        com.github.javafaker.Address address52 = faker48.address;
        faker32.address = address52;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Random random55 = new java.util.Random();
        int int57 = random55.nextInt((int) (short) 1);
        random55.setSeed((long) 100);
        float float60 = random55.nextFloat();
        com.github.javafaker.Faker faker61 = new com.github.javafaker.Faker(locale54, random55);
        com.github.javafaker.PhoneNumber phoneNumber62 = faker61.phoneNumber;
        faker32.phoneNumber = phoneNumber62;
        faker18.phoneNumber = phoneNumber62;
        faker1.phoneNumber = phoneNumber62;
        com.github.javafaker.Business business66 = null;
        faker1.business = business66;
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNotNull(number22);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(dateAndTime28);
        org.junit.Assert.assertNotNull(finance29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(internet37);
        org.junit.Assert.assertNotNull(dateAndTime38);
        org.junit.Assert.assertNotNull(code39);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(lorem43);
        org.junit.Assert.assertNotNull(finance44);
        org.junit.Assert.assertNotNull(number45);
        org.junit.Assert.assertNotNull(lorem51);
        org.junit.Assert.assertNotNull(address52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.7220096f + "'", float60 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber62);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setVariant("gbr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: gbr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("gbr");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale11, locale13, locale14, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList18 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList18, localeArray17);
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale32 = new java.util.Locale("");
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.util.Locale locale35 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale30, locale32, locale33, locale34, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.util.Locale locale54 = java.util.Locale.ENGLISH;
        java.util.Locale locale55 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale50, locale52, locale53, locale54, locale55 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strList65);
        java.util.Locale locale69 = new java.util.Locale("");
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Locale locale72 = java.util.Locale.ENGLISH;
        java.util.Locale locale73 = java.util.Locale.ENGLISH;
        java.util.Locale locale74 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale69, locale71, locale72, locale73, locale74 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList78);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList81);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.LongStream longStream8 = random0.longs((long) (byte) 0);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7697214763885702d) + "'", double9 == (-1.7697214763885702d));
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Locale locale2 = new java.util.Locale("chinese", "zh_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_ZH_TW");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder8.build();
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str17 = locale14.getDisplayName(locale16);
        java.lang.String str18 = locale14.getDisplayName();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale14.getDisplayLanguage(locale19);
        java.lang.String str22 = locale11.getDisplayScript(locale19);
        java.lang.String str23 = locale19.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und" + "'", str13, "und");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "eng" + "'", str23, "eng");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        int int11 = random6.nextInt();
        java.util.stream.IntStream intStream12 = random6.ints();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 304207773 + "'", int11 == 304207773);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en-GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Company company4 = faker1.company();
        java.lang.String str6 = faker1.numerify("TWN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TWN" + "'", str6, "TWN");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (-1205452174), (long) 1101885023, (long) 732850921);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setScript("fr_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Locale locale1 = new java.util.Locale("eng");
        java.util.Locale locale2 = null;
        java.lang.String str3 = null; // flaky: locale1.getDisplayCountry(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("en");
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.addUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Code code4 = faker1.code;
        com.github.javafaker.Name name5 = faker1.name;
        com.github.javafaker.Company company6 = faker1.company();
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Options options10 = faker8.options();
        com.github.javafaker.Color color11 = faker8.color();
        com.github.javafaker.Options options12 = faker8.options();
        faker1.options = options12;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Options options6 = faker1.options;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.Address address10 = faker8.address;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business12 = faker11.business;
        faker8.business = business12;
        java.util.Random random14 = null;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Color color16 = faker15.color;
        com.github.javafaker.DateAndTime dateAndTime17 = faker15.dateAndTime;
        com.github.javafaker.service.RandomService randomService18 = faker15.randomService;
        faker8.randomService = randomService18;
        faker1.randomService = randomService18;
        com.github.javafaker.Finance finance21 = null;
        faker1.finance = finance21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Color color25 = faker24.color;
        com.github.javafaker.DateAndTime dateAndTime26 = faker24.dateAndTime;
        com.github.javafaker.Color color27 = faker24.color();
        faker1.color = color27;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.DateAndTime dateAndTime8 = null;
        faker7.dateAndTime = dateAndTime8;
        com.github.javafaker.Lorem lorem10 = faker7.lorem;
        com.github.javafaker.Address address11 = faker7.address;
        com.github.javafaker.Finance finance12 = faker7.finance();
        faker1.finance = finance12;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getVariant();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.Options options18 = faker17.options();
        faker1.options = options18;
        com.github.javafaker.Lorem lorem20 = faker1.lorem;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Random random22 = new java.util.Random();
        int int24 = random22.nextInt((int) (short) 1);
        random22.setSeed((long) 100);
        float float27 = random22.nextFloat();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale21, random22);
        com.github.javafaker.PhoneNumber phoneNumber29 = faker28.phoneNumber;
        faker1.phoneNumber = phoneNumber29;
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.lang.String str34 = locale32.getDisplayScript(locale33);
        java.lang.String str35 = locale33.toLanguageTag();
        java.lang.String str36 = locale33.getDisplayLanguage();
        java.util.Random random37 = new java.util.Random();
        int int39 = random37.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(locale33, random37);
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale44 = java.util.Locale.TAIWAN;
        java.lang.String str45 = locale43.getDisplayScript(locale44);
        java.lang.String str46 = locale44.toLanguageTag();
        java.lang.String str47 = locale44.getDisplayLanguage();
        java.util.Random random48 = new java.util.Random();
        int int50 = random48.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(random48);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(locale44, random48);
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(locale33, random48);
        com.github.javafaker.Lorem lorem54 = faker53.lorem();
        java.lang.String str56 = faker53.numerify("TWN");
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Color color59 = faker58.color;
        com.github.javafaker.Name name60 = faker58.name();
        faker53.name = name60;
        faker1.name = name60;
        com.github.javafaker.Finance finance63 = faker1.finance();
        com.github.javafaker.Book book64 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.7220096f + "'", float27 == 0.7220096f);
        org.junit.Assert.assertNotNull(phoneNumber29);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh-TW" + "'", str35, "zh-TW");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinese" + "'", str36, "Chinese");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zh-TW" + "'", str46, "zh-TW");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Chinese" + "'", str47, "Chinese");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(lorem54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "TWN" + "'", str56, "TWN");
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(name60);
        org.junit.Assert.assertNotNull(finance63);
        org.junit.Assert.assertNull(book64);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        java.util.stream.IntStream intStream16 = random0.ints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[3, 74]");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        double double4 = random0.nextGaussian();
        boolean boolean5 = random0.nextBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3425780872299416d + "'", double4 == 0.3425780872299416d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business1 = faker0.business;
        java.util.Random random2 = null;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Company company4 = null;
        faker3.company = company4;
        com.github.javafaker.Name name6 = faker3.name();
        faker0.name = name6;
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale8.getVariant();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
        com.github.javafaker.Options options12 = faker11.options();
        faker0.options = options12;
        com.github.javafaker.Options options14 = faker0.options;
        com.github.javafaker.Internet internet15 = faker0.internet();
        org.junit.Assert.assertNotNull(business1);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(internet15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = null;
        faker3.fakeValuesService = fakeValuesService4;
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color8 = faker7.color;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        java.lang.String str12 = faker10.numerify("");
        com.github.javafaker.Number number13 = faker10.number();
        faker7.number = number13;
        com.github.javafaker.Options options15 = faker7.options;
        com.github.javafaker.Color color16 = faker7.color;
        faker3.color = color16;
        com.github.javafaker.Book book18 = faker3.book;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = faker3.bothify("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(book18);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setVariant("TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str9 = locale6.getDisplayName(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.util.Locale.Builder builder16 = builder10.setLocale(locale13);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = new java.util.Random();
        int int8 = random6.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Random random17 = new java.util.Random();
        int int19 = random17.nextInt((int) (short) 1);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale2, random17);
        com.github.javafaker.Company company23 = faker22.company;
        com.github.javafaker.Color color24 = faker22.color;
        com.github.javafaker.Code code25 = faker22.code;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese" + "'", str5, "Chinese");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(code25);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale1.getDisplayScript(locale4);
        java.util.Random random7 = new java.util.Random((long) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale4, random7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random7.ints((-1L), (-1678470588), (-1637860121));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(category1, locale2);
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.lang.String str5 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_TW" + "'", str5, "zh_TW");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code2 = faker1.code;
        com.github.javafaker.Address address3 = faker1.address;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Color color6 = faker5.color;
        java.lang.String str8 = faker5.bothify("");
        com.github.javafaker.Lorem lorem9 = faker5.lorem();
        faker1.lorem = lorem9;
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = null;
        faker1.fakeValuesService = fakeValuesService11;
        com.github.javafaker.Finance finance13 = faker1.finance;
        com.github.javafaker.Address address14 = faker1.address;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = faker1.bothify("CA");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(address14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder0.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Color color10 = faker9.color;
        com.github.javafaker.Lorem lorem11 = faker9.lorem();
        com.github.javafaker.Finance finance12 = faker9.finance;
        com.github.javafaker.Number number13 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker9.phoneNumber = phoneNumber14;
        com.github.javafaker.service.FakeValuesService fakeValuesService16 = faker9.fakeValuesService;
        faker7.fakeValuesService = fakeValuesService16;
        java.util.Random random18 = null;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Color color20 = faker19.color;
        com.github.javafaker.Options options21 = faker19.options();
        java.util.Random random22 = null;
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.DateAndTime dateAndTime24 = null;
        faker23.dateAndTime = dateAndTime24;
        com.github.javafaker.Lorem lorem26 = faker23.lorem;
        faker19.lorem = lorem26;
        com.github.javafaker.Internet internet28 = faker19.internet();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Color color31 = faker30.color;
        com.github.javafaker.Lorem lorem32 = faker30.lorem();
        com.github.javafaker.Finance finance33 = faker30.finance;
        com.github.javafaker.Number number34 = faker30.number();
        com.github.javafaker.PhoneNumber phoneNumber35 = null;
        faker30.phoneNumber = phoneNumber35;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker30.fakeValuesService;
        faker19.fakeValuesService = fakeValuesService37;
        com.github.javafaker.Code code39 = faker19.code();
        faker7.code = code39;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(fakeValuesService16);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(lorem26);
        org.junit.Assert.assertNotNull(internet28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(finance33);
        org.junit.Assert.assertNotNull(number34);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(code39);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1 };
        random0.nextBytes(byteArray10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0.0d, (double) 315664383340106314L);
        int int15 = random0.nextInt();
        long long16 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream18 = random0.doubles((long) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[96, -48]");
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1374145625 + "'", int15 == 1374145625);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1730680208334655391L) + "'", long16 == (-1730680208334655391L));
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("zh-TW");
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Chinesisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.service.RandomService randomService9 = null;
        faker1.randomService = randomService9;
        com.github.javafaker.Business business11 = faker1.business;
        com.github.javafaker.Internet internet12 = faker1.internet();
        java.lang.String str14 = faker1.bothify("\u82f1\u570b");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(internet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u570b" + "'", str14, "\u82f1\u570b");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        java.util.stream.LongStream longStream8 = random0.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.DateAndTime dateAndTime6 = null;
        faker5.dateAndTime = dateAndTime6;
        com.github.javafaker.Lorem lorem8 = faker5.lorem;
        com.github.javafaker.Address address9 = faker5.address;
        faker1.address = address9;
        com.github.javafaker.Name name11 = faker1.name();
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.Address address15 = faker13.address;
        com.github.javafaker.Address address16 = faker13.address;
        faker1.address = address16;
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertNotNull(address16);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "eng", "");
        java.lang.String str7 = locale0.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "_ENG");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English (United States)" + "'", str7, "English (United States)");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        java.lang.String str15 = faker13.numerify("");
        com.github.javafaker.Number number16 = faker13.number();
        faker10.number = number16;
        faker1.number = number16;
        com.github.javafaker.Code code19 = faker1.code;
        com.github.javafaker.Name name20 = null;
        faker1.name = name20;
        com.github.javafaker.Color color22 = faker1.color;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale.Builder builder16 = builder14.setRegion("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.setUnicodeLocaleKeyword("USA", "en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: USA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (Taiwan)" + "'", str2, "Chinese (Taiwan)");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Internet internet6 = faker1.internet;
        com.github.javafaker.Internet internet7 = faker1.internet;
        com.github.javafaker.Book book8 = faker1.book;
        java.util.Random random9 = null;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Color color11 = faker10.color;
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Finance finance13 = faker10.finance;
        com.github.javafaker.Number number14 = faker10.number();
        com.github.javafaker.Options options15 = faker10.options;
        com.github.javafaker.Name name16 = faker10.name;
        faker1.name = name16;
        com.github.javafaker.Name name18 = faker1.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(name18);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Address address3 = faker1.address;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business5 = faker4.business;
        faker1.business = business5;
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Color color9 = faker8.color;
        com.github.javafaker.DateAndTime dateAndTime10 = faker8.dateAndTime;
        com.github.javafaker.service.RandomService randomService11 = faker8.randomService;
        faker1.randomService = randomService11;
        com.github.javafaker.Business business13 = faker1.business;
        com.github.javafaker.Code code14 = faker1.code;
        com.github.javafaker.Lorem lorem15 = faker1.lorem;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(randomService11);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(lorem15);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        random0.setSeed((long) 100);
        java.util.stream.IntStream intStream8 = random0.ints((long) (byte) 100, (int) (short) 0, (int) '4');
        boolean boolean9 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) (byte) 10);
        java.util.stream.LongStream longStream13 = random0.longs((long) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber6 = null;
        faker1.phoneNumber = phoneNumber6;
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker1.fakeValuesService;
        com.github.javafaker.Internet internet9 = faker1.internet;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Color color12 = faker11.color;
        com.github.javafaker.Lorem lorem13 = faker11.lorem();
        com.github.javafaker.Finance finance14 = faker11.finance;
        com.github.javafaker.Number number15 = faker11.number();
        com.github.javafaker.Finance finance16 = faker11.finance();
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Business business20 = faker19.business;
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Company company23 = null;
        faker22.company = company23;
        com.github.javafaker.Name name25 = faker22.name();
        faker19.name = name25;
        com.github.javafaker.Company company27 = faker19.company;
        faker18.company = company27;
        com.github.javafaker.Book book29 = faker18.book();
        faker11.book = book29;
        faker1.book = book29;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(business20);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(book29);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Locale locale3 = new java.util.Locale("zh", "\uc911\uad6d\uc5b4", "en_GB");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\uc911\uad6d\uc5b4_en_GB");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        java.lang.String str6 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gbr" + "'", str3, "gbr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Locale locale3 = new java.util.Locale("", "eng", "");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "_ENG");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ENG" + "'", str4, "ENG");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (Taiwan)" + "'", str2, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("und");
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "zho");
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale.Builder builder16 = builder14.setRegion("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguage("fr_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("GBR");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "TWN");
        java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('4', "Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream7 = random0.ints();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        long long9 = random0.nextLong();
        random0.setSeed(7959307406216468554L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2303685030000094928L + "'", long9 == 2303685030000094928L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color2 = faker1.color;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.lang.String str6 = faker4.numerify("");
        com.github.javafaker.Number number7 = faker4.number();
        faker1.number = number7;
        com.github.javafaker.Company company9 = null;
        faker1.company = company9;
        com.github.javafaker.Options options11 = faker1.options;
        java.util.Random random12 = null;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Color color14 = faker13.color;
        com.github.javafaker.DateAndTime dateAndTime15 = faker13.dateAndTime;
        com.github.javafaker.service.RandomService randomService16 = faker13.randomService;
        com.github.javafaker.Code code17 = faker13.code();
        faker1.code = code17;
        java.util.Random random19 = null;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Code code21 = faker20.code;
        faker1.code = code21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        java.lang.String str26 = faker24.numerify("");
        com.github.javafaker.Book book27 = null;
        faker24.book = book27;
        com.github.javafaker.Internet internet29 = faker24.internet;
        com.github.javafaker.Internet internet30 = faker24.internet;
        com.github.javafaker.Lorem lorem31 = faker24.lorem();
        com.github.javafaker.Number number32 = faker24.number;
        faker1.number = number32;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(randomService16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(internet29);
        org.junit.Assert.assertNotNull(internet30);
        org.junit.Assert.assertNotNull(lorem31);
        org.junit.Assert.assertNotNull(number32);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.numerify("");
        com.github.javafaker.Book book4 = null;
        faker1.book = book4;
        com.github.javafaker.Company company6 = null;
        faker1.company = company6;
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Lorem lorem10 = faker1.lorem;
        com.github.javafaker.Address address11 = faker1.address();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) (short) 0);
        boolean boolean7 = random0.nextBoolean();
        float float8 = random0.nextFloat();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1 };
        random0.nextBytes(byteArray11);
        java.util.stream.IntStream intStream16 = random0.ints((long) (short) 100, (int) (byte) -1, (int) (byte) 100);
        double double17 = random0.nextDouble();
        java.util.stream.LongStream longStream18 = random0.longs();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.011344314f + "'", float8 == 0.011344314f);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-92, 126]");
        org.junit.Assert.assertNotNull(intStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16261407813531226d + "'", double17 == 0.16261407813531226d);
        org.junit.Assert.assertNotNull(longStream18);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u5fb7\u570b", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Random random0 = new java.util.Random();
        int int2 = random0.nextInt((int) (short) 1);
        java.util.stream.LongStream longStream4 = random0.longs((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), (double) (byte) 0);
        double double8 = random0.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.44989004294034646d) + "'", double8 == (-0.44989004294034646d));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale28, locale30, locale31, locale32, locale33 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList44);
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale51 = java.util.Locale.ENGLISH;
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale48, locale50, locale51, locale52, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Locale locale69 = new java.util.Locale("");
        java.util.Locale locale70 = java.util.Locale.ENGLISH;
        java.util.Locale locale71 = java.util.Locale.ENGLISH;
        java.util.Locale locale72 = java.util.Locale.TAIWAN;
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale67, locale69, locale70, locale71, locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap79 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap79);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.lang.String>) strList86);
        java.lang.String str89 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList88);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNull(str89);
    }
}
