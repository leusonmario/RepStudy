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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Finance finance4 = faker1.finance;
        com.github.javafaker.Address address5 = null;
        faker1.address = address5;
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Random random2 = new java.util.Random();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random2);
        com.github.javafaker.Lorem lorem4 = null;
        faker3.lorem = lorem4;
        com.github.javafaker.Finance finance6 = faker3.finance;
        boolean boolean7 = locale1.equals((java.lang.Object) finance6);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale3.getDisplayVariant(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setLocale(locale3);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_FR" + "'", str5, "fr_FR");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_fr_HI!_eng" + "'", str4, "fr_fr_HI!_eng");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
        java.lang.String str5 = faker3.bothify("fr_fr_HI!_eng");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_fr_HI!_eng" + "'", str5, "fr_fr_HI!_eng");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Random random1 = new java.util.Random(1L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (short) 10, (double) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Random random8 = new java.util.Random(1L);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale6, random8);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr_HI!_eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-eng" + "'", str4, "x-lvariant-eng");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber;
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale.setDefault(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale8);
        com.github.javafaker.Internet internet11 = faker10.internet;
        faker1.internet = internet11;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random3.doubles((double) 1.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random3.doubles(0.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("eng", "fr_fr_HI!_eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        boolean boolean4 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setExtension('a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en_US");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.Object obj3 = locale2.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "en_US");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) 1, (double) (byte) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker1.resolve("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Locale locale3 = new java.util.Locale("x-lvariant-eng", "", "");
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale4, random5);
        java.util.stream.DoubleStream doubleStream7 = random5.doubles();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: x-lvariant-eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.lang.String str9 = locale5.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Random random0 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random0.ints((long) '4', (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random0.doubles((long) (short) -1, 0.6648990280926325d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Name name6 = faker1.name;
        java.lang.Class<?> wildcardClass7 = faker1.getClass();
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getUnicodeLocaleType("en-us");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en-us");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension(' ', "TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.LongStream longStream3 = random1.longs();
        java.lang.Class<?> wildcardClass4 = longStream3.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7, random8);
        boolean boolean10 = locale6.equals((java.lang.Object) random8);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getCountry();
        boolean boolean3 = locale0.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TW" + "'", str1, "TW");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setRegion("x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setScript("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("fran\347ais", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Internet internet11 = null;
        faker8.internet = internet11;
        com.github.javafaker.Business business13 = faker8.business();
        faker1.business = business13;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale1.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TW");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) 100, 0.6400459277857217d, 1.0d);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
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
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getLanguage();
        boolean boolean3 = locale1.hasExtensions();
        java.lang.Object obj4 = null;
        boolean boolean5 = locale1.equals(obj4);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker5.resolve("en-us");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3965184456715336d + "'", double1 == 0.3965184456715336d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("fr_fr_HI!_eng", "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fr_fr_HI!_eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setRegion("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "fr_FR");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "fr_FR");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("fr_fr_HI!_eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr_fr_HI!_eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", 0.46560633866972545d);
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Lorem lorem5 = null;
        faker4.lorem = lorem5;
        com.github.javafaker.Internet internet7 = null;
        faker4.internet = internet7;
        java.lang.String str10 = faker4.bothify("");
        boolean boolean11 = languageRange2.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList20);
        boolean boolean24 = locale6.equals((java.lang.Object) languageRangeList8);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_US" + "'", str1, "en_US");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale locale8 = new java.util.Locale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random(1L);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1, random3);
        java.lang.String str5 = locale1.getVariant();
        java.lang.String str6 = locale1.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        random0.setSeed((long) (short) 10);
        long long5 = random0.nextLong();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6773184971773079d + "'", double2 == 0.6773184971773079d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4972683369271453960L) + "'", long5 == (-4972683369271453960L));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.lang.String str9 = locale3.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Business business6 = faker1.business;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        boolean boolean4 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = random0.longs((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1927592403403241d + "'", double1 == 0.1927592403403241d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("France");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "france");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Name name7 = faker0.name();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("japonais");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Color color6 = faker1.color;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("");
        com.github.javafaker.Company company13 = faker8.company;
        com.github.javafaker.Options options14 = faker8.options();
        faker1.options = options14;
        java.lang.Class<?> wildcardClass16 = faker1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: franc?ais (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Locale locale3 = new java.util.Locale("x-lvariant-eng", "", "");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale5, random8);
        org.junit.Assert.assertEquals(locale3.toString(), "x-lvariant-eng");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("japonais", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        java.util.Random random13 = new java.util.Random(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale9, random13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr_HI!_eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "x-lvariant-eng" + "'", str10, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList41, filteringMode42);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList14, filteringMode42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap45);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("", "French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.Locale locale2 = new java.util.Locale("fr_fr_HI!_eng", "fran\347ais (France)");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_hi!_eng_FRAN\347AIS (FRANCE)");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book5 = faker4.book();
        java.lang.String str7 = faker4.bothify("fr");
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3415199772941956d + "'", double1 == 0.3415199772941956d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr_FR", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) (byte) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.addUnicodeLocaleAttribute("x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: franc?ais (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Business business8 = faker1.business();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        java.lang.String str14 = faker10.numerify("");
        com.github.javafaker.Business business15 = faker10.business;
        faker1.business = business15;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(business15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] { languageRange18, languageRange20 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList37);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList48, filteringMode49);
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList48);
        java.lang.String str52 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList48);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode49.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random((long) (short) 1);
        java.util.stream.DoubleStream doubleStream6 = random2.doubles((long) (byte) 100, 0.5819794877433786d, (double) 'x');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Random random9 = new java.util.Random();
        double double10 = random9.nextDouble();
        int int12 = random9.nextInt(1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random9);
        double double14 = random9.nextDouble();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale3, random9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream18 = random9.longs((long) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.326663908087765d + "'", double10 == 0.326663908087765d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4743670102748003d + "'", double14 == 0.4743670102748003d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((-4972683369271453960L), (int) 'x', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) 'u', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("en-GB", "fr-fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Collection<java.lang.String> strCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList8, strCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        long long3 = random0.nextLong();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6491242495114442290L + "'", long3 == 6491242495114442290L);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet5, filteringMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Locale locale2 = new java.util.Locale("", "en-US");
        org.junit.Assert.assertEquals(locale2.toString(), "_EN-US");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Collection<java.lang.String> strCollection8 = null;
        java.lang.String str9 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection8);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (byte) 100, 0.5819794877433786d, (double) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random1.longs((long) 'x', (long) 'x', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en-us");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale10 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str11 = locale10.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder6.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        java.lang.String str6 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr-FR" + "'", str6, "fr-FR");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        java.lang.Object obj12 = locale4.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "x-lvariant-eng" + "'", str10, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = random0.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Locale locale0 = null;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Random random2 = new java.util.Random();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1, random2);
        java.util.stream.DoubleStream doubleStream4 = random2.doubles();
        java.util.stream.IntStream intStream7 = random2.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream10 = random2.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream11 = random2.longs();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English (United Kingdom)", (-0.7032003714723285d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.7032003714723285");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Locale locale3 = new java.util.Locale("fra", "fr", "fran\347ais (France)");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_FR_fran\347ais (France)");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Locale locale1 = new java.util.Locale("TW");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "tw");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Random random1 = new java.util.Random(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (byte) 1, 0.7784618477508322d, 0.6696962632739241d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale1.getDisplayCountry(locale5);
        java.lang.Object obj10 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale locale11 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList38, filteringMode42);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "it");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Finance finance7 = faker0.finance();
        java.util.Random random8 = new java.util.Random();
        double double9 = random8.nextDouble();
        java.util.stream.IntStream intStream12 = random8.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Code code14 = faker13.code();
        faker0.code = code14;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12037749875605286d + "'", double9 == 0.12037749875605286d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(code14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italian");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        boolean boolean5 = languageRange1.equals((java.lang.Object) str4);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Business business6 = faker5.business;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem12 = faker11.lorem;
        faker5.lorem = lorem12;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5685695628231787d + "'", double1 == 0.5685695628231787d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(business6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.33113666981066425d + "'", double8 == 0.33113666981066425d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder6.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr_fr_HI!_eng", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fr_fr_hi!_eng");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "x-lvariant-eng" + "'", str10, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr-fr", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale locale3 = new java.util.Locale("fr", "", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "fr__eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-x-lvariant-eng" + "'", str4, "fr-x-lvariant-eng");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker3.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Color color7 = faker1.color();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker1.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.DateAndTime dateAndTime13 = null;
        faker12.dateAndTime = dateAndTime13;
        com.github.javafaker.Business business15 = faker12.business;
        faker1.business = business15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(business15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-GB" + "'", str8, "en-GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("French (France)");
        com.github.javafaker.Internet internet8 = faker1.internet;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (France)" + "'", str7, "French (France)");
        org.junit.Assert.assertNull(internet8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: fr_FR");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "hi!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Finance finance3 = faker2.finance;
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Random random1 = new java.util.Random((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) ' ', (double) 100.0f, 0.37479328637494624d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale locale2 = new java.util.Locale("fra", "fr-fr");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FR-FR");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fra_FR-FR");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale4);
// flaky:             org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "hi!");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.9644209488930662E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker5.fakeValuesService;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3442254956633575d + "'", double1 == 0.3442254956633575d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_FR" + "'", str4, "fr_FR");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        java.lang.Class<?> wildcardClass13 = random6.getClass();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8794889009289825d + "'", double7 == 0.8794889009289825d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.9035955f + "'", float11 == 0.9035955f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1347056262) + "'", int12 == (-1347056262));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Random random1 = new java.util.Random((long) (short) 10);
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 0, (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name9 = faker8.name;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(name9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random1.ints((int) (short) -1, (-1347056262));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem;
        com.github.javafaker.Color color6 = faker4.color();
        java.lang.String str8 = faker4.letterify("France");
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3190829470587573d + "'", double1 == 0.3190829470587573d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=anglais (royaume-uni)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension(' ', "France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Locale locale3 = new java.util.Locale("en_US", "France", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "en_us_FRANCE");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints((long) (byte) 10, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber3 = faker2.phoneNumber;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        java.lang.String str9 = faker5.numerify("");
        com.github.javafaker.Company company10 = faker5.company;
        com.github.javafaker.Number number11 = faker5.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker5.fakeValuesService;
        faker2.fakeValuesService = fakeValuesService12;
        com.github.javafaker.Book book14 = faker2.book;
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNotNull(book14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime2 = null;
        faker1.dateAndTime = dateAndTime2;
        com.github.javafaker.Finance finance4 = faker1.finance;
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.Class<?> wildcardClass3 = faker2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker1.randomService = randomService4;
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.Locale locale1 = new java.util.Locale("en-us");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: en-us could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "en-us");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguageTag("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Locale locale2 = new java.util.Locale("hi!", "en-US");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EN-US" + "'", str3, "EN-US");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale3.getDisplayVariant(locale5);
        java.lang.String str7 = locale5.getCountry();
        java.util.Random random8 = new java.util.Random();
        double double9 = random8.nextDouble();
        int int11 = random8.nextInt(1);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale5, random8);
        double double13 = random8.nextGaussian();
        boolean boolean14 = locale1.equals((java.lang.Object) double13);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.10397794677344985d + "'", double9 == 0.10397794677344985d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.17583375681927463d) + "'", double13 == (-0.17583375681927463d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Company company5 = faker4.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        boolean boolean7 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random1.ints((int) 'x', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale3.getDisplayCountry(locale14);
        java.lang.String str17 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        long long5 = random1.nextLong();
        java.util.stream.LongStream longStream8 = random1.longs((long) (short) 1, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = random1.nextInt((-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4964420948893066024L) + "'", long5 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.Locale locale3 = new java.util.Locale("en", "eng", "fran\347ais");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "en_ENG_fran\347ais");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en-US");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("eng", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options();
        com.github.javafaker.Code code8 = faker0.code;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream4 = random1.ints((int) (byte) 1, (int) 'x');
        long long5 = random1.nextLong();
        int int7 = random1.nextInt(10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4964420948893066024L) + "'", long5 == (-4964420948893066024L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Locale locale3 = new java.util.Locale("English (United Kingdom)", "en-GB", "en-GB");
        org.junit.Assert.assertEquals(locale3.toString(), "english (united kingdom)_EN-GB_en-GB");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Locale locale2 = new java.util.Locale("en-us", "English (United Kingdom)");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: en-us_ENGLISH (UNITED KINGDOM) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("und");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random6.doubles(0.9023872490135806d, (-0.447199972589489d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3393142352760766d + "'", double7 == 0.3393142352760766d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-eng" + "'", str4, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList32, filteringMode33);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap36);
        java.util.Collection<java.util.Locale> localeCollection38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter(languageRangeList37, localeCollection38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode33.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeList37);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.Code code7 = faker1.code;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Finance finance11 = faker10.finance;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker10.phoneNumber;
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number14 = faker13.number;
        com.github.javafaker.Number number15 = faker13.number();
        java.lang.String str17 = faker13.bothify("en-GB");
        com.github.javafaker.Book book18 = faker13.book();
        com.github.javafaker.DateAndTime dateAndTime19 = faker13.dateAndTime;
        com.github.javafaker.Finance finance20 = faker13.finance();
        faker10.finance = finance20;
        faker1.finance = finance20;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertNotNull(book18);
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(finance20);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setScript("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] { languageRange11, languageRange13 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList41, filteringMode42);
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags(languageRangeList46, (java.util.Collection<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList52);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setRegion("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fr-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Options options5 = faker1.options;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: franc?ais (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Internet internet11 = faker10.internet();
        com.github.javafaker.Number number12 = faker10.number;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9865002307066588d + "'", double7 == 0.9865002307066588d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(number12);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-us", 0.6236560371556241d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("japonais", (double) 6491242495114442290L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=6.4912424951144428E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str4 = locale0.getDisplayName(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TW" + "'", str1, "TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (Taiwan)" + "'", str4, "Chinese (Taiwan)");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("EN-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: EN-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Book book7 = faker1.book;
        com.github.javafaker.Code code8 = faker1.code();
        com.github.javafaker.Company company9 = faker1.company;
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number11 = faker10.number;
        faker1.number = number11;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Locale locale1 = new java.util.Locale("eng");
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en-GB");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setExtension('#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale9, random10);
        java.util.stream.DoubleStream doubleStream12 = random10.doubles();
        java.util.stream.IntStream intStream15 = random10.ints((int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale3, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (France)", "x-lvariant-eng");
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Japanese" + "'", str4, "Japanese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais (france) (X-LVARIANT-ENG)" + "'", str5, "fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jpn" + "'", str6, "jpn");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.Code code8 = faker1.code();
        java.util.Random random9 = new java.util.Random();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Lorem lorem11 = null;
        faker10.lorem = lorem11;
        com.github.javafaker.Internet internet13 = null;
        faker10.internet = internet13;
        java.lang.String str16 = faker10.bothify("");
        com.github.javafaker.Name name17 = faker10.name;
        com.github.javafaker.Business business18 = faker10.business;
        faker1.business = business18;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(name17);
        org.junit.Assert.assertNotNull(business18);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("fr_fr_HI!_eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr_fr_HI!_eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("France", (-1.9737120884369004d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.9737120884369004");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.lang.Class<?> wildcardClass4 = lorem3.getClass();
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale locale3 = new java.util.Locale("hi!", "EN-US", "");
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_EN-US");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Locale locale1 = new java.util.Locale("FR");
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        com.github.javafaker.Business business11 = faker0.business();
        java.lang.Class<?> wildcardClass12 = faker0.getClass();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.lang.String str11 = locale7.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "France" + "'", str11, "France");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Locale locale3 = new java.util.Locale("und", "en_US", "eng");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "und_EN_US_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und_EN_US_eng" + "'", str4, "und_EN_US_eng");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French", 0.23250748954156442d);
        java.util.Locale locale5 = new java.util.Locale("fran\347ais", "en-GB");
        boolean boolean6 = languageRange2.equals((java.lang.Object) "en-GB");
        org.junit.Assert.assertEquals(locale5.toString(), "fran\347ais_EN-GB");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        java.lang.String str13 = faker1.bothify("fr_fr_HI!_eng");
        java.lang.String str15 = faker1.numerify("eng");
        java.util.Random random16 = new java.util.Random();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Lorem lorem18 = null;
        faker17.lorem = lorem18;
        com.github.javafaker.Internet internet20 = null;
        faker17.internet = internet20;
        java.lang.String str23 = faker17.bothify("");
        com.github.javafaker.Code code24 = null;
        faker17.code = code24;
        com.github.javafaker.DateAndTime dateAndTime26 = faker17.date();
        faker1.dateAndTime = dateAndTime26;
        com.github.javafaker.Finance finance28 = faker1.finance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr_fr_HI!_eng" + "'", str13, "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(finance28);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (France)", "eng");
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (france)_ENG");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale1 = new java.util.Locale("en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for en-us");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "en-us");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random0.longs(10L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale locale12 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str15 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet14);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "x-lvariant-eng" + "'", str13, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("German");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "german");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles(3831662765844904176L, 0.8723839894517228d, 0.8386688759351253d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        int int5 = random1.nextInt();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 431529176 + "'", int5 == 431529176);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) (byte) 0);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) (byte) 0);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        boolean boolean7 = languageRange2.equals((java.lang.Object) locale5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-fr" + "'", str3, "fr-fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-fr" + "'", str4, "fr-fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        long long3 = random0.nextLong();
        java.util.stream.IntStream intStream4 = random0.ints();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2770006984297625d) + "'", double2 == (-0.2770006984297625d));
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-5067015723494352422L) + "'", long3 == (-5067015723494352422L));
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Random random1 = new java.util.Random((long) (-1347056262));
        java.util.stream.LongStream longStream3 = random1.longs(10L);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italian");
        java.lang.Object obj2 = null;
        boolean boolean3 = languageRange1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        random0.setSeed((long) (short) 10);
        java.util.stream.IntStream intStream8 = random0.ints(0L, 0, (int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random0.ints((long) (byte) 10, (int) 'x', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1750698565981668d) + "'", double2 == (-2.1750698565981668d));
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Locale locale1 = new java.util.Locale("en-US");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "en-us");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("it", 0.37479328637494624d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Locale locale1 = new java.util.Locale("German");
        org.junit.Assert.assertEquals(locale1.toString(), "german");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1);
// flaky:             org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: en-us_ENGLISH (UNITED KINGDOM) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Random random1 = new java.util.Random((long) (-1));
        java.util.stream.LongStream longStream4 = random1.longs(1L, (long) '4');
        boolean boolean5 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setScript("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random0.doubles((double) (short) 10, 0.465456655599197d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17122184910497293d) + "'", double2 == (-0.17122184910497293d));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Code code16 = null;
        faker9.code = code16;
        com.github.javafaker.Number number18 = faker9.number();
        faker0.number = number18;
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7599687556377636d + "'", double2 == 0.7599687556377636d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(number18);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber;
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Color color11 = faker8.color;
        com.github.javafaker.Finance finance12 = faker8.finance();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker8.phoneNumber();
        faker1.phoneNumber = phoneNumber13;
        com.github.javafaker.Options options15 = faker1.options();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(phoneNumber13);
        org.junit.Assert.assertNotNull(options15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Random random1 = new java.util.Random((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = random1.longs((long) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.Company company7 = faker1.company;
        com.github.javafaker.Internet internet8 = faker1.internet;
        com.github.javafaker.service.RandomService randomService9 = faker1.randomService;
        com.github.javafaker.Address address10 = faker1.address();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("EN-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: EN-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem;
        com.github.javafaker.Color color6 = faker4.color();
        com.github.javafaker.DateAndTime dateAndTime7 = faker4.dateAndTime;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44056686508616383d + "'", double1 == 0.44056686508616383d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        long long5 = random1.nextLong();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1853403699951111791L + "'", long5 == 1853403699951111791L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Color color9 = faker1.color;
        com.github.javafaker.Name name10 = faker1.name();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Locale locale2 = new java.util.Locale("Chinese (Taiwan)", "fra");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.lang.String str7 = locale2.getDisplayName(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale2.getUnicodeLocaleType("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "chinese (taiwan)_FRA");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinese (taiwan) (FRA)" + "'", str7, "chinese (taiwan) (FRA)");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setRegion("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        double double2 = random1.nextDouble();
        int int4 = random1.nextInt(1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        faker0.book = book6;
        com.github.javafaker.Options options8 = null;
        faker0.options = options8;
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9837222136463635d + "'", double2 == 0.9837222136463635d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Random random9 = new java.util.Random();
        double double10 = random9.nextDouble();
        int int12 = random9.nextInt(1);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random9);
        double double14 = random9.nextDouble();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale3, random9);
        java.util.stream.LongStream longStream16 = random9.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random9.longs(3831662765844904176L, (-5067015723494352422L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12802112093067708d + "'", double10 == 0.12802112093067708d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.257155854010495d + "'", double14 == 0.257155854010495d);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs((long) 1, (long) 1, 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (-1646791838));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        java.lang.String str6 = faker3.numerify("x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "x-lvariant-eng" + "'", str6, "x-lvariant-eng");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.Company company7 = faker1.company;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker1.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fran\347ais", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.Class<?> wildcardClass2 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japanese" + "'", str1, "Japanese");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Locale locale1 = new java.util.Locale("TW");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("jpn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: jpn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "tw");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Locale locale3 = new java.util.Locale("und", "en_US", "eng");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: und_EN_US_eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "und_EN_US_eng");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Locale locale2 = new java.util.Locale("en-us (ENGLISH (UNITED KINGDOM))", "Japanese");
        org.junit.Assert.assertEquals(locale2.toString(), "en-us (english (united kingdom))_JAPANESE");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("anglais (Royaume-Uni)");
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", 0.5743080827306978d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale1.getDisplayVariant(locale8);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it_IT" + "'", str1, "it_IT");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str4 = locale1.getExtension('x');
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Japanese");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Random random1 = new java.util.Random(1L);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream6 = random1.longs((long) 1, (long) 1, 100L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream10 = random1.longs(0L, 10L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguage("fra");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = new java.util.Locale("hi!", "en-US");
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_EN-US");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Locale locale1 = new java.util.Locale("en-US");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "en-us");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = new java.util.Locale("en-us", "English (United Kingdom)");
        java.util.Locale.setDefault(category0, locale3);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale1.getDisplayCountry(locale5);
        java.util.Set<java.lang.Character> charSet10 = locale1.getExtensionKeys();
        java.util.Locale locale14 = new java.util.Locale("", "", "");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.lang.String str16 = locale1.getDisplayLanguage(locale14);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Random random18 = new java.util.Random();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale17, random18);
        java.util.stream.DoubleStream doubleStream20 = random18.doubles();
        boolean boolean21 = random18.nextBoolean();
        double double22 = random18.nextGaussian();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random18);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale14, random18);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.27915026117610997d + "'", double22 == 0.27915026117610997d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "fr_FR");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        float float3 = random0.nextFloat();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1160225211722572d + "'", double2 == 1.1160225211722572d);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.50000036f + "'", float3 == 0.50000036f);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream6 = random0.longs((long) ' ', (long) (byte) 100, (long) 'u');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr-fr");
        java.util.Locale locale3 = new java.util.Locale("hi!");
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale3.getDisplayVariant(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        java.util.Set<java.lang.Character> charSet8 = locale5.getExtensionKeys();
        boolean boolean9 = languageRange1.equals((java.lang.Object) charSet8);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        java.lang.String str18 = faker10.bothify("fr_fr");
        com.github.javafaker.Options options19 = faker10.options;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.954653338805051d + "'", double7 == 0.954653338805051d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr_fr" + "'", str18, "fr_fr");
        org.junit.Assert.assertNotNull(options19);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        random1.setSeed((long) 10);
        java.util.stream.IntStream intStream8 = random1.ints((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('x', "");
        java.util.Locale locale7 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setRegion("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.util.Set<java.lang.Character> charSet9 = locale3.getExtensionKeys();
        java.lang.String str10 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-eng" + "'", str4, "x-lvariant-eng");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "x-lvariant-eng" + "'", str6, "x-lvariant-eng");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getVariant();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.lang.String str10 = locale5.getDisplayLanguage(locale7);
        java.lang.String str11 = locale5.getLanguage();
        java.lang.String str12 = locale1.getDisplayCountry(locale5);
        java.lang.String str13 = locale0.getDisplayCountry(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Canada" + "'", str13, "Canada");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!_EN-US_en-US could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi! (EN-US,en-US)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi! (en-us,en-us)");
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
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedkingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.IntStream intStream6 = random1.ints((long) 'u', 0, (int) (short) 1);
        java.util.stream.LongStream longStream8 = random1.longs((long) 'x');
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.Locale locale3 = new java.util.Locale("it_IT", "fran\347ais (France)", "fr_FR");
        boolean boolean5 = locale3.equals((java.lang.Object) 0.93101054f);
        org.junit.Assert.assertEquals(locale3.toString(), "it_it_FRAN\347AIS (FRANCE)_fr_FR");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random1.longs((-4964420948893066024L), (long) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream6 = random0.longs((long) ' ', (long) (byte) 100, (long) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random0.ints((-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Locale locale2 = new java.util.Locale("hi! (EN-US,en-US)", "en-GB");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! (en-us,en-us)_EN-GB could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi! (en-us,en-us)_EN-GB");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Locale locale2 = new java.util.Locale("ENGLISH (UNITED KINGDOM)", "en-GB");
        org.junit.Assert.assertEquals(locale2.toString(), "english (united kingdom)_EN-GB");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EN-US" + "'", str4, "EN-US");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        double double5 = random4.nextDouble();
        java.util.stream.IntStream intStream8 = random4.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Code code10 = faker9.code();
        faker1.code = code10;
        com.github.javafaker.Lorem lorem12 = faker1.lorem();
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker14.phoneNumber;
        faker1.phoneNumber = phoneNumber17;
        com.github.javafaker.Lorem lorem19 = faker1.lorem;
        com.github.javafaker.Company company20 = faker1.company();
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4852532378567298d + "'", double5 == 0.4852532378567298d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(lorem12);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNull(lorem19);
        org.junit.Assert.assertNotNull(company20);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Number number6 = faker1.number;
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale10);
        com.github.javafaker.Internet internet13 = faker12.internet();
        faker1.internet = internet13;
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setLanguage("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Random random3 = new java.util.Random((long) 'x');
        java.util.stream.IntStream intStream6 = random3.ints((int) '#', (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: en-us_ENGLISH (UNITED KINGDOM) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en-us_ENGLISH (UNITED KINGDOM)");
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale locale3 = new java.util.Locale("German", "fr-FR", "en");
        org.junit.Assert.assertEquals(locale3.toString(), "german_FR-FR_en");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Name name4 = faker1.name;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Lorem lorem7 = null;
        faker6.lorem = lorem7;
        com.github.javafaker.Color color9 = faker6.color;
        com.github.javafaker.Finance finance10 = faker6.finance();
        com.github.javafaker.Address address11 = faker6.address;
        com.github.javafaker.DateAndTime dateAndTime12 = faker6.dateAndTime;
        faker1.dateAndTime = dateAndTime12;
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Random random1 = new java.util.Random((long) ' ');
        int int2 = random1.nextInt();
        int int3 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1167796541) + "'", int2 == (-1167796541));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1891812663 + "'", int3 == 1891812663);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (short) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("x-lvariant-eng");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr-FR");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Random random1 = new java.util.Random((long) 431529176);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_us");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale3.getDisplayCountry(locale14);
        java.util.Locale locale19 = new java.util.Locale("hi!", "TW");
        java.lang.String str20 = locale3.getDisplayName(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale3.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Code code7 = faker0.code;
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        boolean boolean4 = random0.nextBoolean();
        long long5 = random0.nextLong();
        double double6 = random0.nextDouble();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4686628448068265d + "'", double1 == 0.4686628448068265d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5400292809851748286L + "'", long5 == 5400292809851748286L);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7158143270536341d + "'", double6 == 0.7158143270536341d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Business business2 = faker0.business();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Lorem lorem5 = null;
        faker4.lorem = lorem5;
        com.github.javafaker.Color color7 = faker4.color;
        com.github.javafaker.Finance finance8 = faker4.finance();
        com.github.javafaker.Address address9 = faker4.address;
        faker0.address = address9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        com.github.javafaker.Finance finance15 = faker12.finance;
        faker0.finance = finance15;
        com.github.javafaker.Address address17 = faker0.address;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(address17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (France)", "x-lvariant-eng");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Random random1 = new java.util.Random((long) (-1));
        java.util.stream.LongStream longStream4 = random1.longs(1L, (long) '4');
        java.util.stream.LongStream longStream6 = random1.longs((long) 0);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = locale4.getDisplayLanguage(locale6);
        java.lang.String str10 = locale4.getLanguage();
        java.lang.String str11 = locale0.getDisplayCountry(locale4);
        java.lang.String str12 = locale0.getDisplayVariant();
        java.lang.String str13 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "deu" + "'", str13, "deu");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options();
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.lang.String str13 = faker9.numerify("");
        com.github.javafaker.Company company14 = faker9.company;
        com.github.javafaker.Number number15 = faker9.number();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker9.phoneNumber;
        com.github.javafaker.Color color17 = faker9.color;
        faker0.color = color17;
        java.lang.String str20 = faker0.letterify("und");
        java.lang.String str22 = faker0.numerify("x-lvariant-eng");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = faker0.resolve("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(number15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "und" + "'", str20, "und");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "x-lvariant-eng" + "'", str22, "x-lvariant-eng");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random6.doubles();
        java.util.stream.IntStream intStream15 = random6.ints(4406628851294932275L);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8319072146943638d + "'", double7 == 0.8319072146943638d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.92690414f + "'", float11 == 0.92690414f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-753608540) + "'", int12 == (-753608540));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.Builder builder11 = builder6.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setRegion("x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.DateAndTime dateAndTime13 = null;
        faker12.dateAndTime = dateAndTime13;
        com.github.javafaker.Business business15 = faker12.business;
        faker1.business = business15;
        com.github.javafaker.PhoneNumber phoneNumber17 = faker1.phoneNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(business15);
        org.junit.Assert.assertNotNull(phoneNumber17);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.RandomService randomService5 = faker4.randomService;
        com.github.javafaker.Company company6 = faker4.company();
        com.github.javafaker.Finance finance7 = faker4.finance;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10422350400459346d + "'", double1 == 0.10422350400459346d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.lang.String str9 = locale3.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale3.getUnicodeLocaleAttributes();
        boolean boolean11 = locale3.hasExtensions();
        java.lang.String str12 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.Builder builder11 = builder6.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker1.phoneNumber;
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        java.util.stream.IntStream intStream17 = random13.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Code code19 = faker18.code();
        com.github.javafaker.Address address20 = faker18.address;
        com.github.javafaker.DateAndTime dateAndTime21 = faker18.date();
        java.lang.String str23 = faker18.bothify("fran\347ais");
        com.github.javafaker.DateAndTime dateAndTime24 = faker18.dateAndTime;
        faker1.dateAndTime = dateAndTime24;
        com.github.javafaker.Finance finance26 = faker1.finance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(phoneNumber12);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9317886977342825d + "'", double14 == 0.9317886977342825d);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(code19);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(dateAndTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
        org.junit.Assert.assertNotNull(dateAndTime24);
        org.junit.Assert.assertNotNull(finance26);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("und", (double) (-1167796541));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.167796541E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale locale3 = new java.util.Locale("FRA", "jpn", "en");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_JPN_en");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Random random1 = new java.util.Random((-4972683369271453960L));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.8386688759351253d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Locale locale2 = new java.util.Locale("France", "Canada");
        org.junit.Assert.assertEquals(locale2.toString(), "france_CANADA");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Random random1 = new java.util.Random((long) '4');
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) (short) 10);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Business business2 = faker0.business();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.Lorem lorem5 = null;
        faker4.lorem = lorem5;
        com.github.javafaker.Color color7 = faker4.color;
        com.github.javafaker.Finance finance8 = faker4.finance();
        com.github.javafaker.Address address9 = faker4.address;
        faker0.address = address9;
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        com.github.javafaker.Finance finance15 = faker12.finance;
        faker0.finance = finance15;
        com.github.javafaker.Options options17 = faker0.options;
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.lang.String str20 = locale19.getVariant();
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.lang.String str23 = locale21.getCountry();
        java.util.Random random24 = new java.util.Random();
        double double25 = random24.nextDouble();
        int int27 = random24.nextInt(1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale21, random24);
        com.github.javafaker.Business business29 = faker28.business;
        java.lang.String str31 = faker28.bothify("en-US");
        com.github.javafaker.Number number32 = faker28.number();
        java.lang.String str34 = faker28.numerify("");
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker();
        java.util.Random random36 = new java.util.Random();
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(random36);
        com.github.javafaker.Lorem lorem38 = null;
        faker37.lorem = lorem38;
        com.github.javafaker.PhoneNumber phoneNumber40 = faker37.phoneNumber;
        faker35.phoneNumber = phoneNumber40;
        com.github.javafaker.Business business42 = faker35.business;
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker();
        java.util.Random random44 = new java.util.Random();
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Lorem lorem46 = null;
        faker45.lorem = lorem46;
        com.github.javafaker.PhoneNumber phoneNumber48 = faker45.phoneNumber;
        faker43.phoneNumber = phoneNumber48;
        com.github.javafaker.Options options50 = faker43.options;
        faker35.options = options50;
        faker28.options = options50;
        faker0.options = options50;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FR" + "'", str23, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.8167672807273442d + "'", double25 == 0.8167672807273442d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en-US" + "'", str31, "en-US");
        org.junit.Assert.assertNotNull(number32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(phoneNumber40);
        org.junit.Assert.assertNotNull(business42);
        org.junit.Assert.assertNotNull(phoneNumber48);
        org.junit.Assert.assertNotNull(options50);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.Finance finance7 = faker0.finance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("und_EN_US_eng");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        java.util.stream.IntStream intStream14 = random6.ints((long) 'x');
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.502661817111705d + "'", double7 == 0.502661817111705d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.06469071f + "'", float11 == 0.06469071f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 349248668 + "'", int12 == 349248668);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.service.RandomService randomService4 = faker0.randomService;
        com.github.javafaker.Options options5 = faker0.options;
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.util.Random random10 = new java.util.Random();
        double double11 = random10.nextDouble();
        int int13 = random10.nextInt(1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale7, random10);
        com.github.javafaker.Business business15 = faker14.business;
        java.lang.String str17 = faker14.bothify("en-US");
        com.github.javafaker.Number number18 = faker14.number();
        java.lang.String str20 = faker14.numerify("");
        java.lang.String str22 = faker14.letterify("x-lvariant-eng");
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker();
        java.util.Random random24 = new java.util.Random();
        double double25 = random24.nextDouble();
        int int27 = random24.nextInt(1);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(random24);
        com.github.javafaker.Book book29 = faker28.book();
        faker23.book = book29;
        com.github.javafaker.Address address31 = faker23.address;
        faker14.address = address31;
        faker0.address = address31;
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR" + "'", str9, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6601483225793652d + "'", double11 == 0.6601483225793652d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(business15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-US" + "'", str17, "en-US");
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "x-lvariant-eng" + "'", str22, "x-lvariant-eng");
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.76397238290076d + "'", double25 == 0.76397238290076d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(book29);
        org.junit.Assert.assertNotNull(address31);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.Builder builder11 = builder6.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setVariant("en-us (ENGLISH (UNITED KINGDOM))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en-us (ENGLISH (UNITED KINGDOM)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRA" + "'", str1, "FRA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("france", "it_IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: france [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        java.util.stream.IntStream intStream7 = random3.ints((int) (short) -1, 100);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Code code9 = faker8.code;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream7 = random0.longs((long) (short) 1);
        float float8 = random0.nextFloat();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5258065302606779d + "'", double1 == 0.5258065302606779d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.1198526f + "'", float8 == 0.1198526f);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        java.lang.String str11 = faker5.bothify("");
        com.github.javafaker.Code code12 = null;
        faker5.code = code12;
        com.github.javafaker.Number number14 = faker5.number();
        faker1.number = number14;
        com.github.javafaker.Color color16 = faker1.color;
        com.github.javafaker.Book book17 = faker1.book;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(book17);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        int int3 = random0.nextInt(1);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.service.RandomService randomService5 = faker4.randomService;
        com.github.javafaker.Company company6 = faker4.company();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        java.lang.String str12 = faker8.numerify("hi!");
        java.util.Random random13 = new java.util.Random();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Lorem lorem15 = null;
        faker14.lorem = lorem15;
        java.lang.String str18 = faker14.numerify("hi!");
        com.github.javafaker.Color color19 = faker14.color;
        com.github.javafaker.Business business20 = faker14.business();
        java.util.Random random21 = new java.util.Random();
        double double22 = random21.nextDouble();
        int int24 = random21.nextInt(1);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Internet internet26 = faker25.internet();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker();
        java.util.Random random28 = new java.util.Random();
        double double29 = random28.nextDouble();
        int int31 = random28.nextInt(1);
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random28);
        com.github.javafaker.Book book33 = faker32.book();
        faker27.book = book33;
        com.github.javafaker.Address address35 = faker27.address;
        faker25.address = address35;
        faker14.address = address35;
        faker8.address = address35;
        faker4.address = address35;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9929574653846563d + "'", double1 == 0.9929574653846563d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(randomService5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(business20);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.8047321824253993d + "'", double22 == 0.8047321824253993d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(internet26);
// flaky:         org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.8189482409099489d + "'", double29 == 0.8189482409099489d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(book33);
        org.junit.Assert.assertNotNull(address35);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Address address7 = faker0.address;
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(address7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        boolean boolean4 = random1.nextBoolean();
        double double5 = random1.nextGaussian();
        java.util.stream.LongStream longStream6 = random1.longs();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.853082267219249d + "'", double5 == 1.853082267219249d);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Business business16 = faker9.business;
        faker5.business = business16;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker5.fakeValuesService;
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number20 = faker19.number;
        com.github.javafaker.Business business21 = faker19.business();
        java.util.Random random22 = new java.util.Random();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(random22);
        com.github.javafaker.Lorem lorem24 = null;
        faker23.lorem = lorem24;
        com.github.javafaker.Color color26 = faker23.color;
        com.github.javafaker.Finance finance27 = faker23.finance();
        com.github.javafaker.Address address28 = faker23.address;
        faker19.address = address28;
        java.util.Random random30 = new java.util.Random();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Lorem lorem32 = null;
        faker31.lorem = lorem32;
        java.util.Random random34 = new java.util.Random();
        double double35 = random34.nextDouble();
        java.util.stream.IntStream intStream38 = random34.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Code code40 = faker39.code();
        faker31.code = code40;
        com.github.javafaker.Lorem lorem42 = faker31.lorem();
        java.util.Random random43 = new java.util.Random();
        com.github.javafaker.Faker faker44 = new com.github.javafaker.Faker(random43);
        com.github.javafaker.Lorem lorem45 = null;
        faker44.lorem = lorem45;
        com.github.javafaker.PhoneNumber phoneNumber47 = faker44.phoneNumber;
        faker31.phoneNumber = phoneNumber47;
        com.github.javafaker.PhoneNumber phoneNumber49 = faker31.phoneNumber();
        com.github.javafaker.Code code50 = faker31.code;
        faker19.code = code50;
        faker5.code = code50;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1207641323202665d + "'", double1 == 0.1207641323202665d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(business21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(finance27);
        org.junit.Assert.assertNotNull(address28);
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.24530782263246165d + "'", double35 == 0.24530782263246165d);
        org.junit.Assert.assertNotNull(intStream38);
        org.junit.Assert.assertNotNull(code40);
        org.junit.Assert.assertNull(lorem42);
        org.junit.Assert.assertNotNull(phoneNumber47);
        org.junit.Assert.assertNotNull(phoneNumber49);
        org.junit.Assert.assertNotNull(code50);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("x-lvariant-eng");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Random random13 = new java.util.Random();
        double double14 = random13.nextDouble();
        int int16 = random13.nextInt(1);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale10, random13);
        com.github.javafaker.Business business18 = faker17.business;
        java.lang.String str20 = faker17.bothify("en-US");
        com.github.javafaker.Number number21 = faker17.number();
        java.lang.String str23 = faker17.numerify("");
        java.lang.String str25 = faker17.letterify("x-lvariant-eng");
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker();
        java.util.Random random27 = new java.util.Random();
        double double28 = random27.nextDouble();
        int int30 = random27.nextInt(1);
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random27);
        com.github.javafaker.Book book32 = faker31.book();
        faker26.book = book32;
        com.github.javafaker.Address address34 = faker26.address;
        faker17.address = address34;
        faker5.address = address34;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19751214057209143d + "'", double1 == 0.19751214057209143d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FR" + "'", str12, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9853107689652847d + "'", double14 == 0.9853107689652847d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-US" + "'", str20, "en-US");
        org.junit.Assert.assertNotNull(number21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "x-lvariant-eng" + "'", str25, "x-lvariant-eng");
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.34519441555104446d + "'", double28 == 0.34519441555104446d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(book32);
        org.junit.Assert.assertNotNull(address34);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Address address5 = faker1.address;
        com.github.javafaker.Name name6 = faker1.name();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.util.Random random12 = new java.util.Random();
        double double13 = random12.nextDouble();
        int int15 = random12.nextInt(1);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale9, random12);
        com.github.javafaker.Business business17 = faker16.business;
        java.lang.String str19 = faker16.bothify("en-US");
        com.github.javafaker.Number number20 = faker16.number();
        java.lang.String str22 = faker16.numerify("");
        java.util.Random random23 = new java.util.Random();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Lorem lorem25 = null;
        faker24.lorem = lorem25;
        java.lang.String str28 = faker24.numerify("");
        java.util.Random random29 = new java.util.Random();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Lorem lorem31 = null;
        faker30.lorem = lorem31;
        com.github.javafaker.Color color33 = faker30.color;
        faker24.color = color33;
        faker16.color = color33;
        faker0.color = color33;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = faker0.resolve("und");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FR" + "'", str11, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8169157769310574d + "'", double13 == 0.8169157769310574d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(business17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en-US" + "'", str19, "en-US");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        int int14 = random6.nextInt((int) 'u');
        java.util.stream.LongStream longStream15 = random6.longs();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.558094301416283d + "'", double7 == 0.558094301416283d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.6703204f + "'", float11 == 0.6703204f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1877394549 + "'", int12 == 1877394549);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 90 + "'", int14 == 90);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Business business16 = faker9.business;
        faker5.business = business16;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker5.fakeValuesService;
        com.github.javafaker.Address address19 = faker5.address();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4095468279910255d + "'", double1 == 0.4095468279910255d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(address19);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Random random1 = new java.util.Random((long) 797327740);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("it_IT", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Locale locale3 = new java.util.Locale("Franz\366sisch", "japonais", "en_US");
        org.junit.Assert.assertEquals(locale3.toString(), "franz\366sisch_JAPONAIS_en_US");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Random random1 = new java.util.Random((long) 1877394549);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Random random4 = new java.util.Random(1L);
        java.util.stream.LongStream longStream6 = random4.longs((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_fr");
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TW", (double) (-4972683369271453960L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.9726833692714537E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = new java.util.Locale("x-lvariant-eng", "", "");
        java.util.Locale.setDefault(category0, locale4);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: x-lvariant-eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale4.toString(), "x-lvariant-eng");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getVariant();
        java.lang.String str6 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Locale locale2 = new java.util.Locale("hi!", "en-US");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_EN-US");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setRegion("EN-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: EN-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Locale locale2 = new java.util.Locale("fr", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (France)", "x-lvariant-eng");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        double double11 = random6.nextGaussian();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Code code13 = faker12.code();
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        com.github.javafaker.Color color18 = faker15.color;
        com.github.javafaker.Finance finance19 = faker15.finance();
        faker12.finance = finance19;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.44487815871221437d + "'", double7 == 0.44487815871221437d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.19673982326898978d) + "'", double11 == (-0.19673982326898978d));
        org.junit.Assert.assertNotNull(code13);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(finance19);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Japanese");
        java.lang.Class<?> wildcardClass2 = languageRangeList1.getClass();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Locale locale3 = new java.util.Locale("it_IT", "fran\347ais (France)", "fr_FR");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.util.Random random10 = new java.util.Random();
        double double11 = random10.nextDouble();
        int int13 = random10.nextInt(1);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale7, random10);
        float float15 = random10.nextFloat();
        boolean boolean16 = locale3.equals((java.lang.Object) random10);
        org.junit.Assert.assertEquals(locale3.toString(), "it_it_FRAN\347AIS (FRANCE)_fr_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR" + "'", str9, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7458285624312576d + "'", double11 == 0.7458285624312576d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.66506845f + "'", float15 == 0.66506845f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet4 = faker3.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(internet4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = locale4.getDisplayLanguage(locale6);
        java.lang.String str10 = locale4.getLanguage();
        java.lang.String str11 = locale0.getDisplayCountry(locale4);
        java.lang.String str12 = locale4.getVariant();
        java.lang.String str13 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Name name8 = faker1.name;
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Number number10 = faker1.number();
        com.github.javafaker.Options options11 = faker1.options();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNull(internet9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(options11);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Set<java.lang.Character> charSet9 = locale5.getExtensionKeys();
        java.util.Set<java.lang.String> strSet10 = locale5.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        boolean boolean4 = random1.nextBoolean();
        double double5 = random1.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random1.longs((long) (byte) 10, 3831662765844904176L, (long) 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5870078365635112d + "'", double5 == 0.5870078365635112d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale locale6 = new java.util.Locale("hi!");
        java.lang.String str7 = locale6.getVariant();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = locale4.getDisplayLanguage(locale6);
        java.lang.String str10 = locale4.getLanguage();
        java.lang.String str11 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale13 = new java.util.Locale("chinese (taiwan) (FRA)");
        boolean boolean14 = locale0.equals((java.lang.Object) locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale13.toString(), "chinese (taiwan) (fra)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("eng");
        java.util.Locale locale8 = builder0.build();
        java.util.Random random10 = new java.util.Random(1L);
        java.util.stream.IntStream intStream13 = random10.ints((int) (byte) 1, (int) 'x');
        long long14 = random10.nextLong();
        java.util.stream.IntStream intStream15 = random10.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale8, random10);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: eng could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4964420948893066024L) + "'", long14 == (-4964420948893066024L));
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream6 = random0.longs((long) ' ', (long) (byte) 100, (long) 'u');
        double double7 = random0.nextGaussian();
        java.util.stream.IntStream intStream8 = random0.ints();
        long long9 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7342676417612181d + "'", double7 == 0.7342676417612181d);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-5840481468076583919L) + "'", long9 == (-5840481468076583919L));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        com.github.javafaker.Internet internet18 = null;
        faker15.internet = internet18;
        com.github.javafaker.Number number20 = faker15.number;
        com.github.javafaker.Address address21 = faker15.address;
        faker10.address = address21;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.16830086894504404d + "'", double7 == 0.16830086894504404d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(address21);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eng");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinese (taiwan) (FRA)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese(taiwan)(fra)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", 0.18383286203839433d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.18383286203839433d + "'", double3 == 0.18383286203839433d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        int int14 = random6.nextInt((int) 'u');
        double double15 = random6.nextDouble();
        int int17 = random6.nextInt(100);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3532861443783706d + "'", double7 == 0.3532861443783706d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.36924016f + "'", float11 == 0.36924016f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-938122935) + "'", int12 == (-938122935));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.24719496338222013d + "'", double15 == 0.24719496338222013d);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber;
        com.github.javafaker.Color color9 = faker1.color;
        java.util.Random random10 = new java.util.Random();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Lorem lorem12 = null;
        faker11.lorem = lorem12;
        java.lang.String str15 = faker11.numerify("");
        com.github.javafaker.Company company16 = faker11.company;
        com.github.javafaker.Number number17 = faker11.number();
        com.github.javafaker.PhoneNumber phoneNumber18 = faker11.phoneNumber;
        faker1.phoneNumber = phoneNumber18;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(company16);
        org.junit.Assert.assertNotNull(number17);
        org.junit.Assert.assertNotNull(phoneNumber18);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english (united kingdom)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Locale locale3 = new java.util.Locale("hi! (EN-US,en-US)", "Italian", "fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertEquals(locale3.toString(), "hi! (en-us,en-us)_ITALIAN_fran\347ais (france) (X-LVARIANT-ENG)");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.lang.String str9 = locale7.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!_EN-US_en-US could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Locale locale3 = new java.util.Locale("German", "chinese (taiwan) (FRA)", "French");
        org.junit.Assert.assertEquals(locale3.toString(), "german_CHINESE (TAIWAN) (FRA)_French");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.954653338805051d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Name name4 = faker1.name;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Lorem lorem7 = null;
        faker6.lorem = lorem7;
        com.github.javafaker.Finance finance9 = faker6.finance;
        faker1.finance = finance9;
        com.github.javafaker.Book book11 = faker1.book();
        com.github.javafaker.Business business12 = null;
        faker1.business = business12;
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setVariant("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream5 = random1.ints((-1), (int) (short) 10);
        java.util.stream.LongStream longStream6 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (-1347056262));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Locale locale3 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str5 = locale3.getExtension('u');
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale9);
        java.lang.String str12 = locale3.getDisplayLanguage(locale9);
        java.lang.String str13 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EN-US" + "'", str13, "EN-US");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        java.lang.String str18 = faker10.letterify("x-lvariant-eng");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        java.util.Random random20 = new java.util.Random();
        double double21 = random20.nextDouble();
        int int23 = random20.nextInt(1);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Book book25 = faker24.book();
        faker19.book = book25;
        com.github.javafaker.Address address27 = faker19.address;
        faker10.address = address27;
        com.github.javafaker.Business business29 = faker10.business;
        com.github.javafaker.Options options30 = faker10.options;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8674052674794446d + "'", double7 == 0.8674052674794446d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "x-lvariant-eng" + "'", str18, "x-lvariant-eng");
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.06445737151945574d + "'", double21 == 0.06445737151945574d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(book25);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertNotNull(options30);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Book book7 = faker1.book;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.lang.String str13 = faker9.numerify("");
        java.util.Random random14 = new java.util.Random();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Lorem lorem16 = null;
        faker15.lorem = lorem16;
        com.github.javafaker.Color color18 = faker15.color;
        faker9.color = color18;
        java.lang.String str21 = faker9.bothify("fr_fr_HI!_eng");
        com.github.javafaker.DateAndTime dateAndTime22 = faker9.date();
        faker1.dateAndTime = dateAndTime22;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr_fr_HI!_eng" + "'", str21, "fr_fr_HI!_eng");
        org.junit.Assert.assertNotNull(dateAndTime22);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Options options4 = faker1.options;
        com.github.javafaker.Name name5 = faker1.name;
        com.github.javafaker.DateAndTime dateAndTime6 = faker1.dateAndTime;
        com.github.javafaker.Business business7 = faker1.business();
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("japonais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setUnicodeLocaleKeyword("", "Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("japonais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", 0.18383286203839433d);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("en-us", 0.6236560371556241d);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("Italian");
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("eng");
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("fr-x-lvariant-eng");
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("fr");
        double double25 = languageRange24.getWeight();
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("TW");
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("fr-FR", (double) (byte) 0);
        double double31 = languageRange30.getWeight();
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange36 = new java.util.Locale.LanguageRange("fr", 0.5743080827306978d);
        java.util.Locale.LanguageRange languageRange38 = new java.util.Locale.LanguageRange("fr");
        java.util.Locale.LanguageRange languageRange40 = new java.util.Locale.LanguageRange("fr-fr");
        java.util.Locale.LanguageRange languageRange43 = new java.util.Locale.LanguageRange("japonais", 0.233656874384779d);
        java.util.Locale.LanguageRange languageRange45 = new java.util.Locale.LanguageRange("TW");
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange5, languageRange8, languageRange10, languageRange12, languageRange14, languageRange16, languageRange18, languageRange20, languageRange22, languageRange24, languageRange27, languageRange30, languageRange33, languageRange36, languageRange38, languageRange40, languageRange43, languageRange45 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Collection<java.util.Locale> localeCollection49 = null;
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, localeCollection49, filteringMode50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Locale locale2 = new java.util.Locale("hi!", "TW");
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_TW");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 0);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Locale locale3 = new java.util.Locale("und", "", "France");
        org.junit.Assert.assertEquals(locale3.toString(), "und__France");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("fra");
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: franc?ais (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale locale1 = new java.util.Locale("fr-fr");
        java.lang.String str2 = locale1.getVariant();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "fr-fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "fr-fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "fr-fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "fr-fr");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.addUnicodeLocaleAttribute("en-us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! (Taiwan)" + "'", str2, "hi! (Taiwan)");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.11326744703628011d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Locale locale3 = new java.util.Locale("en-US", "fran\347ais (France)", "fr_FR");
        org.junit.Assert.assertEquals(locale3.toString(), "en-us_FRAN\347AIS (FRANCE)_fr_FR");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Locale locale2 = new java.util.Locale("French", "eng");
        java.util.Random random4 = new java.util.Random(6491242495114442290L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: french_ENG could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_ENG");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("france");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Locale locale3 = new java.util.Locale("", "en-GB", "it");
        org.junit.Assert.assertEquals(locale3.toString(), "_EN-GB_it");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setLanguageTag("en-us (ENGLISH (UNITED KINGDOM))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: us (ENGLISH (UNITED KINGDOM)) [at index 3]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale locale1 = new java.util.Locale("x-lvariant-eng");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "x-lvariant-eng");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Locale locale3 = new java.util.Locale("hi!", "en-US", "en-US");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayName();
        boolean boolean6 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_EN-US_en-US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-US" + "'", str4, "en-US");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! (EN-US,en-US)" + "'", str5, "hi! (EN-US,en-US)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.DateAndTime dateAndTime10 = faker1.date();
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.DateAndTime dateAndTime13 = null;
        faker12.dateAndTime = dateAndTime13;
        com.github.javafaker.Business business15 = faker12.business;
        faker1.business = business15;
        com.github.javafaker.Code code17 = faker1.code();
        com.github.javafaker.Business business18 = faker1.business();
        java.util.Random random19 = new java.util.Random();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Lorem lorem21 = null;
        faker20.lorem = lorem21;
        com.github.javafaker.PhoneNumber phoneNumber23 = faker20.phoneNumber;
        com.github.javafaker.Color color24 = faker20.color();
        faker1.color = color24;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(business15);
        org.junit.Assert.assertNull(code17);
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(phoneNumber23);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Code code5 = faker4.code;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number7 = faker6.number();
        faker4.number = number7;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        com.github.javafaker.Color color7 = faker1.color();
        com.github.javafaker.Company company8 = faker1.company();
        com.github.javafaker.Address address9 = faker1.address();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(address9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Name name6 = faker1.name;
        com.github.javafaker.Code code7 = faker1.code;
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale11);
        com.github.javafaker.Business business14 = faker13.business();
        faker1.business = business14;
        com.github.javafaker.Address address16 = faker1.address();
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(business14);
        org.junit.Assert.assertNotNull(address16);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        double double3 = random0.nextDouble();
        java.util.stream.LongStream longStream4 = random0.longs();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.101438848950365d + "'", double2 == 1.101438848950365d);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.41697264485398056d + "'", double3 == 0.41697264485398056d);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = locale3.getDisplayCountry(locale14);
        java.util.Locale locale19 = new java.util.Locale("hi!", "TW");
        java.lang.String str20 = locale3.getDisplayName(locale19);
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Name name4 = faker1.name;
        java.util.Random random5 = new java.util.Random();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Lorem lorem7 = null;
        faker6.lorem = lorem7;
        com.github.javafaker.Finance finance9 = faker6.finance;
        faker1.finance = finance9;
        com.github.javafaker.Book book11 = faker1.book();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = faker1.resolve("Franz\366sisch");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getISO3Language();
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for fr_fr");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra", 0.7081031632538951d);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("FR");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList32, filteringMode33);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap36);
        java.util.Locale locale39 = new java.util.Locale("hi!");
        java.lang.String str40 = locale39.getVariant();
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.lang.String str42 = locale39.getDisplayVariant(locale41);
        java.lang.String str43 = locale41.getCountry();
        java.lang.String str44 = locale41.getDisplayLanguage();
        java.util.Locale locale45 = java.util.Locale.JAPANESE;
        java.lang.String str46 = locale41.getDisplayScript(locale45);
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.lang.String str48 = locale41.getDisplayCountry(locale47);
        java.util.Set<java.lang.String> strSet49 = locale41.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet49);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode33.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "FR" + "'", str43, "FR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "French" + "'", str44, "French");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "France" + "'", str48, "France");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strList50);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-us" + "'", str2, "en-us");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("");
        com.github.javafaker.Code code8 = null;
        faker1.code = code8;
        com.github.javafaker.Number number10 = faker1.number();
        com.github.javafaker.Finance finance11 = faker1.finance();
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getVariant();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = locale13.getDisplayVariant(locale15);
        java.lang.String str17 = locale15.getCountry();
        java.util.Random random18 = new java.util.Random();
        double double19 = random18.nextDouble();
        int int21 = random18.nextInt(1);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale15, random18);
        com.github.javafaker.Business business23 = faker22.business;
        java.lang.String str25 = faker22.bothify("en-US");
        com.github.javafaker.Number number26 = faker22.number();
        java.lang.String str28 = faker22.numerify("");
        java.util.Random random29 = new java.util.Random();
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Lorem lorem31 = null;
        faker30.lorem = lorem31;
        java.lang.String str34 = faker30.numerify("");
        java.util.Random random35 = new java.util.Random();
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(random35);
        com.github.javafaker.Lorem lorem37 = null;
        faker36.lorem = lorem37;
        com.github.javafaker.Color color39 = faker36.color;
        faker30.color = color39;
        faker22.color = color39;
        faker1.color = color39;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FR" + "'", str17, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.05266733846572935d + "'", double19 == 0.05266733846572935d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(business23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en-US" + "'", str25, "en-US");
        org.junit.Assert.assertNotNull(number26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet10);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.util.Locale locale18 = new java.util.Locale("hi!");
        java.lang.String str19 = locale18.getVariant();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.lang.String str21 = locale16.getDisplayLanguage(locale18);
        java.lang.String str22 = locale16.getLanguage();
        java.lang.String str23 = locale12.getDisplayCountry(locale16);
        java.lang.String str24 = locale3.getDisplayLanguage(locale12);
        java.lang.String str25 = locale12.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch" + "'", str24, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "de" + "'", str25, "de");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Locale locale1 = new java.util.Locale("fr_fr");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr_fr" + "'", str2, "fr_fr");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Name name6 = faker1.name;
        com.github.javafaker.Code code7 = faker1.code;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.lang.String str13 = faker9.numerify("hi!");
        com.github.javafaker.Color color14 = faker9.color;
        java.util.Random random15 = new java.util.Random();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Lorem lorem17 = null;
        faker16.lorem = lorem17;
        java.lang.String str20 = faker16.numerify("");
        com.github.javafaker.Company company21 = faker16.company;
        com.github.javafaker.Options options22 = faker16.options();
        faker9.options = options22;
        faker1.options = options22;
        java.util.Random random25 = new java.util.Random();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Lorem lorem27 = null;
        faker26.lorem = lorem27;
        java.lang.String str30 = faker26.numerify("");
        com.github.javafaker.Company company31 = faker26.company;
        com.github.javafaker.Number number32 = faker26.number();
        com.github.javafaker.PhoneNumber phoneNumber33 = faker26.phoneNumber;
        com.github.javafaker.Business business34 = faker26.business();
        faker1.business = business34;
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(company21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(company31);
        org.junit.Assert.assertNotNull(number32);
        org.junit.Assert.assertNotNull(phoneNumber33);
        org.junit.Assert.assertNotNull(business34);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        com.github.javafaker.Business business11 = faker10.business;
        java.lang.String str13 = faker10.bothify("en-US");
        com.github.javafaker.Number number14 = faker10.number();
        java.lang.String str16 = faker10.numerify("");
        java.lang.String str18 = faker10.letterify("x-lvariant-eng");
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker();
        java.util.Random random20 = new java.util.Random();
        double double21 = random20.nextDouble();
        int int23 = random20.nextInt(1);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Book book25 = faker24.book();
        faker19.book = book25;
        com.github.javafaker.Address address27 = faker19.address;
        faker10.address = address27;
        com.github.javafaker.Business business29 = faker10.business;
        java.util.Random random30 = new java.util.Random();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Lorem lorem32 = null;
        faker31.lorem = lorem32;
        java.lang.String str35 = faker31.numerify("hi!");
        com.github.javafaker.Lorem lorem36 = faker31.lorem;
        java.util.Random random37 = new java.util.Random();
        double double38 = random37.nextDouble();
        int int40 = random37.nextInt(1);
        com.github.javafaker.Faker faker41 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.service.RandomService randomService42 = faker41.randomService;
        faker31.randomService = randomService42;
        faker10.randomService = randomService42;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker();
        java.util.Random random46 = new java.util.Random();
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(random46);
        com.github.javafaker.Lorem lorem48 = null;
        faker47.lorem = lorem48;
        com.github.javafaker.PhoneNumber phoneNumber50 = faker47.phoneNumber;
        faker45.phoneNumber = phoneNumber50;
        com.github.javafaker.Options options52 = faker45.options();
        com.github.javafaker.service.RandomService randomService53 = faker45.randomService;
        com.github.javafaker.DateAndTime dateAndTime54 = faker45.date();
        faker10.dateAndTime = dateAndTime54;
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.33449038649612306d + "'", double7 == 0.33449038649612306d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(business11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "x-lvariant-eng" + "'", str18, "x-lvariant-eng");
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.3700359799059705d + "'", double21 == 0.3700359799059705d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(book25);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertNotNull(business29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(lorem36);
// flaky:         org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.78606644586214d + "'", double38 == 0.78606644586214d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(randomService42);
        org.junit.Assert.assertNotNull(phoneNumber50);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(randomService53);
        org.junit.Assert.assertNotNull(dateAndTime54);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Business business10 = faker9.business();
        faker0.business = business10;
        java.util.Random random12 = new java.util.Random();
        double double13 = random12.nextDouble();
        java.util.stream.IntStream intStream16 = random12.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem18 = faker17.lorem();
        faker0.lorem = lorem18;
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(business10);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5400121278834791d + "'", double13 == 0.5400121278834791d);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(lorem18);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        double double2 = random0.nextGaussian();
        double double3 = random0.nextDouble();
        double double4 = random0.nextGaussian();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3100163400773778d) + "'", double2 == (-0.3100163400773778d));
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.09960496504928851d + "'", double3 == 0.09960496504928851d);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.31530574079108603d) + "'", double4 == (-0.31530574079108603d));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("japonais");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Locale locale3 = new java.util.Locale("fr", "eng", "English (United Kingdom)");
        org.junit.Assert.assertEquals(locale3.toString(), "fr_ENG_English (United Kingdom)");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("de");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.lang.String str8 = locale3.getDisplayLanguage(locale5);
        java.lang.String str9 = locale3.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale3.getUnicodeLocaleAttributes();
        boolean boolean11 = locale3.hasExtensions();
        java.lang.String str12 = locale3.getDisplayScript();
        java.lang.Object obj13 = null;
        boolean boolean14 = locale3.equals(obj13);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Address address7 = faker5.address;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        com.github.javafaker.Internet internet12 = null;
        faker9.internet = internet12;
        java.lang.String str15 = faker9.bothify("");
        com.github.javafaker.Business business16 = faker9.business;
        faker5.business = business16;
        com.github.javafaker.service.FakeValuesService fakeValuesService18 = faker5.fakeValuesService;
        com.github.javafaker.service.RandomService randomService19 = faker5.randomService;
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9691468818845799d + "'", double1 == 0.9691468818845799d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(fakeValuesService18);
        org.junit.Assert.assertNotNull(randomService19);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category4);
        java.lang.String str7 = locale6.getDisplayName();
        boolean boolean8 = locale3.equals((java.lang.Object) locale6);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker1.phoneNumber();
        com.github.javafaker.Lorem lorem17 = faker1.lorem;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.470003224369955d + "'", double8 == 0.470003224369955d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNull(lorem17);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-US");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList41, filteringMode42);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList14, filteringMode42);
        java.util.Collection<java.util.Locale> localeCollection45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, localeCollection45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) (-938122935), (long) 'a', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7293899538384154d + "'", double1 == 0.7293899538384154d);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("France", 0.9885884173953309d);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france" + "'", str3, "france");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9885884173953309d + "'", double4 == 0.9885884173953309d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Random random1 = new java.util.Random((long) ' ');
        int int2 = random1.nextInt();
        java.util.Random random3 = new java.util.Random();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random3);
        double double5 = random3.nextGaussian();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        random3.nextBytes(byteArray11);
        random1.nextBytes(byteArray11);
        double double14 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1167796541) + "'", int2 == (-1167796541));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.9694884958308563d) + "'", double5 == (-0.9694884958308563d));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[55, -59, -62, 112, 34]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2413718236526089d + "'", double14 == 0.2413718236526089d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance3 = faker2.finance;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        com.github.javafaker.Lorem lorem6 = null;
        faker5.lorem = lorem6;
        com.github.javafaker.Internet internet8 = null;
        faker5.internet = internet8;
        com.github.javafaker.Name name10 = faker5.name;
        com.github.javafaker.DateAndTime dateAndTime11 = faker5.dateAndTime;
        faker2.dateAndTime = dateAndTime11;
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        com.github.javafaker.Company company6 = faker1.company;
        com.github.javafaker.Number number7 = faker1.number();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number9 = faker8.number;
        com.github.javafaker.Business business10 = faker8.business();
        java.util.Random random11 = new java.util.Random();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Lorem lorem13 = null;
        faker12.lorem = lorem13;
        com.github.javafaker.Color color15 = faker12.color;
        com.github.javafaker.Finance finance16 = faker12.finance();
        com.github.javafaker.Address address17 = faker12.address;
        faker8.address = address17;
        faker1.address = address17;
        com.github.javafaker.Address address20 = faker1.address;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertNotNull(address20);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale locale2 = new java.util.Locale("Canada", "fr_FR");
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale6.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale6.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayLanguage();
        java.lang.String str15 = locale2.getDisplayVariant(locale12);
        java.lang.String str16 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "canada_FR_FR");
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French" + "'", str9, "French");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "canada" + "'", str16, "canada");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Number number6 = faker1.number;
        com.github.javafaker.Name name7 = faker1.name();
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("");
        java.util.Random random6 = new java.util.Random();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Lorem lorem8 = null;
        faker7.lorem = lorem8;
        com.github.javafaker.Color color10 = faker7.color;
        faker1.color = color10;
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = faker1.fakeValuesService;
        java.lang.String str14 = faker1.bothify("French (France)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French (France)" + "'", str14, "French (France)");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale2 = new java.util.Locale("hi!", "en-US");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_EN-US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        com.github.javafaker.Number number6 = faker1.number;
        com.github.javafaker.Number number7 = faker1.number;
        java.util.Random random8 = new java.util.Random();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Lorem lorem10 = null;
        faker9.lorem = lorem10;
        java.util.Random random12 = new java.util.Random();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Lorem lorem14 = null;
        faker13.lorem = lorem14;
        java.lang.String str17 = faker13.numerify("");
        com.github.javafaker.Company company18 = faker13.company;
        com.github.javafaker.Number number19 = faker13.number();
        com.github.javafaker.service.FakeValuesService fakeValuesService20 = faker13.fakeValuesService;
        faker9.fakeValuesService = fakeValuesService20;
        com.github.javafaker.Company company22 = faker9.company();
        faker1.company = company22;
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(company18);
        org.junit.Assert.assertNotNull(number19);
        org.junit.Assert.assertNotNull(fakeValuesService20);
        org.junit.Assert.assertNotNull(company22);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.service.RandomService randomService4 = null;
        faker1.randomService = randomService4;
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.lang.String str8 = faker1.numerify("hi! (Taiwan)");
        org.junit.Assert.assertNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (Taiwan)" + "'", str8, "hi! (Taiwan)");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        java.lang.String str5 = faker1.numerify("hi!");
        com.github.javafaker.Lorem lorem6 = faker1.lorem;
        java.util.Random random7 = new java.util.Random();
        double double8 = random7.nextDouble();
        int int10 = random7.nextInt(1);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.service.RandomService randomService12 = faker11.randomService;
        faker1.randomService = randomService12;
        com.github.javafaker.Finance finance14 = faker1.finance();
        com.github.javafaker.Lorem lorem15 = faker1.lorem();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker1.phoneNumber();
        com.github.javafaker.Lorem lorem17 = faker1.lorem();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5826529591040864d + "'", double8 == 0.5826529591040864d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(randomService12);
        org.junit.Assert.assertNotNull(finance14);
        org.junit.Assert.assertNull(lorem15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNull(lorem17);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Number number5 = faker3.number;
        com.github.javafaker.Name name6 = faker3.name;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = faker0.fakeValuesService;
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("fr_FR", "hi!", "eng");
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        java.util.Locale locale12 = locale4.stripExtensions();
        java.util.Locale locale15 = new java.util.Locale("fran\347ais (France)", "x-lvariant-eng");
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getDisplayName();
        java.lang.String str18 = locale15.getDisplayName(locale16);
        java.lang.String str19 = locale4.getDisplayName(locale16);
        java.util.Locale locale21 = new java.util.Locale("TW");
        boolean boolean22 = locale16.equals((java.lang.Object) locale21);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "fr_fr_HI!_eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "x-lvariant-eng" + "'", str10, "x-lvariant-eng");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale15.toString(), "fran\347ais (france)_X-LVARIANT-ENG");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "japonais" + "'", str17, "japonais");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais (france) (X-LVARIANT-ENG)" + "'", str18, "fran\347ais (france) (X-LVARIANT-ENG)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale21.toString(), "tw");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem3 = null;
        faker2.lorem = lorem3;
        com.github.javafaker.PhoneNumber phoneNumber5 = faker2.phoneNumber;
        faker0.phoneNumber = phoneNumber5;
        com.github.javafaker.Options options7 = faker0.options;
        com.github.javafaker.Finance finance8 = faker0.finance();
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", 0.42299425222543996d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) (short) 0, 10.0d);
        java.util.stream.LongStream longStream10 = random1.longs();
        java.util.stream.LongStream longStream13 = random1.longs((long) (byte) -1, (long) (byte) 1);
        double double14 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream17 = random1.doubles(0.0d, 0.5176661761233249d);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.1725897588237115d) + "'", double14 == (-0.1725897588237115d));
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Color color4 = faker1.color;
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Address address6 = faker1.address;
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.dateAndTime;
        com.github.javafaker.Lorem lorem8 = faker1.lorem;
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(lorem8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setScript("FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FRA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("it_IT", 0.45999038268623815d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Locale locale2 = new java.util.Locale("fr_fr_HI!_eng", "en-us (ENGLISH (UNITED KINGDOM))");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_hi!_eng_EN-US (ENGLISH (UNITED KINGDOM))");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Random random4 = new java.util.Random();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3, random4);
        java.util.stream.DoubleStream doubleStream6 = random4.doubles();
        boolean boolean7 = random4.nextBoolean();
        double double8 = random4.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale1, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fr_fr could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.6440507809595901d + "'", double8 == 1.6440507809595901d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi! (EN-US,en-US)", 0.9472728803143428d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi! (en-us,en-us)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        com.github.javafaker.Color color7 = faker5.color;
        java.util.Random random9 = new java.util.Random(6785130368950820155L);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        com.github.javafaker.Code code11 = faker10.code;
        com.github.javafaker.PhoneNumber phoneNumber12 = faker10.phoneNumber();
        faker5.phoneNumber = phoneNumber12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = faker5.resolve("Japanese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4512776551502544d + "'", double1 == 0.4512776551502544d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Random random1 = new java.util.Random((long) (byte) 1);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        random1.nextBytes(byteArray3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        float float6 = random1.nextFloat();
        java.util.stream.LongStream longStream7 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random1.ints((int) 'x', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[115]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.100473166f + "'", float6 == 0.100473166f);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.fakeValuesService;
        com.github.javafaker.Company company6 = faker0.company();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = null;
        faker0.code = code1;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Business business10 = faker9.business();
        faker0.business = business10;
        com.github.javafaker.Book book12 = faker0.book();
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais", "en-GB");
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais_EN-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (EN-GB)" + "'", str3, "fran\347ais (EN-GB)");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.IntStream intStream4 = random0.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code6 = faker5.code();
        java.util.Random random7 = new java.util.Random();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Lorem lorem9 = null;
        faker8.lorem = lorem9;
        com.github.javafaker.Internet internet11 = null;
        faker8.internet = internet11;
        java.lang.String str14 = faker8.bothify("");
        com.github.javafaker.Code code15 = null;
        faker8.code = code15;
        com.github.javafaker.DateAndTime dateAndTime17 = faker8.date();
        faker5.dateAndTime = dateAndTime17;
        java.util.Random random19 = new java.util.Random();
        double double20 = random19.nextDouble();
        java.util.stream.IntStream intStream23 = random19.ints((int) (short) -1, 0);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(random19);
        com.github.javafaker.Code code25 = faker24.code();
        com.github.javafaker.DateAndTime dateAndTime26 = faker24.date();
        faker5.dateAndTime = dateAndTime26;
        com.github.javafaker.Book book28 = faker5.book();
        com.github.javafaker.DateAndTime dateAndTime29 = faker5.date();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014193036732637054d + "'", double1 == 0.014193036732637054d);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateAndTime17);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6582316333380164d + "'", double20 == 0.6582316333380164d);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(code25);
        org.junit.Assert.assertNotNull(dateAndTime26);
        org.junit.Assert.assertNotNull(book28);
        org.junit.Assert.assertNotNull(dateAndTime29);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name4 = faker3.name;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Random random0 = new java.util.Random();
        double double1 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream2 = random0.doubles();
        java.util.stream.LongStream longStream6 = random0.longs((long) 431529176, (long) (-1780303639), 1853403699951111791L);
        int int7 = random0.nextInt();
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5852044729920513d + "'", double1 == 0.5852044729920513d);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2092345703) + "'", int7 == (-2092345703));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Locale locale3 = new java.util.Locale("en_US", "France", "");
        java.util.Locale locale5 = new java.util.Locale("en-us");
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        org.junit.Assert.assertEquals(locale3.toString(), "en_us_FRANCE");
        org.junit.Assert.assertEquals(locale5.toString(), "en-us");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en_us" + "'", str6, "en_us");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.lang.String str5 = locale3.getCountry();
        java.util.Random random6 = new java.util.Random();
        double double7 = random6.nextDouble();
        int int9 = random6.nextInt(1);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale3, random6);
        float float11 = random6.nextFloat();
        int int12 = random6.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random6.doubles();
        java.util.stream.LongStream longStream15 = random6.longs((long) 10);
        long long16 = random6.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream20 = random6.doubles((long) (short) 100, 0.9023872490135806d, 0.4477901137884187d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FR" + "'", str5, "FR");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.20975531372759781d + "'", double7 == 0.20975531372759781d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.04494208f + "'", float11 == 0.04494208f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2033970609) + "'", int12 == (-2033970609));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1568115403404280591L + "'", long16 == 1568115403404280591L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) (byte) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Number number1 = faker0.number;
        com.github.javafaker.Number number2 = faker0.number();
        java.lang.String str4 = faker0.bothify("en-GB");
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code7 = null;
        faker6.code = code7;
        com.github.javafaker.Lorem lorem9 = faker6.lorem();
        faker0.lorem = lorem9;
        com.github.javafaker.Finance finance11 = faker0.finance();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("japonais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "fr_FR");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Random random1 = new java.util.Random(1L);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.561581040188955d + "'", double4 == 1.561581040188955d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Random random0 = new java.util.Random();
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem2 = null;
        faker1.lorem = lorem2;
        com.github.javafaker.Internet internet4 = null;
        faker1.internet = internet4;
        java.lang.String str7 = faker1.bothify("French (France)");
        com.github.javafaker.PhoneNumber phoneNumber8 = faker1.phoneNumber();
        com.github.javafaker.Internet internet9 = faker1.internet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (France)" + "'", str7, "French (France)");
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNull(internet9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", 0.001448450632829834d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Locale locale3 = new java.util.Locale("FR", "TW", "German");
        java.util.Locale locale5 = new java.util.Locale("hi!");
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale3);
        java.lang.String str14 = faker12.bothify("French");
        org.junit.Assert.assertEquals(locale3.toString(), "fr_TW_German");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
    }
}
