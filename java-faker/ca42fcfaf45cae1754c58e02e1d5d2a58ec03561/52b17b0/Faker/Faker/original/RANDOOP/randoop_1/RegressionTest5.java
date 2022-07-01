import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        java.util.Locale.Builder builder15 = builder0.setLanguageTag("USA");
        java.util.Locale.Builder builder17 = builder0.setRegion("");
        java.util.Locale.Builder builder19 = builder17.setLanguage("us");
        java.util.Locale.Builder builder20 = builder17.clearExtensions();
        java.util.Locale.Builder builder21 = builder17.clear();
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        int int12 = random0.nextInt();
        double double13 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = random0.longs((-4491984555390039736L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5365628861853218d + "'", double10 == 0.5365628861853218d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7498999198802884d + "'", double11 == 0.7498999198802884d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-301982142) + "'", int12 == (-301982142));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.36514075742466856d) + "'", double13 == (-0.36514075742466856d));
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean13 = random1.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random1.ints(936680757784715434L, 96787195, (-1145038186));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31385835970549847d + "'", double11 == 0.31385835970549847d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(7975027329722967446L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        random0.setSeed(3696779666884001675L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.28431401285407304d) + "'", double4 == (-0.28431401285407304d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3922598608082911d + "'", double6 == 0.3922598608082911d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3698402594006233d + "'", double11 == 0.3698402594006233d);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale1.getDisplayName(locale6);
        java.lang.Object obj14 = locale6.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "zh_CN");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.toLanguageTag();
        java.lang.String str7 = locale3.getDisplayScript();
        java.lang.String str8 = locale3.getISO3Country();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayCountry();
        java.lang.String str14 = locale10.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.getVariant();
        java.lang.String str17 = locale10.getDisplayScript(locale15);
        java.util.Locale.setDefault(category9, locale15);
        java.lang.String str19 = locale15.getDisplayName();
        java.lang.String str20 = locale3.getDisplayVariant(locale15);
        java.lang.String str21 = locale15.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CHN" + "'", str8, "CHN");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd" + "'", str13, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str19, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles((-48397131539201648L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.815708636428159d + "'", double4 == 1.815708636428159d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.47023431690471273d + "'", double6 == 0.47023431690471273d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.00626747333204334d) + "'", double11 == (-0.00626747333204334d));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR" + "'", str2, "ko-KR");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getExtension('u');
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Finance finance4 = faker3.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        float float13 = random0.nextFloat();
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.IntStream intStream15 = random0.ints();
        float float16 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.46025304797003797d) + "'", double4 == (-0.46025304797003797d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.3030092f + "'", float13 == 0.3030092f);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.09412557f + "'", float16 == 0.09412557f);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        double double10 = random0.nextGaussian();
        double double11 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5128389415867689d) + "'", double10 == (-0.5128389415867689d));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4236175455649152d + "'", double11 == 1.4236175455649152d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = faker9.resolve("zh-cn (CHINESISCH (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.3318926043310726d) + "'", double4 == (-1.3318926043310726d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Finance finance6 = faker0.finance();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str4, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category3);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayScript();
        java.util.Locale.setDefault(category3, locale7);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale7.getDisplayName(locale12);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Random random18 = new java.util.Random();
        java.util.stream.IntStream intStream19 = random18.ints();
        java.util.stream.LongStream longStream22 = random18.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream23 = random18.longs();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale14, random18);
        java.lang.String str25 = locale12.getDisplayCountry(locale14);
        java.lang.String str26 = locale0.getDisplayScript(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u56fd" + "'", str1, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese (China)" + "'", str13, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u82f1\u56fd" + "'", str25, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale.setDefault(locale13);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale.Builder builder22 = builder21.clear();
        java.util.Locale locale23 = builder21.build();
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.Locale locale25 = locale23.stripExtensions();
        boolean boolean26 = locale13.equals((java.lang.Object) locale25);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        java.lang.String str7 = faker3.regexify("zh-CN");
        com.github.javafaker.Book book8 = faker3.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        com.github.javafaker.Finance finance13 = faker10.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(finance13);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList41, (java.util.Collection<java.lang.String>) strList44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList46, filteringMode47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.Locale.FilteringMode filteringMode56 = null;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList54, filteringMode56);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale locale59 = java.util.Locale.KOREAN;
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale63 = locale61.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = java.util.Locale.CHINA;
        java.lang.String str66 = locale65.toLanguageTag();
        java.util.Locale locale67 = locale65.stripExtensions();
        java.util.Locale locale68 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale68);
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale70.toLanguageTag();
        java.util.Locale locale72 = java.util.Locale.UK;
        java.util.Locale locale73 = java.util.Locale.CHINA;
        java.lang.String str74 = locale73.toLanguageTag();
        java.util.Locale locale75 = locale73.stripExtensions();
        java.util.Locale locale76 = java.util.Locale.CHINA;
        java.lang.String str77 = locale76.getScript();
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale58, locale59, locale60, locale63, locale64, locale67, locale68, locale70, locale72, locale73, locale76 };
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.Locale locale81 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Collection<java.lang.String> strCollection83 = null;
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection83, filteringMode84);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap86 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap86);
        java.util.Locale locale89 = new java.util.Locale("coreano");
        java.util.Set<java.lang.String> strSet90 = locale89.getUnicodeLocaleAttributes();
        java.lang.String str91 = java.util.Locale.lookupTag(languageRangeList87, (java.util.Collection<java.lang.String>) strSet90);
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
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zh-CN" + "'", str66, "zh-CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zh-CN" + "'", str71, "zh-CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "zh-CN" + "'", str74, "zh-CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(localeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(languageRangeList87);
        org.junit.Assert.assertEquals(locale89.toString(), "coreano");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale7 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.util.Locale locale3 = new java.util.Locale("CN", "zho", "Chine");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "cn_ZHO_Chine");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "cn_ZHO_Chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cn_ZHO_Chine" + "'", str5, "cn_ZHO_Chine");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getVariant();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale8.getDisplayVariant(locale9);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale9);
        java.util.Locale locale14 = locale9.stripExtensions();
        java.util.Locale.setDefault(locale9);
        java.lang.String str16 = locale7.getDisplayLanguage(locale9);
        java.lang.String str17 = locale7.getDisplayVariant();
        java.util.Locale.setDefault(locale7);
        java.lang.String str19 = locale7.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getCountry();
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str5 = locale0.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale0.getUnicodeLocaleType("CHN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: CHN");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TW" + "'", str3, "TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-TW" + "'", str5, "zh-TW");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.util.Locale locale3 = new java.util.Locale("deu", "fr_FR", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale locale5 = locale3.stripExtensions();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str4, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        random0.setSeed((long) 1301414851);
        int int9 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.6024603472782082d) + "'", double4 == (-1.6024603472782082d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2079689645710807388L + "'", long5 == 2079689645710807388L);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.584574f + "'", float6 == 0.584574f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2056097846) + "'", int9 == (-2056097846));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("zho");
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getDisplayLanguage();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale13);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale13);
        java.util.Locale.Builder builder21 = builder11.setExtension('a', "Germany");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale0.getDisplayName(locale1);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale0.getDisplayLanguage(locale10);
        java.util.Random random12 = new java.util.Random();
        java.util.stream.IntStream intStream13 = random12.ints();
        java.util.stream.LongStream longStream16 = random12.longs((long) 1, (long) 100);
        boolean boolean17 = random12.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random12.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream25 = random12.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream29 = random12.ints((long) 2109552831, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream33 = random12.doubles(1847242113680462994L, (double) 1, (double) 100);
        double double34 = random12.nextDouble();
        double double35 = random12.nextGaussian();
        boolean boolean36 = random12.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale0, random12);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CN" + "'", str9, "CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(longStream25);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(doubleStream33);
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.5754745659498604d + "'", double34 == 0.5754745659498604d);
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.18709207380020257d) + "'", double35 == (-0.18709207380020257d));
// flaky:         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.numerify("GB");
        com.github.javafaker.Internet internet9 = faker0.internet();
        com.github.javafaker.DateAndTime dateAndTime10 = faker0.date();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GB" + "'", str8, "GB");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayVariant(locale8);
        java.lang.String str11 = locale1.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale8.getDisplayScript(locale12);
        java.util.Random random15 = new java.util.Random();
        java.util.stream.IntStream intStream16 = random15.ints();
        double double17 = random15.nextGaussian();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles();
        java.util.stream.LongStream longStream19 = random15.longs();
        java.util.stream.DoubleStream doubleStream20 = random15.doubles();
        int int21 = random15.nextInt();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale8, random15);
        java.lang.String str23 = locale8.toLanguageTag();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko-KR" + "'", str13, "ko-KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(intStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.625576690404492d + "'", double17 == 1.625576690404492d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 957935705 + "'", int21 == 957935705);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        java.lang.String str7 = faker3.regexify("zh-CN");
        com.github.javafaker.Business business8 = faker3.business();
        com.github.javafaker.Name name9 = faker3.name();
        com.github.javafaker.Company company10 = faker3.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(company10);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Internet internet14 = faker13.internet();
        com.github.javafaker.Color color15 = faker13.color();
        com.github.javafaker.Number number16 = faker13.number();
        java.lang.String str18 = faker13.letterify("Italienisch");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7662917835632496d + "'", double10 == 0.7662917835632496d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.496263960811998d + "'", double11 == 0.496263960811998d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(internet14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(number16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italienisch" + "'", str18, "Italienisch");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setRegion("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Options options5 = faker3.options();
        com.github.javafaker.Book book6 = faker3.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(book6);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Code code5 = faker0.code();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
            java.util.stream.LongStream longStream14 = random5.longs((-7103792676836336750L), 442212515127344520L, (long) 389593865);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        java.lang.String str13 = faker10.bothify("USA");
        com.github.javafaker.PhoneNumber phoneNumber14 = faker10.phoneNumber();
        com.github.javafaker.Company company15 = faker10.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "USA" + "'", str13, "USA");
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(company15);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "");
        java.util.Locale.Builder builder7 = builder2.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setLanguage("\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ???????? (??????) (??) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        int int28 = random0.nextInt();
        float float29 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.8106436370406698d) + "'", double4 == (-0.8106436370406698d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.6066841137416379d) + "'", double15 == (-0.6066841137416379d));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-99, -107, 100]");
        org.junit.Assert.assertNotNull(longStream27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1640251449) + "'", int28 == (-1640251449));
// flaky:         org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.79639095f + "'", float29 == 0.79639095f);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getVariant();
        java.lang.String str5 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        java.util.stream.LongStream longStream42 = random0.longs(7643996864325553509L);
        java.util.stream.IntStream intStream45 = random0.ints((-1488388702), (-1157480671));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7906245716828987d + "'", double4 == 0.7906245716828987d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230198249558090889L + "'", long10 == 230198249558090889L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1879187131081196474L + "'", long11 == 1879187131081196474L);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.16831097965148803d) + "'", double17 == (-0.16831097965148803d));
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.06551410318722174d) + "'", double28 == (-0.06551410318722174d));
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[96, 50, -123]");
        org.junit.Assert.assertNotNull(longStream42);
        org.junit.Assert.assertNotNull(intStream45);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        boolean boolean6 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((-0.6144031373786704d), (-1.1522913018947836d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.8042897923115541d) + "'", double4 == (-0.8042897923115541d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2652127519188845370L + "'", long5 == 2652127519188845370L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        float float10 = random0.nextFloat();
        java.util.Random random11 = new java.util.Random();
        java.util.stream.IntStream intStream12 = random11.ints();
        double double13 = random11.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles();
        java.util.stream.IntStream intStream16 = random11.ints(10L);
        java.util.stream.LongStream longStream17 = random11.longs();
        java.util.Random random18 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream21 = random18.doubles((double) (byte) 0, (double) '#');
        double double22 = random18.nextGaussian();
        java.util.stream.DoubleStream doubleStream23 = random18.doubles();
        java.util.stream.LongStream longStream27 = random18.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream29 = random18.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream31 = random18.longs(4668688544456269390L);
        int int32 = random18.nextInt();
        java.util.Random random33 = new java.util.Random();
        java.util.stream.IntStream intStream34 = random33.ints();
        double double35 = random33.nextGaussian();
        java.util.stream.DoubleStream doubleStream36 = random33.doubles();
        long long37 = random33.nextLong();
        double double38 = random33.nextGaussian();
        com.github.javafaker.Faker faker39 = new com.github.javafaker.Faker(random33);
        java.util.stream.IntStream intStream40 = random33.ints();
        java.util.stream.LongStream longStream42 = random33.longs(7975027329722967446L);
        java.util.Random random43 = new java.util.Random();
        java.util.stream.IntStream intStream44 = random43.ints();
        java.util.stream.LongStream longStream47 = random43.longs((long) 1, (long) 100);
        boolean boolean48 = random43.nextBoolean();
        java.util.stream.DoubleStream doubleStream50 = random43.doubles(0L);
        byte[] byteArray54 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random43.nextBytes(byteArray54);
        random33.nextBytes(byteArray54);
        random18.nextBytes(byteArray54);
        random11.nextBytes(byteArray54);
        random0.nextBytes(byteArray54);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7624149545204317d) + "'", double4 == (-1.7624149545204317d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.6859169f + "'", float10 == 0.6859169f);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9129667732622676d + "'", double13 == 0.9129667732622676d);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0798308350328958d + "'", double22 == 1.0798308350328958d);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(longStream31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2133929897) + "'", int32 == (-2133929897));
        org.junit.Assert.assertNotNull(intStream34);
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.2116903191955297d + "'", double35 == 1.2116903191955297d);
        org.junit.Assert.assertNotNull(doubleStream36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-5628450732286348115L) + "'", long37 == (-5628450732286348115L));
// flaky:         org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.8000334010144524d + "'", double38 == 0.8000334010144524d);
        org.junit.Assert.assertNotNull(intStream40);
        org.junit.Assert.assertNotNull(longStream42);
        org.junit.Assert.assertNotNull(intStream44);
        org.junit.Assert.assertNotNull(longStream47);
