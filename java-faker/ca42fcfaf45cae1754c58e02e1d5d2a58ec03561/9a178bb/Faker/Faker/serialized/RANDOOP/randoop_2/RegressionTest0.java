import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Locale locale0 = java.util.Locale.US;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Locale locale0 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Name name4 = faker2.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("", "zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.Name name4 = faker2.name;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter5 = null;
        faker2.serializedObjectSupporter = serializedObjectSupporter5;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zho", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        java.lang.Class<?> wildcardClass5 = faker2.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        boolean boolean2 = locale1.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('4', "\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.Code code5 = faker2.code();
        com.github.javafaker.Address address6 = faker2.address;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker2.fakeValuesService;
        com.github.javafaker.Internet internet6 = faker2.getinternet();
        com.github.javafaker.Color color7 = faker2.color;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        java.lang.String str2 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale63();
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setExtension('a', "\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker163();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number3 = faker2.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale115();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance11();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany17();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale19 = new java.util.Locale("", "", "");
        java.util.Locale locale20 = java.util.Locale.CHINESE;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Random random25 = new java.util.Random(100L);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale23, random25);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale29 = java.util.Locale.UK;
        java.lang.String str30 = locale29.getDisplayVariant();
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.lang.String str32 = locale31.getVariant();
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Random random35 = new java.util.Random(100L);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale33, random35);
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.lang.String str43 = locale41.getDisplayVariant(locale42);
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.util.Locale locale45 = java.util.Locale.TAIWAN;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.util.Locale locale47 = java.util.Locale.UK;
        java.util.Locale locale48 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale50 = java.util.Locale.ROOT;
        java.util.Locale locale54 = new java.util.Locale("", "", "");
        java.util.Locale locale55 = java.util.Locale.CHINESE;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale5, locale6, locale7, locale8, locale12, locale13, locale14, locale20, locale22, locale23, locale27, locale29, locale31, locale33, locale37, locale41, locale44, locale45, locale46, locale47, locale48, locale50, locale54 };
        java.util.ArrayList<java.util.Locale> localeList58 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList58, localeArray57);
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList58);
        java.lang.String[] strArray67 = new java.lang.String[] { "\u4e2d\u6587", "Chinese (China)", "zh", "", "\u4e2d\u6587", "Chinese (China)" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList68);
        java.lang.String str71 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList68);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(localeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker2.getfakeValuesService();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.getphoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = faker1.getcompany();
        com.github.javafaker.Company company3 = faker1.company;
        org.junit.Assert.assertNotNull(company2);
        org.junit.Assert.assertNotNull(company3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor55();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter4 = null;
        faker2.serializedObjectSupporter = serializedObjectSupporter4;
        com.github.javafaker.Name name6 = faker2.getname();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        java.lang.String str4 = locale3.getDisplayScript();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker2.getfakeValuesService();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker2.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany53();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setRegion("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale90();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KOR" + "'", str1, "KOR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KR" + "'", str2, "KR");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance61();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker123();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem5();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany14();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker2.fakeValuesService;
        com.github.javafaker.Internet internet6 = faker2.getinternet();
        java.lang.String str8 = faker2.letterify("");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber25();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor33();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions28();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany27();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor51();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime20();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber15();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale63();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker43();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance52();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem18();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService5();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("KOR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: KOR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        java.lang.String str12 = locale11.getDisplayCountry();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance24();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime19();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale91();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor29();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNull(company13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem38();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random2.doubles((double) 10.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor52();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker162();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem26();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany35();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance48();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem53();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale118();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber29();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany23();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode19();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale91();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker172();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale0.getDisplayLanguage(locale2);
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale5.getDisplayName(locale9);
        java.lang.String str11 = locale0.getDisplayVariant(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587" + "'", str4, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (China)" + "'", str10, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker109();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany40();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance31();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale102();
        java.lang.String str5 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr-FR" + "'", str5, "fr-FR");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale86();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions12();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale4();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("KOR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.bothify("\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem14();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance60();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.Book book4 = faker2.book;
        java.lang.String str6 = faker2.letterify("\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale41();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap8);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = faker1.getcompany();
        com.github.javafaker.Company company3 = faker1.getcompany();
        java.lang.String str5 = faker1.bothify("KOR");
        org.junit.Assert.assertNotNull(company2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KOR" + "'", str5, "KOR");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness52();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook56();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setLanguage("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker49();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale63();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter2 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color3 = serializedObjectSupporter2.deserializeObjectColor46();
        com.github.javafaker.Company company4 = serializedObjectSupporter2.deserializeObjectCompany59();
        java.util.Locale locale5 = serializedObjectSupporter2.deserializeObjectLocale1();
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.lang.String str7 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587" + "'", str7, "\u82f1\u6587");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale68();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale72();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker160();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor28();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber24();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker177();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode21();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem26();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook49();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions17();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber36();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode7();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany24();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber40();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService30();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale69();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness8();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder2.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setUnicodeLocaleKeyword("zho", "zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany2();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode12();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker87();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale69();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale107();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany55();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness58();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany4();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance50();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode58();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale68();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance7();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions44();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker67();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook42();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem35();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Internet internet4 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.getphoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.lang.Class<?> wildcardClass1 = filteringMode0.getClass();
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode46();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor45();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Random random1 = new java.util.Random(100L);
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        random1.nextBytes(byteArray6);
        float float8 = random1.nextFloat();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-42, -97, -43, -72]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.7346627f + "'", float8 == 0.7346627f);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance29();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Random random1 = new java.util.Random((long) 'a');
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker141();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker87();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale69();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale107();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime52();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode21();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService27();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor32();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance61();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker14();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale106();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions40();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem54();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem20();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime19();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale80();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem50();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber22();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker127();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService57();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker173();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance61();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker123();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor44();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker76();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness28();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter4 = null;
        faker2.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.String str7 = faker2.numerify("en_GB");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en_GB" + "'", str7, "en_GB");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker149();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance48();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem53();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale118();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions44();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker123();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker16();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook19();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter4 = null;
        faker2.serializedObjectSupporter = serializedObjectSupporter4;
        com.github.javafaker.service.RandomService randomService6 = faker2.randomService;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(randomService6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale67();
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany53();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode56();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Lorem lorem13 = serializedObjectSupporter0.deserializeObjectLorem21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.service.RandomService randomService4 = serializedObjectSupporter0.deserializeObjectRandomService1();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(randomService4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Collection<java.lang.String> strCollection1 = null;
        java.util.Locale.FilteringMode filteringMode2 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = java.util.Locale.filterTags(languageRangeList0, strCollection1, filteringMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode2 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode2.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany6();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale69();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker94();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions8();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Book book12 = serializedObjectSupporter0.deserializeObjectBook4();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(company13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale68();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance23();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale111();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker18();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale29();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension(' ', "KOR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber26();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance43();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker85();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale111();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker18();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber19();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale76();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany47();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber54();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.Code code5 = faker2.code();
        com.github.javafaker.Business business6 = faker2.business;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany40();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance31();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale54();
        java.lang.String str6 = locale5.getLanguage();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor24();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker124();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService22();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber37();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService42();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker55();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker1();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions18();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook14();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale56();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale4();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker153();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode39();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale82();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany42();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker101();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale63();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter2 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color3 = serializedObjectSupporter2.deserializeObjectColor46();
        com.github.javafaker.Company company4 = serializedObjectSupporter2.deserializeObjectCompany59();
        java.util.Locale locale5 = serializedObjectSupporter2.deserializeObjectLocale1();
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.lang.String str8 = locale1.getExtension('a');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Address address4 = faker2.getaddress();
        com.github.javafaker.Internet internet5 = faker2.getinternet();
        com.github.javafaker.Code code6 = faker2.getcode();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode46();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService60();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions16();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber41();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber();
        com.github.javafaker.Name name5 = faker2.getname();
        com.github.javafaker.Internet internet6 = faker2.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness45();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale5();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker93();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker115();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker87();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale69();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor13();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor52();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook24();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zho");
        java.lang.String[] strArray10 = new java.lang.String[] { "fr-FR", "", "en", "\u4e2d\u6587", "KOR", "\u82f1\u6587", "", "KR" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList11);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber19();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker92();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber58();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode60();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany8();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor7();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook10();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance47();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook49();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker152();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness11();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance10();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance61();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker123();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness34();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem14();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker118();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook13();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem52();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker37();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale17();
        java.lang.String str8 = locale7.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook42();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode19();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber48();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor33();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions33();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness52();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale67();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker1();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor25();
        com.github.javafaker.Options options13 = serializedObjectSupporter0.deserializeObjectOptions14();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(options13);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker150();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u6587");
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance2 = faker1.finance();
        com.github.javafaker.Options options3 = faker1.options();
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance43();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker48();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany4();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions29();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale77();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker92();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber58();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker115();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker66();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode43();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode32();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem35();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zho");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("", "", "");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.util.Random random27 = new java.util.Random(100L);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale25, random27);
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale31 = java.util.Locale.UK;
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.lang.String str34 = locale33.getVariant();
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.util.Random random37 = new java.util.Random(100L);
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale35, random37);
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.lang.String str45 = locale43.getDisplayVariant(locale44);
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.util.Locale locale47 = java.util.Locale.TAIWAN;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.util.Locale locale49 = java.util.Locale.UK;
        java.util.Locale locale50 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.util.Locale locale52 = java.util.Locale.ROOT;
        java.util.Locale locale56 = new java.util.Locale("", "", "");
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale7, locale8, locale9, locale10, locale14, locale15, locale16, locale22, locale24, locale25, locale29, locale31, locale33, locale35, locale39, locale43, locale46, locale47, locale48, locale49, locale50, locale52, locale56 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList60);
        java.lang.String[] strArray69 = new java.lang.String[] { "\u4e2d\u6587", "Chinese (China)", "zh", "", "\u4e2d\u6587", "Chinese (China)" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList70);
        java.util.Locale.FilteringMode filteringMode73 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList70, filteringMode73);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertTrue("'" + filteringMode73 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode73.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList74);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions43();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker108();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany53();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode33();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions26();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions24();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor25();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker167();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany27();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor51();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker66();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance8();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.Random random1 = new java.util.Random(100L);
        int int3 = random1.nextInt((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs(100L, (long) (short) -1, (-2032033978319052225L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService27();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode7();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook60();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker57();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode37();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
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
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker124();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker79();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem7();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker138();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber20();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber36();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode7();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker156();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale4();
        java.lang.String str8 = locale7.getCountry();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        java.util.stream.DoubleStream doubleStream8 = random2.doubles((double) (byte) -1, (double) (short) 1);
        java.util.stream.LongStream longStream12 = random2.longs((long) (byte) 100, (-1L), (long) (byte) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream12);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem12();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService33();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany6();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany5();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode54();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor43();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.Name name4 = faker2.getname();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale24();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker35();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber32();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber29();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker92();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Finance finance13 = serializedObjectSupporter0.deserializeObjectFinance51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(finance13);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Company company3 = faker2.company();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(company3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode60();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber30();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker133();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService25();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance49();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale51();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions56();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker148();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker92();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber58();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker23();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance60();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale70();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayLanguage(locale9);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc601\uc5b4" + "'", str11, "\uc601\uc5b4");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale104();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale97();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber61();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale95();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook10();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker81();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker64();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode22();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale13();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber36();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode7();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale32();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode57();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker100();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.service.RandomService randomService6 = serializedObjectSupporter0.deserializeObjectRandomService2();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(randomService6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Random random2 = new java.util.Random(0L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Company company4 = faker3.company;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(company4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker125();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany8();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker2.fakeValuesService;
        com.github.javafaker.Internet internet6 = faker2.getinternet();
        com.github.javafaker.Code code7 = faker2.code;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = faker2.serializedObjectSupporter;
        com.github.javafaker.Name name9 = faker2.getname();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem9();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem41();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany25();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber53();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker16();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker137();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions51();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime37();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany18();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker124();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor32();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode21();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance57();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany36();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker1();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setVariant("KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: KR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker5();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook40();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale0.getDisplayName(locale4);
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter6 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color7 = serializedObjectSupporter6.deserializeObjectColor46();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter6.deserializeObjectFaker157();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter6.deserializeObjectFaker166();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter6.deserializeObjectFinance38();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter6.deserializeObjectFaker90();
        com.github.javafaker.Book book12 = serializedObjectSupporter6.deserializeObjectBook36();
        com.github.javafaker.Code code13 = serializedObjectSupporter6.deserializeObjectCode47();
        com.github.javafaker.Book book14 = serializedObjectSupporter6.deserializeObjectBook45();
        com.github.javafaker.Company company15 = serializedObjectSupporter6.deserializeObjectCompany50();
        java.util.Locale locale16 = serializedObjectSupporter6.deserializeObjectLocale57();
        com.github.javafaker.Faker faker17 = serializedObjectSupporter6.deserializeObjectFaker172();
        java.util.Random random18 = serializedObjectSupporter6.deserializeObjectRandom2();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0, random18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(code13);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(company15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNull(faker17);
        org.junit.Assert.assertNotNull(random18);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem18();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode24();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness53();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook38();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.getdateAndTime();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber;
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(phoneNumber2);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany27();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor51();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany19();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode13();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker6();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem28();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker150();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber29();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.Code code5 = faker2.code();
        com.github.javafaker.Code code6 = faker2.code;
        com.github.javafaker.Name name7 = faker2.name;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions48();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.Book book14 = serializedObjectSupporter0.deserializeObjectBook58();
        com.github.javafaker.Book book15 = serializedObjectSupporter0.deserializeObjectBook39();
        com.github.javafaker.PhoneNumber phoneNumber16 = serializedObjectSupporter0.deserializeObjectPhoneNumber27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(phoneNumber16);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale111();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker18();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale4();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany36();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions52();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(options2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem27();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance36();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService52();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber53();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale68();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.Internet internet5 = faker2.internet();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter6 = faker2.serializedObjectSupporter;
        com.github.javafaker.Number number7 = faker2.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions43();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker118();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem60();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode21();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance40();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany29();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(company10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor50();
        com.github.javafaker.Options options13 = serializedObjectSupporter0.deserializeObjectOptions33();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale58();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber15();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber16();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook25();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem20();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Options options2 = faker1.options();
        com.github.javafaker.Book book3 = faker1.book;
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(book3);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker16();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker137();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions51();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale21();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker115();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions57();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance12();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem55();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.stream.DoubleStream doubleStream5 = random4.doubles();
        java.util.stream.IntStream intStream7 = random4.ints(1L);
        java.util.stream.IntStream intStream8 = random4.ints();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Company company2 = faker1.getcompany();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        com.github.javafaker.DateAndTime dateAndTime4 = faker1.dateAndTime;
        org.junit.Assert.assertNotNull(company2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber29();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem2();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Book book12 = serializedObjectSupporter0.deserializeObjectBook4();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale90();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker142();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.Color color5 = faker2.getcolor();
        com.github.javafaker.Name name6 = faker2.name();
        java.lang.String str8 = faker2.bothify("\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness47();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker149();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem27();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance50();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker164();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService57();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook41();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions6();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker168();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber29();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.service.RandomService randomService9 = serializedObjectSupporter0.deserializeObjectRandomService3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(randomService9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany24();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance25();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker20();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance43();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime33();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker176();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions47();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook32();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker51();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany6();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber58();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        java.util.stream.DoubleStream doubleStream8 = random2.doubles((double) (byte) -1, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random2.ints((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance29();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook45();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions5();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker155();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker79();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker52();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions47();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale8();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale13();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem57();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker128();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem8();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode13();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker6();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem57();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale110();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale104();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale97();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode59();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker79();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness49();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode5();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor14();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions1();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions45();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber13();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale97();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker80();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.util.Random random1 = new java.util.Random(100L);
        int int3 = random1.nextInt((int) (short) 1);
        int int4 = random1.nextInt();
        random1.setSeed((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1139614796) + "'", int4 == (-1139614796));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem22();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.Random random1 = new java.util.Random(100L);
        boolean boolean2 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale69();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale112();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale85();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker124();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance54();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook10();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor54();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness42();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter10 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color11 = serializedObjectSupporter10.deserializeObjectColor46();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter10.deserializeObjectFaker157();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter10.deserializeObjectFaker166();
        com.github.javafaker.Finance finance14 = serializedObjectSupporter10.deserializeObjectFinance38();
        com.github.javafaker.Faker faker15 = serializedObjectSupporter10.deserializeObjectFaker90();
        com.github.javafaker.Book book16 = serializedObjectSupporter10.deserializeObjectBook36();
        com.github.javafaker.Code code17 = serializedObjectSupporter10.deserializeObjectCode47();
        com.github.javafaker.Book book18 = serializedObjectSupporter10.deserializeObjectBook45();
        com.github.javafaker.Company company19 = serializedObjectSupporter10.deserializeObjectCompany50();
        com.github.javafaker.Code code20 = serializedObjectSupporter10.deserializeObjectCode26();
        java.util.Locale locale21 = serializedObjectSupporter10.deserializeObjectLocale48();
        java.lang.String str22 = locale9.getDisplayScript(locale21);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(faker15);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(company19);
        org.junit.Assert.assertNotNull(code20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany40();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor39();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService46();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor54();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook4();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker100();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker16();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale0.getDisplayName(locale4);
        boolean boolean6 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale24();
        com.github.javafaker.service.RandomService randomService4 = serializedObjectSupporter0.deserializeObjectRandomService3();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany46();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber22();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker127();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService57();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber59();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale64();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime37();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem36();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime37();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale106();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Lorem lorem12 = serializedObjectSupporter0.deserializeObjectLorem50();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker82();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance57();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook10();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem26();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker137();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness55();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions39();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany18();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions52();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker101();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker138();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany21();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance47();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor20();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        random2.setSeed((long) (-1139614796));
        java.util.stream.DoubleStream doubleStream9 = random2.doubles((long) (short) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions48();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.PhoneNumber phoneNumber14 = serializedObjectSupporter0.deserializeObjectPhoneNumber6();
        com.github.javafaker.service.FakeValuesService fakeValuesService15 = serializedObjectSupporter0.deserializeObjectFakeValuesService33();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(fakeValuesService15);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Address address4 = faker2.getaddress();
        com.github.javafaker.Book book5 = faker2.book;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale63();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker73();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness21();
        java.lang.Class<?> wildcardClass5 = business4.getClass();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance50();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor31();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale97();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook17();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale91();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode35();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode10();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber59();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker61();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness19();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode59();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode46();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany44();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNull(company3);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany20();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode21();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime19();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber22();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService24();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService50();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode41();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.util.Random random1 = new java.util.Random(100L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness8();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions56();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale11();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService46();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime7();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor1();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany4();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions29();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService16();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness6();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany30();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness13();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber30();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker101();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber6();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor52();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber();
        com.github.javafaker.Company company6 = faker2.getcompany();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber55();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        java.util.stream.LongStream longStream8 = random2.longs(0L, 10L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }
}
