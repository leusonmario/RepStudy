import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.util.Random random1 = new java.util.Random((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random1.doubles((double) 0.5485702f, (double) 0.07480401f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.util.Locale locale1 = new java.util.Locale("Chinese");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setRegion("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random(100L);
        double double4 = random3.nextGaussian();
        random3.setSeed((long) (-1157793070));
        double double7 = random3.nextGaussian();
        boolean boolean8 = random3.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Address address10 = faker9.address();
        com.github.javafaker.Code code11 = faker9.code();
        com.github.javafaker.Book book12 = faker9.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09760425216810112d + "'", double7 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(book12);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Finance finance6 = faker0.finance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setRegion("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setScript("JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale5 = new java.util.Locale("italien (Italie)", "ITA", "zh_CN");
        boolean boolean6 = locale0.equals((java.lang.Object) "ITA");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals(locale5.toString(), "italien (italie)_ITA_zh_CN");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10);
        int int9 = random0.nextInt();
        float float10 = random0.nextFloat();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.23805428f + "'", float2 == 0.23805428f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1791901469 + "'", int4 == 1791901469);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1947844456 + "'", int9 == 1947844456);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.42169613f + "'", float10 == 0.42169613f);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italian");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.Locale locale1 = new java.util.Locale("English (United Kingdom)");
        org.junit.Assert.assertEquals(locale1.toString(), "english (united kingdom)");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale8 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Random random12 = new java.util.Random((long) (short) 1);
        int int13 = random12.nextInt();
        java.util.stream.LongStream longStream17 = random12.longs(10L, 0L, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale8, random12);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese (china)_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale8.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1155869325) + "'", int13 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7713912f + "'", float2 == 0.7713912f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Book book6 = faker1.book();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh-cn [at index 0]");
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.util.Locale.Builder builder9 = builder4.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setScript("Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Japan [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.Locale locale3 = new java.util.Locale("fr", "Englisch (Kanada)", "italien (Italie)");
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet7 = locale5.getExtensionKeys();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category4);
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale3.getDisplayLanguage(locale9);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_ENGLISCH (KANADA)_italien (Italie)");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fran\347ais" + "'", str11, "fran\347ais");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh_CN");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("_FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=_fr");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        java.lang.String str9 = locale5.getDisplayName();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.lang.Object obj20 = locale5.clone();
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        boolean boolean20 = locale13.hasExtensions();
        java.lang.Object obj21 = locale13.clone();
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ITA", 0.0d);
        java.util.Random random4 = new java.util.Random((long) (short) 1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random4);
        boolean boolean6 = languageRange2.equals((java.lang.Object) random4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.lang.String str4 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("italien (Italie)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.Name name6 = faker0.name();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien (Italie)", (double) (-572239868));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.72239868E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Japan");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("fr");
        boolean boolean4 = languageRange1.equals((java.lang.Object) languageRange3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale11 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str12 = locale8.getDisplayCountry(locale11);
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        boolean boolean14 = locale0.equals((java.lang.Object) charSet13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker5.resolve("ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setUnicodeLocaleKeyword("Englisch (Kanada)", "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Englisch (Kanada) [at index 0]");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.util.Locale locale2 = new java.util.Locale("_FR", "ita");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Random random5 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: _fr_ITA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_fr_ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleKeys();
        java.util.Locale locale12 = new java.util.Locale("zh,CN", "Chine", "en_CA");
        boolean boolean13 = locale4.equals((java.lang.Object) "zh,CN");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale12.toString(), "zh,cn_CHINE_en_CA");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream5 = random0.ints();
        long long6 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6637608f + "'", float2 == 0.6637608f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1258964254684739481L) + "'", long6 == (-1258964254684739481L));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italien (Italie)", (double) 1791901469);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.791901469E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random(100L);
        double double4 = random3.nextGaussian();
        random3.setSeed((long) (-1157793070));
        double double7 = random3.nextGaussian();
        boolean boolean8 = random3.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.PhoneNumber phoneNumber11 = faker10.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09760425216810112d + "'", double7 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setRegion("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random0.ints((long) (-1521488052));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.util.stream.LongStream longStream7 = random1.longs();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.lang.Class<?> wildcardClass4 = doubleStream3.getClass();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.util.Random random1 = new java.util.Random((long) 74589158);
        random1.setSeed((long) 'u');
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.Locale locale2 = new java.util.Locale("italien (Italie)", "China");
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "italien (italie)_CHINA");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("italien Italie");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("French");
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
        java.util.Locale.Builder builder25 = builder0.setLocale(locale13);
        java.util.Set<java.lang.Character> charSet26 = locale13.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italien (italie)_CHINA");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charSet26);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 1);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=anglais (royaume-uni)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.Locale locale2 = new java.util.Locale("anglais (Royaume-Uni)", "German");
        org.junit.Assert.assertEquals(locale2.toString(), "anglais (royaume-uni)_GERMAN");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.Locale locale2 = new java.util.Locale("_FR", "ita");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Random random6 = new java.util.Random((long) 190001823);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: _fr_ITA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_fr_ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French");
        java.util.Random random3 = new java.util.Random(100L);
        java.util.stream.LongStream longStream5 = random3.longs((long) (short) 0);
        double double6 = random3.nextGaussian();
        java.util.stream.DoubleStream doubleStream8 = random3.doubles((long) ' ');
        random3.setSeed((long) (-1155484576));
        int int11 = random3.nextInt();
        java.util.stream.LongStream longStream14 = random3.longs((-6139822020582680716L), (long) 102643840);
        boolean boolean15 = languageRange1.equals((java.lang.Object) 102643840);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1764305998) + "'", int11 == (-1764305998));
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setRegion("x-lvariant-fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: x-lvariant-fr [at index 0]");
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("French");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("", "eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        java.lang.String str33 = locale0.getExtension('a');
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
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "cinese (Cina)" + "'", str20, "cinese (Cina)");
        org.junit.Assert.assertNotNull(longStream22);