// flaky:         org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleStream50);
        org.junit.Assert.assertNotNull(byteArray54);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-53, 15, 82]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 1, 0.0d, 0.2778323727493555d);
        java.util.stream.LongStream longStream9 = random0.longs(1873084296697550790L);
        int int10 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 107326901 + "'", int10 == 107326901);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        java.lang.String str18 = locale11.getDisplayVariant();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getDisplayCountry();
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = locale19.getVariant();
        java.lang.String str24 = locale19.getDisplayVariant();
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.getScript();
        java.lang.String str28 = locale26.getDisplayCountry();
        java.lang.String str29 = locale26.getDisplayCountry();
        java.lang.String str30 = locale26.getISO3Language();
        java.lang.String str31 = locale25.getDisplayLanguage(locale26);
        java.lang.String str32 = locale19.getDisplayLanguage(locale26);
        java.util.Locale locale33 = locale19.stripExtensions();
        java.lang.String str34 = locale11.getDisplayCountry(locale19);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.lang.String str36 = locale35.toLanguageTag();
        java.util.Locale locale37 = locale35.stripExtensions();
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(locale35);
        java.util.Locale locale39 = java.util.Locale.CHINA;
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale35.getDisplayVariant(locale39);
        java.util.Locale locale42 = java.util.Locale.ENGLISH;
        java.lang.String str43 = locale39.getDisplayName(locale42);
        java.lang.String str44 = locale42.getDisplayScript();
        java.util.Set<java.lang.Character> charSet45 = locale42.getExtensionKeys();
        java.util.Locale locale46 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale47 = locale46.stripExtensions();
        java.lang.String str48 = locale42.getDisplayVariant(locale46);
        java.lang.String str49 = locale11.getDisplayName(locale46);
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder52 = builder50.setVariant("");
        java.util.Locale.Builder builder55 = builder50.setExtension('a', "");
        java.util.Locale.Builder builder57 = builder55.setLanguage("");
        java.util.Locale.Builder builder59 = builder55.setLanguage("GBR");
        java.util.Locale.Category category60 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.getScript();
        java.lang.String str63 = locale61.getDisplayCountry();
        java.lang.String str64 = locale61.getDisplayCountry();
        java.lang.String str65 = locale61.getDisplayName();
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.getVariant();
        java.lang.String str68 = locale61.getDisplayScript(locale66);
        java.util.Locale.setDefault(category60, locale66);
        java.util.Locale locale70 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str71 = locale70.getDisplayName();
        java.util.Locale locale72 = java.util.Locale.US;
        java.lang.String str73 = locale70.getDisplayVariant(locale72);
        java.lang.String str74 = locale72.getCountry();
        java.util.Locale.setDefault(category60, locale72);
        java.util.Locale.Builder builder76 = builder59.setLocale(locale72);
        java.util.Set<java.lang.Character> charSet77 = locale72.getExtensionKeys();
        java.lang.String str78 = locale46.getDisplayLanguage(locale72);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd" + "'", str28, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u56fd" + "'", str29, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u82f1\u6587" + "'", str31, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u56fd" + "'", str34, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "zh-CN" + "'", str36, "zh-CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u56fd" + "'", str40, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chinese (China)" + "'", str43, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "chinois (Chine)" + "'", str49, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + category60 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category60.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u4e2d\u56fd" + "'", str63, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u4e2d\u56fd" + "'", str64, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str65, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str71, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "US" + "'", str74, "US");
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(charSet77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "French" + "'", str78, "French");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.toLanguageTag();
        java.lang.String str6 = locale1.getDisplayScript(locale2);
        java.lang.String str7 = locale0.getDisplayLanguage(locale2);
        java.lang.String str8 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh_CN" + "'", str8, "zh_CN");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("\u5fb7\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getUnicodeLocaleType("zh");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("Chine");
        java.util.Locale.Builder builder7 = builder4.setExtension('x', "eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("\u82f1\u6587\u7f8e\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder10 = builder8.setLanguage("en");
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getCountry();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale.Builder builder16 = builder8.setLocale(locale11);
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.lang.String str19 = locale18.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GB" + "'", str12, "GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en-GB" + "'", str19, "en-GB");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        double double6 = random0.nextDouble();
        random0.setSeed((long) (byte) 1);
        double double9 = random0.nextGaussian();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        java.lang.String str12 = faker10.bothify("\u4e2d\u570b");
        com.github.javafaker.Options options13 = faker10.options();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.85751927f + "'", float5 == 0.85751927f);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3448856623437866d + "'", double6 == 0.3448856623437866d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.561581040188955d + "'", double9 == 1.561581040188955d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u570b" + "'", str12, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(options13);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap11);
        java.util.Collection<java.util.Locale> localeCollection13 = null;
        java.util.Locale locale14 = java.util.Locale.lookup(languageRangeList10, localeCollection13);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNull(locale14);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Lorem lorem5 = faker3.lorem();
        com.github.javafaker.Business business6 = faker3.business();
        java.lang.String str8 = faker3.bothify("Englisch (Vereinigtes K\366nigreich)");
        com.github.javafaker.Number number9 = faker3.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str8, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder7 = builder5.setLanguage("");
        java.util.Locale.Builder builder9 = builder5.setLanguage("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("Deutsch (Deutschland)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Deutsch (Deutschland) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.LongStream longStream4 = random0.longs();
        double double5 = random0.nextDouble();
        java.util.stream.IntStream intStream6 = random0.ints();
        java.util.stream.IntStream intStream8 = random0.ints((long) 218414389);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.112805388134255d + "'", double2 == 2.112805388134255d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.964682053651796d + "'", double5 == 0.964682053651796d);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale1.getDisplayName(locale6);
        java.lang.String str14 = locale1.getDisplayName();
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 0, (double) '#');
        long long19 = random15.nextLong();
        java.util.stream.DoubleStream doubleStream21 = random15.doubles(1793234513106471552L);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale1, random15);
        java.util.Random random23 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream26 = random23.doubles((double) (byte) 0, (double) '#');
        double double27 = random23.nextGaussian();
        java.util.stream.DoubleStream doubleStream28 = random23.doubles();
        boolean boolean29 = random23.nextBoolean();
        java.util.stream.LongStream longStream32 = random23.longs((long) 'a', (long) 401882126);
        float float33 = random23.nextFloat();
        double double34 = random23.nextGaussian();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale1, random23);
        java.lang.String str36 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese" + "'", str4, "cinese");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-7627641094154841189L) + "'", long19 == (-7627641094154841189L));
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.38318391397552115d + "'", double27 == 0.38318391397552115d);
        org.junit.Assert.assertNotNull(doubleStream28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.6439559f + "'", float33 == 0.6439559f);
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.2020800899918473d + "'", double34 == 1.2020800899918473d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) -1, (int) (byte) 10);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app10 = faker9.app();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5207816f + "'", float5 == 0.5207816f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.IntStream intStream8 = random3.ints();
        double double9 = random3.nextDouble();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random3);
        com.github.javafaker.App app12 = faker11.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.7679025944213302d) + "'", double7 == (-0.7679025944213302d));
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025406458350753502d + "'", double9 == 0.025406458350753502d);
        org.junit.Assert.assertNotNull(app12);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zho", (double) 0.7308782f);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        java.lang.String str5 = languageRange2.getRange();
        double double6 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7308781743049622d + "'", double3 == 0.7308781743049622d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7308781743049622d + "'", double6 == 0.7308781743049622d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder1.build();
        java.lang.String str5 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.util.Locale locale3 = new java.util.Locale("CN", "TW", "en-GB");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: cn_TW_en-GB could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cn_TW_en-GB");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Code code8 = faker0.code();
        com.github.javafaker.Lorem lorem9 = faker0.lorem();
        java.lang.String str11 = faker0.numerify("\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str11, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-CN", strMap1);
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
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList37);
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
        java.util.Locale.LanguageRange[] languageRangeArray72 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList73 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73, languageRangeArray72);
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        java.util.Locale.FilteringMode filteringMode79 = null;
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList77, filteringMode79);
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList83, filteringMode85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList86);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList86);
        java.lang.String str89 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList88);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap90 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList91 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap90);
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
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
        org.junit.Assert.assertNotNull(languageRangeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(languageRangeList91);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.util.Random random1 = new java.util.Random((long) (byte) 0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Address address3 = faker2.address();
        org.junit.Assert.assertNotNull(address3);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayName(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale4.getDisplayVariant(locale8);
        java.lang.String str10 = locale2.getDisplayScript(locale4);
        java.lang.String str11 = locale0.getDisplayCountry(locale2);
        java.lang.String str12 = locale2.getScript();
        java.lang.String str13 = locale2.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "South Korea" + "'", str11, "South Korea");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str13, "\u82f1\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Random random4 = new java.util.Random();
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream9 = random4.longs();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random4);
        java.util.stream.IntStream intStream14 = random4.ints(3376856765316790501L, (int) '4', 1272557603);
        int int15 = random4.nextInt();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 779194368 + "'", int15 == 779194368);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder9 = builder4.setExtension('a', "");
        java.util.Locale locale10 = builder4.build();
        java.lang.String str11 = locale0.getDisplayName(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (China)" + "'", str11, "Chinese (China)");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for HI!");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.lang.String str8 = locale0.getDisplayScript(locale2);
        java.util.Locale locale10 = new java.util.Locale("fra");
        java.lang.String str11 = locale0.getDisplayVariant(locale10);
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
        org.junit.Assert.assertEquals(locale10.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.getDisplayScript();
        java.lang.String str10 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.String> strSet11 = locale0.getUnicodeLocaleKeys();
        java.util.Random random12 = new java.util.Random();
        java.util.stream.IntStream intStream13 = random12.ints();
        java.util.stream.LongStream longStream16 = random12.longs((long) 1, (long) 100);
        boolean boolean17 = random12.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random12.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream25 = random12.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long26 = random12.nextLong();
        java.util.stream.LongStream longStream29 = random12.longs((long) 401882126, (long) 1790226314);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale0, random12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u5fb7\u6587" + "'", str10, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(longStream25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1990640453824077679L + "'", long26 == 1990640453824077679L);
        org.junit.Assert.assertNotNull(longStream29);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.IntStream intStream10 = random0.ints(963875490, 1875692351);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.23714014799780392d) + "'", double4 == (-0.23714014799780392d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5187684905658578d + "'", double6 == 0.5187684905658578d);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 0, (double) '#');
        double double11 = random7.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random7.doubles();
        java.util.stream.IntStream intStream15 = random7.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random7);
        java.util.stream.LongStream longStream17 = random7.longs();
        java.util.Random random18 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream21 = random18.doubles((double) (byte) 0, (double) '#');
        double double22 = random18.nextGaussian();
        java.util.stream.DoubleStream doubleStream23 = random18.doubles();
        java.util.stream.IntStream intStream26 = random18.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream27 = random18.doubles();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random18.nextBytes(byteArray31);
        random7.nextBytes(byteArray31);
        random0.nextBytes(byteArray31);
        random0.setSeed(3696779666884001675L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5417843613700376d + "'", double4 == 0.5417843613700376d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9232180858200478d + "'", double6 == 0.9232180858200478d);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14226421374280998d + "'", double11 == 0.14226421374280998d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.40348193289038065d + "'", double22 == 0.40348193289038065d);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(byteArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[119, -17, 106]");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = locale12.getLanguage();
        java.lang.String str16 = locale12.getDisplayLanguage();
        java.lang.String str17 = locale12.toLanguageTag();
        java.util.Locale.setDefault(category0, locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale12.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GB" + "'", str13, "GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u82f1\u6587" + "'", str16, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        java.lang.String str7 = faker4.letterify("\u4e2d\u6587\u4e2d\u56fd)");
        com.github.javafaker.App app8 = faker4.app();
        com.github.javafaker.Options options9 = faker4.options();
        com.github.javafaker.Address address10 = faker4.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str7, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.toLanguageTag();
        java.lang.String str8 = locale5.getDisplayName(locale6);
        java.lang.String str9 = locale6.getDisplayScript();
        java.lang.String str10 = locale6.getDisplayCountry();
        java.lang.String str11 = locale1.getDisplayCountry(locale6);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getScript();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = locale17.stripExtensions();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale17);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale17.getDisplayVariant(locale21);
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale21.getDisplayName(locale24);
        java.lang.String str26 = locale24.getDisplayScript();
        java.util.Set<java.lang.String> strSet27 = locale24.getUnicodeLocaleKeys();
        java.lang.String str28 = locale13.getDisplayCountry(locale24);
        java.lang.String str29 = locale6.getDisplayName(locale24);
        java.lang.String str30 = locale6.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str8, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese (China)" + "'", str25, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese (China)" + "'", str29, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh" + "'", str30, "zh");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        java.lang.String str17 = locale0.getVariant();
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
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        com.github.javafaker.Book book13 = faker10.book();
        com.github.javafaker.Lorem lorem14 = faker10.lorem();
        com.github.javafaker.Code code15 = faker10.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertNotNull(code15);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        java.util.stream.LongStream longStream42 = random0.longs(7643996864325553509L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream44 = random0.doubles((long) (-1480715465));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.8399580091736318d) + "'", double4 == (-1.8399580091736318d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3234322728096547794L + "'", long10 == 3234322728096547794L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3374323434450537543L) + "'", long11 == (-3374323434450537543L));
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.3922654330178243d + "'", double17 == 2.3922654330178243d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2110962115661009d + "'", double28 == 0.2110962115661009d);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[98, -71, 121]");
        org.junit.Assert.assertNotNull(longStream42);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        double double9 = random5.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random5.doubles();
        java.util.stream.IntStream intStream13 = random5.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream14 = random5.doubles();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random5.nextBytes(byteArray18);
        random0.nextBytes(byteArray18);
        java.util.stream.LongStream longStream21 = random0.longs();
        java.util.stream.IntStream intStream25 = random0.ints(4561129083941140738L, (int) '#', 1780165113);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1973186944680014d + "'", double9 == 0.1973186944680014d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-67, 96, -29]");
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(intStream25);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-cn (CHINESISCH (CHINA))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: cn (CHINESISCH (CHINA)) [at index 3]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr-FR");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale6.getDisplayScript();
        java.util.Locale.setDefault(category2, locale6);
        java.util.Locale locale11 = java.util.Locale.getDefault(category2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale12);
        java.lang.String str14 = locale12.getDisplayCountry();
        java.util.Locale.setDefault(category2, locale12);
        java.lang.String str16 = locale1.getDisplayScript(locale12);
        java.lang.String str17 = locale12.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.LongStream longStream6 = random0.longs();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.lang.String str10 = faker8.numerify("\u6cd5\u56fd");
        com.github.javafaker.Finance finance11 = faker8.finance();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u56fd" + "'", str10, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(finance11);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = builder5.build();
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
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = builder18.build();
        boolean boolean21 = locale20.hasExtensions();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale20);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str7, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais (Canada)" + "'", str10, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u6cd5\u56fd" + "'", str16, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        com.github.javafaker.Internet internet13 = faker10.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(internet13);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getDisplayCountry();
        java.lang.String str9 = locale5.getISO3Language();
        java.lang.String str10 = locale5.getLanguage();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.util.Locale.setDefault(category4, locale11);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale14.getDisplayCountry();
        java.lang.String str17 = locale14.toLanguageTag();
        java.util.Locale locale18 = locale14.stripExtensions();
        java.lang.String str19 = locale11.getDisplayCountry(locale14);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str22 = locale21.getCountry();
        java.lang.String str23 = locale14.getDisplayLanguage(locale21);
        java.util.Locale locale24 = locale14.stripExtensions();
        java.util.Locale.Builder builder25 = builder1.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder25.setVariant("US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chine" + "'", str7, "Chine");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CN" + "'", str22, "CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.util.Locale locale3 = new java.util.Locale("kor", "zh_CN", "ITA");
        java.lang.String str4 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "kor_ZH_CN_ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u6587", "chine", "");
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587_CHINE");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayScript();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayName();
        java.lang.String str6 = locale0.getISO3Language();
        java.lang.String str7 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CN" + "'", str7, "CN");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        int int8 = random0.nextInt((int) (short) 10);
        boolean boolean9 = random0.nextBoolean();
        double double10 = random0.nextGaussian();
        float float11 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.1604894836405627d) + "'", double4 == (-0.1604894836405627d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2864587650263690748L + "'", long5 == 2864587650263690748L);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.401074384825278d + "'", double10 == 0.401074384825278d);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.1994111f + "'", float11 == 0.1994111f);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("cinese", (-1.0902647969748152d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0902647969748152");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587_CHINE");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587_CHINE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587_CHINE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "\u82f1\u6587_CHINE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ko" + "'", str8, "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc77c\ubcf8\uc5b4\uc77c\ubcf8)" + "'", str9, "\uc77c\ubcf8\uc5b4\uc77c\ubcf8)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja_JP");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Japan" + "'", str4, "Japan");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        float float2 = random1.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random1.doubles((double) 0.13285446f, (double) (-553397993856798634L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7308782f + "'", float2 == 0.7308782f);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale3.getScript();
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getLanguage();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getDisplayScript();
        java.lang.String str17 = locale13.getDisplayLanguage();
        java.lang.String str18 = locale11.getDisplayLanguage(locale13);
        java.util.Set<java.lang.Character> charSet19 = locale11.getExtensionKeys();
        java.lang.String str20 = locale3.getDisplayVariant(locale11);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address22 = faker21.address();
        java.lang.String str24 = faker21.numerify("");
        com.github.javafaker.Lorem lorem25 = faker21.lorem();
        com.github.javafaker.Name name26 = faker21.name();
        com.github.javafaker.App app27 = faker21.app();
        com.github.javafaker.Internet internet28 = faker21.internet();
        com.github.javafaker.App app29 = faker21.app();
        com.github.javafaker.Company company30 = faker21.company();
        boolean boolean31 = locale3.equals((java.lang.Object) company30);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese" + "'", str17, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u6587" + "'", str18, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(lorem25);
        org.junit.Assert.assertNotNull(name26);
        org.junit.Assert.assertNotNull(app27);
        org.junit.Assert.assertNotNull(internet28);
        org.junit.Assert.assertNotNull(app29);
        org.junit.Assert.assertNotNull(company30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setVariant("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayScript();
        java.lang.String str5 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.LongStream longStream4 = random0.longs();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) (-1997406210));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6759291940974181d + "'", double2 == 1.6759291940974181d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.util.Locale locale3 = new java.util.Locale("Franz\366sisch (Kanada)", "en-GB", "de_DE");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for franzo?sisch (kanada)");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "franz\366sisch (kanada)_EN-GB_de_DE");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26, filteringMode27);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("CN");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList30, strMap31);
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
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags(languageRangeList30, (java.util.Collection<java.lang.String>) strList44);
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList44);
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
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "\u82f1\u6587_CHINE");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode27.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
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
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        java.lang.String str7 = faker3.regexify("zh-CN");
        com.github.javafaker.Business business8 = faker3.business();
        com.github.javafaker.Business business9 = faker3.business();
        com.github.javafaker.Hacker hacker10 = faker3.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Name name3 = faker0.name();
        com.github.javafaker.Book book4 = faker0.book();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(book4);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.lang.String str4 = locale1.getLanguage();
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getVariant();
        java.lang.String str8 = locale1.getExtension('x');
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder7.removeUnicodeLocaleAttribute("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setLanguageTag("\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?????? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setRegion("CA");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("French Canada");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale.Builder builder15 = builder9.setLanguageTag("DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder9.removeUnicodeLocaleAttribute("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Finance finance5 = faker0.finance();
        java.lang.String str7 = faker0.bothify("\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u671d\u9c9c\u6587" + "'", str7, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("cn (ZHO,Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: cn (ZHO,Chine) [at index 0]");
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
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587\u4e2d\u56fd)");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category4);
        java.util.Locale locale7 = java.util.Locale.getDefault(category4);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category4, locale8);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayName(locale14);
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Locale.setDefault(category4, locale14);
        java.lang.String str19 = locale2.getDisplayVariant(locale14);
        java.lang.String str20 = locale1.getDisplayScript(locale2);
        java.lang.String str21 = locale2.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str16, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese" + "'", str17, "Chinese");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Options options4 = faker0.options();
        java.lang.String str6 = faker0.numerify("french (canada)");
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "french (canada)" + "'", str6, "french (canada)");
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u6587");
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u6587");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.IntStream intStream15 = random0.ints(1272557603, 1824728183);
        double double16 = random0.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.26095395878389843d) + "'", double4 == (-0.26095395878389843d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.9634746287784894d) + "'", double11 == (-0.9634746287784894d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.009649488045277543d + "'", double16 == 0.009649488045277543d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinesisch", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean", 0.04904355211914646d);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04904355211914646d + "'", double3 == 0.04904355211914646d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "korean" + "'", str4, "korean");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Options options4 = faker0.options();
        java.lang.String str6 = faker0.bothify("GBR");
        com.github.javafaker.Address address7 = faker0.address();
        com.github.javafaker.Color color8 = faker0.color();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GBR" + "'", str6, "GBR");
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fran\347ais (Canada)", 0.571526047272214d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais (canada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Options options5 = faker3.options();
        com.github.javafaker.Lorem lorem6 = faker3.lorem();
        com.github.javafaker.Options options7 = faker3.options();
        com.github.javafaker.App app8 = faker3.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getISO3Language();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.lang.String str13 = locale10.getDisplayVariant();
        java.lang.String str14 = locale6.getDisplayName(locale10);
        boolean boolean15 = languageRange1.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-gb" + "'", str2, "en-gb");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-gb" + "'", str4, "en-gb");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-gb" + "'", str5, "en-gb");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale locale10 = new java.util.Locale("Chine");
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.lang.String str12 = locale0.getDisplayLanguage(locale6);
        java.lang.String str13 = locale0.getDisplayVariant();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder17.setVariant("");
        java.util.Locale.Builder builder22 = builder19.setExtension('u', "zh");
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.getScript();
        java.lang.String str26 = locale24.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayCountry();
        java.lang.String str28 = locale24.getDisplayName();
        java.lang.String str29 = locale24.getDisplayLanguage();
        java.util.Locale.Builder builder30 = builder23.setLocale(locale24);
        java.lang.String str31 = locale16.getDisplayScript(locale24);
        java.lang.String str32 = locale16.getLanguage();
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.lang.String str37 = locale35.getCountry();
        java.lang.String str38 = locale16.getDisplayName(locale35);
        java.lang.String str39 = locale35.getDisplayCountry();
        java.lang.String str40 = locale0.getDisplayScript(locale35);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertEquals(locale10.toString(), "chine");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "China" + "'", str26, "China");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinese (China)" + "'", str28, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "French (Canada)" + "'", str34, "French (Canada)");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "US" + "'", str37, "US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "United States" + "'", str39, "United States");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category10);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale14.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayScript();
        java.util.Locale.setDefault(category10, locale14);
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getDisplayCountry();
        java.util.Locale.setDefault(category10, locale19);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = locale24.stripExtensions();
        java.lang.String str27 = locale23.getDisplayVariant(locale24);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale24);
        java.util.Locale locale29 = locale24.stripExtensions();
        java.util.Locale.setDefault(locale24);
        java.util.Locale.setDefault(category10, locale24);
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.getDefault(category33);
        java.util.Locale locale35 = java.util.Locale.getDefault(category33);
        java.util.Locale locale36 = java.util.Locale.getDefault(category33);
        java.util.Locale locale37 = java.util.Locale.CHINA;
        java.lang.String str38 = locale37.getDisplayCountry();
        java.lang.String str39 = locale37.getDisplayCountry();
        java.lang.String str40 = locale37.getDisplayScript();
        java.util.Locale.setDefault(category33, locale37);
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.lang.String str43 = locale42.toLanguageTag();
        java.util.Locale locale44 = locale42.stripExtensions();
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(locale42);
        java.util.Locale locale46 = java.util.Locale.CHINA;
        java.lang.String str47 = locale46.getDisplayCountry();
        java.lang.String str48 = locale42.getDisplayVariant(locale46);
        java.util.Locale locale49 = java.util.Locale.ENGLISH;
        java.lang.String str50 = locale46.getDisplayName(locale49);
        boolean boolean51 = locale49.hasExtensions();
        java.util.Locale.setDefault(category33, locale49);
        java.util.Locale.setDefault(category0, locale49);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u4e2d\u56fd" + "'", str38, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u56fd" + "'", str39, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u56fd" + "'", str47, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Chinese (China)" + "'", str50, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.Company company2 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Internet internet4 = faker0.internet();
        com.github.javafaker.DateAndTime dateAndTime5 = faker0.date();
        com.github.javafaker.App app6 = faker0.app();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(company2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        java.util.stream.IntStream intStream13 = random0.ints((int) (byte) 1, (int) ' ');
        double double14 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random0.ints(2079689645710807388L, 163231460, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0146823846509363d) + "'", double4 == (-1.0146823846509363d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.49821803915216045d + "'", double6 == 0.49821803915216045d);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2981217357764246d + "'", double14 == 0.2981217357764246d);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setLanguageTag("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u56fd", "USA", "eng");
        java.lang.String str4 = locale3.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u56fd_USA_eng");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-eng" + "'", str4, "x-lvariant-eng");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "US");
        java.util.Locale.Builder builder6 = builder0.setExtension('x', "en_US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setUnicodeLocaleKeyword("fran\347ais", "TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.toLanguageTag();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale1.getDisplayName(locale2);
        java.lang.String str8 = locale2.getScript();
        java.lang.String str9 = locale2.getScript();
        java.lang.String str10 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str7, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getDisplayCountry(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        com.github.javafaker.Color color12 = faker10.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder9 = builder6.setExtension('u', "zh");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayCountry();
        java.lang.String str15 = locale11.getDisplayName();
        java.lang.String str16 = locale11.getDisplayLanguage();
        java.util.Locale.Builder builder17 = builder10.setLocale(locale11);
        boolean boolean18 = languageRange1.equals((java.lang.Object) builder10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinese" + "'", str3, "chinese");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en", strMap1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getDisplayCountry();
        java.lang.String str9 = locale5.getISO3Language();
        java.lang.String str10 = locale5.getLanguage();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale5);
        java.util.Locale.setDefault(category3, locale5);
        java.util.Set<java.lang.String> strSet15 = locale5.getUnicodeLocaleKeys();
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet15);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ko" + "'", str5, "ko");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.numerify("GB");
        com.github.javafaker.Internet internet9 = faker0.internet();
        java.lang.String str11 = faker0.regexify("deutsch");
        com.github.javafaker.Finance finance12 = faker0.finance();
        com.github.javafaker.DateAndTime dateAndTime13 = faker0.date();
        java.lang.String str15 = faker0.numerify("Chine");
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GB" + "'", str8, "GB");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "deutsch" + "'", str11, "deutsch");
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNotNull(dateAndTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chine" + "'", str15, "Chine");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Color color3 = faker1.color();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Color color6 = faker1.color();
        com.github.javafaker.App app7 = faker1.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = random0.ints(7, (-1157480671));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.setScript("en-gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en-gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.Lorem lorem7 = faker3.lorem();
        com.github.javafaker.DateAndTime dateAndTime8 = faker3.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.util.Locale locale1 = new java.util.Locale("zh-cn (CHINESISCH (CHINA))");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn (chinesisch (china))");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        java.util.stream.IntStream intStream27 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream29 = random0.ints((-8923923212435461099L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.854175192403185d + "'", double4 == 1.854175192403185d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.9506976527122349d) + "'", double15 == (-0.9506976527122349d));
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-111, 124, 41]");
        org.junit.Assert.assertNotNull(intStream27);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale1.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.getDisplayLanguage();
        boolean boolean9 = locale4.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.lang.String str15 = locale11.getDisplayLanguage(locale14);
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 0, (double) '#');
        double double20 = random16.nextGaussian();
        java.util.stream.DoubleStream doubleStream21 = random16.doubles();
        double double22 = random16.nextDouble();
        java.util.stream.IntStream intStream26 = random16.ints(100L, (-1), (int) (byte) 0);
        double double27 = random16.nextGaussian();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale11, random16);
        java.lang.String str29 = locale10.getDisplayName(locale11);
        java.lang.String str30 = locale10.getScript();
        java.lang.String str31 = locale1.getDisplayLanguage(locale10);
        java.util.Locale locale34 = new java.util.Locale("fr_CA", "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str36 = locale35.getCountry();
        java.lang.String str37 = locale35.getVariant();
        java.lang.String str38 = locale35.getVariant();
        java.util.Locale locale39 = locale35.stripExtensions();
        java.util.Locale.setDefault(locale39);
        java.lang.String str41 = locale34.getDisplayScript(locale39);
        boolean boolean42 = locale10.equals((java.lang.Object) locale39);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French (Canada)" + "'", str12, "French (Canada)");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587" + "'", str15, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(doubleStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.763470598791979d + "'", double20 == 1.763470598791979d);
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.7985498957684526d + "'", double22 == 0.7985498957684526d);
        org.junit.Assert.assertNotNull(intStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.33147329595372066d + "'", double27 == 0.33147329595372066d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese" + "'", str31, "Chinese");
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_ZH_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        double double5 = random0.nextGaussian();
        java.util.stream.LongStream longStream6 = random0.longs();
        int int8 = random0.nextInt(2109552831);
        java.util.stream.IntStream intStream11 = random0.ints(176374748, 247536258);
        int int12 = random0.nextInt();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.6460059937764332d) + "'", double5 == (-0.6460059937764332d));
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 954855084 + "'", int8 == 954855084);
        org.junit.Assert.assertNotNull(intStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47517796 + "'", int12 == 47517796);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Locale locale8 = locale6.stripExtensions();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale6);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale6.getDisplayVariant(locale10);
        java.lang.String str13 = locale6.getDisplayVariant();
        java.util.Locale.Builder builder14 = builder2.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.removeUnicodeLocaleAttribute("\u6cd5\u6587\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cina" + "'", str11, "Cina");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("us");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.util.Locale locale3 = new java.util.Locale("CN", "TW", "en-GB");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("hi! (HI!,hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi! (HI!,hi!)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cn_TW_en-GB");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.LongStream longStream9 = random0.longs(7975027329722967446L);
        long long10 = random0.nextLong();
        boolean boolean11 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9995281009313913d + "'", double2 == 0.9995281009313913d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-7784380265975864842L) + "'", long4 == (-7784380265975864842L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7541664405757533d + "'", double5 == 0.7541664405757533d);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-6596689759739666739L) + "'", long10 == (-6596689759739666739L));
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zho", strMap1);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale3.getScript();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale3.getDisplayLanguage(locale7);
        java.lang.String str10 = locale7.getScript();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet11);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cinese" + "'", str9, "cinese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.util.Locale locale2 = new java.util.Locale("Chinesisch (China)", "\u4e2d\u56fd");
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.toString();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        int int12 = random0.nextInt();
        double double13 = random0.nextGaussian();
        java.util.stream.IntStream intStream14 = random0.ints();
        java.util.stream.DoubleStream doubleStream18 = random0.doubles((long) 54, (-1.42081660603311d), 0.7112017567200538d);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = random0.nextInt((-1565762321));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8317827177080191d + "'", double10 == 0.8317827177080191d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4732467130980149d + "'", double11 == 0.4732467130980149d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1735328687 + "'", int12 == 1735328687);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7987643770419415d + "'", double13 == 1.7987643770419415d);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.DateAndTime dateAndTime5 = faker4.date();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker4.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italienisch" + "'", str3, "Italienisch");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale3.getDisplayCountry(locale4);
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale7.getDisplayCountry(locale8);
        java.lang.String str11 = locale3.getDisplayCountry(locale7);
        java.lang.String str12 = locale0.getDisplayScript(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        java.util.Locale locale12 = builder1.build();
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale15);
        java.lang.String str17 = locale13.getDisplayVariant(locale15);
        java.lang.String str18 = locale12.getDisplayLanguage(locale15);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cina" + "'", str7, "Cina");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GB" + "'", str14, "GB");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str18, "\uc911\uad6d\uc5b4");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais", "CN", "English (United States)");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale4.getISO3Country();
        java.lang.String str9 = locale4.getDisplayCountry();
        java.lang.String str10 = locale3.getDisplayName(locale4);
        java.lang.String str11 = locale4.getScript();
        java.lang.String str12 = locale4.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet13 = locale4.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais_CN_English (United States)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "francese (Canada)" + "'", str5, "francese (Canada)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CAN" + "'", str8, "CAN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Canada" + "'", str9, "Canada");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais (Chine,English (United States))" + "'", str10, "fran\347ais (Chine,English (United States))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Canada" + "'", str12, "Canada");
        org.junit.Assert.assertNotNull(charSet13);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.util.Random random1 = new java.util.Random((-8338582403409264965L));
        int int3 = random1.nextInt(792642830);
        random1.setSeed(5270493142417067156L);
        double double6 = random1.nextDouble();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 348207412 + "'", int3 == 348207412);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4333515390665118d + "'", double6 == 0.4333515390665118d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.toLanguageTag();
        java.lang.String str10 = locale7.getDisplayName(locale8);
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale8.getDisplayVariant(locale12);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale12);
        java.lang.String str15 = locale12.getISO3Country();
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale6.getDisplayCountry(locale12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str10, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cinese" + "'", str11, "cinese");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(phoneNumber2);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u6cd5\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(???)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale0.getDisplayScript(locale5);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str14 = locale13.getDisplayCountry();
        java.util.Locale.setDefault(category8, locale13);
        java.lang.String str16 = locale5.getDisplayCountry(locale13);
        java.lang.String str17 = locale13.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cina" + "'", str3, "Cina");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese (Cina)" + "'", str4, "cinese (Cina)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale.setDefault(locale6);
        java.lang.String str11 = locale6.getCountry();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale12.getScript();
        java.lang.String str15 = locale12.getScript();
        java.util.Random random17 = new java.util.Random(0L);
        java.util.stream.DoubleStream doubleStream20 = random17.doubles(0.3893588757268301d, (double) 1426876149034384144L);
        java.util.stream.IntStream intStream21 = random17.ints();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale12, random17);
        java.lang.String str23 = locale6.getDisplayLanguage(locale12);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cina" + "'", str3, "Cina");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cina" + "'", str4, "Cina");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Cina)" + "'", str5, "cinese (Cina)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CN" + "'", str11, "CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long14 = random0.nextLong();
        java.util.stream.LongStream longStream17 = random0.longs((long) 401882126, (long) 1790226314);
        int int19 = random0.nextInt(1155099827);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream22 = random0.longs(3774121717343888821L, (long) (-858120823));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5669657386417210270L + "'", long14 == 5669657386417210270L);
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 410379820 + "'", int19 == 410379820);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.util.Random random1 = new java.util.Random(6450027449199085516L);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((double) (-1779811016564306803L), 0.3614243155767747d);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.6022959f + "'", float5 == 0.6022959f);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream15 = random0.longs((long) (short) 0);
        java.util.stream.IntStream intStream16 = random0.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream19 = random0.doubles(0.5872474735955328d, (double) 0.32835996f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        java.lang.String str5 = faker0.bothify("can_CN_en-gb");
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Book book8 = faker0.book();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "can_CN_en-gb" + "'", str5, "can_CN_en-gb");
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(book8);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("coreano");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category5);
        java.util.Locale locale8 = java.util.Locale.getDefault(category5);
        java.util.Locale.Builder builder9 = builder3.setLocale(locale8);
        java.lang.String str10 = locale8.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str10, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.util.Locale locale1 = new java.util.Locale("ko");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category3);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayScript();
        java.util.Locale.setDefault(category3, locale7);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Locale.setDefault(category3, locale13);
        java.lang.String str18 = locale13.getISO3Language();
        java.lang.String str19 = locale1.getDisplayVariant(locale13);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        java.util.Set<java.lang.Character> charSet18 = locale11.getExtensionKeys();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale19.toLanguageTag();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale22.getScript();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        java.lang.String str28 = locale22.getDisplayLanguage(locale26);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale29.getVariant();
        java.lang.String str31 = locale22.getDisplayVariant(locale29);
        java.util.Locale locale35 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        java.lang.String str36 = locale22.getDisplayName(locale35);
        java.lang.String str37 = locale21.getDisplayVariant(locale22);
        java.lang.String str38 = locale11.getDisplayName(locale21);
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
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fr-CA" + "'", str20, "fr-CA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinese (China)" + "'", str36, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "chinois (Chine)" + "'", str38, "chinois (Chine)");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.util.Random random1 = new java.util.Random(0L);
        java.util.stream.IntStream intStream5 = random1.ints((long) '4', 0, 71885252);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.IntStream intStream12 = random0.ints(1, (int) 'x');
        float float13 = random0.nextFloat();
        int int14 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1391020409953258d + "'", double4 == 0.1391020409953258d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.031109214f + "'", float13 == 0.031109214f);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1306297864) + "'", int14 == (-1306297864));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        com.github.javafaker.Business business8 = faker3.business();
        com.github.javafaker.Company company9 = faker3.company();
        com.github.javafaker.Code code10 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.lang.String str7 = locale0.getScript();
        java.util.Locale locale8 = locale0.stripExtensions();
        java.lang.String str9 = locale8.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder7 = builder2.setRegion("");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setVariant("cinese");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("fra");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLanguage("FR_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: FR_CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        java.lang.String str17 = locale0.getISO3Country();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale22 = new java.util.Locale("Chine");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale22.getDisplayName(locale23);
        java.lang.String str26 = locale19.getDisplayName(locale22);
        java.lang.String str27 = locale0.getDisplayName(locale22);
        java.lang.String str28 = locale22.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHN" + "'", str17, "CHN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale22.toString(), "chine");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chine" + "'", str25, "chine");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "English (United States)" + "'", str26, "English (United States)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "chine" + "'", str28, "chine");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("", "CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        com.github.javafaker.Code code13 = faker12.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9089247012896647d + "'", double11 == 0.9089247012896647d);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.IntStream intStream13 = random0.ints(556026474746289050L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.8941451116802295d) + "'", double4 == (-1.8941451116802295d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale1.getDisplayName(locale6);
        java.lang.String str14 = locale1.getDisplayName();
        java.lang.Object obj15 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "zh_CN");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (short) 10, 0.04702830040266232d, (double) (byte) 1);
        long long10 = random0.nextLong();
        float float11 = random0.nextFloat();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4622112461377121319L + "'", long10 == 4622112461377121319L);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.67109126f + "'", float11 == 0.67109126f);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Options options5 = faker3.options();
        com.github.javafaker.Lorem lorem6 = faker3.lorem();
        com.github.javafaker.Name name7 = faker3.name();
        com.github.javafaker.Business business8 = faker3.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("hi!_HI!_hi!", "ko-KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi!_HI!_hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.util.Locale locale3 = new java.util.Locale("chinese", "Deutsch (Deutschland)", "CN");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale3.getDisplayCountry(locale5);
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_DEUTSCH (DEUTSCHLAND)_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DEUTSCH (DEUTSCHLAND)" + "'", str6, "DEUTSCH (DEUTSCHLAND)");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale0.getDisplayScript(locale5);
        java.lang.String str8 = locale5.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale5.getDisplayScript(locale9);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale16 = locale14.stripExtensions();
        java.lang.String str17 = locale13.getDisplayVariant(locale14);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.toLanguageTag();
        java.lang.String str21 = locale18.getDisplayName(locale19);
        java.lang.String str22 = locale19.getDisplayScript();
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale14.getDisplayCountry(locale19);
        java.lang.String str25 = locale5.getDisplayVariant(locale19);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr-CA" + "'", str10, "fr-CA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh-CN" + "'", str20, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str21, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u56fd" + "'", str23, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd" + "'", str24, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Options options5 = faker3.options();
        com.github.javafaker.Lorem lorem6 = faker3.lorem();
        com.github.javafaker.Name name7 = faker3.name();
        com.github.javafaker.Hacker hacker8 = faker3.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(hacker8);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.util.Locale.Category category0 = null;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.toLanguageTag();
        java.util.Locale.Builder builder9 = builder4.setLocale(locale5);
        java.util.Locale.Builder builder11 = builder9.setLanguage("en");
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getCountry();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale14);
        java.lang.String str16 = locale12.getDisplayVariant(locale14);
        java.util.Locale.Builder builder17 = builder9.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GB" + "'", str13, "GB");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale8.getDisplayName(locale9);
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale9);
        java.util.Locale locale14 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder7.setVariant("x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: x-lvariant-eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str11, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        double double13 = random0.nextGaussian();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.20718216854503568d + "'", double10 == 0.20718216854503568d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6284418683718105d + "'", double11 == 0.6284418683718105d);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.1738890944542064d) + "'", double13 == (-0.1738890944542064d));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.util.Locale locale2 = new java.util.Locale("\uc911\uad6d", "koreanisch");
        org.junit.Assert.assertEquals(locale2.toString(), "\uc911\uad6d_KOREANISCH");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587", "SOUTH KOREA", "hi!");
        org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587_SOUTH KOREA_hi!");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        java.lang.String str13 = faker10.bothify("Franz\366sisch (Frankreich)");
        com.github.javafaker.Company company14 = faker10.company();
        com.github.javafaker.Book book15 = faker10.book();
        com.github.javafaker.Business business16 = faker10.business();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker10.phoneNumber();
        com.github.javafaker.Hacker hacker18 = faker10.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(hacker18);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.lang.String str11 = locale7.getDisplayLanguage(locale10);
        java.util.Random random12 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream15 = random12.doubles((double) (byte) 0, (double) '#');
        double double16 = random12.nextGaussian();
        java.util.stream.DoubleStream doubleStream17 = random12.doubles();
        double double18 = random12.nextDouble();
        java.util.stream.IntStream intStream22 = random12.ints(100L, (-1), (int) (byte) 0);
        double double23 = random12.nextGaussian();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale7, random12);
        java.lang.String str25 = locale6.getDisplayName(locale7);
        java.lang.String str26 = locale6.getScript();
        java.util.Locale locale29 = new java.util.Locale("US", "en-GB");
        java.lang.String str30 = locale29.getDisplayLanguage();
        boolean boolean31 = locale29.hasExtensions();
        java.lang.String str32 = locale6.getDisplayVariant(locale29);
        java.util.Random random33 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream36 = random33.doubles((double) (byte) 0, (double) '#');
        double double37 = random33.nextGaussian();
        java.util.stream.DoubleStream doubleStream38 = random33.doubles();
        double double39 = random33.nextDouble();
        java.util.stream.IntStream intStream43 = random33.ints(100L, (-1), (int) (byte) 0);
        double double44 = random33.nextGaussian();
        java.util.stream.IntStream intStream45 = random33.ints();
        java.util.stream.LongStream longStream46 = random33.longs();
        random33.setSeed(100L);
        java.util.stream.IntStream intStream50 = random33.ints(8651399998613895826L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(locale6, random33);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str8, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.005640871694880452d) + "'", double16 == (-0.005640871694880452d));
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.892062063469775d + "'", double18 == 0.892062063469775d);
        org.junit.Assert.assertNotNull(intStream22);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.6826214497681837d) + "'", double23 == (-1.6826214497681837d));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale29.toString(), "us_EN-GB");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "us" + "'", str30, "us");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(doubleStream36);
