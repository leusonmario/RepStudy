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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.Class<?> wildcardClass1 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setUnicodeLocaleKeyword("Italian", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr_FR" + "'", str2, "fr_FR");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.Class<?> wildcardClass1 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "ko_KR");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "fr_FR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_FR_FR");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) ' ', 0.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-44, -50, 89, 107, 123, 124]");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Collection<java.lang.String> strCollection11 = null;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection11);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.util.Locale locale17 = java.util.Locale.ITALY;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = locale18.getISO3Country();
        java.lang.String str20 = locale18.getISO3Country();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayName(locale23);
        java.lang.String str25 = locale18.getDisplayVariant(locale22);
        java.lang.String str26 = locale14.getDisplayScript(locale22);
        java.util.Locale locale29 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str30 = locale14.getDisplayScript(locale29);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.getISO3Country();
        java.lang.String str40 = locale38.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.lang.String str44 = locale42.getDisplayName(locale43);
        java.lang.String str45 = locale38.getDisplayVariant(locale42);
        java.lang.String str46 = locale34.getDisplayScript(locale42);
        java.util.Locale locale49 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str50 = locale34.getDisplayScript(locale49);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale53 = java.util.Locale.ITALY;
        java.lang.String str54 = locale53.getDisplayLanguage();
        java.util.Locale locale58 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str59 = locale53.getDisplayLanguage(locale58);
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.util.Locale locale61 = java.util.Locale.ITALY;
        java.lang.String str62 = locale61.getDisplayLanguage();
        java.lang.String str63 = locale60.getDisplayVariant(locale61);
        java.util.Locale locale64 = java.util.Locale.ITALY;
        java.util.Locale locale65 = locale64.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.ITALY;
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        java.util.Locale locale68 = java.util.Locale.KOREAN;
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        java.util.Locale locale70 = java.util.Locale.ITALY;
        java.util.Locale locale71 = locale70.stripExtensions();
        java.lang.String str72 = locale67.getDisplayCountry(locale70);
        java.lang.String str73 = locale70.getCountry();
        java.util.Locale locale74 = java.util.Locale.KOREAN;
        java.util.Locale locale75 = java.util.Locale.KOREAN;
        java.lang.String str76 = locale74.getDisplayCountry(locale75);
        java.util.Locale locale77 = java.util.Locale.ITALY;
        java.util.Locale locale78 = locale77.stripExtensions();
        java.lang.String str79 = locale74.getDisplayCountry(locale77);
        java.util.Locale locale81 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale82 = java.util.Locale.KOREAN;
        java.lang.String str83 = locale81.getDisplayName(locale82);
        java.util.Locale locale84 = java.util.Locale.ITALY;
        java.util.Locale locale85 = locale84.stripExtensions();
        java.lang.String str86 = locale85.getISO3Country();
        java.lang.String str87 = locale85.getISO3Country();
        java.util.Locale locale89 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale90 = java.util.Locale.KOREAN;
        java.lang.String str91 = locale89.getDisplayName(locale90);
        java.lang.String str92 = locale85.getDisplayVariant(locale89);
        java.util.Locale locale93 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray94 = new java.util.Locale[] { locale14, locale32, locale34, locale51, locale52, locale53, locale61, locale64, locale66, locale70, locale74, locale82, locale89, locale93 };
        java.util.ArrayList<java.util.Locale> localeList95 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList95, localeArray94);
        java.util.Locale locale97 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITA" + "'", str19, "ITA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ITA" + "'", str20, "ITA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale29.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ITA" + "'", str39, "ITA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ITA" + "'", str40, "ITA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale49.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Italian" + "'", str54, "Italian");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Italian" + "'", str59, "Italian");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Italian" + "'", str62, "Italian");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "IT" + "'", str73, "IT");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "ITA" + "'", str86, "ITA");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ITA" + "'", str87, "ITA");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNull(locale97);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setVariant("IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!__ITA" + "'", str4, "hi!__ITA");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = random0.longs((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((double) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-28, -64, -114, -126, 118, -58]");
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 100, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        boolean boolean5 = locale0.equals((java.lang.Object) locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setLanguage("IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setRegion("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale5.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ko");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.lang.Class<?> wildcardClass20 = category0.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs(10L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-68, -24, 40, -42, 118, 39]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.29166245f + "'", float10 == 0.29166245f);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Italienisch (Italien)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italienisch(italien)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "it");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italiano");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_IT");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale21.getISO3Country();
        java.lang.String str23 = locale21.getISO3Country();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.lang.String str28 = locale21.getDisplayVariant(locale25);
        java.lang.String str29 = locale17.getDisplayScript(locale25);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.lang.String str33 = locale31.getDisplayName(locale32);
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        java.lang.String str37 = locale35.getISO3Country();
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale40 = java.util.Locale.KOREAN;
        java.lang.String str41 = locale39.getDisplayName(locale40);
        java.lang.String str42 = locale35.getDisplayVariant(locale39);
        java.lang.String str43 = locale31.getDisplayScript(locale39);
        java.util.Locale locale44 = java.util.Locale.ITALY;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale45.getISO3Country();
        java.lang.String str47 = locale45.getISO3Country();
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.lang.String str57 = locale55.getDisplayName(locale56);
        java.util.Locale locale58 = java.util.Locale.ITALY;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale59.getISO3Country();
        java.lang.String str61 = locale59.getISO3Country();
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.lang.String str65 = locale63.getDisplayName(locale64);
        java.lang.String str66 = locale59.getDisplayVariant(locale63);
        java.lang.String str67 = locale55.getDisplayScript(locale63);
        java.util.Locale locale68 = java.util.Locale.ITALY;
        java.util.Locale locale69 = locale68.stripExtensions();
        java.lang.String str70 = locale69.getISO3Country();
        java.util.Set<java.lang.String> strSet71 = locale69.getUnicodeLocaleKeys();
        java.util.Locale locale72 = java.util.Locale.KOREAN;
        java.lang.String str73 = locale72.getVariant();
        java.lang.String str74 = locale72.getVariant();
        java.util.Locale locale75 = java.util.Locale.ITALY;
        java.util.Locale locale76 = locale75.stripExtensions();
        java.util.Locale locale77 = java.util.Locale.ENGLISH;
        java.util.Locale locale78 = java.util.Locale.TAIWAN;
        java.util.Locale locale79 = java.util.Locale.ITALY;
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale13, locale15, locale25, locale39, locale45, locale48, locale50, locale52, locale53, locale55, locale69, locale72, locale75, locale77, locale78, locale79 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList81);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ITA" + "'", str22, "ITA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ITA" + "'", str23, "ITA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ITA" + "'", str36, "ITA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ITA" + "'", str37, "ITA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ITA" + "'", str46, "ITA");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ITA" + "'", str47, "ITA");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ITA" + "'", str60, "ITA");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ITA" + "'", str61, "ITA");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ITA" + "'", str70, "ITA");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "it_IT");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(locale83);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr_fr (FR_FR)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr(fr_fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = new java.util.Locale("IT", "fr_FR");
        java.lang.String str4 = locale0.getDisplayName(locale3);
        java.lang.Class<?> wildcardClass5 = locale3.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale3.toString(), "it_FR_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese (Taiwan)" + "'", str4, "cinese (Taiwan)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.removeUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream22 = random5.ints(303251316, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[7, -104, 45, 103, -58, 22]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.15683675f + "'", float15 == 0.15683675f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.7719711f + "'", float16 == 0.7719711f);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_CN");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Options options6 = faker5.options();
        com.github.javafaker.Name name7 = faker5.name();
        com.github.javafaker.Code code8 = faker5.code();
        com.github.javafaker.Lorem lorem9 = faker5.lorem();
        com.github.javafaker.Code code10 = faker5.code();
        boolean boolean11 = languageRange2.equals((java.lang.Object) faker5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles((long) (-1086029816), (-0.19761205710367555d), 0.47682267659421324d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[84, 92, -121, 125, -35, -47]");
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((long) (-890288509));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-15, -64, -67, 41, -52, 19]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.3536439f + "'", float10 == 0.3536439f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.89639705f + "'", float11 == 0.89639705f);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale1.getDisplayLanguage(locale6);
        java.lang.String str11 = locale1.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.lang.String str14 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("Italian (Italy)", "\uc911\uad6d\uc5b4\ub300\ub9cc)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Italian (Italy) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ko");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 1);
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-96, -53, 104, -53, -16, 55]");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        int int12 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) '#', (double) (byte) 100, 0.9916854490297d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[35, -29, 115, -81, 58, 37]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.8676969194025165d) + "'", double9 == (-0.8676969194025165d));
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-857402194) + "'", int11 == (-857402194));
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1712155975) + "'", int12 == (-1712155975));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("", "Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setUnicodeLocaleKeyword("TWN", "it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random0.ints((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-32, 67, 101, -7, -36, 59]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6873385010585346d + "'", double9 == 0.6873385010585346d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1931111662) + "'", int11 == (-1931111662));
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale locale2 = new java.util.Locale("hi!", "italiano");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_ITALIANO");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setRegion("");
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder8 = builder4.setLocale(locale7);
        boolean boolean9 = locale1.equals((java.lang.Object) builder8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        long long14 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random0.doubles((double) (short) 1, (double) (-172665890));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-2, 101, -23, -91, 96, -30]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.19745484801686047d + "'", double9 == 0.19745484801686047d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1219308243 + "'", int11 == 1219308243);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5920330162361556171L + "'", long14 == 5920330162361556171L);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        long long14 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random0.ints((long) (-1086029816));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[59, -4, -43, -86, 106, -8]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.37872107262895777d) + "'", double9 == (-0.37872107262895777d));
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-892337914) + "'", int11 == (-892337914));
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 6111344744354311104L + "'", long14 == 6111344744354311104L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setVariant("ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ko [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        java.util.stream.DoubleStream doubleStream21 = random5.doubles((long) 10);
        byte[] byteArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            random5.nextBytes(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-109, -81, -9, 46, 17, -4]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.10167158f + "'", float15 == 0.10167158f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8389721f + "'", float16 == 0.8389721f);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "fr_FR");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setScript("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Locale locale3 = new java.util.Locale("zho", "zho", "und");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zho_ZHO_und could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zho_ZHO_und");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (-890288509));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-8.90288509E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        java.lang.String str20 = locale3.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[32, 118, -36, -127, -106, 42]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.39149082f + "'", float15 == 0.39149082f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.7090207f + "'", float16 == 0.7090207f);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh_TW" + "'", str20, "zh_TW");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc911\uad6d\uc5b4\ub300\ub9cc)", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????? (?????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setScript("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = locale3.getDisplayLanguage(locale6);
        java.lang.String str8 = locale3.getScript();
        java.lang.String str9 = locale3.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh_TW" + "'", str9, "zh_TW");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.Object obj5 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "it_IT");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale9.getUnicodeLocaleType("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh_TW");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr_fr (FR_FR)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr(fr_fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((-1L), (long) 303251316, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[36, -117, 65, 64, 86, 27]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.02844809345240296d + "'", double9 == 0.02844809345240296d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        boolean boolean6 = languageRange2.equals((java.lang.Object) "zh");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setLanguage("IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension(' ', "ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Locale locale5 = new java.util.Locale("hi!", "italiano");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.lang.Object obj7 = locale5.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!_ITALIANO");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!_ITALIANO");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setLanguage("IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setRegion("TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale1.getExtensionKeys();
        java.lang.String str10 = locale1.getISO3Country();
        java.lang.Object obj11 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "it_IT");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("\uc911\uad6d\uc5b4\uc911\uad6d)", "fr_fr (FR_FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream3 = random0.longs((long) (byte) 1);
        double double4 = random0.nextDouble();
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0552374429783935d + "'", double4 == 0.0552374429783935d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setLanguage("IT");
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList20);
        java.util.Collection<java.lang.String> strCollection23 = null;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strCollection23);
        java.lang.String str25 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strCollection23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList34);
        java.util.Collection<java.lang.String> strCollection37 = null;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection37);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.util.Locale locale16 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str17 = locale1.getDisplayScript(locale16);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale16);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr_FR_FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr_fr (FR_FR)", (-1.2780391703792549d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.2780391703792549");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getDisplayLanguage(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch" + "'", str3, "Koreanisch");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        boolean boolean14 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) (-720507519));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-70, 103, -4, -14, 42, 96]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.41313101631903193d) + "'", double9 == (-0.41313101631903193d));
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-745984249) + "'", int11 == (-745984249));
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.LongStream longStream13 = random0.longs((long) (byte) 1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream16 = random0.ints((long) 1790365215);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = random0.nextInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[120, 96, 122, 23, 101, -112]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.13726866f + "'", float10 == 0.13726866f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.28301436f + "'", float11 == 0.28301436f);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.Random random3 = new java.util.Random();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random3.nextBytes(byteArray10);
        random0.nextBytes(byteArray10);
        boolean boolean13 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random0.longs((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[38, -69, -19, -127, 76, -20]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.lang.Class<?> wildcardClass14 = random0.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-7, -118, -94, -15, 103, -44]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5981861279395913d + "'", double9 == 0.5981861279395913d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 872636277 + "'", int11 == 872636277);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setScript("fr_fr (FR_FR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr_fr (FR_FR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker4.resolve("\uc911\uad6d\uc5b4\ub300\ub9cc)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayName(locale5);
        java.lang.String str7 = locale1.toLanguageTag();
        java.lang.String str8 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch (Italien)" + "'", str6, "Italienisch (Italien)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it-IT" + "'", str7, "it-IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it_IT" + "'", str8, "it_IT");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.numerify("Italian");
        java.lang.String str6 = faker1.bothify("italiano");
        com.github.javafaker.Code code7 = faker1.code();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Internet internet4 = faker1.internet();
        com.github.javafaker.Code code5 = faker1.code();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker1.resolve("TWN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setExtension('u', "Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Koreanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(100L);
        java.util.stream.LongStream longStream14 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs(0L, (long) (-151966581));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[55, 96, -12, -75, -123, -80]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.48801094f + "'", float10 == 0.48801094f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.27217048f + "'", float11 == 0.27217048f);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList19);
        java.util.Collection<java.lang.String> strCollection22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strCollection22);
        java.lang.String str24 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList33, filteringMode36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList57);
        java.util.Collection<java.lang.String> strCollection60 = null;
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strCollection60);
        java.lang.String str62 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strCollection60);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList71);
        java.util.Collection<java.lang.String> strCollection74 = null;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, strCollection74);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList75);
        java.util.Collection<java.util.Locale> localeCollection77 = null;
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, localeCollection77, filteringMode78);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection77);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode36.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNull(locale80);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setUnicodeLocaleKeyword("\uc911\uad6d\uc5b4\uc911\uad6d)", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        boolean boolean6 = languageRange2.equals((java.lang.Object) (-2.7593215326723524d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale17.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) (-172665890), (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random0.ints((long) ' ', 303251316, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[73, 1, 37, -95, -43, -38]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.23264009f + "'", float10 == 0.23264009f);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=koreanisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.removeUnicodeLocaleAttribute("\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random0.longs((long) 348768006, (long) (byte) 10, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = random0.nextInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??? (???????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList20);
        java.util.Collection<java.lang.String> strCollection23 = null;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strCollection23);
        java.lang.String str25 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strCollection23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList34);
        java.util.Collection<java.lang.String> strCollection37 = null;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strCollection37);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList59);
        java.util.Collection<java.lang.String> strCollection62 = null;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, strCollection62);
        java.lang.String str64 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, strCollection62);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.lang.String>) strList73);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList73, filteringMode76);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList39, filteringMode76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode76.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList77);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale locale0 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('a', "giapponese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: giapponese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale4);
        java.lang.String str11 = locale2.getDisplayCountry(locale4);
        java.lang.String str12 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str12, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.DateAndTime dateAndTime3 = faker1.date();
        com.github.javafaker.Name name4 = faker1.name();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random0.doubles((long) (short) 100, 100.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[109, 76, 127, 96, -23, -21]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.6275147275499142d) + "'", double14 == (-0.6275147275499142d));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream20 = random0.ints((long) 100, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-6, 63, -12, -44, 125, -9]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9538749090384692d) + "'", double9 == (-0.9538749090384692d));
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1045497040) + "'", int11 == (-1045497040));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 0);
        java.util.Random random17 = new java.util.Random();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random17.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream29 = random0.ints(105140450, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[99, -56, -92, -69, 109, -11]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12048566361578703d + "'", double14 == 0.12048566361578703d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, -30, 81, -77, 102, 91]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setLanguage("IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("cinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: cinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random0.longs((-3792336259741422992L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-75, 58, -93, 6, -40, -93]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Italian (Italy) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setScript("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ??? (???????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("ITA", "fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        double double15 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream19 = random0.doubles((-3792336259741422992L), 1.080320848513619d, (double) 0.37466776f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-56, 15, -72, 6, 0, -16]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.632610587256582d + "'", double14 == 0.632610587256582d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1392950364330745d + "'", double15 == 0.1392950364330745d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("", "hi! (ITA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale0.getDisplayName(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale4.getUnicodeLocaleType("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??? (???????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str5, "\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) (-172665890), (double) 'a');
        int int14 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random0.doubles((long) 19522795, (double) 0.18809414f, (-0.08489261666724697d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-23, 104, -85, -121, 45, 73]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.038119018f + "'", float10 == 0.038119018f);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1387680385 + "'", int14 == 1387680385);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('4', "Francia");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Koreanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        java.lang.Class<?> wildcardClass20 = faker19.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[70, 7, 52, 74, 0, -17]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.6885486f + "'", float15 == 0.6885486f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0390265f + "'", float16 == 0.0390265f);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale0.getDisplayCountry(locale3);
        java.lang.String str6 = locale3.getCountry();
        java.lang.Object obj7 = locale3.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IT" + "'", str6, "IT");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "it_IT");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("italiano");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("\uc911\uad6d\uc5b4\uc911\uad6d)", "Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setScript("zho (ZHO,und)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zho (ZHO,und) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        java.util.stream.LongStream longStream6 = random0.longs((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles((-1L), (-1.0d), (double) 0.05675608f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.getDisplayLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.lang.String str7 = faker5.numerify("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        com.github.javafaker.Book book8 = faker5.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str7, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        com.github.javafaker.Internet internet20 = faker19.internet();
        com.github.javafaker.Options options21 = faker19.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-15, -43, 41, 44, 52, 83]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.49016118f + "'", float15 == 0.49016118f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.26907927f + "'", float16 == 0.26907927f);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertNotNull(options21);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.addUnicodeLocaleAttribute("hi!__ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi!__ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.setLanguage("");
        java.util.Locale locale7 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLanguageTag("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        java.lang.String str5 = languageRange2.getRange();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.util.Locale locale11 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Locale locale14 = new java.util.Locale("hi!", "italiano");
        java.lang.String str15 = locale11.getDisplayScript(locale14);
        java.lang.String str16 = locale7.getDisplayName(locale14);
        boolean boolean17 = languageRange2.equals((java.lang.Object) locale7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertEquals(locale11.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian (Italy)" + "'", str16, "Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale locale3 = new java.util.Locale("German (Germany)", "\uc774\ud0c8\ub9ac\uc544\uc5b4", "Deutschland");
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random4.doubles((long) 1);
        java.util.Random random7 = new java.util.Random();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random7.nextBytes(byteArray14);
        random4.nextBytes(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale3, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: german (germany)_???????????_Deutschland could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\uc774\ud0c8\ub9ac\uc544\uc5b4_Deutschland");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[31, -54, -80, -116, 3, 35]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((long) (-151966581));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, -45, -5, 112, -30, 65]");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.lang.String str9 = locale5.getDisplayLanguage();
        java.util.Random random10 = new java.util.Random();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random10.nextBytes(byteArray17);
        double double19 = random10.nextGaussian();
        java.util.stream.DoubleStream doubleStream20 = random10.doubles();
        int int21 = random10.nextInt();
        java.util.stream.DoubleStream doubleStream23 = random10.doubles(0L);
        long long24 = random10.nextLong();
        java.util.stream.DoubleStream doubleStream26 = random10.doubles((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale5, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-102, -5, -89, 81, 3, 44]");
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.6821532970355009d) + "'", double19 == (-1.6821532970355009d));
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 946370733 + "'", int21 == 946370733);
        org.junit.Assert.assertNotNull(doubleStream23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8632187808672960703L + "'", long24 == 8632187808672960703L);
        org.junit.Assert.assertNotNull(doubleStream26);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguage("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        java.util.stream.DoubleStream doubleStream13 = random4.doubles();
        java.util.stream.DoubleStream doubleStream15 = random4.doubles((long) 348768006);
        boolean boolean16 = languageRange2.equals((java.lang.Object) random4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-65, -79, 30, 57, -113, -99]");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Number number6 = faker5.number();
        com.github.javafaker.Finance finance7 = faker5.finance();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker5.phoneNumber();
        com.github.javafaker.Color color9 = faker5.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((long) 872636277, (long) 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[41, 106, -15, 72, 115, 40]");
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.Locale locale3 = new java.util.Locale("cinese (Taiwan)", "", "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cinese (taiwan)__fr");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setExtension(' ', "TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("");
        java.lang.String str13 = locale9.getDisplayLanguage(locale12);
        boolean boolean14 = languageRange2.equals((java.lang.Object) locale12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        java.util.stream.LongStream longStream3 = random0.longs();
        double double4 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = random0.nextInt((-664244362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8468691337857217d + "'", double4 == 0.8468691337857217d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.lang.String str9 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it_IT" + "'", str9, "it_IT");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.util.Locale locale16 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str17 = locale1.getDisplayScript(locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.toLanguageTag();
        java.lang.Object obj20 = locale16.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und" + "'", str19, "und");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "fr_fr_FR_FR");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = locale3.getDisplayLanguage(locale6);
        java.lang.String str8 = locale3.getScript();
        java.lang.Class<?> wildcardClass9 = locale3.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("fr-FR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.setExtension('x', "allemand");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ko [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        boolean boolean14 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random0.ints((long) (-957337982));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[51, 89, -71, 123, 93, 28]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35693758897011985d + "'", double9 == 0.35693758897011985d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-447795174) + "'", int11 == (-447795174));
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Internet internet4 = faker1.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker1.resolve("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale locale8 = new java.util.Locale("chinois", "", "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale8.toString(), "chinois__fr");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale4);
        java.lang.String str11 = locale2.getDisplayCountry(locale4);
        java.lang.Object obj12 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "it");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category5, locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        boolean boolean12 = locale9.hasExtensions();
        java.lang.String str13 = locale9.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! (ITA)" + "'", str13, "hi! (ITA)");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setScript("hi!__ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi!__ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        random0.setSeed((long) '#');
        java.util.stream.DoubleStream doubleStream15 = random0.doubles(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream18 = random0.longs((long) (byte) 100, (long) (-1730591738));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-73, -61, -63, 82, 81, -36]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.48319006f + "'", float10 == 0.48319006f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.25699037f + "'", float11 == 0.25699037f);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("Italienisch (Italien)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Italienisch (Italien) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.Random random3 = new java.util.Random();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random3.nextBytes(byteArray10);
        random0.nextBytes(byteArray10);
        boolean boolean13 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs((long) 'x', (long) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[46, 70, 25, -43, -59, -32]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.lang.String str9 = locale5.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        java.util.stream.LongStream longStream6 = random0.longs((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs(0L, (long) 19522795, (long) (-664244362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.util.Locale locale16 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str17 = locale1.getDisplayScript(locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale16.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for fr_fr");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und" + "'", str19, "und");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.Random random3 = new java.util.Random();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random3.nextBytes(byteArray10);
        random0.nextBytes(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random0.doubles((double) 0.76190096f, (double) (-5744054268570525942L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-19, -20, -40, -49, -85, 90]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale1.getExtensionKeys();
        java.lang.Object obj10 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "it_IT");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italiano (Italia)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italiano(italia)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale3 = new java.util.Locale("Chinese", "fr");
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.util.Set<java.lang.Character> charSet13 = locale5.getExtensionKeys();
        java.lang.String str14 = locale5.getISO3Country();
        java.lang.String str15 = locale5.getISO3Language();
        java.lang.String str16 = locale3.getDisplayCountry(locale5);
        java.lang.String str17 = locale0.getDisplayLanguage(locale5);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Address address19 = faker18.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ita" + "'", str15, "ita");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Francia" + "'", str16, "Francia");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "giapponese" + "'", str17, "giapponese");
        org.junit.Assert.assertNotNull(address19);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("zho (ZHO,und)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zho (ZHO,und) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale3 = new java.util.Locale("Chinese", "fr");
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.util.Set<java.lang.Character> charSet13 = locale5.getExtensionKeys();
        java.lang.String str14 = locale5.getISO3Country();
        java.lang.String str15 = locale5.getISO3Language();
        java.lang.String str16 = locale3.getDisplayCountry(locale5);
        java.lang.String str17 = locale0.getDisplayLanguage(locale5);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale0);
        java.lang.Object obj19 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ita" + "'", str15, "ita");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Francia" + "'", str16, "Francia");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "giapponese" + "'", str17, "giapponese");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "ja");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "ja");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "ja");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("inglese (Stati Uniti)", 0.5981861279395913d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=inglese (stati uniti)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(100L);
        java.util.stream.LongStream longStream14 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random0.doubles((double) 0.59695315f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[110, 78, 117, -116, 27, -68]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.6439926f + "'", float10 == 0.6439926f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.042336464f + "'", float11 == 0.042336464f);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random0.longs(0L, (long) (-1086029816));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[75, -2, -22, -56, -25, -104]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4166132183370343d + "'", double9 == 0.4166132183370343d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1986655990 + "'", int11 == 1986655990);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Country();
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category8, locale12);
        java.lang.String str14 = locale4.getDisplayCountry(locale12);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale15.getVariant();
        java.lang.String str17 = locale15.getVariant();
        boolean boolean18 = locale15.hasExtensions();
        java.lang.String str19 = locale12.getDisplayName(locale15);
        boolean boolean20 = languageRange2.equals((java.lang.Object) locale12);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it-IT" + "'", str7, "it-IT");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italy" + "'", str14, "Italy");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (ITA)" + "'", str19, "hi! (ITA)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguage("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random0.longs((long) 348768006, (long) (byte) 10, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random0.doubles((long) (-1730591738));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (Taiwan)" + "'", str2, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        java.util.stream.IntStream intStream14 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random0.ints(1127425299, 25326595);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[39, 114, -8, -17, 127, 127]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Locale locale2 = new java.util.Locale("hi!", "italiano");
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Country();
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale4.getDisplayName(locale8);
        boolean boolean10 = locale2.equals((java.lang.Object) locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it-IT" + "'", str7, "it-IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italienisch (Italien)" + "'", str9, "Italienisch (Italien)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        java.util.stream.IntStream intStream4 = random0.ints((long) 872636277);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random0.doubles(0.5661296497870928d, (double) (-1086029816));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale1.getExtensionKeys();
        java.lang.String str10 = locale1.getISO3Country();
        java.lang.String str11 = locale1.getISO3Language();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        java.lang.String str24 = locale17.getDisplayVariant(locale21);
        java.lang.String str25 = locale13.getDisplayScript(locale21);
        java.util.Locale locale28 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str29 = locale13.getDisplayScript(locale28);
        java.lang.String str30 = locale28.getDisplayName();
        boolean boolean31 = locale28.hasExtensions();
        java.lang.String str32 = locale1.getDisplayScript(locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = locale28.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ITA" + "'", str18, "ITA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITA" + "'", str19, "ITA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr_fr (FR_FR)" + "'", str30, "fr_fr (FR_FR)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale0.getDisplayName(locale4);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale0.getDisplayName(locale6);
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Options options10 = faker9.options();
        com.github.javafaker.Name name11 = faker9.name();
        com.github.javafaker.Options options12 = faker9.options();
        com.github.javafaker.Finance finance13 = faker9.finance();
        com.github.javafaker.Lorem lorem14 = faker9.lorem();
        java.lang.String str16 = faker9.letterify("fr");
        java.lang.String str18 = faker9.numerify("Chinese");
        com.github.javafaker.Code code19 = faker9.code();
        boolean boolean20 = locale6.equals((java.lang.Object) code19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str5, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str7, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr" + "'", str16, "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese" + "'", str18, "Chinese");
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("fr-FR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.removeUnicodeLocaleAttribute("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0 };
        random0.nextBytes(byteArray19);
        random0.setSeed((long) 1080234799);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream26 = random0.ints((long) 105140450, 100, (-2050620459));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-49, -97, -51, -6, -26, -90]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3387853313989845d + "'", double9 == 0.3387853313989845d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 926099072 + "'", int11 == 926099072);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-36, -18]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.numerify("Italian");
        java.lang.String str6 = faker1.bothify("italiano");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker1.resolve("\uc911\uad6d\uc5b4\ub300\ub9cc)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Country();
        boolean boolean17 = locale14.hasExtensions();
        java.lang.String str18 = locale11.getDisplayVariant(locale14);
        java.util.Locale.Builder builder19 = builder3.setLocale(locale11);
        java.lang.Object obj20 = locale11.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ITA" + "'", str16, "ITA");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale0.getDisplayName(locale4);
        java.util.Random random6 = new java.util.Random();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random6.nextBytes(byteArray13);
        double double15 = random6.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random6.doubles();
        int int17 = random6.nextInt();
        java.util.stream.DoubleStream doubleStream19 = random6.doubles(0L);
        long long20 = random6.nextLong();
        java.util.stream.DoubleStream doubleStream22 = random6.doubles((long) (short) 10);
        double double23 = random6.nextDouble();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale0, random6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = faker24.resolve("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str5, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[17, 39, -34, -83, 21, -28]");
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.3663426119457857d) + "'", double15 == (-0.3663426119457857d));
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1628512625) + "'", int17 == (-1628512625));
        org.junit.Assert.assertNotNull(doubleStream19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4579047512973762351L) + "'", long20 == (-4579047512973762351L));
        org.junit.Assert.assertNotNull(doubleStream22);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.8275485164703059d + "'", double23 == 0.8275485164703059d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi! (ITA)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!(ita)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zho (ZHO,und)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zho(zho");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale1.getDisplayLanguage(locale6);
        java.lang.String str11 = locale6.getISO3Language();
        java.lang.String str12 = locale6.getScript();
        java.lang.String str13 = locale6.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getExtension('a');
        java.lang.String str7 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(100L);
        java.util.stream.LongStream longStream14 = random0.longs();
        int int15 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random0.ints(1L, 1383905088, 1161892605);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-97, -26, 35, -66, 103, -103]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.28783864f + "'", float10 == 0.28783864f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.63549757f + "'", float11 == 0.63549757f);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1750537965 + "'", int15 == 1750537965);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Company company6 = faker1.company();
        com.github.javafaker.Color color7 = faker1.color();
        java.lang.Class<?> wildcardClass8 = faker1.getClass();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it_IT" + "'", str5, "it_IT");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber5 = faker4.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.LongStream longStream13 = random0.longs((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs((long) 1790365215, (long) 1490859811, (long) (-664244362));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[7, -45, -43, -39, 91, 48]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.14557362f + "'", float10 == 0.14557362f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.22847348f + "'", float11 == 0.22847348f);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        java.util.stream.LongStream longStream4 = random0.longs(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random0.ints(3480344952783253391L, 348768006, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker1.resolve("giapponese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Options options5 = faker4.options();
        com.github.javafaker.Name name6 = faker4.name();
        com.github.javafaker.Options options7 = faker4.options();
        com.github.javafaker.Options options8 = faker4.options();
        com.github.javafaker.Name name9 = faker4.name();
        boolean boolean10 = locale0.equals((java.lang.Object) name9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setVariant("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getUnicodeLocaleType("chinois");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: chinois");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale.setDefault(category0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale2.getUnicodeLocaleType("francese");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: francese");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setScript("\uc911\uad6d\uc5b4\ub300\ub9cc)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ???????? (?????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "ja");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "ja");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "ja");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setVariant("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        java.util.Locale.Builder builder11 = builder3.removeUnicodeLocaleAttribute("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder3.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLanguageTag("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        boolean boolean5 = locale2.equals((java.lang.Object) 1.2817085037623985d);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        double double15 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles();
        int int18 = random0.nextInt(1038659894);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream21 = random0.ints(1490859811, 1038659894);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[25, -125, 86, 70, 0, 72]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.488225155385627d + "'", double14 == 1.488225155385627d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.27580277178430235d + "'", double15 == 0.27580277178430235d);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 776375094 + "'", int18 == 776375094);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Options options5 = faker1.options();
        com.github.javafaker.Internet internet6 = faker1.internet();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        java.lang.String str11 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList28);
        java.lang.String[] strArray35 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.parse("und", strMap44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale locale49 = java.util.Locale.ITALY;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.lang.String str51 = locale50.getISO3Country();
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleKeys();
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strSet52);
        java.lang.String str54 = java.util.Locale.lookupTag(languageRangeList45, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale locale58 = java.util.Locale.ITALY;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale59.getISO3Country();
        java.util.Set<java.lang.String> strSet61 = locale59.getUnicodeLocaleKeys();
        java.lang.String str62 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strSet61);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList71);
        java.lang.String[] strArray78 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.lang.String str81 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList79);
        java.lang.String str82 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList79);
        java.lang.String str83 = java.util.Locale.lookupTag(languageRangeList45, (java.util.Collection<java.lang.String>) strList79);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList45, strMap84);
        java.util.Locale locale86 = java.util.Locale.ITALY;
        java.util.Locale locale87 = locale86.stripExtensions();
        java.lang.String str88 = locale87.getISO3Country();
        java.util.Locale locale89 = java.util.Locale.TAIWAN;
        java.lang.String str90 = locale87.getDisplayScript(locale89);
        java.util.Locale locale92 = java.util.Locale.forLanguageTag("");
        java.lang.String str93 = locale89.getDisplayLanguage(locale92);
        java.util.Set<java.lang.String> strSet94 = locale89.getUnicodeLocaleKeys();
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList45, (java.util.Collection<java.lang.String>) strSet94);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList42, (java.util.Collection<java.lang.String>) strSet94);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap97 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList98 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList42, strMap97);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ITA" + "'", str17, "ITA");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ITA" + "'", str51, "ITA");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ITA" + "'", str60, "ITA");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(languageRangeList85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "ITA" + "'", str88, "ITA");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Chinese" + "'", str93, "Chinese");
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(languageRangeList98);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension(' ', "Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(100L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = faker14.resolve("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[113, 114, 64, -7, -100, -50]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.94320154f + "'", float10 == 0.94320154f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.79117686f + "'", float11 == 0.79117686f);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0 };
        random0.nextBytes(byteArray19);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = faker21.resolve("Italia");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-7, -1, 36, -52, 1, 71]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7383072325646194d + "'", double9 == 0.7383072325646194d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1258501378) + "'", int11 == (-1258501378));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[14, -19]");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.LongStream longStream12 = random0.longs((long) 0);
        java.util.stream.LongStream longStream13 = random0.longs();
        double double14 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream18 = random0.ints((long) 100, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-63, -53, -76, -40, 88, 4]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.2920851f + "'", float10 == 0.2920851f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9785584767591369d + "'", double14 == 0.9785584767591369d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) 0.5511188f);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0L);
        random0.setSeed((long) 991796780);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random0.doubles((long) (-1866363753));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[80, -85, -74, -53, 13, -95]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5229096f + "'", float10 == 0.5229096f);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0 };
        random0.nextBytes(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = random0.nextInt((-373413815));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[9, -47, 35, -49, -69, 71]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.4939155083585764d + "'", double9 == 1.4939155083585764d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 207944910 + "'", int11 == 207944910);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-108, 36]");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((-1.3525503855396068d), (double) 0.0f);
        java.util.stream.IntStream intStream4 = random0.ints();
        int int5 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1871699219) + "'", int5 == (-1871699219));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 0);
        java.util.Random random17 = new java.util.Random();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random17.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        java.util.stream.IntStream intStream29 = random0.ints((-1086029816), (-664244362));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream32 = random0.longs((long) 1573499063, (long) (-532556101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[106, 61, 114, 113, 66, 18]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.45450275906784116d + "'", double14 == 0.45450275906784116d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-2, -107, 86, 99, 124, 117]");
        org.junit.Assert.assertNotNull(intStream29);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale14 = new java.util.Locale("hi!", "TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!_TWN");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Locale locale0 = null;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayVariant(locale2);
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale1.getDisplayName(locale5);
        java.util.Random random7 = new java.util.Random();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random7.nextBytes(byteArray14);
        double double16 = random7.nextGaussian();
        java.util.stream.DoubleStream doubleStream17 = random7.doubles();
        int int18 = random7.nextInt();
        java.util.stream.DoubleStream doubleStream20 = random7.doubles(0L);
        long long21 = random7.nextLong();
        java.util.stream.DoubleStream doubleStream23 = random7.doubles((long) (short) 10);
        double double24 = random7.nextDouble();
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale1, random7);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale0, random7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str3, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str6, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-14, 6, -54, -27, -53, -41]");
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.2456870259974098d + "'", double16 == 2.2456870259974098d);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1148561996 + "'", int18 == 1148561996);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 8371707471661791513L + "'", long21 == 8371707471661791513L);
        org.junit.Assert.assertNotNull(doubleStream23);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9564705150967092d + "'", double24 == 0.9564705150967092d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        int int10 = random0.nextInt((int) 'u');
        java.util.stream.LongStream longStream13 = random0.longs((long) 1161892605, (long) 2004614414);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-71, 86, -41, -114, 33, -1]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        random0.setSeed((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs((long) (byte) -1, 0L, (long) 1383905088);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[2, 61, 81, 93, 11, 69]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.224967f + "'", float10 == 0.224967f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.6329095f + "'", float11 == 0.6329095f);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Locale locale3 = new java.util.Locale("cinese (Taiwan)", "", "fr");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayName();
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.lang.String str7 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "cinese (taiwan)__fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-fr" + "'", str4, "x-lvariant-fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (taiwan) (fr)" + "'", str5, "cinese (taiwan) (fr)");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale5 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Locale locale8 = new java.util.Locale("hi!", "italiano");
        java.lang.String str9 = locale5.getDisplayScript(locale8);
        java.lang.String str10 = locale1.getDisplayName(locale8);
        java.lang.Object obj11 = null;
        boolean boolean12 = locale1.equals(obj11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals(locale5.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian (Italy)" + "'", str10, "Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        java.util.stream.DoubleStream doubleStream14 = random0.doubles(0L);
        random0.setSeed((long) 991796780);
        java.lang.Class<?> wildcardClass17 = random0.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-120, 123, 58, -18, -124, -117]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.11634916f + "'", float10 == 0.11634916f);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Koreanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getExtension('a');
        java.util.Locale locale7 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale1.getUnicodeLocaleType("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chinese (China)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("und", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet9);
        java.lang.String str11 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList28);
        java.lang.String[] strArray35 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList36);
        java.util.Collection<java.util.Locale> localeCollection41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale42 = java.util.Locale.lookup(languageRangeList2, localeCollection41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ITA" + "'", str17, "ITA");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles((long) 1785693086, (double) 0.08423358f, (-0.34910075290248943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[42, -115, -83, -7, 20, -75]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9418105204905057d) + "'", double9 == (-0.9418105204905057d));
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Collection<java.lang.String> strCollection11 = null;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection11);
        java.util.Collection<java.lang.String> strCollection13 = null;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection13);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Country();
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str8 = locale1.getDisplayVariant(locale4);
        java.lang.String str9 = locale1.toLanguageTag();
        java.lang.String str10 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und" + "'", str9, "und");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 1);
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random1);
        long long15 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random1.ints(100L, 100, (-994230832));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-109, -114, 55, -65, -82, 22]");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 8491483102315624374L + "'", long15 == 8491483102315624374L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale0.getDisplayName(locale4);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale0.getDisplayName(locale6);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Country();
        java.lang.String str12 = locale9.toLanguageTag();
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category13, locale17);
        java.lang.String str19 = locale9.getDisplayCountry(locale17);
        java.lang.String str20 = locale6.getDisplayName(locale9);
        java.lang.String str21 = locale6.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str5, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str7, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "it-IT" + "'", str12, "it-IT");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale17.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italy" + "'", str19, "Italy");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "giapponese" + "'", str20, "giapponese");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ja" + "'", str21, "ja");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italiano (Italia)", (-1.0370204982726101d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0370204982726101");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it_IT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) 494295214);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random0.ints((long) (-1871699219));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-15, -77, -7, -57, 31, 28]");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayVariant(locale2);
        java.lang.String str5 = locale2.getDisplayName();
        boolean boolean6 = locale2.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian (Italy)" + "'", str5, "Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints(387091885, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[124, -1, 122, 118, 39, 33]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setExtension('#', "hi! (ITA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        int int10 = random0.nextInt((int) 'u');
        byte[] byteArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            random0.nextBytes(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-96, -110, 99, -73, 74, 105]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian (Italy)" + "'", str4, "Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0 };
        random0.nextBytes(byteArray19);
        random0.setSeed((long) 1080234799);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream26 = random0.longs(4926657520955110588L, (long) (-1871699219), (-687730097483691497L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-71, -55, 28, 95, 121, -39]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.40638581023405135d + "'", double9 == 0.40638581023405135d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1088587061) + "'", int11 == (-1088587061));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[46, -108]");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!__ITA", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!__ita");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.lang.String str9 = locale7.getISO3Country();
        boolean boolean10 = locale7.hasExtensions();
        java.lang.String str11 = locale4.getDisplayVariant(locale7);
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "cinese (taiwan)__fr");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "cinese (taiwan)__fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\ud504\ub791\uc2a4\uc5b4", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.util.Locale locale16 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str17 = locale1.getDisplayScript(locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale16.getUnicodeLocaleType("Italy");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Italy");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean2 = locale0.equals((java.lang.Object) 0.3605423704638422d);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Random random20 = new java.util.Random();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random20.nextBytes(byteArray27);
        java.util.stream.LongStream longStream31 = random20.longs((long) 10, (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale17, random20);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr_FR_FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[78, -61, -107, 119, 62, 30]");
        org.junit.Assert.assertNotNull(longStream31);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("Chinese");
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("hi!__ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi!__ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str8 = faker1.letterify("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker1.resolve("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr" + "'", str8, "fr");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italiano(italia)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        java.util.stream.DoubleStream doubleStream17 = random0.doubles((long) 0, (-1.2780391703792549d), (double) 0.96307296f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream20 = random0.longs((long) 1872856773, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-12, -104, 117, 95, 7, 47]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.LongStream longStream12 = random0.longs((long) 0);
        java.util.stream.IntStream intStream15 = random0.ints((int) (short) 0, 303251316);
        java.util.stream.IntStream intStream19 = random0.ints((long) 355732128, (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-21, -122, 45, 82, 64, -123]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5155864f + "'", float10 == 0.5155864f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale locale11 = new java.util.Locale("it_IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: it_it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale11.toString(), "it_it");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Locale locale2 = new java.util.Locale("", "ko");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale2.getDisplayName(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getUnicodeLocaleType("\uc911\uad6d\uc5b4\ub300\ub9cc)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ???????? (?????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_KO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Koreanisch" + "'", str7, "Koreanisch");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KO" + "'", str8, "KO");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ja");
        java.lang.String str2 = languageRange1.getRange();
        boolean boolean4 = languageRange1.equals((java.lang.Object) (-7235640274895147528L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja" + "'", str2, "ja");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        random0.setSeed((-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random0.longs((long) 355732128, (long) (-1730591738));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-62, 55, -27, 25, 101, 81]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.640799300881798d) + "'", double9 == (-1.640799300881798d));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream3 = random0.longs((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random0.longs((-3792336259741422992L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("francese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: francese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.numerify("fr_FR");
        com.github.javafaker.Options options8 = faker1.options();
        com.github.javafaker.Business business9 = faker1.business();
        com.github.javafaker.Finance finance10 = faker1.finance();
        java.lang.Class<?> wildcardClass11 = faker1.getClass();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_FR" + "'", str7, "fr_FR");
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        java.util.Random random6 = new java.util.Random();
        boolean boolean7 = languageRange2.equals((java.lang.Object) random6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ja");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja" + "'", str2, "ja");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ja" + "'", str3, "ja");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) (-172665890), (double) 'a');
        int int14 = random0.nextInt();
        java.util.stream.LongStream longStream15 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random0.longs((long) (-1636110348), (long) 19522795, (long) 351833871);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-99, 79, 12, -57, 98, 98]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.9929253f + "'", float10 == 0.9929253f);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1271031641 + "'", int14 == 1271031641);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        float float11 = random0.nextFloat();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[35, 48, -11, -45, -3, -48]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.4013458573850657d + "'", double9 == 1.4013458573850657d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.017930329f + "'", float11 == 0.017930329f);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = locale3.getDisplayLanguage(locale6);
        java.lang.String str8 = locale3.getISO3Country();
        java.lang.String str9 = locale3.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TWN" + "'", str8, "TWN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("it");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) (-172665890), (double) 'a');
        random0.setSeed((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream18 = random0.longs((long) 282464450, (long) (-1871699219));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-105, 36, -58, 90, -72, 114]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.7758752f + "'", float10 == 0.7758752f);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 0);
        float float17 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream21 = random0.ints((long) (-211723081), (int) (byte) -1, (-914344994));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-116, 22, -19, -106, 77, -33]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3017811025843119d + "'", double14 == 0.3017811025843119d);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.34640527f + "'", float17 == 0.34640527f);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        long long14 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) (short) 10);
        double double17 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream20 = random0.ints((-1735570727), (-1832452933));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-122, -33, 116, -104, -33, -120]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.306941442738769d + "'", double9 == 1.306941442738769d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1731699537 + "'", int11 == 1731699537);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 8033763545409723612L + "'", long14 == 8033763545409723612L);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.955455719858619d + "'", double17 == 0.955455719858619d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.IntStream intStream16 = random0.ints((long) ' ');
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-84, -25, -9, -114, -99, -77]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.7808709697946015d) + "'", double14 == (-0.7808709697946015d));
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.getDisplayLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.lang.Class<?> wildcardClass6 = faker5.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 0);
        float float17 = random0.nextFloat();
        double double18 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream22 = random0.doubles((long) 25, (double) 6591000923523946964L, 0.2484928088552032d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-125, -117, -87, 18, 21, -17]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7639075140690306d + "'", double14 == 0.7639075140690306d);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5630125f + "'", float17 == 0.5630125f);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.645195361249574d + "'", double18 == 0.645195361249574d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category5, locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German (Germany)", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german (germany)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setExtension(' ', "\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getExtension('a');
        java.util.Locale locale7 = locale1.stripExtensions();
        java.lang.String str8 = locale7.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x-lvariant-ITA" + "'", str9, "x-lvariant-ITA");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLanguageTag("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0 };
        random0.nextBytes(byteArray19);
        random0.setSeed((long) 1080234799);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream24 = random0.longs((-1564457783298176597L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[37, 34, -31, 86, -53, -81]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15181234667197507d + "'", double9 == 0.15181234667197507d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-812356672) + "'", int11 == (-812356672));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-20, -56]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.lang.Object obj5 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koreanisch" + "'", str3, "Koreanisch");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "de_DE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "de_DE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "de_DE");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("Chinese");
        java.util.Locale.Builder builder13 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("German (Germany)", "zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: German (Germany) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese (Taiwan)", (double) 0.08423358f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Locale locale5 = new java.util.Locale("hi!", "italiano");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setRegion("");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("Italian");
        java.util.Locale.Builder builder14 = builder10.setRegion("");
        java.util.Locale.Builder builder16 = builder10.setLanguageTag("fr");
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str19 = locale18.getISO3Country();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale21.getISO3Country();
        java.lang.String str23 = locale21.getISO3Country();
        boolean boolean24 = locale21.hasExtensions();
        java.lang.String str25 = locale18.getDisplayVariant(locale21);
        java.util.Locale.Builder builder26 = builder10.setLocale(locale18);
        java.lang.String str27 = locale5.getDisplayVariant(locale18);
        boolean boolean29 = locale18.equals((java.lang.Object) 103);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ITA" + "'", str22, "ITA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ITA" + "'", str23, "ITA");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getISO3Country();
        java.lang.String str3 = locale0.getDisplayLanguage();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese" + "'", str3, "francese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("it-IT", strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale24.getISO3Country();
        java.lang.String str26 = locale24.getISO3Country();
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale28.getDisplayName(locale29);
        java.lang.String str31 = locale24.getDisplayVariant(locale28);
        java.lang.String str32 = locale20.getDisplayScript(locale28);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.getISO3Country();
        java.lang.String str40 = locale38.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.lang.String str44 = locale42.getDisplayName(locale43);
        java.lang.String str45 = locale38.getDisplayVariant(locale42);
        java.lang.String str46 = locale34.getDisplayScript(locale42);
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = locale48.getISO3Country();
        java.lang.String str50 = locale48.getISO3Country();
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.Locale locale56 = java.util.Locale.ENGLISH;
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale59 = java.util.Locale.KOREAN;
        java.lang.String str60 = locale58.getDisplayName(locale59);
        java.util.Locale locale61 = java.util.Locale.ITALY;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.lang.String str63 = locale62.getISO3Country();
        java.lang.String str64 = locale62.getISO3Country();
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        java.lang.String str68 = locale66.getDisplayName(locale67);
        java.lang.String str69 = locale62.getDisplayVariant(locale66);
        java.lang.String str70 = locale58.getDisplayScript(locale66);
        java.util.Locale locale71 = java.util.Locale.ITALY;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.lang.String str73 = locale72.getISO3Country();
        java.util.Set<java.lang.String> strSet74 = locale72.getUnicodeLocaleKeys();
        java.util.Locale locale75 = java.util.Locale.KOREAN;
        java.lang.String str76 = locale75.getVariant();
        java.lang.String str77 = locale75.getVariant();
        java.util.Locale locale78 = java.util.Locale.ITALY;
        java.util.Locale locale79 = locale78.stripExtensions();
        java.util.Locale locale80 = java.util.Locale.ENGLISH;
        java.util.Locale locale81 = java.util.Locale.TAIWAN;
        java.util.Locale locale82 = java.util.Locale.ITALY;
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale16, locale18, locale28, locale42, locale48, locale51, locale53, locale55, locale56, locale58, locale72, locale75, locale78, locale80, locale81, locale82 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList84, filteringMode87);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITA" + "'", str25, "ITA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ITA" + "'", str26, "ITA");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ITA" + "'", str39, "ITA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ITA" + "'", str40, "ITA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ITA" + "'", str49, "ITA");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ITA" + "'", str50, "ITA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ITA" + "'", str63, "ITA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ITA" + "'", str64, "ITA");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ITA" + "'", str73, "ITA");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it_IT");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList88);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale9.getDisplayVariant(locale13);
        java.lang.String str17 = locale7.getDisplayName(locale9);
        java.util.Locale.Builder builder18 = builder4.setLocale(locale7);
        java.util.Locale.Builder builder19 = builder4.clear();
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale24 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category20, locale24);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale26.getDisplayLanguage(locale27);
        java.util.Locale.setDefault(category20, locale26);
        java.util.Locale locale32 = new java.util.Locale("fr_FR", "it");
        java.util.Locale.setDefault(category20, locale32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder4.setLocale(locale32);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr_fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "inglese (Stati Uniti)" + "'", str17, "inglese (Stati Uniti)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale24.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "chinois" + "'", str28, "chinois");
        org.junit.Assert.assertEquals(locale32.toString(), "fr_fr_IT");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TWN" + "'", str1, "TWN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (Taiwan)" + "'", str2, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList9);
        java.util.Collection<java.lang.String> strCollection12 = null;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strCollection12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList24, filteringMode25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale2.getISO3Country();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        boolean boolean6 = locale0.equals((java.lang.Object) faker5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        int int2 = random0.nextInt();
        java.util.stream.IntStream intStream4 = random0.ints((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random0.doubles((-687730097483691497L), (double) 0.41729766f, (double) 0.54610914f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-529915017) + "'", int2 == (-529915017));
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale locale12 = new java.util.Locale("hi!");
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.lang.String str27 = locale20.getDisplayVariant(locale24);
        java.lang.String str28 = locale16.getDisplayScript(locale24);
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.lang.String str32 = locale30.getDisplayName(locale31);
        java.util.Locale locale33 = java.util.Locale.ITALY;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.lang.String str35 = locale34.getISO3Country();
        java.lang.String str36 = locale34.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.lang.String str40 = locale38.getDisplayName(locale39);
        java.lang.String str41 = locale34.getDisplayVariant(locale38);
        java.lang.String str42 = locale30.getDisplayScript(locale38);
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.util.Locale locale44 = locale43.stripExtensions();
        java.lang.String str45 = locale44.getISO3Country();
        java.lang.String str46 = locale44.getISO3Country();
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.lang.String str50 = locale48.getDisplayCountry(locale49);
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.lang.String str56 = locale54.getDisplayName(locale55);
        java.util.Locale locale57 = java.util.Locale.ITALY;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.lang.String str59 = locale58.getISO3Country();
        java.lang.String str60 = locale58.getISO3Country();
        java.util.Locale locale62 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        java.lang.String str64 = locale62.getDisplayName(locale63);
        java.lang.String str65 = locale58.getDisplayVariant(locale62);
        java.lang.String str66 = locale54.getDisplayScript(locale62);
        java.util.Locale locale67 = java.util.Locale.ITALY;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale68.getISO3Country();
        java.util.Set<java.lang.String> strSet70 = locale68.getUnicodeLocaleKeys();
        java.util.Locale locale71 = java.util.Locale.KOREAN;
        java.lang.String str72 = locale71.getVariant();
        java.lang.String str73 = locale71.getVariant();
        java.util.Locale locale74 = java.util.Locale.ITALY;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.util.Locale locale77 = java.util.Locale.TAIWAN;
        java.util.Locale locale78 = java.util.Locale.ITALY;
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale12, locale14, locale24, locale38, locale44, locale47, locale49, locale51, locale52, locale54, locale68, locale71, locale74, locale76, locale77, locale78 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.Locale locale82 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap83);
        java.util.Locale locale87 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleAttributes();
        java.lang.String str89 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet88);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ITA" + "'", str21, "ITA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ITA" + "'", str22, "ITA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ITA" + "'", str35, "ITA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ITA" + "'", str36, "ITA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ITA" + "'", str45, "ITA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ITA" + "'", str46, "ITA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ITA" + "'", str59, "ITA");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ITA" + "'", str60, "ITA");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ITA" + "'", str69, "ITA");
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it_IT");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(locale82);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertEquals(locale87.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Locale locale3 = new java.util.Locale("cinese (Taiwan)", "", "fr");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayName();
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cinese (taiwan)__fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-fr" + "'", str4, "x-lvariant-fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (taiwan) (fr)" + "'", str5, "cinese (taiwan) (fr)");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Name name7 = faker1.name();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker1.resolve("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zho (ZHO,und)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zho(zho");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setUnicodeLocaleKeyword("hi!", "\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("IT");
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category7, locale11);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(category7, locale13);
        java.util.Locale locale17 = java.util.Locale.getDefault(category7);
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Locale.Builder builder19 = builder2.setLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder19.setVariant("USA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: USA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale11.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u7063" + "'", str18, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("IT", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList11);
        java.util.Collection<java.lang.String> strCollection14 = null;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strCollection14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList35);
        java.util.Collection<java.lang.String> strCollection38 = null;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strCollection38);
        java.lang.String str40 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strCollection38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList49);
        java.util.Collection<java.lang.String> strCollection52 = null;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strCollection52);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList53);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList54);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList64);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList75);
        java.util.Collection<java.lang.String> strCollection78 = null;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, strCollection78);
        java.lang.String str80 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, strCollection78);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.lang.String[] strArray88 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.lang.String>) strList89);
        java.util.Collection<java.lang.String> strCollection92 = null;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, strCollection92);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList93);
        java.util.Locale.FilteringMode filteringMode96 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList93, filteringMode96);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertTrue("'" + filteringMode96 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode96.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList97);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("TWN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: TWN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Deutschland [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 0);
        float float17 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream21 = random0.doubles((long) (-2047701541), (double) (-781128374), 0.6663805693202831d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-11, 64, -59, -125, 50, 123]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.46725850910214134d) + "'", double14 == (-0.46725850910214134d));
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5044781f + "'", float17 == 0.5044781f);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        double double6 = languageRange2.getWeight();
        double double7 = languageRange2.getWeight();
        java.lang.String str8 = languageRange2.getRange();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = new java.util.Locale("IT", "fr_FR");
        java.lang.String str15 = locale11.getDisplayName(locale14);
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Country();
        java.lang.String str20 = locale17.getLanguage();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = locale22.getDisplayScript(locale24);
        java.lang.String str26 = locale17.getDisplayLanguage(locale22);
        java.lang.String str27 = locale14.getDisplayVariant(locale17);
        java.util.Set<java.lang.Character> charSet28 = locale17.getExtensionKeys();
        java.lang.String str29 = locale10.getDisplayLanguage(locale17);
        boolean boolean30 = languageRange2.equals((java.lang.Object) str29);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale14.toString(), "it_FR_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "cinese (Taiwan)" + "'", str15, "cinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ITA" + "'", str18, "ITA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITA" + "'", str19, "ITA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "it" + "'", str20, "it");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ITA" + "'", str23, "ITA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italiano" + "'", str26, "italiano");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "IT");
        java.util.Locale.Builder builder9 = builder6.setExtension('a', "chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: it_IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=deutschland");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale1.getExtensionKeys();
        java.lang.String str10 = locale1.getISO3Country();
        java.lang.String str11 = locale1.getISO3Language();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale1.getDisplayLanguage(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        java.util.stream.LongStream longStream6 = random0.longs((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs(4926657520955110588L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Locale locale1 = new java.util.Locale("\u53f0\u7063");
        org.junit.Assert.assertEquals(locale1.toString(), "\u53f0\u7063");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cinese (taiwan) (fr)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese(taiwan)(fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Collection<java.lang.String> strCollection11 = null;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection11);
        java.util.Collection<java.util.Locale> localeCollection13 = null;
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList33);
        java.util.Collection<java.lang.String> strCollection36 = null;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strCollection36);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strCollection36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList47, filteringMode50);
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection13, filteringMode50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.parse("und", strMap56);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Locale locale61 = java.util.Locale.ITALY;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.lang.String str63 = locale62.getISO3Country();
        java.util.Set<java.lang.String> strSet64 = locale62.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag(languageRangeList57, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.util.Locale locale70 = java.util.Locale.ITALY;
        java.util.Locale locale71 = locale70.stripExtensions();
        java.lang.String str72 = locale71.getISO3Country();
        java.util.Set<java.lang.String> strSet73 = locale71.getUnicodeLocaleKeys();
        java.lang.String str74 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strSet73);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList83);
        java.lang.String[] strArray90 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        java.lang.String str93 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str94 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList57, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str96 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList91);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap97 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList98 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap97);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode50.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ITA" + "'", str63, "ITA");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ITA" + "'", str72, "ITA");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNotNull(languageRangeList98);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ko");
        java.util.Random random2 = new java.util.Random();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random2.nextBytes(byteArray9);
        java.util.stream.LongStream longStream11 = random2.longs();
        float float12 = random2.nextFloat();
        float float13 = random2.nextFloat();
        java.util.stream.DoubleStream doubleStream15 = random2.doubles(100L);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random2);
        java.lang.String str18 = faker16.letterify("Italia");
        com.github.javafaker.Lorem lorem19 = faker16.lorem();
        com.github.javafaker.Internet internet20 = faker16.internet();
        boolean boolean21 = languageRange1.equals((java.lang.Object) internet20);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-127, 10, -114, 19, 14, -3]");
        org.junit.Assert.assertNotNull(longStream11);
