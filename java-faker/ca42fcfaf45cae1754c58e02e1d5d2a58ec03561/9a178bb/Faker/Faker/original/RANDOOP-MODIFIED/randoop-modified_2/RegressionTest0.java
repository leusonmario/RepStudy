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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Random random3 = new java.util.Random((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setExtension('#', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Random random3 = new java.util.Random((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        java.util.Random random7 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream9 = random7.ints(1L);
        long long10 = random7.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale2, random7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-5015647950085110473L) + "'", long10 == (-5015647950085110473L));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("french", "fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: french [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale2.getUnicodeLocaleType("french");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: french");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
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
        java.util.Random random14 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        float float16 = random14.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale2, random14);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.72810113f + "'", float16 == 0.72810113f);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale2);
        java.util.Random random5 = new java.util.Random(10L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRENCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale8 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRENCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "french_FRENCH");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("fra-x-lvariant-kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fra-x-lvariant-kor [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("fra-x-lvariant-kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fra-x-lvariant-kor [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setScript("fra-x-lvariant-kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fra-x-lvariant-kor [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        boolean boolean4 = languageRange2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("Korean (South Korea)", "kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Korean (South Korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.0156479500851108E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=korean (south korea)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((double) (byte) 1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setRegion("French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_TW" + "'", str1, "zh_TW");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random1.longs((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Random random1 = new java.util.Random((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles(1.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (france)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('4', "Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        java.lang.Class<?> wildcardClass13 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale2.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        java.lang.Class<?> wildcardClass3 = random1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        float float6 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.44047195f + "'", float6 == 0.44047195f);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker0.resolve("french");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet4 = faker3.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker3.resolve("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker1.resolve("French");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setScript("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Korean (South Korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Canada", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random((-5015647950085110473L));
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setRegion("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setRegion("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("Canada");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Canada");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french");
        boolean boolean3 = languageRange1.equals((java.lang.Object) 0.72810113f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale.Builder builder15 = builder11.setLocale(locale13);
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale locale20 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale.Builder builder25 = builder21.setLocale(locale23);
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getISO3Language();
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale13, locale17, locale20, locale23, locale27 };
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.Locale locale32 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList30);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList30, filteringMode33);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList34, filteringMode35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode33.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList34);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode35.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("hi!", "Canada");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_tw");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french" + "'", str3, "french");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.Object obj5 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.addUnicodeLocaleAttribute("fra-x-lvariant-kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fra-x-lvariant-kor [at index 0]");
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
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.Object obj5 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('u', "French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number3 = faker2.number();
        com.github.javafaker.Lorem lorem4 = faker2.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker2.resolve("french");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random3.ints(10, (int) (short) 0);
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
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker2.resolve("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        java.lang.String str9 = faker6.bothify("fra-x-lvariant-kor");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker6.resolve("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra-x-lvariant-kor" + "'", str9, "fra-x-lvariant-kor");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (FRENCH)", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Random random1 = new java.util.Random(10L);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random1.nextBytes(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random1.doubles((long) 10, (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3, -70, -8]");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("french (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: french (FRENCH) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: French (France) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???(??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale16 = locale14.stripExtensions();
        boolean boolean17 = locale2.equals((java.lang.Object) locale14);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("und", "FRENCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coreano (Corea del Sud)" + "'", str3, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("kor", 1.2235660632835625d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.2235660632835625");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Cina", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("Korean");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Korean [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.Object obj5 = locale3.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "en_GB");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker3.resolve("French");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_tw");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale3.getDisplayCountry(locale5);
        java.lang.Object obj7 = locale5.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet4 = faker3.internet();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker3.phoneNumber();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale3.getDisplayCountry(locale5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("francese (Francia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=francese (francia)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Locale locale1 = new java.util.Locale("und");
        org.junit.Assert.assertEquals(locale1.toString(), "und");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: French (France) [at index 0]");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Locale locale1 = new java.util.Locale("kor");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Locale locale3 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for KOR");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(100L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.lang.Class<?> wildcardClass1 = filteringMode0.getClass();
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker2.resolve("fra-x-lvariant-kor");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreano" + "'", str2, "coreano");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreano (Corea del Sud)" + "'", str2, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setExtension('u', "coreano (Corea del Sud)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: coreano (Corea del Sud) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese (Francia)" + "'", str2, "francese (Francia)");
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Locale locale3 = new java.util.Locale("French", "", "zh");
        org.junit.Assert.assertEquals(locale3.toString(), "french__zh");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.LongStream longStream7 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs((long) (-1), (-1L), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("it");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        boolean boolean7 = languageRange1.equals((java.lang.Object) builder6);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Random random1 = new java.util.Random((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = random1.doubles((-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Random random1 = new java.util.Random(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem7 = faker6.lorem();
        com.github.javafaker.Finance finance8 = faker6.finance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension(' ', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
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
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Locale locale2 = new java.util.Locale("fra-x-lvariant-kor", "hi!");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra-x-lvariant-kor_HI!" + "'", str3, "fra-x-lvariant-kor_HI!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Locale locale1 = new java.util.Locale("Chinese");
        java.lang.String str2 = locale1.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setScript("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Korean (South Korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("Cina");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Cina [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Locale locale1 = new java.util.Locale("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean", (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguageTag("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
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
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random3.ints(10, (int) (short) 1);
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Business business3 = faker0.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker0.resolve("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1, (double) (short) 10);
        float float6 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random1.ints((int) 'u', (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.3483097f + "'", float6 == 0.3483097f);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setLanguageTag("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french(france)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Locale locale2 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french (france)_CANADA" + "'", str3, "french (france)_CANADA");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguageTag("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale locale1 = new java.util.Locale("Canada");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "canada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "canada" + "'", str2, "canada");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.String str13 = locale2.getCountry();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str17 = locale14.getDisplayScript();
        java.util.Random random19 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream21 = random19.ints(1L);
        long long22 = random19.nextLong();
        int int24 = random19.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale14, random19);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale2, random19);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "kor" + "'", str15, "kor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Korean (South Korea)" + "'", str16, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-5015647950085110473L) + "'", long22 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Random random1 = new java.util.Random(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs(0L, 100L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Random random1 = new java.util.Random(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Options options9 = faker8.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de_DE" + "'", str1, "de_DE");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale locale2 = new java.util.Locale("french", "de_DE");
        org.junit.Assert.assertEquals(locale2.toString(), "french_DE_DE");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("FRENCH", strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale.Builder builder16 = builder12.setLocale(locale14);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getISO3Language();
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getISO3Language();
        java.util.Locale.Builder builder26 = builder22.setLocale(locale24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getISO3Language();
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale14, locale18, locale21, locale24, locale28 };
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        java.util.Locale locale33 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList31);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("France");
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] { languageRange37 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray46 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList47, filteringMode49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, strMap54);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, strMap61);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, strMap66);
        java.util.Locale.Builder builder68 = new java.util.Locale.Builder();
        java.util.Locale locale70 = new java.util.Locale("");
        java.lang.String str71 = locale70.getISO3Language();
        java.util.Locale.Builder builder72 = builder68.setLocale(locale70);
        java.util.Locale locale74 = new java.util.Locale("");
        java.lang.String str75 = locale74.getISO3Language();
        java.util.Locale locale77 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder78 = new java.util.Locale.Builder();
        java.util.Locale locale80 = new java.util.Locale("");
        java.lang.String str81 = locale80.getISO3Language();
        java.util.Locale.Builder builder82 = builder78.setLocale(locale80);
        java.util.Locale locale84 = new java.util.Locale("");
        java.lang.String str85 = locale84.getISO3Language();
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale70, locale74, locale77, locale80, locale84 };
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.Locale locale89 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList87, filteringMode90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strSet57, filteringMode90);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strList50, filteringMode90);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList31, filteringMode90);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(localeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals(locale77.toString(), "hi!");
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertEquals(locale84.toString(), "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNull(locale89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode90.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(localeList95);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Random random1 = new java.util.Random(10L);
        float float2 = random1.nextFloat();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        double double4 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.73043025f + "'", float2 == 0.73043025f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4456342944175421d + "'", double4 == 0.4456342944175421d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        float float4 = random2.nextFloat();
        java.util.stream.IntStream intStream8 = random2.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream10 = random2.ints((long) 'x');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        java.lang.Class<?> wildcardClass12 = faker11.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.72810113f + "'", float4 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color();
        com.github.javafaker.Address address4 = faker2.address();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(address4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.String str11 = locale6.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh_TW" + "'", str11, "zh_TW");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((double) 10.0f, (double) 0.73043025f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Canada", 0.0d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("canada", "zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: canada [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.Builder builder21 = builder17.setLocale(locale19);
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getISO3Language();
        java.util.Locale.Builder builder31 = builder27.setLocale(locale29);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getISO3Language();
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale19, locale23, locale26, locale29, locale33 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList36, filteringMode39);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet6, filteringMode39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.parse("fra", strMap43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, strMap53);
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale locale57 = new java.util.Locale("");
        java.lang.String str58 = locale57.getISO3Language();
        java.util.Locale.Builder builder59 = builder55.setLocale(locale57);
        java.util.Locale locale61 = new java.util.Locale("");
        java.lang.String str62 = locale61.getISO3Language();
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale locale67 = new java.util.Locale("");
        java.lang.String str68 = locale67.getISO3Language();
        java.util.Locale.Builder builder69 = builder65.setLocale(locale67);
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getISO3Language();
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale57, locale61, locale64, locale67, locale71 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList74, filteringMode77);
        java.util.Locale locale79 = java.util.Locale.lookup(languageRangeList44, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList74);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNull(locale80);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale locale3 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str6 = locale5.getDisplayVariant();
        boolean boolean7 = locale3.equals((java.lang.Object) str6);
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.addUnicodeLocaleAttribute("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und", (double) 0L);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Locale locale1 = new java.util.Locale("Chinese");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Random random4 = new java.util.Random((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.Character> charSet8 = locale4.getExtensionKeys();
        boolean boolean9 = languageRange1.equals((java.lang.Object) charSet8);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Collection<java.lang.String> strCollection5 = null;
        java.lang.String str6 = java.util.Locale.lookupTag(languageRangeList4, strCollection5);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        java.util.stream.LongStream longStream7 = random1.longs((long) 10, (-4972683369271453960L), (long) (short) -1);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
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
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29, filteringMode32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap34);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??? (????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.Object obj7 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Finance finance5 = faker0.finance();
        java.lang.String str7 = faker0.numerify("Korean (South Korea)");
        com.github.javafaker.Business business8 = faker0.business();
        com.github.javafaker.Code code9 = faker0.code();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Korean (South Korea)" + "'", str7, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) (-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.9726833692714537E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        random1.setSeed((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random1.ints((long) ' ', (-1), (-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.24137181f, (double) (short) 1);
        java.lang.Class<?> wildcardClass5 = doubleStream4.getClass();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getDisplayName();
        java.util.Random random5 = new java.util.Random();
        random5.setSeed((long) 10);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale2, random5);
        boolean boolean9 = languageRange1.equals((java.lang.Object) random5);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French (France)" + "'", str4, "French (France)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.String str11 = locale6.getScript();
        java.lang.String str12 = locale6.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh_TW" + "'", str12, "zh_TW");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Locale locale3 = new java.util.Locale("Cina", "South Korea", "french");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: cina_SOUTH KOREA_french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cina_SOUTH KOREA_french");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setUnicodeLocaleKeyword("de_DE", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: de_DE [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.LongStream longStream5 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs((long) (byte) 10, (long) 'x', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
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
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getISO3Language();
        java.util.Locale.Builder builder43 = builder39.setLocale(locale41);
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getISO3Language();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getISO3Language();
        java.util.Locale.Builder builder53 = builder49.setLocale(locale51);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getISO3Language();
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale41, locale45, locale48, locale51, locale55 };
        java.util.ArrayList<java.util.Locale> localeList58 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList58, localeArray57);
        java.util.Locale locale60 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, strMap65);
        java.util.Locale.Builder builder67 = new java.util.Locale.Builder();
        java.util.Locale locale69 = new java.util.Locale("");
        java.lang.String str70 = locale69.getISO3Language();
        java.util.Locale.Builder builder71 = builder67.setLocale(locale69);
        java.util.Locale locale73 = new java.util.Locale("");
        java.lang.String str74 = locale73.getISO3Language();
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale locale79 = new java.util.Locale("");
        java.lang.String str80 = locale79.getISO3Language();
        java.util.Locale.Builder builder81 = builder77.setLocale(locale79);
        java.util.Locale locale83 = new java.util.Locale("");
        java.lang.String str84 = locale83.getISO3Language();
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale69, locale73, locale76, locale79, locale83 };
        java.util.ArrayList<java.util.Locale> localeList86 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList86, localeArray85);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.util.Locale>) localeList86);
        java.lang.String[] strArray90 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str94 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList91);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(localeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(localeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.LongStream longStream5 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random1.doubles((-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguage("french (france)_CANADA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: french (france)_CANADA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        boolean boolean3 = locale2.hasExtensions();
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "ko_KR");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("FRENCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FRENCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra-x-lvariant-kor_HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra-x-lvariant-kor_hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random(10L);
        java.util.stream.LongStream longStream3 = random2.longs();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles(100L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 100);
        java.util.stream.IntStream intStream7 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        double double7 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.35703205834598994d) + "'", double6 == (-0.35703205834598994d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5789646593242622d + "'", double7 == 0.5789646593242622d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("french (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: french (FRENCH)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh-CN [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setRegion("coreano (Corea del Sud)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: coreano (Corea del Sud) [at index 0]");
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
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder15.setLocale(locale17);
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getISO3Language();
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale7, locale11, locale14, locale17, locale21 };
        java.util.ArrayList<java.util.Locale> localeList24 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList24, localeArray23);
        java.util.Locale locale26 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap30);
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strMap42);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getISO3Language();
        java.util.Locale.Builder builder48 = builder44.setLocale(locale46);
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getISO3Language();
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder54 = new java.util.Locale.Builder();
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getISO3Language();
        java.util.Locale.Builder builder58 = builder54.setLocale(locale56);
        java.util.Locale locale60 = new java.util.Locale("");
        java.lang.String str61 = locale60.getISO3Language();
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale46, locale50, locale53, locale56, locale60 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.Locale locale65 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale.FilteringMode filteringMode66 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList67 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList63, filteringMode66);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strSet33, filteringMode66);
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet33);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(localeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(locale65);
        org.junit.Assert.assertTrue("'" + filteringMode66 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode66.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Random random0 = new java.util.Random();
        random0.setSeed((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random0.longs((long) 6, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale6.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Random random9 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        int int12 = random9.nextInt(10);
        java.util.stream.DoubleStream doubleStream13 = random9.doubles();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale7, random9);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale2, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese", (double) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=7.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayScript();
        boolean boolean5 = locale0.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        java.util.stream.IntStream intStream9 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random1.doubles((long) (short) -1, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Random random1 = new java.util.Random(10L);
        long long2 = random1.nextLong();
        boolean boolean3 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        boolean boolean11 = random1.nextBoolean();
        double double12 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random1.doubles((long) 'x', 0.5789646593242622d, (double) 13);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.8673886034754649d) + "'", double12 == (-0.8673886034754649d));
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        int int8 = random1.nextInt();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1167796541) + "'", int8 == (-1167796541));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles(0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale locale1 = new java.util.Locale("zh-CN");
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream8 = random3.doubles(1L);
        java.util.stream.LongStream longStream11 = random3.longs((long) '#', 100L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean (South Korea)", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=korean (south korea)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((double) (short) 10, (double) 0.24137181f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6659570968355509d + "'", double7 == 0.6659570968355509d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "kor", "");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_KOR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinese_KOR" + "'", str4, "chinese_KOR");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.addUnicodeLocaleAttribute("French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.LongStream longStream5 = random1.longs();
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            random1.nextBytes(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.util.stream.IntStream intStream14 = random5.ints((long) ' ');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.24137181f + "'", float12 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        java.util.stream.IntStream intStream7 = random1.ints((long) 100);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Address address4 = faker2.address();
        com.github.javafaker.Finance finance5 = faker2.finance();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        java.util.stream.IntStream intStream9 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((long) ' ', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        float float10 = random1.nextFloat();
        java.util.stream.IntStream intStream11 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random1.doubles((long) (short) 0, (double) 0L, (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.24137181f + "'", float10 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        boolean boolean8 = locale2.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale2.getUnicodeLocaleType("Korean");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Korean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        int int5 = random1.nextInt((int) '#');
        double double6 = random1.nextDouble();
        long long7 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6659570968355509d + "'", double6 == 0.6659570968355509d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-2085682583702141179L) + "'", long7 == (-2085682583702141179L));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Name name4 = faker2.name();
        com.github.javafaker.Code code5 = faker2.code();
        com.github.javafaker.Address address6 = faker2.address();
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Address address5 = faker0.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("francese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "kor", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for KOR");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_KOR");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        java.lang.String str9 = faker7.bothify("Korean (South Korea)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Korean (South Korea)" + "'", str9, "Korean (South Korea)");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (france)_CANADA", (double) 0.44047195f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (france)_canada");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) (byte) 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.lang.String str7 = locale2.getDisplayLanguage(locale6);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRENCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH" + "'", str4, "FRENCH");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "french" + "'", str7, "french");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = locale8.getDisplayVariant(locale13);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.Random random6 = new java.util.Random(10L);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random6.nextBytes(byteArray12);
        random1.nextBytes(byteArray12);
        java.util.stream.LongStream longStream17 = random1.longs(0L, (long) 13);
        java.util.stream.DoubleStream doubleStream19 = random1.doubles(0L);
        byte[] byteArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            random1.nextBytes(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(doubleStream19);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setVariant("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        java.lang.String str7 = locale0.getDisplayName(locale5);
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale8.getISO3Language();
        java.lang.String str10 = locale0.getDisplayCountry(locale8);
        java.util.Set<java.lang.String> strSet11 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "France" + "'", str1, "France");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (France)" + "'", str7, "French (France)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Locale locale2 = new java.util.Locale("fra", "fra");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FRA");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Random random0 = new java.util.Random();
        random0.setSeed((long) 10);
        double double3 = random0.nextGaussian();
        random0.setSeed((-2085682583702141179L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8746788966462123d + "'", double3 == 0.8746788966462123d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale5.getDisplayLanguage();
        boolean boolean8 = languageRange2.equals((java.lang.Object) str7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getISO3Language();
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder15.setLocale(locale17);
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getISO3Language();
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale7, locale11, locale14, locale17, locale21 };
        java.util.ArrayList<java.util.Locale> localeList24 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList24, localeArray23);
        java.util.Locale locale26 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getISO3Language();
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.String str31 = locale28.getDisplayLanguage(locale30);
        java.util.Set<java.lang.String> strSet32 = locale28.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, strMap43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale locale52 = new java.util.Locale("");
        java.lang.String str53 = locale52.getISO3Language();
        java.util.Locale.Builder builder54 = builder50.setLocale(locale52);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getISO3Language();
        java.util.Locale locale59 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder60 = new java.util.Locale.Builder();
        java.util.Locale locale62 = new java.util.Locale("");
        java.lang.String str63 = locale62.getISO3Language();
        java.util.Locale.Builder builder64 = builder60.setLocale(locale62);
        java.util.Locale locale66 = new java.util.Locale("");
        java.lang.String str67 = locale66.getISO3Language();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale52, locale56, locale59, locale62, locale66 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale locale71 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList69, filteringMode72);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strSet39, filteringMode72);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet32, filteringMode72);
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet77 = locale76.getUnicodeLocaleKeys();
        java.lang.String str78 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet77);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(localeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Book book10 = faker9.book();
        com.github.javafaker.Number number11 = faker9.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.util.Random random10 = new java.util.Random((-1L));
        boolean boolean11 = locale1.equals((java.lang.Object) random10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.lang.String str7 = locale2.getDisplayLanguage(locale6);
        java.lang.Object obj8 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH" + "'", str4, "FRENCH");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "french" + "'", str7, "french");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "french_FRENCH");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "french_FRENCH");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        com.github.javafaker.Finance finance13 = faker12.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(finance13);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FRENCH (FRENCH)", (double) (-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.167796541E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        float float9 = random3.nextFloat();
        int int10 = random3.nextInt();
        java.lang.Class<?> wildcardClass11 = random3.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.6659571f + "'", float9 == 0.6659571f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1036684082 + "'", int10 == 1036684082);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((long) 13, (-2085682583702141179L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRA" + "'", str8, "FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Company company5 = faker1.company();
        com.github.javafaker.Address address6 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Random random1 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker2.resolve("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale.Builder builder8 = builder2.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("Coreano (FRENCH (FRENCH))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Coreano (FRENCH (FRENCH)) [at index 0]");
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
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Locale locale3 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category4, locale10);
        java.lang.String str12 = locale3.getDisplayCountry(locale10);
        java.lang.String str13 = locale10.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale7.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "it_IT" + "'", str13, "it_IT");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u97d3\u56fd\u8a9e\u5927\u97d3\u6c11\u56fd)", (double) 0.73043025f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??? (????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Color color6 = faker1.color();
        java.lang.Class<?> wildcardClass7 = faker1.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale7 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.lang.String str10 = locale7.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale7.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra_KOR_France" + "'", str10, "fra_KOR_France");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream3 = random1.ints((long) 100);
        java.lang.Class<?> wildcardClass4 = intStream3.getClass();
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("french (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: french (FRENCH) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        random1.setSeed((long) (short) 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Random random1 = new java.util.Random((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((-0.14158131146144248d), (double) (-5123059410709186348L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale.setDefault(category0, locale8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Business business4 = faker0.business();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Name name4 = faker0.name();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Locale locale2 = new java.util.Locale("fra", "fra");
        java.util.Locale locale5 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.lang.Class<?> wildcardClass7 = locale5.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FRA");
        org.junit.Assert.assertEquals(locale5.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = locale9.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "kor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        com.github.javafaker.Finance finance10 = faker2.finance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc911\uad6d\uc5b4", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Locale locale2 = new java.util.Locale("\uc911\uad6d\uc5b4", "francese");
        org.junit.Assert.assertEquals(locale2.toString(), "\uc911\uad6d\uc5b4_FRANCESE");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder2.setLanguage("Korean");
        java.util.Locale.Builder builder8 = builder6.setVariant("french");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        com.github.javafaker.Code code5 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        float float2 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = random1.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.22278214f + "'", float2 == 0.22278214f);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        random1.setSeed((long) (short) 10);
        int int10 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1157793070) + "'", int10 == (-1157793070));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) 32);
        java.lang.Class<?> wildcardClass11 = random1.getClass();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        boolean boolean8 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        java.util.Locale locale6 = locale2.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale6.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder15.setLocale(locale17);
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getISO3Language();
        java.util.Locale locale24 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getISO3Language();
        java.util.Locale.Builder builder29 = builder25.setLocale(locale27);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getISO3Language();
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale17, locale21, locale24, locale27, locale31 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList34, filteringMode37);
        java.util.Locale locale39 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList38);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale24.toString(), "hi!");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNull(locale39);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.DateAndTime dateAndTime9 = faker2.date();
        java.lang.String str11 = faker2.letterify("\uc911\uad6d\uc5b4\ub300\ub9cc)");
        java.lang.String str13 = faker2.letterify("fra-x-lvariant-kor_HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str11, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fra-x-lvariant-kor_HI!" + "'", str13, "fra-x-lvariant-kor_HI!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = random1.nextInt((-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh-TW");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Locale locale1 = new java.util.Locale("francese (Francia)");
        org.junit.Assert.assertEquals(locale1.toString(), "francese (francia)");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.LongStream longStream3 = random1.longs((long) 0);
        java.util.Random random5 = new java.util.Random(10L);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        random5.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        java.util.stream.IntStream intStream17 = random1.ints((long) (short) 0, (-1), (int) (short) 0);
        int int19 = random1.nextInt(1036684082);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-46, 122, -3, -70, -8]");
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 553627293 + "'", int19 == 553627293);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime4 = faker3.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str2, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setScript("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "ko_KR");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("jpn");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        java.lang.String str9 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setVariant("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Chinese (China) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
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
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getISO3Language();
        java.util.Locale.Builder builder43 = builder39.setLocale(locale41);
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getISO3Language();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getISO3Language();
        java.util.Locale.Builder builder53 = builder49.setLocale(locale51);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getISO3Language();
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale41, locale45, locale48, locale51, locale55 };
        java.util.ArrayList<java.util.Locale> localeList58 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList58, localeArray57);
        java.util.Locale locale60 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.Locale locale64 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet65);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(localeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertEquals(locale64.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strList66);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.String str22 = locale16.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh" + "'", str22, "zh");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.IntStream intStream3 = random1.ints((long) 100);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(0.0d, 0.5789646593242622d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random1.longs((long) (byte) -1, (long) (short) 10, (-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean (South Korea)", 1.7709984181344616d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.7709984181344616");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("coreano (Corea del Sud)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=coreano (corea del sud)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.util.Random random24 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random24);
        java.util.stream.LongStream longStream26 = random24.longs();
        java.util.stream.IntStream intStream30 = random24.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        double double31 = random24.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(locale17, random24);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
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
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.2235660632835625d + "'", double31 == 1.2235660632835625d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("France");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("fra");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray12 = new java.lang.String[] { "kor", "fra", "kor", "French", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getISO3Language();
        java.util.Locale.Builder builder38 = builder34.setLocale(locale36);
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getISO3Language();
        java.util.Locale locale43 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getISO3Language();
        java.util.Locale.Builder builder48 = builder44.setLocale(locale46);
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getISO3Language();
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale36, locale40, locale43, locale46, locale50 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale locale55 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList53, filteringMode56);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet23, filteringMode56);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList16, filteringMode56);
        java.util.Locale locale63 = new java.util.Locale("fra", "kor", "France");
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode65 = null;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet64, filteringMode65);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode15.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale43.toString(), "hi!");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode56.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertEquals(locale63.toString(), "fra_KOR_France");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strList66);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        int int7 = random5.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1167796541) + "'", int7 == (-1167796541));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale4.getISO3Language();
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale.Builder builder8 = builder2.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("fra_KOR_France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fra_KOR_France [at index 0]");
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        float float6 = random1.nextFloat();
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.44047195f + "'", float6 == 0.44047195f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (china)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setExtension(' ', "ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.Builder builder21 = builder17.setLocale(locale19);
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale locale26 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getISO3Language();
        java.util.Locale.Builder builder31 = builder27.setLocale(locale29);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getISO3Language();
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale19, locale23, locale26, locale29, locale33 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList36, filteringMode39);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet6, filteringMode39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.parse("fra", strMap43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, strMap53);
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale locale57 = new java.util.Locale("");
        java.lang.String str58 = locale57.getISO3Language();
        java.util.Locale.Builder builder59 = builder55.setLocale(locale57);
        java.util.Locale locale61 = new java.util.Locale("");
        java.lang.String str62 = locale61.getISO3Language();
        java.util.Locale locale64 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale locale67 = new java.util.Locale("");
        java.lang.String str68 = locale67.getISO3Language();
        java.util.Locale.Builder builder69 = builder65.setLocale(locale67);
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getISO3Language();
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale57, locale61, locale64, locale67, locale71 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList74, filteringMode77);
        java.util.Locale locale79 = java.util.Locale.lookup(languageRangeList44, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList74);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNotNull(localeList80);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream9 = random1.ints((long) 'x');
        boolean boolean10 = random1.nextBoolean();
        java.util.stream.LongStream longStream13 = random1.longs((-2085682583702141179L), 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0);
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Random random1 = new java.util.Random((long) 7);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 1, (double) (short) 10);
        float float6 = random1.nextFloat();
        random1.setSeed((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random1.ints((long) '#', 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8452060657049847d + "'", double2 == 0.8452060657049847d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.3483097f + "'", float6 == 0.3483097f);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.lang.Class<?> wildcardClass2 = random1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fra-France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("ko");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ko [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Locale locale1 = new java.util.Locale("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("francese (Francia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: francese (Francia)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        java.lang.String str4 = faker2.letterify("hi!");
        com.github.javafaker.Finance finance5 = faker2.finance();
        com.github.javafaker.Book book6 = faker2.book();
        com.github.javafaker.Address address7 = faker2.address();
        boolean boolean8 = languageRange1.equals((java.lang.Object) address7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker1.resolve("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("francese (Francia)", (double) 1708368258);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.708368258E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
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
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh_tw_CHINESE_Chinese could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (-1157793070), (double) 0.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Locale locale1 = new java.util.Locale("it_IT");
        org.junit.Assert.assertEquals(locale1.toString(), "it_it");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
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
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29, filteringMode32);
        java.util.Collection<java.lang.String> strCollection34 = null;
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap36);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeList37);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles((-5123059410709186348L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.getVariant();
        java.util.Random random8 = new java.util.Random((long) 'u');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Locale locale2 = new java.util.Locale("und", "eng");
        org.junit.Assert.assertEquals(locale2.toString(), "und_ENG");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.24137181f, (double) (short) 1);
        java.util.stream.IntStream intStream5 = random1.ints();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        random1.setSeed((long) 1);
        java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 1);
        boolean boolean11 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random1.longs((long) (short) 1, (long) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale3 = new java.util.Locale("Chinese");
        java.lang.String str4 = locale0.getDisplayName(locale3);
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getISO3Language();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale8.getScript();
        java.util.Locale.setDefault(category5, locale8);
        java.util.Locale locale13 = java.util.Locale.getDefault(category5);
        java.util.Locale locale14 = java.util.Locale.getDefault(category5);
        boolean boolean15 = locale0.equals((java.lang.Object) category5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals(locale3.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (Taiwan)" + "'", str4, "Chinese (Taiwan)");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.24137181f, (double) (short) 1);
        long long5 = random1.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles(0.8452060657049847d, (double) 0.6659571f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4972683369271453960L) + "'", long5 == (-4972683369271453960L));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        float float5 = random1.nextFloat();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        com.github.javafaker.Business business8 = faker6.business();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.44047195f + "'", float5 == 0.44047195f);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        java.lang.String str9 = faker2.bothify("zh-TW");
        com.github.javafaker.Address address10 = faker2.address();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("french (french)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: french (french) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setVariant("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ko-KR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc911\uad6d\uc5b4\ub300\ub9cc)", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.Locale locale3 = new java.util.Locale("fra-x-lvariant-kor", "zh", "Coreano (FRENCH (FRENCH))");
        java.util.Random random5 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream10 = random5.doubles(1L);
        random5.setSeed((long) 1);
        java.util.stream.DoubleStream doubleStream14 = random5.doubles((long) 32);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra-x-lvariant-kor_ZH_Coreano (FRENCH (FRENCH)) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra-x-lvariant-kor_ZH_Coreano (FRENCH (FRENCH))");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Random random1 = new java.util.Random((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints(0L, (int) (short) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale7.getScript();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Locale.Builder builder15 = builder11.setLocale(locale13);
        java.lang.String str16 = locale13.getISO3Country();
        java.lang.String str17 = locale7.getDisplayLanguage(locale13);
        java.lang.String str18 = locale7.getCountry();
        java.lang.String str19 = locale3.getDisplayCountry(locale7);
        java.lang.String str20 = locale1.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale7);
        java.lang.String str23 = locale7.getExtension('a');
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "South Korea" + "'", str19, "South Korea");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Address address8 = faker2.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker2.resolve("und");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRENCH");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        java.lang.String str6 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.util.Random random8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale3, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.bothify("French");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French" + "'", str3, "French");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.24137181f, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random1.doubles((double) 0.44047195f, 0.22278216143339702d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        java.lang.String str22 = locale16.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra_KOR_France", (double) 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=38.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale2 = new java.util.Locale("France");
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: French (France)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRA");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Random random4 = new java.util.Random(10L);
        java.util.stream.LongStream longStream5 = random4.longs();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles(100L);
        int int8 = random4.nextInt();
        boolean boolean9 = languageRange1.equals((java.lang.Object) random4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FRENCH (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french(french)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Random random1 = new java.util.Random((long) 7);
        random1.setSeed((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random1.ints(0L, (int) 'a', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getISO3Language();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Finance finance5 = faker0.finance();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = faker17.resolve("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale2);
        java.lang.String str18 = locale2.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ko_KR" + "'", str18, "ko_KR");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        double double8 = random1.nextGaussian();
        double double9 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random1.longs((long) (short) 1, (long) 1036684082, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2235660632835625d + "'", double8 == 1.2235660632835625d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8869349148715235d + "'", double9 == 0.8869349148715235d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TWN", (double) 1L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.Random random1 = new java.util.Random((long) 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random1.longs((long) 1036684082, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = random1.longs((-5123059410709186348L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextGaussian();
        java.util.stream.IntStream intStream2 = random0.ints();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3068466606213818d) + "'", double1 == (-1.3068466606213818d));
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        boolean boolean2 = locale0.hasExtensions();
        java.lang.String str3 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
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
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getISO3Language();
        java.util.Locale.Builder builder43 = builder39.setLocale(locale41);
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getISO3Language();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getISO3Language();
        java.util.Locale.Builder builder53 = builder49.setLocale(locale51);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getISO3Language();
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale41, locale45, locale48, locale51, locale55 };
        java.util.ArrayList<java.util.Locale> localeList58 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList58, localeArray57);
        java.util.Locale locale60 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.Collection<java.lang.String> strCollection62 = null;
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection62);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(localeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Locale locale2 = new java.util.Locale("french", "fra");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        java.lang.Object obj9 = locale5.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRA" + "'", str8, "FRA");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "zh_TW");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Locale locale1 = new java.util.Locale("FRENCH (FRENCH)");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale1.getDisplayName(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        java.util.Random random8 = new java.util.Random((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french (french) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "french (french)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "french (french)" + "'", str5, "french (french)");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko" + "'", str3, "ko");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.lang.String str9 = locale0.getDisplayLanguage(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale6.getUnicodeLocaleType("coreano (Corea del Sud)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: coreano (Corea del Sud)");
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
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        random3.setSeed((long) 10);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        java.lang.String str9 = faker6.letterify("\uc911\uad6d\uc5b4\ub300\ub9cc)");
        com.github.javafaker.Finance finance10 = faker6.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (France)" + "'", str2, "French (France)");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str9, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream2 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((long) (byte) 10, 1891812663, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("zh", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setVariant("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???????? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Locale locale2 = new java.util.Locale("Canada", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "canada");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Options options3 = faker1.options();
        com.github.javafaker.Lorem lorem4 = faker1.lorem();
        com.github.javafaker.Internet internet5 = faker1.internet();
        com.github.javafaker.Business business6 = faker1.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "Chinese", "Chinese");
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.util.Random random9 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) 0.24137181f, (double) (short) 1);
        double double13 = random9.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale3, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh_tw_CHINESE_Chinese could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_CHINESE_Chinese");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7304302967434272d + "'", double13 == 0.7304302967434272d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Locale locale3 = new java.util.Locale("fra", "und", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Random random6 = new java.util.Random((long) 7);
        java.util.stream.DoubleStream doubleStream8 = random6.doubles((long) 10);
        java.util.stream.IntStream intStream12 = random6.ints((long) '#', (int) (short) 1, (int) (byte) 10);
        java.util.stream.LongStream longStream15 = random6.longs((long) (short) 10, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale3, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_UND could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_UND");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Cina", (double) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=6.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Locale locale2 = new java.util.Locale("french", "fra-x-lvariant-kor");
        java.lang.String str4 = locale2.getExtension('u');
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale2.getScript();
        java.util.Random random8 = new java.util.Random((long) 0);
        boolean boolean9 = random8.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRA-X-LVARIANT-KOR could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRA-X-LVARIANT-KOR");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA-X-LVARIANT-KOR" + "'", str5, "FRA-X-LVARIANT-KOR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        java.lang.String str10 = faker2.bothify("Korean (South Korea)");
        com.github.javafaker.Internet internet11 = faker2.internet();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean (South Korea)" + "'", str10, "Korean (South Korea)");
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale locale2 = new java.util.Locale("und", "zh");
        java.lang.String str3 = locale2.getScript();
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "und_ZH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "und_ZH");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "und_ZH");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "und_ZH");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.LongStream longStream7 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = random1.nextInt((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Business business8 = faker2.business();
        com.github.javafaker.Color color9 = faker2.color();
        java.lang.String str11 = faker2.bothify("Canada");
        com.github.javafaker.Address address12 = faker2.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker2.resolve("French (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canada" + "'", str11, "Canada");
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        float float4 = random2.nextFloat();
        java.util.stream.IntStream intStream8 = random2.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream10 = random2.ints((long) 'x');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Name name12 = faker11.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.72810113f + "'", float4 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("ko_KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ko_KR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.IntStream intStream8 = random1.ints(100L);
        float float9 = random1.nextFloat();
        java.util.stream.LongStream longStream12 = random1.longs((-4972683369271453960L), (long) 0);
        float float13 = random1.nextFloat();
        java.lang.Class<?> wildcardClass14 = random1.getClass();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.72810113f + "'", float9 == 0.72810113f);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.44047195f + "'", float13 == 0.44047195f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italy" + "'", str2, "Italy");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Color color4 = faker2.color();
        com.github.javafaker.Book book5 = faker2.book();
        com.github.javafaker.Internet internet6 = faker2.internet();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        com.github.javafaker.Options options8 = faker2.options();
        com.github.javafaker.Color color9 = faker2.color();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale18 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale18);
        java.util.Locale.setDefault(category15, locale18);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category15, locale21);
        java.lang.String str23 = locale21.getDisplayVariant();
        java.lang.String str24 = locale11.getDisplayName(locale21);
        java.util.Random random26 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random26);
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream31 = random26.doubles(1L);
        random26.setSeed((long) 1);
        java.util.stream.LongStream longStream35 = random26.longs((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream36 = random26.doubles();
        boolean boolean37 = locale11.equals((java.lang.Object) doubleStream36);
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
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale18.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(longStream35);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "french_FRENCH");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker8.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.phoneNumber();
        java.lang.String str7 = faker1.bothify("fra");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder4.setUnicodeLocaleKeyword("fra_KOR_France", "\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fra_KOR_France [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Business business5 = faker1.business();
        java.lang.String str7 = faker1.bothify("CHN");
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker1.resolve("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CHN" + "'", str7, "CHN");
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        boolean boolean5 = locale2.hasExtensions();
        java.util.Random random7 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream9 = random7.ints(1L);
        int int11 = random7.nextInt((int) '#');
        java.util.stream.DoubleStream doubleStream13 = random7.doubles((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale2, random7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        random1.setSeed((-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.35703205834598994d) + "'", double6 == (-0.35703205834598994d));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
            java.util.stream.IntStream intStream16 = random1.ints((long) 1, 1036684082, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinese_KOR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese_kor");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale locale2 = new java.util.Locale("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)", "zh-CN");
        org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)_ZH-CN");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale2.getDisplayCountry(locale7);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.IntStream intStream2 = random1.ints();
        random1.setSeed((long) 7);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(category0, locale6);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
        com.github.javafaker.DateAndTime dateAndTime9 = faker8.date();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker8.resolve("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale3.toString(), "french_FRENCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Locale locale2 = new java.util.Locale("fra", "fra");
        java.util.Locale locale5 = new java.util.Locale("French (France)", "Canada");
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale5.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for CANADA");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FRA");
        org.junit.Assert.assertEquals(locale5.toString(), "french (france)_CANADA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("french (FRENCH)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french(french)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
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
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getISO3Language();
        java.util.Locale.Builder builder43 = builder39.setLocale(locale41);
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getISO3Language();
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getISO3Language();
        java.util.Locale.Builder builder53 = builder49.setLocale(locale51);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getISO3Language();
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale41, locale45, locale48, locale51, locale55 };
        java.util.ArrayList<java.util.Locale> localeList58 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList58, localeArray57);
        java.util.Locale locale60 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, strMap65);
        java.util.Locale.Builder builder67 = new java.util.Locale.Builder();
        java.util.Locale locale69 = new java.util.Locale("");
        java.lang.String str70 = locale69.getISO3Language();
        java.util.Locale.Builder builder71 = builder67.setLocale(locale69);
        java.util.Locale locale73 = new java.util.Locale("");
        java.lang.String str74 = locale73.getISO3Language();
        java.util.Locale locale76 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale locale79 = new java.util.Locale("");
        java.lang.String str80 = locale79.getISO3Language();
        java.util.Locale.Builder builder81 = builder77.setLocale(locale79);
        java.util.Locale locale83 = new java.util.Locale("");
        java.lang.String str84 = locale83.getISO3Language();
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale69, locale73, locale76, locale79, locale83 };
        java.util.ArrayList<java.util.Locale> localeList86 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList86, localeArray85);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList86);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(localeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(localeList61);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals(locale76.toString(), "hi!");
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(localeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNotNull(localeList89);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setVariant("GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setVariant("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese" + "'", str1, "cinese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "coreano (Corea del Sud)" + "'", str4, "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str16, "\uc911\uad6d\uc5b4");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_CN" + "'", str3, "zh_CN");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) 'u');
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 1, (double) 6, (double) 553627293);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random1.longs((long) '4', (long) 32, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRENCH", strMap1);
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
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, strMap38);
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getISO3Language();
        java.util.Locale.Builder builder44 = builder40.setLocale(locale42);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getISO3Language();
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale locale52 = new java.util.Locale("");
        java.lang.String str53 = locale52.getISO3Language();
        java.util.Locale.Builder builder54 = builder50.setLocale(locale52);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getISO3Language();
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale42, locale46, locale49, locale52, locale56 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale locale61 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList59, filteringMode62);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, strMap67);
        java.util.Locale.Builder builder69 = new java.util.Locale.Builder();
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getISO3Language();
        java.util.Locale.Builder builder73 = builder69.setLocale(locale71);
        java.util.Locale locale75 = new java.util.Locale("");
        java.lang.String str76 = locale75.getISO3Language();
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder79 = new java.util.Locale.Builder();
        java.util.Locale locale81 = new java.util.Locale("");
        java.lang.String str82 = locale81.getISO3Language();
        java.util.Locale.Builder builder83 = builder79.setLocale(locale81);
        java.util.Locale locale85 = new java.util.Locale("");
        java.lang.String str86 = locale85.getISO3Language();
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale71, locale75, locale78, locale81, locale85 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap94 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList95 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap94);
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
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(locale61);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertEquals(locale85.toString(), "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(languageRangeList95);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        float float9 = random3.nextFloat();
        int int10 = random3.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random3.longs((long) (short) -1, 1L, (-5785953002346952466L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.6659571f + "'", float9 == 0.6659571f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1036684082 + "'", int10 == 1036684082);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str2, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u97e9\u56fd" + "'", str5, "\u97e9\u56fd");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("French (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", (double) (short) 1);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale locale6 = new java.util.Locale("fra", "fra");
        boolean boolean7 = languageRange2.equals((java.lang.Object) "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french" + "'", str3, "french");
        org.junit.Assert.assertEquals(locale6.toString(), "fra_FRA");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        boolean boolean2 = locale0.hasExtensions();
        java.lang.String str3 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str3, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Random random1 = new java.util.Random((-5015647950085110473L));
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream5 = random1.ints((int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random1.nextInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        long long7 = random1.nextLong();
        int int8 = random1.nextInt();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-5015647950085110473L) + "'", long7 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1434703326) + "'", int8 == (-1434703326));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("English");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("zh", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it_IT [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Locale locale2 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.lang.String str7 = locale2.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getScript();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.util.Random random15 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        int int18 = random15.nextInt(10);
        java.util.stream.DoubleStream doubleStream19 = random15.doubles();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale13, random15);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale9, random15);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale6, random15);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_FRENCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH" + "'", str4, "FRENCH");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "french" + "'", str7, "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Korean (South Korea)" + "'", str11, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(doubleStream19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("kor");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder10 = builder6.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ko-KR [at index 0]");
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
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        com.github.javafaker.PhoneNumber phoneNumber12 = faker11.phoneNumber();
        com.github.javafaker.Options options13 = faker11.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(options13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Locale locale3 = new java.util.Locale("fra", "hi!", "kor");
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.lang.String str10 = locale7.getScript();
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale12 = java.util.Locale.getDefault(category4);
        java.lang.String str13 = locale3.getDisplayScript(locale12);
        java.lang.String str14 = locale12.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_HI!_kor");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.getScript();
        java.lang.String str7 = locale3.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getDisplayVariant(locale3);
        java.util.Set<java.lang.String> strSet10 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        java.util.Set<java.lang.Character> charSet12 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.lang.String str8 = locale5.getCountry();
        java.lang.String str9 = locale5.getLanguage();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale14 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale10.getLanguage();
        java.lang.String str19 = locale5.getDisplayCountry(locale10);
        java.lang.String str20 = locale0.getDisplayCountry(locale10);
        java.lang.String str21 = locale10.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals(locale14.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "french (FRENCH)" + "'", str16, "french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr" + "'", str21, "fr");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Coreano (FRENCH (FRENCH))", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=coreano(french(french))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 100, (int) (short) 0, (int) (short) 10);
        double double8 = random1.nextGaussian();
        double double9 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random1.doubles((-4972683369271453960L), 0.2413718236526089d, (-0.35703205834598994d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2235660632835625d + "'", double8 == 1.2235660632835625d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8869349148715235d + "'", double9 == 0.8869349148715235d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = faker1.numerify("zh_TW");
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker1.phoneNumber();
        com.github.javafaker.Internet internet6 = faker1.internet();
        com.github.javafaker.Internet internet7 = faker1.internet();
        java.lang.String str9 = faker1.bothify("ko-KR");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ko-KR" + "'", str9, "ko-KR");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles(1L);
        double double7 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7281011855672591d + "'", double7 == 0.7281011855672591d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Random random1 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream3 = random1.ints(1L);
        int int5 = random1.nextInt((int) '#');
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((long) (short) 100);
        java.util.stream.IntStream intStream11 = random1.ints(0L, (int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        float float5 = random3.nextFloat();
        int int7 = random3.nextInt((int) '#');
        double double8 = random3.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.72810113f + "'", float5 == 0.72810113f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6659570968355509d + "'", double8 == 0.6659570968355509d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("South Korea");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.lang.String str8 = locale5.getCountry();
        java.lang.String str9 = locale5.getLanguage();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale14 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale10.getLanguage();
        java.lang.String str19 = locale5.getDisplayCountry(locale10);
        java.lang.String str20 = locale0.getDisplayCountry(locale10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals(locale14.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "french (FRENCH)" + "'", str16, "french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Number number7 = faker2.number();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("cinese", (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.0156479500851108E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french (FRENCH)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (french)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale11.getDisplayVariant(locale15);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale11);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ja" + "'", str16, "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("french");
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getISO3Language();
        java.util.Locale.Builder builder14 = builder10.setLocale(locale12);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale.Builder builder19 = builder15.setLocale(locale17);
        java.lang.String str20 = locale12.getDisplayCountry(locale17);
        java.lang.String str21 = locale12.getLanguage();
        java.lang.String str22 = locale8.getDisplayVariant(locale12);
        java.util.Locale.Builder builder23 = builder0.setLocale(locale12);
        java.util.Locale locale26 = new java.util.Locale("kor", "french (FRENCH)");
        java.lang.String str27 = locale26.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder0.setLocale(locale26);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRENCH (FRENCH) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals(locale26.toString(), "kor_FRENCH (FRENCH)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "FRENCH (FRENCH)" + "'", str27, "FRENCH (FRENCH)");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Random random3 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) (byte) 1);
        long long7 = random3.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random3);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random3);
        java.util.stream.LongStream longStream11 = random3.longs(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random3.doubles(1.1329921492850181d, (double) 1.0f);
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
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('u', "Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setVariant("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french (FRENCH)", (double) 0.72810113f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french (french)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random4.ints(1708368258, (-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.72810113f + "'", float6 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.44047195711667986d + "'", double12 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.24137181f + "'", float13 == 0.24137181f);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Name name5 = faker0.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream9 = random1.ints((long) 'x');
        float float10 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.44047195f + "'", float10 == 0.44047195f);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Random random1 = new java.util.Random((long) 7);
        long long2 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4967725919621401576L) + "'", long2 == (-4967725919621401576L));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale.Builder builder4 = builder0.setLocale(locale2);
        java.lang.String str5 = locale2.getScript();
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("ko", "FRA-X-LVARIANT-KOR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: FRA-X-LVARIANT-KOR [at index 4]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker2.resolve("\u97e9\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        com.github.javafaker.Address address5 = faker2.address();
        com.github.javafaker.Color color6 = faker2.color();
        com.github.javafaker.Finance finance7 = faker2.finance();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream7 = random1.ints((long) 10, 10, (int) '4');
        java.util.stream.IntStream intStream8 = random1.ints();
        double double9 = random1.nextDouble();
        float float10 = random1.nextFloat();
        java.util.stream.IntStream intStream11 = random1.ints();
        double double12 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.72810113f + "'", float3 == 0.72810113f);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.44047195711667986d + "'", double9 == 0.44047195711667986d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.24137181f + "'", float10 == 0.24137181f);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8869349148715235d + "'", double12 == 0.8869349148715235d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHN");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.util.Locale locale4 = locale3.stripExtensions();
        boolean boolean5 = languageRange1.equals((java.lang.Object) locale3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getISO3Language();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale4.getDisplayCountry(locale9);
        java.util.Locale locale13 = locale4.stripExtensions();
        java.lang.String str14 = locale1.getDisplayVariant(locale13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_CN", (double) 0.22278214f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
            java.lang.String str12 = locale6.getUnicodeLocaleType("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: und");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR" + "'", str2, "ko-KR");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Random random2 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        int int5 = random2.nextInt(10);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random2);
        float float9 = random2.nextFloat();
        random2.setSeed((long) (short) 10);
        random2.setSeed(1L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.44047195f + "'", float9 == 0.44047195f);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        com.github.javafaker.Code code2 = faker0.code();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Finance finance6 = faker0.finance();
        org.junit.Assert.assertNotNull(internet1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        random1.setSeed((long) (-1));
        java.util.stream.IntStream intStream8 = random1.ints((int) (short) 10, 1708368258);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = languageRange1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setScript("KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: KR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Locale locale2 = new java.util.Locale("Cina", "Coreano (FRENCH (FRENCH))");
        org.junit.Assert.assertEquals(locale2.toString(), "cina_COREANO (FRENCH (FRENCH))");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt(10);
        java.util.stream.IntStream intStream8 = random1.ints((long) (byte) 100, (int) (byte) -1, (int) (short) 0);
        java.util.stream.LongStream longStream9 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((long) 13, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr-FR");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.DoubleStream doubleStream3 = random1.doubles(0L);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1 };
        random1.nextBytes(byteArray6);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-80, -75]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.Random random1 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.letterify("hi!");
        java.lang.String str6 = faker2.letterify("fra-x-lvariant-kor");
        com.github.javafaker.Internet internet7 = faker2.internet();
        com.github.javafaker.Finance finance8 = faker2.finance();
        com.github.javafaker.Code code9 = faker2.code();
        com.github.javafaker.Options options10 = faker2.options();
        com.github.javafaker.Number number11 = faker2.number();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra-x-lvariant-kor" + "'", str6, "fra-x-lvariant-kor");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale locale2 = new java.util.Locale("und", "zh");
        boolean boolean4 = locale2.equals((java.lang.Object) "Cina");
        org.junit.Assert.assertEquals(locale2.toString(), "und_ZH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("France");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("French", strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap25);
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getISO3Language();
        java.util.Locale.Builder builder31 = builder27.setLocale(locale29);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getISO3Language();
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getISO3Language();
        java.util.Locale.Builder builder41 = builder37.setLocale(locale39);
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getISO3Language();
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale29, locale33, locale36, locale39, locale43 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.Locale locale48 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList46, filteringMode49);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet16, filteringMode49);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet16);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList52);
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList52);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.IntStream intStream3 = random1.ints((long) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color5 = faker4.color();
        java.lang.String str7 = faker4.letterify("fr");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Locale locale3 = new java.util.Locale("fra", "und", "");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_UND could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_UND");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=28.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Locale locale3 = new java.util.Locale("FRENCH", "FRENCH (FRENCH)", "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.util.Locale locale4 = new java.util.Locale("und", "zh");
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale1.getDisplayName(locale4);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals(locale4.toString(), "und_ZH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Random random1 = new java.util.Random((long) 1036684082);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Random random5 = new java.util.Random((long) ' ');
        java.util.stream.IntStream intStream7 = random5.ints(1L);
        long long8 = random5.nextLong();
        int int10 = random5.nextInt((int) (byte) 1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = random5.ints((long) 13, (int) 'u', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5015647950085110473L) + "'", long8 == (-5015647950085110473L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Random random4 = new java.util.Random((long) ' ');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        int int7 = random4.nextInt(10);
        java.util.stream.DoubleStream doubleStream8 = random4.doubles();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        boolean boolean10 = locale2.equals((java.lang.Object) random4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("hi!");
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Business business5 = faker0.business();
        java.lang.String str7 = faker0.bothify("TWN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TWN" + "'", str7, "TWN");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        java.util.Locale.Builder builder4 = builder2.setLanguage("jpn");
        java.util.Locale locale5 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: jpn could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "jpn");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale4 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale4);
        java.lang.String str6 = locale4.getDisplayName();
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.util.Locale locale10 = new java.util.Locale("und", "zh");
        java.lang.String str11 = locale4.getDisplayCountry(locale10);
        java.lang.String str12 = locale4.getCountry();
        java.lang.String str13 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "french (FRENCH)" + "'", str6, "french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "und_ZH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRENCH" + "'", str11, "FRENCH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRENCH" + "'", str12, "FRENCH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "french" + "'", str13, "french");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.lang.String str8 = locale5.getCountry();
        java.lang.String str9 = locale5.getLanguage();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale14 = new java.util.Locale("French", "French");
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale10.getLanguage();
        java.lang.String str19 = locale5.getDisplayCountry(locale10);
        java.lang.String str20 = locale0.getDisplayCountry(locale10);
        java.lang.String str21 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals(locale14.toString(), "french_FRENCH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "french (FRENCH)" + "'", str16, "french (FRENCH)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("it");
        java.util.Locale.Builder builder4 = builder2.setLanguage("jpn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setUnicodeLocaleKeyword("French", "fra-x-lvariant-kor");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }
}