// flaky:         org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-0.16106565996605599d) + "'", double37 == (-0.16106565996605599d));
        org.junit.Assert.assertNotNull(doubleStream38);
// flaky:         org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.364847477257664d + "'", double39 == 0.364847477257664d);
        org.junit.Assert.assertNotNull(intStream43);
// flaky:         org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.5355899270822666d) + "'", double44 == (-1.5355899270822666d));
        org.junit.Assert.assertNotNull(intStream45);
        org.junit.Assert.assertNotNull(longStream46);
        org.junit.Assert.assertNotNull(intStream50);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        int int10 = random0.nextInt(163231460);
        boolean boolean11 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(176644252576367991L);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.2913887558653546d) + "'", double4 == (-0.2913887558653546d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53104348 + "'", int10 == 53104348);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles(0.827527179590405d, 0.23212907165507035d);
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
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("coreano");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category5);
        java.util.Locale locale8 = java.util.Locale.getDefault(category5);
        java.util.Locale.Builder builder9 = builder3.setLocale(locale8);
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setUnicodeLocaleKeyword("\u4e2d\u56fd", "US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.util.Locale locale2 = new java.util.Locale("", "USA");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.toLanguageTag();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale4.getDisplayVariant(locale5);
        java.lang.String str9 = locale2.getDisplayCountry(locale5);
        java.util.Locale locale10 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "_USA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "USA" + "'", str9, "USA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "_USA");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.util.Locale locale3 = new java.util.Locale("\uc774\ud0c8\ub9ac\uc544\uc5b4", "\u4e2d\u56fd", "English");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\uc774\ud0c8\ub9ac\uc544\uc5b4\u4e2d\u56fd_English");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
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
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale4);
        java.util.Locale.Builder builder15 = builder1.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder1.setUnicodeLocaleKeyword("Chinese (China)", "Japan");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((long) 2084832918);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0886295832738511d) + "'", double4 == (-0.0886295832738511d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7160783813708924d + "'", double11 == 0.7160783813708924d);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.setLanguageTag("CAN");
        java.util.Locale.Builder builder10 = builder8.setLanguage("China");
        java.util.Locale.Builder builder12 = builder10.setLanguage("English");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getUnicodeLocaleType("cn_TW_en-GB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: cn_TW_en-GB");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayVariant(locale8);
        java.lang.String str11 = locale1.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale8.getDisplayScript(locale12);
        java.lang.String str15 = locale12.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko-KR" + "'", str13, "ko-KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u671d\u9c9c\u6587" + "'", str15, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.addUnicodeLocaleAttribute("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        java.lang.String str8 = faker3.letterify("Chine");
        com.github.javafaker.PhoneNumber phoneNumber9 = faker3.phoneNumber();
        java.lang.String str11 = faker3.numerify("French (Canada)");
        com.github.javafaker.Company company12 = faker3.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (Canada)" + "'", str11, "French (Canada)");
        org.junit.Assert.assertNotNull(company12);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        java.lang.String str14 = locale0.getDisplayCountry();
        java.util.Locale locale15 = locale0.stripExtensions();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = locale15.getDisplayLanguage(locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u56fd" + "'", str14, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getCountry();
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.util.Locale locale10 = new java.util.Locale("Chine");
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.lang.String str12 = locale1.getDisplayVariant(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TW" + "'", str4, "TW");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale10.toString(), "chine");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("it", (double) (-6373964799784006388L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-6.3739647997840067E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale5);
        java.lang.String str8 = locale5.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Taiwan");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        random0.setSeed(3376856765316790501L);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream19 = random0.longs(2786136017667551334L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5946553030635311d + "'", double4 == 0.5946553030635311d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08617438741479577d + "'", double6 == 0.08617438741479577d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9296968021551794d + "'", double11 == 0.9296968021551794d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale0.getDisplayLanguage(locale1);
        java.lang.String str7 = locale0.getScript();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale locale13 = new java.util.Locale("CN", "TW", "en-GB");
        java.lang.String str14 = locale8.getDisplayName(locale13);
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale15.getScript();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale15.getDisplayLanguage(locale19);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getVariant();
        java.lang.String str24 = locale15.getDisplayVariant(locale22);
        java.lang.String str25 = locale13.getDisplayScript(locale22);
        java.lang.String str26 = locale0.getDisplayVariant(locale22);
        java.util.Set<java.lang.String> strSet27 = locale22.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CAN" + "'", str9, "CAN");
        org.junit.Assert.assertEquals(locale13.toString(), "cn_TW_en-GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French (Canada)" + "'", str14, "French (Canada)");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587" + "'", str21, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.lang.String str5 = locale4.getLanguage();
        java.util.Locale locale7 = new java.util.Locale("ko");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.LongStream longStream18 = random0.longs(5288735684466769752L, 1L, (long) 100);
        int int20 = random0.nextInt(383222448);
        java.util.stream.IntStream intStream24 = random0.ints((long) 65, (int) '#', 180995420);
        int int26 = random0.nextInt(218414389);
        double double27 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream28 = random0.doubles();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 85331076 + "'", int20 == 85331076);
        org.junit.Assert.assertNotNull(intStream24);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 175439095 + "'", int26 == 175439095);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.1653291599418938d + "'", double27 == 0.1653291599418938d);
        org.junit.Assert.assertNotNull(doubleStream28);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.App app8 = faker0.app();
        java.lang.String str10 = faker0.numerify("Franz\366sisch (Kanada)");
        com.github.javafaker.Hacker hacker11 = faker0.hacker();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Franz\366sisch (Kanada)" + "'", str10, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(hacker11);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", 0.6866727861559659d);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale3.getDisplayName(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale3);
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3, random8);
        com.github.javafaker.Code code14 = faker13.code();
        com.github.javafaker.Hacker hacker15 = faker13.hacker();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker13.phoneNumber();
        boolean boolean17 = languageRange2.equals((java.lang.Object) faker13);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (China)" + "'", str6, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(hacker15);
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream15 = random0.longs((long) (short) 0);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles();
        java.util.stream.LongStream longStream18 = random0.longs(5689803982665130262L);
        double double19 = random0.nextGaussian();
        java.util.Random random20 = new java.util.Random();
        java.util.stream.IntStream intStream21 = random20.ints();
        double double22 = random20.nextGaussian();
        java.util.stream.DoubleStream doubleStream23 = random20.doubles();
        java.util.stream.IntStream intStream25 = random20.ints(10L);
        java.util.stream.LongStream longStream26 = random20.longs();
        java.util.Random random27 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream30 = random27.doubles((double) (byte) 0, (double) '#');
        double double31 = random27.nextGaussian();
        java.util.stream.DoubleStream doubleStream32 = random27.doubles();
        java.util.stream.LongStream longStream36 = random27.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream38 = random27.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream40 = random27.longs(4668688544456269390L);
        int int41 = random27.nextInt();
        java.util.Random random42 = new java.util.Random();
        java.util.stream.IntStream intStream43 = random42.ints();
        double double44 = random42.nextGaussian();
        java.util.stream.DoubleStream doubleStream45 = random42.doubles();
        long long46 = random42.nextLong();
        double double47 = random42.nextGaussian();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random42);
        java.util.stream.IntStream intStream49 = random42.ints();
        java.util.stream.LongStream longStream51 = random42.longs(7975027329722967446L);
        java.util.Random random52 = new java.util.Random();
        java.util.stream.IntStream intStream53 = random52.ints();
        java.util.stream.LongStream longStream56 = random52.longs((long) 1, (long) 100);
        boolean boolean57 = random52.nextBoolean();
        java.util.stream.DoubleStream doubleStream59 = random52.doubles(0L);
        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random52.nextBytes(byteArray63);
        random42.nextBytes(byteArray63);
        random27.nextBytes(byteArray63);
        random20.nextBytes(byteArray63);
        random0.nextBytes(byteArray63);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.4009638929655099d) + "'", double19 == (-0.4009638929655099d));
        org.junit.Assert.assertNotNull(intStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.729853502178703d) + "'", double22 == (-1.729853502178703d));
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(intStream25);
        org.junit.Assert.assertNotNull(longStream26);
        org.junit.Assert.assertNotNull(doubleStream30);