// flaky:         org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.2355839f + "'", float12 == 0.2355839f);
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.31951916f + "'", float13 == 0.31951916f);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italia" + "'", str18, "Italia");
        org.junit.Assert.assertNotNull(lorem19);
        org.junit.Assert.assertNotNull(internet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.numerify("Italian");
        java.lang.String str6 = faker1.bothify("italiano");
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.Color color8 = faker1.color();
        com.github.javafaker.Name name9 = faker1.name();
        java.lang.Class<?> wildcardClass10 = faker1.getClass();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale4);
        java.lang.String str11 = locale2.getDisplayCountry(locale4);
        java.lang.String str12 = locale2.getDisplayScript();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.util.Locale locale15 = new java.util.Locale("IT");
        java.lang.String str16 = locale13.getDisplayVariant(locale15);
        java.lang.String str17 = locale15.getDisplayLanguage();
        java.lang.String str18 = locale2.getDisplayCountry(locale15);
        java.lang.String str19 = locale2.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str17, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ITA");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi! (ITALIANO)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!(italiano)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLanguage("tedesco (Germania)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: tedesco (Germania) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Options options5 = faker4.options();
        com.github.javafaker.Name name6 = faker4.name();
        com.github.javafaker.Options options7 = faker4.options();
        com.github.javafaker.Finance finance8 = faker4.finance();
        com.github.javafaker.Finance finance9 = faker4.finance();
        com.github.javafaker.Address address10 = faker4.address();
        boolean boolean11 = languageRange2.equals((java.lang.Object) faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension('4', "English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setExtension('u', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str7 = faker1.bothify("it");
        com.github.javafaker.Book book8 = faker1.book();
        com.github.javafaker.Lorem lorem9 = faker1.lorem();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random3.doubles((long) 1);
        java.util.stream.IntStream intStream6 = random3.ints();
        java.util.stream.DoubleStream doubleStream7 = random3.doubles();
        java.util.stream.LongStream longStream9 = random3.longs((long) (byte) 100);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        java.lang.String str12 = faker10.numerify("\ud504\ub791\uc2a4\uc5b4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker10.resolve("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str12, "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale.Builder builder8 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???????? [at index 0]");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setUnicodeLocaleKeyword("", "TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((long) (-1730591738));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-71, 55, 116, -119, -37, 64]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.7045491f + "'", float10 == 0.7045491f);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.addUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguage("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tedesco (Germania)" + "'", str7, "tedesco (Germania)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ita");
        java.lang.String str2 = languageRange1.getRange();
        boolean boolean4 = languageRange1.equals((java.lang.Object) 0.06387816383942531d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ita" + "'", str2, "ita");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Options options5 = faker1.options();
        com.github.javafaker.Name name6 = faker1.name();
        com.github.javafaker.Business business7 = faker1.business();
        java.lang.Class<?> wildcardClass8 = faker1.getClass();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str7 = faker1.bothify("it");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker1.resolve("italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Random random1 = new java.util.Random((long) 19522795);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (-720507519), (long) (short) -1, (long) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        java.util.stream.LongStream longStream13 = random4.longs();
        float float14 = random4.nextFloat();
        java.util.stream.DoubleStream doubleStream17 = random4.doubles((double) (-172665890), (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale2, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr_FR_FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-15, 13, -45, 89, 31, -64]");
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.28517836f + "'", float14 == 0.28517836f);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        double double3 = random0.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream2);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.17649027102161408d + "'", double3 == 0.17649027102161408d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream3 = random0.longs((long) (byte) 1);
        boolean boolean4 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) 494295214, (long) 1872856773, (long) (-1989047807));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "fr");
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Set<java.lang.Character> charSet12 = locale4.getExtensionKeys();
        java.lang.String str13 = locale4.getISO3Country();
        java.lang.String str14 = locale4.getISO3Language();
        java.lang.String str15 = locale2.getDisplayCountry(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ITA" + "'", str13, "ITA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ita" + "'", str14, "ita");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Francia" + "'", str15, "Francia");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        double double6 = languageRange2.getWeight();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("und", strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Set<java.lang.String> strSet16 = locale14.getUnicodeLocaleKeys();
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet16);
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strSet16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("und", strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleKeys();
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strSet28);
        java.lang.String str30 = java.util.Locale.lookupTag(languageRangeList21, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleKeys();
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strSet37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList47);
        java.lang.String[] strArray54 = new java.lang.String[] { "ITA", "Italian", "fr_FR", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.lang.String str57 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String str59 = java.util.Locale.lookupTag(languageRangeList21, (java.util.Collection<java.lang.String>) strList55);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList55);
        boolean boolean61 = languageRange2.equals((java.lang.Object) strList55);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ITA" + "'", str27, "ITA");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ITA" + "'", str36, "ITA");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.IntStream intStream10 = random0.ints(0L);
        double double11 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles((long) (-151966581));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[75, -75, -73, 30, 113, 58]");
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4379612751807769d + "'", double11 == 1.4379612751807769d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        java.util.stream.IntStream intStream14 = random0.ints((long) 'x');
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[73, 87, 116, 22, -68, 120]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.70772994f + "'", float10 == 0.70772994f);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayLanguage(locale7);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale12 = new java.util.Locale("fr_FR", "it");
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Locale locale16 = new java.util.Locale("IT");
        java.lang.String str17 = locale14.getDisplayVariant(locale16);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale18.getDisplayCountry(locale21);
        java.util.Locale.setDefault(locale18);
        java.lang.String str25 = locale16.getDisplayCountry(locale18);
        java.lang.String str26 = locale16.getDisplayScript();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.util.Locale locale29 = new java.util.Locale("IT");
        java.lang.String str30 = locale27.getDisplayVariant(locale29);
        java.lang.String str31 = locale29.getDisplayLanguage();
        java.lang.String str32 = locale16.getDisplayCountry(locale29);
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chinois" + "'", str8, "chinois");
        org.junit.Assert.assertEquals(locale12.toString(), "fr_fr_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str31, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setScript("English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: English [at index 0]");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-TW", (double) 707361935);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=7.07361935E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setRegion("");
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.setVariant("Italian");
        java.util.Locale locale7 = builder1.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList28);
        java.util.Collection<java.lang.String> strCollection31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strCollection31);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strCollection31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "Italian" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList42);
        java.util.Collection<java.lang.String> strCollection45 = null;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strCollection45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList46);
        java.util.Collection<java.util.Locale> localeCollection48 = null;
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, localeCollection48, filteringMode49);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet8, filteringMode49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList50);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Locale locale2 = new java.util.Locale("ita", "hi!__ITA");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale3.getDisplayCountry(locale6);
        java.util.Locale.setDefault(locale3);
        boolean boolean10 = locale2.equals((java.lang.Object) locale3);
        org.junit.Assert.assertEquals(locale2.toString(), "ita_HI!__ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random0.longs((long) (-914344994), (-3792336259741422992L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setVariant("it-IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: it-IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 0 };
        random0.nextBytes(byteArray19);
        long long21 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = random0.nextInt((-890288509));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[68, 43, 19, 20, -10, 127]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.007695049907374d + "'", double9 == 1.007695049907374d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1293536440) + "'", int11 == (-1293536440));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-47, -38]");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-996250916852554684L) + "'", long21 == (-996250916852554684L));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.removeUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder5.setVariant("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str7, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = faker20.resolve("tedesco");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-7, -61, 25, -21, 40, 0]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.23256207f + "'", float15 == 0.23256207f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8623103f + "'", float16 == 0.8623103f);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker1.resolve("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setUnicodeLocaleKeyword("italiano (Italia)", "x-lvariant-fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: italiano (Italia) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.setLanguageTag("Chinese");
        java.util.Locale.Builder builder13 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguageTag("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ITALIANO");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale7.getScript();
        java.lang.String str10 = locale6.getDisplayCountry(locale7);
        java.lang.String str11 = locale6.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano" + "'", str8, "italiano");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setRegion("");
        java.util.Locale.Builder builder8 = builder6.setRegion("");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = builder8.build();
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.lang.String str15 = locale13.getISO3Country();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.lang.String str20 = locale13.getDisplayVariant(locale17);
        java.lang.String str21 = locale11.getDisplayName(locale13);
        java.util.Locale.Builder builder22 = builder8.setLocale(locale11);
        boolean boolean23 = languageRange2.equals((java.lang.Object) locale11);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "inglese (Stati Uniti)" + "'", str21, "inglese (Stati Uniti)");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Locale locale2 = new java.util.Locale("Koreanisch", "Italian");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "koreanisch_ITALIAN");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(100L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        java.lang.String str16 = faker14.letterify("Italia");
        com.github.javafaker.Lorem lorem17 = faker14.lorem();
        com.github.javafaker.Internet internet18 = faker14.internet();
        com.github.javafaker.DateAndTime dateAndTime19 = faker14.date();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-69, 18, -89, -113, 111, -77]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.44241047f + "'", float10 == 0.44241047f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5644181f + "'", float11 == 0.5644181f);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italia" + "'", str16, "Italia");
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(internet18);
        org.junit.Assert.assertNotNull(dateAndTime19);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.numerify("Italian");
        java.lang.String str6 = faker1.bothify("italiano");
        com.github.javafaker.Business business7 = faker1.business();
        com.github.javafaker.Company company8 = faker1.company();
        com.github.javafaker.Internet internet9 = faker1.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker1.resolve("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(internet9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "coreano" + "'", str1, "coreano");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder7 = builder4.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('4', "giapponese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it_IT" + "'", str4, "it_IT");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 1);
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Internet internet15 = faker14.internet();
        com.github.javafaker.Lorem lorem16 = faker14.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = faker14.resolve("it_IT");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-85, -115, -23, 120, 86, -28]");
        org.junit.Assert.assertNotNull(internet15);
        org.junit.Assert.assertNotNull(lorem16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale4 = new java.util.Locale("IT");
        java.lang.String str5 = locale2.getDisplayVariant(locale4);
        java.util.Locale.setDefault(category0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale2.getUnicodeLocaleType("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str5 = faker3.bothify("IT");
        com.github.javafaker.Company company6 = faker3.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IT" + "'", str5, "IT");
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLanguage("Japanese (Japan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Japanese (Japan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Finance finance6 = faker1.finance();
        com.github.javafaker.Number number7 = faker1.number();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        double double6 = languageRange2.getWeight();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setRegion("");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder7.clear();
        java.util.Locale.Builder builder12 = builder11.clear();
        boolean boolean13 = languageRange2.equals((java.lang.Object) builder12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "it");
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.lang.String str5 = locale2.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_fr" + "'", str4, "fr_fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Random random1 = new java.util.Random(0L);
        int int3 = random1.nextInt(348768006);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 174669336 + "'", int3 == 174669336);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "fr");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese_FR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_FR");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Country();
        java.lang.String str6 = locale3.getLanguage();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = locale8.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale8);
        java.lang.String str13 = locale3.getDisplayVariant();
        java.lang.String str14 = locale0.getDisplayVariant(locale3);
        boolean boolean15 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italiano" + "'", str12, "italiano");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale7.getScript();
        java.lang.String str10 = locale6.getDisplayCountry(locale7);
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano" + "'", str8, "italiano");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale0.getDisplayName(locale4);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale0.getDisplayName(locale6);
        java.lang.String str8 = locale6.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str5, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str7, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ja" + "'", str8, "ja");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getISO3Country();
        java.lang.String str3 = locale0.getDisplayLanguage();
        java.lang.Class<?> wildcardClass4 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese" + "'", str3, "francese");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French (Canada)", 0.9719372949633904d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        java.util.Locale.Builder builder7 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("giapponese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: giapponese [at index 0]");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 1);
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Options options15 = faker14.options();
        java.lang.String str17 = faker14.bothify("fr");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[118, -91, 48, 86, 108, -7]");
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("inglese (Stati Uniti)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=inglese (stati uniti)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setExtension(' ', "zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("allemand");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???(???????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 0);
        java.util.Random random17 = new java.util.Random();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random17.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream30 = random0.longs((-4017305761245989604L), (-1121476309959396393L), (long) (-2047701541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-106, -10, -76, 47, -126, 110]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.49967147602388107d + "'", double14 == 0.49967147602388107d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[84, 74, -85, 43, -126, -78]");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        java.util.Locale locale8 = new java.util.Locale("hi!__ITA", "fr", "hi!");
        java.lang.String str9 = locale1.getDisplayName(locale8);
        java.util.Random random10 = new java.util.Random();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random10.nextBytes(byteArray17);
        double double19 = random10.nextGaussian();
        java.util.stream.DoubleStream doubleStream20 = random10.doubles();
        int int21 = random10.nextInt();
        int int22 = random10.nextInt();
        java.util.stream.LongStream longStream24 = random10.longs((long) (byte) 10);
        random10.setSeed((long) (byte) 100);
        boolean boolean27 = locale8.equals((java.lang.Object) random10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!__ita_FR_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian (Italy)" + "'", str9, "Italian (Italy)");
        org.junit.Assert.assertNotNull(byteArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[120, 77, 104, -71, -108, -49]");
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36744149710102236d + "'", double19 == 0.36744149710102236d);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 607312993 + "'", int21 == 607312993);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-789523572) + "'", int22 == (-789523572));
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Random random1 = new java.util.Random((long) (-720507519));
        java.util.stream.IntStream intStream4 = random1.ints(0, 282464450);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((long) 100, (long) 105140450, (-3064636853889664804L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random0.longs((long) 348768006, (long) (byte) 10, (long) '4');
        float float5 = random0.nextFloat();
        java.util.stream.LongStream longStream7 = random0.longs((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((long) (-1086029816), (int) (short) 0, 1490859811);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.81526923f + "'", float5 == 0.81526923f);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream3 = random0.longs((long) (byte) 1);
        int int5 = random0.nextInt((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random0.ints((-1564457783298176597L), (-1832452933), 303251316);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 39 + "'", int5 == 39);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.LongStream longStream12 = random0.longs((long) 0);
        java.util.stream.LongStream longStream13 = random0.longs();
        double double14 = random0.nextDouble();
        double double15 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random0.doubles((-4017305761245989604L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[74, -41, -40, 77, 25, 12]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.88141537f + "'", float10 == 0.88141537f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8477335471991005d + "'", double14 == 0.8477335471991005d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.015698037379590413d + "'", double15 == 0.015698037379590413d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("IT");
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category7, locale11);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(category7, locale13);
        java.util.Locale locale17 = java.util.Locale.getDefault(category7);
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Locale.Builder builder19 = builder2.setLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder19.setScript("IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale11.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u7063" + "'", str18, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayName(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale5.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch (Italien)" + "'", str6, "Italienisch (Italien)");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale26.toLanguageTag();
        java.util.Locale.setDefault(category0, locale26);
        java.lang.String str30 = locale26.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ko" + "'", str28, "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ko" + "'", str30, "ko");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale7.getScript();
        java.lang.String str10 = locale6.getDisplayCountry(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale7.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("tedesco", (double) 1785693086);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.785693086E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Locale locale1 = new java.util.Locale("ITA");
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ita" + "'", str2, "ita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        boolean boolean2 = random0.nextBoolean();
        java.util.stream.LongStream longStream4 = random0.longs(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) (-894906242), 0L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Locale locale2 = new java.util.Locale("IT", "fr_FR");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getISO3Country();
        java.lang.String str10 = locale8.getISO3Country();
        boolean boolean11 = locale8.hasExtensions();
        java.lang.String str12 = locale5.getDisplayVariant(locale8);
        java.lang.String str13 = locale5.toLanguageTag();
        java.lang.String str14 = locale5.getDisplayCountry();
        boolean boolean15 = locale2.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals(locale2.toString(), "it_FR_FR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "und" + "'", str13, "und");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setScript("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh-TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Locale locale2 = new java.util.Locale("ITA", "Chinese (Taiwan)");
        org.junit.Assert.assertEquals(locale2.toString(), "ita_CHINESE (TAIWAN)");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) 494295214);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random0);
        int int14 = random0.nextInt(1127425299);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-58, -85, -58, 83, 98, -66]");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 742778693 + "'", int14 == 742778693);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.lang.String str6 = locale5.getVariant();
        java.lang.Object obj7 = null;
        boolean boolean8 = locale5.equals(obj7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale25 = java.util.Locale.getDefault(category0);
        java.util.Locale locale26 = java.util.Locale.ITALY;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.lang.String str28 = locale26.getCountry();
        java.lang.String str29 = locale26.getScript();
        java.util.Locale.setDefault(category0, locale26);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italiano" + "'", str27, "italiano");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "IT" + "'", str28, "IT");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles((long) 1);
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        java.util.stream.LongStream longStream5 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles(100L, 100.0d, (-0.7866506336809317d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale1.getDisplayScript();
        java.lang.String str6 = locale1.getDisplayName();
        java.lang.String str8 = locale1.getExtension('a');
        java.lang.String str9 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)" + "'", str6, "\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('a', "IT");
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setRegion("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 1);
        java.util.Random random4 = new java.util.Random();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random4.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Internet internet15 = faker14.internet();
        com.github.javafaker.Lorem lorem16 = faker14.lorem();
        com.github.javafaker.Business business17 = faker14.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-118, -41, 18, -59, 109, 100]");
        org.junit.Assert.assertNotNull(internet15);
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNotNull(business17);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Locale locale1 = new java.util.Locale("cinese (taiwan) (fr)");
        org.junit.Assert.assertEquals(locale1.toString(), "cinese (taiwan) (fr)");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale6.getDisplayVariant(locale10);
        java.lang.String str14 = locale2.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str18 = locale2.getDisplayScript(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category0, locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = locale21.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("IT", (double) (short) 0);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        double double6 = languageRange2.getWeight();
        boolean boolean8 = languageRange2.equals((java.lang.Object) 0.35368234f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.setLanguage("");
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.util.Locale locale14 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str15 = locale8.getDisplayCountry(locale14);
        java.lang.String str16 = locale8.toLanguageTag();
        java.lang.String str17 = locale8.getDisplayCountry();
        java.util.Locale.Builder builder18 = builder6.setLocale(locale8);
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.lang.String str27 = locale20.getDisplayVariant(locale24);
        java.util.Set<java.lang.Character> charSet28 = locale20.getExtensionKeys();
        java.lang.String str29 = locale20.getISO3Country();
        java.lang.String str30 = locale20.getISO3Language();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.lang.String str34 = locale32.getDisplayName(locale33);
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Country();
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.lang.String str42 = locale40.getDisplayName(locale41);
        java.lang.String str43 = locale36.getDisplayVariant(locale40);
        java.lang.String str44 = locale32.getDisplayScript(locale40);
        java.util.Locale locale47 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str48 = locale32.getDisplayScript(locale47);
        java.lang.String str49 = locale47.getDisplayName();
        boolean boolean50 = locale47.hasExtensions();
        java.lang.String str51 = locale20.getDisplayScript(locale47);
        java.util.Locale.setDefault(locale20);
        java.util.Locale.Builder builder53 = builder6.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder56 = builder53.setUnicodeLocaleKeyword("\uc911\uad6d\uc5b4\ub300\ub9cc)", "Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (?????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITA" + "'", str9, "ITA");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italy" + "'", str15, "Italy");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it-IT" + "'", str16, "it-IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italia" + "'", str17, "Italia");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ITA" + "'", str21, "ITA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ITA" + "'", str22, "ITA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ITA" + "'", str29, "ITA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ita" + "'", str30, "ita");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ITA" + "'", str37, "ITA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ITA" + "'", str38, "ITA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale47.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "fr_fr (FR_FR)" + "'", str49, "fr_fr (FR_FR)");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("IT");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale4);
        java.lang.String str11 = locale2.getDisplayCountry(locale4);
        java.lang.String str12 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str6 = locale0.getDisplayLanguage(locale5);
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = locale5.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str1, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italian" + "'", str6, "Italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("giapponese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: giapponese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category5, locale9);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayLanguage(locale12);
        java.util.Locale.setDefault(category5, locale11);
        java.util.Locale locale17 = new java.util.Locale("fr_FR", "it");
        java.util.Locale.setDefault(category5, locale17);
        java.lang.String str19 = locale17.getDisplayScript();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setRegion("");
        java.util.Locale.Builder builder23 = builder20.clearExtensions();
        java.util.Locale.Builder builder24 = builder20.clear();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale17.getDisplayVariant(locale25);
        java.lang.String str27 = locale25.getCountry();
        boolean boolean28 = locale0.equals((java.lang.Object) str27);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chinois" + "'", str13, "chinois");
        org.junit.Assert.assertEquals(locale17.toString(), "fr_fr_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.util.Locale locale16 = new java.util.Locale("fr_FR", "fr_FR");
        java.lang.String str17 = locale1.getDisplayScript(locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.toLanguageTag();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder20.setRegion("");
        java.util.Locale.Builder builder24 = builder22.setRegion("");
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale16.getDisplayName(locale25);
        java.lang.String str27 = locale25.getVariant();
        java.lang.String str28 = locale25.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und" + "'", str19, "und");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr_fr (FR_FR)" + "'", str26, "fr_fr (FR_FR)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.setLanguage("");
        java.util.Locale locale7 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setVariant("x-lvariant-fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: x-lvariant-fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "_IT");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream11 = random0.longs((long) 10, (long) 'a');
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(1L);
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 0);
        random0.setSeed((-687730097483691497L));
        java.util.Random random19 = new java.util.Random();
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random19.nextBytes(byteArray26);
        double double28 = random19.nextGaussian();
        java.util.stream.DoubleStream doubleStream29 = random19.doubles();
        int int30 = random19.nextInt();
        java.util.stream.DoubleStream doubleStream32 = random19.doubles(0L);
        java.util.stream.DoubleStream doubleStream35 = random19.doubles(0.4582760166551051d, (double) 100);
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 0 };
        random19.nextBytes(byteArray38);
        random0.nextBytes(byteArray38);
        java.lang.Class<?> wildcardClass41 = random0.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[48, 2, -87, -125, 15, -51]");
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.1440159754181893d + "'", double14 == 1.1440159754181893d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(byteArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 119, 100, -59, -46, 67]");
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.4392370298225179d + "'", double28 == 0.4392370298225179d);
        org.junit.Assert.assertNotNull(doubleStream29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1769515046 + "'", int30 == 1769515046);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertNotNull(doubleStream35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-93, 38]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fr-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.removeUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder3.setVariant("Japanese (Japan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Japanese (Japan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        double double13 = random0.nextDouble();
        random0.setSeed((long) 1605336701);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[27, -4, 19, 14, 97, -34]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8785172f + "'", float10 == 0.8785172f);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3321763578817397d + "'", double13 == 0.3321763578817397d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.getLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Number number6 = faker5.number();
        com.github.javafaker.Internet internet7 = faker5.internet();
        com.github.javafaker.Internet internet8 = faker5.internet();
        com.github.javafaker.Finance finance9 = faker5.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u671d\u9c9c\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale6 = new java.util.Locale("Chinese", "fr");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale6.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for chinese");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale6.toString(), "chinese_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles((-4017305761245989604L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[29, 31, -6, -39, -82, -99]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.034659922f + "'", float10 == 0.034659922f);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category5, locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getVariant();
        boolean boolean15 = locale12.hasExtensions();
        java.lang.String str16 = locale9.getDisplayName(locale12);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12);
        java.lang.Object obj18 = locale12.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! (ITA)" + "'", str16, "hi! (ITA)");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "ko");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "ko");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "ko");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale9.getDisplayVariant(locale13);
        java.lang.String str17 = locale7.getDisplayName(locale9);
        java.util.Locale.Builder builder18 = builder4.setLocale(locale7);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setRegion("");
        java.util.Locale.Builder builder22 = builder19.clearExtensions();
        java.util.Locale.Builder builder24 = builder22.setLanguageTag("Italian");
        java.util.Locale locale25 = builder22.build();
        java.util.Locale.Builder builder26 = builder18.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder26.setScript("hi! (ITALIANO)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! (ITALIANO) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITA" + "'", str10, "ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "inglese (Stati Uniti)" + "'", str17, "inglese (Stati Uniti)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "italian");
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.IntStream intStream10 = random0.ints(0L);
        double double11 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random0.doubles((-2860397701948292573L), (double) 1741626782, (-0.6459906639109672d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 89, -113, 97, -4, 72]");
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6740045489058488d + "'", double11 == 0.6740045489058488d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.LongStream longStream12 = random0.longs((long) 0);
        java.util.stream.LongStream longStream13 = random0.longs();
        double double14 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random0.ints(1872856773, 348768006);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-36, 16, -98, 120, -128, -47]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.7592131f + "'", float10 == 0.7592131f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.39553492330167317d + "'", double14 == 0.39553492330167317d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Random random3 = new java.util.Random();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random3.nextBytes(byteArray10);
        java.util.stream.LongStream longStream12 = random3.longs();
        float float13 = random3.nextFloat();
        float float14 = random3.nextFloat();
        java.util.stream.DoubleStream doubleStream16 = random3.doubles(100L);
        java.util.stream.LongStream longStream17 = random3.longs();
        random3.setSeed((long) (short) 100);
        java.util.stream.IntStream intStream20 = random3.ints();
        java.util.stream.LongStream longStream22 = random3.longs(0L);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale0, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream27 = random3.longs((long) (-1545810632), (long) 105140450, (long) 105140450);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-103, -15, 73, -33, -25, -70]");
        org.junit.Assert.assertNotNull(longStream12);
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.22396052f + "'", float13 == 0.22396052f);
// flaky:         org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.24699199f + "'", float14 == 0.24699199f);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(longStream22);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream3 = random0.longs((long) (byte) 1);
        int int5 = random0.nextInt((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random0.ints((-7056613622089270994L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ita");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Italian");
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        java.util.Locale.Builder builder11 = builder5.setLanguageTag("fr");
        boolean boolean12 = languageRange1.equals((java.lang.Object) "fr");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Finance finance3 = faker1.finance();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.LongStream longStream12 = random0.longs((long) 0);
        java.util.stream.IntStream intStream15 = random0.ints((int) (short) 0, 303251316);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs((-7235640274895147528L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-35, -26, -28, 14, 45, -11]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.21300727f + "'", float10 == 0.21300727f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("francese", (double) 872636277);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.72636277E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getISO3Country();
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str9 = locale4.getExtension('a');
        java.util.Locale locale10 = locale4.stripExtensions();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale10);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.lang.String str15 = locale13.getISO3Country();
        java.lang.String str16 = locale13.getLanguage();
        java.util.Locale.Builder builder17 = builder2.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder2.setUnicodeLocaleKeyword("\uc774\ud0c8\ub9ac\uc544\uc5b4\uc774\ud0c8\ub9ac\uc544)", "USA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??????????? (?????????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITA" + "'", str5, "ITA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????(??????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "fr_FR");
        java.util.Locale locale5 = new java.util.Locale("hi!", "italiano");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.util.Random random7 = new java.util.Random();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random7.nextBytes(byteArray14);
        java.util.stream.LongStream longStream16 = random7.longs();
        float float17 = random7.nextFloat();
        java.util.stream.DoubleStream doubleStream19 = random7.doubles((long) (short) 10);
        double double20 = random7.nextDouble();
        java.util.Random random21 = new java.util.Random();
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random21.nextBytes(byteArray28);
        double double30 = random21.nextGaussian();
        java.util.stream.DoubleStream doubleStream31 = random21.doubles();
        int int32 = random21.nextInt();
        java.util.stream.DoubleStream doubleStream34 = random21.doubles((long) (byte) 10);
        double double35 = random21.nextGaussian();
        java.util.Random random36 = new java.util.Random();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random36.nextBytes(byteArray43);
        random21.nextBytes(byteArray43);
        random7.nextBytes(byteArray43);
        java.util.stream.DoubleStream doubleStream47 = random7.doubles();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale5, random7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!_ITALIANO could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_FR_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_ITALIANO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-5, -116, -61, 46, -65, -86]");
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.23903799f + "'", float17 == 0.23903799f);
        org.junit.Assert.assertNotNull(doubleStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.43275872576505325d + "'", double20 == 0.43275872576505325d);
        org.junit.Assert.assertNotNull(byteArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, -102, 99, 75, 103, 50]");
// flaky:         org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.01361400908778477d) + "'", double30 == (-0.01361400908778477d));
        org.junit.Assert.assertNotNull(doubleStream31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1178020399 + "'", int32 == 1178020399);
        org.junit.Assert.assertNotNull(doubleStream34);
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.46381299876583704d) + "'", double35 == (-0.46381299876583704d));
        org.junit.Assert.assertNotNull(byteArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[120, 22, 82, -17, -34, 53]");
        org.junit.Assert.assertNotNull(doubleStream47);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        int int12 = random0.nextInt();
        int int13 = random0.nextInt();
        long long14 = random0.nextLong();
        boolean boolean15 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random0.doubles((-0.29924633016832297d), (-0.5356062528957476d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[66, -68, 116, -102, -1, -78]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0201667603231357d + "'", double9 == 2.0201667603231357d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 982533833 + "'", int11 == 982533833);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-662899081) + "'", int12 == (-662899081));
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1290882112) + "'", int13 == (-1290882112));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3899565474698577538L + "'", long14 == 3899565474698577538L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setLanguage("TWN");
        java.util.Locale.Builder builder7 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLanguage("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh_TW [at index 0]");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.String str4 = faker1.letterify("CHN");
        com.github.javafaker.Options options5 = faker1.options();
        java.lang.String str7 = faker1.numerify("hi! (ITALIANO)");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! (ITALIANO)" + "'", str7, "hi! (ITALIANO)");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setVariant("Italian");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder10 = builder5.removeUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder5.setVariant("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German (Germany)" + "'", str7, "German (Germany)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Random random5 = new java.util.Random();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray12);
        java.util.stream.LongStream longStream14 = random5.longs();
        float float15 = random5.nextFloat();
        float float16 = random5.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random5.doubles(100L);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale3, random5);
        java.util.stream.DoubleStream doubleStream21 = random5.doubles((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream24 = random5.doubles(0.3605423704638422d, (-0.36550098308233653d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-53, -99, -62, 113, -60, 67]");
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.12664783f + "'", float15 == 0.12664783f);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.7575604f + "'", float16 == 0.7575604f);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("FR_FR");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        java.util.Locale.Builder builder11 = builder3.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setUnicodeLocaleKeyword("\u4e2d\u6587\u4e2d\u570b)", "French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.setLanguage("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("\uc911\uad6d\uc5b4\ub300\ub9cc)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???????? (?????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) (-172665890), (double) 'a');
        random0.setSeed((long) (-1));
        boolean boolean16 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream20 = random0.longs((long) 74, (long) (-2050620459), (long) (-2050620459));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[38, 127, 20, 48, 10, -26]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.35689825f + "'", float10 == 0.35689825f);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FR_FR", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setRegion("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("IT");
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category7, locale11);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(category7, locale13);
        java.util.Locale locale17 = java.util.Locale.getDefault(category7);
        java.lang.String str18 = locale17.getDisplayCountry();
        java.util.Locale.Builder builder19 = builder2.setLocale(locale17);
        java.util.Locale.Builder builder21 = builder19.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder19.setRegion("\uc774\ud0c8\ub9ac\uc544");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale11.toString(), "hi!__ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u7063" + "'", str18, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        java.util.stream.LongStream longStream9 = random0.longs();
        float float10 = random0.nextFloat();
        float float11 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(100L);
        java.util.stream.LongStream longStream14 = random0.longs();
        int int15 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random0.ints((long) (-894906242), (-373413815), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 35, -106, -54, 24, 56]");
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.17173243f + "'", float10 == 0.17173243f);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8163432f + "'", float11 == 0.8163432f);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1160675390) + "'", int15 == (-1160675390));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale3 = new java.util.Locale("IT", "fr_FR");
        java.lang.String str4 = locale0.getDisplayName(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Country();
        java.lang.String str9 = locale6.getLanguage();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = locale6.getDisplayLanguage(locale11);
        java.lang.String str16 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.lang.String str19 = locale17.getDisplayName();
        java.lang.String str20 = locale3.getDisplayName(locale17);
        java.lang.String str21 = locale17.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale3.toString(), "it_FR_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese (Taiwan)" + "'", str4, "cinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ITA" + "'", str12, "ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano" + "'", str15, "italiano");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(charSet18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese" + "'", str19, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u610f\u5927\u5229\u6587 (FR_FR)" + "'", str20, "\u610f\u5927\u5229\u6587 (FR_FR)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Locale locale1 = new java.util.Locale("it_IT");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for it_it");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "it_it");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker1.resolve("ITALY");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(internet2);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Random random0 = new java.util.Random();
        boolean boolean1 = random0.nextBoolean();
        java.util.stream.LongStream longStream5 = random0.longs((long) 'a', (long) 'a', (long) 'u');
        java.util.stream.DoubleStream doubleStream6 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs((long) 2004614414, (long) 707361935);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str2, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)" + "'", str4, "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "ITA");
        java.util.Locale.setDefault(category5, locale9);
        java.lang.String str11 = locale1.getDisplayCountry(locale9);
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getVariant();
        boolean boolean15 = locale12.hasExtensions();
        java.lang.String str16 = locale9.getDisplayName(locale12);
        java.util.Set<java.lang.Character> charSet17 = locale12.getExtensionKeys();
        java.lang.Class<?> wildcardClass18 = charSet17.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it-IT" + "'", str4, "it-IT");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale9.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! (ITA)" + "'", str16, "hi! (ITA)");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        java.lang.Class<?> wildcardClass3 = options2.getClass();
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Random random0 = new java.util.Random();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray7);
        double double9 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(0L);
        long long14 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random0.doubles((-4380870581524721149L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[19, 110, 72, -101, 48, -70]");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9179548301596698d) + "'", double9 == (-0.9179548301596698d));
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 788524927 + "'", int11 == 788524927);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4670553078120284963L) + "'", long14 == (-4670553078120284963L));
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("fr");
        java.util.Locale.Builder builder11 = builder3.setVariant("");
        java.util.Locale.Builder builder12 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder3.setScript("Francia");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Francia [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Locale locale3 = new java.util.Locale("hi!__ITA", "fr", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__ita_FR_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "France" + "'", str4, "France");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Internet internet4 = faker1.internet();
        com.github.javafaker.Code code5 = faker1.code();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.lang.String str13 = locale1.getDisplayScript(locale9);
        java.lang.String str14 = locale1.getCountry();
        java.lang.Object obj15 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "ITA");
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        java.lang.String str9 = locale1.toLanguageTag();
        java.lang.String str10 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale1.getUnicodeLocaleType("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??? (???????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!__ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it-IT" + "'", str9, "it-IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italy" + "'", str10, "Italy");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("Italian");
        java.util.Locale.Builder builder7 = builder3.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLanguage("hi! (ITA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! (ITA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }
}
