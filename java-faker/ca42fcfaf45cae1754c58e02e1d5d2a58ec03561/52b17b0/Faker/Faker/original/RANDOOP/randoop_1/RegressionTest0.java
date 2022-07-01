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
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Locale locale0 = java.util.Locale.CHINA;
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strList8);
        boolean boolean11 = locale0.equals((java.lang.Object) strList10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u56fd", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random0.longs((long) (byte) -1, 10L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CN" + "'", str2, "zh_CN");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('4', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.lang.Class<?> wildcardClass1 = filteringMode0.getClass();
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh_CN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random0.ints(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs(0L, (long) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = faker0.resolve("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(address1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = random0.doubles((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5585449508617509d) + "'", double2 == (-0.5585449508617509d));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setExtension('4', "zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setRegion("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("\u6cd5\u6587\u6cd5\u56fd)", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random0.ints((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.217148810195658d + "'", double4 == 1.217148810195658d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "hi!_HI!_hi!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Locale locale3 = new java.util.Locale("", "\u6cd5\u6587\u52a0\u62ff\u5927)", "zho");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)_zho");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch (china)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_CN" + "'", str4, "zh_CN");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setVariant("\u6cd5\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? (???) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random0.doubles((double) (byte) 10, (-0.3189030014234632d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random0.doubles((double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setRegion("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh-CN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Name name11 = faker10.name();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = faker10.resolve("Chinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getISO3Language();
        java.lang.String str5 = locale0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = null;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale24);
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = locale29.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.lang.String str33 = locale32.getScript();
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale14, locale15, locale16, locale19, locale20, locale23, locale24, locale26, locale28, locale29, locale32 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.Locale locale37 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strMap42);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags(languageRangeList43, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList48, filteringMode49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.Locale.FilteringMode filteringMode58 = null;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList56, filteringMode58);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = locale63.toLanguageTag();
        java.util.Locale locale65 = locale63.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.KOREAN;
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.lang.String str68 = locale67.toLanguageTag();
        java.util.Locale locale69 = locale67.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale70);
        java.util.Locale locale72 = java.util.Locale.CHINA;
        java.lang.String str73 = locale72.toLanguageTag();
        java.util.Locale locale74 = java.util.Locale.UK;
        java.util.Locale locale75 = java.util.Locale.CHINA;
        java.lang.String str76 = locale75.toLanguageTag();
        java.util.Locale locale77 = locale75.stripExtensions();
        java.util.Locale locale78 = java.util.Locale.CHINA;
        java.lang.String str79 = locale78.getScript();
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale60, locale61, locale62, locale65, locale66, locale69, locale70, locale72, locale74, locale75, locale78 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList81);
        boolean boolean85 = locale1.equals((java.lang.Object) localeList81);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-CN" + "'", str30, "zh-CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "zh-CN" + "'", str64, "zh-CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ko");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "zh-CN" + "'", str68, "zh-CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "zh-CN" + "'", str73, "zh-CN");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "zh-CN" + "'", str76, "zh-CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setExtension(' ', "zh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HI!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale5 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        boolean boolean7 = locale0.equals((java.lang.Object) str6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setVariant("zh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number5 = faker4.number();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker4.resolve("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("Chinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Chinesisch (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str3, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("\u4e2d\u56fd", "\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream9 = random0.longs((long) 'a', (long) 401882126);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = random0.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.34658177231785386d + "'", double4 == 0.34658177231785386d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((-2697365036775045142L), 606167875098546778L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Locale locale0 = java.util.Locale.CHINA;
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getLanguage();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = null;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale23);
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.lang.String str26 = locale25.toLanguageTag();
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale locale30 = locale28.stripExtensions();
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.lang.String str32 = locale31.getScript();
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale13, locale14, locale15, locale18, locale19, locale22, locale23, locale25, locale27, locale28, locale31 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = null;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList48, filteringMode50);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList51);
        java.util.Collection<java.util.Locale> localeCollection53 = null;
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, localeCollection53);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.Locale.FilteringMode filteringMode65 = null;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList63, filteringMode65);
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.util.Locale locale68 = java.util.Locale.KOREAN;
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale70.toLanguageTag();
        java.util.Locale locale72 = locale70.stripExtensions();
        java.util.Locale locale73 = java.util.Locale.KOREAN;
        java.util.Locale locale74 = java.util.Locale.CHINA;
        java.lang.String str75 = locale74.toLanguageTag();
        java.util.Locale locale76 = locale74.stripExtensions();
        java.util.Locale locale77 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale77);
        java.util.Locale locale79 = java.util.Locale.CHINA;
        java.lang.String str80 = locale79.toLanguageTag();
        java.util.Locale locale81 = java.util.Locale.UK;
        java.util.Locale locale82 = java.util.Locale.CHINA;
        java.lang.String str83 = locale82.toLanguageTag();
        java.util.Locale locale84 = locale82.stripExtensions();
        java.util.Locale locale85 = java.util.Locale.CHINA;
        java.lang.String str86 = locale85.getScript();
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale67, locale68, locale69, locale72, locale73, locale76, locale77, locale79, locale81, locale82, locale85 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale91 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList88, filteringMode92);
        boolean boolean94 = locale2.equals((java.lang.Object) filteringMode92);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zh-CN" + "'", str71, "zh-CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "zh-CN" + "'", str75, "zh-CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "zh-CN" + "'", str80, "zh-CN");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "zh-CN" + "'", str83, "zh-CN");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode92.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        double double10 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random0.ints((-1L), (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.713466995318874d) + "'", double4 == (-0.713466995318874d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.2932185083810242d) + "'", double10 == (-0.2932185083810242d));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = random0.ints(1L, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str2 = locale0.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("\u6cd5\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (???) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Locale locale2 = new java.util.Locale("\u82f1\u6587", "Chinesisch (China)");
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587_CHINESISCH (CHINA)");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream5 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random0.doubles((double) 401882126, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random0.doubles((long) (short) -1, (double) 0.8906689f, 0.7041849103637825d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4103409622194943d + "'", double4 == 0.4103409622194943d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        boolean boolean5 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str4 = locale3.getCountry();
        boolean boolean5 = languageRange1.equals((java.lang.Object) locale3);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles(0.3022510834993616d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.019388885179879908d + "'", double4 == 0.019388885179879908d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.lang.String str4 = locale0.getDisplayLanguage(locale3);
        java.lang.Object obj5 = locale3.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str1, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587" + "'", str4, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "zh_CN");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zho", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = null;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags(languageRangeList37, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.Locale.FilteringMode filteringMode53 = null;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList51, filteringMode53);
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.lang.String str59 = locale58.toLanguageTag();
        java.util.Locale locale60 = locale58.stripExtensions();
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = java.util.Locale.CHINA;
        java.lang.String str63 = locale62.toLanguageTag();
        java.util.Locale locale64 = locale62.stripExtensions();
        java.util.Locale locale65 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale65);
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.lang.String str68 = locale67.toLanguageTag();
        java.util.Locale locale69 = java.util.Locale.UK;
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale70.toLanguageTag();
        java.util.Locale locale72 = locale70.stripExtensions();
        java.util.Locale locale73 = java.util.Locale.CHINA;
        java.lang.String str74 = locale73.getScript();
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale55, locale56, locale57, locale60, locale61, locale64, locale65, locale67, locale69, locale70, locale73 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale locale78 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale locale79 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, strMap83);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags(languageRangeList84, (java.util.Collection<java.lang.String>) strList87);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList89, filteringMode90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList42, filteringMode90);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList23, filteringMode90);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zh-CN" + "'", str59, "zh-CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "zh-CN" + "'", str63, "zh-CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "zh-CN" + "'", str68, "zh-CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zh-CN" + "'", str71, "zh-CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode90.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setUnicodeLocaleKeyword("zh-TW", "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh-TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.Object obj2 = null;
        boolean boolean3 = locale0.equals(obj2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random0.doubles((-5169603393975531791L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.53948426f + "'", float5 == 0.53948426f);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((long) '#', (double) 'a', 0.04702830040266232d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (-0.21066385615047348d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.21066385615047348");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (short) 1, 1.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3968769451221164d) + "'", double2 == (-2.3968769451221164d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4393159923188296510L + "'", long4 == 4393159923188296510L);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5007638909419475d + "'", double5 == 0.5007638909419475d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = null;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = locale22.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = locale30.stripExtensions();
        java.util.Locale locale33 = java.util.Locale.CHINA;
        java.lang.String str34 = locale33.getScript();
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale15, locale16, locale17, locale20, locale21, locale24, locale25, locale27, locale29, locale30, locale33 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = null;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale54 = locale52.stripExtensions();
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.lang.String str57 = locale56.toLanguageTag();
        java.util.Locale locale58 = locale56.stripExtensions();
        java.util.Locale locale59 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale59);
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale63 = java.util.Locale.UK;
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = locale64.toLanguageTag();
        java.util.Locale locale66 = locale64.stripExtensions();
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.lang.String str68 = locale67.getScript();
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale49, locale50, locale51, locale54, locale55, locale58, locale59, locale61, locale63, locale64, locale67 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList70);
        boolean boolean74 = languageRange1.equals((java.lang.Object) localeList73);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh-CN" + "'", str53, "zh-CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "zh-CN" + "'", str57, "zh-CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zh-CN" + "'", str65, "zh-CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream5 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setScript("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Locale locale1 = new java.util.Locale("und");
        org.junit.Assert.assertEquals(locale1.toString(), "und");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker0.resolve("de-DE");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale0.getDisplayScript(locale5);
        java.lang.Class<?> wildcardClass8 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str4, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        long long12 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles((-2715822492754316906L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9331676940113822d) + "'", double4 == (-0.9331676940113822d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.24749658090268262d) + "'", double11 == (-0.24749658090268262d));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7215677182253527664L) + "'", long12 == (-7215677182253527664L));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Number number7 = faker0.number();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.lang.String str9 = locale5.getDisplayLanguage(locale8);
        boolean boolean10 = locale4.equals((java.lang.Object) locale5);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "hi!_HI!_hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French" + "'", str9, "French");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random0.ints(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.279916776152791d + "'", double2 == 1.279916776152791d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5421608885336127110L) + "'", long4 == (-5421608885336127110L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.1884871566405315d) + "'", double5 == (-0.1884871566405315d));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setVariant("GBR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.lang.Object obj11 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "zh_CN");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 1, (double) (byte) 100, 0.15676664273909743d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setVariant("CHN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CHN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('#', "HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags(languageRangeList29, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Locale.FilteringMode filteringMode43 = null;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList41, filteringMode43);
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.CHINA;
        java.lang.String str49 = locale48.toLanguageTag();
        java.util.Locale locale50 = locale48.stripExtensions();
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale54 = locale52.stripExtensions();
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale55);
        java.util.Locale locale57 = java.util.Locale.CHINA;
        java.lang.String str58 = locale57.toLanguageTag();
        java.util.Locale locale59 = java.util.Locale.UK;
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.lang.String str61 = locale60.toLanguageTag();
        java.util.Locale locale62 = locale60.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = locale63.getScript();
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale45, locale46, locale47, locale50, locale51, locale54, locale55, locale57, locale59, locale60, locale63 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale locale68 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.util.Locale.FilteringMode filteringMode77 = null;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList75, filteringMode77);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList81, filteringMode83);
        java.util.Locale.LanguageRange[] languageRangeArray85 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList86 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList86, languageRangeArray85);
        java.lang.String[] strArray89 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        java.util.Locale.FilteringMode filteringMode92 = null;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList86, (java.util.Collection<java.lang.String>) strList90, filteringMode92);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList90);
        java.util.Locale.FilteringMode filteringMode95 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList90, filteringMode95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zh-CN" + "'", str49, "zh-CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh-CN" + "'", str53, "zh-CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "zh-CN" + "'", str58, "zh-CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode83.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(languageRangeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertTrue("'" + filteringMode95 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode95.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList96);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("China", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr_FR" + "'", str3, "fr_FR");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Franz\366sisch (Frankreich)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franzo?sisch(frankreich)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random0.doubles((-5169603393975531791L), (double) 0.0f, (double) 0.27772975f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.27214772454877195d) + "'", double4 == (-0.27214772454877195d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.5725878825491164d) + "'", double11 == (-0.5725878825491164d));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random0.ints(5288735684466769752L, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.027904615672211124d + "'", double4 == 0.027904615672211124d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Name name11 = faker10.name();
        java.lang.Class<?> wildcardClass12 = faker10.getClass();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh_CN");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u56fd");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale locale7 = new java.util.Locale("fran\347ais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLocale(locale7);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale7.toString(), "fran\347ais");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getCountry();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois" + "'", str1, "chinois");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TW" + "'", str3, "TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_TW" + "'", str4, "zh_TW");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        boolean boolean5 = languageRange1.equals((java.lang.Object) locale4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((-1L), (double) 0.3298241f, (double) 1133475767620805068L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        java.lang.String str8 = faker3.letterify("Chine");
        java.lang.String str10 = faker3.regexify("en");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("US", "de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: de-DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Address address11 = faker10.address();
        com.github.javafaker.Code code12 = faker10.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random0.ints((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.2744689746045537d) + "'", double4 == (-1.2744689746045537d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-8991695903954911829L) + "'", long5 == (-8991695903954911829L));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.86283946f + "'", float6 == 0.86283946f);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random0.longs(0L, 7975027329722967446L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.toLanguageTag();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale22);
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = locale27.stripExtensions();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale30.getScript();
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale12, locale13, locale14, locale17, locale18, locale21, locale22, locale24, locale26, locale27, locale30 };
        java.util.ArrayList<java.util.Locale> localeList33 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList33, localeArray32);
        java.util.Locale locale35 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = null;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale49 = java.util.Locale.CHINA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.util.Locale locale51 = locale49.stripExtensions();
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.CHINA;
        java.lang.String str54 = locale53.toLanguageTag();
        java.util.Locale locale55 = locale53.stripExtensions();
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale56);
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.lang.String str59 = locale58.toLanguageTag();
        java.util.Locale locale60 = java.util.Locale.UK;
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale63 = locale61.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = locale64.getScript();
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale46, locale47, locale48, locale51, locale52, locale55, locale56, locale58, locale60, locale61, locale64 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        java.util.Locale.FilteringMode filteringMode80 = null;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList78, filteringMode80);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList84, filteringMode86);
        java.util.Locale.LanguageRange[] languageRangeArray88 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList89 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList89, languageRangeArray88);
        java.lang.String[] strArray92 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList93 = new java.util.ArrayList<java.lang.String>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList93, strArray92);
        java.util.Locale.FilteringMode filteringMode95 = null;
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList89, (java.util.Collection<java.lang.String>) strList93, filteringMode95);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList93);
        java.util.Locale.FilteringMode filteringMode98 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList99 = java.util.Locale.filterTags(languageRangeList72, (java.util.Collection<java.lang.String>) strList93, filteringMode98);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-CN" + "'", str20, "zh-CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(localeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zh-CN" + "'", str54, "zh-CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zh-CN" + "'", str59, "zh-CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(languageRangeArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertTrue("'" + filteringMode98 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode98.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList99);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setLanguage("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random0.longs((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.2967836841439473d) + "'", double4 == (-1.2967836841439473d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.737808511090229d) + "'", double11 == (-1.737808511090229d));
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale locale7 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLocale(locale7);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh_tw [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number5 = faker4.number();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker4.resolve("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("\u4e2d\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getUnicodeLocaleType("\u4e2d\u570b");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.setUnicodeLocaleKeyword("zh_CN", "chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("", "zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.Business business7 = faker3.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker3.resolve("USA");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2);
        com.github.javafaker.Lorem lorem7 = faker6.lorem();
        boolean boolean8 = locale0.equals((java.lang.Object) faker6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: chinois (Chine) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale0.getDisplayName(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream6 = random0.doubles((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs((-7561469220369522668L), 1873084296697550790L, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random0.longs((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08449723908166784d + "'", double10 == 0.08449723908166784d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.16780862874992708d + "'", double11 == 0.16780862874992708d);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        int int5 = random0.nextInt();
        java.util.stream.LongStream longStream7 = random0.longs((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints(1272557603, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-458814988) + "'", int5 == (-458814988));
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = null;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale23);
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.lang.String str26 = locale25.toLanguageTag();
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale locale30 = locale28.stripExtensions();
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.lang.String str32 = locale31.getScript();
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale13, locale14, locale15, locale18, locale19, locale22, locale23, locale25, locale27, locale28, locale31 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Locale locale37 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList42, (java.util.Collection<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList47, filteringMode48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.Locale.FilteringMode filteringMode57 = null;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList55, filteringMode57);
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = java.util.Locale.CHINA;
        java.lang.String str63 = locale62.toLanguageTag();
        java.util.Locale locale64 = locale62.stripExtensions();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.toLanguageTag();
        java.util.Locale locale68 = locale66.stripExtensions();
        java.util.Locale locale69 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale69);
        java.util.Locale locale71 = java.util.Locale.CHINA;
        java.lang.String str72 = locale71.toLanguageTag();
        java.util.Locale locale73 = java.util.Locale.UK;
        java.util.Locale locale74 = java.util.Locale.CHINA;
        java.lang.String str75 = locale74.toLanguageTag();
        java.util.Locale locale76 = locale74.stripExtensions();
        java.util.Locale locale77 = java.util.Locale.CHINA;
        java.lang.String str78 = locale77.getScript();
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale59, locale60, locale61, locale64, locale65, locale68, locale69, locale71, locale73, locale74, locale77 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.Locale locale82 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList80);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "zh-CN" + "'", str63, "zh-CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh-CN" + "'", str67, "zh-CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zh-CN" + "'", str72, "zh-CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "zh-CN" + "'", str75, "zh-CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(locale82);
        org.junit.Assert.assertNotNull(localeList83);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Book book11 = faker10.book();
        java.lang.Class<?> wildcardClass12 = faker10.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getScript();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "zh_CN");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("en-gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setRegion("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) (byte) 10, 1.092619416224627d, 0.6533317665942538d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.2744018452680963d) + "'", double4 == (-1.2744018452680963d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2554216397697179d + "'", double6 == 0.2554216397697179d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.13090213963515082d) + "'", double11 == (-0.13090213963515082d));
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setScript("\u82f1\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((-5169603393975531791L), 0L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4318910745237011d + "'", double4 == 0.4318910745237011d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        int int5 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random0.ints((-5169603393975531791L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1626990827 + "'", int5 == 1626990827);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.addUnicodeLocaleAttribute("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        float float9 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random0.ints(1162426200426189844L, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.21537465f + "'", float9 == 0.21537465f);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South Korea" + "'", str2, "South Korea");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str4 = locale3.getDisplayLanguage();
        boolean boolean5 = locale0.equals((java.lang.Object) locale3);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "chine");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chine" + "'", str1, "chine");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese" + "'", str4, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random0.longs(1162426200426189844L, (-5169603393975531791L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31071369759353856d + "'", double2 == 0.31071369759353856d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr-FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("\u6cd5\u6587\u6cd5\u56fd)", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.LongStream longStream13 = random0.longs();
        random0.setSeed(100L);
        java.util.stream.LongStream longStream19 = random0.longs(1426876149034384144L, (-7561469220369522668L), (long) (byte) 0);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5926417771679163d + "'", double4 == 0.5926417771679163d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.07753855419856837d + "'", double6 == 0.07753855419856837d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.12146925790660652d) + "'", double11 == (-0.12146925790660652d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        com.github.javafaker.Code code7 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLanguageTag("\u4e2d\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        java.lang.String str5 = faker0.bothify("\u4e2d\u56fd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (-0.5244510189182026d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.5244510189182026");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setVariant("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBR" + "'", str1, "GBR");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "en_GB");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random0.doubles((long) '#', 0.44251240629552685d, 0.07753855419856837d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.05687852142518912d + "'", double10 == 0.05687852142518912d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8050985952864874d + "'", double11 == 0.8050985952864874d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setVariant("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        boolean boolean9 = locale5.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.lang.String str14 = locale5.getDisplayCountry(locale10);
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale5.getDisplayCountry(locale15);
        java.lang.String str18 = locale0.getDisplayScript(locale5);
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.lang.String str22 = locale19.getISO3Language();
        java.lang.String str23 = locale19.getDisplayLanguage();
        java.lang.String str24 = locale0.getDisplayScript(locale19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinesisch (China)" + "'", str8, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str11, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chine" + "'", str14, "Chine");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) (short) 100);
        int int8 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.27870135819323305d + "'", double4 == 0.27870135819323305d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 963875490 + "'", int8 == 963875490);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company2 = faker1.company();
        com.github.javafaker.Code code3 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        int int5 = random0.nextInt();
        java.util.stream.LongStream longStream7 = random0.longs((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((-3134175886536839531L), (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1372440016 + "'", int5 == 1372440016);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("CN");
        boolean boolean5 = languageRange1.equals((java.lang.Object) languageRangeList4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        boolean boolean5 = languageRange1.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app5 = faker4.app();
        java.lang.String str7 = faker4.bothify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str7, "\u6cd5\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("\u6cd5\u6587\u6cd5\u56fd)", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        java.lang.String str3 = faker0.numerify("\u53f0\u7063");
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063" + "'", str3, "\u53f0\u7063");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Color color3 = faker0.color();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.IntStream intStream4 = random0.ints();
        double double5 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.248516732179981d) + "'", double2 == (-0.248516732179981d));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.069928233001402d) + "'", double5 == (-1.069928233001402d));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream10 = random0.longs((long) 1790226314, (-353348817566512051L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.262868867840308d) + "'", double4 == (-2.262868867840308d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.addUnicodeLocaleAttribute("\u4e2d\u6587");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str5, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.removeUnicodeLocaleAttribute("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.setRegion("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((-1525526210113119355L), 1790226314, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4142529785217632d + "'", double4 == 1.4142529785217632d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6414146275502781711L + "'", long5 == 6414146275502781711L);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.70758665f + "'", float6 == 0.70758665f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.LongStream longStream18 = random0.longs(5288735684466769752L, 1L, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream22 = random0.longs((long) (byte) 1, (long) 383222448, (-2973136146954523582L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream18);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_CN" + "'", str3, "zh_CN");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Address address3 = faker1.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(address3);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CN" + "'", str2, "zh_CN");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker0.resolve("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("\u53f0\u7063", "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        double double6 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((-2973136146954523582L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5601638f + "'", float5 == 0.5601638f);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2266619448156929d + "'", double6 == 0.2266619448156929d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ??????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        java.lang.String str5 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Name name11 = faker10.name();
        com.github.javafaker.Code code12 = faker10.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(code12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles(0L, 0.2936603199508673d, (double) 0.27772975f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9558646572432251d) + "'", double2 == (-0.9558646572432251d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-391126169629529775L) + "'", long4 == (-391126169629529775L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8865530637682857d + "'", double5 == 0.8865530637682857d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("China", "\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random5.ints(1133475767620805068L, 383222448, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setLanguage("Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Chinesisch (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = random0.nextInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5521865758622513d + "'", double4 == 0.5521865758622513d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream9 = random0.ints((int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((-3134175886536839531L), (-4962768465676381896L), 1133475767620805068L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.33535011159118716d + "'", double4 == 0.33535011159118716d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9398954653581986d + "'", double6 == 0.9398954653581986d);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Finance finance7 = faker0.finance();
        com.github.javafaker.App app8 = faker0.app();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Name name6 = faker0.name();
        com.github.javafaker.Finance finance7 = faker0.finance();
        com.github.javafaker.Address address8 = faker0.address();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getUnicodeLocaleType("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: English");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        double double15 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random0.ints((-5169603393975531791L), (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9638626309534605d + "'", double15 == 0.9638626309534605d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Random random1 = new java.util.Random(0L);
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(0.3893588757268301d, (double) 1426876149034384144L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = random1.ints((long) 1272557603, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        float float13 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream15 = random0.doubles((-4711220549636234721L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.058236827851663d + "'", double4 == 1.058236827851663d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.3030092f + "'", float13 == 0.3030092f);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.toLanguageTag();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale22);
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = locale27.stripExtensions();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale30.getScript();
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale12, locale13, locale14, locale17, locale18, locale21, locale22, locale24, locale26, locale27, locale30 };
        java.util.ArrayList<java.util.Locale> localeList33 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList33, localeArray32);
        java.util.Locale locale35 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = null;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale49 = java.util.Locale.CHINA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.util.Locale locale51 = locale49.stripExtensions();
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.CHINA;
        java.lang.String str54 = locale53.toLanguageTag();
        java.util.Locale locale55 = locale53.stripExtensions();
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale56);
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.lang.String str59 = locale58.toLanguageTag();
        java.util.Locale locale60 = java.util.Locale.UK;
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale63 = locale61.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = locale64.getScript();
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale46, locale47, locale48, locale51, locale52, locale55, locale56, locale58, locale60, locale61, locale64 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap71);
        java.util.Locale locale73 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags(languageRangeList72, (java.util.Collection<java.lang.String>) strSet74);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-CN" + "'", str20, "zh-CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(localeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zh-CN" + "'", str54, "zh-CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zh-CN" + "'", str59, "zh-CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strList75);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getVariant();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.lang.String str7 = locale3.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        boolean boolean8 = locale4.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale4.getDisplayCountry(locale14);
        java.lang.String str17 = locale4.getDisplayScript();
        java.util.Locale.Builder builder18 = builder2.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder18.setUnicodeLocaleKeyword("USA", "\u4e2d\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: USA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch (China)" + "'", str7, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str10, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Finance finance3 = faker0.finance();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Random random1 = new java.util.Random(0L);
        long long2 = random1.nextLong();
        java.util.stream.DoubleStream doubleStream4 = random1.doubles(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4962768465676381896L) + "'", long2 == (-4962768465676381896L));
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        boolean boolean3 = languageRange1.equals((java.lang.Object) "CHN");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = null;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strList38);
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = null;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = java.util.Locale.CHINA;
        java.lang.String str58 = locale57.toLanguageTag();
        java.util.Locale locale59 = locale57.stripExtensions();
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale63 = locale61.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale64);
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.toLanguageTag();
        java.util.Locale locale68 = java.util.Locale.UK;
        java.util.Locale locale69 = java.util.Locale.CHINA;
        java.lang.String str70 = locale69.toLanguageTag();
        java.util.Locale locale71 = locale69.stripExtensions();
        java.util.Locale locale72 = java.util.Locale.CHINA;
        java.lang.String str73 = locale72.getScript();
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale54, locale55, locale56, locale59, locale60, locale63, locale64, locale66, locale68, locale69, locale72 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        java.util.Locale locale77 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList75);
        java.util.Locale locale78 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList75);
        java.util.Locale locale79 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList75);
        boolean boolean80 = languageRange1.equals((java.lang.Object) locale79);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "zh-CN" + "'", str58, "zh-CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh-CN" + "'", str67, "zh-CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "zh-CN" + "'", str70, "zh-CN");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale0.getDisplayScript(locale1);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime7 = faker6.date();
        java.lang.Class<?> wildcardClass8 = faker6.getClass();
        boolean boolean9 = locale1.equals((java.lang.Object) faker6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = null;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = null;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, strMap38);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags(languageRangeList39, (java.util.Collection<java.lang.String>) strList42);
        java.lang.String str45 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, strMap49);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags(languageRangeList50, (java.util.Collection<java.lang.String>) strList53);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55);
        java.util.Collection<java.util.Locale> localeCollection57 = null;
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.Locale.FilteringMode filteringMode66 = null;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList64, filteringMode66);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList70, filteringMode72);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.Locale.FilteringMode filteringMode81 = null;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList79, filteringMode81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList79);
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strSet85, filteringMode86);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection57, filteringMode86);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode86.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(localeList88);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.removeUnicodeLocaleAttribute("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        boolean boolean4 = languageRange1.equals((java.lang.Object) 0.47595074767421086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setScript("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = locale24.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.getScript();
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale9, locale10, locale11, locale14, locale15, locale18, locale19, locale21, locale23, locale24, locale27 };
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.Locale locale32 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = null;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList47);
        java.util.Collection<java.util.Locale> localeCollection49 = null;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.FilteringMode filteringMode61 = null;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList59, filteringMode61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.toLanguageTag();
        java.util.Locale locale68 = locale66.stripExtensions();
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale70.toLanguageTag();
        java.util.Locale locale72 = locale70.stripExtensions();
        java.util.Locale locale73 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale73);
        java.util.Locale locale75 = java.util.Locale.CHINA;
        java.lang.String str76 = locale75.toLanguageTag();
        java.util.Locale locale77 = java.util.Locale.UK;
        java.util.Locale locale78 = java.util.Locale.CHINA;
        java.lang.String str79 = locale78.toLanguageTag();
        java.util.Locale locale80 = locale78.stripExtensions();
        java.util.Locale locale81 = java.util.Locale.CHINA;
        java.lang.String str82 = locale81.getScript();
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale63, locale64, locale65, locale68, locale69, locale72, locale73, locale75, locale77, locale78, locale81 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList84, filteringMode88);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap90 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList91 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap90);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh-CN" + "'", str67, "zh-CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zh-CN" + "'", str71, "zh-CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "zh-CN" + "'", str76, "zh-CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "zh-CN" + "'", str79, "zh-CN");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode88.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(languageRangeList91);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayCountry();
        java.lang.String str11 = locale7.getDisplayName();
        java.lang.String str12 = locale7.getDisplayLanguage();
        java.util.Locale.Builder builder13 = builder6.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setScript("China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str11, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.IntStream intStream16 = random6.ints(3376856765316790501L, 0, (int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream20 = random6.longs((-353348817566512051L), (long) (byte) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale0.getDisplayLanguage(locale1);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = null;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = locale22.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = locale26.stripExtensions();
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale29);
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Locale locale33 = java.util.Locale.UK;
        java.util.Locale locale34 = java.util.Locale.CHINA;
        java.lang.String str35 = locale34.toLanguageTag();
        java.util.Locale locale36 = locale34.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.CHINA;
        java.lang.String str38 = locale37.getScript();
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale19, locale20, locale21, locale24, locale25, locale28, locale29, locale31, locale33, locale34, locale37 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale locale42 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale locale43 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.Locale.FilteringMode filteringMode51 = null;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList49, filteringMode51);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.lang.String str57 = locale56.toLanguageTag();
        java.util.Locale locale58 = locale56.stripExtensions();
        java.util.Locale locale59 = java.util.Locale.KOREAN;
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.lang.String str61 = locale60.toLanguageTag();
        java.util.Locale locale62 = locale60.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale63);
        java.util.Locale locale65 = java.util.Locale.CHINA;
        java.lang.String str66 = locale65.toLanguageTag();
        java.util.Locale locale67 = java.util.Locale.UK;
        java.util.Locale locale68 = java.util.Locale.CHINA;
        java.lang.String str69 = locale68.toLanguageTag();
        java.util.Locale locale70 = locale68.stripExtensions();
        java.util.Locale locale71 = java.util.Locale.CHINA;
        java.lang.String str72 = locale71.getScript();
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale53, locale54, locale55, locale58, locale59, locale62, locale63, locale65, locale67, locale68, locale71 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.Locale.FilteringMode filteringMode84 = null;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList82, filteringMode84);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList88, filteringMode90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str93 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList91);
        boolean boolean94 = locale1.equals((java.lang.Object) str93);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh-CN" + "'", str35, "zh-CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "zh-CN" + "'", str57, "zh-CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zh-CN" + "'", str66, "zh-CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "zh-CN" + "'", str69, "zh-CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode90.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Locale locale1 = new java.util.Locale("Chine");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "chine");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "chine");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "chine");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "chine");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.lang.String str6 = locale1.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str6, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream18 = random0.longs(5271697340533654850L, 7643996864325553509L, 5271697340533654850L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.013196480952017945d) + "'", double4 == (-0.013196480952017945d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-21, 93, 2]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random0.nextInt((-1480715465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random0.ints((long) (-1504576282), (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.2187979768985664d) + "'", double4 == (-1.2187979768985664d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 159893841722173548L + "'", long5 == 159893841722173548L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Company company11 = faker10.company();
        java.lang.String str13 = faker10.regexify("zh_TW");
        com.github.javafaker.Business business14 = faker10.business();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh_TW" + "'", str13, "zh_TW");
        org.junit.Assert.assertNotNull(business14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.17629814f + "'", float5 == 0.17629814f);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("fr-CA", "Chine");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: fr-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale8.getDisplayCountry(locale9);
        java.lang.String str12 = locale5.getDisplayCountry(locale8);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setVariant("GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GB" + "'", str6, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-GB" + "'", str7, "en-GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u56fd" + "'", str12, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension('#', "\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles((long) 2109552831, (-0.9228481132699702d), (double) (-4601747285168096166L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.975343530205448d + "'", double10 == 0.975343530205448d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Locale locale2 = new java.util.Locale("South Korea", "chine");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "south korea_CHINE");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension(' ', "de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setVariant("CHN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CHN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: chinois (Chine) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getUnicodeLocaleType("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zh_TW");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale1.getDisplayName(locale7);
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 0, (double) '#');
        double double13 = random9.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random9.doubles();
        double double15 = random9.nextDouble();
        java.util.stream.IntStream intStream19 = random9.ints(100L, (-1), (int) (byte) 0);
        double double20 = random9.nextGaussian();
        java.util.stream.IntStream intStream21 = random9.ints();
        java.util.stream.LongStream longStream22 = random9.longs();
        boolean boolean23 = locale7.equals((java.lang.Object) longStream22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "coreano" + "'", str8, "coreano");
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.8348854063688496d) + "'", double13 == (-1.8348854063688496d));
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8287222225215553d + "'", double15 == 0.8287222225215553d);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.40295692867276145d + "'", double20 == 0.40295692867276145d);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.getCountry();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        int int10 = random0.nextInt(1);
        java.util.stream.IntStream intStream14 = random0.ints(7975027329722967446L, (int) (byte) 10, 963875490);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream10 = random3.doubles((-1.0d), 0.028145596690574037d);
        boolean boolean11 = locale2.equals((java.lang.Object) doubleStream10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.App app6 = faker4.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.lang.String str26 = locale25.toLanguageTag();
        java.util.Locale locale27 = locale25.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.getScript();
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale10, locale11, locale12, locale15, locale16, locale19, locale20, locale22, locale24, locale25, locale28 };
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        java.util.Locale locale33 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale34 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(localeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(locale33);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.setLanguageTag("HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream17 = random0.ints((long) 2109552831, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream21 = random0.doubles(1847242113680462994L, (double) 1, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream24 = random0.doubles((double) 7975027329722967446L, (double) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setRegion("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("HI!", 2.2934346815192392d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.2934346815192392");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str4, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        java.util.stream.LongStream longStream8 = random0.longs();
        java.util.stream.LongStream longStream11 = random0.longs((long) (short) 100, 7975027329722967446L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.240064709393936d + "'", double4 == 1.240064709393936d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-8645586194389883287L) + "'", long5 == (-8645586194389883287L));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5176488f + "'", float6 == 0.5176488f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getScript();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.lang.String str6 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("USA", 1.561581040188955d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.561581040188955");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KR" + "'", str1, "KR");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles(10L, 0.23729547807028498d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.058430820396474466d) + "'", double4 == (-0.058430820396474466d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.IntStream intStream4 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random0.longs(0L, (-1997400267751516784L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0465199961539184d) + "'", double2 == (-2.0465199961539184d));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random0.ints(383222448, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("eng");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((-2973136146954523582L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.18775361468405818d) + "'", double4 == (-0.18775361468405818d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9485907044883191d + "'", double6 == 0.9485907044883191d);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale7 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_CN" + "'", str5, "zh_CN");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", 0.6866727861559659d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "taiwan" + "'", str3, "taiwan");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale1.getDisplayLanguage(locale20);
        java.lang.String str23 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5438035133075299180L + "'", long16 == 5438035133075299180L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh_CN" + "'", str23, "zh_CN");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("\u82f1\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-1.0d), 0.028145596690574037d);
        java.util.stream.LongStream longStream11 = random0.longs(1409958607731658842L, (-7404998436585383175L), (-2715822492754316906L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream14 = random0.longs((long) (short) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Locale locale3 = new java.util.Locale("CAN", "CN", "en-gb");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "can_CN_en-gb");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "can_CN_en-gb");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "can_CN_en-gb" + "'", str5, "can_CN_en-gb");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setVariant("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str2 = locale1.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("coreano");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: coreano");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        boolean boolean6 = languageRange1.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-gb" + "'", str2, "en-gb");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLanguage("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = null;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale23);
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.lang.String str26 = locale25.toLanguageTag();
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale locale30 = locale28.stripExtensions();
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.lang.String str32 = locale31.getScript();
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale13, locale14, locale15, locale18, locale19, locale22, locale23, locale25, locale27, locale28, locale31 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Locale locale37 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Collection<java.lang.String> strCollection38 = null;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strCollection38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = null;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList51, filteringMode53);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = null;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList60);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, strMap68);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList69, (java.util.Collection<java.lang.String>) strList72);
        java.lang.String str75 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList74);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap79 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, strMap79);
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList80, (java.util.Collection<java.lang.String>) strList83);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList85);
        java.util.Collection<java.util.Locale> localeCollection87 = null;
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, localeCollection87);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection87, filteringMode89);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale91 = java.util.Locale.lookup(languageRangeList0, localeCollection87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode53.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode89.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList90);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        int int14 = random1.nextInt((int) (short) 100);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7070708886411432d + "'", double11 == 0.7070708886411432d);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 68 + "'", int14 == 68);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.removeUnicodeLocaleAttribute("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        int int8 = random0.nextInt((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((-8760364856787578239L), 0.2778323727493555d, 0.7329923173060845d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.18385865943081278d + "'", double4 == 0.18385865943081278d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-455220037703578604L) + "'", long5 == (-455220037703578604L));
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.util.Random random7 = new java.util.Random();
        java.util.stream.IntStream intStream8 = random7.ints();
        java.util.stream.LongStream longStream11 = random7.longs((long) 1, (long) 100);
        boolean boolean12 = random7.nextBoolean();
        java.util.stream.DoubleStream doubleStream16 = random7.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream20 = random7.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream24 = random7.ints((long) 2109552831, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream28 = random7.doubles(1847242113680462994L, (double) 1, (double) 100);
        boolean boolean29 = languageRange1.equals((java.lang.Object) random7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.Business business7 = faker3.business();
        java.lang.String str9 = faker3.bothify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str11 = faker3.letterify("\u82f1\u6587");
        com.github.javafaker.Options options12 = faker3.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str9, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u6587" + "'", str11, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.setVariant("CHN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CHN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (China)" + "'", str14, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("fr_FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr_FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(5288735684466769752L);
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            random0.nextBytes(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.009897932201338d) + "'", double4 == (-1.009897932201338d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5826001658956208381L + "'", long5 == 5826001658956208381L);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        java.util.stream.LongStream longStream5 = random0.longs();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.874705452342533d) + "'", double2 == (-2.874705452342533d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4823754789089898156L) + "'", long4 == (-4823754789089898156L));
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category8);
        java.util.Locale locale11 = java.util.Locale.getDefault(category8);
        java.lang.String str12 = locale5.getDisplayLanguage(locale11);
        java.lang.Object obj13 = locale5.clone();
        boolean boolean14 = languageRange1.equals(obj13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        long long10 = random0.nextLong();
        long long11 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 0, (double) '#');
        double double17 = random13.nextGaussian();
        java.util.stream.DoubleStream doubleStream18 = random13.doubles();
        java.util.stream.IntStream intStream21 = random13.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random13);
        java.util.stream.LongStream longStream23 = random13.longs();
        java.util.Random random24 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((double) (byte) 0, (double) '#');
        double double28 = random24.nextGaussian();
        java.util.stream.DoubleStream doubleStream29 = random24.doubles();
        java.util.stream.IntStream intStream32 = random24.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream33 = random24.doubles();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random24.nextBytes(byteArray37);
        random13.nextBytes(byteArray37);
        random0.nextBytes(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream43 = random0.ints(1272557603, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.00558595799870789d + "'", double4 == 0.00558595799870789d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1416745820542173132L) + "'", long10 == (-1416745820542173132L));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 8559186692515318800L + "'", long11 == 8559186692515318800L);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7338371369684756d + "'", double17 == 0.7338371369684756d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.4730127964684084d + "'", double28 == 0.4730127964684084d);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[106, -4, -50]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale4 = locale1.stripExtensions();
        boolean boolean6 = locale1.equals((java.lang.Object) 0.2778323727493555d);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale8.getDisplayName(locale10);
        boolean boolean12 = locale8.hasExtensions();
        java.lang.String str13 = locale8.getDisplayScript();
        boolean boolean14 = languageRange1.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinesisch (China)" + "'", str11, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime5 = faker4.date();
        com.github.javafaker.Business business6 = faker4.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.lang.String str7 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh_CN" + "'", str7, "zh_CN");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name2 = faker1.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name2);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        double double10 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles(1133475767620805068L, (double) 963875490, (double) (-2697365036775045142L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3009097209220417d + "'", double4 == 1.3009097209220417d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7205689270264322d + "'", double10 == 0.7205689270264322d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Code code11 = faker10.code();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker10.phoneNumber();
        com.github.javafaker.Hacker hacker13 = faker10.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(hacker13);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.App app8 = faker0.app();
        com.github.javafaker.Finance finance9 = faker0.finance();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Locale locale3 = new java.util.Locale("Taiwan", "zh-TW", "KR");
        org.junit.Assert.assertEquals(locale3.toString(), "taiwan_ZH-TW_KR");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GBR", (double) 2109552831);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.109552831E9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Company company5 = faker3.company();
        com.github.javafaker.App app6 = faker3.app();
        com.github.javafaker.Number number7 = faker3.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        com.github.javafaker.Name name4 = faker1.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(name4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getVariant();
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayCountry();
        java.lang.String str11 = locale7.getISO3Language();
        java.lang.String str12 = locale6.getDisplayLanguage(locale7);
        java.lang.String str13 = locale0.getDisplayLanguage(locale7);
        java.lang.String str14 = locale0.getLanguage();
        java.lang.String str15 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker12.resolve("chinois");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de-DE" + "'", str1, "de-DE");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        boolean boolean2 = locale0.equals((java.lang.Object) "CN");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("Chine");
        java.util.Locale.Builder builder6 = builder0.setLanguageTag("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("USA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: USA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.Business business7 = faker3.business();
        java.lang.String str9 = faker3.bothify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str11 = faker3.letterify("zh");
        com.github.javafaker.Internet internet12 = faker3.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = faker3.resolve("ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str9, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale0.getDisplayScript(locale1);
        java.lang.String str6 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_CN" + "'", str6, "zh_CN");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        boolean boolean8 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((-0.6737480314783748d), 0.47208617642952455d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.08762559426762133d) + "'", double4 == (-0.08762559426762133d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 381921825640620555L + "'", long5 == 381921825640620555L);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5784395f + "'", float6 == 0.5784395f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de-DE", (double) (-3450687320078502419L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-3.4506873200785024E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.util.Random random1 = new java.util.Random((long) (-1504576282));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream17 = random0.ints((long) 2109552831, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream21 = random0.doubles(1847242113680462994L, (double) 1, (double) 100);
        java.util.stream.DoubleStream doubleStream25 = random0.doubles(0L, 0.017597347639713577d, 0.5660387610778319d);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(doubleStream25);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        java.lang.String str5 = faker0.regexify("\u4e2d\u56fd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("China");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("\u6cd5\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? (???) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(5288735684466769752L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.4503344320027465d) + "'", double4 == (-1.4503344320027465d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 696244969602026691L + "'", long5 == 696244969602026691L);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.Random random1 = new java.util.Random(0L);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream5 = random1.longs((-4601747285168096166L), 8651399998613895826L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random1.doubles((double) 10.0f, 0.26986585910426064d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4962768465676381896L) + "'", long2 == (-4962768465676381896L));
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream6 = random0.doubles((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = random0.nextInt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        long long10 = random0.nextLong();
        long long11 = random0.nextLong();
        boolean boolean12 = random0.nextBoolean();
        java.util.stream.LongStream longStream13 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0468755354287165d) + "'", double4 == (-1.0468755354287165d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4141253966330920663L + "'", long10 == 4141253966330920663L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1148949523569360657L + "'", long11 == 1148949523569360657L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.IntStream intStream16 = random6.ints(3376856765316790501L, 0, (int) 'x');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Address address18 = faker17.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutsch (Deutschland)" + "'", str4, "Deutsch (Deutschland)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(address18);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Locale locale3 = new java.util.Locale("CAN", "CN", "en-gb");
        java.util.Locale locale4 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getUnicodeLocaleType("Deutsch (Deutschland)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Deutsch (Deutschland)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "can_CN_en-gb");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "can_CN_en-gb");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-cn (CHINESISCH (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh-cn (chinesisch (china))");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random0.doubles((-904965483975765628L), 0.5889506925355686d, (-1.726574699116713d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = builder3.build();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.Object obj8 = null;
        boolean boolean9 = locale6.equals(obj8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Koreanisch" + "'", str7, "Koreanisch");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setVariant("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", 0.6866727861559659d);
        boolean boolean4 = languageRange2.equals((java.lang.Object) 0.5660387610778319d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random0.ints((int) (short) 1, (-1504576282));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        int int12 = random0.nextInt();
        double double13 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random0.doubles((long) (-1), (double) (-7103792676836336750L), (double) (-1480715465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7503819477527909d + "'", double10 == 0.7503819477527909d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.12751718367453568d + "'", double11 == 0.12751718367453568d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1008074929 + "'", int12 == 1008074929);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.30381309584071087d + "'", double13 == 0.30381309584071087d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setRegion("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getVariant();
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayCountry();
        java.lang.String str11 = locale7.getISO3Language();
        java.lang.String str12 = locale6.getDisplayLanguage(locale7);
        java.lang.String str13 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale14 = locale0.stripExtensions();
        java.lang.String str15 = locale14.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chine" + "'", str10, "Chine");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CN" + "'", str15, "CN");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.IntStream intStream16 = random6.ints(3376856765316790501L, 0, (int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream20 = random6.longs(1847242113680462994L, (-4737254369196149287L), (-7103792676836336750L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str4, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream21 = random2.ints(4668688544456269390L, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-7576788833785396103L) + "'", long16 == (-7576788833785396103L));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Code code4 = faker0.code();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        com.github.javafaker.Business business8 = faker3.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker3.resolve("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.IntStream intStream5 = random0.ints();
        java.util.stream.LongStream longStream9 = random0.longs(1148949523569360657L, (long) 1, 3376856765316790501L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6240556340669619d) + "'", double4 == (-0.6240556340669619d));
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale0.getDisplayLanguage(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-FR" + "'", str4, "fr-FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fra");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: fra could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Koreanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.lang.String str8 = locale0.getDisplayScript(locale2);
        java.lang.String str10 = locale0.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois" + "'", str6, "chinois");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr_FR" + "'", str9, "fr_FR");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = null;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale24);
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = locale29.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.lang.String str33 = locale32.getScript();
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale14, locale15, locale16, locale19, locale20, locale23, locale24, locale26, locale28, locale29, locale32 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.Locale locale37 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.Locale.FilteringMode filteringMode45 = null;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList43, filteringMode45);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList49, filteringMode51);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList52);
        java.util.Collection<java.util.Locale> localeCollection54 = null;
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection54);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.Locale.FilteringMode filteringMode66 = null;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList64, filteringMode66);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Locale locale70 = java.util.Locale.KOREAN;
        java.util.Locale locale71 = java.util.Locale.CHINA;
        java.lang.String str72 = locale71.toLanguageTag();
        java.util.Locale locale73 = locale71.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.KOREAN;
        java.util.Locale locale75 = java.util.Locale.CHINA;
        java.lang.String str76 = locale75.toLanguageTag();
        java.util.Locale locale77 = locale75.stripExtensions();
        java.util.Locale locale78 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale78);
        java.util.Locale locale80 = java.util.Locale.CHINA;
        java.lang.String str81 = locale80.toLanguageTag();
        java.util.Locale locale82 = java.util.Locale.UK;
        java.util.Locale locale83 = java.util.Locale.CHINA;
        java.lang.String str84 = locale83.toLanguageTag();
        java.util.Locale locale85 = locale83.stripExtensions();
        java.util.Locale locale86 = java.util.Locale.CHINA;
        java.lang.String str87 = locale86.getScript();
        java.util.Locale[] localeArray88 = new java.util.Locale[] { locale68, locale69, locale70, locale73, locale74, locale77, locale78, locale80, locale82, locale83, locale86 };
        java.util.ArrayList<java.util.Locale> localeList89 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList89, localeArray88);
        java.util.Locale locale91 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale.FilteringMode filteringMode93 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList89, filteringMode93);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Locale locale96 = java.util.Locale.CHINA;
        java.lang.String str97 = locale96.getScript();
        java.util.Set<java.lang.String> strSet98 = locale96.getUnicodeLocaleKeys();
        java.lang.String str99 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet98);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-CN" + "'", str30, "zh-CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "ko");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zh-CN" + "'", str72, "zh-CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "zh-CN" + "'", str76, "zh-CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zh-CN" + "'", str81, "zh-CN");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "zh-CN" + "'", str84, "zh-CN");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(localeArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertTrue("'" + filteringMode93 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode93.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(locale96);
        org.junit.Assert.assertEquals(locale96.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertNotNull(strSet98);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(7975027329722967446L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs((long) (-2005461217), (long) 'x', (-5006752208278450259L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.47499347937066844d + "'", double4 == 0.47499347937066844d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5661166448770159d + "'", double6 == 0.5661166448770159d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.2266266144005815d) + "'", double11 == (-2.2266266144005815d));
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("\u82f1\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Locale locale3 = new java.util.Locale("CN", "TW", "en-GB");
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 0, (double) '#');
        double double8 = random4.nextGaussian();
        long long9 = random4.nextLong();
        float float10 = random4.nextFloat();
        java.util.stream.LongStream longStream13 = random4.longs((-4476219991092281892L), 0L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale3, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: cn_TW_en-GB could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cn_TW_en-GB");
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.009288305689872503d + "'", double8 == 0.009288305689872503d);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3485899746789538840L + "'", long9 == 3485899746789538840L);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.18528807f + "'", float10 == 0.18528807f);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Locale locale7 = locale0.stripExtensions();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 0, (double) '#');
        double double12 = random8.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random8.doubles();
        java.util.stream.IntStream intStream16 = random8.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream17 = random8.doubles();
        long long18 = random8.nextLong();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale7, random8);
        java.lang.String str21 = faker19.regexify("South Korea");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.4362021770009714d + "'", double12 == 2.4362021770009714d);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3019054096168434161L) + "'", long18 == (-3019054096168434161L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "South Korea" + "'", str21, "South Korea");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setExtension('u', "\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Company company2 = faker0.company();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(company2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.App app5 = faker4.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker4.resolve("GBR");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream5 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs((-5006752208278450259L), (-2328332319918729860L), 1847242113680462994L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random2);
        java.util.stream.DoubleStream doubleStream13 = random2.doubles();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de-DE" + "'", str1, "de-DE");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.App app5 = faker3.app();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker3.resolve("Chinese");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        float float8 = random0.nextFloat();
        float float9 = random0.nextFloat();
        java.util.stream.IntStream intStream12 = random0.ints((-1), 0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.55627155f + "'", float8 == 0.55627155f);
// flaky:         org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.6710982f + "'", float9 == 0.6710982f);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color10 = faker9.color();
        com.github.javafaker.Business business11 = faker9.business();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.072483465857113d + "'", double4 == 2.072483465857113d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.LongStream longStream6 = random0.longs();
        float float7 = random0.nextFloat();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.71317375f + "'", float7 == 0.71317375f);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u6587\u52a0\u62ff\u5927)", "Chinese (China)");
        org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)_CHINESE (CHINA)");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Taiwan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('a', "Chinesisch China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Chinesisch China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles(1409958607731658842L, (double) (short) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Options options4 = faker0.options();
        com.github.javafaker.Address address5 = faker0.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker0.resolve("\u82f1\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Locale locale1 = new java.util.Locale("Chine");
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.getExtension('a');
        org.junit.Assert.assertEquals(locale1.toString(), "chine");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.lang.String str11 = locale8.getISO3Language();
        java.util.Locale.Builder builder12 = builder6.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder6.setExtension('#', "en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.DoubleStream doubleStream8 = random3.doubles();
        java.util.stream.IntStream intStream11 = random3.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream12 = random3.doubles();
        java.util.stream.LongStream longStream13 = random3.longs();
        double double14 = random3.nextGaussian();
        long long15 = random3.nextLong();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.DateAndTime dateAndTime17 = faker16.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-2.2351145230367058d) + "'", double7 == (-2.2351145230367058d));
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3320625589593638d + "'", double14 == 1.3320625589593638d);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1395111801886078267L + "'", long15 == 1395111801886078267L);
        org.junit.Assert.assertNotNull(dateAndTime17);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setVariant("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Code code7 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale7);
        java.lang.String str9 = locale6.getDisplayVariant(locale7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.toLanguageTag();
        java.util.Locale locale7 = locale5.stripExtensions();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale5.getDisplayVariant(locale9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale9.getDisplayName(locale12);
        boolean boolean14 = locale12.hasExtensions();
        boolean boolean15 = locale4.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chine" + "'", str10, "Chine");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese (China)" + "'", str13, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Locale locale2 = new java.util.Locale("zh-CN", "Chinesisch (China)");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh-cn_CHINESISCH (CHINA) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn_CHINESISCH (CHINA)");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale9 = new java.util.Locale("French", "Chinesisch (China)");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Locale locale13 = locale11.stripExtensions();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale11);
        java.lang.String str15 = locale9.getDisplayScript(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder4.setLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHINESISCH (CHINA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "french_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream11 = random0.doubles(1162426200426189844L, 10.0d, (double) (-4476219991092281892L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setRegion("Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinesisch (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getScript();
        java.lang.String str7 = locale0.getDisplayName(locale3);
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chine" + "'", str5, "Chine");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str7, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais (France)" + "'", str9, "fran\347ais (France)");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Locale locale2 = new java.util.Locale("French", "Chinesisch (China)");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "french_CHINESISCH (CHINA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", 2.4362021770009714d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.4362021770009714");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        java.util.stream.LongStream longStream14 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs((long) 1824728183, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5931294220706548d + "'", double4 == 0.5931294220706548d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5946855521300428d + "'", double6 == 0.5946855521300428d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.03586154038665613d) + "'", double11 == (-0.03586154038665613d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        java.util.Random random9 = new java.util.Random();
        java.util.stream.IntStream intStream10 = random9.ints();
        java.util.stream.LongStream longStream13 = random9.longs((long) 1, (long) 100);
        boolean boolean14 = random9.nextBoolean();
        java.util.stream.DoubleStream doubleStream16 = random9.doubles(0L);
        int int17 = random9.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale3, random9);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: hi!_HI!_hi! could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1059944238) + "'", int17 == (-1059944238));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) 963875490);
        java.util.stream.LongStream longStream10 = random0.longs((long) (short) 0, (long) 1272557603);
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((-1.2526970094263166d), (double) 1162426200426189844L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0165485624089627d) + "'", double4 == (-1.0165485624089627d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale6.toLanguageTag();
        java.util.Locale locale10 = locale6.stripExtensions();
        java.lang.String str11 = locale0.getDisplayScript(locale10);
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.lang.String str26 = locale25.toLanguageTag();
        java.util.Locale locale27 = locale25.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.getScript();
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale10, locale11, locale12, locale15, locale16, locale19, locale20, locale22, locale24, locale25, locale28 };
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        java.util.Locale locale33 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = null;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList48);
        java.util.Collection<java.util.Locale> localeCollection50 = null;
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = null;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale66 = java.util.Locale.KOREAN;
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.lang.String str68 = locale67.toLanguageTag();
        java.util.Locale locale69 = locale67.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.KOREAN;
        java.util.Locale locale71 = java.util.Locale.CHINA;
        java.lang.String str72 = locale71.toLanguageTag();
        java.util.Locale locale73 = locale71.stripExtensions();
        java.util.Locale locale74 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale74);
        java.util.Locale locale76 = java.util.Locale.CHINA;
        java.lang.String str77 = locale76.toLanguageTag();
        java.util.Locale locale78 = java.util.Locale.UK;
        java.util.Locale locale79 = java.util.Locale.CHINA;
        java.lang.String str80 = locale79.toLanguageTag();
        java.util.Locale locale81 = locale79.stripExtensions();
        java.util.Locale locale82 = java.util.Locale.CHINA;
        java.lang.String str83 = locale82.getScript();
        java.util.Locale[] localeArray84 = new java.util.Locale[] { locale64, locale65, locale66, locale69, locale70, locale73, locale74, locale76, locale78, locale79, locale82 };
        java.util.ArrayList<java.util.Locale> localeList85 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList85, localeArray84);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList85, filteringMode89);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale91 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(localeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ko");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "zh-CN" + "'", str68, "zh-CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "ko");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zh-CN" + "'", str72, "zh-CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "zh-CN" + "'", str77, "zh-CN");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "zh-CN" + "'", str80, "zh-CN");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(localeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode89.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList90);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream9 = random0.longs((long) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5392709f + "'", float5 == 0.5392709f);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setRegion("Chinesisch China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinesisch China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        java.lang.String str8 = faker3.letterify("Chine");
        com.github.javafaker.PhoneNumber phoneNumber9 = faker3.phoneNumber();
        java.lang.Class<?> wildcardClass10 = phoneNumber9.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setUnicodeLocaleKeyword("CHN", "\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: CHN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Locale locale1 = new java.util.Locale("de-DE");
        org.junit.Assert.assertEquals(locale1.toString(), "de-de");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str2, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("GBR");
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.Code code5 = faker0.code();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        java.lang.String str13 = locale0.getDisplayScript();
        java.lang.String str14 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        java.lang.String str4 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random0.ints((-1145038186), (-1987686354));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setLanguage("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(7643996864325553509L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs(442212515127344520L, 8557027715680151209L, 3376856765316790501L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19221229596810696d + "'", double4 == 0.19221229596810696d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.1939681761512329d + "'", double9 == 1.1939681761512329d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-635621790) + "'", int10 == (-635621790));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.37421681772234655d + "'", double11 == 0.37421681772234655d);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("GBR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: GBR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguage("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        double double2 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String str9 = languageRange1.getRange();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Locale locale14 = locale12.stripExtensions();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale12);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale12.getDisplayVariant(locale16);
        java.util.Locale locale19 = locale12.stripExtensions();
        java.util.Locale.Builder builder20 = builder11.setLocale(locale19);
        boolean boolean21 = languageRange1.equals((java.lang.Object) locale19);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u570b" + "'", str17, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getVariant();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.lang.String str8 = locale2.getExtension('x');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        java.lang.String str13 = locale0.getScript();
        java.lang.String str14 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str12, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getDisplayLanguage();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getUnicodeLocaleType("\u671d\u9c9c\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        int int8 = random0.nextInt((int) (short) 1);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream11 = random0.longs((long) (-1480715465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.18388901334254434d) + "'", double4 == (-0.18388901334254434d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        java.util.stream.IntStream intStream6 = random0.ints((long) 1790226314);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream10 = random0.ints((-8760364856787578239L), 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11576552363784036d + "'", double2 == 0.11576552363784036d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-8715584225819690134L) + "'", long4 == (-8715584225819690134L));
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder6.build();
        boolean boolean10 = languageRange1.equals((java.lang.Object) builder6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinesisch China", (double) 8557027715680151209L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.5570277156801516E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_CN");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Number number4 = faker0.number();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream10 = random0.longs();
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 0, (double) '#');
        double double15 = random11.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random11.doubles();
        java.util.stream.IntStream intStream19 = random11.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream20 = random11.doubles();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random11.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        java.util.stream.LongStream longStream27 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream30 = random0.ints((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.35892760414529373d) + "'", double4 == (-0.35892760414529373d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.41065293388949553d) + "'", double15 == (-0.41065293388949553d));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[101, -56, -19]");
        org.junit.Assert.assertNotNull(longStream27);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Book book3 = faker0.book();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(book3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Locale locale1 = new java.util.Locale("Chine");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        java.lang.String str5 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "chine");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chine" + "'", str4, "chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setVariant("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.setVariant("deu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: deu [at index 0]");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        com.github.javafaker.Business business13 = faker12.business();
        java.lang.String str15 = faker12.letterify("ITA");
        com.github.javafaker.Business business16 = faker12.business();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = faker12.resolve("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertNotNull(business16);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getDisplayLanguage(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 0.27772975f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ko" + "'", str4, "ko");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        java.util.stream.LongStream longStream11 = random0.longs();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2818906812594967d + "'", double10 == 0.2818906812594967d);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = locale2.stripExtensions();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale9 = locale2.stripExtensions();
        java.util.Locale.Builder builder10 = builder1.setLocale(locale9);
        java.util.Locale.Builder builder11 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder1.setVariant("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Locale locale2 = new java.util.Locale("GBR", "South Korea");
        java.lang.String str3 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "gbr_SOUTH KOREA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SOUTH KOREA" + "'", str3, "SOUTH KOREA");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale0.getDisplayLanguage(locale1);
        java.lang.String str7 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        java.lang.String str6 = faker1.numerify("China");
        java.lang.String str8 = faker1.letterify("\u6cd5\u6587\u6cd5\u56fd)");
        com.github.javafaker.App app9 = faker1.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str8, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(app9);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(7975027329722967446L);
        java.util.stream.LongStream longStream14 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.04603607960165648d) + "'", double4 == (-0.04603607960165648d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7344088753357025d + "'", double6 == 0.7344088753357025d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4134676875496286d + "'", double11 == 1.4134676875496286d);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Locale locale7 = locale0.stripExtensions();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 0, (double) '#');
        double double12 = random8.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random8.doubles();
        java.util.stream.IntStream intStream16 = random8.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream17 = random8.doubles();
        long long18 = random8.nextLong();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale7, random8);
        com.github.javafaker.DateAndTime dateAndTime20 = faker19.date();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u53f0\u7063" + "'", str6, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.6066180633215202d) + "'", double12 == (-0.6066180633215202d));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2403618964065255706L) + "'", long18 == (-2403618964065255706L));
        org.junit.Assert.assertNotNull(dateAndTime20);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("Chine", "zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chine [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags(languageRangeList29, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = null;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.lang.String str52 = locale51.toLanguageTag();
        java.util.Locale locale53 = locale51.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.lang.String str56 = locale55.toLanguageTag();
        java.util.Locale locale57 = locale55.stripExtensions();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale58);
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.lang.String str61 = locale60.toLanguageTag();
        java.util.Locale locale62 = java.util.Locale.UK;
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = locale63.toLanguageTag();
        java.util.Locale locale65 = locale63.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.getScript();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale48, locale49, locale50, locale53, locale54, locale57, locale58, locale60, locale62, locale63, locale66 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale locale71 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap74);
        java.util.Locale locale76 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet77 = locale76.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList75, (java.util.Collection<java.lang.String>) strSet77);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zh-CN" + "'", str52, "zh-CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "zh-CN" + "'", str64, "zh-CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream9 = random0.longs((long) 'a', (long) 401882126);
        double double10 = random0.nextGaussian();
        java.lang.Class<?> wildcardClass11 = random0.getClass();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5618976747032213d + "'", double4 == 0.5618976747032213d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7189915174001602d + "'", double10 == 0.7189915174001602d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setVariant("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.Class<?> wildcardClass4 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("South Korea", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=southkorea");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ko" + "'", str4, "ko");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale4.getExtension('u');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.lang.String str8 = locale0.getDisplayScript(locale4);
        java.lang.Class<?> wildcardClass9 = locale4.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u6587\u52a0\u62ff\u5927)", (double) (-4962768465676381896L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.9627684656763822E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale11.getScript();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale11.getDisplayVariant(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale11.getUnicodeLocaleType("South Korea");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: South Korea");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (China)" + "'", str14, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.DoubleStream doubleStream8 = random3.doubles();
        java.util.stream.IntStream intStream11 = random3.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream12 = random3.doubles();
        java.util.stream.LongStream longStream13 = random3.longs();
        double double14 = random3.nextGaussian();
        long long15 = random3.nextLong();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale0, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale0.getUnicodeLocaleType("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Chinesisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04107104531601735d + "'", double7 == 0.04107104531601735d);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5236504756511324d + "'", double14 == 0.5236504756511324d);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3706715454903293183L) + "'", long15 == (-3706715454903293183L));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale7 = locale1.stripExtensions();
        java.lang.Object obj8 = locale7.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u570b" + "'", str3, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u570b" + "'", str4, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "zh_CN");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.IntStream intStream16 = random6.ints(3376856765316790501L, 0, (int) 'x');
        java.util.stream.DoubleStream doubleStream18 = random6.doubles(8651399998613895826L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream21 = random6.longs(5438035133075299180L, 4141253966330920663L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (Taiwan)" + "'", str4, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.util.Random random4 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream7 = random4.doubles((double) (byte) 0, (double) '#');
        double double8 = random4.nextGaussian();
        java.util.stream.DoubleStream doubleStream9 = random4.doubles();
        java.util.stream.IntStream intStream12 = random4.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream13 = random4.doubles();
        java.util.stream.LongStream longStream14 = random4.longs();
        boolean boolean15 = languageRange1.equals((java.lang.Object) random4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2610257997234224d + "'", double8 == 0.2610257997234224d);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale1.getLanguage();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.lang.String str8 = locale1.getDisplayScript(locale7);
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.toLanguageTag();
        java.util.Locale locale14 = locale10.stripExtensions();
        java.lang.String str15 = locale7.getDisplayCountry(locale10);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str18 = locale17.getCountry();
        java.lang.String str19 = locale10.getDisplayLanguage(locale17);
        java.util.Set<java.lang.Character> charSet20 = locale17.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CN" + "'", str18, "CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet20);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str2 = locale1.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ??");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.removeUnicodeLocaleAttribute("\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Taiwan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayName(locale4);
        java.lang.String str7 = locale4.getDisplayScript();
        java.lang.String str8 = locale4.getDisplayLanguage();
        java.lang.String str9 = locale2.getDisplayLanguage(locale4);
        java.lang.Object obj10 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "en");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Random random4 = new java.util.Random();
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream9 = random4.longs();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random4.doubles(0.6533317665942538d, (double) 0.5055576f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinesisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        java.util.stream.IntStream intStream13 = random0.ints((int) (byte) 1, (int) ' ');
        java.util.stream.IntStream intStream15 = random0.ints(1133475767620805068L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random0.longs((long) (short) 1, 520842913875285284L, (-2910596640445577867L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5094796551007656d) + "'", double4 == (-0.5094796551007656d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.374723991777824d + "'", double6 == 0.374723991777824d);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Random random4 = new java.util.Random();
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) 1, (long) 100);
        boolean boolean9 = random4.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random4.doubles(0L);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random4.nextBytes(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale3, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-87, 117, 51]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("deu", "Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: deu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random0.doubles((-7561469220369522668L), 0.4464703882742723d, 2.1283843756459766d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2955014786986545d + "'", double10 == 0.2955014786986545d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4003300532506967d + "'", double11 == 0.4003300532506967d);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("fra", strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList12, filteringMode14);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.toLanguageTag();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str24 = locale23.toLanguageTag();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale26);
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale locale30 = java.util.Locale.UK;
        java.util.Locale locale31 = java.util.Locale.CHINA;
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Locale locale33 = locale31.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.CHINA;
        java.lang.String str35 = locale34.getScript();
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale16, locale17, locale18, locale21, locale22, locale25, locale26, locale28, locale30, locale31, locale34 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale locale41 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-CN" + "'", str20, "zh-CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh-CN" + "'", str24, "zh-CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertNull(locale41);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fran\347ais", (double) (-2715822492754316906L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.7158224927543168E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.JAPAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = locale5.getDisplayName(locale6);
        java.util.Locale.setDefault(category0, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale5.getUnicodeLocaleType("\uc77c\ubcf8\uc5b4\uc77c\ubcf8)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ???????? (??????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ko" + "'", str8, "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc77c\ubcf8\uc5b4\uc77c\ubcf8)" + "'", str9, "\uc77c\ubcf8\uc5b4\uc77c\ubcf8)");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setRegion("CHN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CHN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Locale locale1 = new java.util.Locale("CAN");
        org.junit.Assert.assertEquals(locale1.toString(), "can");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.DoubleStream doubleStream8 = random3.doubles();
        java.util.stream.IntStream intStream11 = random3.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream12 = random3.doubles();
        java.util.stream.LongStream longStream13 = random3.longs();
        double double14 = random3.nextGaussian();
        long long15 = random3.nextLong();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale0, random3);
        java.lang.String str17 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.2180774300840513d + "'", double7 == 1.2180774300840513d);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.6874119829143196d) + "'", double14 == (-0.6874119829143196d));
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 6362497699505926577L + "'", long15 == 6362497699505926577L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("Chine");
        java.util.Locale.Builder builder6 = builder0.setLanguageTag("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Franz\366sisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Franzo?sisch (Kanada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime3 = faker2.date();
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.Business business5 = faker2.business();
        com.github.javafaker.Finance finance6 = faker2.finance();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker2.phoneNumber();
        boolean boolean8 = languageRange1.equals((java.lang.Object) phoneNumber7);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.LongStream longStream13 = random0.longs();
        random0.setSeed(100L);
        java.util.stream.IntStream intStream17 = random0.ints(8651399998613895826L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream21 = random0.ints((long) (-1480715465), (int) (byte) -1, 1745477360);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.163330788794262d + "'", double4 == 1.163330788794262d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4131873215856845d + "'", double6 == 0.4131873215856845d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8771707880643823d + "'", double11 == 0.8771707880643823d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "en");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.removeUnicodeLocaleAttribute("French Canada");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: French Canada [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setVariant("us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: us [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((long) ' ', 6811477172063763907L, 4141253966330920663L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8350735220092724d + "'", double4 == 1.8350735220092724d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u56fd");
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u56fd");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream14 = random0.doubles(1.2205649301603074d, (-1.2343630702029103d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6393298762408935d) + "'", double4 == (-0.6393298762408935d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8540115069664809d + "'", double6 == 0.8540115069664809d);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension('#', "zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getVariant();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem4 = faker3.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.util.Locale locale11 = new java.util.Locale("French", "Chinesisch (China)");
        java.lang.String str12 = locale7.getDisplayLanguage(locale11);
        java.util.Locale locale15 = new java.util.Locale("zh-CN", "Chinesisch (China)");
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.UK;
        java.lang.String str21 = locale20.getCountry();
        java.lang.String str22 = locale20.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.getScript();
        java.lang.String str26 = locale23.getDisplayCountry(locale24);
        java.lang.String str27 = locale20.getDisplayCountry(locale23);
        java.lang.String str28 = locale18.getDisplayScript(locale20);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale29.getVariant();
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.lang.String str32 = locale29.getDisplayName(locale31);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale29);
        java.util.Random random34 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream37 = random34.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random34);
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(locale29, random34);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale40.getVariant();
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.lang.String str43 = locale40.getDisplayName(locale42);
        boolean boolean44 = locale40.hasExtensions();
        java.lang.String str45 = locale29.getDisplayLanguage(locale40);
        java.lang.String str46 = locale20.getDisplayVariant(locale40);
        java.lang.String str47 = locale15.getDisplayName(locale20);
        java.lang.String str48 = locale11.getDisplayCountry(locale20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u570b" + "'", str5, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (China)" + "'", str8, "Chinese (China)");
        org.junit.Assert.assertEquals(locale11.toString(), "french_CHINESISCH (CHINA)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertEquals(locale15.toString(), "zh-cn_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str17, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GB" + "'", str21, "GB");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en-GB" + "'", str22, "en-GB");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd" + "'", str26, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u82f1\u56fd" + "'", str27, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinesisch (Taiwan)" + "'", str32, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream37);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chinesisch (Taiwan)" + "'", str43, "Chinesisch (Taiwan)");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u4e2d\u6587" + "'", str45, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "zh-cn (CHINESISCH (CHINA))" + "'", str47, "zh-cn (CHINESISCH (CHINA))");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CHINESISCH (CHINA)" + "'", str48, "CHINESISCH (CHINA)");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.LongStream longStream18 = random0.longs(5288735684466769752L, 1L, (long) 100);
        double double19 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream22 = random0.doubles(0.13051402953139332d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.2153066145651409d) + "'", double19 == (-0.2153066145651409d));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.IntStream intStream9 = random0.ints((int) '#', (int) 'x');
        java.util.stream.IntStream intStream10 = random0.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8455786330768643d + "'", double4 == 0.8455786330768643d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("zh_TW", "Taiwan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale4.getDisplayVariant();
        java.lang.String str8 = locale0.getDisplayName(locale4);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale9.getScript();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale9.getDisplayLanguage(locale13);
        java.lang.String str16 = locale13.getScript();
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale0.getDisplayName(locale13);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.App app20 = faker19.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str8, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str18, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(app20);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime10 = faker9.date();
        com.github.javafaker.Address address11 = faker9.address();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.720817244999118d + "'", double4 == 0.720817244999118d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('#', "US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setVariant("\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }
}