// flaky:         org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.6784674820171968d + "'", double31 == 0.6784674820171968d);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertNotNull(longStream40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1029032298 + "'", int41 == 1029032298);
        org.junit.Assert.assertNotNull(intStream43);
// flaky:         org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.7894854960252147d) + "'", double44 == (-1.7894854960252147d));
        org.junit.Assert.assertNotNull(doubleStream45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3735687822417338572L + "'", long46 == 3735687822417338572L);
// flaky:         org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.8234556613462433d) + "'", double47 == (-0.8234556613462433d));
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(longStream51);
        org.junit.Assert.assertNotNull(intStream53);
        org.junit.Assert.assertNotNull(longStream56);
// flaky:         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleStream59);
        org.junit.Assert.assertNotNull(byteArray63);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-16, 67, -113]");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale locale15 = builder14.build();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale.Builder builder18 = builder14.setLocale(locale16);
        java.lang.String str19 = locale16.toLanguageTag();
        java.lang.String str20 = locale16.getDisplayScript();
        java.lang.String str21 = locale11.getDisplayName(locale16);
        java.lang.String str22 = locale9.getDisplayCountry(locale11);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u5fb7\u6587" + "'", str21, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) -1, (int) (byte) 10);
        double double9 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.1523785f + "'", float5 == 0.1523785f);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.6913097354134985d + "'", double9 == 1.6913097354134985d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayVariant(locale8);
        java.lang.String str11 = locale1.getDisplayScript(locale8);
        java.util.Locale locale12 = locale1.stripExtensions();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.util.Locale locale17 = new java.util.Locale("Chine");
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = locale17.getDisplayName(locale18);
        java.lang.String str21 = locale14.getDisplayName(locale17);
        java.lang.String str22 = locale1.getDisplayScript(locale17);
        java.lang.Object obj23 = locale17.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale17.toString(), "chine");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chine" + "'", str20, "chine");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English (United States)" + "'", str21, "English (United States)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "chine");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "chine");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "chine");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.toLanguageTag();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale1.getDisplayName(locale2);
        java.lang.String str8 = locale2.getDisplayLanguage();
        java.util.Random random10 = new java.util.Random((-4221668444904202442L));
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale2, random10);
        int int12 = random10.nextInt();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str7, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1962911216) + "'", int12 == (-1962911216));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u56fd", 1.3017987407588212d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.3017987407588212");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.lang.String str9 = locale7.getDisplayName();
        java.lang.String str10 = locale7.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (China)" + "'", str8, "Chinese (China)");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getDisplayScript();
        java.lang.Class<?> wildcardClass4 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26, filteringMode27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap33);
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
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode27.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(languageRangeList34);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.IntStream intStream8 = random3.ints();
        double double9 = random3.nextDouble();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        com.github.javafaker.Color color11 = faker10.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.2271988811706824d) + "'", double7 == (-1.2271988811706824d));
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.21535386567748016d + "'", double9 == 0.21535386567748016d);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
            java.lang.String str12 = faker10.resolve("italiano");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Random random4 = new java.util.Random();
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream9 = random4.longs();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random4);
        int int11 = random4.nextInt();
        double double12 = random4.nextGaussian();
        int int13 = random4.nextInt();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-320670834) + "'", int11 == (-320670834));
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.271884521003507d) + "'", double12 == (-1.271884521003507d));
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 252953418 + "'", int13 == 252953418);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random12 = new java.util.Random();
        java.util.stream.IntStream intStream13 = random12.ints();
        java.util.stream.LongStream longStream16 = random12.longs((long) 1, (long) 100);
        boolean boolean17 = random12.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random12.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream25 = random12.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long26 = random12.nextLong();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale11, random12);
        java.lang.String str28 = locale11.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale30.getScript();
        java.lang.String str32 = locale30.getDisplayCountry();
        java.lang.String str33 = locale30.toLanguageTag();
        java.util.Locale.setDefault(category0, locale30);
        java.util.Locale locale35 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str5, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(longStream25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3899368120582151496L) + "'", long26 == (-3899368120582151496L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd" + "'", str28, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u56fd" + "'", str32, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        double double4 = random0.nextGaussian();
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream6 = random0.ints();
        double double7 = random0.nextDouble();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15390926670141547d) + "'", double2 == (-0.15390926670141547d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.1760299243381658d) + "'", double4 == (-1.1760299243381658d));
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.005386412f + "'", float5 == 0.005386412f);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8769100835985034d + "'", double7 == 0.8769100835985034d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream15 = random1.doubles((double) (-2506914755829807295L), (double) 100.0f);
        double double16 = random1.nextDouble();
        boolean boolean17 = random1.nextBoolean();
        java.util.stream.IntStream intStream20 = random1.ints(352608531, 1575358308);
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 0, (double) '#');
        double double25 = random21.nextGaussian();
        java.util.stream.DoubleStream doubleStream26 = random21.doubles();
        boolean boolean27 = random21.nextBoolean();
        java.util.stream.DoubleStream doubleStream30 = random21.doubles((double) (-4711220549636234721L), 0.04702830040266232d);
        java.util.Random random31 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream34 = random31.doubles((double) (byte) 0, (double) '#');
        double double35 = random31.nextGaussian();
        java.util.stream.DoubleStream doubleStream36 = random31.doubles();
        java.util.stream.IntStream intStream39 = random31.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(random31);
        java.util.stream.LongStream longStream41 = random31.longs();
        java.util.Random random42 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream45 = random42.doubles((double) (byte) 0, (double) '#');
        double double46 = random42.nextGaussian();
        java.util.stream.DoubleStream doubleStream47 = random42.doubles();
        java.util.stream.IntStream intStream50 = random42.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream51 = random42.doubles();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random42.nextBytes(byteArray55);
        random31.nextBytes(byteArray55);
        random21.nextBytes(byteArray55);
        random1.nextBytes(byteArray55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream61 = random1.doubles((-772328689714256522L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.513390943120334d + "'", double11 == 0.513390943120334d);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7014303890788812d + "'", double16 == 0.7014303890788812d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.9628811439043129d) + "'", double25 == (-0.9628811439043129d));
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(doubleStream34);
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.524932329601874d + "'", double35 == 0.524932329601874d);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(intStream39);
        org.junit.Assert.assertNotNull(longStream41);
        org.junit.Assert.assertNotNull(doubleStream45);
// flaky:         org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-2.5814088792552767d) + "'", double46 == (-2.5814088792552767d));
        org.junit.Assert.assertNotNull(doubleStream47);
        org.junit.Assert.assertNotNull(intStream50);
        org.junit.Assert.assertNotNull(doubleStream51);
        org.junit.Assert.assertNotNull(byteArray55);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-76, 126, 108]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.setLanguageTag("CAN");
        java.util.Locale.Builder builder9 = builder0.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getCountry();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.util.Locale locale9 = new java.util.Locale("Chine");
        java.lang.String str10 = locale5.getDisplayScript(locale9);
        java.lang.String str11 = locale0.getDisplayVariant(locale5);
        java.lang.String str12 = locale5.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TW" + "'", str3, "TW");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale9.toString(), "chine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem2 = faker1.lorem();
        com.github.javafaker.Code code3 = faker1.code();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(hacker4);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("fra");
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = locale8.getDisplayName(locale10);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale8);
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale8, random13);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getVariant();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale19.getDisplayName(locale21);
        boolean boolean23 = locale19.hasExtensions();
        java.lang.String str24 = locale8.getDisplayLanguage(locale19);
        java.lang.String str25 = locale19.getScript();
        java.lang.String str26 = locale19.getDisplayVariant();
        java.lang.String str27 = locale19.getDisplayCountry();
        java.util.Locale.Builder builder28 = builder7.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder7.setScript("de_DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: de_DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinesisch (China)" + "'", str11, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chinesisch (China)" + "'", str22, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u56fd" + "'", str27, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.util.Locale locale1 = new java.util.Locale("\u53f0\u7063");
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getExtension('u');
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.lang.String str6 = locale1.getDisplayLanguage(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u53f0\u7063" + "'", str6, "\u53f0\u7063");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.util.Random random1 = new java.util.Random((-7103792676836336750L));
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = random1.longs((-1854196926056642962L), (-7111866488821705308L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        java.lang.String str7 = faker3.regexify("zh-CN");
        java.lang.String str9 = faker3.regexify("English (United States)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English United States" + "'", str9, "English United States");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Number number5 = faker0.number();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray13);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        long long16 = random0.nextLong();
        java.util.stream.IntStream intStream17 = random0.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.6030847103578711d) + "'", double4 == (-1.6030847103578711d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[4, -111, 47]");
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1121797665903282463L + "'", long16 == 1121797665903282463L);
        org.junit.Assert.assertNotNull(intStream17);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream9 = random0.longs((long) 'a', (long) 401882126);
        float float10 = random0.nextFloat();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.921626504223712d) + "'", double4 == (-1.921626504223712d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.68080235f + "'", float10 == 0.68080235f);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(7643996864325553509L);
        double double14 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4572261432890288d + "'", double4 == 1.4572261432890288d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08822059405774718d + "'", double9 == 0.08822059405774718d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1466598856) + "'", int10 == (-1466598856));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.2543611986458316d + "'", double11 == 2.2543611986458316d);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.07620626410218002d) + "'", double14 == (-0.07620626410218002d));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Company company5 = faker3.company();
        com.github.javafaker.App app6 = faker3.app();
        com.github.javafaker.Color color7 = faker3.color();
        com.github.javafaker.DateAndTime dateAndTime8 = faker3.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Finance finance8 = faker7.finance();
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
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        java.lang.Class<?> wildcardClass90 = localeList89.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        java.util.stream.LongStream longStream15 = random0.longs(4141605534691042142L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.002050214904179218d) + "'", double4 == (-0.002050214904179218d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.32811494953404086d + "'", double6 == 0.32811494953404086d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.8846652305366028d) + "'", double11 == (-0.8846652305366028d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream15);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.util.Locale locale1 = new java.util.Locale("Franz\366sisch");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "franz\366sisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "franz\366sisch" + "'", str2, "franz\366sisch");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream15 = random0.ints(5689803982665130262L);
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 0, (double) '#');
        double double20 = random16.nextGaussian();
        java.util.stream.DoubleStream doubleStream21 = random16.doubles();
        java.util.stream.IntStream intStream24 = random16.ints((int) (byte) 10, (int) '#');
        random16.setSeed((long) (short) 1);
        random16.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream29 = random16.doubles();
        int int30 = random16.nextInt();
        random16.setSeed((-2902042412286228963L));
        random16.setSeed((-7992033312183365925L));
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random16);
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random37 = new java.util.Random();
        java.util.stream.IntStream intStream38 = random37.ints();
        java.util.stream.LongStream longStream41 = random37.longs((long) 1, (long) 100);
        boolean boolean42 = random37.nextBoolean();
        java.util.stream.DoubleStream doubleStream46 = random37.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double47 = random37.nextDouble();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale36, random37);
        java.util.stream.DoubleStream doubleStream51 = random37.doubles((double) (-2506914755829807295L), (double) 100.0f);
        double double52 = random37.nextDouble();
        boolean boolean53 = random37.nextBoolean();
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        random37.nextBytes(byteArray60);
        random16.nextBytes(byteArray60);
        random0.nextBytes(byteArray60);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8070192887632792d + "'", double10 == 0.8070192887632792d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.12132157880957939d + "'", double11 == 0.12132157880957939d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(doubleStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.233850916832001d + "'", double20 == 1.233850916832001d);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1301414851 + "'", int30 == 1301414851);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream38);
        org.junit.Assert.assertNotNull(longStream41);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleStream46);