// flaky:         org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.96248126f + "'", float23 == 0.96248126f);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        com.github.javafaker.Lorem lorem17 = faker15.lorem();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.29859275f + "'", float11 == 0.29859275f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-685475890) + "'", int13 == (-685475890));
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(lorem17);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category14, locale18);
        java.lang.String str20 = locale6.getDisplayName(locale18);
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet24 = locale22.getExtensionKeys();
        java.util.Locale.setDefault(category21, locale22);
        boolean boolean26 = locale6.equals((java.lang.Object) category21);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "cinese (Cina)" + "'", str12, "cinese (Cina)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese (China)" + "'", str20, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.Locale locale2 = new java.util.Locale("zh-TW", "Chine");
        java.util.Random random4 = new java.util.Random((long) (-910502427));
        int int5 = random4.nextInt();
        boolean boolean6 = locale2.equals((java.lang.Object) int5);
        org.junit.Assert.assertEquals(locale2.toString(), "zh-tw_CHINE");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-196947104) + "'", int5 == (-196947104));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        java.util.Locale locale26 = locale15.stripExtensions();
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
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
            java.util.Locale.Builder builder26 = builder10.setUnicodeLocaleKeyword("English United Kingdom", "chinese (china)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: English United Kingdom [at index 0]");
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("US", (double) 102643840);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.0264384E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.removeUnicodeLocaleAttribute("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getVariant();
        java.util.Random random3 = new java.util.Random(100L);
        double double4 = random3.nextGaussian();
        random3.setSeed((long) (-1157793070));
        double double7 = random3.nextGaussian();
        boolean boolean8 = random3.nextBoolean();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Address address10 = faker9.address();
        com.github.javafaker.Code code11 = faker9.code();
        java.lang.String str13 = faker9.bothify("de");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6246292191371761d + "'", double4 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09760425216810112d + "'", double7 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(address10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "de" + "'", str13, "de");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder11 = builder0.setExtension('a', "China");
        java.util.Locale.Builder builder12 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: italien (Italie) [at index 0]");
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguage("JPN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.removeUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setVariant("en_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.IntStream intStream8 = random1.ints(2387756735974468056L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
            java.util.Locale.Builder builder15 = builder5.setExtension('#', "German");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setScript("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        java.lang.String str12 = locale5.getVariant();
        java.util.Set<java.lang.String> strSet13 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale5);
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
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = random1.nextInt((-910502427));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.String str26 = locale13.getDisplayScript();
        java.lang.String str27 = locale13.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.lang.String str9 = locale0.getExtension('x');
        java.util.Locale locale11 = new java.util.Locale("fra");
        java.lang.String str12 = locale0.getDisplayScript(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale11.getUnicodeLocaleType("ita");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ita");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals(locale11.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        com.github.javafaker.Address address20 = faker18.address();
        com.github.javafaker.Address address21 = faker18.address();
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
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(address21);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension('#', "zh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setVariant("jpn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguage("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("", "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setScript("\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        java.lang.String str12 = faker10.regexify("Chine");
        com.github.javafaker.Finance finance13 = faker10.finance();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chine" + "'", str12, "Chine");
        org.junit.Assert.assertNotNull(finance13);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.Locale locale1 = new java.util.Locale("hi! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals(locale1.toString(), "hi! (chinese (china))");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(locale1);
        java.lang.String str5 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder10.build();
        java.util.Locale.Builder builder16 = builder10.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder10.setLanguage("ja_JP");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ja_JP [at index 0]");
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
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.util.Locale locale3 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Random random6 = new java.util.Random((long) 190001823);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale3, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra_CHINA_zh_CN could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u97d3\u6587", (double) 0.6744004f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.Locale locale2 = new java.util.Locale("TWN", "Chinese (China)");
        org.junit.Assert.assertEquals(locale2.toString(), "twn_CHINESE (CHINA)");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.lang.Class<?> wildcardClass10 = locale8.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        com.github.javafaker.DateAndTime dateAndTime25 = faker24.date();
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
        org.junit.Assert.assertNotNull(dateAndTime25);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Company company5 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.Random random1 = new java.util.Random((long) (-1800157150));
        boolean boolean2 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random1.ints((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "de");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.lang.String str14 = locale1.getDisplayVariant();
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
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("JPN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: JPN [at index 0]");
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (short) 1);
        java.util.stream.LongStream longStream8 = random1.longs((long) 'a', 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs((-6139822020582680716L), (long) 74589158, (long) 1699180332);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguageTag("en_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: en_CA [at index 0]");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        double double2 = languageRange1.getWeight();
        boolean boolean4 = languageRange1.equals((java.lang.Object) 0.7924908613121775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale27);
// flaky:             org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!");
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
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinese (china)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese(china)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((-0.4996932076353699d), 0.7924908613121775d);
        double double5 = random1.nextGaussian();
        int int7 = random1.nextInt(1894354479);
        java.util.stream.DoubleStream doubleStream11 = random1.doubles(8220501950349663546L, (double) (-1950768727), (double) 0.89409524f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8746788966462123d + "'", double5 == 0.8746788966462123d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 127135246 + "'", int7 == 127135246);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguageTag("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.util.Locale locale2 = new java.util.Locale("TW", "Korean (South Korea)");
        org.junit.Assert.assertEquals(locale2.toString(), "tw_KOREAN (SOUTH KOREA)");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.Locale locale2 = new java.util.Locale("hi!", "Chinese (China)");
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale locale9 = builder6.build();
        java.util.Locale locale13 = new java.util.Locale("", "", "");
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str28 = locale23.getDisplayLanguage(locale27);
        java.util.Locale locale32 = new java.util.Locale("", "", "");
        java.lang.String str34 = locale32.getExtension('x');
        java.util.Locale.setDefault(locale32);
        java.util.Locale locale37 = new java.util.Locale("hi!");
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.getISO3Country();
        java.util.Locale locale43 = new java.util.Locale("", "", "");
        java.util.Locale locale47 = new java.util.Locale("", "", "");
        java.lang.String str48 = locale43.getDisplayLanguage(locale47);
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.util.Locale locale51 = locale50.stripExtensions();
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.util.Locale locale57 = new java.util.Locale("hi!");
        java.util.Locale locale58 = locale57.stripExtensions();
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale9, locale13, locale19, locale27, locale32, locale38, locale47, locale50, locale53, locale55, locale57 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.Locale.FilteringMode filteringMode62 = null;
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList60, filteringMode62);
        java.util.Locale locale64 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap67);
        java.util.Locale locale72 = new java.util.Locale("", "", "");
        java.lang.String str74 = locale72.getExtension('x');
        java.util.Locale.setDefault(locale72);
        java.util.Locale locale76 = java.util.Locale.FRENCH;
        java.lang.String str77 = locale72.getDisplayLanguage(locale76);
        java.lang.String str78 = locale72.getISO3Language();
        java.util.Locale locale82 = new java.util.Locale("", "", "");
        java.lang.String str84 = locale82.getExtension('x');
        java.util.Locale.setDefault(locale82);
        java.util.Locale locale86 = java.util.Locale.FRENCH;
        java.lang.String str87 = locale82.getDisplayLanguage(locale86);
        java.lang.String str88 = locale72.getDisplayVariant(locale82);
        boolean boolean89 = locale82.hasExtensions();
        java.util.Locale.setDefault(locale82);
        java.util.Set<java.lang.String> strSet91 = locale82.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet91, filteringMode92);
        boolean boolean94 = locale2.equals((java.lang.Object) strSet91);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_CHINESE (CHINA)");
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode92.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("french", (double) 1641039410);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.64103941E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream18 = random12.doubles((long) (-1723639948), (double) 0.8169393f, (double) 7676145377811632764L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.lang.String str11 = locale9.getExtension('x');
        java.lang.String str12 = locale5.getDisplayVariant(locale9);
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale9.getDisplayScript(locale13);
        java.lang.String str16 = locale4.getDisplayCountry(locale9);
        java.lang.String str17 = locale0.getDisplayLanguage(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97d3\u6587" + "'", str2, "\u97d3\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr" + "'", str14, "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Korean" + "'", str17, "Korean");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.lang.String str9 = locale0.getExtension('x');
        java.lang.String str11 = locale0.getUnicodeLocaleType("US");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        java.util.Random random6 = new java.util.Random((long) (short) 0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Code code8 = faker7.code();
        boolean boolean9 = languageRange2.equals((java.lang.Object) code8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Name name7 = faker6.name();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japon", 0.47792122866510167d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream4 = random1.ints();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("TWN", 0.2227720902128787d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((int) (short) 100, (-910502427));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Company company3 = faker0.company();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker0.resolve("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(company3);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        random1.setSeed((long) 'a');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        int int12 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random1.ints((long) (-196947104), (-303169301), 127135246);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1192805220) + "'", int12 == (-1192805220));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream12 = random1.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream15 = random1.ints(591553211, 2002825273);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream19 = random1.doubles((double) 78707950, (double) (-1800157150));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale10 = new java.util.Locale("de", "\u6cd5\u6587");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u6cd5\u6587");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextDouble();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8314409887870612d + "'", double6 == 0.8314409887870612d);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 1);
        int int5 = random1.nextInt();
        long long6 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1107254586 + "'", int5 == 1107254586);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7616895062557318172L + "'", long6 == 7616895062557318172L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.Locale locale1 = new java.util.Locale("fr");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.lang.String str9 = locale8.getLanguage();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        java.lang.String str11 = locale2.getDisplayCountry(locale8);
        java.lang.String str12 = locale2.getDisplayName();
        java.lang.String str13 = locale1.getDisplayScript(locale2);
        java.util.Random random14 = new java.util.Random();
        java.util.stream.LongStream longStream15 = random14.longs();
        float float16 = random14.nextFloat();
        java.util.stream.DoubleStream doubleStream18 = random14.doubles((long) '4');
        java.util.stream.IntStream intStream20 = random14.ints((long) 1);
        java.util.stream.DoubleStream doubleStream23 = random14.doubles((double) 0.5463555f, (double) (byte) 10);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale2, random14);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
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
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str12, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.63833284f + "'", float16 == 0.63833284f);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(doubleStream23);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        java.lang.String str4 = faker0.numerify("ITA");
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Color color6 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITA" + "'", str4, "ITA");
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        random1.setSeed((long) (-1155484576));
        random1.setSeed((long) 127135246);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.String str83 = null; // flaky: locale80.getDisplayCountry();
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
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder11 = builder8.setExtension('x', "Italian");
        java.util.Locale locale12 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder8.setRegion("french");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: french [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de__#x-italian");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        java.util.Random random20 = new java.util.Random();
        java.util.stream.LongStream longStream23 = random20.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream25 = random20.doubles((long) '#');
        java.util.Random random27 = new java.util.Random(1L);
        java.util.Random random29 = new java.util.Random((long) (short) 1);
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
        random29.nextBytes(byteArray44);
        random27.nextBytes(byteArray44);
        random20.nextBytes(byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker50 = new com.github.javafaker.Faker(locale3, random20);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1157793070) + "'", int34 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream35);
        org.junit.Assert.assertNotNull(intStream36);
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(byteArray44);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[35, 48, 49]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.lang.String str21 = locale19.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        boolean boolean23 = random1.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[115, -43, 26]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        double double6 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (-1723639948));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.3325983427023256d) + "'", double6 == (-1.3325983427023256d));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TW");
        java.lang.Class<?> wildcardClass2 = languageRange1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English United Kingdom", (double) 2002825273);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.002825273E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u6587", (double) 190001823);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.90001823E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream7 = random1.ints(0L, (int) '#', (int) (byte) 100);
        java.util.stream.LongStream longStream9 = random1.longs((long) 1627973114);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random1.longs(8220501950349663546L, (long) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        java.lang.String str20 = locale19.getISO3Country();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setRegion("italien Italie");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: italien Italie [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker1.resolve("\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(phoneNumber2);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("cinese (Cina)", (double) 0.23210937f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese (cina)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Address address6 = faker5.address();
        com.github.javafaker.DateAndTime dateAndTime7 = faker5.date();
        com.github.javafaker.Color color8 = faker5.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        com.github.javafaker.Address address4 = faker0.address();
        java.lang.String str6 = faker0.letterify("English United Kingdom");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English United Kingdom" + "'", str6, "English United Kingdom");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange5 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("fr", 0.0d);
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str24 = languageRange23.getRange();
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] { languageRange11, languageRange14, languageRange17, languageRange20, languageRange23, languageRange27 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder34.setVariant("");
        java.util.Locale locale37 = builder34.build();
        java.util.Locale locale41 = new java.util.Locale("", "", "");
        java.util.Locale locale45 = new java.util.Locale("", "", "");
        java.lang.String str46 = locale41.getDisplayLanguage(locale45);
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.util.Locale locale51 = new java.util.Locale("", "", "");
        java.util.Locale locale55 = new java.util.Locale("", "", "");
        java.lang.String str56 = locale51.getDisplayLanguage(locale55);
        java.util.Locale locale60 = new java.util.Locale("", "", "");
        java.lang.String str62 = locale60.getExtension('x');
        java.util.Locale.setDefault(locale60);
        java.util.Locale locale65 = new java.util.Locale("hi!");
        java.util.Locale locale66 = locale65.stripExtensions();
        java.lang.String str67 = locale66.getISO3Country();
        java.util.Locale locale71 = new java.util.Locale("", "", "");
        java.util.Locale locale75 = new java.util.Locale("", "", "");
        java.lang.String str76 = locale71.getDisplayLanguage(locale75);
        java.util.Locale locale78 = new java.util.Locale("hi!");
        java.util.Locale locale79 = locale78.stripExtensions();
        java.util.Locale locale81 = new java.util.Locale("hi!");
        java.util.Locale locale83 = new java.util.Locale("hi!");
        java.util.Locale locale85 = new java.util.Locale("hi!");
        java.util.Locale locale86 = locale85.stripExtensions();
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale37, locale41, locale47, locale55, locale60, locale66, locale75, locale78, locale81, locale83, locale85 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale.FilteringMode filteringMode90 = null;
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList88, filteringMode90);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale.FilteringMode filteringMode93 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList88, filteringMode93);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap95 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList96 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap95);
        java.util.Locale locale97 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet98 = locale97.getUnicodeLocaleAttributes();
        java.lang.String str99 = java.util.Locale.lookupTag(languageRangeList96, (java.util.Collection<java.lang.String>) strSet98);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr" + "'", str24, "fr");
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals(locale65.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals(locale78.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!");
        org.junit.Assert.assertEquals(locale81.toString(), "hi!");
        org.junit.Assert.assertEquals(locale83.toString(), "hi!");
        org.junit.Assert.assertEquals(locale85.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(localeList91);
// flaky:         org.junit.Assert.assertNotNull(locale92);
// flaky:         org.junit.Assert.assertEquals(locale92.toString(), "fr");
        org.junit.Assert.assertTrue("'" + filteringMode93 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode93.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(languageRangeList96);
        org.junit.Assert.assertNotNull(locale97);
        org.junit.Assert.assertEquals(locale97.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet98);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        float float3 = random0.nextFloat();
        java.util.stream.LongStream longStream7 = random0.longs(1397386546144374610L, (long) (-1800157150), (long) (-217432450));
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.14247352f + "'", float2 == 0.14247352f);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.13015121f + "'", float3 == 0.13015121f);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        com.github.javafaker.Hacker hacker37 = faker33.hacker();
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
        org.junit.Assert.assertNotNull(hacker37);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deu");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.Locale locale2 = new java.util.Locale("JPN", "hi! (CHINESE (CHINA))");
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "jpn_HI! (CHINESE (CHINA))");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRA");
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale locale9 = new java.util.Locale("", "", "");
        java.lang.String str10 = locale5.getDisplayLanguage(locale9);
        boolean boolean11 = languageRange1.equals((java.lang.Object) locale9);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh-cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        boolean boolean7 = random1.nextBoolean();
        java.util.stream.IntStream intStream9 = random1.ints((long) 591553211);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Lorem lorem11 = faker10.lorem();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 1);
        int int5 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1107254586 + "'", int5 == 1107254586);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder12 = builder8.setRegion("TW");
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "deu");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("en_CA");
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
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fra (FRA,fr)", (double) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=120.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.Random random1 = new java.util.Random((long) 9);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((double) 0.5463555f, (double) (byte) 10);
        double double10 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((long) 23, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6604991f + "'", float2 == 0.6604991f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4350068253235819d + "'", double10 == 0.4350068253235819d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.setUnicodeLocaleKeyword("English United Kingdom", "deu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: English United Kingdom [at index 0]");
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
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.Locale locale3 = new java.util.Locale("hi!", "fra", "french");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FRA");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_FRA_french");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random1);
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        int int7 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random1.longs((long) (short) 100, (long) 102643840, (long) (-266083962));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8314409887870612d + "'", double5 == 0.8314409887870612d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1690734402) + "'", int7 == (-1690734402));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.lang.String str6 = locale3.getISO3Country();
        java.lang.String str7 = locale3.toLanguageTag();
        java.lang.String str8 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("ITA");
        boolean boolean26 = locale0.equals((java.lang.Object) "ITA");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.Random random1 = new java.util.Random((-4071542935431320084L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((-4962768465676381896L), (long) (-1408064384), (long) 1991855488);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker0.resolve("anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguage("it");
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder7.addUnicodeLocaleAttribute("zh,CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh,CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book2 = faker1.book();
        com.github.javafaker.Internet internet3 = faker1.internet();
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(internet3);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("ita");
        java.lang.String str5 = faker1.numerify("jpn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Finance finance4 = faker0.finance();
        java.lang.String str6 = faker0.letterify("\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.App app2 = faker0.app();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(app2);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Random random6 = new java.util.Random();
        java.util.stream.LongStream longStream7 = random6.longs();
        java.util.stream.LongStream longStream9 = random6.longs(0L);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale5, random6);
        java.util.Random random12 = new java.util.Random(100L);
        java.util.stream.LongStream longStream14 = random12.longs((long) (short) 0);
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
        random12.nextBytes(byteArray29);
        random6.nextBytes(byteArray29);
        random0.nextBytes(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream36 = random0.ints((-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1157793070) + "'", int19 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(byteArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-64, -19, -40]");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.util.Random random1 = new java.util.Random((long) ' ');
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random1.longs((-7229401253428516892L), (long) 1699180332, (long) 977291951);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5015647950085110473L) + "'", long2 == (-5015647950085110473L));
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Finance finance5 = faker1.finance();
        com.github.javafaker.Company company6 = faker1.company();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book6 = faker5.book();
        com.github.javafaker.Color color7 = faker5.color();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        java.lang.String str7 = faker0.regexify("\u6cd5\u6587");
        com.github.javafaker.Options options8 = faker0.options();
        com.github.javafaker.Internet internet9 = faker0.internet();
        com.github.javafaker.Internet internet10 = faker0.internet();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(internet10);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.Locale locale2 = new java.util.Locale("zh-CN", "");
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.Locale locale3 = new java.util.Locale("Korean (South Korea)", "zho", "zho");
        org.junit.Assert.assertEquals(locale3.toString(), "korean (south korea)_ZHO_zho");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.util.Locale locale2 = new java.util.Locale("en_GB", "French");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for en_gb");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "en_gb_FRENCH");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (short) 10);
        double double9 = random0.nextGaussian();
        java.util.stream.IntStream intStream10 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles((long) (-290302496), (double) 0.9150427f, (double) 0.93810225f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4847958f + "'", float2 == 0.4847958f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1304572795) + "'", int4 == (-1304572795));
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.4996932076353699d) + "'", double9 == (-0.4996932076353699d));
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale3.getDisplayName(locale10);
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str17 = locale12.getDisplayLanguage(locale16);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.util.Locale locale31 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale31.getExtension('x');
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = locale37.getISO3Country();
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale42.getDisplayLanguage(locale46);
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale8, locale12, locale18, locale26, locale31, locale37, locale46, locale49, locale52, locale54, locale56 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale.FilteringMode filteringMode61 = null;
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList59, filteringMode61);
        java.util.Locale locale63 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList59);
        java.lang.String str64 = locale63.getDisplayLanguage();
        java.util.Locale.setDefault(locale63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str67 = locale63.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream4 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) 1991855488, (double) 0.8325172f, (double) 0.74300724f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.regexify("fr");
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        com.github.javafaker.Business business7 = faker0.business();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ita");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.DateAndTime dateAndTime6 = faker5.date();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.util.Random random1 = new java.util.Random((long) (-144180575));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        org.junit.Assert.assertNotNull(address3);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setScript("German");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: German [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        double double3 = random1.nextGaussian();
        java.util.stream.IntStream intStream4 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((-4071542935431320084L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8673886034754649d) + "'", double3 == (-0.8673886034754649d));
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("GB");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "gb");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 0.14247352f);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.lang.Class<?> wildcardClass6 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.String str5 = locale2.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("ita");
        com.github.javafaker.Name name4 = faker1.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs(10L, 0L, (long) (short) 100);
        boolean boolean7 = random1.nextBoolean();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155869325) + "'", int2 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.util.Locale locale3 = new java.util.Locale("CN", "Englisch (Kanada)", "zh_CN");
        org.junit.Assert.assertEquals(locale3.toString(), "cn_ENGLISCH (KANADA)_zh_CN");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale8 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale8);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chinese (china)_FRA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale8.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Locale locale3 = new java.util.Locale("fra (FRA,fr)", "fra (FRA,fr)", "x-lvariant-fr");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fra (fra,fr)_FRA (FRA,FR)_x-lvariant-fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-fr" + "'", str4, "x-lvariant-fr");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str8 = locale4.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.Locale locale2 = new java.util.Locale("JPN", "hi! (CHINESE (CHINA))");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "jpn_HI! (CHINESE (CHINA))");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jpn_HI! (CHINESE (CHINA))" + "'", str3, "jpn_HI! (CHINESE (CHINA))");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.lang.String str17 = locale15.getDisplayCountry();
        java.lang.String str18 = locale15.getDisplayLanguage();
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
        org.junit.Assert.assertEquals(locale15.toString(), "de_FRA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FRA" + "'", str17, "FRA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "German" + "'", str18, "German");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.Random random1 = new java.util.Random((long) (short) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja" + "'", str2, "ja");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.util.Locale locale3 = new java.util.Locale("\u672a\u5b9a\u8bed\u79cd", "TWN", "\u4e2d\u6587");
        java.lang.Object obj4 = null;
        boolean boolean5 = locale3.equals(obj4);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u672a\u5b9a\u8bed\u79cd\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.util.Set<java.lang.String> strSet28 = locale15.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.Random random1 = new java.util.Random((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random1.ints(2002825273, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_CN [at index 0]");
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
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles((long) (-1276104565));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-682588711), (double) 0.113836765f);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream13 = random0.ints((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random0.doubles((long) (-843734), 1.0175240265721812d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.26512438f + "'", float2 == 0.26512438f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1708949091) + "'", int4 == (-1708949091));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.4996932076353699d) + "'", double11 == (-0.4996932076353699d));
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587\u4e2d\u56fd)", (double) (-388136581));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-3.88136581E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
            java.util.Locale.Builder builder17 = builder12.setLanguageTag("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("und", strMap2);
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.parse("fr", strMap66);
        java.util.Locale locale68 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList67, (java.util.Collection<java.lang.String>) strSet69, filteringMode70);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList61, filteringMode70);
        java.util.Locale locale73 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleAttributes();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.parse("fr", strMap76);
        java.util.Locale locale78 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet79 = locale78.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList77, (java.util.Collection<java.lang.String>) strSet79, filteringMode80);
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet74, filteringMode80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap83);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale87 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleKeys();
        java.lang.String str89 = java.util.Locale.lookupTag(languageRangeList86, (java.util.Collection<java.lang.String>) strSet88);
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet88);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode70.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode80.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(languageRangeList86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(strList90);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Business business9 = faker5.business();
        com.github.javafaker.Internet internet10 = faker5.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(internet10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-cn", (double) 0L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Business business2 = faker0.business();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        com.github.javafaker.App app6 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        com.github.javafaker.Number number18 = faker15.number();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.27952957f + "'", float11 == 0.27952957f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34210000 + "'", int13 == 34210000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(number18);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream9 = random1.ints((-685475890), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random1.longs((long) 27, (long) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.3890906f + "'", float3 == 0.3890906f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1767640504) + "'", int5 == (-1767640504));
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale.Builder builder9 = builder6.setExtension('x', "FRA");
        java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-CN [at index 0]");
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        com.github.javafaker.Business business7 = faker0.business();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Lorem lorem6 = faker5.lorem();
        java.lang.String str8 = faker5.bothify("Englisch (Kanada)");
        com.github.javafaker.Address address9 = faker5.address();
        com.github.javafaker.Color color10 = faker5.color();
        com.github.javafaker.Color color11 = faker5.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Kanada)" + "'", str8, "Englisch (Kanada)");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Business business6 = faker4.business();
        java.lang.String str8 = faker4.regexify("ita");
        com.github.javafaker.Company company9 = faker4.company();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ita" + "'", str8, "ita");
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Lorem lorem8 = faker0.lorem();
        com.github.javafaker.Hacker hacker9 = faker0.hacker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker0.resolve("French");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(hacker9);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        com.github.javafaker.Options options19 = faker15.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = faker15.resolve("\u4e2d\u56fd");
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.30768502f + "'", float11 == 0.30768502f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-821928849) + "'", int13 == (-821928849));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertNotNull(business18);
        org.junit.Assert.assertNotNull(options19);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Japan", (double) 0.023669124f);
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        float float5 = random0.nextFloat();
        float float6 = random0.nextFloat();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.79958975f + "'", float2 == 0.79958975f);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.7126704f + "'", float5 == 0.7126704f);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.4188053f + "'", float6 == 0.4188053f);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        double double5 = random1.nextDouble();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        double double7 = random1.nextDouble();
        double double8 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4456342944175421d + "'", double5 == 0.4456342944175421d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4129126974821382d + "'", double7 == 0.4129126974821382d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.672159466804821d + "'", double8 == 0.672159466804821d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale0.getUnicodeLocaleType("italien Italie");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italien Italie");
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
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.LongStream longStream6 = random1.longs();
        java.util.stream.LongStream longStream7 = random1.longs();
        int int9 = random1.nextInt((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random1.longs((long) (-388136581), (long) (-1521488052), (long) (-1748456842));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.util.Locale locale3 = new java.util.Locale("", "zh-CN", "fr");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "_ZH-CN_fr");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "_ZH-CN_fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "_ZH-CN_fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "_ZH-CN_fr");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((long) 977291951, (long) (-408683759));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.regexify("eng");
        java.lang.String str10 = faker0.letterify("TWN");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TWN" + "'", str10, "TWN");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        float float5 = random0.nextFloat();
        long long6 = random0.nextLong();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1608557193) + "'", int4 == (-1608557193));
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.12219095f + "'", float5 == 0.12219095f);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3484186600379647945L + "'", long6 == 3484186600379647945L);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.lang.String str7 = locale4.getDisplayScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean (South Korea)", (double) (-1800157150));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.80015715E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean6 = random1.nextBoolean();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_CN", (double) 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=44.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.lang.String str21 = locale4.toLanguageTag();
        java.lang.String str22 = locale4.getLanguage();
        java.util.Random random24 = new java.util.Random((long) 0);
        int int26 = random24.nextInt((int) '4');
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random24);
        double double28 = random24.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale4, random24);
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
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 44 + "'", int26 == 44);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.8314409887870612d + "'", double28 == 0.8314409887870612d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale0.getDisplayLanguage(locale1);
        java.lang.String str4 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587" + "'", str3, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.util.Locale locale15 = new java.util.Locale("", "", "");
        java.lang.String str17 = locale15.getExtension('x');
        java.util.Locale.setDefault(locale15);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.lang.String str20 = locale15.getDisplayLanguage(locale19);
        java.lang.String str21 = locale5.getDisplayCountry(locale19);
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale5.getDisplayScript(locale22);
        boolean boolean24 = locale22.hasExtensions();
        java.lang.String str25 = locale22.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        float float3 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0.0d, (double) 0.42169613f);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5398846f + "'", float2 == 0.5398846f);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.94697636f + "'", float3 == 0.94697636f);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream4 = random1.longs((long) (short) 1);
        double double5 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4972683369271453960L) + "'", long2 == (-4972683369271453960L));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2578027905957804d + "'", double5 == 0.2578027905957804d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setExtension('#', "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("FRA");
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strSet9);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale.Builder builder16 = builder14.setVariant("");
        java.util.Locale.Builder builder18 = builder14.setLanguage("French");
        java.util.Locale locale19 = builder18.build();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet20, filteringMode21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strList22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "french");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr", strMap1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode5 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList6 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet4, filteringMode5);
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("zh-CN");
        java.lang.String str9 = languageRange8.getRange();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("fr", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("French");
        java.lang.String str15 = languageRange14.getRange();
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str19 = languageRange18.getRange();
        java.lang.String str20 = languageRange18.getRange();
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("zho");
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("zh-CN", (double) 0.55340016f);
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("French");
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        java.lang.String str31 = languageRange30.getRange();
        java.lang.String str32 = languageRange30.getRange();
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        double double36 = languageRange35.getWeight();
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("French", 0.6671595726539502d);
        java.lang.String str40 = languageRange39.getRange();
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("FRA");
        java.util.Locale.LanguageRange languageRange45 = new java.util.Locale.LanguageRange("fr", (double) (short) 1);
        java.util.Locale.LanguageRange languageRange48 = new java.util.Locale.LanguageRange("FRA", 0.0d);
        double double49 = languageRange48.getWeight();
        java.util.Locale.LanguageRange languageRange52 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.util.Locale.LanguageRange languageRange55 = new java.util.Locale.LanguageRange("China", (double) 0.32771218f);
        java.util.Locale.LanguageRange languageRange57 = new java.util.Locale.LanguageRange("Chinese");
        double double58 = languageRange57.getWeight();
        java.util.Locale.LanguageRange languageRange61 = new java.util.Locale.LanguageRange("French", 0.6671595726539502d);
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange12, languageRange14, languageRange18, languageRange22, languageRange25, languageRange27, languageRange30, languageRange35, languageRange39, languageRange42, languageRange45, languageRange48, languageRange52, languageRange55, languageRange57, languageRange61 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Locale locale67 = new java.util.Locale("zh-cn", "JPN");
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.lang.String>) strSet68);
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList69, filteringMode70);
        java.util.Locale locale72 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet73);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + filteringMode5 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode5.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-cn" + "'", str9, "zh-cn");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "french" + "'", str15, "french");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fr" + "'", str20, "fr");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "fra" + "'", str31, "fra");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "fra" + "'", str32, "fra");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "french" + "'", str40, "french");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals(locale67.toString(), "zh-cn_JPN");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode70.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale locale7 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.removeUnicodeLocaleAttribute("TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setLanguage("zho");
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setExtension('4', "zh_CN");
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
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: _FR [at index 0]");
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale locale7 = builder2.build();
        java.util.Locale.Builder builder10 = builder2.setExtension('u', "italien");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "french");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((double) 0.5463555f, (double) (byte) 10);
        double double10 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) 27, 0.730967787376657d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.28639847f + "'", float2 == 0.28639847f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5685463685182576d + "'", double10 == 0.5685463685182576d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale13 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.removeUnicodeLocaleAttribute("italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: italien (Italie) [at index 0]");
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
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        java.util.Locale locale55 = java.util.Locale.PRC;
        java.lang.String str56 = locale55.getVariant();
        java.util.Random random58 = new java.util.Random(100L);
        double double59 = random58.nextGaussian();
        random58.setSeed((long) (-1157793070));
        double double62 = random58.nextGaussian();
        boolean boolean63 = random58.nextBoolean();
        com.github.javafaker.Faker faker64 = new com.github.javafaker.Faker(locale55, random58);
        com.github.javafaker.Address address65 = faker64.address();
        boolean boolean66 = locale14.equals((java.lang.Object) faker64);
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
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.6246292191371761d + "'", double59 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.09760425216810112d + "'", double62 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(address65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream26 = random1.longs((long) (byte) 100, (long) 24, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1157793070) + "'", int8 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[115, -43, 26]");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.util.Locale locale28 = new java.util.Locale("zh,CN");
        java.lang.String str29 = locale19.getDisplayScript(locale28);
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
        org.junit.Assert.assertEquals(locale28.toString(), "zh,cn");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream3 = random1.ints((long) (short) 100);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        random1.setSeed((long) (-1157793070));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random1.doubles((double) 100, (double) 0.7827291f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.String str25 = locale23.toLanguageTag();
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
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.util.Random random1 = new java.util.Random((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = random1.ints((long) (-685475890));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getDisplayLanguage();
        java.lang.String str6 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleKeys();
        java.lang.String str8 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi! (CHINESE (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi! (chinese (china))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream6 = random0.ints((long) 1);
        java.util.Random random8 = new java.util.Random((long) 1);
        java.util.Random random10 = new java.util.Random((long) (short) 1);
        int int11 = random10.nextInt();
        java.util.stream.LongStream longStream15 = random10.longs(10L, 0L, (long) (short) 100);
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
        random8.nextBytes(byteArray34);
        random0.nextBytes(byteArray34);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8663447f + "'", float2 == 0.8663447f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1155869325) + "'", int11 == (-1155869325));
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1157793070) + "'", int24 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(byteArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-73, -48, 12]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale13 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setScript("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh-CN [at index 0]");
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
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("France", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale9 = new java.util.Locale("de", "\u6cd5\u6587");
        java.lang.String str10 = locale3.getDisplayLanguage(locale9);
        java.lang.String str11 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.Locale locale3 = new java.util.Locale("", "zh-CN", "fr");
        java.util.Locale locale7 = new java.util.Locale("hi!", "hi!", "zh-CN");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.util.Locale.setDefault(locale7);
        java.lang.String str10 = locale7.getScript();
        java.lang.String str11 = locale3.getDisplayScript(locale7);
        java.lang.String str12 = locale3.toLanguageTag();
        java.lang.Class<?> wildcardClass13 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "_ZH-CN_fr");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!_HI!_zh-CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "x-lvariant-fr" + "'", str12, "x-lvariant-fr");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.setLanguage("Japon");
        java.util.Locale.Builder builder16 = builder15.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.Locale locale1 = new java.util.Locale("zho");
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.util.Locale.setDefault(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale5.getDisplayLanguage(locale9);
        java.util.Set<java.lang.String> strSet11 = locale5.getUnicodeLocaleKeys();
        java.lang.String str12 = locale5.getDisplayVariant();
        java.lang.String str13 = locale5.getCountry();
        boolean boolean14 = locale1.equals((java.lang.Object) str13);
        org.junit.Assert.assertEquals(locale1.toString(), "zho");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setRegion("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Name name4 = faker0.name();
        com.github.javafaker.Options options5 = faker0.options();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Address address7 = faker0.address();
        java.lang.Class<?> wildcardClass8 = address7.getClass();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Color color5 = faker0.color();
        java.lang.String str7 = faker0.bothify("China");
        com.github.javafaker.DateAndTime dateAndTime8 = faker0.date();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder13.setScript("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fra [at index 0]");
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
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.util.Random random1 = new java.util.Random((long) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream3 = random1.longs();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.Locale locale1 = new java.util.Locale("cinese (Cina)");
        org.junit.Assert.assertEquals(locale1.toString(), "cinese (cina)");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getDisplayCountry();
        java.lang.String str6 = locale1.getISO3Language();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Internet internet3 = faker0.internet();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Book book5 = faker0.book();
        com.github.javafaker.Book book6 = faker0.book();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "zh-cn");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("de");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: de [at index 0]");
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale5.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        boolean boolean20 = locale13.hasExtensions();
        java.util.Locale.setDefault(locale13);
        java.lang.String str22 = locale13.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale13);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (-1.0685650149813355d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0685650149813355");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.util.Random random1 = new java.util.Random((long) (-196947104));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random1.ints(540195050, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.30864245f + "'", float3 == 0.30864245f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2040671439 + "'", int5 == 2040671439);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        int int4 = random0.nextInt();
        random0.setSeed((long) (-1155869325));
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((double) (-682588711), (double) 0.113836765f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((-4071542935431320084L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8036131f + "'", float2 == 0.8036131f);
        org.junit.Assert.assertNotNull(intStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-374078815) + "'", int4 == (-374078815));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "hi!");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.lang.String str6 = locale3.getScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!__hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!__hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str2 = locale0.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 0.2124942f);
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setRegion("fra (FRA,fr)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: fra (FRA,fr) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.util.Locale locale3 = new java.util.Locale("fra (FRA,fr)", "German", "Italian");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale.Builder builder9 = builder4.setScript("");
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder14 = builder9.setExtension('u', "");
        java.util.Locale.Builder builder17 = builder14.setExtension('u', "");
        java.util.Locale locale18 = builder14.build();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder20 = builder14.setLocale(locale19);
        boolean boolean21 = locale3.equals((java.lang.Object) builder20);
        org.junit.Assert.assertEquals(locale3.toString(), "fra (fra,fr)_GERMAN_Italian");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("us", (double) 0.73096776f);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random1.ints((long) 10, 1991855488, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Company company5 = faker0.company();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(company5);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en_CA");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.Locale locale3 = new java.util.Locale("FRA", "FRA", "fr");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_FRA_fr");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "fra_FRA_fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "fra_FRA_fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "fra_FRA_fr");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.setLanguage("JPN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("English (United Kingdom)", "France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        float float7 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random1.doubles((long) (-144180575), 0.0d, (double) (-5015647950085110473L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.44563425f + "'", float7 == 0.44563425f);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "");
        java.lang.String str4 = locale2.getExtension('x');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for zh-cn");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.Locale locale2 = new java.util.Locale("french", "fr");
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale5 = new java.util.Locale("zh-CN");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        boolean boolean7 = locale2.equals((java.lang.Object) strSet6);
        org.junit.Assert.assertEquals(locale2.toString(), "french_FR");
        org.junit.Assert.assertEquals(locale5.toString(), "zh-cn");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 100);
        java.util.stream.IntStream intStream9 = random0.ints((long) 'x', (int) (short) 1, 562650695);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.099019885f + "'", float2 == 0.099019885f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        java.lang.String str8 = faker6.bothify("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker6.resolve("Korean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream10 = random0.doubles(0L, (double) (short) 0, (double) 0.9816493f);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Book book12 = faker11.book();
        com.github.javafaker.Options options13 = faker11.options();
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 443638859 + "'", int4 == 443638859);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(book12);
        org.junit.Assert.assertNotNull(options13);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u56fd", (double) 0.38019747f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.Random random1 = new java.util.Random((long) 977291951);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("x-lvariant-JPN", (double) (short) 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder32.addUnicodeLocaleAttribute("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
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
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.removeUnicodeLocaleAttribute("Englisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Englisch (Kanada) [at index 0]");
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setExtension('#', "ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str7 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.26773185f + "'", float3 == 0.26773185f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-539800044) + "'", int5 == (-539800044));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-TW");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        com.github.javafaker.Book book8 = faker6.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.56325656f + "'", float3 == 0.56325656f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-474113270) + "'", int5 == (-474113270));
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setExtension('x', "italien Italie");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: italien Italie [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        java.lang.String str5 = faker0.letterify("fr");
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Name name7 = faker0.name();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(name7);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.Locale locale1 = new java.util.Locale("und");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "und");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "und");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "und");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "und");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        float float3 = random0.nextFloat();
        java.util.stream.LongStream longStream5 = random0.longs(0L);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7904554f + "'", float2 == 0.7904554f);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.43266338f + "'", float3 == 0.43266338f);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.lang.String str13 = faker11.numerify("TW");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TW" + "'", str13, "TW");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        double double3 = random0.nextDouble();
        double double4 = random0.nextDouble();
        java.util.stream.LongStream longStream5 = random0.longs();
        int int7 = random0.nextInt(1053970733);
        double double8 = random0.nextDouble();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3203559f + "'", float2 == 0.3203559f);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7482923799143263d + "'", double3 == 0.7482923799143263d);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.255278882813442d + "'", double4 == 0.255278882813442d);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 336522226 + "'", int7 == 336522226);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8597709383802166d + "'", double8 == 0.8597709383802166d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.Locale locale1 = new java.util.Locale("Englisch (Kanada)");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: englisch (kanada) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "englisch (kanada)");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random0.longs((long) (-1157793070));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.App app5 = faker0.app();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.util.Locale locale15 = new java.util.Locale("", "", "");
        java.lang.String str17 = locale15.getExtension('x');
        java.util.Locale.setDefault(locale15);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.lang.String str20 = locale15.getDisplayLanguage(locale19);
        java.lang.String str21 = locale5.getDisplayCountry(locale19);
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale5.getDisplayScript(locale22);
        java.lang.String str24 = locale22.getDisplayScript();
        java.util.Set<java.lang.String> strSet25 = locale22.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("x-lvariant-JPN", "Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: x-lvariant-JPN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale2 = locale1.stripExtensions();
        boolean boolean3 = locale2.hasExtensions();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((-0.4996932076353699d), 0.7924908613121775d);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2, random6);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinois", (double) 0.27805895f);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Options options4 = faker3.options();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker3.resolve("Italienisch");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Kanada)" + "'", str2, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deu" + "'", str3, "deu");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587\u4e2d\u56fd)", (double) 0.9816493f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Business business5 = faker1.business();
        com.github.javafaker.Company company6 = faker1.company();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream5 = random1.doubles();
        java.util.stream.IntStream intStream6 = random1.ints();
        float float7 = random1.nextFloat();
        double double8 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.44563425f + "'", float7 == 0.44563425f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2578027905957804d + "'", double8 == 0.2578027905957804d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("ENGLISH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ENGLISH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.Locale locale3 = new java.util.Locale("Englisch (Kanada)", "GB", "");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "englisch (kanada)_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream4 = random1.ints();
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream7 = random1.ints();
        java.util.stream.IntStream intStream8 = random1.ints();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.4481846f + "'", float3 == 0.4481846f);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-764196127) + "'", int5 == (-764196127));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        java.lang.String str7 = faker0.regexify("GB");
        com.github.javafaker.Finance finance8 = faker0.finance();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GB" + "'", str7, "GB");
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.phoneNumber();
        com.github.javafaker.Address address5 = faker0.address();
        com.github.javafaker.Internet internet6 = faker0.internet();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        java.lang.String str9 = faker0.regexify("Italienisch");
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italienisch" + "'", str9, "Italienisch");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.lang.String str4 = locale3.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getUnicodeLocaleType("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: French");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        double double3 = random0.nextGaussian();
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 0);
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.12011123f + "'", float2 == 0.12011123f);
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7806943002401902d) + "'", double3 == (-0.7806943002401902d));
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.util.Locale locale3 = new java.util.Locale("", "fr", "");
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA" + "'", str4, "FRA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u97d3\u6587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: French");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setScript("");
        java.util.Locale.Builder builder12 = builder7.setExtension('u', "Japan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("\u30c8\u30a5\u30a4\u8a9e (ENGLISH,ITA)", "ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???? (ENGLISH,ITA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.lang.String str21 = locale16.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder10 = builder8.setLanguage("ENGLISH");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("FRA", "China", "zh_CN");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "fra_CHINA_zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream8 = random0.ints(100L, (int) (byte) -1, (int) ' ');
        boolean boolean9 = random0.nextBoolean();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet11 = faker10.internet();
        java.lang.Class<?> wildcardClass12 = faker10.getClass();
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.07816422f + "'", float2 == 0.07816422f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str41 = locale21.getDisplayName(locale40);
        java.lang.String str42 = locale21.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr");
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
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.Random random1 = new java.util.Random(100L);
        double double2 = random1.nextGaussian();
        random1.setSeed((long) (-1157793070));
        double double5 = random1.nextGaussian();
        boolean boolean6 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) (-196947104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246292191371761d + "'", double2 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.09760425216810112d + "'", double5 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setLanguage("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United Kingdom) [at index 0]");
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.Locale locale3 = new java.util.Locale("French", "de", "cinese (Cina)");
        org.junit.Assert.assertEquals(locale3.toString(), "french_DE_cinese (Cina)");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587\u4e2d\u56fd)", (double) 0.4100808f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale19.getUnicodeLocaleType("en_CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en_CA");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        long long5 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random0.longs((long) (-1397455457));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1909878034) + "'", int4 == (-1909878034));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1102261922816825068L) + "'", long5 == (-1102261922816825068L));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = random1.longs((long) (-1900217354));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.lang.String str20 = locale15.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale15.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.Random random1 = new java.util.Random(0L);
        double double2 = random1.nextGaussian();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream6 = random1.doubles((long) (-1752065703));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8025330637390305d + "'", double2 == 0.8025330637390305d);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        float float7 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (-474113270));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1123586554) + "'", int4 == (-1123586554));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1126972456099983546L) + "'", long5 == (-1126972456099983546L));
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5282502f + "'", float7 == 0.5282502f);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587\u4e2d\u56fd)", "it", "us");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587\u4e2d\u56fd)_IT_us");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        int int4 = random1.nextInt();
        long long5 = random1.nextLong();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1155484576) + "'", int4 == (-1155484576));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3109364765729502342L) + "'", long5 == (-3109364765729502342L));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("hi!");
        com.github.javafaker.Hacker hacker4 = faker0.hacker();
        com.github.javafaker.Code code5 = faker0.code();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("France");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.lang.String str8 = locale5.getScript();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale5);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Code code4 = faker0.code();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GB");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German" + "'", str3, "German");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.Random random1 = new java.util.Random(0L);
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        random1.setSeed((long) 'a');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        java.lang.String str13 = faker11.letterify("ita");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ita" + "'", str13, "ita");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.util.Locale.Category category39 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale40 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet42 = locale40.getExtensionKeys();
        java.util.Locale.setDefault(category39, locale40);
        java.util.Locale locale44 = java.util.Locale.getDefault(category39);
        java.lang.String str46 = locale44.getExtension('a');
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(locale44);
        java.lang.String str48 = locale26.getDisplayName(locale44);
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
        org.junit.Assert.assertTrue("'" + category39 + "' != '" + java.util.Locale.Category.FORMAT + "'", category39.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "italien" + "'", str48, "italien");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Random random6 = new java.util.Random((long) (byte) 10);
        long long7 = random6.nextLong();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale1, random6);
        java.lang.String str9 = locale1.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean6 = random1.nextBoolean();
        random1.setSeed((long) (-1279776254));
        double double9 = random1.nextDouble();
        float float10 = random1.nextFloat();
        long long11 = random1.nextLong();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3026497965127972d + "'", double9 == 0.3026497965127972d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.93973523f + "'", float10 == 0.93973523f);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-6274663997757565653L) + "'", long11 == (-6274663997757565653L));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('x', "");
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        java.util.Locale locale84 = new java.util.Locale("US", "chinese");
        java.lang.String str85 = null; // flaky: locale80.getDisplayVariant(locale84);
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
        org.junit.Assert.assertEquals(locale84.toString(), "us_CHINESE");
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str3 = faker0.bothify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Color color5 = faker0.color();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (-388136581));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese [at index 0]");
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ita", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("fr", strMap6);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode10 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strSet9, filteringMode10);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strSet13);
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
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strList83, filteringMode84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList83);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + filteringMode10 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode10.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet13);
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
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        int int2 = random1.nextInt();
        java.util.stream.LongStream longStream4 = random1.longs((long) '4');
        random1.setSeed((long) 1408303951);
        java.util.stream.IntStream intStream8 = random1.ints((long) 1491051916);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1155484576) + "'", int2 == (-1155484576));
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.App app5 = faker0.app();
        java.lang.String str7 = faker0.numerify("zh");
        com.github.javafaker.Number number8 = faker0.number();
        com.github.javafaker.Lorem lorem9 = faker0.lorem();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        boolean boolean4 = random1.nextBoolean();
        double double5 = random1.nextGaussian();
        java.util.stream.IntStream intStream8 = random1.ints((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.3325983427023256d) + "'", double5 == (-1.3325983427023256d));
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale.Builder builder7 = builder2.setLocale(locale5);
        java.lang.String str8 = locale5.getVariant();
        java.lang.Object obj9 = locale5.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "zh_CN");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.removeUnicodeLocaleAttribute("ja_JP");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja_JP [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.Locale locale1 = new java.util.Locale("zh");
        java.lang.String str3 = locale1.getExtension('a');
        java.lang.String str4 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("deu", (double) 0.2124942f);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = locale3.getDisplayCountry(locale9);
        java.lang.String str13 = locale3.getDisplayName();
        java.lang.String str14 = locale3.getScript();
        boolean boolean15 = languageRange2.equals((java.lang.Object) locale3);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        java.util.Locale locale21 = builder8.build();
        java.util.Locale.Builder builder23 = builder8.setLanguage("chinois");
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale1.getDisplayLanguage();
        java.lang.String str6 = locale1.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale1.getUnicodeLocaleType("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh-cn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Internet internet6 = faker5.internet();
        java.lang.String str8 = faker5.letterify("de");
        com.github.javafaker.Code code9 = faker5.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "de" + "'", str8, "de");
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getScript();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale4.getDisplayCountry();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Locale.setDefault(category7, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category7);
        java.lang.String str14 = locale12.getExtension('a');
        java.lang.String str15 = locale12.getCountry();
        java.lang.String str16 = locale4.getDisplayCountry(locale12);
        java.lang.String str17 = locale4.getVariant();
        java.lang.String str18 = locale0.getDisplayName(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Englisch (Kanada)" + "'", str5, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinesisch (Taiwan)" + "'", str18, "Chinesisch (Taiwan)");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder0.setExtension('x', "fr");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.util.Random random9 = new java.util.Random((long) (-268554284));
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale4, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-cn", (double) (-388136581));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-3.88136581E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.Locale locale3 = new java.util.Locale("us", "China", "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("italien (Italie)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: italien (Italie) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.Random random1 = new java.util.Random((long) (-910502427));
        java.util.stream.LongStream longStream4 = random1.longs((long) (-1189342480), (long) 23);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.util.Locale.Builder builder18 = builder13.setExtension('x', "");
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.lang.String str25 = locale23.getExtension('x');
        java.lang.String str26 = locale19.getDisplayVariant(locale23);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str28 = locale23.getDisplayScript(locale27);
        java.util.Locale locale29 = locale27.stripExtensions();
        java.util.Locale.Builder builder30 = builder18.setLocale(locale27);
        boolean boolean31 = locale0.equals((java.lang.Object) builder18);
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.lang.String str6 = locale4.getExtension('x');
        java.lang.String str7 = locale0.getDisplayName(locale4);
        java.lang.String str9 = locale0.getExtension('x');
        java.util.Locale locale11 = new java.util.Locale("fra");
        java.lang.String str12 = locale0.getDisplayScript(locale11);
        java.lang.String str13 = locale11.getLanguage();
        java.lang.String str14 = locale11.toLanguageTag();
        java.lang.String str15 = locale11.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals(locale11.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fra" + "'", str13, "fra");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        boolean boolean20 = locale13.hasExtensions();
        java.util.Locale.setDefault(locale13);
        java.lang.String str22 = locale13.getDisplayVariant();
        java.lang.String str23 = locale13.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        java.lang.String str14 = locale6.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        com.github.javafaker.App app20 = faker18.app();
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
        org.junit.Assert.assertNotNull(app20);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("und");
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
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap67);
        java.util.Locale locale72 = new java.util.Locale("", "", "");
        java.lang.String str74 = locale72.getExtension('x');
        java.util.Locale.setDefault(locale72);
        java.util.Locale locale76 = java.util.Locale.FRENCH;
        java.lang.String str77 = locale72.getDisplayLanguage(locale76);
        java.lang.String str78 = locale72.getISO3Language();
        java.util.Locale locale82 = new java.util.Locale("", "", "");
        java.lang.String str84 = locale82.getExtension('x');
        java.util.Locale.setDefault(locale82);
        java.util.Locale locale86 = java.util.Locale.FRENCH;
        java.lang.String str87 = locale82.getDisplayLanguage(locale86);
        java.lang.String str88 = locale72.getDisplayVariant(locale82);
        boolean boolean89 = locale82.hasExtensions();
        java.util.Locale.setDefault(locale82);
        java.util.Set<java.lang.String> strSet91 = locale82.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet91);
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
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(strList92);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("US", (double) (-925427400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-9.254274E8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("China");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.lang.String str10 = locale6.getUnicodeLocaleType("fr");
        java.util.Locale locale11 = locale6.stripExtensions();
        boolean boolean12 = languageRange1.equals((java.lang.Object) locale6);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str7 = locale4.getExtension('x');
        java.lang.String str8 = locale4.getDisplayScript();
        java.lang.String str9 = locale4.getDisplayScript();
        java.lang.String str10 = locale4.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale4.getUnicodeLocaleType("en_GB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en_GB");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguage("it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("chinese (china)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: chinese (china) [at index 0]");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.Locale locale2 = new java.util.Locale("JAPAN", "en_GB");
        org.junit.Assert.assertEquals(locale2.toString(), "japan_EN_GB");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        com.github.javafaker.Lorem lorem34 = faker33.lorem();
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
        org.junit.Assert.assertNotNull(lorem34);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.removeUnicodeLocaleAttribute("jpn_HI! (CHINESE (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: jpn_HI! (CHINESE (CHINA)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.Random random1 = new java.util.Random((long) 0);
        int int3 = random1.nextInt((int) '4');
        java.util.stream.IntStream intStream6 = random1.ints((-303169301), 0);
        long long7 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3109364765729502342L) + "'", long7 == (-3109364765729502342L));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale.Builder builder12 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder14 = builder7.setLanguageTag("French");
        java.util.Locale.Builder builder16 = builder14.setVariant("Italian");
        boolean boolean17 = locale0.equals((java.lang.Object) builder14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = new java.util.Locale("", "", "");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.lang.String str12 = locale0.getDisplayCountry(locale5);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale0);
        java.lang.String str14 = locale0.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh_CN" + "'", str14, "zh_CN");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("italien Italie");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italien italie");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.Random random1 = new java.util.Random((long) (-1370109667));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.util.Random random1 = new java.util.Random(7676145377811632764L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.IntStream intStream3 = random0.ints();
        java.util.stream.IntStream intStream5 = random0.ints((long) (byte) 100);
        double double6 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((double) 1894354479, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.04875928f + "'", float2 == 0.04875928f);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3329486160453504d + "'", double6 == 0.3329486160453504d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.Random random1 = new java.util.Random(100L);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = random1.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale8 = new java.util.Locale("", "", "");
        java.util.Locale.Builder builder9 = builder4.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setLanguage("jpn_HI! (CHINESE (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: jpn_HI! (CHINESE (CHINA)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) (byte) -1, (long) 190001823);
        int int6 = random1.nextInt();
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1155484576) + "'", int6 == (-1155484576));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("GB");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("de");
        java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.addUnicodeLocaleAttribute("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Korean (South Korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream35 = random1.ints((long) 673324482, 540195050, (-474113270));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.lang.String str12 = locale1.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4972683369271453960L) + "'", long7 == (-4972683369271453960L));
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587" + "'", str12, "\u6cd5\u6587");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.util.Locale locale2 = new java.util.Locale("", "deu");
        org.junit.Assert.assertEquals(locale2.toString(), "_DEU");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Number number3 = faker0.number();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        com.github.javafaker.Number number6 = faker0.number();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.LongStream longStream2 = random1.longs();
        java.util.stream.LongStream longStream4 = random1.longs(0L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream6 = random1.doubles();
        double double7 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random1.ints((long) (-408683759));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.981861954918068d + "'", double7 == 0.981861954918068d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
            java.util.Locale.Builder builder25 = builder23.addUnicodeLocaleAttribute("Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (China) [at index 0]");
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random1.nextBytes(byteArray7);
        random1.setSeed((long) 'a');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Code code12 = faker11.code();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-46, 122, -3]");
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        java.lang.String str3 = faker1.letterify("");
        com.github.javafaker.Book book4 = faker1.book();
        java.lang.String str6 = faker1.letterify("italien");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(book4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setVariant("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale8 = new java.util.Locale("Chinese (China)", "fra");
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Chine");
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.util.Random random15 = new java.util.Random(100L);
        java.util.stream.LongStream longStream17 = random15.longs((long) (short) 0);
        random15.setSeed((long) 'x');
        java.util.stream.LongStream longStream23 = random15.longs((long) 'u', 10L, (long) '4');
        java.util.stream.LongStream longStream26 = random15.longs((long) (-1528827163), (long) 1);
        java.util.stream.IntStream intStream29 = random15.ints(591553211, 2002825273);
        java.util.stream.IntStream intStream32 = random15.ints((-1279776254), 27);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale12, random15);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: chine could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale8.toString(), "chinese (china)_FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "chine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chinese (china)" + "'", str13, "chinese (china)");
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(intStream32);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("jpn", "deu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: jpn [at index 0]");
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("Chinesisch (Taiwan)", "English United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinesisch (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("jpn_HI! (CHINESE (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=jpn_hi! (chinese (china))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Italian");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.util.Set<java.lang.String> strSet14 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.Locale locale1 = new java.util.Locale("zh-CN");
        java.util.Locale locale5 = new java.util.Locale("de", "FRA", "English (United Kingdom)");
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.lang.Class<?> wildcardClass8 = locale1.getClass();
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn");
        org.junit.Assert.assertEquals(locale5.toString(), "de_FRA_English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        java.lang.String str83 = null; // flaky: locale80.getLanguage();
        boolean boolean84 = false; // flaky: locale80.hasExtensions();
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
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "fr" + "'", str83, "fr");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        int int4 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0L);
        java.util.stream.IntStream intStream7 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (-1434703326));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-551766426) + "'", int4 == (-551766426));
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 1641039410);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.64103941E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder6 = builder2.setLanguage("French");
        java.util.Locale.Builder builder9 = builder6.setExtension('x', "FRA");
        java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder6.setUnicodeLocaleKeyword("zh-TW", "und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh-TW [at index 0]");
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.util.Locale locale1 = new java.util.Locale("deu");
        org.junit.Assert.assertEquals(locale1.toString(), "deu");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale23);
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
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("fr");
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("de");
        java.util.Locale.Builder builder11 = builder8.setExtension('x', "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("jpn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.String str21 = locale4.toLanguageTag();
        java.lang.String str22 = locale4.getLanguage();
        java.util.Random random23 = new java.util.Random();
        java.util.stream.LongStream longStream24 = random23.longs();
        java.util.stream.LongStream longStream25 = random23.longs();
        long long26 = random23.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale4, random23);
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
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(longStream25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1857757303794345381L + "'", long26 == 1857757303794345381L);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "JPN");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.setScript("");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder13 = builder8.setExtension('a', "Chinese");
        java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale16 = builder15.build();
        java.util.Locale locale17 = builder15.build();
        java.lang.String str18 = locale2.getDisplayName(locale17);
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn_JPN");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-cn (JPN)" + "'", str18, "zh-cn (JPN)");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        com.github.javafaker.Number number22 = faker15.number();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.38882518f + "'", float11 == 0.38882518f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1692529656 + "'", int13 == 1692529656);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (China)" + "'", str19, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-TW" + "'", str21, "zh-TW");
        org.junit.Assert.assertNotNull(number22);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.util.Locale locale3 = new java.util.Locale("hi!", "italien (Italie)", "fr");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ITALIEN (ITALIE)_fr");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! (ITALIEN (ITALIE),fr)" + "'", str4, "hi! (ITALIEN (ITALIE),fr)");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.Locale locale2 = new java.util.Locale("de", "Chinese (China)");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale7.getDisplayScript(locale11);
        java.lang.String str14 = locale2.getDisplayVariant(locale11);
        java.util.Set<java.lang.Character> charSet15 = locale11.getExtensionKeys();
        java.lang.String str16 = locale11.getCountry();
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
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number11 = faker10.number();
        com.github.javafaker.Hacker hacker12 = faker10.hacker();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(hacker12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker0.resolve("chinese (china)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.util.Locale locale15 = java.util.Locale.getDefault(category13);
        java.util.Locale locale16 = java.util.Locale.JAPAN;
        java.lang.String str17 = locale16.getDisplayScript();
        java.lang.String str18 = locale16.getDisplayScript();
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.lang.String str24 = locale22.getExtension('x');
        java.util.Locale.setDefault(locale22);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.lang.String str28 = locale26.getDisplayVariant();
        java.lang.String str29 = locale16.getDisplayCountry(locale26);
        java.util.Locale.setDefault(category13, locale16);
        java.lang.String str31 = locale16.toLanguageTag();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6246292191371761d + "'", double6 == 0.6246292191371761d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09760425216810112d + "'", double9 == 0.09760425216810112d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Japon" + "'", str29, "Japon");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ja-JP" + "'", str31, "ja-JP");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRA");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Englisch (Kanada)");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.Locale locale2 = new java.util.Locale("", "x-lvariant-JPN");
        java.lang.String str4 = locale2.getExtension('a');
        org.junit.Assert.assertEquals(locale2.toString(), "_X-LVARIANT-JPN");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        double double2 = random0.nextDouble();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 17, (double) 0.77611816f, (double) 0.47650468f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5730283527294838d + "'", double2 == 0.5730283527294838d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream1 = random0.longs();
        float float2 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) '4');
        java.util.stream.IntStream intStream8 = random0.ints(100L, (int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((long) (-509927405));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7606971f + "'", float2 == 0.7606971f);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr", (double) 1);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        java.lang.String str5 = languageRange2.getRange();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category6);
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        java.lang.String str10 = locale9.getDisplayScript();
        java.lang.String str11 = locale9.getDisplayScript();
        java.util.Locale locale15 = new java.util.Locale("", "", "");
        java.lang.String str17 = locale15.getExtension('x');
        java.util.Locale.setDefault(locale15);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.lang.String str20 = locale15.getDisplayLanguage(locale19);
        java.lang.String str21 = locale19.getDisplayVariant();
        java.lang.String str22 = locale9.getDisplayCountry(locale19);
        java.util.Locale.setDefault(category6, locale9);
        java.util.Locale locale27 = new java.util.Locale("", "", "");
        java.lang.String str29 = locale27.getExtension('x');
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.lang.String str32 = locale27.getDisplayLanguage(locale31);
        java.lang.String str33 = locale27.getISO3Language();
        java.util.Locale locale37 = new java.util.Locale("", "", "");
        java.lang.String str39 = locale37.getExtension('x');
        java.util.Locale.setDefault(locale37);
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        java.lang.String str42 = locale37.getDisplayLanguage(locale41);
        java.lang.String str43 = locale27.getDisplayVariant(locale37);
        boolean boolean44 = locale27.hasExtensions();
        java.util.Locale.setDefault(category6, locale27);
        boolean boolean46 = languageRange2.equals((java.lang.Object) locale27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Japon" + "'", str22, "Japon");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.Random random1 = new java.util.Random((long) 1);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((long) (-1521488052));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str17 = locale12.getDisplayLanguage(locale16);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.util.Locale locale31 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale31.getExtension('x');
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = locale37.getISO3Country();
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale42.getDisplayLanguage(locale46);
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale8, locale12, locale18, locale26, locale31, locale37, locale46, locale49, locale52, locale54, locale56 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale.FilteringMode filteringMode61 = null;
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList59, filteringMode61);
        java.util.Locale locale63 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList65, strMap66);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeList67);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.Locale locale3 = new java.util.Locale("", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        java.util.Locale locale6 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Finance finance2 = faker0.finance();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) (byte) -1, (long) 190001823);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Random random7 = new java.util.Random();
        java.util.stream.LongStream longStream8 = random7.longs();
        java.util.stream.LongStream longStream10 = random7.longs(0L);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale6, random7);
        java.util.Random random13 = new java.util.Random(100L);
        java.util.stream.LongStream longStream15 = random13.longs((long) (short) 0);
        java.util.Random random17 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream19 = random17.doubles((long) 10);
        int int20 = random17.nextInt();
        java.util.stream.DoubleStream doubleStream21 = random17.doubles();
        java.util.stream.IntStream intStream22 = random17.ints();
        java.util.Random random24 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream26 = random24.doubles((long) 10);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random24.nextBytes(byteArray30);
        random17.nextBytes(byteArray30);
        random13.nextBytes(byteArray30);
        random7.nextBytes(byteArray30);
        random1.nextBytes(byteArray30);
        int int36 = random1.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream40 = random1.ints((long) (-787311256), (-1900217354), (-723955400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1157793070) + "'", int20 == (-1157793070));
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[96, -76, 32]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-723955400) + "'", int36 == (-723955400));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setVariant("");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("fr");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("de");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = new java.util.Locale("", "", "");
        java.util.Locale.setDefault(category13, locale17);
        java.util.Locale.Builder builder19 = builder12.setLocale(locale17);
        java.lang.String str20 = locale17.getScript();
        java.util.Locale.Builder builder21 = builder9.setLocale(locale17);
        java.util.Locale locale22 = builder9.build();
        java.lang.String str23 = locale22.getScript();
        boolean boolean24 = locale0.equals((java.lang.Object) str23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setVariant("ja-JP");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ja-JP [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.Locale locale2 = new java.util.Locale("Chinesisch (Taiwan)", "jpn");
        org.junit.Assert.assertEquals(locale2.toString(), "chinesisch (taiwan)_JPN");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Book book2 = faker0.book();
        com.github.javafaker.Hacker hacker3 = faker0.hacker();
        com.github.javafaker.Company company4 = faker0.company();
        java.lang.String str6 = faker0.letterify("zh-CN");
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Number number8 = faker0.number();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(book2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setRegion("English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = new java.util.Locale("", "", "");
        java.lang.String str9 = locale7.getExtension('x');
        java.lang.String str10 = locale3.getDisplayVariant(locale7);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale7.getDisplayScript(locale11);
        java.lang.String str14 = locale2.getDisplayCountry(locale7);
        java.lang.String str15 = locale2.getCountry();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder16.setVariant("");
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = builder18.build();
        java.lang.String str21 = locale2.getDisplayCountry(locale20);
        java.lang.String str22 = locale2.getDisplayCountry();
        java.lang.String str23 = locale0.getDisplayVariant(locale2);
        boolean boolean24 = locale2.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CN" + "'", str15, "CN");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi! (CHINESE (CHINA))", (double) 1900068223);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.900068223E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.Locale locale2 = new java.util.Locale("Chinesisch (Taiwan)", "JPN");
        org.junit.Assert.assertEquals(locale2.toString(), "chinesisch (taiwan)_JPN");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587", (double) 0.24406683f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ??");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.Random random1 = new java.util.Random((long) (byte) 10);
        java.util.stream.DoubleStream doubleStream3 = random1.doubles((long) 10);
        int int4 = random1.nextInt();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.App app6 = faker5.app();
        com.github.javafaker.Finance finance7 = faker5.finance();
        com.github.javafaker.Book book8 = faker5.book();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1157793070) + "'", int4 == (-1157793070));
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "Chinese");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Japan");
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale14.getDisplayCountry();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet20 = locale18.getExtensionKeys();
        java.util.Locale.setDefault(category17, locale18);
        java.util.Locale locale22 = java.util.Locale.getDefault(category17);
        java.lang.String str24 = locale22.getExtension('a');
        java.lang.String str25 = locale22.getCountry();
        java.lang.String str26 = locale14.getDisplayCountry(locale22);
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale14);
        java.lang.String str29 = locale14.getUnicodeLocaleType("US");
        java.util.Locale.Builder builder30 = builder12.setLocale(locale14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Englisch (Kanada)" + "'", str15, "Englisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.setLanguage("CN");
        java.util.Locale locale8 = builder7.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "cn");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.LongStream longStream3 = random0.longs((long) (-1), (long) (short) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles((long) '#');
        java.util.stream.LongStream longStream9 = random0.longs((long) 1358566768, (long) (-1690734402), (long) (-1279776254));
        java.util.stream.DoubleStream doubleStream10 = random0.doubles();
        float float11 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = random0.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.12807447f + "'", float11 == 0.12807447f);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale locale12 = new java.util.Locale("", "", "");
        java.util.Locale locale16 = new java.util.Locale("", "", "");
        java.lang.String str17 = locale12.getDisplayLanguage(locale16);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Locale locale22 = new java.util.Locale("", "", "");
        java.util.Locale locale26 = new java.util.Locale("", "", "");
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.util.Locale locale31 = new java.util.Locale("", "", "");
        java.lang.String str33 = locale31.getExtension('x');
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale36 = new java.util.Locale("hi!");
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = locale37.getISO3Country();
        java.util.Locale locale42 = new java.util.Locale("", "", "");
        java.util.Locale locale46 = new java.util.Locale("", "", "");
        java.lang.String str47 = locale42.getDisplayLanguage(locale46);
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Locale locale52 = new java.util.Locale("hi!");
        java.util.Locale locale54 = new java.util.Locale("hi!");
        java.util.Locale locale56 = new java.util.Locale("hi!");
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale8, locale12, locale18, locale26, locale31, locale37, locale46, locale49, locale52, locale54, locale56 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale.FilteringMode filteringMode61 = null;
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList59, filteringMode61);
        java.util.Locale locale63 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList59);
        java.lang.String str64 = locale63.getDisplayLanguage();
        java.lang.Object obj65 = locale63.clone();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals(locale36.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!");
        org.junit.Assert.assertEquals(locale56.toString(), "hi!");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguage("und");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.removeUnicodeLocaleAttribute("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("\u672a\u5b9a\u8bed\u79cd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? [at index 0]");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setScript("");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder10.setUnicodeLocaleKeyword("eng", "en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Random random3 = new java.util.Random();
        java.util.stream.LongStream longStream4 = random3.longs();
        java.util.stream.LongStream longStream6 = random3.longs(0L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale2, random3);
        java.util.stream.DoubleStream doubleStream8 = random3.doubles();
        java.util.stream.LongStream longStream9 = random3.longs();
        java.util.stream.LongStream longStream12 = random3.longs(0L, (long) 127135246);
        boolean boolean13 = languageRange1.equals((java.lang.Object) longStream12);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale7 = java.util.Locale.getDefault(category2);
        java.lang.String str9 = locale7.getExtension('a');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        boolean boolean11 = languageRange1.equals((java.lang.Object) locale7);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587", "\u4e2d\u6587", "ita");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ??");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u4e2d\u6587_ita");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("Japan");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.Locale locale2 = new java.util.Locale("de", "Japan");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getExtension('x');
        java.util.Locale locale7 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale3.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale3);
        java.util.Locale locale12 = new java.util.Locale("italien (Italie)", "it");
        java.lang.String str13 = locale2.getDisplayCountry(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(charSet14);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Options options3 = faker0.options();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.App app5 = faker0.app();
        java.lang.String str7 = faker0.numerify("zh");
        com.github.javafaker.Number number8 = faker0.number();
        java.lang.String str10 = faker0.letterify("ita");
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        com.github.javafaker.Hacker hacker17 = faker15.hacker();
        com.github.javafaker.Business business18 = faker15.business();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8340211f + "'", float11 == 0.8340211f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1042906082) + "'", int13 == (-1042906082));
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(hacker17);
        org.junit.Assert.assertNotNull(business18);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setVariant("");
        java.util.Locale.Builder builder28 = builder25.clear();
        java.util.Locale.Builder builder30 = builder25.setScript("");
        java.util.Locale locale31 = builder25.build();
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale22.getDisplayLanguage(locale31);
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "French" + "'", str33, "French");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        com.github.javafaker.Hacker hacker17 = faker16.hacker();
        com.github.javafaker.Code code18 = faker16.code();
        com.github.javafaker.DateAndTime dateAndTime19 = faker16.date();
        com.github.javafaker.Address address20 = faker16.address();
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
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.7837344f + "'", float11 == 0.7837344f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-266361440) + "'", int13 == (-266361440));
        org.junit.Assert.assertNotNull(hacker17);
        org.junit.Assert.assertNotNull(code18);
        org.junit.Assert.assertNotNull(dateAndTime19);
        org.junit.Assert.assertNotNull(address20);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.Random random1 = new java.util.Random(100L);
        java.util.stream.LongStream longStream3 = random1.longs((long) (short) 0);
        random1.setSeed((long) 'x');
        java.util.stream.LongStream longStream9 = random1.longs((long) 'u', 10L, (long) '4');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Number number11 = faker10.number();
        com.github.javafaker.Internet internet12 = faker10.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker10.resolve("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("Italian");
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = new java.util.Locale("ita", "", "und");
        java.lang.String str13 = locale11.getExtension('a');
        java.lang.String str14 = locale7.getDisplayCountry(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder6.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale11.toString(), "ita__und");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setVariant("");
        java.util.Locale locale7 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setUnicodeLocaleKeyword("\u6cd5\u56fd", "\u97d3\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u56fd");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u56fd");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.lang.String str21 = locale4.getScript();
        java.lang.String str22 = locale4.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale4);
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
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.Locale locale0 = null;
        java.util.Random random2 = new java.util.Random((long) (short) 0);
        java.util.stream.IntStream intStream4 = random2.ints((long) (short) 100);
        java.util.stream.IntStream intStream5 = random2.ints();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale0, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fra (FRA,fr)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fra (fra,fr)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}
