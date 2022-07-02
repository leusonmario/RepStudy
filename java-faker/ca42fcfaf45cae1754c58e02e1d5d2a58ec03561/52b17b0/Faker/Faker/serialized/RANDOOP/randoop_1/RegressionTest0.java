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
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale7, locale9 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Options options3 = faker1.getoptions();
        com.github.javafaker.Color color4 = faker1.color;
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Business business4 = faker1.business;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("Italian", "Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app2 = faker1.app();
        com.github.javafaker.Company company3 = faker1.company();
        com.github.javafaker.Hacker hacker4 = faker1.hacker;
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.DateAndTime dateAndTime3 = faker1.dateAndTime;
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Locale locale2 = new java.util.Locale("", "fr");
        org.junit.Assert.assertEquals(locale2.toString(), "_FR");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Random random0 = new java.util.Random();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream5 = random1.ints();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it-IT" + "'", str1, "it-IT");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles();
        java.util.stream.LongStream longStream9 = random1.longs();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Locale locale0 = java.util.Locale.UK;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream2 = random1.ints();
        long long3 = random1.nextLong();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4961115982468162243L + "'", long3 == 4961115982468162243L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getISO3Country();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it_IT" + "'", str5, "it_IT");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Internet internet5 = faker1.internet;
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.Color color7 = faker1.getcolor();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        boolean boolean7 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((double) 100.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Internet internet5 = faker1.internet;
        java.lang.String str7 = faker1.regexify("italiano");
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italiano" + "'", str7, "italiano");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Number number3 = faker1.number();
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Random random1 = new java.util.Random((long) 10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Name name3 = faker1.name();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15, filteringMode17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.util.Locale locale32 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale32 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList34, filteringMode36);
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = null;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.util.Locale locale53 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList55, filteringMode57);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet39, filteringMode57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList59);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertEquals(locale53.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        boolean boolean7 = random1.nextBoolean();
        random1.setSeed(0L);
        java.util.stream.DoubleStream doubleStream12 = random1.doubles((double) (short) 0, 10.0d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.Finance finance6 = faker1.getfinance();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Business business3 = faker1.business();
        com.github.javafaker.Color color4 = faker1.color();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Options options4 = faker1.options;
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        java.lang.String str7 = faker1.numerify("");
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp65();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        boolean boolean2 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany53();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor46();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app2 = faker1.app();
        com.github.javafaker.Company company3 = faker1.company();
        com.github.javafaker.Hacker hacker4 = faker1.hacker;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker1.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber;
        com.github.javafaker.service.RandomService randomService7 = faker1.randomService;
        com.github.javafaker.Hacker hacker8 = faker1.hacker();
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = faker1.fakeValuesService;
        com.github.javafaker.Finance finance3 = faker1.finance();
        com.github.javafaker.Company company4 = faker1.getcompany();
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(company4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Locale locale1 = new java.util.Locale("it_IT");
        org.junit.Assert.assertEquals(locale1.toString(), "it_it");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app2 = faker1.app();
        com.github.javafaker.Company company3 = faker1.company();
        com.github.javafaker.Hacker hacker4 = faker1.hacker;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker1.fakeValuesService;
        com.github.javafaker.Finance finance6 = faker1.getfinance();
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor30();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = faker1.getfakeValuesService();
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet77();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker47();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Locale locale6 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!__hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Locale locale2 = new java.util.Locale("italiano", "ITA");
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_ITA");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany61();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        java.util.stream.LongStream longStream8 = random1.longs(1L);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        java.util.stream.LongStream longStream11 = random1.longs(0L);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp15();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        long long7 = random1.nextLong();
        boolean boolean8 = random1.nextBoolean();
        long long9 = random1.nextLong();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4961115982468162243L + "'", long7 == 4961115982468162243L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-8337289232527761815L) + "'", long9 == (-8337289232527761815L));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Random random5 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream8 = random5.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream10 = random5.ints(100L);
        boolean boolean11 = random5.nextBoolean();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor71();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale99();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress9();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNull(address5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook73();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getISO3Country();
        java.util.Locale locale5 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode66();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany32();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker99();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber46();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp43();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(app5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany32();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook62();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker156();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime32();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber80();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker195();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker184();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Random random1 = new java.util.Random((long) 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions17();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp26();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness9();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Name name3 = faker1.name;
        com.github.javafaker.Number number4 = faker1.number;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.getphoneNumber();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber46();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp69();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance2();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance41();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany69();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime19();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook83();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor78();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale54();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime62();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness53();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber14();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem39();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker46();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale122();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker25();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany43();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness50();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker209();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService36();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor76();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany48();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet57();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance20();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness15();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber77();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService63();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions75();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker1.phoneNumber;
        com.github.javafaker.Address address8 = faker1.address();
        java.lang.String str10 = faker1.letterify("");
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayName();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter2 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code3 = serializedObjectSupporter2.deserializeObjectCode41();
        com.github.javafaker.Color color4 = serializedObjectSupporter2.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter2.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter2.deserializeObjectPhoneNumber70();
        java.util.Locale locale7 = serializedObjectSupporter2.deserializeObjectLocale134();
        java.lang.String str8 = locale0.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker223();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet46();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker100();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions17();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp26();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName3();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp83();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance2 = faker1.getfinance();
        com.github.javafaker.Name name3 = faker1.name();
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress49();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor71();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor82();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness21();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService40();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance20();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Book book3 = faker1.getbook();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker1.getphoneNumber();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor65();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker33();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet50();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness73();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker182();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions16();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook76();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName41();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName19();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime31();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook58();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem25();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber71();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions17();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp26();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness80();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker8();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker161();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker182();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem73();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem76();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook74();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance50();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook21();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app2 = faker1.app();
        com.github.javafaker.Internet internet3 = faker1.getinternet();
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(internet3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor4();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany28();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker136();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker82();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime16();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor23();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker1.getfakeValuesService();
        com.github.javafaker.Hacker hacker7 = faker1.hacker();
        com.github.javafaker.Book book8 = faker1.book;
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook52();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany84();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp84();
        com.github.javafaker.App app12 = serializedObjectSupporter0.deserializeObjectApp64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(app11);
        org.junit.Assert.assertNull(app12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker1.getfakeValuesService();
        java.lang.String str8 = faker1.letterify("");
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress3();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService71();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor71();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime77();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany7();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode52();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor64();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem78();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor37();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker28();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Name name3 = faker1.name;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.getlorem();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor80();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker61();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Name name9 = serializedObjectSupporter0.deserializeObjectName74();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(name9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService26();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp19();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale153();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setRegion("it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: it_IT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.Options options6 = faker1.options();
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker55();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook48();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker41();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Name name3 = faker1.name;
        java.lang.String str5 = faker1.numerify("hi!");
        java.lang.String str7 = faker1.bothify("it");
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness52();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany69();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker185();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker127();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(address2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale72();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions74();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber46();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress45();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness56();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress10();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber46();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance9();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber38();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime77();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber48();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp39();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet77();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker25();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions17();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp26();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName62();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(name8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker192();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker133();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem68();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook18();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness58();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom9();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker217();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp22();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany72();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem25();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker223();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale143();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker19();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Business business3 = faker1.business();
        com.github.javafaker.Name name4 = faker1.name;
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker1.fakeValuesService;
        java.lang.String str7 = faker1.regexify("");
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp47();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet53();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker93();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress66();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService32();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService7();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker130();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime16();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance36();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = null;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale locale16 = new java.util.Locale("hi!", "", "hi!");
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale16 };
        java.util.ArrayList<java.util.Locale> localeList18 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList18, localeArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList21 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList18, filteringMode20);
        java.util.Locale locale22 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList21);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!__hi!");
        org.junit.Assert.assertNotNull(localeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList21);
        org.junit.Assert.assertNull(locale22);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany25();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress3();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker101();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp54();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker68();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem68();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode3();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService3();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker184();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.Locale locale3 = new java.util.Locale("", "Italian", "fr");
        org.junit.Assert.assertEquals(locale3.toString(), "_ITALIAN_fr");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime77();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany7();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Name name9 = serializedObjectSupporter0.deserializeObjectName83();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(name9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook52();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService26();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor24();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany71();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet46();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker127();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance84();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness16();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale103();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp83();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(app9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet57();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem39();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker78();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance66();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet57();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Address address12 = serializedObjectSupporter0.deserializeObjectAddress16();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName42();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime31();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName53();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet60();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber23();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance1();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook45();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor65();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor31();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook61();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode48();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(name6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance33();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale127();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance20();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker201();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet77();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNull(app10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker227();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany84();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode76();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet47();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions40();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(hacker4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName41();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale68();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker223();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker127();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker84();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions75();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber49();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker57();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor58();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet77();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness57();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale105();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp77();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(app2);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor75();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker65();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber52();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem35();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker235();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker192();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions63();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet12();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(internet6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime8();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService75();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem21();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNull(app3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook74();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName11();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(app3);
        org.junit.Assert.assertNull(name4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService36();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook9();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp5();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale97();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany32();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker38();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker57();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance2();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.Address address9 = serializedObjectSupporter0.deserializeObjectAddress35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook74();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp49();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale10();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(app3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor75();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor40();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker35();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode53();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet85();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker195();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem39();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker46();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale122();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp19();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker40();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress68();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker182();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress53();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet19();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService80();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber5();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet19();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker56();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNull(address4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder0.setLanguageTag("it-IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem22();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime16();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker174();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook62();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale128();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem71();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness58();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance18();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness76();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet38();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber53();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName16();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness64();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor58();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet46();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker127();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem69();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService77();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem68();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany82();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName16();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp3();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp80();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet82();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale103();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress25();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode23();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker186();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode34();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale.setDefault(locale9);
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness71();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService60();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp10();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker223();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale143();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        double double8 = random7.nextGaussian();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.561581040188955d + "'", double8 == 1.561581040188955d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem68();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp85();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness23();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance65();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName72();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale10();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp7();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(name7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(app9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale160();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker192();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions63();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNull(internet10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem24();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker175();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber11();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder0.setLanguageTag("it-IT");
        java.util.Locale.Builder builder10 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.setRegion("Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker225();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem5();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.Address address11 = serializedObjectSupporter0.deserializeObjectAddress12();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker117();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService41();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker220();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook29();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale17();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Name name11 = serializedObjectSupporter0.deserializeObjectName65();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(name11);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale103();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness84();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("italiano");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italiano");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode33();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress30();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor70();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance62();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany78();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(company10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime77();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale163();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance30();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor24();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany71();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode40();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker223();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness62();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor84();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem6();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode76();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber13();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance31();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber46();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker82();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName51();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime79();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker1.phoneNumber;
        com.github.javafaker.Address address8 = faker1.address();
        com.github.javafaker.Business business9 = faker1.business;
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness32();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany26();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress38();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook6();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook76();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor38();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, (int) 'a');
        java.util.stream.IntStream intStream6 = random1.ints(100L);
        long long7 = random1.nextLong();
        boolean boolean8 = random1.nextBoolean();
        java.util.stream.IntStream intStream9 = random1.ints();
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4961115982468162243L + "'", long7 == 4961115982468162243L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany7();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService72();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor65();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker33();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker7();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet15();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp47();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(app4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor4();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(app8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale153();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime23();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany32();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker38();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker57();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance2();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet7();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker209();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor30();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Hacker hacker6 = serializedObjectSupporter0.deserializeObjectHacker3();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.Address address6 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker1.phoneNumber;
        com.github.javafaker.Address address8 = faker1.address();
        com.github.javafaker.service.RandomService randomService9 = faker1.getrandomService();
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(randomService9);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService46();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor12();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker157();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime8();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService75();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker27();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp14();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance20();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet77();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService56();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName5();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness78();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale162();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(name3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber1();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber3();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor31();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook7();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber64();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale54();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker57();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber71();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet6();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom10();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(random7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness71();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService60();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker160();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance19();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor4();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Internet internet8 = serializedObjectSupporter0.deserializeObjectInternet77();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber4();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Internet internet11 = serializedObjectSupporter0.deserializeObjectInternet48();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(internet8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(internet11);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany84();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress55();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale14();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker22();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem80();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker215();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode23();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale165();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor64();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber59();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale44();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber39();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem22();
        com.github.javafaker.App app4 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker218();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(app4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance76();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker10();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker1();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber50();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime59();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder8 = builder0.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode72();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName43();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName16();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness64();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance30();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app2 = faker1.app();
        com.github.javafaker.Company company3 = faker1.company();
        com.github.javafaker.Hacker hacker4 = faker1.hacker;
        com.github.javafaker.service.RandomService randomService5 = faker1.randomService;
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(randomService5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp24();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(app11);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp39();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions42();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale100();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale134();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber46();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker82();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions84();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker117();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance57();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem;
        com.github.javafaker.Name name3 = faker1.name();
        com.github.javafaker.Lorem lorem4 = faker1.getlorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker1.getfakeValuesService();
        com.github.javafaker.Code code7 = faker1.code;
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook47();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions1();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker209();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker10();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions75();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale9();
        com.github.javafaker.Hacker hacker9 = serializedObjectSupporter0.deserializeObjectHacker35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp61();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(app6);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp47();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet53();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany64();
        com.github.javafaker.Finance finance11 = serializedObjectSupporter0.deserializeObjectFinance24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor71();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale163();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance30();
        com.github.javafaker.App app9 = serializedObjectSupporter0.deserializeObjectApp17();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(app9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber76();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance69();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker225();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress14();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber52();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber24();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(address6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp35();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom8();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(random9);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem12();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions16();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(options11);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale117();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale25();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale4();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress54();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker23();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker22();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber48();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale61();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker79();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("", "it-IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName66();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor53();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness32();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance85();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions61();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance17();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness76();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet38();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet35();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker13();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Hacker hacker3 = serializedObjectSupporter0.deserializeObjectHacker36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber70();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName41();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode20();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode23();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.util.Locale locale2 = new java.util.Locale("", "italiano");
        org.junit.Assert.assertEquals(locale2.toString(), "_ITALIANO");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker71();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker243();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale152();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker75();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker96();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker208();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(hacker10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder9 = builder0.setLanguageTag("it-IT");
        java.util.Locale.Builder builder10 = builder0.clear();
        java.util.Locale.Builder builder12 = builder10.setLanguage("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime16();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode10();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor74();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale15();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber28();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions81();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.Internet internet10 = serializedObjectSupporter0.deserializeObjectInternet24();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(internet10);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook74();
        com.github.javafaker.App app3 = serializedObjectSupporter0.deserializeObjectApp72();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(app3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Business business3 = faker1.business();
        com.github.javafaker.Name name4 = faker1.name;
        com.github.javafaker.Options options5 = faker1.options;
        com.github.javafaker.Code code6 = faker1.code();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Address address2 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService64();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(address2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet50();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance69();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany21();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress12();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker11();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale92();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(app10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime27();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany29();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet19();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions63();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale148();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness45();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName53();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany45();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber49();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker57();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor39();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet13, filteringMode14);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor40();
        com.github.javafaker.Address address6 = serializedObjectSupporter0.deserializeObjectAddress36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(address6);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale44();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber2();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker127();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(name5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale78();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker195();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale32();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker176();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor31();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber19();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook68();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker197();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp71();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet15();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker53();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress9();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem5();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp22();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker51();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker74();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet67();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet13();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName84();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions62();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker117();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem15();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Name name6 = serializedObjectSupporter0.deserializeObjectName16();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook83();
        com.github.javafaker.Address address8 = serializedObjectSupporter0.deserializeObjectAddress15();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(name6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(address8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor45();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions61();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker234();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale103();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress25();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Address address3 = serializedObjectSupporter0.deserializeObjectAddress43();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook43();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService74();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber23();
        com.github.javafaker.Name name7 = serializedObjectSupporter0.deserializeObjectName52();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(address3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(name7);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker117();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance57();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet76();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor10();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet60();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale148();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp21();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook83();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode79();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale11();
        com.github.javafaker.Company company12 = serializedObjectSupporter0.deserializeObjectCompany72();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNull(company12);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app2 = faker1.app();
        com.github.javafaker.Company company3 = faker1.company();
        com.github.javafaker.Hacker hacker4 = faker1.hacker;
        com.github.javafaker.App app5 = faker1.app();
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness36();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker150();
        com.github.javafaker.Address address12 = serializedObjectSupporter0.deserializeObjectAddress39();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany68();
        com.github.javafaker.Hacker hacker7 = serializedObjectSupporter0.deserializeObjectHacker77();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet34();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(internet5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Internet internet3 = serializedObjectSupporter0.deserializeObjectInternet50();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance69();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem74();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(internet3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode34();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker203();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles(0L);
        java.util.stream.LongStream longStream6 = random1.longs((long) ' ', (long) '4');
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Color color3 = faker1.getcolor();
        com.github.javafaker.Name name4 = faker1.name();
        com.github.javafaker.Internet internet5 = faker1.internet;
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.Company company7 = faker1.getcompany();
        com.github.javafaker.Book book8 = faker1.book;
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany32();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker38();
        com.github.javafaker.Name name5 = serializedObjectSupporter0.deserializeObjectName64();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(name5);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        com.github.javafaker.Internet internet9 = serializedObjectSupporter0.deserializeObjectInternet57();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp49();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany36();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions68();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker235();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor71();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor82();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress9();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(address7);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.Address address7 = serializedObjectSupporter0.deserializeObjectAddress17();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale126();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(address7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber64();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker246();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode74();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook76();
        com.github.javafaker.Hacker hacker10 = serializedObjectSupporter0.deserializeObjectHacker67();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker49();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook76();
        com.github.javafaker.App app10 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber38();
        com.github.javafaker.Hacker hacker12 = serializedObjectSupporter0.deserializeObjectHacker60();
        com.github.javafaker.Business business13 = serializedObjectSupporter0.deserializeObjectBusiness4();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(app10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet51();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale53();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(internet7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem82();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Name name10 = serializedObjectSupporter0.deserializeObjectName8();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNull(name10);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem85();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness61();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale154();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode59();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor82();
        com.github.javafaker.Internet internet11 = serializedObjectSupporter0.deserializeObjectInternet26();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(internet11);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor80();
        com.github.javafaker.Name name3 = serializedObjectSupporter0.deserializeObjectName3();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(name3);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor24();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany71();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber46();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.Locale locale1 = new java.util.Locale("");
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker247();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp37();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(app11);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet20();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Name name8 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness50();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker209();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(internet6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(name8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business2 = faker1.getbusiness();
        com.github.javafaker.Name name3 = faker1.name;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Business business6 = faker1.getbusiness();
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Name name4 = serializedObjectSupporter0.deserializeObjectName15();
        com.github.javafaker.Address address5 = serializedObjectSupporter0.deserializeObjectAddress38();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany27();
        com.github.javafaker.Internet internet7 = serializedObjectSupporter0.deserializeObjectInternet29();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(name4);
        org.junit.Assert.assertNull(address5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(internet7);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService66();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook69();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime62();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber77();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness35();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance20();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker37();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.App app6 = serializedObjectSupporter0.deserializeObjectApp62();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor4();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService77();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale11();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(app6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance82();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem70();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany11();
        com.github.javafaker.Hacker hacker5 = serializedObjectSupporter0.deserializeObjectHacker11();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany42();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Book book1 = serializedObjectSupporter0.deserializeObjectBook54();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor60();
        com.github.javafaker.Internet internet4 = serializedObjectSupporter0.deserializeObjectInternet78();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker200();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService85();
        com.github.javafaker.App app8 = serializedObjectSupporter0.deserializeObjectApp76();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService76();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime66();
        org.junit.Assert.assertNull(book1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(internet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(app8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker237();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress27();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp66();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook34();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService11();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale154();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Address address4 = serializedObjectSupporter0.deserializeObjectAddress48();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime41();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker219();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker147();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(address4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker106();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions83();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber27();
        com.github.javafaker.Finance finance11 = serializedObjectSupporter0.deserializeObjectFinance35();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.App app5 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany85();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany80();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(app5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale61();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker210();
        com.github.javafaker.App app7 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Hacker hacker8 = serializedObjectSupporter0.deserializeObjectHacker48();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale120();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(app7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet30();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany32();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker38();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem34();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker57();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance2();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness50();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Internet internet2 = serializedObjectSupporter0.deserializeObjectInternet71();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker107();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance27();
        com.github.javafaker.Internet internet5 = serializedObjectSupporter0.deserializeObjectInternet33();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook83();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor78();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode79();
        com.github.javafaker.App app11 = serializedObjectSupporter0.deserializeObjectApp75();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(internet2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(internet5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(app11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code1 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.App app2 = serializedObjectSupporter0.deserializeObjectApp20();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber4();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany78();
        com.github.javafaker.Internet internet6 = serializedObjectSupporter0.deserializeObjectInternet59();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNull(app2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(internet6);
    }
}