// flaky:         org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.8661495568218073d + "'", double47 == 0.8661495568218073d);
        org.junit.Assert.assertNotNull(doubleStream51);
// flaky:         org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.6779484906292997d + "'", double52 == 0.6779484906292997d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray60);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[46, 103, -21, -117, -23, 118]");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Lorem lorem6 = faker3.lorem();
        com.github.javafaker.Book book7 = faker3.book();
        com.github.javafaker.Code code8 = faker3.code();
        com.github.javafaker.DateAndTime dateAndTime9 = faker3.date();
        com.github.javafaker.Address address10 = faker3.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(address10);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        int int5 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((-5628450732286348115L), (double) (-8559505624165683602L), (double) 298326193485175253L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1284459642) + "'", int5 == (-1284459642));
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getDisplayVariant();
        java.lang.String str6 = locale2.getCountry();
        java.lang.String str8 = locale2.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DE" + "'", str6, "DE");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(5288735684466769752L);
        random0.setSeed(6964981429732325894L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs(6362497699505926577L, (long) 138015862);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02560752933194746d + "'", double4 == 0.02560752933194746d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1625205041123430819L) + "'", long5 == (-1625205041123430819L));
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Book book6 = faker4.book();
        com.github.javafaker.Lorem lorem7 = faker4.lorem();
        java.lang.String str9 = faker4.bothify("CAN");
        java.lang.String str11 = faker4.letterify("\uc911\uad6d");
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(book6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CAN" + "'", str9, "CAN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc911\uad6d" + "'", str11, "\uc911\uad6d");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getScript();
        java.lang.String str7 = locale0.getDisplayName(locale3);
        java.lang.String str8 = locale0.getDisplayCountry();
        java.lang.String str9 = locale0.getDisplayVariant();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chine" + "'", str5, "Chine");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str7, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        java.util.Collection<java.lang.String> strCollection73 = null;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection73);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.Locale.FilteringMode filteringMode82 = null;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList80, filteringMode82);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList80, filteringMode84);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList85);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        java.lang.String str17 = locale0.getISO3Country();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale22 = new java.util.Locale("Chine");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale22.getDisplayName(locale23);
        java.lang.String str26 = locale19.getDisplayName(locale22);
        java.lang.String str27 = locale0.getDisplayName(locale22);
        java.lang.String str28 = locale22.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = locale22.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for chine");
        } catch (java.util.MissingResourceException e) {
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHN" + "'", str17, "CHN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale22.toString(), "chine");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chine" + "'", str25, "chine");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "English (United States)" + "'", str26, "English (United States)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "chine" + "'", str28, "chine");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream14 = random1.ints(0L);
        int int15 = random1.nextInt();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4999044777851871d + "'", double11 == 0.4999044777851871d);
        org.junit.Assert.assertNotNull(intStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1503260451) + "'", int15 == (-1503260451));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale4.getDisplayName(locale9);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random13 = new java.util.Random();
        java.util.stream.IntStream intStream14 = random13.ints();
        java.util.stream.LongStream longStream17 = random13.longs((long) 1, (long) 100);
        boolean boolean18 = random13.nextBoolean();
        java.util.stream.DoubleStream doubleStream22 = random13.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream26 = random13.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long27 = random13.nextLong();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale12, random13);
        java.lang.String str29 = locale12.getDisplayCountry();
        java.lang.String str30 = locale12.getDisplayLanguage();
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(locale12);
        java.lang.String str32 = locale9.getDisplayLanguage(locale12);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale33.getVariant();
        java.lang.String str35 = locale12.getDisplayName(locale33);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (China)" + "'", str10, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(longStream26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-5867265534731657765L) + "'", long27 == (-5867265534731657765L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u56fd" + "'", str29, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u82f1\u6587" + "'", str32, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str35, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        java.lang.String str18 = locale1.getDisplayCountry();
        java.lang.String str19 = locale1.getDisplayLanguage();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale1);
        java.lang.String str23 = faker21.regexify("hi! (HI!,hi!)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1255515370058284659L + "'", long16 == 1255515370058284659L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd" + "'", str18, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! HI!,hi!" + "'", str23, "hi! HI!,hi!");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        random0.setSeed(3376856765316790501L);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number18 = faker17.number();
        java.lang.String str20 = faker17.numerify("chine");
        com.github.javafaker.Code code21 = faker17.code();
        com.github.javafaker.Options options22 = faker17.options();
        com.github.javafaker.Hacker hacker23 = faker17.hacker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = faker17.resolve("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1993679702838928d + "'", double4 == 0.1993679702838928d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9734474738078951d + "'", double6 == 0.9734474738078951d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.2958612967545633d + "'", double11 == 1.2958612967545633d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(number18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chine" + "'", str20, "chine");
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(hacker23);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        java.lang.String str14 = faker10.bothify("\u610f\u5927\u5229\u6587");
        com.github.javafaker.Lorem lorem15 = faker10.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str14, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(lorem15);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.util.Locale locale1 = new java.util.Locale("fran\347ais");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "fran\347ais");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream15 = random1.doubles((double) (-2506914755829807295L), (double) 100.0f);
        double double16 = random1.nextDouble();
        boolean boolean17 = random1.nextBoolean();
        java.util.stream.IntStream intStream19 = random1.ints((long) (short) 1);
        long long20 = random1.nextLong();
        java.util.stream.LongStream longStream21 = random1.longs();
        boolean boolean22 = random1.nextBoolean();
        double double23 = random1.nextDouble();
        double double24 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream26 = random1.ints((-1449199816650058695L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7251529688004696d + "'", double11 == 0.7251529688004696d);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8802005014674447d + "'", double16 == 0.8802005014674447d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4359341636071927997L + "'", long20 == 4359341636071927997L);
        org.junit.Assert.assertNotNull(longStream21);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.1137085531871771d + "'", double23 == 0.1137085531871771d);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5617655616651746d + "'", double24 == 0.5617655616651746d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = locale5.stripExtensions();
        java.lang.String str9 = locale8.getVariant();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.setLanguage("");
        java.util.Locale.Builder builder7 = builder1.setVariant("French");
        java.util.Locale.Builder builder9 = builder1.addUnicodeLocaleAttribute("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.util.Random random1 = new java.util.Random(396934139908905087L);
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setRegion("CA");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("French Canada");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder9.setUnicodeLocaleKeyword("cinese (Cina)", "french (canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: cinese (Cina) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en-gb", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        double double6 = random0.nextDouble();
        long long7 = random0.nextLong();
        float float8 = random0.nextFloat();
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 0, (double) '#');
        double double13 = random9.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random9.doubles();
        java.util.stream.IntStream intStream17 = random9.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream18 = random9.doubles();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random9.nextBytes(byteArray22);
        random0.nextBytes(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream27 = random0.longs(8651399998613895826L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.69932216f + "'", float5 == 0.69932216f);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.37689485665556444d + "'", double6 == 0.37689485665556444d);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5040810446080228660L + "'", long7 == 5040810446080228660L);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5683603f + "'", float8 == 0.5683603f);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6538136784240588d + "'", double13 == 0.6538136784240588d);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(byteArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[57, -44, -54]");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale1.getDisplayName(locale6);
        java.lang.String str14 = locale1.getDisplayVariant();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587\u4e2d\u56fd", "English", "\uc911\uad6d");
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
        java.util.Set<java.lang.String> strSet18 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale3.getDisplayScript(locale4);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587\u4e2d\u56fd\uc911\uad6d");
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
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        java.util.Locale.Builder builder15 = builder0.setLanguageTag("USA");
        java.util.Locale.Builder builder17 = builder0.setRegion("");
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale.Builder builder21 = builder0.setLocale(locale20);
        java.util.Locale.Builder builder22 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder0.setLanguage("it-IT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: it-IT [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getDisplayScript();
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Lorem lorem6 = faker3.lorem();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker3.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker3.phoneNumber();
        com.github.javafaker.Name name9 = faker3.name();
        java.lang.String str11 = faker3.letterify("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        com.github.javafaker.Address address12 = faker3.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str11, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str6 = locale3.getDisplayVariant(locale5);
        java.lang.String str7 = locale5.getCountry();
        java.lang.String str8 = locale0.getDisplayScript(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str4, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "US" + "'", str7, "US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Set<java.lang.String> strSet12 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet13 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale2.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        boolean boolean8 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles((-1.2526970094263166d), 0.9435467880282971d);
        java.util.stream.IntStream intStream12 = random0.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2031115616758892d + "'", double4 == 1.2031115616758892d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4415530470808510965L) + "'", long5 == (-4415530470808510965L));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.29469603f + "'", float6 == 0.29469603f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.util.Locale locale3 = new java.util.Locale("DE", "Chinese (Taiwan)", "\u4e2d\u570b");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u570b");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.util.Locale locale2 = new java.util.Locale("\u52a0\u62ff\u5927", "Chinesisch (Taiwan)");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "\u52a0\u62ff\u5927_CHINESISCH (TAIWAN)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHINESISCH (TAIWAN)" + "'", str3, "CHINESISCH (TAIWAN)");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime10 = faker9.date();
        com.github.javafaker.Book book11 = faker9.book();
        java.lang.String str13 = faker9.regexify("DEU");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.5453761185971504d) + "'", double4 == (-1.5453761185971504d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DEU" + "'", str13, "DEU");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setRegion("CA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        java.lang.String str18 = locale11.getDisplayVariant();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getDisplayCountry();
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = locale19.getVariant();
        java.lang.String str24 = locale19.getDisplayVariant();
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.getScript();
        java.lang.String str28 = locale26.getDisplayCountry();
        java.lang.String str29 = locale26.getDisplayCountry();
        java.lang.String str30 = locale26.getISO3Language();
        java.lang.String str31 = locale25.getDisplayLanguage(locale26);
        java.lang.String str32 = locale19.getDisplayLanguage(locale26);
        java.util.Locale locale33 = locale19.stripExtensions();
        java.lang.String str34 = locale11.getDisplayCountry(locale19);
        java.lang.String str35 = locale19.getISO3Country();
        java.lang.String str36 = locale19.getDisplayVariant();
        java.lang.String str37 = locale19.getISO3Language();
        java.lang.String str38 = locale19.getCountry();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str3, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str14, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\uc911\uad6d" + "'", str21, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\uc911\uad6d" + "'", str28, "\uc911\uad6d");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\uc911\uad6d" + "'", str29, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u82f1\u6587" + "'", str31, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u7f8e\u56fd" + "'", str34, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CHN" + "'", str35, "CHN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zho" + "'", str37, "zho");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CN" + "'", str38, "CN");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.util.Locale locale2 = new java.util.Locale("French", "Chinesisch (China)");
        java.lang.String str3 = locale2.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "french_CHINESISCH (CHINA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french" + "'", str3, "french");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.util.Random random1 = new java.util.Random(0L);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream5 = random1.longs((-4601747285168096166L), 8651399998613895826L);
        java.util.stream.IntStream intStream8 = random1.ints(163231460, 1301414851);
        java.util.stream.DoubleStream doubleStream9 = random1.doubles();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4962768465676381896L) + "'", long2 == (-4962768465676381896L));
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        int int14 = random0.nextInt();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random0);
        java.lang.String str17 = faker15.numerify("\u52a0\u62ff\u5927");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14735995897289988d + "'", double4 == 0.14735995897289988d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29546397 + "'", int14 == 29546397);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u52a0\u62ff\u5927" + "'", str17, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        double double10 = random0.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8797335867798544d + "'", double4 == 1.8797335867798544d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.687702438899273d + "'", double10 == 0.687702438899273d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setVariant("TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        com.github.javafaker.Company company4 = faker1.company();
        java.lang.String str6 = faker1.numerify("chinois");
        com.github.javafaker.Company company7 = faker1.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois" + "'", str6, "chinois");
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getVariant();
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale12.getDisplayName(locale14);
        boolean boolean16 = locale12.hasExtensions();
        java.lang.String str17 = locale1.getDisplayLanguage(locale12);
        java.lang.String str18 = locale12.getScript();
        java.lang.String str19 = locale12.getDisplayVariant();
        java.lang.String str20 = locale12.getDisplayCountry();
        java.lang.String str21 = locale0.getDisplayVariant(locale12);
        java.util.Set<java.lang.Character> charSet22 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str4, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str15, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "United States" + "'", str20, "United States");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.util.Locale locale2 = new java.util.Locale("fr_FR", "us_en-gb (FRENCH CANADA,en-gb)");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_fr_US_EN-GB (FRENCH CANADA,EN-GB)");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((long) 10);
        java.util.stream.DoubleStream doubleStream5 = random0.doubles(7192646009582446162L);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.getCountry();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "zh_CN");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.App app5 = faker3.app();
        java.lang.String str7 = faker3.bothify("Chinese (China)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese (China)" + "'", str7, "Chinese (China)");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.util.Locale locale2 = new java.util.Locale("", "\u53f0\u6e7e\u5730\u533a");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        java.lang.String str14 = locale0.getDisplayCountry();
        java.util.Locale locale15 = locale0.stripExtensions();
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale15.getDisplayName(locale17);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str3, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French (Canada)" + "'", str6, "French (Canada)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Etats-Unis" + "'", str9, "Etats-Unis");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u7f8e\u56fd" + "'", str12, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "United States" + "'", str14, "United States");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str20, "\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getUnicodeLocaleType("zh");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getVariant();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getScript();
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale9.getDisplayCountry(locale10);
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale13.getDisplayCountry(locale14);
        java.lang.String str17 = locale9.getDisplayCountry(locale13);
        java.lang.String str18 = locale5.getDisplayLanguage(locale9);
        java.lang.String str19 = locale5.getDisplayVariant();
        java.lang.String str20 = locale0.getDisplayCountry(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str20, "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder5 = builder1.setLanguage("");
        java.util.Locale.Builder builder7 = builder1.setVariant("French");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
            java.util.stream.IntStream intStream43 = random0.ints(252953418, (-2102836263));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5971390710521822d + "'", double4 == 0.5971390710521822d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-4996324458997573726L) + "'", long10 == (-4996324458997573726L));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6240757252124052019L + "'", long11 == 6240757252124052019L);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.6767331144287434d) + "'", double17 == (-0.6767331144287434d));
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream27);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.14316584969264531d) + "'", double28 == (-0.14316584969264531d));
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[5, -62, 64]");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem7 = faker6.lorem();
        com.github.javafaker.Business business8 = faker6.business();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15934571453041227d) + "'", double2 == (-0.15934571453041227d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5681084655238030915L) + "'", long4 == (-5681084655238030915L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.16130631734331297d) + "'", double5 == (-0.16130631734331297d));
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinesisch", 0.9129667732622676d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale4.getDisplayCountry(locale5);
        java.lang.String str8 = locale0.getDisplayCountry(locale4);
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.setLanguage("TW");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setRegion("cinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: cinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Color color5 = faker0.color();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.util.Random random1 = new java.util.Random((long) 180995420);
        boolean boolean2 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream3 = random1.doubles();
        java.util.stream.IntStream intStream5 = random1.ints(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getISO3Language();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.IntStream intStream6 = random5.ints();
        java.util.stream.LongStream longStream9 = random5.longs((long) 1, (long) 100);
        boolean boolean10 = random5.nextBoolean();
        java.util.stream.DoubleStream doubleStream14 = random5.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double15 = random5.nextDouble();
        double double16 = random5.nextDouble();
        java.util.stream.DoubleStream doubleStream17 = random5.doubles();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random5);
        double double19 = random5.nextGaussian();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Company company21 = faker20.company();
        com.github.javafaker.Finance finance22 = faker20.finance();
        com.github.javafaker.Address address23 = faker20.address();
        com.github.javafaker.Number number24 = faker20.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025747195034577897d + "'", double15 == 0.025747195034577897d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.04829156280058877d + "'", double16 == 0.04829156280058877d);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.42845082733520107d + "'", double19 == 0.42845082733520107d);
        org.junit.Assert.assertNotNull(company21);
        org.junit.Assert.assertNotNull(finance22);
        org.junit.Assert.assertNotNull(address23);
        org.junit.Assert.assertNotNull(number24);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Deutsch", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = null;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = locale24.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.lang.String str33 = locale32.toLanguageTag();
        java.util.Locale locale34 = locale32.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.lang.String str36 = locale35.getScript();
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale17, locale18, locale19, locale22, locale23, locale26, locale27, locale29, locale31, locale32, locale35 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale locale41 = java.util.Locale.lookup(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList38);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-CN" + "'", str30, "zh-CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertNotNull(localeList42);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream5 = random0.longs();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(0L);
        java.util.stream.IntStream intStream10 = random0.ints();
        java.util.stream.IntStream intStream13 = random0.ints((-1166459951), (-548720354));
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.util.Random random1 = new java.util.Random((-3019054096168434161L));
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.stream.LongStream longStream3 = random1.longs();
        long long4 = random1.nextLong();
        int int5 = random1.nextInt();
        float float6 = random1.nextFloat();
        double double7 = random1.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7314277685815190040L + "'", long4 == 7314277685815190040L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-22518881) + "'", int5 == (-22518881));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.98942643f + "'", float6 == 0.98942643f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.15855486003886599d + "'", double7 == 0.15855486003886599d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.util.Locale locale2 = new java.util.Locale("GBR", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String str3 = locale2.getDisplayScript();
        boolean boolean4 = locale2.hasExtensions();
        java.lang.String str5 = locale2.getScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.util.Random random1 = new java.util.Random(0L);
        java.util.stream.LongStream longStream4 = random1.longs((-6373964799784006388L), 230198249558090889L);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.util.Random random0 = new java.util.Random();
        long long1 = random0.nextLong();
        java.util.stream.LongStream longStream2 = random0.longs();
        long long3 = random0.nextLong();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        boolean boolean5 = random0.nextBoolean();
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 295511160887037347L + "'", long1 == 295511160887037347L);
        org.junit.Assert.assertNotNull(longStream2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1473539856933274396L) + "'", long3 == (-1473539856933274396L));
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.LongStream longStream18 = random0.longs(5288735684466769752L, 1L, (long) 100);
        int int20 = random0.nextInt(383222448);
        java.util.stream.IntStream intStream24 = random0.ints((long) 65, (int) '#', 180995420);
        java.util.stream.LongStream longStream28 = random0.longs(4694910222731363357L, (long) (-237246554), 7374027936914206806L);
        long long29 = random0.nextLong();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 361523860 + "'", int20 == 361523860);
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNotNull(longStream28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-6953815369613774618L) + "'", long29 == (-6953815369613774618L));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder9.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Code code8 = faker0.code();
        com.github.javafaker.Lorem lorem9 = faker0.lorem();
        com.github.javafaker.Finance finance10 = faker0.finance();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        double double10 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints(7975027329722967446L);
        java.util.stream.IntStream intStream15 = random0.ints((int) (short) 10, 352608531);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random0.longs((long) (-1881330214), (long) (-425688940), (long) (-1387462246));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6550000406235805d + "'", double4 == 1.6550000406235805d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.09520259397402522d + "'", double10 == 0.09520259397402522d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        java.util.stream.LongStream longStream8 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints(1967849453, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.1353943487190656d) + "'", double4 == (-1.1353943487190656d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-4762712239064352647L) + "'", long5 == (-4762712239064352647L));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.9867614f + "'", float6 == 0.9867614f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = locale0.stripExtensions();
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        boolean boolean12 = locale11.hasExtensions();
        java.lang.String str13 = locale11.getVariant();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "tw");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.util.Locale locale2 = new java.util.Locale("South Korea", "chine");
        java.util.Locale locale6 = new java.util.Locale("French (Canada)", "GB", "\u53f0\u7063");
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        org.junit.Assert.assertEquals(locale2.toString(), "south korea_CHINE");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.util.Locale locale2 = new java.util.Locale("ko", "ko");
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KO");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long14 = random0.nextLong();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Code code16 = faker15.code();
        java.lang.String str18 = faker15.regexify("kor_ZH_CN_ITA");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 8578693644335535471L + "'", long14 == 8578693644335535471L);
        org.junit.Assert.assertNotNull(code16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "kor_ZH_CN_ITA" + "'", str18, "kor_ZH_CN_ITA");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.DateAndTime dateAndTime3 = faker0.date();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getISO3Language();
        java.lang.String str5 = locale0.getLanguage();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        java.lang.String str10 = faker8.numerify("und");
        com.github.javafaker.Color color11 = faker8.color();
        com.github.javafaker.Name name12 = faker8.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u570b" + "'", str3, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "und" + "'", str10, "und");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.numerify("chinois");
        java.lang.String str7 = faker3.regexify("Chinesisch (China)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch China" + "'", str7, "Chinesisch China");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        java.lang.String str6 = faker1.numerify("China");
        com.github.javafaker.App app7 = faker1.app();
        java.lang.String str9 = faker1.numerify("fr-FR");
        com.github.javafaker.Number number10 = faker1.number();
        java.lang.String str12 = faker1.numerify("cn (ZHO,Chine)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "cn (ZHO,Chine)" + "'", str12, "cn (ZHO,Chine)");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc77c\ubcf8\uc5b4\uc77c\ubcf8)", 0.6559203532281705d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????? (??????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        double double14 = random0.nextDouble();
        double double15 = random0.nextGaussian();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.40411626681264917d) + "'", double4 == (-0.40411626681264917d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10455190205999243d + "'", double14 == 0.10455190205999243d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.909642641146104d + "'", double15 == 0.909642641146104d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Number number5 = faker0.number();
        java.lang.String str7 = faker0.letterify("chinois Chine");
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinois Chine" + "'", str7, "chinois Chine");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Address address8 = faker1.address();
        java.lang.String str10 = faker1.regexify("kor");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\uc911\uad6d\uc5b4\uc911\uad6d", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??????????????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u82f1\u570b", (-1.7624149545204317d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.7624149545204317");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        double double8 = languageRange1.getWeight();
        double double9 = languageRange1.getWeight();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime11 = faker10.date();
        com.github.javafaker.Address address12 = faker10.address();
        com.github.javafaker.Business business13 = faker10.business();
        com.github.javafaker.Code code14 = faker10.code();
        boolean boolean15 = languageRange1.equals((java.lang.Object) faker10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(address12);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        java.util.Set<java.lang.Character> charSet18 = locale11.getExtensionKeys();
        java.lang.String str19 = locale11.getISO3Language();
        java.util.Random random20 = new java.util.Random();
        java.util.stream.IntStream intStream21 = random20.ints();
        java.util.stream.LongStream longStream24 = random20.longs((long) 1, (long) 100);
        double double25 = random20.nextGaussian();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale11, random20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream28 = random20.ints((-4646435666753020269L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (Taiwan)" + "'", str14, "Chinesisch (Taiwan)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.014261002524701d + "'", double25 == 2.014261002524701d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream7 = random0.ints();
        long long8 = random0.nextLong();
        double double9 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream13 = random0.longs((long) (-739135946), (-8847754072134626552L), (-5808278507127081106L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8496960266972925d) + "'", double2 == (-0.8496960266972925d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4887525686788424772L) + "'", long4 == (-4887525686788424772L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.997497411223462d) + "'", double5 == (-0.997497411223462d));
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4094194216424278037L + "'", long8 == 4094194216424278037L);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.30655477582857943d + "'", double9 == 0.30655477582857943d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        java.lang.String str13 = faker10.bothify("Franz\366sisch (Frankreich)");
        com.github.javafaker.Company company14 = faker10.company();
        com.github.javafaker.Book book15 = faker10.book();
        com.github.javafaker.Business business16 = faker10.business();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker10.phoneNumber();
        com.github.javafaker.Internet internet18 = faker10.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(internet18);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale7 = locale0.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        com.github.javafaker.Company company11 = faker10.company();
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        java.lang.Class<?> wildcardClass13 = lorem12.getClass();
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
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str9, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        com.github.javafaker.Company company4 = faker0.company();
        com.github.javafaker.Code code5 = faker0.code();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setVariant("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.LongStream longStream4 = random1.longs((-2973136146954523582L), 4668688544456269390L);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Finance finance6 = faker5.finance();
        com.github.javafaker.Finance finance7 = faker5.finance();
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        com.github.javafaker.Color color4 = faker1.color();
        java.lang.String str6 = faker1.letterify("us_EN-GB");
        java.lang.String str8 = faker1.bothify("\uc911\uad6d");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us_EN-GB" + "'", str6, "us_EN-GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\uc911\uad6d" + "'", str8, "\uc911\uad6d");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        int int10 = random0.nextInt(163231460);
        long long11 = random0.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3479352239697839d + "'", double4 == 0.3479352239697839d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12405843 + "'", int10 == 12405843);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3578148033850764415L) + "'", long11 == (-3578148033850764415L));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale6 = new java.util.Locale("zh-CN", "Chinesisch (China)");
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getCountry();
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = locale11.getDisplayCountry(locale14);
        java.lang.String str19 = locale9.getDisplayScript(locale11);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale20);
        java.util.Random random25 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream28 = random25.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale20, random25);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.getVariant();
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = locale31.getDisplayName(locale33);
        boolean boolean35 = locale31.hasExtensions();
        java.lang.String str36 = locale20.getDisplayLanguage(locale31);
        java.lang.String str37 = locale11.getDisplayVariant(locale31);
        java.lang.String str38 = locale6.getDisplayName(locale11);
        java.lang.String str39 = locale6.getDisplayVariant();
        java.lang.String str40 = locale6.getDisplayCountry();
        java.lang.String str41 = locale0.getDisplayCountry(locale6);
        boolean boolean43 = locale0.equals((java.lang.Object) 0.40378652253098024d);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-TW" + "'", str1, "zh-TW");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale6.toString(), "zh-cn_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str8, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GB" + "'", str12, "GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-GB" + "'", str13, "en-GB");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u56fd" + "'", str18, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinesisch (Taiwan)" + "'", str23, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Chinesisch (Taiwan)" + "'", str34, "Chinesisch (Taiwan)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-cn (CHINESISCH (CHINA))" + "'", str38, "zh-cn (CHINESISCH (CHINA))");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CHINESISCH (CHINA)" + "'", str40, "CHINESISCH (CHINA)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Taiwan" + "'", str41, "Taiwan");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        double double6 = random0.nextDouble();
        random0.setSeed((long) (byte) 1);
        double double9 = random0.nextGaussian();
        double double10 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles(0L);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.2868526f + "'", float5 == 0.2868526f);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3662938864182158d + "'", double6 == 0.3662938864182158d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.561581040188955d + "'", double9 == 1.561581040188955d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.20771484130971707d + "'", double10 == 0.20771484130971707d);
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream8 = random0.longs(5610084966218005886L);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15127010581415348d + "'", double2 == 0.15127010581415348d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1914937344070252439L) + "'", long4 == (-1914937344070252439L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.33557579725071446d + "'", double5 == 0.33557579725071446d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker3.phoneNumber();
        com.github.javafaker.Color color8 = faker3.color();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker3.phoneNumber();
        com.github.javafaker.Name name10 = faker3.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(phoneNumber9);
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.util.Random random4 = new java.util.Random((-992460362189845646L));
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, random4);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder10 = builder6.setLanguage("");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguage("Chine");
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("fr-FR");
        java.util.Locale.Builder builder16 = builder10.setLocale(locale15);
        java.lang.String str17 = locale0.getDisplayCountry(locale15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str1, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Canada" + "'", str17, "Canada");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getVariant();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category5);
        java.util.Locale locale8 = java.util.Locale.getDefault(category5);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale.setDefault(category5, locale9);
        java.util.Locale locale14 = java.util.Locale.UK;
        java.lang.String str15 = locale9.getDisplayName(locale14);
        java.lang.String str16 = locale0.getDisplayScript(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u570b" + "'", str10, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u570b" + "'", str11, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.util.Locale.setDefault(category4, locale9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale16 = builder12.build();
        java.util.Locale locale18 = new java.util.Locale("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str19 = locale16.getDisplayLanguage(locale18);
        java.util.Locale.setDefault(category4, locale16);
        java.lang.String str21 = locale1.getDisplayVariant(locale16);
        java.util.Locale.setDefault(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale6.getDisplayName(locale8);
        boolean boolean10 = locale6.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale11.getDisplayVariant(locale13);
        java.lang.String str15 = locale6.getDisplayCountry(locale11);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.lang.String str18 = locale6.getDisplayCountry(locale16);
        java.lang.String str19 = locale6.getDisplayScript();
        java.util.Locale.Builder builder20 = builder4.setLocale(locale6);
        java.util.Locale.Builder builder21 = builder4.clear();
        java.util.Locale.Builder builder23 = builder21.setLanguage("");
        boolean boolean24 = languageRange1.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French (Canada)" + "'", str12, "French (Canada)");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Code code6 = faker1.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getScript();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale.setDefault(locale1);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale3.getScript();
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getLanguage();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getDisplayScript();
        java.lang.String str17 = locale13.getDisplayLanguage();
        java.lang.String str18 = locale11.getDisplayLanguage(locale13);
        java.util.Set<java.lang.Character> charSet19 = locale11.getExtensionKeys();
        java.lang.String str20 = locale3.getDisplayVariant(locale11);
        java.util.Random random21 = new java.util.Random();
        java.util.stream.IntStream intStream22 = random21.ints();
        java.util.stream.LongStream longStream25 = random21.longs((long) 1, (long) 100);
        boolean boolean26 = random21.nextBoolean();
        java.util.stream.DoubleStream doubleStream28 = random21.doubles(0L);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random21.nextBytes(byteArray32);
        double double34 = random21.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale3, random21);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message:  could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u6587" + "'", str18, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(longStream25);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[67, 69, 85]");
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.6108968805425427d + "'", double34 == 0.6108968805425427d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale6.getDisplayCountry();
        java.lang.String str10 = locale6.getISO3Language();
        java.lang.String str11 = locale6.getLanguage();
        java.util.Locale locale12 = java.util.Locale.ROOT;
        java.lang.String str13 = locale6.getDisplayScript(locale12);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale6);
        java.lang.String str15 = locale5.getDisplayVariant(locale6);
        java.lang.String str16 = locale5.getISO3Country();
        java.lang.Object obj17 = locale5.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        com.github.javafaker.Color color12 = faker10.color();
        com.github.javafaker.Code code13 = faker10.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        int int14 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream17 = random0.doubles((double) 1793234513106471552L, 2.2543611986458316d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.660919572609596d + "'", double4 == 1.660919572609596d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 545939837 + "'", int14 == 545939837);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "can_CN_en-gb");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        java.lang.String str18 = locale11.getDisplayVariant();
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.lang.String str21 = locale20.getISO3Language();
        java.lang.String str23 = locale20.getExtension('a');
        java.lang.String str24 = locale11.getDisplayVariant(locale20);
        java.lang.String str25 = locale11.getDisplayCountry();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale26.getDisplayName(locale28);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale26);
        java.util.Random random31 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream34 = random31.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale26, random31);
        java.util.Locale.setDefault(locale26);
        java.lang.String str39 = locale26.getExtension('a');
        java.lang.String str40 = locale26.getDisplayName();
        java.lang.String str41 = locale26.getScript();
        java.lang.String str42 = locale11.getDisplayVariant(locale26);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u56fd" + "'", str25, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinesisch (China)" + "'", str29, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream34);
        org.junit.Assert.assertNull(str39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str40, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.LongStream longStream4 = random1.longs((-2973136146954523582L), 4668688544456269390L);
        double double5 = random1.nextGaussian();
        java.util.stream.LongStream longStream8 = random1.longs((long) 175439095, (long) 1163371619);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7853314409882288d + "'", double5 == 1.7853314409882288d);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        java.util.stream.IntStream intStream16 = random0.ints(4668688544456269390L);
        java.util.stream.DoubleStream doubleStream18 = random0.doubles(637006123862331954L);
        long long19 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream20 = random0.doubles();
        double double21 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream25 = random0.doubles((-289425093418369874L), (double) (-2910596640445577867L), (-0.017286346332286196d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0472808333442731d + "'", double4 == 1.0472808333442731d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01579364419628393d + "'", double6 == 0.01579364419628393d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.8511555148677296d) + "'", double11 == (-0.8511555148677296d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1670440463389972725L + "'", long19 == 1670440463389972725L);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.4565762889560564d + "'", double21 == 0.4565762889560564d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("French Canada");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayScript();
        java.lang.String str7 = locale3.getDisplayName();
        java.lang.String str8 = locale1.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str7, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder10 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.addUnicodeLocaleAttribute("\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.setVariant("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Business business6 = faker5.business();
        java.lang.String str8 = faker5.bothify("China");
        com.github.javafaker.Book book9 = faker5.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinois" + "'", str4, "chinois");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
        java.util.Locale locale4 = new java.util.Locale("french", "koreanisch");
        boolean boolean5 = languageRange1.equals((java.lang.Object) "french");
        org.junit.Assert.assertEquals(locale4.toString(), "french_KOREANISCH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.IntStream intStream9 = random0.ints((int) '#', (int) 'x');
        java.util.stream.LongStream longStream12 = random0.longs((-5178629898742909992L), 298326193485175253L);
        java.util.stream.LongStream longStream13 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.778823817505616d + "'", double4 == 0.778823817505616d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u56fd", "US", "kor");
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u56fd_US_kor");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("Chine");
        java.util.Locale.Builder builder7 = builder4.setExtension('x', "eng");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("en");
        java.util.Locale locale10 = builder9.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.lang.String str14 = locale12.getCountry();
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale19 = new java.util.Locale("\u82f1\u570b", "French (Canada)", "German");
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale12.getDisplayCountry(locale19);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str11, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "US" + "'", str14, "US");
        org.junit.Assert.assertEquals(locale19.toString(), "\u82f1\u570b_FRENCH (CANADA)_German");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "United States" + "'", str21, "United States");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream8 = random0.doubles();
        float float9 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random0.ints(6964981429732325894L, 144490656, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.40383983f + "'", float9 == 0.40383983f);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale4.getDisplayCountry(locale5);
        java.lang.String str8 = locale0.getDisplayCountry(locale4);
        java.lang.String str9 = locale0.getISO3Language();
        java.lang.String str10 = locale0.getCountry();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getISO3Language();
        java.util.Random random15 = new java.util.Random();
        java.util.stream.IntStream intStream16 = random15.ints();
        java.util.stream.LongStream longStream19 = random15.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream20 = random15.longs();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale11, random15);
        java.lang.String str22 = locale0.getDisplayName(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale11.getUnicodeLocaleType("us_en-gb (FRENCH CANADA,en-gb)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: us_en-gb (FRENCH CANADA,en-gb)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CN" + "'", str10, "CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zho" + "'", str14, "zho");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(longStream20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str22, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Color color8 = faker0.color();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker3.phoneNumber();
        java.lang.String str9 = faker3.bothify("cn_TW_en-GB");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cn_TW_en-GB" + "'", str9, "cn_TW_en-GB");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Book book3 = faker0.book();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Address address5 = faker0.address();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        java.util.Random random9 = new java.util.Random();
        java.util.stream.IntStream intStream10 = random9.ints();
        java.util.stream.LongStream longStream13 = random9.longs((long) 1, (long) 100);
        boolean boolean14 = random9.nextBoolean();
        java.util.stream.DoubleStream doubleStream18 = random9.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream22 = random9.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream24 = random9.longs((long) (short) 0);
        java.util.stream.DoubleStream doubleStream26 = random9.doubles(1L);
        java.util.stream.IntStream intStream27 = random9.ints();
        boolean boolean28 = languageRange1.equals((java.lang.Object) intStream27);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Address address7 = faker0.address();
        com.github.javafaker.Address address8 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime9 = faker0.date();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(address8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale10.getCountry();
        java.lang.String str12 = locale10.getVariant();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale13.getVariant();
        java.lang.String str16 = locale10.getDisplayLanguage(locale13);
        java.lang.String str17 = locale13.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale13);
        java.lang.String str19 = locale13.getISO3Country();
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
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "\u6cd5\u56fd_US_kor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und-US-x-lvariant-kor" + "'", str14, "und-US-x-lvariant-kor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "kor" + "'", str15, "kor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "kor" + "'", str17, "kor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "USA" + "'", str19, "USA");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Hacker hacker6 = faker5.hacker();
        com.github.javafaker.Finance finance7 = faker5.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.util.Random random1 = new java.util.Random((-3019054096168434161L));
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.IntStream intStream4 = random3.ints();
        java.util.stream.LongStream longStream7 = random3.longs((long) 1, (long) 100);
        float float8 = random3.nextFloat();
        double double9 = random3.nextDouble();
        long long10 = random3.nextLong();
        float float11 = random3.nextFloat();
        java.util.Random random12 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream15 = random12.doubles((double) (byte) 0, (double) '#');
        double double16 = random12.nextGaussian();
        java.util.stream.DoubleStream doubleStream17 = random12.doubles();
        java.util.stream.IntStream intStream20 = random12.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream21 = random12.doubles();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random12.nextBytes(byteArray25);
        random3.nextBytes(byteArray25);
        random1.nextBytes(byteArray25);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.06352097f + "'", float8 == 0.06352097f);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7470603738186068d + "'", double9 == 0.7470603738186068d);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-8178048120084555266L) + "'", long10 == (-8178048120084555266L));
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.84580445f + "'", float11 == 0.84580445f);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.894996383543351d) + "'", double16 == (-2.894996383543351d));
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-51, -120, -127]");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Color color8 = faker0.color();
        com.github.javafaker.Options options9 = faker0.options();
        java.lang.String str11 = faker0.bothify("");
        com.github.javafaker.Internet internet12 = faker0.internet();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CA", 0.9815556691311073d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (China)" + "'", str4, "Chinese (China)");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.util.Random random1 = new java.util.Random((-7103792676836336750L));
        double double2 = random1.nextDouble();
        java.util.stream.IntStream intStream6 = random1.ints((long) 0, 1780165113, 2078819689);
        java.util.stream.IntStream intStream10 = random1.ints(0L, 26503786, 153976533);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6047640181605781d + "'", double2 == 0.6047640181605781d);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale3.getDisplayCountry(locale7);
        java.lang.String str10 = locale7.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream5 = random0.longs();
        double double6 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream8 = random0.longs((long) (-320670834));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8663139109091026d + "'", double6 == 0.8663139109091026d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.lang.String str4 = locale1.getLanguage();
        boolean boolean5 = locale1.hasExtensions();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.PhoneNumber phoneNumber7 = faker6.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale5 = locale2.stripExtensions();
        java.lang.String str6 = locale5.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "\u6cd5\u56fd_US_kor");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kor" + "'", str1, "kor");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u56fd (Vereinigte Staaten von Amerika,kor)" + "'", str3, "\u6cd5\u56fd (Vereinigte Staaten von Amerika,kor)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deutsch" + "'", str6, "Deutsch");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        java.util.Locale locale11 = new java.util.Locale("\u82f1\u6587");
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale13 = null;
        java.lang.String str14 = null; // flaky: locale11.getDisplayScript(locale13);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "\u82f1\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getScript();
        java.lang.String str9 = locale0.getDisplayName(locale5);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale10.getCountry();
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale10.getVariant();
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale5.getDisplayScript(locale10);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale18.getLanguage();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.lang.String str23 = locale20.getCountry();
        java.util.Set<java.lang.Character> charSet24 = locale20.getExtensionKeys();
        java.lang.String str25 = locale18.getDisplayCountry(locale20);
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale26.getDisplayName(locale28);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale26);
        java.util.Random random31 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream34 = random31.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random31);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale26, random31);
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale37.getVariant();
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.lang.String str40 = locale37.getDisplayName(locale39);
        boolean boolean41 = locale37.hasExtensions();
        java.lang.String str42 = locale26.getDisplayLanguage(locale37);
        java.lang.String str43 = locale37.getScript();
        java.util.Set<java.lang.Character> charSet44 = locale37.getExtensionKeys();
        java.lang.String str45 = locale20.getDisplayCountry(locale37);
        java.lang.String str46 = locale37.getISO3Country();
        java.lang.String str47 = locale37.toLanguageTag();
        java.lang.String str48 = locale10.getDisplayCountry(locale37);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str9, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GB" + "'", str11, "GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh" + "'", str19, "zh");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "TW" + "'", str23, "TW");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u570b" + "'", str25, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Deutsch (Deutschland)" + "'", str29, "Deutsch (Deutschland)");
        org.junit.Assert.assertNotNull(doubleStream34);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Deutsch (Deutschland)" + "'", str40, "Deutsch (Deutschland)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Deutsch" + "'", str42, "Deutsch");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Taiwan" + "'", str45, "Taiwan");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "DEU" + "'", str46, "DEU");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "de-DE" + "'", str47, "de-DE");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Vereinigtes K\366nigreich" + "'", str48, "Vereinigtes K\366nigreich");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.LongStream longStream4 = random0.longs();
        double double5 = random0.nextDouble();
        java.util.stream.LongStream longStream7 = random0.longs((long) 163231460);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream10 = random0.doubles(1.4482474945668726d, 0.9612199729238697d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4524286928752383d + "'", double2 == 0.4524286928752383d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0899325930977749d + "'", double5 == 0.0899325930977749d);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray13);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        long long16 = random0.nextLong();
        int int17 = random0.nextInt();
        boolean boolean18 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random0.doubles((-1.4669768631320368d), (double) 153976533);
        java.lang.Class<?> wildcardClass22 = doubleStream21.getClass();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.4772913928257474d) + "'", double4 == (-1.4772913928257474d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-19, 43, -27]");
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4859160464414101547L) + "'", long16 == (-4859160464414101547L));
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 716126412 + "'", int17 == 716126412);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\uc911\uad6d\uc5b4\uc911\uad6d", (double) 0.3663125f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????? ??????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream15 = random0.doubles(0.8372999373811125d, 1.1186852440711024d);
        random0.setSeed(1409958607731658842L);
        java.util.stream.DoubleStream doubleStream20 = random0.doubles((double) 0.87968004f, 1.7567643429255067d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6554578024657962d + "'", double4 == 0.6554578024657962d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(doubleStream20);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray13);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        long long16 = random0.nextLong();
        int int17 = random0.nextInt();
        boolean boolean18 = random0.nextBoolean();
        random0.setSeed(2801011361845611510L);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5993575056010005d) + "'", double4 == (-0.5993575056010005d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-120, 85, -20]");
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-7131277348426916699L) + "'", long16 == (-7131277348426916699L));
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1564862405 + "'", int17 == 1564862405);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.App app8 = faker1.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CAN");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "can" + "'", str3, "can");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "can" + "'", str4, "can");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.util.Locale locale1 = new java.util.Locale("chinois");
        java.lang.String str3 = locale1.getExtension('a');
        org.junit.Assert.assertEquals(locale1.toString(), "chinois");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Lorem lorem5 = faker3.lorem();
        com.github.javafaker.DateAndTime dateAndTime6 = faker3.date();
        java.lang.String str8 = faker3.numerify("Deutsch");
        com.github.javafaker.Company company9 = faker3.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deutsch" + "'", str8, "Deutsch");
        org.junit.Assert.assertNotNull(company9);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.DateAndTime dateAndTime5 = faker3.date();
        java.lang.String str7 = faker3.regexify("French (Canada)");
        java.lang.String str9 = faker3.regexify("\u6cd5\u56fd");
        com.github.javafaker.DateAndTime dateAndTime10 = faker3.date();
        java.lang.String str12 = faker3.numerify("\u82f1\u56fd");
        com.github.javafaker.Code code13 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French Canada" + "'", str7, "French Canada");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u56fd" + "'", str12, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
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
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.util.Locale locale2 = new java.util.Locale("us_en-gb (FRENCH CANADA,en-gb)", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        java.util.Random random3 = new java.util.Random();
        java.util.stream.IntStream intStream4 = random3.ints();
        java.util.stream.LongStream longStream7 = random3.longs((long) 1, (long) 100);
        boolean boolean8 = random3.nextBoolean();
        java.util.stream.DoubleStream doubleStream12 = random3.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream16 = random3.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream20 = random3.ints((long) 2109552831, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream24 = random3.doubles(1847242113680462994L, (double) 1, (double) 100);
        int int25 = random3.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale2, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: us_en-gb (french canada,en-gb)_?? (????) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1024415923) + "'", int25 == (-1024415923));
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.util.Random random1 = new java.util.Random((-8847754072134626552L));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguageTag("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder5.setExtension('u', "zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayCountry();
        java.lang.String str14 = locale10.getDisplayName();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale.Builder builder16 = builder9.setLocale(locale10);
        java.lang.String str17 = locale2.getDisplayScript(locale10);
        java.lang.String str18 = locale2.getLanguage();
        java.lang.Object obj19 = locale2.clone();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese (China)" + "'", str14, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.DoubleStream doubleStream15 = random1.doubles((double) (-2506914755829807295L), (double) 100.0f);
        double double16 = random1.nextDouble();
        boolean boolean17 = random1.nextBoolean();
        java.util.stream.IntStream intStream19 = random1.ints((long) (short) 1);
        boolean boolean20 = random1.nextBoolean();
        java.util.stream.LongStream longStream23 = random1.longs((-1779811016564306803L), (long) 30530634);
        double double24 = random1.nextDouble();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.44549698644581026d + "'", double11 == 0.44549698644581026d);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14724815691210846d + "'", double16 == 0.14724815691210846d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(longStream23);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.647433141388338d + "'", double24 == 0.647433141388338d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("SOUTH KOREA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.LongStream longStream18 = random0.longs(5288735684466769752L, 1L, (long) 100);
        float float19 = random0.nextFloat();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.29862136f + "'", float19 == 0.29862136f);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale10.getScript();
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale4.getDisplayName(locale10);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale16);
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale16.getDisplayVariant(locale20);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale20.getDisplayName(locale23);
        boolean boolean25 = locale23.hasExtensions();
        java.lang.String str26 = locale23.getISO3Language();
        java.lang.String str27 = locale10.getDisplayLanguage(locale23);
        java.util.Locale locale30 = new java.util.Locale("\uc77c\ubcf8\uc5b4\uc77c\ubcf8)", "\u82f1\u6587");
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder31.setVariant("");
        java.util.Locale.Builder builder36 = builder33.setExtension('u', "zh");
        java.util.Locale.Builder builder38 = builder33.setRegion("");
        java.util.Locale locale39 = builder38.build();
        java.lang.String str40 = locale30.getDisplayName(locale39);
        java.lang.String str41 = locale10.getDisplayVariant(locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = locale30.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinesisch" + "'", str12, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Koreanisch" + "'", str15, "Koreanisch");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese (China)" + "'", str24, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "German" + "'", str27, "German");
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587)" + "'", str40, "\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        java.lang.String str18 = locale1.getDisplayCountry();
        java.util.Locale locale19 = null;
        java.lang.String str20 = null; // flaky: locale1.getDisplayScript(locale19);
        java.lang.String str21 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-5849767711411433638L) + "'", long16 == (-5849767711411433638L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "China" + "'", str18, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CHN" + "'", str21, "CHN");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.lang.String str6 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getVariant();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.lang.String str5 = locale0.toLanguageTag();
        java.util.Random random6 = new java.util.Random();
        java.util.stream.IntStream intStream7 = random6.ints();
        java.util.stream.LongStream longStream10 = random6.longs((long) 1, (long) 100);
        boolean boolean11 = random6.nextBoolean();
        java.util.stream.DoubleStream doubleStream15 = random6.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream19 = random6.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream20 = random6.longs();
        java.util.stream.LongStream longStream24 = random6.longs(5288735684466769752L, 1L, (long) 100);
        java.util.stream.DoubleStream doubleStream26 = random6.doubles(442212515127344520L);
        java.util.stream.IntStream intStream28 = random6.ints(4417417182883005686L);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale0, random6);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(longStream20);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(intStream28);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("chinois");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh_CN", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        java.util.Locale.Builder builder10 = builder4.setLanguage("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder4.setExtension('a', "\u671d\u9c9c\u6587\u97e9\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ??? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("US", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("CAN");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category2);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getVariant();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        java.lang.String str8 = locale4.getDisplayLanguage(locale5);
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Collection<java.lang.String> strCollection11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = java.util.Locale.lookupTag(languageRangeList1, strCollection11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Deutsch" + "'", str8, "Deutsch");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayLanguage();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        java.util.Locale locale3 = new java.util.Locale("kor", "zh_CN", "ITA");
        java.lang.String str4 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "kor_ZH_CN_ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor-x-lvariant-ITA" + "'", str4, "kor-x-lvariant-ITA");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random12 = new java.util.Random();
        java.util.stream.IntStream intStream13 = random12.ints();
        java.util.stream.LongStream longStream16 = random12.longs((long) 1, (long) 100);
        boolean boolean17 = random12.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random12.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream25 = random12.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long26 = random12.nextLong();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale11, random12);
        java.lang.String str28 = locale11.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale11);
        java.lang.String str30 = locale11.getVariant();
        java.lang.Object obj31 = locale11.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(longStream25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2153007802911580241L + "'", long26 == 2153007802911580241L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd" + "'", str28, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "zh_CN");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.util.Locale locale1 = new java.util.Locale("fran\347ais (Chine,English (United States))");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Locale locale3 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "fran\347ais (chine,english (united states))");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais (chine,english (united states))");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.util.Locale locale1 = new java.util.Locale("china");
        org.junit.Assert.assertEquals(locale1.toString(), "china");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        long long13 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs(1088036184687952613L, 0L, (-4737254369196149287L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.08255961885864245d) + "'", double4 == (-0.08255961885864245d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.285458085817449d + "'", double6 == 0.285458085817449d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.30840453921431193d) + "'", double11 == (-0.30840453921431193d));
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-7708635442288322496L) + "'", long13 == (-7708635442288322496L));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Color color8 = faker0.color();
        com.github.javafaker.Options options9 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker0.phoneNumber();
        com.github.javafaker.Name name11 = faker0.name();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        com.github.javafaker.Finance finance7 = faker3.finance();
        com.github.javafaker.Options options8 = faker3.options();
        com.github.javafaker.App app9 = faker3.app();
        com.github.javafaker.Book book10 = faker3.book();
        com.github.javafaker.Options options11 = faker3.options();
        com.github.javafaker.Lorem lorem12 = faker3.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(app9);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getScript();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale7.getDisplayName(locale9);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale7);
        java.util.Random random12 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream15 = random12.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random12);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale7, random12);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale18.getVariant();
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale18.getDisplayName(locale20);
        boolean boolean22 = locale18.hasExtensions();
        java.lang.String str23 = locale7.getDisplayLanguage(locale18);
        java.lang.String str24 = locale18.getScript();
        java.util.Set<java.lang.Character> charSet25 = locale18.getExtensionKeys();
        java.lang.String str26 = locale18.getISO3Language();
        java.lang.String str27 = locale0.getDisplayLanguage(locale18);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setVariant("");
        java.util.Locale.Builder builder31 = builder30.clear();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale32.getVariant();
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.lang.String str35 = locale32.getDisplayName(locale34);
        boolean boolean36 = locale32.hasExtensions();
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str38 = locale37.getDisplayName();
        java.util.Locale locale39 = java.util.Locale.US;
        java.lang.String str40 = locale37.getDisplayVariant(locale39);
        java.lang.String str41 = locale32.getDisplayCountry(locale37);
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.lang.String str43 = locale42.toLanguageTag();
        java.lang.String str44 = locale32.getDisplayCountry(locale42);
        java.lang.String str45 = locale32.getDisplayScript();
        java.util.Locale.Builder builder46 = builder30.setLocale(locale32);
        java.util.Locale locale47 = builder46.build();
        java.util.Locale locale48 = builder46.build();
        boolean boolean49 = locale48.hasExtensions();
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.lang.String str51 = locale50.getScript();
        java.lang.String str52 = locale50.getDisplayCountry();
        java.lang.String str53 = locale50.toLanguageTag();
        java.lang.String str54 = locale50.getVariant();
        java.lang.String str55 = locale50.getDisplayVariant();
        java.lang.String str56 = locale50.getDisplayLanguage();
        java.lang.String str57 = locale48.getDisplayVariant(locale50);
        java.lang.String str58 = locale18.getDisplayCountry(locale48);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deutsch (Deutschland)" + "'", str10, "Deutsch (Deutschland)");
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Deutsch (Deutschland)" + "'", str21, "Deutsch (Deutschland)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Deutsch" + "'", str23, "Deutsch");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "deu" + "'", str26, "deu");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Englisch" + "'", str27, "Englisch");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Deutsch (Deutschland)" + "'", str35, "Deutsch (Deutschland)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str38, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Allemagne" + "'", str41, "Allemagne");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u5fb7\u56fd" + "'", str44, "\u5fb7\u56fd");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u4e2d\u56fd" + "'", str52, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh-CN" + "'", str53, "zh-CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u6587" + "'", str56, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Deutschland" + "'", str58, "Deutschland");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.toLanguageTag();
        java.util.Locale locale9 = locale5.stripExtensions();
        java.lang.String str10 = locale4.getDisplayName(locale5);
        java.lang.String str11 = locale5.getScript();
        java.lang.String str12 = locale0.getDisplayVariant(locale5);
        boolean boolean14 = locale5.equals((java.lang.Object) (-5867265534731657765L));
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str10, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Options options6 = faker0.options();
        com.github.javafaker.App app7 = faker0.app();
        com.github.javafaker.Name name8 = faker0.name();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale2);
        com.github.javafaker.DateAndTime dateAndTime5 = faker4.date();
        java.lang.String str7 = faker4.regexify("fran\347ais");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais" + "'", str7, "fran\347ais");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        java.util.Collection<java.lang.String> strCollection73 = null;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap75 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap75);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
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
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeList76);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Random random4 = new java.util.Random();
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream9 = random4.longs();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random4);
        java.lang.String str11 = locale0.getDisplayCountry();
        java.util.Locale locale14 = new java.util.Locale("fr_CA", "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getCountry();
        java.lang.String str17 = locale15.getVariant();
        java.lang.String str18 = locale15.getVariant();
        java.util.Locale locale19 = locale15.stripExtensions();
        java.util.Locale.setDefault(locale19);
        java.lang.String str21 = locale14.getDisplayScript(locale19);
        java.lang.String str22 = locale0.getDisplayLanguage(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_ZH_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chinese" + "'", str22, "Chinese");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        random0.setSeed(3376856765316790501L);
        java.util.stream.LongStream longStream17 = random0.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream19 = random0.doubles((-4964420948893066024L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.17707740202692077d) + "'", double4 == (-0.17707740202692077d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.39343052254970245d + "'", double6 == 0.39343052254970245d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.5505089149944585d) + "'", double11 == (-0.5505089149944585d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.IntStream intStream9 = random0.ints((int) '#', (int) 'x');
        float float10 = random0.nextFloat();
        java.util.stream.IntStream intStream12 = random0.ints(2735277389973397399L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random0.longs((long) 1871411587, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.1919695134219048d) + "'", double4 == (-0.1919695134219048d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.6498055f + "'", float10 == 0.6498055f);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        java.lang.String str5 = locale2.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_CN" + "'", str4, "zh_CN");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.util.Locale locale3 = new java.util.Locale("CN", "TW", "en-GB");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("\uc911\uad6d\uc5b4\uc911\uad6d)", "us", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale3.getDisplayLanguage(locale8);
        org.junit.Assert.assertEquals(locale3.toString(), "cn_TW_en-GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TWN" + "'", str4, "TWN");
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cn" + "'", str10, "cn");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Locale locale7 = locale0.stripExtensions();
        java.lang.String str8 = locale0.getDisplayName();
        java.lang.String str9 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italienisch" + "'", str3, "Italienisch");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano" + "'", str8, "italiano");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        java.lang.String str18 = locale1.getDisplayCountry();
        java.lang.String str19 = locale1.getDisplayLanguage();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Code code21 = faker20.code();
        java.lang.String str23 = faker20.letterify("US");
        com.github.javafaker.Code code24 = faker20.code();
        com.github.javafaker.DateAndTime dateAndTime25 = faker20.date();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-624091589576239498L) + "'", long16 == (-624091589576239498L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cina" + "'", str18, "Cina");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "cinese" + "'", str19, "cinese");
        org.junit.Assert.assertNotNull(code21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "US" + "'", str23, "US");
        org.junit.Assert.assertNotNull(code24);
        org.junit.Assert.assertNotNull(dateAndTime25);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale locale5 = builder2.build();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.lang.String str10 = locale6.getDisplayVariant(locale7);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale7);
        java.util.Locale.Builder builder12 = builder2.setLocale(locale7);
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = locale13.stripExtensions();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale13);
        com.github.javafaker.PhoneNumber phoneNumber17 = faker16.phoneNumber();
        com.github.javafaker.Hacker hacker18 = faker16.hacker();
        com.github.javafaker.Name name19 = faker16.name();
        com.github.javafaker.DateAndTime dateAndTime20 = faker16.date();
        java.lang.String str22 = faker16.letterify("de-DE");
        com.github.javafaker.Number number23 = faker16.number();
        com.github.javafaker.Finance finance24 = faker16.finance();
        java.lang.String str26 = faker16.regexify("China");
        boolean boolean27 = locale7.equals((java.lang.Object) "China");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(hacker18);
        org.junit.Assert.assertNotNull(name19);
        org.junit.Assert.assertNotNull(dateAndTime20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "de-DE" + "'", str22, "de-DE");
        org.junit.Assert.assertNotNull(number23);
        org.junit.Assert.assertNotNull(finance24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "China" + "'", str26, "China");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
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
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale4);
        java.util.Locale.Builder builder15 = builder1.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder1.setRegion("\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (??)_??_zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italienisch" + "'", str7, "Italienisch");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "francese (Canada)" + "'", str10, "francese (Canada)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.getISO3Language();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Locale locale13 = locale11.stripExtensions();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale11);
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale11.getDisplayVariant(locale15);
        java.lang.String str18 = locale8.getDisplayScript(locale15);
        java.util.Locale locale19 = locale8.stripExtensions();
        java.lang.String str20 = locale6.getDisplayLanguage(locale19);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale19);
        java.lang.String str22 = locale19.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cina" + "'", str16, "Cina");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        boolean boolean4 = locale3.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        java.util.Set<java.lang.Character> charSet9 = locale7.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.IntStream intStream8 = random3.ints();
        double double9 = random3.nextDouble();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        double double11 = random3.nextDouble();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.4610813617608034d) + "'", double7 == (-1.4610813617608034d));
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3797534746699882d + "'", double9 == 0.3797534746699882d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.014365404397482906d + "'", double11 == 0.014365404397482906d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        com.github.javafaker.Code code18 = faker17.code();
        com.github.javafaker.Address address19 = faker17.address();
        com.github.javafaker.Hacker hacker20 = faker17.hacker();
        com.github.javafaker.Finance finance21 = faker17.finance();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4320550077698378052L + "'", long16 == 4320550077698378052L);
        org.junit.Assert.assertNotNull(code18);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(hacker20);
        org.junit.Assert.assertNotNull(finance21);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.util.Locale locale2 = new java.util.Locale("\u52a0\u62ff\u5927", "SOUTH KOREA");
        org.junit.Assert.assertEquals(locale2.toString(), "\u52a0\u62ff\u5927_SOUTH KOREA");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        int int5 = random0.nextInt();
        double double6 = random0.nextDouble();
        java.util.stream.LongStream longStream8 = random0.longs(4866830066007149675L);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-393329121) + "'", int5 == (-393329121));
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6299083806093635d + "'", double6 == 0.6299083806093635d);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        java.lang.String str9 = faker3.bothify("zh-CN");
        com.github.javafaker.Code code10 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("fra");
        java.util.Locale.Builder builder9 = builder5.addUnicodeLocaleAttribute("China");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        double double2 = random1.nextGaussian();
        java.util.stream.LongStream longStream3 = random1.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random1.ints((-2160845307588996726L), 0, 1643907849);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561581040188955d + "'", double2 == 1.561581040188955d);
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayName(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale4.getDisplayVariant(locale8);
        java.lang.String str10 = locale2.getDisplayScript(locale4);
        java.lang.String str11 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale2.getDisplayLanguage(locale13);
        java.lang.String str17 = locale2.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese" + "'", str7, "cinese");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "South Korea" + "'", str11, "South Korea");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u82f1\u6587" + "'", str16, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.DateAndTime dateAndTime5 = faker3.date();
        java.lang.String str7 = faker3.regexify("French (Canada)");
        java.lang.String str9 = faker3.regexify("\u6cd5\u56fd");
        com.github.javafaker.DateAndTime dateAndTime10 = faker3.date();
        java.lang.String str12 = faker3.numerify("\u82f1\u56fd");
        com.github.javafaker.Name name13 = faker3.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French Canada" + "'", str7, "French Canada");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u56fd" + "'", str12, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(name13);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
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
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList37);
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
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode76 = null;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet75, filteringMode76);
        java.lang.String str78 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet75);
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet81 = locale79.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap83);
        java.util.Locale locale86 = java.util.Locale.forLanguageTag("fra");
        java.util.Set<java.lang.Character> charSet87 = locale86.getExtensionKeys();
        java.util.Locale locale88 = locale86.stripExtensions();
        java.util.Set<java.lang.String> strSet89 = locale88.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet89);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap91 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap91);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap93 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList94 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap93);
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it");
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
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fra");
        org.junit.Assert.assertNotNull(charSet87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "fra");
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(languageRangeList92);
        org.junit.Assert.assertNotNull(languageRangeList94);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertNotNull(name3);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((long) 383222448, 0.0d, (double) (short) 10);
        java.util.Random random12 = new java.util.Random((-3766658403371850995L));
        java.util.Random random13 = new java.util.Random();
        java.util.stream.IntStream intStream14 = random13.ints();
        java.util.stream.LongStream longStream17 = random13.longs((long) 1, (long) 100);
        float float18 = random13.nextFloat();
        double double19 = random13.nextDouble();
        long long20 = random13.nextLong();
        float float21 = random13.nextFloat();
        java.util.Random random22 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream25 = random22.doubles((double) (byte) 0, (double) '#');
        double double26 = random22.nextGaussian();
        java.util.stream.DoubleStream doubleStream27 = random22.doubles();
        java.util.stream.IntStream intStream30 = random22.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream31 = random22.doubles();
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random22.nextBytes(byteArray35);
        random13.nextBytes(byteArray35);
        random12.nextBytes(byteArray35);
        random0.nextBytes(byteArray35);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8494719178678656d + "'", double4 == 0.8494719178678656d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6931458024080884590L + "'", long5 == 6931458024080884590L);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.33853465f + "'", float6 == 0.33853465f);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(longStream17);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.50151f + "'", float18 == 0.50151f);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.4273015358043889d + "'", double19 == 0.4273015358043889d);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-505757943941320275L) + "'", long20 == (-505757943941320275L));
