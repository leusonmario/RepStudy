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
        java.util.Random random2 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1, random2);
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
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
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
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random0.ints((long) (short) 10, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
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
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random0.doubles((double) (byte) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random0.longs((long) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles((long) 1, (double) '4', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        com.github.javafaker.service.RandomService randomService7 = faker0.randomService;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(randomService7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleKeys();
        java.lang.Object obj9 = null;
        boolean boolean10 = locale2.equals(obj9);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        random0.setSeed((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs((long) 'u', (long) (short) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
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
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) 'u', (long) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints((long) 1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("CN");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        java.lang.Class<?> wildcardClass4 = color3.getClass();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale locale1 = new java.util.Locale("CN");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: cn could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CN", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options;
        com.github.javafaker.App app5 = faker2.app();
        boolean boolean6 = languageRange1.equals((java.lang.Object) app5);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_US" + "'", str1, "en_US");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German (Germany)" + "'", str3, "German (Germany)");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream2 = random1.ints();
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.lang.String str9 = locale2.getScript();
        java.lang.Object obj10 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 0L);
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        boolean boolean5 = languageRange2.equals((java.lang.Object) charSet4);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream7 = random1.ints((long) 1);
        java.lang.Class<?> wildcardClass8 = intStream7.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "ja_JP");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        java.lang.String str10 = locale1.getDisplayVariant(locale4);
        java.lang.String str11 = locale4.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str3, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French" + "'", str11, "French");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (byte) 0);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) 0, 1.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Locale locale2 = new java.util.Locale("anglais", "hi!");
        org.junit.Assert.assertEquals(locale2.toString(), "anglais_HI!");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Random random1 = new java.util.Random((-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = random1.nextInt((-1188188233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension(' ', "Japanese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Internet internet13 = faker6.internet;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Germany");
        double double5 = languageRange4.getWeight();
        boolean boolean6 = languageRange1.equals((java.lang.Object) double5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random0.longs((long) 'u', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31431982048702645d + "'", double1 == 0.31431982048702645d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("Japan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Japan");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("de", "ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: germany_ANGLAIS_de could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ja");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Business business6 = null;
        faker4.business = business6;
        com.github.javafaker.PhoneNumber phoneNumber8 = faker4.phoneNumber;
        faker0.phoneNumber = phoneNumber8;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.lang.Class<?> wildcardClass2 = random1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.lang.Class<?> wildcardClass9 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.letterify("hi!");
        com.github.javafaker.App app4 = faker0.app();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(app4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Locale locale1 = new java.util.Locale("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German (Germany)" + "'", str3, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de" + "'", str4, "de");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Random random1 = new java.util.Random((-4964420948893066024L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (short) -1, (double) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale2.getDisplayLanguage(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for japan");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "japan" + "'", str7, "japan");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Lorem lorem6 = faker0.lorem;
        com.github.javafaker.PhoneNumber phoneNumber7 = faker0.phoneNumber;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setExtension('4', "Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setExtension(' ', "\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.Object obj5 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "hi!");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random1.ints(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Locale locale3 = new java.util.Locale("", "Japan", "");
        org.junit.Assert.assertEquals(locale3.toString(), "_JAPAN");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setScript("Japanese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Japanese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "Japanese");
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_JAPANESE");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("french");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=united kingdom");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.service.RandomService randomService7 = faker6.randomService;
        com.github.javafaker.Code code8 = faker6.code();
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale9);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Random random14 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream17 = random14.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale13, random14);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.Company company23 = faker20.company();
        faker19.company = company23;
        com.github.javafaker.Hacker hacker25 = faker19.hacker;
        com.github.javafaker.Company company26 = faker19.company;
        com.github.javafaker.Hacker hacker27 = faker19.hacker;
        faker12.hacker = hacker27;
        faker6.hacker = hacker27;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(company23);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(company26);
        org.junit.Assert.assertNotNull(hacker27);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.DateAndTime dateAndTime7 = faker4.date();
        faker0.dateAndTime = dateAndTime7;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 1);
        double double8 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random0.longs((long) '#', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.1105845740208855d + "'", double8 == 1.1105845740208855d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Random random1 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(0.7281907524383029d, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random1.ints((long) (byte) 10, (int) '#', (-1188188233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.Hacker hacker9 = faker5.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Company company4 = faker0.company();
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(company4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japanese", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Random random1 = new java.util.Random((-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = random1.nextInt((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        double double8 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9297359568264961d + "'", double8 == 0.9297359568264961d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        java.util.stream.LongStream longStream7 = random1.longs((long) 0, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.Object obj2 = null;
        boolean boolean3 = locale1.equals(obj2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u56fd\u8a9e", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
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
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("anglais", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Random random1 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Business business9 = null;
        faker8.business = business9;
        com.github.javafaker.Book book11 = faker8.book;
        faker2.book = book11;
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u56fd\u8a9e", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = random0.nextInt((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream7 = random1.ints((long) 1);
        java.util.stream.IntStream intStream8 = random1.ints();
        boolean boolean9 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("Chinese", "de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Locale locale3 = new java.util.Locale("anglais", "English (Canada)", "allemand");
        org.junit.Assert.assertEquals(locale3.toString(), "anglais_ENGLISH (CANADA)_allemand");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        long long2 = random0.nextLong();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9424277812696519d + "'", double1 == 0.9424277812696519d);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8113469208120271707L) + "'", long2 == (-8113469208120271707L));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.App app6 = faker0.app;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.util.Locale locale24 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.util.Locale locale28 = new java.util.Locale("", "");
        java.lang.String str29 = locale24.getDisplayVariant(locale28);
        java.util.Set<java.lang.String> strSet30 = locale24.getUnicodeLocaleKeys();
        java.lang.String str31 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet30);
        java.util.Locale locale34 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet35 = locale34.getExtensionKeys();
        java.util.Locale locale38 = new java.util.Locale("", "");
        java.lang.String str39 = locale34.getDisplayVariant(locale38);
        java.util.Set<java.lang.String> strSet40 = locale34.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet40);
        java.util.Collection<java.util.Locale> localeCollection42 = null;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, localeCollection42);
        java.util.Locale locale44 = java.util.Locale.lookup(languageRangeList11, localeCollection42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap45);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode20.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertNotNull(languageRangeList46);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Random random10 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream12 = random10.doubles((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale6, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Name name10 = faker7.name();
        com.github.javafaker.Hacker hacker11 = faker7.hacker();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker7.code = code15;
        com.github.javafaker.Address address17 = faker7.address;
        faker0.address = address17;
        com.github.javafaker.App app19 = faker0.app();
        java.util.Locale locale20 = java.util.Locale.UK;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale20);
        com.github.javafaker.Code code22 = faker21.code;
        faker0.code = code22;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(app19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code22);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("allemand", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("Japanese (Japan)", "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Japanese (Japan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Book book6 = faker0.book;
        com.github.javafaker.Company company7 = faker0.company();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Internet internet3 = faker0.internet;
        org.junit.Assert.assertNotNull(internet3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        boolean boolean2 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale locale2 = new java.util.Locale("Japanese", "en_US");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: japanese_EN_US could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "japanese_EN_US");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (?????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale1, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random4);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random4);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale0.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str15, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German (Germany)" + "'", str16, "German (Germany)");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Business business36 = null;
        faker34.business = business36;
        com.github.javafaker.PhoneNumber phoneNumber38 = faker34.phoneNumber;
        faker6.phoneNumber = phoneNumber38;
        java.lang.String str41 = faker6.letterify("hi!");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(phoneNumber38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale locale2 = new java.util.Locale("French", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "french");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9370999785711813d + "'", double1 == 0.9370999785711813d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setUnicodeLocaleKeyword("ANGLAIS", "fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ANGLAIS [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("und", "Japanese (Japan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.Name name7 = faker4.name();
        com.github.javafaker.Hacker hacker8 = faker4.hacker();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book10 = null;
        faker9.book = book10;
        com.github.javafaker.Code code12 = faker9.code();
        faker4.code = code12;
        com.github.javafaker.App app14 = faker4.app();
        faker0.app = app14;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(hacker8);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(app14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Number number10 = faker0.number();
        com.github.javafaker.Name name11 = faker0.name;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(name11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('#', "Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.App app6 = faker0.app;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Random random1 = new java.util.Random((long) 100);
        int int2 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1193959466) + "'", int2 == (-1193959466));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.lang.String str7 = locale5.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getUnicodeLocaleType("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en_US");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Germany" + "'", str7, "Germany");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (china)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(randomService4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Locale locale3 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setScript("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList22, filteringMode24);
        java.util.Locale locale28 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.util.Locale locale32 = new java.util.Locale("", "");
        java.lang.String str33 = locale28.getDisplayVariant(locale32);
        java.util.Set<java.lang.String> strSet34 = locale28.getUnicodeLocaleKeys();
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.util.Locale locale48 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale52 = new java.util.Locale("", "");
        java.lang.String str53 = locale48.getDisplayVariant(locale52);
        java.util.Set<java.lang.String> strSet54 = locale48.getUnicodeLocaleKeys();
        java.lang.String str55 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strSet54);
        java.util.Locale locale58 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet59 = locale58.getExtensionKeys();
        java.util.Locale locale62 = new java.util.Locale("", "");
        java.lang.String str63 = locale58.getDisplayVariant(locale62);
        java.util.Set<java.lang.String> strSet64 = locale58.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strSet64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str67 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList15, strMap68);
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet72 = locale71.getUnicodeLocaleKeys();
        java.lang.String str73 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strSet72);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode11.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode24.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode44.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(charSet59);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Name name6 = faker5.name();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale locale3 = new java.util.Locale("japan", "de-DE", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale4.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayName(locale4);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: japan_DE-DE_?? (?????) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de" + "'", str9, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))" + "'", str10, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de-DE", (double) 1L);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random0.longs((long) 25, (long) (-1193959466), (long) (-1193959466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Japanese");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        random2.setSeed((long) '#');
        double double8 = random2.nextDouble();
        boolean boolean9 = languageRange1.equals((java.lang.Object) random2);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7281907524383029d + "'", double8 == 0.7281907524383029d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Locale locale3 = new java.util.Locale("fra", "Chinese", "Japan");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_CHINESE_Japan");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.lang.Class<?> wildcardClass12 = languageRangeList1.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        boolean boolean2 = random1.nextBoolean();
        float float3 = random1.nextFloat();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Finance finance5 = faker4.finance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.100473166f + "'", float3 == 0.100473166f);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.Hacker hacker28 = faker24.hacker();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book30 = null;
        faker29.book = book30;
        com.github.javafaker.Code code32 = faker29.code();
        faker24.code = code32;
        com.github.javafaker.Address address34 = faker24.address;
        faker17.address = address34;
        faker0.address = address34;
        java.util.Locale locale38 = new java.util.Locale("");
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.util.Random random41 = null;
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(locale39, random41);
        com.github.javafaker.App app43 = faker42.app;
        faker0.app = app43;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(app43);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.Code code5 = faker0.code();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("de-DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Random random1 = new java.util.Random(10L);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleKeys();
        java.lang.String str9 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber4 = null;
        faker0.phoneNumber = phoneNumber4;
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = faker0.fakeValuesService;
        java.lang.String str10 = faker0.numerify("United Kingdom");
        com.github.javafaker.Business business11 = faker0.business();
        java.lang.String str13 = faker0.bothify("Japanese");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Japanese" + "'", str13, "Japanese");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: United Kingdom");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        random1.setSeed(0L);
        double double5 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.730967787376657d + "'", double5 == 0.730967787376657d);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("allemand");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.Object obj5 = locale4.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "ja_JP");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale12, random13);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Company company22 = faker19.company();
        faker18.company = company22;
        com.github.javafaker.Hacker hacker24 = faker18.hacker;
        com.github.javafaker.Company company25 = faker18.company;
        com.github.javafaker.Hacker hacker26 = faker18.hacker;
        faker11.hacker = hacker26;
        faker7.hacker = hacker26;
        com.github.javafaker.Book book29 = faker7.book();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(company22);
        org.junit.Assert.assertNotNull(hacker24);
        org.junit.Assert.assertNotNull(company25);
        org.junit.Assert.assertNotNull(hacker26);
        org.junit.Assert.assertNotNull(book29);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("und");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Random random1 = new java.util.Random((long) (byte) -1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Business business4 = null;
        faker2.business = business4;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker2.phoneNumber;
        com.github.javafaker.App app7 = faker2.app();
        com.github.javafaker.Book book8 = faker2.book;
        faker1.book = book8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Business business12 = null;
        faker10.business = business12;
        com.github.javafaker.PhoneNumber phoneNumber14 = faker10.phoneNumber;
        com.github.javafaker.App app15 = faker10.app();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name17 = faker16.name;
        com.github.javafaker.Options options18 = faker16.options;
        com.github.javafaker.App app19 = faker16.app();
        com.github.javafaker.Options options20 = faker16.options;
        com.github.javafaker.Options options21 = faker16.options();
        faker10.options = options21;
        faker1.options = options21;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(app15);
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(app19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(options21);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book35 = null;
        faker34.book = book35;
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Number number39 = faker38.number;
        faker34.number = number39;
        faker6.number = number39;
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name43 = faker42.name;
        com.github.javafaker.Options options44 = faker42.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService45 = faker42.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber46 = null;
        faker42.phoneNumber = phoneNumber46;
        com.github.javafaker.Name name48 = faker42.name();
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name50 = faker49.name;
        com.github.javafaker.Options options51 = faker49.options;
        com.github.javafaker.Name name52 = faker49.name();
        com.github.javafaker.Hacker hacker53 = faker49.hacker();
        com.github.javafaker.Faker faker54 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book55 = null;
        faker54.book = book55;
        com.github.javafaker.Code code57 = faker54.code();
        faker49.code = code57;
        com.github.javafaker.Address address59 = faker49.address;
        faker42.address = address59;
        faker6.address = address59;
        com.github.javafaker.Color color62 = faker6.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(number39);
        org.junit.Assert.assertNotNull(name43);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(fakeValuesService45);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(name52);
        org.junit.Assert.assertNotNull(hacker53);
        org.junit.Assert.assertNotNull(code57);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertNotNull(color62);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Finance finance4 = faker0.finance();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale locale3 = new java.util.Locale("french", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "french");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)_french");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.Color color9 = faker5.color;
        com.github.javafaker.DateAndTime dateAndTime10 = faker5.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: German (Germany) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        java.util.stream.IntStream intStream9 = random1.ints((long) 'x', (-1), 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((-1L), 100, (-1193959466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.LongStream longStream8 = random0.longs((long) 'u', (long) 'x');
        java.util.stream.LongStream longStream10 = random0.longs((long) 0);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Locale locale2 = new java.util.Locale("French", "");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguage("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("de", "de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: de-DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_GB" + "'", str3, "en_GB");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.util.Locale locale13 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale17 = new java.util.Locale("", "");
        java.lang.String str18 = locale13.getDisplayVariant(locale17);
        java.util.Set<java.lang.String> strSet19 = locale13.getUnicodeLocaleKeys();
        java.lang.String str20 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet19);
        java.util.Locale locale23 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.util.Locale locale27 = new java.util.Locale("", "");
        java.lang.String str28 = locale23.getDisplayVariant(locale27);
        java.util.Set<java.lang.String> strSet29 = locale23.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet29);
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet32, filteringMode33);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList34, filteringMode35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode9.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode33.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode35.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        double double6 = random1.nextGaussian();
        java.util.stream.LongStream longStream8 = random1.longs(0L);
        java.util.stream.LongStream longStream9 = random1.longs();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.4294681506269885d) + "'", double6 == (-0.4294681506269885d));
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("und", "en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        double double8 = random0.nextDouble();
        boolean boolean9 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles(0.07813441977492779d, (double) 'a');
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5079703848387173d + "'", double8 == 0.5079703848387173d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random1.longs((long) (-1188188233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANGLAIS", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str4 = locale1.getVariant();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Japan");
        java.lang.String str7 = locale1.getDisplayScript(locale6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Name name5 = faker0.name;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("China");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('4', "English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options;
        com.github.javafaker.App app5 = faker2.app();
        faker1.app = app5;
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.service.RandomService randomService8 = faker1.randomService;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(randomService8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale5 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str6 = locale1.getDisplayScript(locale5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: germany_ANGLAIS_de could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "Japan");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)_Japan");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Random random1 = new java.util.Random(0L);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        java.lang.String str5 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Locale locale3 = new java.util.Locale("anglais", "German (Germany)", "Japanese (Japan)");
        org.junit.Assert.assertEquals(locale3.toString(), "anglais_GERMAN (GERMANY)_Japanese (Japan)");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Code code10 = faker0.code();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.App app14 = faker11.app();
        com.github.javafaker.Options options15 = faker11.options;
        com.github.javafaker.Options options16 = faker11.options();
        com.github.javafaker.Code code17 = faker11.code();
        faker0.code = code17;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(app14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(code17);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Number number3 = faker1.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random2 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        boolean boolean4 = locale0.equals((java.lang.Object) faker3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str5 = faker3.regexify("");
        com.github.javafaker.Number number6 = faker3.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale locale8 = new java.util.Locale("allemand", "french");
        java.lang.String str9 = locale3.getDisplayScript(locale8);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: allemand_FRENCH could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANGLAIS" + "'", str4, "ANGLAIS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "allemand_FRENCH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: German (Germany) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setScript("Japanese (Japan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Japanese (Japan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("China", (double) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=25.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german (germany)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Locale locale1 = new java.util.Locale("English (United Kingdom)");
        org.junit.Assert.assertEquals(locale1.toString(), "english (united kingdom)");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Internet internet7 = faker0.internet;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        java.lang.String str11 = faker8.numerify("Germany");
        com.github.javafaker.Address address12 = faker8.address;
        faker0.address = address12;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Germany" + "'", str11, "Germany");
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Name name11 = faker8.name();
        com.github.javafaker.Code code12 = faker8.code;
        faker6.code = code12;
        com.github.javafaker.Number number14 = faker6.number;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Business business17 = null;
        faker15.business = business17;
        com.github.javafaker.PhoneNumber phoneNumber19 = faker15.phoneNumber;
        com.github.javafaker.App app20 = faker15.app();
        com.github.javafaker.Book book21 = faker15.book;
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Random random23 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream26 = random23.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale22, random23);
        com.github.javafaker.Business business28 = null;
        faker27.business = business28;
        com.github.javafaker.Book book30 = faker27.book;
        com.github.javafaker.Company company31 = faker27.company;
        faker15.company = company31;
        com.github.javafaker.Hacker hacker33 = faker15.hacker;
        faker6.hacker = hacker33;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(phoneNumber19);
        org.junit.Assert.assertNotNull(app20);
        org.junit.Assert.assertNotNull(book21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(book30);
        org.junit.Assert.assertNotNull(company31);
        org.junit.Assert.assertNotNull(hacker33);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("French", "");
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.lang.String str9 = locale4.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Japanese (Japan)" + "'", str8, "Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        java.util.Locale locale15 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder7.setUnicodeLocaleKeyword("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: japan (DE-DE,?? (?????)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en__#x-anglais");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Locale locale1 = new java.util.Locale("English (Canada)");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "english (canada)");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker1.fakeValuesService;
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Random random1 = new java.util.Random((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        int int9 = random0.nextInt(23);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.Hacker hacker28 = faker24.hacker();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book30 = null;
        faker29.book = book30;
        com.github.javafaker.Code code32 = faker29.code();
        faker24.code = code32;
        com.github.javafaker.Address address34 = faker24.address;
        faker17.address = address34;
        faker0.address = address34;
        com.github.javafaker.Options options37 = faker0.options();
        com.github.javafaker.Company company38 = faker0.company;
        com.github.javafaker.Options options39 = faker0.options;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(company38);
        org.junit.Assert.assertNotNull(options39);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Random random1 = new java.util.Random((long) 'u');
        int int2 = random1.nextInt();
        double double3 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1188188233) + "'", int2 == (-1188188233));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0702551062704795d + "'", double3 == 1.0702551062704795d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese", 1.7853314409882288d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.7853314409882288");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 1);
        float float8 = random0.nextFloat();
        boolean boolean9 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((long) (byte) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.18216753f + "'", float8 == 0.18216753f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Business business36 = null;
        faker34.business = business36;
        com.github.javafaker.PhoneNumber phoneNumber38 = faker34.phoneNumber;
        faker6.phoneNumber = phoneNumber38;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = faker6.resolve("China");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(phoneNumber38);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = java.util.Locale.UK;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Internet internet3 = faker2.internet();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker4.fakeValuesService;
        com.github.javafaker.service.RandomService randomService8 = null;
        faker4.randomService = randomService8;
        com.github.javafaker.Options options10 = faker4.options;
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream16 = random11.doubles((long) (short) 1);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.service.RandomService randomService18 = faker17.randomService;
        faker4.randomService = randomService18;
        com.github.javafaker.Address address20 = faker4.address;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker21.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber25 = null;
        faker21.phoneNumber = phoneNumber25;
        com.github.javafaker.Name name27 = faker21.name();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name29 = faker28.name;
        com.github.javafaker.Options options30 = faker28.options;
        com.github.javafaker.Name name31 = faker28.name();
        com.github.javafaker.Hacker hacker32 = faker28.hacker();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book34 = null;
        faker33.book = book34;
        com.github.javafaker.Code code36 = faker33.code();
        faker28.code = code36;
        com.github.javafaker.Address address38 = faker28.address;
        faker21.address = address38;
        faker4.address = address38;
        faker2.address = address38;
        com.github.javafaker.Hacker hacker42 = faker2.hacker;
        boolean boolean43 = locale0.equals((java.lang.Object) faker2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(randomService18);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(hacker32);
        org.junit.Assert.assertNotNull(code36);
        org.junit.Assert.assertNotNull(address38);
        org.junit.Assert.assertNotNull(hacker42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name35 = faker34.name;
        com.github.javafaker.Options options36 = faker34.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService37 = faker34.fakeValuesService;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name39 = faker38.name;
        com.github.javafaker.Options options40 = faker38.options;
        com.github.javafaker.DateAndTime dateAndTime41 = faker38.date();
        faker34.dateAndTime = dateAndTime41;
        com.github.javafaker.Address address43 = faker34.address();
        faker6.address = address43;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name46 = faker45.name;
        com.github.javafaker.Options options47 = faker45.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService48 = faker45.fakeValuesService;
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name50 = faker49.name;
        com.github.javafaker.Options options51 = faker49.options;
        com.github.javafaker.DateAndTime dateAndTime52 = faker49.date();
        faker45.dateAndTime = dateAndTime52;
        com.github.javafaker.Address address54 = faker45.address();
        faker6.address = address54;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(name35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(fakeValuesService37);
        org.junit.Assert.assertNotNull(name39);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(dateAndTime41);
        org.junit.Assert.assertNotNull(address43);
        org.junit.Assert.assertNotNull(name46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(fakeValuesService48);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(dateAndTime52);
        org.junit.Assert.assertNotNull(address54);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("German (Germany)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german(germany)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale locale8 = new java.util.Locale("allemand", "french");
        java.lang.String str9 = locale3.getDisplayScript(locale8);
        java.lang.String str10 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANGLAIS" + "'", str4, "ANGLAIS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "allemand_FRENCH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "germany_ANGLAIS_de" + "'", str10, "germany_ANGLAIS_de");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale locale2 = new java.util.Locale("English (Canada)", "English (United Kingdom)");
        org.junit.Assert.assertEquals(locale2.toString(), "english (canada)_ENGLISH (UNITED KINGDOM)");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book8 = null;
        faker7.book = book8;
        java.lang.String str11 = faker7.bothify("Germany");
        com.github.javafaker.Business business12 = faker7.business;
        faker0.business = business12;
        com.github.javafaker.Book book14 = faker0.book();
        com.github.javafaker.Finance finance15 = faker0.finance();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Germany" + "'", str11, "Germany");
        org.junit.Assert.assertNotNull(business12);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(finance15);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream8 = random0.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        java.lang.String str6 = faker0.numerify("");
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Book book8 = faker0.book();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Address address2 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(address2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("germany_ANGLAIS_de", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Locale locale1 = new java.util.Locale("allemand");
        org.junit.Assert.assertEquals(locale1.toString(), "allemand");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", 0.7011546391008482d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Random random5 = new java.util.Random((long) 1);
        java.util.stream.DoubleStream doubleStream8 = random5.doubles(0.7281907524383029d, (double) 100.0f);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Locale locale3 = new java.util.Locale("allemand", "Japanese", "");
        org.junit.Assert.assertEquals(locale3.toString(), "allemand_JAPANESE");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color8 = faker7.color();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        double double2 = random1.nextDouble();
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        random1.nextBytes(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) (-1193959466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7304302967434272d + "'", double2 == 0.7304302967434272d);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[58, 93, -1, 65, -76]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("japan");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str4 = locale0.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.lang.String str9 = locale2.getScript();
        java.lang.String str10 = locale2.getCountry();
        java.lang.String str11 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        java.util.stream.IntStream intStream9 = random1.ints((long) 'x', (-1), 10);
        int int11 = random1.nextInt(23);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Company company6 = faker0.company;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2, random4);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        float float7 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.053843915f + "'", float7 == 0.053843915f);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Lorem lorem6 = faker0.lorem;
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Color color10 = faker7.color();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.DateAndTime dateAndTime18 = faker15.date();
        faker11.dateAndTime = dateAndTime18;
        faker7.dateAndTime = dateAndTime18;
        faker0.dateAndTime = dateAndTime18;
        java.lang.String str23 = faker0.letterify("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(dateAndTime18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str23, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("de-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setScript("en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.Company company14 = faker11.company();
        faker10.company = company14;
        com.github.javafaker.Hacker hacker16 = faker10.hacker;
        com.github.javafaker.Company company17 = faker10.company;
        com.github.javafaker.Hacker hacker18 = faker10.hacker;
        faker3.hacker = hacker18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = faker3.resolve("ja");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(hacker16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker18);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Lorem lorem4 = faker0.lorem;
        com.github.javafaker.Company company5 = faker0.company;
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ja", 0.730967787376657d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ja" + "'", str3, "ja");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setVariant("jpn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 100, (int) (byte) 1, (int) ' ');
        java.util.stream.IntStream intStream9 = random1.ints((long) 'x', (-1), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = random1.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options;
        com.github.javafaker.App app5 = faker2.app();
        faker1.app = app5;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Book book14 = faker13.book();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.App app18 = faker15.app();
        com.github.javafaker.Options options19 = faker15.options;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name21 = faker20.name;
        com.github.javafaker.Options options22 = faker20.options;
        com.github.javafaker.Color color23 = faker20.color();
        faker15.color = color23;
        faker13.color = color23;
        faker1.color = color23;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(app18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English (Canada)" + "'", str1, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CAN" + "'", str2, "CAN");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Options options24 = faker17.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService25 = faker17.fakeValuesService;
        faker0.fakeValuesService = fakeValuesService25;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(fakeValuesService25);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random0.longs((long) 'u', (long) (short) 10, (long) (-1193959466));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book6 = null;
        faker5.book = book6;
        com.github.javafaker.Code code8 = faker5.code();
        faker0.code = code8;
        com.github.javafaker.Address address10 = faker0.address;
        com.github.javafaker.Address address11 = faker0.address();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CAN", 0.7281907524383029d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Locale locale2 = new java.util.Locale("Japan", "French");
        org.junit.Assert.assertEquals(locale2.toString(), "japan_FRENCH");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.Locale locale1 = new java.util.Locale("German");
        org.junit.Assert.assertEquals(locale1.toString(), "german");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale3 = new java.util.Locale("");
        java.util.Locale locale7 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale7);
        java.lang.String str10 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet11 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "United Kingdom" + "'", str9, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English (United Kingdom)" + "'", str10, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.UK;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale0);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("German");
        java.util.Locale locale9 = builder5.build();
        boolean boolean10 = locale0.equals((java.lang.Object) locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book7 = faker6.book();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.App app11 = faker8.app();
        com.github.javafaker.Options options12 = faker8.options;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name14 = faker13.name;
        com.github.javafaker.Options options15 = faker13.options;
        com.github.javafaker.Color color16 = faker13.color();
        faker8.color = color16;
        faker6.color = color16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = faker6.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.util.Locale locale38 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet39 = locale38.getExtensionKeys();
        java.util.Locale locale42 = new java.util.Locale("", "");
        java.lang.String str43 = locale38.getDisplayVariant(locale42);
        java.util.Set<java.lang.String> strSet44 = locale38.getUnicodeLocaleKeys();
        java.lang.String str45 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strSet44);
        java.util.Locale locale48 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale52 = new java.util.Locale("", "");
        java.lang.String str53 = locale48.getDisplayVariant(locale52);
        java.util.Set<java.lang.String> strSet54 = locale48.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strSet54);
        java.util.Collection<java.util.Locale> localeCollection56 = null;
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, localeCollection56);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList57, filteringMode58);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale60 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode9.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode34.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(charSet39);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList59);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setLanguage("French");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale0.getDisplayLanguage(locale2);
        java.lang.String str4 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japanese" + "'", str3, "Japanese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JPN" + "'", str4, "JPN");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        random1.setSeed(0L);
        double double5 = random1.nextDouble();
        java.util.stream.IntStream intStream6 = random1.ints();
        double double7 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.730967787376657d + "'", double5 == 0.730967787376657d);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.2895731239084833d) + "'", double7 == (-1.2895731239084833d));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Book book6 = faker0.book;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Business business13 = null;
        faker12.business = business13;
        com.github.javafaker.Book book15 = faker12.book;
        com.github.javafaker.Company company16 = faker12.company;
        faker0.company = company16;
        com.github.javafaker.Hacker hacker18 = faker0.hacker;
        com.github.javafaker.Number number19 = faker0.number;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(company16);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(number19);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        java.util.Locale locale15 = builder7.build();
        java.lang.String str16 = locale15.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en__#x-anglais");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.Color color7 = faker4.color();
        faker0.color = color7;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension('4', "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Business business4 = null;
        faker2.business = business4;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker2.phoneNumber;
        com.github.javafaker.App app7 = faker2.app();
        com.github.javafaker.Book book8 = faker2.book;
        faker1.book = book8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker1.resolve("Japanese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) 'a', (-0.4294681506269885d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.UK;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getUnicodeLocaleType("Japan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Japan");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CAN", (double) (-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.9644209488930662E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German (Germany)", (double) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=25.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.LongStream longStream7 = random1.longs((-1529337064443298046L), (long) 3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10434413736109727d + "'", double2 == 0.10434413736109727d);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", 0.6991794951529816d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6991794951529816d + "'", double3 == 0.6991794951529816d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("allemand");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Code code6 = faker0.code();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book8 = null;
        faker7.book = book8;
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Number number12 = faker11.number;
        faker7.number = number12;
        com.github.javafaker.App app14 = faker7.app;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale15, random16);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Internet internet22 = faker21.internet;
        faker7.internet = internet22;
        com.github.javafaker.Company company24 = faker7.company();
        faker0.company = company24;
        com.github.javafaker.PhoneNumber phoneNumber26 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(app14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(internet22);
        org.junit.Assert.assertNotNull(company24);
        org.junit.Assert.assertNotNull(phoneNumber26);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        com.github.javafaker.Name name5 = faker0.name;
        java.lang.String str7 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u56fd\u8a9e", "Germany", "German (Germany)");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("Japan");
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale5.getVariant();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale5.getDisplayLanguage(locale9);
        java.lang.String str11 = locale3.getDisplayLanguage(locale5);
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u8a9e_GERMANY_German (Germany)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "japan");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "japan" + "'", str10, "japan");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str11, "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", 0.6991794951529816d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.letterify("hi!");
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Number number6 = faker5.number;
        faker0.number = number6;
        java.lang.String str9 = faker0.bothify("jpn");
        java.lang.String str11 = faker0.letterify("");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jpn" + "'", str9, "jpn");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        java.lang.String str14 = faker5.bothify("Japan");
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name16 = faker15.name;
        com.github.javafaker.Options options17 = faker15.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker15.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = null;
        faker15.randomService = randomService19;
        com.github.javafaker.Options options21 = faker15.options;
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream27 = random22.doubles((long) (short) 1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.service.RandomService randomService29 = faker28.randomService;
        faker15.randomService = randomService29;
        com.github.javafaker.Address address31 = faker15.address;
        com.github.javafaker.Lorem lorem32 = faker15.lorem();
        faker5.lorem = lorem32;
        com.github.javafaker.Options options34 = faker5.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService35 = faker5.fakeValuesService;
        com.github.javafaker.Business business36 = faker5.business;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japan" + "'", str14, "Japan");
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(randomService29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(lorem32);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(fakeValuesService35);
        org.junit.Assert.assertNull(business36);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getDisplayScript();
        java.lang.String str11 = locale5.getDisplayVariant(locale9);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "de-DE" + "'", str7, "de-DE");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber21 = null;
        faker17.phoneNumber = phoneNumber21;
        com.github.javafaker.Name name23 = faker17.name();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Name name27 = faker24.name();
        com.github.javafaker.Hacker hacker28 = faker24.hacker();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book30 = null;
        faker29.book = book30;
        com.github.javafaker.Code code32 = faker29.code();
        faker24.code = code32;
        com.github.javafaker.Address address34 = faker24.address;
        faker17.address = address34;
        faker0.address = address34;
        com.github.javafaker.Options options37 = faker0.options();
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name39 = faker38.name;
        com.github.javafaker.Options options40 = faker38.options;
        com.github.javafaker.Name name41 = faker38.name();
        com.github.javafaker.Code code42 = faker38.code;
        faker0.code = code42;
        com.github.javafaker.Address address44 = faker0.address;
        com.github.javafaker.Business business45 = faker0.business;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(name23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(hacker28);
        org.junit.Assert.assertNotNull(code32);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(name39);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(name41);
        org.junit.Assert.assertNotNull(code42);
        org.junit.Assert.assertNotNull(address44);
        org.junit.Assert.assertNotNull(business45);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Book book4 = faker0.book;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Name name8 = faker5.name();
        com.github.javafaker.Hacker hacker9 = faker5.hacker();
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.Lorem lorem11 = faker5.lorem;
        faker0.lorem = lorem11;
        com.github.javafaker.App app13 = faker0.app();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book15 = null;
        faker14.book = book15;
        com.github.javafaker.Code code17 = faker14.code();
        com.github.javafaker.Book book18 = faker14.book;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Name name22 = faker19.name();
        com.github.javafaker.Hacker hacker23 = faker19.hacker();
        com.github.javafaker.Internet internet24 = faker19.internet();
        com.github.javafaker.Lorem lorem25 = faker19.lorem;
        faker14.lorem = lorem25;
        com.github.javafaker.Color color27 = faker14.color;
        faker0.color = color27;
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(app13);
        org.junit.Assert.assertNotNull(code17);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(hacker23);
        org.junit.Assert.assertNotNull(internet24);
        org.junit.Assert.assertNotNull(lorem25);
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Business business40 = faker0.business;
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Random random42 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream45 = random42.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker46 = new com.github.javafaker.Faker(locale41, random42);
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random42);
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name49 = faker48.name;
        com.github.javafaker.Options options50 = faker48.options;
        com.github.javafaker.Company company51 = faker48.company();
        faker47.company = company51;
        com.github.javafaker.Hacker hacker53 = faker47.hacker;
        com.github.javafaker.Company company54 = faker47.company;
        com.github.javafaker.Book book55 = faker47.book();
        faker0.book = book55;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream45);
        org.junit.Assert.assertNotNull(name49);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(company51);
        org.junit.Assert.assertNotNull(hacker53);
        org.junit.Assert.assertNotNull(company54);
        org.junit.Assert.assertNotNull(book55);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("CAN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CAN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean2 = locale1.hasExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str5 = faker3.regexify("");
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Options options8 = faker6.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker6.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber10 = null;
        faker6.phoneNumber = phoneNumber10;
        com.github.javafaker.Name name12 = faker6.name();
        com.github.javafaker.Options options13 = faker6.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker6.fakeValuesService;
        faker3.fakeValuesService = fakeValuesService14;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Code code6 = faker0.code;
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Random random1 = new java.util.Random((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        java.lang.String str4 = faker0.bothify("Germany");
        com.github.javafaker.Business business5 = faker0.business;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Germany" + "'", str4, "Germany");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        random5.setSeed((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: germany_ANGLAIS_de could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANGLAIS" + "'", str4, "ANGLAIS");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale3.getLanguage();
        java.util.Locale.setDefault(category0, locale3);
        java.lang.String str8 = locale3.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        double double6 = random0.nextGaussian();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6886952783782626d + "'", double6 == 0.6886952783782626d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Locale locale2 = new java.util.Locale("french", "JPN");
        org.junit.Assert.assertEquals(locale2.toString(), "french_JPN");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.Locale locale1 = new java.util.Locale("de");
        java.util.Locale locale2 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale15, random17);
        com.github.javafaker.App app19 = faker18.app;
        faker6.app = app19;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(app19);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale3 = new java.util.Locale("");
        java.util.Locale locale7 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale7);
        java.lang.String str10 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "United Kingdom" + "'", str9, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setVariant("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: German (Germany) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.util.Random random3 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream4 = random3.doubles();
        random3.setSeed(0L);
        java.util.stream.DoubleStream doubleStream9 = random3.doubles((double) (byte) 0, 0.3306491713080322d);
        boolean boolean10 = languageRange1.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("und");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Random random1 = new java.util.Random((long) 'u');
        int int3 = random1.nextInt((int) ' ');
        float float4 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.6991795f + "'", float4 == 0.6991795f);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Hacker hacker14 = faker6.hacker;
        com.github.javafaker.Book book15 = faker6.book;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertNotNull(book15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options;
        com.github.javafaker.App app5 = faker2.app();
        faker1.app = app5;
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name9 = faker8.name;
        com.github.javafaker.Options options10 = faker8.options;
        com.github.javafaker.Name name11 = faker8.name();
        com.github.javafaker.Hacker hacker12 = faker8.hacker();
        java.lang.String str14 = faker8.numerify("");
        com.github.javafaker.Color color15 = faker8.color;
        faker1.color = color15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = faker1.resolve("ja");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream7 = random6.ints();
        java.util.stream.IntStream intStream8 = random6.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale2, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Code code2 = faker1.code;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Options options5 = faker3.options;
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.Hacker hacker7 = faker3.hacker();
        com.github.javafaker.Internet internet8 = faker3.internet();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name10 = faker9.name;
        com.github.javafaker.Options options11 = faker9.options;
        com.github.javafaker.App app12 = faker9.app();
        com.github.javafaker.Options options13 = faker9.options;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.Color color17 = faker14.color();
        faker9.color = color17;
        com.github.javafaker.Finance finance19 = faker9.finance;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book21 = null;
        faker20.book = book21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Number number25 = faker24.number;
        faker20.number = number25;
        faker9.number = number25;
        faker3.number = number25;
        com.github.javafaker.Number number29 = faker3.number();
        faker1.number = number29;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(finance19);
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(number29);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("allemand");
        java.util.Locale.Builder builder9 = builder5.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.Locale locale1 = new java.util.Locale("German (Germany)");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "german (germany)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "german (germany)" + "'", str2, "german (germany)");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Random random1 = new java.util.Random(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs(0L, 100L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguage("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setVariant("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList15, strMap16);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode11.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList17);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.service.RandomService randomService6 = faker5.randomService;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(randomService6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random2.doubles((long) (short) 1);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.DateAndTime dateAndTime11 = faker10.dateAndTime;
        com.github.javafaker.Business business12 = faker10.business;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Random random1 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs(100L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.Random random1 = new java.util.Random((long) 25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints((long) 3, (int) (short) 0, (-1188188233));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book6 = null;
        faker5.book = book6;
        com.github.javafaker.Code code8 = faker5.code();
        faker0.code = code8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker0.resolve("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("de");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Random random1 = new java.util.Random(100L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("germany_ANGLAIS_de", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=germany_anglais_de");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        random2.setSeed((long) '#');
        double double8 = random2.nextDouble();
        int int10 = random2.nextInt(10);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7281907524383029d + "'", double8 == 0.7281907524383029d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Random random1 = new java.util.Random((-8113469208120271707L));
        double double2 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0074780736504193035d + "'", double2 == 0.0074780736504193035d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.Locale locale3 = new java.util.Locale("ANGLAIS", "allemand", "German");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "anglais_ALLEMAND_German");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder9 = builder7.setLanguage("allemand");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("JPN", "Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Locale.Builder builder7 = builder4.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("en_GB", "Germany");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder11 = builder5.setLanguageTag("CAN");
        java.util.Locale locale12 = builder11.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "can");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Code code2 = faker1.code;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale3);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.Company company17 = faker14.company();
        faker13.company = company17;
        com.github.javafaker.Hacker hacker19 = faker13.hacker;
        com.github.javafaker.Company company20 = faker13.company;
        com.github.javafaker.Hacker hacker21 = faker13.hacker;
        faker6.hacker = hacker21;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Random random24 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale23, random24);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name31 = faker30.name;
        com.github.javafaker.Options options32 = faker30.options;
        com.github.javafaker.Company company33 = faker30.company();
        faker29.company = company33;
        com.github.javafaker.Hacker hacker35 = faker29.hacker;
        com.github.javafaker.Company company36 = faker29.company;
        com.github.javafaker.Hacker hacker37 = faker29.hacker;
        faker6.hacker = hacker37;
        faker1.hacker = hacker37;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name41 = faker40.name;
        com.github.javafaker.Options options42 = faker40.options;
        com.github.javafaker.Name name43 = faker40.name();
        com.github.javafaker.Hacker hacker44 = faker40.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService45 = faker40.fakeValuesService;
        com.github.javafaker.Book book46 = faker40.book();
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name48 = faker47.name;
        com.github.javafaker.Options options49 = faker47.options;
        com.github.javafaker.Name name50 = faker47.name();
        com.github.javafaker.Hacker hacker51 = faker47.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService52 = faker47.fakeValuesService;
        faker40.fakeValuesService = fakeValuesService52;
        faker1.fakeValuesService = fakeValuesService52;
        com.github.javafaker.Internet internet55 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(hacker19);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(hacker21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(company33);
        org.junit.Assert.assertNotNull(hacker35);
        org.junit.Assert.assertNotNull(company36);
        org.junit.Assert.assertNotNull(hacker37);
        org.junit.Assert.assertNotNull(name41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(name43);
        org.junit.Assert.assertNotNull(hacker44);
        org.junit.Assert.assertNotNull(fakeValuesService45);
        org.junit.Assert.assertNotNull(book46);
        org.junit.Assert.assertNotNull(name48);
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertNotNull(name50);
        org.junit.Assert.assertNotNull(hacker51);
        org.junit.Assert.assertNotNull(fakeValuesService52);
        org.junit.Assert.assertNotNull(internet55);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("German (Germany)", "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: German (Germany) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Japanese", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c" + "'", str2, "\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JPN" + "'", str3, "JPN");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("JPN");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder11 = builder5.setLanguageTag("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: German (Germany) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str5 = locale1.getExtension('a');
        java.lang.Object obj6 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Finance finance4 = faker0.finance;
        java.lang.String str6 = null; // flaky: faker0.regexify("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(finance4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9" + "'", str6, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("German");
        java.util.Locale locale9 = builder5.build();
        java.util.Locale locale10 = builder5.build();
        java.lang.String str11 = locale3.getDisplayVariant(locale10);
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANGLAIS" + "'", str4, "ANGLAIS");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "de" + "'", str11, "de");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Book book4 = faker0.book;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Name name8 = faker5.name();
        com.github.javafaker.Hacker hacker9 = faker5.hacker();
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.Lorem lorem11 = faker5.lorem;
        faker0.lorem = lorem11;
        java.util.Random random14 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Random random17 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale16, random17);
        com.github.javafaker.Business business22 = null;
        faker21.business = business22;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book25 = null;
        faker24.book = book25;
        com.github.javafaker.Code code27 = faker24.code();
        faker21.code = code27;
        java.lang.String str30 = faker21.bothify("Japan");
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name32 = faker31.name;
        com.github.javafaker.Options options33 = faker31.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService34 = faker31.fakeValuesService;
        com.github.javafaker.service.RandomService randomService35 = null;
        faker31.randomService = randomService35;
        com.github.javafaker.Options options37 = faker31.options;
        java.util.Random random38 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream41 = random38.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream43 = random38.doubles((long) (short) 1);
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.service.RandomService randomService45 = faker44.randomService;
        faker31.randomService = randomService45;
        com.github.javafaker.Address address47 = faker31.address;
        com.github.javafaker.Lorem lorem48 = faker31.lorem();
        faker21.lorem = lorem48;
        com.github.javafaker.Options options50 = faker21.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService51 = faker21.fakeValuesService;
        faker15.fakeValuesService = fakeValuesService51;
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name54 = faker53.name;
        com.github.javafaker.Options options55 = faker53.options;
        com.github.javafaker.App app56 = faker53.app();
        com.github.javafaker.Options options57 = faker53.options;
        faker15.options = options57;
        faker0.options = options57;
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(code27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Japan" + "'", str30, "Japan");
        org.junit.Assert.assertNotNull(name32);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(fakeValuesService34);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertNotNull(doubleStream43);
        org.junit.Assert.assertNotNull(randomService45);
        org.junit.Assert.assertNotNull(address47);
        org.junit.Assert.assertNotNull(lorem48);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(fakeValuesService51);
        org.junit.Assert.assertNotNull(name54);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(app56);
        org.junit.Assert.assertNotNull(options57);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Locale locale3 = new java.util.Locale("Germany", "anglais", "de");
        java.util.Random random5 = new java.util.Random((-1L));
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random5);
        double double8 = random5.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: germany_ANGLAIS_de could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "germany_ANGLAIS_de");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7853314409882288d + "'", double8 == 1.7853314409882288d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Business business40 = faker0.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService41 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker42 = faker0.hacker();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(fakeValuesService41);
        org.junit.Assert.assertNotNull(hacker42);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Book book6 = faker0.book;
        com.github.javafaker.Options options7 = faker0.options;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        boolean boolean2 = random1.nextBoolean();
        float float3 = random1.nextFloat();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        int int6 = random1.nextInt(25);
        int int8 = random1.nextInt((int) (byte) 10);
        java.util.stream.LongStream longStream10 = random1.longs((long) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.100473166f + "'", float3 == 0.100473166f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name7 = faker6.name;
        com.github.javafaker.Business business8 = null;
        faker6.business = business8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Options options12 = faker10.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker10.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber14 = null;
        faker10.phoneNumber = phoneNumber14;
        com.github.javafaker.Name name16 = faker10.name();
        com.github.javafaker.Options options17 = faker10.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker10.fakeValuesService;
        java.lang.String str20 = faker10.numerify("fra");
        com.github.javafaker.Lorem lorem21 = faker10.lorem();
        faker6.lorem = lorem21;
        faker0.lorem = lorem21;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(name16);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fra" + "'", str20, "fra");
        org.junit.Assert.assertNotNull(lorem21);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de-DE", 0.22639477023394194d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale3 = new java.util.Locale("Japanese", "hi!", "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("jpn", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.lang.String str6 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "German" + "'", str6, "German");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random2.doubles((long) (short) 1);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random2);
        random2.setSeed(100L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale locale13 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale.Builder builder15 = builder8.setLocale(locale13);
        java.util.Locale.Builder builder16 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Random random1 = new java.util.Random((long) 431529176);
        java.util.stream.LongStream longStream5 = random1.longs((long) (byte) 0, (long) 0, (long) 8);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("French", "");
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.lang.String str9 = locale4.getISO3Language();
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japan" + "'", str2, "Japan");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Japanese (Japan)" + "'", str8, "Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jpn" + "'", str9, "jpn");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Book book4 = faker0.book;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Name name8 = faker5.name();
        com.github.javafaker.Hacker hacker9 = faker5.hacker();
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.Lorem lorem11 = faker5.lorem;
        faker0.lorem = lorem11;
        com.github.javafaker.App app13 = faker0.app();
        com.github.javafaker.Code code14 = faker0.code();
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(app13);
        org.junit.Assert.assertNotNull(code14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CN", 0.3306491713080322d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("hi!", "", "");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.util.Set<java.lang.Character> charSet6 = locale0.getExtensionKeys();
        boolean boolean7 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.bothify("Chinese");
        com.github.javafaker.Number number4 = faker1.number();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        boolean boolean2 = random1.nextBoolean();
        float float3 = random1.nextFloat();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream11 = random5.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random5);
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Random random18 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream21 = random18.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale17, random18);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.Company company27 = faker24.company();
        faker23.company = company27;
        com.github.javafaker.Hacker hacker29 = faker23.hacker;
        com.github.javafaker.Company company30 = faker23.company;
        com.github.javafaker.Hacker hacker31 = faker23.hacker;
        faker16.hacker = hacker31;
        faker12.hacker = hacker31;
        faker4.hacker = hacker31;
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Random random36 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream39 = random36.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale35, random36);
        com.github.javafaker.Business business41 = null;
        faker40.business = business41;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book44 = null;
        faker43.book = book44;
        com.github.javafaker.Code code46 = faker43.code();
        faker40.code = code46;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name49 = faker48.name;
        com.github.javafaker.Options options50 = faker48.options;
        com.github.javafaker.App app51 = faker48.app();
        com.github.javafaker.Options options52 = faker48.options;
        com.github.javafaker.Options options53 = faker48.options();
        com.github.javafaker.Name name54 = faker48.name();
        faker40.name = name54;
        faker4.name = name54;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.100473166f + "'", float3 == 0.100473166f);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "anglais" + "'", str15, "anglais");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(company27);
        org.junit.Assert.assertNotNull(hacker29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertNotNull(hacker31);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertNotNull(code46);
        org.junit.Assert.assertNotNull(name49);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(app51);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(name54);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.lang.String str8 = locale7.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "german (germany)");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "german (germany)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en_GB" + "'", str8, "en_GB");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japan");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "japan" + "'", str2, "japan");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book5 = faker4.book();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(book5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setScript("en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        boolean boolean1 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.IntStream intStream7 = random0.ints((long) '4');
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) ' ', 0.0d, 0.15268242552628042d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japanisch" + "'", str1, "Japanisch");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Locale locale1 = new java.util.Locale("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "japan" + "'", str3, "japan");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Locale locale2 = new java.util.Locale("japan", "french");
        java.lang.String str3 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "japan_FRENCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "japan" + "'", str3, "japan");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Address address16 = faker0.address;
        com.github.javafaker.Lorem lorem17 = faker0.lorem();
        com.github.javafaker.Hacker hacker18 = faker0.hacker;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Random random20 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream23 = random20.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale19, random20);
        com.github.javafaker.Business business25 = null;
        faker24.business = business25;
        com.github.javafaker.Book book27 = faker24.book;
        com.github.javafaker.Company company28 = faker24.company;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name30 = faker29.name;
        com.github.javafaker.Options options31 = faker29.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService32 = faker29.fakeValuesService;
        com.github.javafaker.service.RandomService randomService33 = null;
        faker29.randomService = randomService33;
        com.github.javafaker.Options options35 = faker29.options;
        java.util.Random random36 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream39 = random36.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream41 = random36.doubles((long) (short) 1);
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.service.RandomService randomService43 = faker42.randomService;
        faker29.randomService = randomService43;
        com.github.javafaker.Business business45 = faker29.business();
        faker24.business = business45;
        faker0.business = business45;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(lorem17);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(book27);
        org.junit.Assert.assertNotNull(company28);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(fakeValuesService32);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertNotNull(randomService43);
        org.junit.Assert.assertNotNull(business45);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random2.doubles((long) (short) 1);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random2);
        int int11 = random2.nextInt();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1996627648 + "'", int11 == 1996627648);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de-DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        java.lang.String str13 = faker6.numerify("\u4e2d\u56fd\u8a9e");
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.App app17 = faker14.app();
        com.github.javafaker.Options options18 = faker14.options;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.Color color22 = faker19.color();
        faker14.color = color22;
        com.github.javafaker.Finance finance24 = faker14.finance;
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book26 = null;
        faker25.book = book26;
        java.util.Random random28 = null;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Number number30 = faker29.number;
        faker25.number = number30;
        faker14.number = number30;
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name34 = faker33.name;
        com.github.javafaker.Options options35 = faker33.options;
        com.github.javafaker.Name name36 = faker33.name();
        com.github.javafaker.Hacker hacker37 = faker33.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService38 = faker33.fakeValuesService;
        com.github.javafaker.Book book39 = faker33.book();
        faker14.book = book39;
        com.github.javafaker.Color color41 = faker14.color();
        faker6.color = color41;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str13, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(app17);
        org.junit.Assert.assertNotNull(options18);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertNotNull(number30);
        org.junit.Assert.assertNotNull(name34);
        org.junit.Assert.assertNotNull(options35);
        org.junit.Assert.assertNotNull(name36);
        org.junit.Assert.assertNotNull(hacker37);
        org.junit.Assert.assertNotNull(fakeValuesService38);
        org.junit.Assert.assertNotNull(book39);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Locale locale2 = new java.util.Locale("English (United Kingdom)", "English (United Kingdom)");
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_ENGLISH (UNITED KINGDOM)");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Random random5 = new java.util.Random((long) (byte) 1);
        boolean boolean6 = random5.nextBoolean();
        int int7 = random5.nextInt();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 431529176 + "'", int7 == 431529176);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Locale locale2 = new java.util.Locale("English", "Chinese");
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream9 = random3.longs((long) '4', (long) (short) 100);
        long long10 = random3.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale2, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: english_CHINESE could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "english_CHINESE");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 7486873316679690560L + "'", long10 == 7486873316679690560L);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name3 = faker2.name;
        com.github.javafaker.Options options4 = faker2.options;
        com.github.javafaker.App app5 = faker2.app();
        faker1.app = app5;
        com.github.javafaker.Code code7 = faker1.code();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber;
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet7 = faker6.internet;
        com.github.javafaker.Name name8 = faker6.name();
        com.github.javafaker.Color color9 = faker6.color();
        com.github.javafaker.Hacker hacker10 = faker6.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Options options6 = faker0.options;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream12 = random7.doubles((long) (short) 1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService14 = faker13.randomService;
        faker0.randomService = randomService14;
        com.github.javafaker.Business business16 = faker0.business();
        com.github.javafaker.Code code17 = faker0.code;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(randomService14);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(code17);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.LongStream longStream6 = random0.longs((long) 1, (long) (short) 100);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        int int9 = random0.nextInt(25);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream6 = random1.longs((long) 1996627648, 0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Random random1 = new java.util.Random((long) 23);
        int int2 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1150482841) + "'", int2 == (-1150482841));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Random random1 = new java.util.Random(10L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        float float3 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.73043025f + "'", float3 == 0.73043025f);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.App app11 = faker0.app;
        com.github.javafaker.Options options12 = faker0.options;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Locale locale14 = locale13.stripExtensions();
        boolean boolean15 = locale14.hasExtensions();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.PhoneNumber phoneNumber17 = faker16.phoneNumber;
        faker0.phoneNumber = phoneNumber17;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(phoneNumber17);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("de-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setExtension('a', "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant();
        java.lang.String str9 = locale5.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Japanese");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("ja");
        java.util.Locale.Builder builder6 = builder2.clear();
        java.util.Locale.Builder builder8 = builder2.setLanguage("German");
        boolean boolean9 = languageRange1.equals((java.lang.Object) builder8);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale2.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name10 = faker9.name;
        com.github.javafaker.Options options11 = faker9.options;
        com.github.javafaker.Name name12 = faker9.name();
        com.github.javafaker.Hacker hacker13 = faker9.hacker();
        java.lang.String str15 = faker9.numerify("");
        com.github.javafaker.Internet internet16 = faker9.internet();
        com.github.javafaker.Address address17 = faker9.address;
        faker5.address = address17;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(internet16);
        org.junit.Assert.assertNotNull(address17);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream13 = random10.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random10);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Internet internet16 = faker15.internet;
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.Name name20 = faker17.name();
        com.github.javafaker.Code code21 = faker17.code;
        faker15.code = code21;
        faker5.code = code21;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(internet16);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(code21);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("Japan");
        java.util.Locale.Builder builder5 = builder0.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("DE", "de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: de-DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "japan");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("German");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Random random8 = null;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Book book10 = faker9.book();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        double double6 = random0.nextGaussian();
        random0.setSeed((long) 25);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(10.0d, (double) 16);
        boolean boolean12 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5914115882670897d) + "'", double6 == (-0.5914115882670897d));
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en_GB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_gb");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Locale locale1 = new java.util.Locale("anglais");
        org.junit.Assert.assertEquals(locale1.toString(), "anglais");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Random random1 = new java.util.Random((long) 1);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4964420948893066024L) + "'", long2 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japanese (Japan)", 0.24053641567148587d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=japanese (japan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Locale locale3 = new java.util.Locale("German (Germany)", "Chinese (China)", "");
        org.junit.Assert.assertEquals(locale3.toString(), "german (germany)_CHINESE (CHINA)");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("fra");
        java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.addUnicodeLocaleAttribute("ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("allemand");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder9 = builder5.setLanguage("German");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Options options5 = faker3.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker3.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber7 = null;
        faker3.phoneNumber = phoneNumber7;
        com.github.javafaker.Name name9 = faker3.name();
        faker2.name = name9;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: German (Germany)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Business business40 = faker0.business;
        com.github.javafaker.service.FakeValuesService fakeValuesService41 = faker0.fakeValuesService;
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.util.Random random43 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream46 = random43.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(locale42, random43);
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Internet internet49 = faker48.internet;
        faker0.internet = internet49;
        com.github.javafaker.DateAndTime dateAndTime51 = faker0.dateAndTime;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(business40);
        org.junit.Assert.assertNotNull(fakeValuesService41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertNotNull(internet49);
        org.junit.Assert.assertNotNull(dateAndTime51);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        random1.setSeed(0L);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options7 = faker6.options();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.730967787376657d + "'", double5 == 0.730967787376657d);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) 1);
        long long10 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random0.ints((long) 22, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-8681131931676712889L) + "'", long10 == (-8681131931676712889L));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.Finance finance6 = faker0.finance;
        com.github.javafaker.Color color7 = faker0.color();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Color color7 = faker0.color;
        com.github.javafaker.Color color8 = faker0.color;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name10 = faker9.name;
        com.github.javafaker.Options options11 = faker9.options;
        com.github.javafaker.App app12 = faker9.app();
        com.github.javafaker.Options options13 = faker9.options;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.Color color17 = faker14.color();
        faker9.color = color17;
        com.github.javafaker.Finance finance19 = faker9.finance;
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book21 = null;
        faker20.book = book21;
        java.util.Random random23 = null;
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Number number25 = faker24.number;
        faker20.number = number25;
        faker9.number = number25;
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name29 = faker28.name;
        com.github.javafaker.Options options30 = faker28.options;
        com.github.javafaker.Name name31 = faker28.name();
        com.github.javafaker.Hacker hacker32 = faker28.hacker();
        com.github.javafaker.service.FakeValuesService fakeValuesService33 = faker28.fakeValuesService;
        com.github.javafaker.Book book34 = faker28.book();
        faker9.book = book34;
        com.github.javafaker.Name name36 = faker9.name;
        faker0.name = name36;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(app12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(finance19);
        org.junit.Assert.assertNotNull(number25);
        org.junit.Assert.assertNotNull(name29);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(name31);
        org.junit.Assert.assertNotNull(hacker32);
        org.junit.Assert.assertNotNull(fakeValuesService33);
        org.junit.Assert.assertNotNull(book34);
        org.junit.Assert.assertNotNull(name36);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book9 = null;
        faker8.book = book9;
        com.github.javafaker.Code code11 = faker8.code();
        faker5.code = code11;
        com.github.javafaker.Company company13 = faker5.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book15 = null;
        faker14.book = book15;
        java.lang.String str18 = faker14.bothify("Germany");
        com.github.javafaker.Business business19 = faker14.business;
        faker5.business = business19;
        com.github.javafaker.App app21 = faker5.app;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Germany" + "'", str18, "Germany");
        org.junit.Assert.assertNotNull(business19);
        org.junit.Assert.assertNotNull(app21);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale locale12 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.lang.String str9 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Locale locale0 = java.util.Locale.UK;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Random random1 = new java.util.Random((long) 'u');
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        random1.setSeed(0L);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs((long) (-1150482841), (long) 8, (-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.730967787376657d + "'", double5 == 0.730967787376657d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.24053641567148587d + "'", double7 == 0.24053641567148587d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setExtension('x', "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number8 = faker7.number;
        com.github.javafaker.Book book9 = faker7.book();
        com.github.javafaker.Company company10 = faker7.company;
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(book9);
        org.junit.Assert.assertNotNull(company10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German" + "'", str2, "German");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Germany" + "'", str5, "Germany");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Locale.Builder builder7 = builder4.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.setScript("french");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: french [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Random random1 = new java.util.Random((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = random1.nextInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        java.lang.String str3 = faker0.numerify("Germany");
        com.github.javafaker.Address address4 = faker0.address;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
        org.junit.Assert.assertNotNull(address4);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getCountry();
        java.lang.String str3 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "und" + "'", str1, "und");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str6 = locale0.getDisplayScript();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale locale8 = java.util.Locale.UK;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale8);
        java.lang.String str10 = locale7.getDisplayScript(locale8);
        java.util.Locale.setDefault(locale7);
        java.lang.String str12 = locale0.getDisplayLanguage(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French" + "'", str12, "French");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        double double6 = random0.nextGaussian();
        long long7 = random0.nextLong();
        random0.setSeed(0L);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.04395162174482941d + "'", double6 == 0.04395162174482941d);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3590193204838811164L + "'", long7 == 3590193204838811164L);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker0.randomService = randomService4;
        java.lang.String str7 = faker0.bothify("japan");
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "japan" + "'", str7, "japan");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayScript(locale2);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale0.getDisplayLanguage(locale2);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale12 = new java.util.Locale("allemand", "China", "United Kingdom");
        java.lang.String str13 = locale0.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Germany" + "'", str1, "Germany");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "German" + "'", str7, "German");
        org.junit.Assert.assertEquals(locale12.toString(), "allemand_CHINA_United Kingdom");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "German (Germany)" + "'", str13, "German (Germany)");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4, random5);
        com.github.javafaker.Business business10 = null;
        faker9.business = business10;
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book13 = null;
        faker12.book = book13;
        com.github.javafaker.Code code15 = faker12.code();
        faker9.code = code15;
        java.lang.String str18 = faker9.bothify("Japan");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name20 = faker19.name;
        com.github.javafaker.Options options21 = faker19.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService22 = faker19.fakeValuesService;
        com.github.javafaker.service.RandomService randomService23 = null;
        faker19.randomService = randomService23;
        com.github.javafaker.Options options25 = faker19.options;
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream31 = random26.doubles((long) (short) 1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random26);
        com.github.javafaker.service.RandomService randomService33 = faker32.randomService;
        faker19.randomService = randomService33;
        com.github.javafaker.Address address35 = faker19.address;
        com.github.javafaker.Lorem lorem36 = faker19.lorem();
        faker9.lorem = lorem36;
        faker0.lorem = lorem36;
        com.github.javafaker.service.FakeValuesService fakeValuesService39 = faker0.fakeValuesService;
        com.github.javafaker.Hacker hacker40 = faker0.hacker();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Japan" + "'", str18, "Japan");
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(fakeValuesService22);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(randomService33);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(lorem36);
        org.junit.Assert.assertNotNull(fakeValuesService39);
        org.junit.Assert.assertNotNull(hacker40);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Locale locale3 = new java.util.Locale("Japanese", "de-DE", "und");
        java.util.Random random5 = new java.util.Random((long) (byte) 10);
        java.util.stream.IntStream intStream6 = random5.ints();
        java.util.stream.IntStream intStream7 = random5.ints();
        long long8 = random5.nextLong();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: japanese_DE-DE_und could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "japanese_DE-DE_und");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-4972683369271453960L) + "'", long8 == (-4972683369271453960L));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Locale locale3 = new java.util.Locale("CAN", "jpn", "japan");
        org.junit.Assert.assertEquals(locale3.toString(), "can_JPN_japan");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name4 = faker3.name;
        com.github.javafaker.Options options5 = faker3.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = faker3.fakeValuesService;
        com.github.javafaker.service.RandomService randomService7 = null;
        faker3.randomService = randomService7;
        com.github.javafaker.DateAndTime dateAndTime9 = faker3.date();
        faker2.dateAndTime = dateAndTime9;
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Random random12 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream15 = random12.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale11, random12);
        com.github.javafaker.Business business17 = null;
        faker16.business = business17;
        com.github.javafaker.Book book19 = faker16.book;
        com.github.javafaker.Company company20 = faker16.company;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService24 = faker21.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber25 = null;
        faker21.phoneNumber = phoneNumber25;
        com.github.javafaker.Name name27 = faker21.name();
        com.github.javafaker.Options options28 = faker21.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService29 = faker21.fakeValuesService;
        faker16.fakeValuesService = fakeValuesService29;
        faker2.fakeValuesService = fakeValuesService29;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3167379156167569d + "'", double1 == 0.3167379156167569d);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(company20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(fakeValuesService24);
        org.junit.Assert.assertNotNull(name27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(fakeValuesService29);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book6 = null;
        faker5.book = book6;
        com.github.javafaker.Code code8 = faker5.code();
        faker0.code = code8;
        com.github.javafaker.App app10 = faker0.app();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name12 = faker11.name;
        com.github.javafaker.Options options13 = faker11.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService14 = faker11.fakeValuesService;
        com.github.javafaker.service.RandomService randomService15 = null;
        faker11.randomService = randomService15;
        com.github.javafaker.Options options17 = faker11.options;
        com.github.javafaker.App app18 = faker11.app();
        faker0.app = app18;
        com.github.javafaker.Lorem lorem20 = faker0.lorem();
        java.util.Locale locale21 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale21.getDisplayLanguage(locale23);
        java.util.Locale.setDefault(locale21);
        java.util.Random random27 = new java.util.Random((long) (byte) 10);
        float float28 = random27.nextFloat();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale21, random27);
        com.github.javafaker.DateAndTime dateAndTime30 = faker29.dateAndTime;
        faker0.dateAndTime = dateAndTime30;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(name12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(fakeValuesService14);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(app18);
        org.junit.Assert.assertNotNull(lorem20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Japanese" + "'", str24, "Japanese");
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.73043025f + "'", float28 == 0.73043025f);
        org.junit.Assert.assertNotNull(dateAndTime30);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Book book2 = faker0.book;
        com.github.javafaker.Company company3 = faker0.company();
        com.github.javafaker.Book book4 = faker0.book();
        com.github.javafaker.Code code5 = faker0.code();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.DateAndTime dateAndTime7 = faker0.date();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(company3);
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder7.setLanguage("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (short) 1);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name11 = faker10.name;
        com.github.javafaker.Options options12 = faker10.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = faker10.fakeValuesService;
        com.github.javafaker.service.RandomService randomService14 = null;
        faker10.randomService = randomService14;
        com.github.javafaker.Options options16 = faker10.options;
        java.util.Random random17 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream22 = random17.doubles((long) (short) 1);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.service.RandomService randomService24 = faker23.randomService;
        faker10.randomService = randomService24;
        com.github.javafaker.Finance finance26 = faker10.finance();
        faker9.finance = finance26;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(randomService24);
        org.junit.Assert.assertNotNull(finance26);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str4 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.Code code3 = faker0.code;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker4.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber8 = null;
        faker4.phoneNumber = phoneNumber8;
        com.github.javafaker.Name name10 = faker4.name();
        com.github.javafaker.Options options11 = faker4.options();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker4.fakeValuesService;
        java.lang.String str14 = faker4.numerify("fra");
        com.github.javafaker.Lorem lorem15 = faker4.lorem();
        faker0.lorem = lorem15;
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Locale locale18 = locale17.stripExtensions();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale18);
        com.github.javafaker.DateAndTime dateAndTime20 = faker19.dateAndTime;
        com.github.javafaker.PhoneNumber phoneNumber21 = faker19.phoneNumber;
        faker0.phoneNumber = phoneNumber21;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
        org.junit.Assert.assertNotNull(lorem15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertNotNull(phoneNumber21);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.lang.String str9 = locale2.getScript();
        java.lang.String str10 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "und" + "'", str10, "und");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name5 = faker4.name;
        com.github.javafaker.Options options6 = faker4.options;
        com.github.javafaker.App app7 = faker4.app();
        com.github.javafaker.Options options8 = faker4.options;
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name10 = faker9.name;
        com.github.javafaker.Options options11 = faker9.options;
        com.github.javafaker.Color color12 = faker9.color();
        faker4.color = color12;
        com.github.javafaker.Finance finance14 = faker4.finance;
        faker0.finance = finance14;
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Random random1 = new java.util.Random(10L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints(3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name15 = faker14.name;
        com.github.javafaker.Options options16 = faker14.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService17 = faker14.fakeValuesService;
        com.github.javafaker.PhoneNumber phoneNumber18 = null;
        faker14.phoneNumber = phoneNumber18;
        com.github.javafaker.Name name20 = faker14.name();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name22 = faker21.name;
        com.github.javafaker.Options options23 = faker21.options;
        com.github.javafaker.Name name24 = faker21.name();
        com.github.javafaker.Hacker hacker25 = faker21.hacker();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book27 = null;
        faker26.book = book27;
        com.github.javafaker.Code code29 = faker26.code();
        faker21.code = code29;
        com.github.javafaker.Address address31 = faker21.address;
        faker14.address = address31;
        faker6.address = address31;
        com.github.javafaker.DateAndTime dateAndTime34 = faker6.dateAndTime;
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name36 = faker35.name;
        com.github.javafaker.Options options37 = faker35.options;
        com.github.javafaker.App app38 = faker35.app();
        com.github.javafaker.Options options39 = faker35.options;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name41 = faker40.name;
        com.github.javafaker.Options options42 = faker40.options;
        com.github.javafaker.Color color43 = faker40.color();
        faker35.color = color43;
        com.github.javafaker.Finance finance45 = faker35.finance;
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.util.Random random47 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream50 = random47.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(locale46, random47);
        com.github.javafaker.Faker faker52 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.service.RandomService randomService53 = faker52.randomService;
        faker35.randomService = randomService53;
        faker6.randomService = randomService53;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(fakeValuesService17);
        org.junit.Assert.assertNotNull(name20);
        org.junit.Assert.assertNotNull(name22);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(hacker25);
        org.junit.Assert.assertNotNull(code29);
        org.junit.Assert.assertNotNull(address31);
        org.junit.Assert.assertNotNull(dateAndTime34);
        org.junit.Assert.assertNotNull(name36);
        org.junit.Assert.assertNotNull(options37);
        org.junit.Assert.assertNotNull(app38);
        org.junit.Assert.assertNotNull(options39);
        org.junit.Assert.assertNotNull(name41);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(finance45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertNotNull(randomService53);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("japan");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.lang.String str10 = locale8.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u8a9e" + "'", str10, "\u82f1\u8a9e");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.util.Locale locale42 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.util.Locale locale46 = new java.util.Locale("", "");
        java.lang.String str47 = locale42.getDisplayVariant(locale46);
        java.util.Set<java.lang.String> strSet48 = locale42.getUnicodeLocaleKeys();
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strSet48);
        java.lang.String str50 = java.util.Locale.lookupTag(languageRangeList29, (java.util.Collection<java.lang.String>) strSet48);
        java.util.Collection<java.util.Locale> localeCollection51 = null;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter(languageRangeList29, localeCollection51);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList59, filteringMode61);
        java.util.Locale locale65 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet66 = locale65.getExtensionKeys();
        java.util.Locale locale69 = new java.util.Locale("", "");
        java.lang.String str70 = locale65.getDisplayVariant(locale69);
        java.util.Set<java.lang.String> strSet71 = locale65.getUnicodeLocaleKeys();
        java.lang.String str72 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strSet71);
        java.util.Locale locale75 = new java.util.Locale("", "");
        java.util.Set<java.lang.Character> charSet76 = locale75.getExtensionKeys();
        java.util.Locale locale79 = new java.util.Locale("", "");
        java.lang.String str80 = locale75.getDisplayVariant(locale79);
        java.util.Set<java.lang.String> strSet81 = locale75.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strSet81);
        java.util.Collection<java.util.Locale> localeCollection83 = null;
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, localeCollection83);
        java.util.Locale locale85 = java.util.Locale.lookup(languageRangeList29, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList84);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode11.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode25.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode38.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode61.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNotNull(charSet66);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertNotNull(charSet76);
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNull(locale85);
        org.junit.Assert.assertNotNull(localeList86);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "Chinese");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("anglais", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japan");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "japan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "japan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "japan" + "'", str4, "japan");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Japan");
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder7.setScript("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("de-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("\u4e2d\u56fd\u8a9e", "\u4e2d\u56fd\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder5 = builder0.setLanguage("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Business business6 = null;
        faker5.business = business6;
        com.github.javafaker.Book book8 = faker5.book;
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = faker5.fakeValuesService;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 10, (double) '#');
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) (short) 1);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 1);
        double double8 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41024372613773324d + "'", double8 == 0.41024372613773324d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Book book6 = faker0.book;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        java.util.Random random14 = new java.util.Random();
        double double15 = random14.nextDouble();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name18 = faker17.name;
        com.github.javafaker.Options options19 = faker17.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker17.fakeValuesService;
        com.github.javafaker.service.RandomService randomService21 = null;
        faker17.randomService = randomService21;
        com.github.javafaker.DateAndTime dateAndTime23 = faker17.date();
        faker16.dateAndTime = dateAndTime23;
        faker13.dateAndTime = dateAndTime23;
        faker0.dateAndTime = dateAndTime23;
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name28 = faker27.name;
        com.github.javafaker.Options options29 = faker27.options;
        com.github.javafaker.service.FakeValuesService fakeValuesService30 = faker27.fakeValuesService;
        com.github.javafaker.service.RandomService randomService31 = null;
        faker27.randomService = randomService31;
        com.github.javafaker.Finance finance33 = faker27.finance;
        faker0.finance = finance33;
        com.github.javafaker.Number number35 = faker0.number;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.39712171369830884d + "'", double15 == 0.39712171369830884d);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(options19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(dateAndTime23);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(fakeValuesService30);
        org.junit.Assert.assertNotNull(finance33);
        org.junit.Assert.assertNotNull(number35);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setLanguage("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: japan (DE-DE,?? (?????)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Random random1 = new java.util.Random((long) 25);
        random1.setSeed(0L);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        com.github.javafaker.Code code3 = faker0.code();
        com.github.javafaker.Book book4 = faker0.book;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Name name8 = faker5.name();
        com.github.javafaker.Hacker hacker9 = faker5.hacker();
        com.github.javafaker.Internet internet10 = faker5.internet();
        com.github.javafaker.Lorem lorem11 = faker5.lorem;
        faker0.lorem = lorem11;
        com.github.javafaker.App app13 = faker0.app();
        com.github.javafaker.Hacker hacker14 = faker0.hacker;
        com.github.javafaker.Business business15 = faker0.business;
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(internet10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(app13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertNotNull(business15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Locale.Builder builder7 = builder4.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.setUnicodeLocaleKeyword("\u4e2d\u56fd\u8a9e", "en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale locale1 = new java.util.Locale("\u65e5\u672c");
        org.junit.Assert.assertEquals(locale1.toString(), "\u65e5\u672c");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", (double) 1996627648);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.996627648E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u8a9e", "\u4e2d\u56fd\u8a9e");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        java.util.Random random3 = null;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Number number5 = faker4.number;
        faker0.number = number5;
        com.github.javafaker.App app7 = faker0.app;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale8, random9);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Internet internet15 = faker14.internet;
        faker0.internet = internet15;
        com.github.javafaker.Company company17 = faker0.company();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name19 = faker18.name;
        com.github.javafaker.Options options20 = faker18.options;
        com.github.javafaker.Name name21 = faker18.name();
        com.github.javafaker.Hacker hacker22 = faker18.hacker();
        com.github.javafaker.Internet internet23 = faker18.internet();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name25 = faker24.name;
        com.github.javafaker.Options options26 = faker24.options;
        com.github.javafaker.App app27 = faker24.app();
        com.github.javafaker.Options options28 = faker24.options;
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name30 = faker29.name;
        com.github.javafaker.Options options31 = faker29.options;
        com.github.javafaker.Color color32 = faker29.color();
        faker24.color = color32;
        com.github.javafaker.Finance finance34 = faker24.finance;
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book36 = null;
        faker35.book = book36;
        java.util.Random random38 = null;
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random38);
        com.github.javafaker.Number number40 = faker39.number;
        faker35.number = number40;
        faker24.number = number40;
        faker18.number = number40;
        com.github.javafaker.Number number44 = faker18.number();
        faker0.number = number44;
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(internet15);
        org.junit.Assert.assertNotNull(company17);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(name21);
        org.junit.Assert.assertNotNull(hacker22);
        org.junit.Assert.assertNotNull(internet23);
        org.junit.Assert.assertNotNull(name25);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(app27);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(name30);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(finance34);
        org.junit.Assert.assertNotNull(number40);
        org.junit.Assert.assertNotNull(number44);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Random random1 = new java.util.Random((long) '#');
        java.util.stream.LongStream longStream3 = random1.longs((long) 'a');
        boolean boolean4 = random1.nextBoolean();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u');
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (short) 10, 0.15268242552628042d, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random1.longs((long) 25, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Options options2 = faker0.options;
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Options options4 = faker0.options;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name6 = faker5.name;
        com.github.javafaker.Options options7 = faker5.options;
        com.github.javafaker.Color color8 = faker5.color();
        faker0.color = color8;
        com.github.javafaker.Finance finance10 = faker0.finance;
        com.github.javafaker.App app11 = faker0.app;
        java.lang.String str13 = faker0.regexify("Chinese");
        com.github.javafaker.Book book14 = faker0.book();
        com.github.javafaker.Finance finance15 = faker0.finance();
        com.github.javafaker.Code code16 = faker0.code;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(app11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(book14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(code16);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayName(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30c9\u30a4\u30c4" + "'", str2, "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)" + "'", str4, "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number2 = faker1.number;
        com.github.javafaker.App app3 = faker1.app;
        java.util.Random random4 = null;
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        java.lang.String str7 = faker5.bothify("Chinese");
        com.github.javafaker.Business business8 = faker5.business;
        faker1.business = business8;
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese" + "'", str7, "Chinese");
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Locale locale3 = new java.util.Locale("Chinese", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))", "English (Canada)");
        java.util.Locale locale4 = locale3.stripExtensions();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))_English (Canada)");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9))_English (Canada)");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder5.setLanguage("ja");
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.Builder builder11 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder7.setExtension('x', "anglais");
        java.util.Locale locale15 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder7.setRegion("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en__#x-anglais");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        boolean boolean5 = locale1.hasExtensions();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Random random1 = new java.util.Random((long) 'u');
        int int3 = random1.nextInt((int) ' ');
        double double4 = random1.nextDouble();
        java.util.stream.IntStream intStream5 = random1.ints();
        double double6 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6991794951529816d + "'", double4 == 0.6991794951529816d);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36252192396593935d + "'", double6 == 0.36252192396593935d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name8 = faker7.name;
        com.github.javafaker.Options options9 = faker7.options;
        com.github.javafaker.Company company10 = faker7.company();
        faker6.company = company10;
        com.github.javafaker.Hacker hacker12 = faker6.hacker;
        com.github.javafaker.Company company13 = faker6.company;
        com.github.javafaker.Hacker hacker14 = faker6.hacker;
        com.github.javafaker.Options options15 = faker6.options();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Random random17 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream20 = random17.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale16, random17);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random17);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name24 = faker23.name;
        com.github.javafaker.Business business25 = null;
        faker23.business = business25;
        com.github.javafaker.PhoneNumber phoneNumber27 = faker23.phoneNumber;
        com.github.javafaker.App app28 = faker23.app();
        com.github.javafaker.Book book29 = faker23.book;
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Random random31 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream34 = random31.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale30, random31);
        com.github.javafaker.Business business36 = null;
        faker35.business = business36;
        com.github.javafaker.Book book38 = faker35.book;
        com.github.javafaker.Company company39 = faker35.company;
        faker23.company = company39;
        faker22.company = company39;
        faker6.company = company39;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(hacker14);
        org.junit.Assert.assertNotNull(options15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(name24);
        org.junit.Assert.assertNotNull(phoneNumber27);
        org.junit.Assert.assertNotNull(app28);
        org.junit.Assert.assertNotNull(book29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream34);
        org.junit.Assert.assertNotNull(book38);
        org.junit.Assert.assertNotNull(company39);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        boolean boolean3 = languageRange1.equals((java.lang.Object) 0.7011546391008482d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name;
        com.github.javafaker.Business business2 = null;
        faker0.business = business2;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber;
        com.github.javafaker.App app5 = faker0.app();
        com.github.javafaker.Book book6 = faker0.book;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 10, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.Business business13 = null;
        faker12.business = business13;
        com.github.javafaker.Book book15 = faker12.book;
        com.github.javafaker.Company company16 = faker12.company;
        faker0.company = company16;
        com.github.javafaker.Hacker hacker18 = faker0.hacker;
        com.github.javafaker.Finance finance19 = faker0.finance();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(company16);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(finance19);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Book book1 = null;
        faker0.book = book1;
        java.lang.String str4 = faker0.bothify("Germany");
        com.github.javafaker.Business business5 = faker0.business;
        java.lang.String str7 = faker0.bothify("Chinese (China)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Germany" + "'", str4, "Germany");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese (China)" + "'", str7, "Chinese (China)");
    }
}