// flaky:         org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.85952485f + "'", float21 == 0.85952485f);
        org.junit.Assert.assertNotNull(doubleStream25);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6999794419210932d + "'", double26 == 0.6999794419210932d);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(byteArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-37, -88, 110]");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("en", "CHINESISCH CHINA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: CHINESISCH CHINA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        com.github.javafaker.Code code12 = faker10.code();
        java.lang.String str14 = faker10.bothify("");
        com.github.javafaker.App app15 = faker10.app();
        com.github.javafaker.Book book16 = faker10.book();
        com.github.javafaker.PhoneNumber phoneNumber17 = faker10.phoneNumber();
        com.github.javafaker.Name name18 = faker10.name();
        com.github.javafaker.PhoneNumber phoneNumber19 = faker10.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(app15);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNotNull(phoneNumber17);
        org.junit.Assert.assertNotNull(name18);
        org.junit.Assert.assertNotNull(phoneNumber19);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Franz\366sisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Franzo?sisch (Kanada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        int int10 = random0.nextInt(163231460);
        boolean boolean11 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(442212515127344520L);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles((long) '4');
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.31141189369822364d) + "'", double4 == (-0.31141189369822364d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 95090744 + "'", int10 == 95090744);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Business business7 = faker3.business();
        com.github.javafaker.Address address8 = faker3.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Deutsch");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.clear();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale8.toLanguageTag();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder14 = builder12.setLanguage("en");
        java.util.Locale locale15 = java.util.Locale.UK;
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale17);
        java.lang.String str19 = locale15.getDisplayVariant(locale17);
        java.util.Locale.Builder builder20 = builder12.setLocale(locale15);
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        boolean boolean23 = languageRange1.equals((java.lang.Object) builder22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deutsch" + "'", str2, "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deutsch" + "'", str3, "deutsch");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GB" + "'", str16, "GB");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder10 = builder7.setExtension('a', "de_DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.removeUnicodeLocaleAttribute("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: English (United Kingdom) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder1.build();
        java.util.Locale locale5 = builder1.build();
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("GBR");
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.DateAndTime dateAndTime4 = faker0.date();
        java.lang.String str6 = faker0.letterify("fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi! (HI!,hi!)");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.DateAndTime dateAndTime7 = faker3.date();
        java.lang.String str9 = faker3.letterify("de-DE");
        com.github.javafaker.Number number10 = faker3.number();
        com.github.javafaker.Book book11 = faker3.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de-DE" + "'", str9, "de-DE");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.addUnicodeLocaleAttribute("cn_TW_en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: cn_TW_en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale5);
        java.lang.String str10 = locale5.getDisplayScript();
        java.lang.String str11 = locale5.getDisplayCountry();
        java.util.Locale locale12 = locale5.stripExtensions();
        java.util.Random random13 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream16 = random13.doubles((double) (byte) 0, (double) '#');
        double double17 = random13.nextGaussian();
        java.util.stream.DoubleStream doubleStream18 = random13.doubles();
        java.util.stream.IntStream intStream21 = random13.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream22 = random13.doubles();
        long long23 = random13.nextLong();
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale12, random13);
        java.util.Set<java.lang.String> strSet25 = locale12.getUnicodeLocaleKeys();
        java.lang.String str26 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet25);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinesisch (China)" + "'", str8, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(doubleStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.5117005911144554d + "'", double17 == 1.5117005911144554d);
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(doubleStream22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-8007806582845254299L) + "'", long23 == (-8007806582845254299L));
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "");
        java.util.Locale locale6 = builder0.build();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale6.getISO3Country();
        java.lang.String str9 = locale6.getLanguage();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.util.Locale locale3 = new java.util.Locale("und", "\u5fb7\u6587", "fr_FR");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u5fb7\u6587_fr_FR");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale0.getDisplayVariant(locale7);
        java.util.Locale locale13 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        java.lang.String str14 = locale0.getDisplayName(locale13);
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 0, (double) '#');
        double double19 = random15.nextGaussian();
        java.util.stream.DoubleStream doubleStream20 = random15.doubles();
        boolean boolean21 = random15.nextBoolean();
        int int23 = random15.nextInt((int) (short) 1);
        java.util.stream.DoubleStream doubleStream24 = random15.doubles();
        float float25 = random15.nextFloat();
        double double26 = random15.nextGaussian();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale0, random15);
        com.github.javafaker.Number number28 = faker27.number();
        com.github.javafaker.Address address29 = faker27.address();
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
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese (China)" + "'", str14, "Chinese (China)");
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.4966475440911727d) + "'", double19 == (-0.4966475440911727d));
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.50221765f + "'", float25 == 0.50221765f);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.6219121816383889d) + "'", double26 == (-0.6219121816383889d));
        org.junit.Assert.assertNotNull(number28);
        org.junit.Assert.assertNotNull(address29);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getDisplayScript();
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random11 = new java.util.Random();
        java.util.stream.IntStream intStream12 = random11.ints();
        java.util.stream.LongStream longStream15 = random11.longs((long) 1, (long) 100);
        boolean boolean16 = random11.nextBoolean();
        java.util.stream.DoubleStream doubleStream20 = random11.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream24 = random11.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long25 = random11.nextLong();
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale10, random11);
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = locale27.stripExtensions();
        java.lang.String str30 = locale29.getLanguage();
        java.lang.String str31 = locale10.getDisplayLanguage(locale29);
        java.lang.String str32 = locale10.getISO3Language();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale34 = java.util.Locale.getDefault(category0);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.lang.String str36 = locale35.getScript();
        java.lang.String str37 = locale35.getDisplayCountry();
        java.lang.String str38 = locale35.getDisplayCountry();
        java.lang.String str39 = locale35.getDisplayScript();
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.lang.String str41 = locale40.toLanguageTag();
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.lang.String str43 = locale40.getDisplayVariant(locale42);
        java.lang.String str44 = locale35.getDisplayLanguage(locale42);
        java.util.Locale.setDefault(category0, locale42);
        java.util.Locale locale49 = new java.util.Locale("francese (Canada)", "fran\347ais (Canada)", "hi! (HI!,hi!)");
        java.util.Locale.setDefault(category0, locale49);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(longStream24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1078716816771301165L + "'", long25 == 1078716816771301165L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh" + "'", str30, "zh");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u6587" + "'", str31, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zho" + "'", str32, "zho");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u56fd" + "'", str37, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u4e2d\u56fd" + "'", str38, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh-CN" + "'", str41, "zh-CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str44, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals(locale49.toString(), "francese (canada)_FRAN\347AIS (CANADA)_hi! (HI!,hi!)");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        java.lang.String str3 = faker0.letterify("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker0.resolve("can");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
        java.util.Locale locale12 = builder1.build();
        java.util.Locale.Builder builder14 = builder1.setLanguageTag("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder1.removeUnicodeLocaleAttribute("en_us");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_us [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setLanguageTag("\u7f8e\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.util.Locale locale3 = new java.util.Locale("French (Canada)", "GB", "\u53f0\u7063");
        java.util.Locale locale7 = new java.util.Locale("kor", "zh_CN", "ITA");
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        java.lang.String str10 = locale7.getExtension('u');
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u53f0\u7063");
        org.junit.Assert.assertEquals(locale7.toString(), "kor_ZH_CN_ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United Kingdom" + "'", str8, "United Kingdom");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("french");
        java.util.Locale locale11 = builder7.build();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CA", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale3.getDisplayName(locale5);
        boolean boolean7 = locale3.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        java.lang.String str12 = locale3.getDisplayCountry(locale8);
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale3.getDisplayCountry(locale13);
        java.lang.String str16 = locale3.getISO3Language();
        java.util.Set<java.lang.String> strSet17 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet17);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (China)" + "'", str6, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chine" + "'", str12, "Chine");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = builder0.build();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.toLanguageTag();
        java.lang.String str10 = locale7.getDisplayName(locale8);
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale8.getDisplayVariant(locale12);
        java.lang.String str14 = locale6.getDisplayScript(locale8);
        java.lang.String str15 = locale8.getISO3Language();
        java.util.Locale.Builder builder16 = builder0.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setRegion("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Deutschland [at index 0]");
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
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str10, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.LongStream longStream13 = random0.longs();
        random0.setSeed((long) 163231460);
        int int17 = random0.nextInt(68);
        double double18 = random0.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.4463563599673908d) + "'", double4 == (-0.4463563599673908d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5313795117233518d + "'", double6 == 0.5313795117233518d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9407901667975651d + "'", double11 == 0.9407901667975651d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8210113784198152d + "'", double18 == 0.8210113784198152d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale5.getDisplayLanguage();
        java.lang.Object obj10 = locale5.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese" + "'", str4, "Chinese");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "it_IT");
    }
}
