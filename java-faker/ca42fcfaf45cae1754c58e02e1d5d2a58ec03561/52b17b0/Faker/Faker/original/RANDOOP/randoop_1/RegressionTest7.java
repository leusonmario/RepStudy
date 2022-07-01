import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.util.Random random1 = new java.util.Random(0L);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream5 = random1.longs((-4601747285168096166L), 8651399998613895826L);
        java.util.stream.IntStream intStream8 = random1.ints(163231460, 1301414851);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4962768465676381896L) + "'", long2 == (-4962768465676381896L));
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder10 = builder6.setExtension('a', "zho");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        java.lang.String str17 = locale5.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("\uc911\uad6d\uc5b4\uc911\uad6d)", "DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ???????? (??????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        random0.setSeed((-4476219991092281892L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream26 = random0.ints((-7913575419999774973L), 2109552831, (-1640251449));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.20026492507242008d) + "'", double9 == (-0.20026492507242008d));
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[92, 102, -68]");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((long) 1, 0.0d, 0.2778323727493555d);
        boolean boolean8 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        java.util.Set<java.lang.String> strSet13 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object obj14 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3195292591691712d + "'", double11 == 0.3195292591691712d);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "zh_TW");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.Business business7 = faker3.business();
        java.lang.String str9 = faker3.bothify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str11 = faker3.letterify("zh");
        java.lang.String str13 = faker3.regexify("fr-CA");
        com.github.javafaker.Options options14 = faker3.options();
        com.github.javafaker.App app15 = faker3.app();
        com.github.javafaker.Business business16 = faker3.business();
        com.github.javafaker.Color color17 = faker3.color();
        java.lang.String str19 = faker3.letterify("en_GB");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr-CA" + "'", str13, "fr-CA");
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(app15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en_GB" + "'", str19, "en_GB");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale4);
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 0, (double) '#');
        double double13 = random9.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random9.doubles();
        double double15 = random9.nextDouble();
        java.util.stream.IntStream intStream19 = random9.ints(100L, (-1), (int) (byte) 0);
        double double20 = random9.nextGaussian();
        java.util.stream.IntStream intStream21 = random9.ints();
        java.util.stream.LongStream longStream22 = random9.longs();
        random9.setSeed(100L);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale4, random9);
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 0, (double) '#');
        double double30 = random26.nextGaussian();
        java.util.stream.DoubleStream doubleStream31 = random26.doubles();
        double double32 = random26.nextDouble();
        java.util.Random random33 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream36 = random33.doubles((double) (byte) 0, (double) '#');
        double double37 = random33.nextGaussian();
        java.util.stream.DoubleStream doubleStream38 = random33.doubles();
        java.util.stream.IntStream intStream41 = random33.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker42 = new com.github.javafaker.Faker(random33);
        java.util.stream.LongStream longStream43 = random33.longs();
        java.util.Random random44 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream47 = random44.doubles((double) (byte) 0, (double) '#');
        double double48 = random44.nextGaussian();
        java.util.stream.DoubleStream doubleStream49 = random44.doubles();
        java.util.stream.IntStream intStream52 = random44.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream53 = random44.doubles();
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random44.nextBytes(byteArray57);
        random33.nextBytes(byteArray57);
        random26.nextBytes(byteArray57);
        random9.nextBytes(byteArray57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream65 = random9.longs((long) (-320670834), 5589534223977979361L, (-7703961699269429341L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-GB" + "'", str6, "en-GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (Taiwan)" + "'", str8, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2666762082528173d + "'", double13 == 0.2666762082528173d);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5441507362839303d + "'", double15 == 0.5441507362839303d);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.31333993152369166d + "'", double20 == 0.31333993152369166d);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertNotNull(doubleStream29);
// flaky:         org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-2.8144103251897703d) + "'", double30 == (-2.8144103251897703d));
        org.junit.Assert.assertNotNull(doubleStream31);
// flaky:         org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.46571440986256285d + "'", double32 == 0.46571440986256285d);
        org.junit.Assert.assertNotNull(doubleStream36);
// flaky:         org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.7277290479804205d + "'", double37 == 0.7277290479804205d);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(longStream43);
        org.junit.Assert.assertNotNull(doubleStream47);
// flaky:         org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.19259382348603668d + "'", double48 == 0.19259382348603668d);
        org.junit.Assert.assertNotNull(doubleStream49);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertNotNull(doubleStream53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-42, -97, -43]");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setUnicodeLocaleKeyword("GBR", "Royaume-Uni");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: GBR [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh", 0.720817244999118d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random0.ints((-2991834765914892697L), 1768373182, (-2102836263));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.376497823468864d + "'", double4 == 1.376497823468864d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0824827894560245d) + "'", double9 == (-0.0824827894560245d));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-760406241) + "'", int10 == (-760406241));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.08311289596512858d) + "'", double11 == (-0.08311289596512858d));
        org.junit.Assert.assertNotNull(doubleStream12);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        com.github.javafaker.Address address15 = faker10.address();
        java.lang.String str17 = faker10.letterify("chinese");
        com.github.javafaker.Number number18 = faker10.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(address15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chinese" + "'", str17, "chinese");
        org.junit.Assert.assertNotNull(number18);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("US");
        java.lang.String str2 = locale1.getCountry();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.DoubleStream doubleStream8 = random3.doubles();
        java.util.stream.LongStream longStream12 = random3.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream14 = random3.doubles(4668688544456269390L);
        java.util.stream.DoubleStream doubleStream17 = random3.doubles(0.0d, (double) 0.9336807f);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: us could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "us");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.28470968105045685d) + "'", double7 == (-0.28470968105045685d));
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        double double4 = random0.nextGaussian();
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream6 = random0.ints();
        boolean boolean7 = random0.nextBoolean();
        random0.setSeed((-8318094040620902680L));
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3012105588293257d) + "'", double2 == (-1.3012105588293257d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.218804647187326d + "'", double4 == 2.218804647187326d);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.69870204f + "'", float5 == 0.69870204f);
        org.junit.Assert.assertNotNull(intStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.lang.String str20 = locale17.getDisplayName(locale18);
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder22 = builder16.setLocale(locale18);
        java.lang.String str23 = locale18.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u570b" + "'", str6, "\u4e2d\u570b");
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str20, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(builder22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str23, "\u4e2d\u6587\u4e2d\u570b)");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        java.util.stream.LongStream longStream16 = random0.longs((long) 173393359, (long) 265686403);
        java.util.stream.IntStream intStream19 = random0.ints((-1881330214), (int) 'a');
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.3649987608513157d) + "'", double4 == (-1.3649987608513157d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.util.Locale locale2 = new java.util.Locale("South Korea", "chine");
        java.util.Locale locale4 = new java.util.Locale("\u53f0\u7063");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "south korea_CHINE");
        org.junit.Assert.assertEquals(locale4.toString(), "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        java.lang.String str8 = faker3.letterify("Chine");
        com.github.javafaker.Name name9 = faker3.name();
        com.github.javafaker.App app10 = faker3.app();
        com.github.javafaker.Company company11 = faker3.company();
        com.github.javafaker.Business business12 = faker3.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.util.Locale locale2 = new java.util.Locale("\u5fb7\u6587", "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertEquals(locale2.toString(), "\u5fb7\u6587_ENGLISCH (VEREINIGTE STAATEN VON AMERIKA)");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        java.lang.String str7 = faker4.letterify("\u4e2d\u6587\u4e2d\u56fd)");
        com.github.javafaker.Number number8 = faker4.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str7, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        java.lang.String str3 = faker0.letterify("zho");
        com.github.javafaker.App app4 = faker0.app();
        java.lang.String str6 = faker0.regexify("French");
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        java.util.stream.DoubleStream doubleStream15 = random6.doubles((-1.2741879846961226d), (double) 'a');
        float float16 = random6.nextFloat();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (Taiwan)" + "'", str4, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.86674047f + "'", float16 == 0.86674047f);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Color color3 = faker1.color();
        com.github.javafaker.Number number4 = faker1.number();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.util.Locale locale1 = new java.util.Locale("Chinesisch (China)");
        org.junit.Assert.assertEquals(locale1.toString(), "chinesisch (china)");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("CN");
        java.util.Locale.Builder builder8 = builder2.setExtension('a', "ko-KR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("us_EN-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: us_EN-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.IntStream intStream9 = random0.ints((int) '#', (int) 'x');
        int int10 = random0.nextInt();
        int int11 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.7434306855782402d) + "'", double4 == (-0.7434306855782402d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 728042379 + "'", int10 == 728042379);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60779535 + "'", int11 == 60779535);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Options options5 = faker3.options();
        com.github.javafaker.Finance finance6 = faker3.finance();
        com.github.javafaker.Finance finance7 = faker3.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        java.lang.String str8 = faker3.regexify("it");
        com.github.javafaker.Finance finance9 = faker3.finance();
        com.github.javafaker.Options options10 = faker3.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayCountry();
        java.lang.String str12 = locale8.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.getVariant();
        java.lang.String str15 = locale8.getDisplayScript(locale13);
        java.util.Locale.setDefault(category7, locale13);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random19 = new java.util.Random();
        java.util.stream.IntStream intStream20 = random19.ints();
        java.util.stream.LongStream longStream23 = random19.longs((long) 1, (long) 100);
        boolean boolean24 = random19.nextBoolean();
        java.util.stream.DoubleStream doubleStream28 = random19.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream32 = random19.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long33 = random19.nextLong();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale18, random19);
        java.lang.String str35 = locale18.getDisplayCountry();
        java.util.Locale.setDefault(category7, locale18);
        java.util.Locale.Builder builder37 = builder5.setLocale(locale18);
        java.util.Locale.Builder builder39 = builder37.setRegion("cn");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u570b" + "'", str10, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u570b" + "'", str11, "\u4e2d\u570b");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str12, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(longStream23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 7609460623915314831L + "'", long33 == 7609460623915314831L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u56fd" + "'", str35, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale3.getScript();
        java.lang.String str9 = locale3.getISO3Country();
        java.util.Set<java.lang.Character> charSet10 = locale3.getExtensionKeys();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.util.Locale locale3 = new java.util.Locale("fr-CA", "Franz\366sisch", "ko-KR");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale3.getDisplayVariant(locale6);
        java.lang.String str10 = locale6.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "fr-ca_FRANZ\366SISCH_ko-KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str5, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "US" + "'", str8, "US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ko-KR" + "'", str9, "ko-KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguage("Chine");
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.lang.String str11 = locale8.getScript();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale8.getDisplayLanguage(locale12);
        java.lang.String str15 = locale12.getISO3Language();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.getVariant();
        java.util.Locale.Builder builder23 = builder19.setLocale(locale21);
        java.lang.String str24 = locale21.toLanguageTag();
        java.lang.String str25 = locale21.getDisplayScript();
        java.lang.String str26 = locale16.getDisplayName(locale21);
        java.lang.String str27 = locale12.getDisplayLanguage(locale16);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale16);
        java.lang.String str29 = locale16.getDisplayName();
        java.lang.String str30 = locale16.getScript();
        java.util.Locale locale31 = locale16.stripExtensions();
        java.lang.String str32 = locale31.getVariant();
        java.util.Locale.Builder builder33 = builder7.setLocale(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder35 = builder7.setScript("\uc911\uad6d\uc5b4\ub300\ub9cc) (FRAN\347AIS (CANADA))");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ???????? (?????) (FRANc?AIS (CANADA)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh-CN" + "'", str24, "zh-CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u5fb7\u6587" + "'", str26, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinesisch" + "'", str27, "Chinesisch");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u5fb7\u6587" + "'", str29, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        java.lang.String str10 = locale5.getDisplayLanguage();
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
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587" + "'", str10, "\u6cd5\u6587");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.util.Random random1 = new java.util.Random((-8338582403409264965L));
        float float2 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.98133856f + "'", float2 == 0.98133856f);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.util.Random random1 = new java.util.Random((long) 180995420);
        boolean boolean2 = random1.nextBoolean();
        java.util.stream.IntStream intStream3 = random1.ints();
        double double4 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0741371356783016d + "'", double4 == 1.0741371356783016d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        java.util.stream.IntStream intStream18 = random0.ints(0L, (-1056274842), 175439095);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2897851060178539d + "'", double10 == 0.2897851060178539d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9533502574042055d + "'", double11 == 0.9533502574042055d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1201347346 + "'", int12 == 1201347346);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5101219023120255d + "'", double13 == 0.5101219023120255d);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        int int11 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream16 = random0.ints(14651007, (-714859851));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9890777244298679d) + "'", double4 == (-0.9890777244298679d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1155869325) + "'", int11 == (-1155869325));
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale6.getDisplayScript();
        java.util.Locale.setDefault(category2, locale6);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale11.getDisplayName(locale12);
        java.lang.String str15 = locale12.getDisplayLanguage();
        java.util.Locale.setDefault(category2, locale12);
        java.lang.String str17 = locale0.getDisplayVariant(locale12);
        java.lang.String str18 = locale0.getVariant();
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("\u4e2d\u56fd");
        java.lang.String str22 = locale20.getExtension('x');
        java.lang.String str23 = locale20.getScript();
        java.lang.String str24 = locale20.getDisplayName();
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.lang.String str28 = locale25.getScript();
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale25.getDisplayLanguage(locale29);
        java.lang.String str32 = locale20.getDisplayScript(locale25);
        java.lang.String str33 = locale25.getISO3Country();
        java.lang.String str34 = locale0.getDisplayScript(locale25);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str14, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u6587" + "'", str31, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CHN" + "'", str33, "CHN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.util.Random random1 = new java.util.Random((-8760364856787578239L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        java.lang.String str4 = faker2.regexify("GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GB" + "'", str4, "GB");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale locale6 = new java.util.Locale("South Korea", "Chinesisch", "\u4e2d\u56fd");
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale0.getDisplayCountry(locale6);
        java.lang.String str9 = locale6.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "South Korea" + "'", str8, "South Korea");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        java.lang.String str5 = faker0.bothify("\u4e2d\u56fd");
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.Lorem lorem7 = faker0.lorem();
        com.github.javafaker.Name name8 = faker0.name();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale.setDefault(locale1);
        java.lang.String str8 = locale1.getDisplayName();
        java.lang.String str9 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str8, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Code code6 = faker3.code();
        java.lang.String str8 = faker3.letterify("hi!_HI!_hi!");
        com.github.javafaker.Hacker hacker9 = faker3.hacker();
        com.github.javafaker.App app10 = faker3.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!_HI!_hi!" + "'", str8, "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        com.github.javafaker.Hacker hacker10 = faker3.hacker();
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
        org.junit.Assert.assertNotNull(hacker10);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale9.getDisplayName(locale10);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = locale16.getCountry();
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.getVariant();
        java.lang.String str20 = locale16.toLanguageTag();
        java.lang.String str21 = locale16.getISO3Country();
        java.util.Set<java.lang.String> strSet22 = locale16.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale24 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str12, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GB" + "'", str17, "GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-GB" + "'", str18, "en-GB");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-GB" + "'", str20, "en-GB");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GBR" + "'", str21, "GBR");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        java.lang.String str8 = faker3.letterify("Chine");
        com.github.javafaker.Name name9 = faker3.name();
        com.github.javafaker.App app10 = faker3.app();
        java.lang.String str12 = faker3.numerify("CA");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CA" + "'", str12, "CA");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        java.lang.String str13 = locale0.getVariant();
        java.lang.String str15 = locale0.getExtension('u');
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale10.toString(), "chine");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        java.util.stream.LongStream longStream21 = random8.longs((long) 1272557603);
        java.util.stream.DoubleStream doubleStream24 = random8.doubles((-0.9772495941566283d), 0.2818906812594967d);
        double double25 = random8.nextGaussian();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.5184819484275531d) + "'", double12 == (-0.5184819484275531d));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-749071104613202440L) + "'", long18 == (-749071104613202440L));
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.5895337674339335d) + "'", double25 == (-0.5895337674339335d));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream15 = random0.doubles(0.8372999373811125d, 1.1186852440711024d);
        random0.setSeed(1409958607731658842L);
        float float18 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4247511633539264d + "'", double4 == 0.4247511633539264d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5185236f + "'", float18 == 0.5185236f);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        double double6 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles(0.7626618616529046d, (double) 0.9815054f);
        java.util.stream.LongStream longStream10 = random0.longs();
        java.util.stream.DoubleStream doubleStream11 = random0.doubles();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.3824908f + "'", float5 == 0.3824908f);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.19778976638457868d + "'", double6 == 0.19778976638457868d);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        java.lang.String str22 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4443587788516426875L) + "'", long16 == (-4443587788516426875L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd" + "'", str18, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh_CN" + "'", str22, "zh_CN");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.util.Locale locale2 = new java.util.Locale("\uc77c\ubcf8\uc5b4\uc77c\ubcf8)", "\u82f1\u6587");
        java.lang.String str3 = locale2.getDisplayScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale6.getDisplayName(locale9);
        java.lang.String str14 = locale6.getDisplayCountry();
        java.lang.String str15 = locale6.getDisplayVariant();
        java.util.Locale.Builder builder16 = builder4.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder4.setLanguageTag("zh_cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais" + "'", str8, "fran\347ais");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.util.Random random1 = new java.util.Random((long) 163231460);
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0);
        java.lang.String str14 = locale0.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        double double14 = random0.nextGaussian();
        float float15 = random0.nextFloat();
        java.util.stream.LongStream longStream16 = random0.longs();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.5702883030600974d) + "'", double14 == (-1.5702883030600974d));
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.02907002f + "'", float15 == 0.02907002f);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.util.Random random1 = new java.util.Random((long) (-1987686354));
        float float2 = random1.nextFloat();
        java.util.stream.LongStream longStream4 = random1.longs(6604187400076253514L);
        java.util.stream.LongStream longStream5 = random1.longs();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5932345f + "'", float2 == 0.5932345f);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        boolean boolean5 = locale3.hasExtensions();
        java.util.Locale locale6 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_HI!_hi!");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale6.getDisplayName(locale9);
        java.lang.String str14 = locale6.getDisplayCountry();
        java.lang.String str15 = locale6.getDisplayVariant();
        java.util.Locale.Builder builder16 = builder4.setLocale(locale6);
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("China", "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais" + "'", str8, "fran\347ais");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        java.lang.String str6 = locale1.getExtension('u');
        java.lang.String str8 = locale1.getExtension('u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.util.Locale locale1 = new java.util.Locale("\uc77c\ubcf8\uc5b4\uc77c\ubcf8)");
        org.junit.Assert.assertEquals(locale1.toString(), "\uc77c\ubcf8\uc5b4\uc77c\ubcf8)");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder8.setLanguage("");
        java.util.Locale.Builder builder12 = builder8.setLanguageTag("chinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        java.util.stream.LongStream longStream13 = random0.longs();
        java.util.stream.LongStream longStream14 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3070903094074559d + "'", double4 == 0.3070903094074559d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7706232944311157d + "'", double9 == 0.7706232944311157d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1827966674 + "'", int10 == 1827966674);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15567781424216343d + "'", double11 == 0.15567781424216343d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale6.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale20.getLanguage();
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet24 = locale22.getExtensionKeys();
        java.lang.String str25 = locale22.getCountry();
        java.util.Set<java.lang.Character> charSet26 = locale22.getExtensionKeys();
        java.lang.String str27 = locale20.getDisplayCountry(locale22);
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.lang.String str32 = locale29.getScript();
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str35 = locale29.getDisplayLanguage(locale33);
        java.lang.String str36 = locale33.getISO3Language();
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.lang.String str38 = locale37.getISO3Country();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder39.clear();
        java.util.Locale locale41 = builder40.build();
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.lang.String str43 = locale42.getVariant();
        java.util.Locale.Builder builder44 = builder40.setLocale(locale42);
        java.lang.String str45 = locale42.toLanguageTag();
        java.lang.String str46 = locale42.getDisplayScript();
        java.lang.String str47 = locale37.getDisplayName(locale42);
        java.lang.String str48 = locale33.getDisplayLanguage(locale37);
        java.util.Locale.setDefault(category0, locale33);
        java.util.Locale locale50 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = locale50.getExtension('u');
        com.github.javafaker.Faker faker53 = new com.github.javafaker.Faker(locale50);
        java.lang.String str54 = locale33.getDisplayScript(locale50);
        java.lang.String str55 = locale50.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine" + "'", str4, "Chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chine" + "'", str5, "Chine");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chinois" + "'", str16, "chinois");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chinois" + "'", str23, "chinois");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "TW" + "'", str25, "TW");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u570b" + "'", str27, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "chinois" + "'", str35, "chinois");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "fra" + "'", str36, "fra");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "zh-CN" + "'", str45, "zh-CN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u5fb7\u6587" + "'", str47, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Franz\366sisch" + "'", str48, "Franz\366sisch");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr_CA");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "CA" + "'", str55, "CA");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayName(locale2);
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        java.lang.String str8 = locale0.getDisplayScript(locale2);
        java.lang.String str9 = locale2.getISO3Language();
        java.lang.String str10 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinois" + "'", str10, "chinois");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean", (-0.5433684737265743d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.5433684737265743");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        java.util.stream.LongStream longStream9 = random0.longs();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setVariant("Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Koreanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale6.getDisplayName(locale9);
        java.lang.String str14 = locale6.getDisplayCountry();
        java.lang.String str15 = locale6.getDisplayVariant();
        java.util.Locale.Builder builder16 = builder4.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguageTag("\u97d3\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais" + "'", str8, "fran\347ais");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Internet internet7 = faker3.internet();
        java.lang.String str9 = faker3.numerify("\uc911\uad6d\uc5b4\uc911\uad6d)");
        com.github.javafaker.Business business10 = faker3.business();
        java.lang.String str12 = faker3.regexify("Chinese (China)");
        com.github.javafaker.Name name13 = faker3.name();
        java.lang.String str15 = faker3.letterify("Deutschland");
        com.github.javafaker.Code code16 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str9, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese China" + "'", str12, "Chinese China");
        org.junit.Assert.assertNotNull(name13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Deutschland" + "'", str15, "Deutschland");
        org.junit.Assert.assertNotNull(code16);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        java.lang.String str17 = faker12.numerify("Franz\366sisch");
        com.github.javafaker.Hacker hacker18 = faker12.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str4, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ITA" + "'", str15, "ITA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Franz\366sisch" + "'", str17, "Franz\366sisch");
        org.junit.Assert.assertNotNull(hacker18);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FR_CA", (double) (-4481357915018277824L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-4.4813579150182779E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.util.Locale locale1 = new java.util.Locale("zh-cn (CHINESISCH (CHINA))");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.DoubleStream doubleStream8 = random3.doubles();
        boolean boolean9 = random3.nextBoolean();
        int int11 = random3.nextInt((int) (short) 1);
        java.util.stream.DoubleStream doubleStream12 = random3.doubles();
        float float13 = random3.nextFloat();
        double double14 = random3.nextGaussian();
        java.util.stream.LongStream longStream16 = random3.longs((long) 1875692351);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: zh-cn (chinesisch (china)) could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn (chinesisch (china))");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2883126842711302d + "'", double7 == 0.2883126842711302d);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.40555018f + "'", float13 == 0.40555018f);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2727636737326149d + "'", double14 == 0.2727636737326149d);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.util.Locale locale2 = new java.util.Locale("", "kor");
        org.junit.Assert.assertEquals(locale2.toString(), "_KOR");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        java.lang.String str14 = faker10.regexify("zh-cn");
        com.github.javafaker.Internet internet15 = faker10.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-cn" + "'", str14, "zh-cn");
        org.junit.Assert.assertNotNull(internet15);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        java.lang.String str16 = faker10.bothify("Japan");
        com.github.javafaker.Name name17 = faker10.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(lorem14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Japan" + "'", str16, "Japan");
        org.junit.Assert.assertNotNull(name17);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.util.Random random0 = new java.util.Random();
        long long1 = random0.nextLong();
        java.util.stream.LongStream longStream3 = random0.longs(5192417783011311239L);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-836250980781584166L) + "'", long1 == (-836250980781584166L));
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayVariant();
        java.lang.String str7 = locale0.getDisplayCountry();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.IntStream intStream9 = random8.ints();
        java.util.stream.LongStream longStream12 = random8.longs((long) 1, (long) 100);
        boolean boolean13 = random8.nextBoolean();
        java.util.stream.DoubleStream doubleStream17 = random8.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream21 = random8.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream25 = random8.ints((long) 2109552831, (-1), (int) (byte) 0);
        int int26 = random8.nextInt();
        double double27 = random8.nextDouble();
        int int29 = random8.nextInt(180995420);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale0, random8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chinois (Chine)" + "'", str4, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chine" + "'", str7, "Chine");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertNotNull(longStream12);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(intStream25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1413671747 + "'", int26 == 1413671747);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6628237922006758d + "'", double27 == 0.6628237922006758d);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 180495803 + "'", int29 == 180495803);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.util.Random random1 = new java.util.Random((-3019054096168434161L));
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        random1.setSeed((-4915785405110901087L));
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        com.github.javafaker.App app15 = faker10.app();
        com.github.javafaker.PhoneNumber phoneNumber16 = faker10.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str14, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(app15);
        org.junit.Assert.assertNotNull(phoneNumber16);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        java.util.stream.LongStream longStream13 = random0.longs();
        int int15 = random0.nextInt(228900361);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.15639152718863447d + "'", double4 == 0.15639152718863447d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.203118094237138d + "'", double9 == 2.203118094237138d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-690926815) + "'", int10 == (-690926815));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-2.2753633547279657d) + "'", double11 == (-2.2753633547279657d));
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37891971 + "'", int15 == 37891971);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        java.lang.String str28 = locale0.getDisplayVariant();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois" + "'", str6, "chinois");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese (China)" + "'", str14, "Chinese (China)");
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.1522629092961875d) + "'", double19 == (-0.1522629092961875d));
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.17491132f + "'", float25 == 0.17491132f);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.020136219559552443d) + "'", double26 == (-0.020136219559552443d));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.util.Random random1 = new java.util.Random((-7103792676836336750L));
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        random1.setSeed((-904965483975765628L));
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.Book book7 = faker3.book();
        java.lang.Class<?> wildcardClass8 = book7.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u6587\u52a0\u62ff\u5927)", "Italienisch");
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale2.getDisplayVariant(locale5);
        org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)_ITALIENISCH");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0);
        java.util.Locale.setDefault(locale0);
        java.util.Locale.Category category21 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getVariant();
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.lang.String str25 = locale22.getDisplayName(locale24);
        boolean boolean26 = locale22.hasExtensions();
        java.lang.String str27 = locale22.getDisplayScript();
        java.lang.String str28 = locale22.getDisplayLanguage();
        java.util.Locale.setDefault(category21, locale22);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random32 = new java.util.Random();
        java.util.stream.IntStream intStream33 = random32.ints();
        java.util.stream.LongStream longStream36 = random32.longs((long) 1, (long) 100);
        boolean boolean37 = random32.nextBoolean();
        java.util.stream.DoubleStream doubleStream41 = random32.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream45 = random32.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long46 = random32.nextLong();
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(locale31, random32);
        java.util.Locale locale48 = java.util.Locale.CHINA;
        java.lang.String str49 = locale48.toLanguageTag();
        java.util.Locale locale50 = locale48.stripExtensions();
        java.lang.String str51 = locale50.getLanguage();
        java.lang.String str52 = locale31.getDisplayLanguage(locale50);
        java.lang.String str53 = locale31.getISO3Language();
        java.util.Locale.setDefault(category21, locale31);
        java.util.Locale locale55 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale55);
        java.lang.String str57 = locale55.getDisplayLanguage();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.lang.String str59 = locale58.getScript();
        java.lang.String str60 = locale58.getDisplayCountry();
        java.lang.String str61 = locale58.getScript();
        java.lang.String str62 = locale55.getDisplayName(locale58);
        java.util.Locale.setDefault(category21, locale58);
        java.lang.String str64 = locale0.getDisplayName(locale58);
        com.github.javafaker.Faker faker65 = new com.github.javafaker.Faker(locale0);
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
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category21.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinesisch (China)" + "'", str25, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(longStream36);
// flaky:         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertNotNull(longStream45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5068905718521787973L + "'", long46 == 5068905718521787973L);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zh-CN" + "'", str49, "zh-CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh" + "'", str51, "zh");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u4e2d\u6587" + "'", str52, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zho" + "'", str53, "zho");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "fran\347ais" + "'", str57, "fran\347ais");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Chine" + "'", str60, "Chine");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str62, "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str64, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("taiwan");
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category10);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category10);
        java.util.Locale locale15 = java.util.Locale.getDefault(category10);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale16.getDisplayName(locale17);
        java.lang.String str20 = locale17.getDisplayLanguage();
        java.util.Locale.setDefault(locale17);
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale22.getScript();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        java.lang.String str28 = locale22.getDisplayLanguage(locale26);
        java.lang.String str29 = locale17.getDisplayName(locale22);
        java.util.Random random30 = new java.util.Random();
        java.util.stream.IntStream intStream31 = random30.ints();
        java.util.stream.LongStream longStream34 = random30.longs((long) 1, (long) 100);
        boolean boolean35 = random30.nextBoolean();
        java.util.stream.DoubleStream doubleStream39 = random30.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream43 = random30.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream45 = random30.longs((long) (short) 0);
        java.util.stream.DoubleStream doubleStream46 = random30.doubles();
        java.util.stream.LongStream longStream48 = random30.longs(5689803982665130262L);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale17, random30);
        java.lang.String str50 = locale15.getDisplayVariant(locale17);
        java.util.Locale.Builder builder51 = builder9.setLocale(locale17);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str19, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
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
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str29, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertNotNull(longStream34);
// flaky:         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertNotNull(longStream43);
        org.junit.Assert.assertNotNull(longStream45);
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertNotNull(longStream48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        java.lang.String str13 = faker10.numerify("Franz\366sisch (Frankreich)");
        java.lang.String str15 = faker10.bothify("English");
        com.github.javafaker.PhoneNumber phoneNumber16 = faker10.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertNotNull(phoneNumber16);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        java.lang.String str23 = locale1.getDisplayName();
        java.lang.String str24 = locale1.getVariant();
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
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u671d\u9c9c\u6587" + "'", str23, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.util.Locale.Builder builder11 = builder1.clear();
        java.util.Locale.Builder builder12 = builder11.clear();
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (-1.4660099971836382d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.4660099971836382");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        random0.nextBytes(byteArray7);
        boolean boolean9 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5585533063148691d + "'", double2 == 0.5585533063148691d);
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[89, 64, -12, 75]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        double double4 = random0.nextDouble();
        int int6 = random0.nextInt(96787195);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8829382473145473d + "'", double2 == 0.8829382473145473d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.42384146171829895d + "'", double4 == 0.42384146171829895d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4581591 + "'", int6 == 4581591);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        boolean boolean12 = locale5.hasExtensions();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setVariant("China");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getDisplayScript();
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str9 = locale1.getLanguage();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale1.getDisplayName(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        double double6 = random0.nextDouble();
        random0.setSeed((long) (byte) 1);
        double double9 = random0.nextGaussian();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        java.lang.String str12 = faker10.bothify("\u4e2d\u570b");
        com.github.javafaker.Internet internet13 = faker10.internet();
        com.github.javafaker.Name name14 = faker10.name();
        com.github.javafaker.Book book15 = faker10.book();
        com.github.javafaker.Business business16 = faker10.business();
        com.github.javafaker.Hacker hacker17 = faker10.hacker();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.36093307f + "'", float5 == 0.36093307f);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8074229727676372d + "'", double6 == 0.8074229727676372d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.561581040188955d + "'", double9 == 1.561581040188955d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u570b" + "'", str12, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(internet13);
        org.junit.Assert.assertNotNull(name14);
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(hacker17);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        java.lang.String str16 = locale15.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh" + "'", str16, "zh");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        java.lang.String str13 = faker10.regexify("TW");
        com.github.javafaker.App app14 = faker10.app();
        com.github.javafaker.Name name15 = faker10.name();
        com.github.javafaker.Lorem lorem16 = faker10.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TW" + "'", str13, "TW");
        org.junit.Assert.assertNotNull(app14);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(lorem16);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = locale3.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.lang.String str4 = locale1.getLanguage();
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getVariant();
        boolean boolean7 = locale1.hasExtensions();
        java.lang.String str8 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Locale locale3 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("GBR");
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Code code4 = faker0.code();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Number number5 = faker0.number();
        com.github.javafaker.DateAndTime dateAndTime6 = faker0.date();
        java.lang.String str8 = faker0.letterify("Chine");
        java.lang.String str10 = faker0.letterify("Italie");
        java.lang.String str12 = faker0.bothify("en-GB");
        com.github.javafaker.Business business13 = faker0.business();
        java.lang.String str15 = faker0.bothify("");
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italie" + "'", str10, "Italie");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        java.util.Locale.Builder builder19 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder11.setExtension('#', "ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Finance finance5 = faker0.finance();
        com.github.javafaker.Internet internet6 = faker0.internet();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(internet6);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.util.Locale locale2 = new java.util.Locale("Franz\366sisch", "china");
        org.junit.Assert.assertEquals(locale2.toString(), "franz\366sisch_CHINA");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        com.github.javafaker.Hacker hacker12 = faker10.hacker();
        com.github.javafaker.Finance finance13 = faker10.finance();
        java.lang.String str15 = faker10.regexify("it");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = faker10.resolve("ita");
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
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it" + "'", str15, "it");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        com.github.javafaker.Book book28 = faker27.book();
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
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.418025799823955d + "'", double19 == 1.418025799823955d);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.38612694f + "'", float25 == 0.38612694f);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.9460208122285099d + "'", double26 == 1.9460208122285099d);
        org.junit.Assert.assertNotNull(book28);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder10 = builder7.setExtension('a', "de_DE");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setRegion("cinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: cinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        java.lang.String str12 = faker10.bothify("zh-cn");
        com.github.javafaker.Code code13 = faker10.code();
        com.github.javafaker.Finance finance14 = faker10.finance();
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str9, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-cn" + "'", str12, "zh-cn");
        org.junit.Assert.assertNotNull(code13);
        org.junit.Assert.assertNotNull(finance14);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.toLanguageTag();
        java.lang.String str6 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        java.util.Locale.Builder builder10 = builder4.setLanguage("TWN");
        java.util.Locale.Builder builder12 = builder4.setLanguage("France");
        java.util.Locale.Builder builder13 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguageTag("Chinesisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Chinesisch [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        int int15 = random0.nextInt(68);
        float float16 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream20 = random0.doubles((long) 218414389, (-0.5244510189182026d), (-0.646011105706082d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.083080003457423d + "'", double4 == 1.083080003457423d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9057437050958479d + "'", double6 == 0.9057437050958479d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.342392788105341d + "'", double11 == 0.342392788105341d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.6407812f + "'", float16 == 0.6407812f);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("taiwan");
        java.lang.String str3 = locale1.getExtension('u');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "taiwan");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u6cd5\u56fd (Vereinigte Staaten von Amerika,kor)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale6.getDisplayName(locale7);
        java.lang.String str10 = locale7.getDisplayLanguage();
        java.lang.String str11 = locale7.getISO3Country();
        java.lang.String str12 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale14.getDisplayCountry();
        java.lang.String str17 = locale14.toLanguageTag();
        java.util.Locale locale18 = locale14.stripExtensions();
        java.lang.String str19 = locale13.getDisplayName(locale14);
        java.lang.String str20 = locale13.getDisplayVariant();
        java.lang.String str21 = locale3.getDisplayVariant(locale13);
        java.util.Set<java.lang.Character> charSet22 = locale13.getExtensionKeys();
        java.lang.String str23 = locale13.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CHN" + "'", str11, "CHN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.util.Locale locale1 = new java.util.Locale("Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals(locale1.toString(), "franz\366sisch (kanada)");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.util.Locale locale0 = null;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream14 = random1.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream15 = random1.longs();
        double double16 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9660951846203736d + "'", double16 == 0.9660951846203736d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        int int14 = random0.nextInt();
        random0.setSeed((-2902042412286228963L));
        java.util.Random random17 = new java.util.Random();
        java.util.stream.IntStream intStream18 = random17.ints();
        java.util.stream.LongStream longStream21 = random17.longs((long) 1, (long) 100);
        boolean boolean22 = random17.nextBoolean();
        java.util.stream.DoubleStream doubleStream26 = random17.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream30 = random17.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream31 = random17.longs();
        java.util.stream.LongStream longStream35 = random17.longs(5288735684466769752L, 1L, (long) 100);
        int int37 = random17.nextInt(383222448);
        java.util.Random random39 = new java.util.Random(606167875098546778L);
        java.util.stream.LongStream longStream40 = random39.longs();
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) -1, (byte) 100 };
        random39.nextBytes(byteArray44);
        random17.nextBytes(byteArray44);
        random0.nextBytes(byteArray44);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.362526357913107d) + "'", double4 == (-1.362526357913107d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1301414851 + "'", int14 == 1301414851);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(longStream21);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(longStream30);
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertNotNull(longStream35);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 374991564 + "'", int37 == 374991564);
        org.junit.Assert.assertNotNull(longStream40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-103, 122, -96]");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.util.Locale locale3 = new java.util.Locale("fr-CA", "Franz\366sisch", "ko-KR");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale3.getDisplayVariant(locale6);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayCountry();
        java.lang.String str16 = locale12.getISO3Language();
        java.lang.String str17 = locale12.getLanguage();
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale12.getDisplayScript(locale18);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale12);
        java.util.Locale.setDefault(category10, locale12);
        java.util.Locale locale22 = java.util.Locale.getDefault(category10);
        java.lang.String str23 = locale6.getDisplayName(locale22);
        java.lang.String str24 = locale22.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "fr-ca_FRANZ\366SISCH_ko-KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str5, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "US" + "'", str8, "US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ko-KR" + "'", str9, "ko-KR");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u56fd" + "'", str14, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u82f1\u6587\u7f8e\u56fd)" + "'", str23, "\u82f1\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zho" + "'", str24, "zho");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinois (Chine)");
        java.lang.String str2 = locale1.getDisplayVariant();
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
        java.lang.String str15 = locale1.getDisplayVariant(locale5);
        boolean boolean16 = locale5.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en-GB");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale6 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd)", "\u4e2d\u56fd", "zh_CN");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        java.util.stream.LongStream longStream18 = random6.longs();
        java.util.Random random19 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream22 = random19.doubles((double) (byte) 0, (double) '#');
        double double23 = random19.nextGaussian();
        java.util.stream.DoubleStream doubleStream24 = random19.doubles();
        double double25 = random19.nextDouble();
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 0, (double) '#');
        double double30 = random26.nextGaussian();
        java.util.stream.DoubleStream doubleStream31 = random26.doubles();
        java.util.stream.IntStream intStream34 = random26.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random26);
        java.util.stream.LongStream longStream36 = random26.longs();
        java.util.Random random37 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles((double) (byte) 0, (double) '#');
        double double41 = random37.nextGaussian();
        java.util.stream.DoubleStream doubleStream42 = random37.doubles();
        java.util.stream.IntStream intStream45 = random37.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream46 = random37.doubles();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random37.nextBytes(byteArray50);
        random26.nextBytes(byteArray50);
        random19.nextBytes(byteArray50);
        random6.nextBytes(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream56 = random6.ints((-6596674055193122295L));
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
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.5953572291451832d) + "'", double23 == (-1.5953572291451832d));
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5613257734129966d + "'", double25 == 0.5613257734129966d);
        org.junit.Assert.assertNotNull(doubleStream29);
// flaky:         org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.5465072781194035d) + "'", double30 == (-0.5465072781194035d));
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(intStream34);
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertNotNull(doubleStream40);
// flaky:         org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.8325142637517569d + "'", double41 == 0.8325142637517569d);
        org.junit.Assert.assertNotNull(doubleStream42);
        org.junit.Assert.assertNotNull(intStream45);
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertNotNull(byteArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-76, -89, 113]");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayCountry();
        java.lang.String str12 = locale8.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.getVariant();
        java.lang.String str15 = locale8.getDisplayScript(locale13);
        java.util.Locale.setDefault(category7, locale13);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random19 = new java.util.Random();
        java.util.stream.IntStream intStream20 = random19.ints();
        java.util.stream.LongStream longStream23 = random19.longs((long) 1, (long) 100);
        boolean boolean24 = random19.nextBoolean();
        java.util.stream.DoubleStream doubleStream28 = random19.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream32 = random19.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long33 = random19.nextLong();
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(locale18, random19);
        java.lang.String str35 = locale18.getDisplayCountry();
        java.util.Locale.setDefault(category7, locale18);
        java.util.Locale.Builder builder37 = builder5.setLocale(locale18);
        java.util.Locale.Builder builder39 = builder37.setRegion("DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder39.setUnicodeLocaleKeyword("", "\u6cd5\u6587\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str12, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNotNull(longStream23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-860191786051528219L) + "'", long33 == (-860191786051528219L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u56fd" + "'", str35, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        java.util.Locale.Builder builder16 = builder1.addUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder18 = builder1.setLanguageTag("en-gb");
        java.util.Locale.Builder builder21 = builder1.setExtension('u', "chine");
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Address address4 = faker0.address();
        com.github.javafaker.Internet internet5 = faker0.internet();
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        com.github.javafaker.Book book7 = faker0.book();
        com.github.javafaker.Code code8 = faker0.code();
        com.github.javafaker.Lorem lorem9 = faker0.lorem();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.util.Locale locale2 = new java.util.Locale("KR", "");
        java.util.Locale.setDefault(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "kr");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale6 = locale2.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French (Canada)" + "'", str1, "French (Canada)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("coreano");
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category5);
        java.util.Locale locale8 = java.util.Locale.getDefault(category5);
        java.util.Locale.Builder builder9 = builder3.setLocale(locale8);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.lang.String str17 = locale14.getCountry();
        java.util.Set<java.lang.Character> charSet18 = locale14.getExtensionKeys();
        java.lang.String str19 = locale12.getDisplayCountry(locale14);
        java.util.Set<java.lang.String> strSet20 = locale14.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder21 = builder3.setLocale(locale14);
        java.util.Locale locale22 = builder21.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "TW" + "'", str17, "TW");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u570b" + "'", str19, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        java.util.Set<java.lang.String> strSet27 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale locale29 = builder28.build();
        java.util.Locale.Builder builder30 = builder28.clear();
        java.util.Locale locale31 = builder30.build();
        java.lang.String str32 = locale31.getDisplayName();
        java.lang.String str33 = locale0.getDisplayCountry(locale31);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
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
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        java.lang.String str14 = locale7.getDisplayScript();
        java.lang.String str15 = locale7.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.util.Locale locale3 = new java.util.Locale("Chine", "cinese (Cina)", "FRANZ\366SISCH");
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getDisplayCountry();
        java.lang.String str9 = locale5.getISO3Language();
        java.lang.String str10 = locale4.getDisplayLanguage(locale5);
        java.util.Locale locale11 = locale5.stripExtensions();
        java.lang.String str12 = locale5.getDisplayName();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale.Builder builder15 = builder13.clear();
        java.util.Locale.Builder builder16 = builder13.clear();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder18 = builder16.setLocale(locale17);
        java.lang.String str19 = locale5.getDisplayCountry(locale17);
        java.lang.String str20 = locale3.getDisplayName(locale17);
        org.junit.Assert.assertEquals(locale3.toString(), "chine_CINESE (CINA)_FRANZ\366SISCH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\uc911\uad6d" + "'", str19, "\uc911\uad6d");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chine (CINESE (CINA),FRANZ\366SISCH)" + "'", str20, "chine (CINESE (CINA),FRANZ\366SISCH)");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        long long3 = random0.nextLong();
        java.util.stream.LongStream longStream5 = random0.longs(1873084296697550790L);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.918168792112839d) + "'", double2 == (-0.918168792112839d));
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1569701037168557240L + "'", long3 == 1569701037168557240L);
        org.junit.Assert.assertNotNull(longStream5);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream15 = random0.longs();
        java.util.stream.DoubleStream doubleStream17 = random0.doubles((long) 451064779);
        java.util.stream.DoubleStream doubleStream18 = random0.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.4834957472463715d) + "'", double4 == (-2.4834957472463715d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0999017800186136d + "'", double6 == 0.0999017800186136d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.1283876317418794d) + "'", double11 == (-0.1283876317418794d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream15);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        com.github.javafaker.Name name36 = faker35.name();
        com.github.javafaker.Hacker hacker37 = faker35.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese" + "'", str4, "Chinese");
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
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3096921876635524759L) + "'", long19 == (-3096921876635524759L));
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6487460270682717d + "'", double27 == 0.6487460270682717d);
        org.junit.Assert.assertNotNull(doubleStream28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.7323754f + "'", float33 == 0.7323754f);
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.33396562210180575d + "'", double34 == 0.33396562210180575d);
        org.junit.Assert.assertNotNull(name36);
        org.junit.Assert.assertNotNull(hacker37);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList40, (java.util.Collection<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList48, strMap49);
        java.util.Collection<java.lang.String> strCollection51 = null;
        java.lang.String str52 = java.util.Locale.lookupTag(languageRangeList50, strCollection51);
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
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.util.Random random1 = new java.util.Random((long) (short) -1);
        java.util.stream.LongStream longStream4 = random1.longs((-2973136146954523582L), 4668688544456269390L);
        int int5 = random1.nextInt();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1155099827 + "'", int5 == 1155099827);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setVariant("China");
        java.util.Locale locale7 = builder2.build();
        java.util.Locale.Builder builder9 = builder2.setLanguageTag("en-gb");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.util.Random random1 = new java.util.Random((long) (short) 1);
        float float2 = random1.nextFloat();
        float float3 = random1.nextFloat();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.7308782f + "'", float2 == 0.7308782f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.100473166f + "'", float3 == 0.100473166f);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        java.lang.String str6 = faker4.numerify("FRANZ\366SISCH");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRANZ\366SISCH" + "'", str6, "FRANZ\366SISCH");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale4);
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 0, (double) '#');
        double double13 = random9.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random9.doubles();
        double double15 = random9.nextDouble();
        java.util.stream.IntStream intStream19 = random9.ints(100L, (-1), (int) (byte) 0);
        double double20 = random9.nextGaussian();
        java.util.stream.IntStream intStream21 = random9.ints();
        java.util.stream.LongStream longStream22 = random9.longs();
        random9.setSeed(100L);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale4, random9);
        java.lang.String str27 = faker25.bothify("en-gb");
        com.github.javafaker.PhoneNumber phoneNumber28 = faker25.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-GB" + "'", str6, "en-GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (Taiwan)" + "'", str8, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.5071062677886787d) + "'", double13 == (-0.5071062677886787d));
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.46467468773166043d + "'", double15 == 0.46467468773166043d);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.12258325799941482d) + "'", double20 == (-0.12258325799941482d));
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-gb" + "'", str27, "en-gb");
        org.junit.Assert.assertNotNull(phoneNumber28);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        java.lang.String str13 = locale1.getDisplayCountry();
        java.util.Set<java.lang.String> strSet14 = locale1.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u570b" + "'", str9, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream7 = random0.ints();
        java.util.stream.LongStream longStream9 = random0.longs(7975027329722967446L);
        java.util.stream.IntStream intStream10 = random0.ints();
        double double11 = random0.nextDouble();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5928891294781078d) + "'", double2 == (-1.5928891294781078d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2780500602217247626L) + "'", long4 == (-2780500602217247626L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1377322500016644d + "'", double5 == 1.1377322500016644d);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7905853243463056d + "'", double11 == 0.7905853243463056d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random0.nextBytes(byteArray11);
        double double13 = random0.nextGaussian();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Finance finance15 = faker14.finance();
        com.github.javafaker.Hacker hacker16 = faker14.hacker();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[125, -99, 24]");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.09322321413554469d + "'", double13 == 0.09322321413554469d);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(hacker16);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        java.util.Locale.Builder builder17 = builder8.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u570b" + "'", str6, "\u4e2d\u570b");
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
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) -1, (int) (byte) 10);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number10 = faker9.number();
        com.github.javafaker.Internet internet11 = faker9.internet();
        com.github.javafaker.DateAndTime dateAndTime12 = faker9.date();
        java.lang.String str14 = faker9.letterify("Englisch");
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.071763635f + "'", float5 == 0.071763635f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(internet11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Englisch" + "'", str14, "Englisch");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.util.Random random1 = new java.util.Random(3735687822417338572L);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale3.getDisplayVariant(locale7);
        java.lang.String str9 = locale1.getDisplayScript(locale3);
        java.util.Locale.Builder builder10 = builder0.setLocale(locale3);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str13 = locale11.getUnicodeLocaleType("zh");
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale11);
        java.lang.String str15 = locale11.toLanguageTag();
        java.util.Locale.Builder builder16 = builder0.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale11.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Number number4 = faker0.number();
        com.github.javafaker.Color color5 = faker0.color();
        java.lang.String str7 = faker0.regexify("ita");
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Internet internet7 = faker3.internet();
        java.lang.String str9 = faker3.numerify("\uc911\uad6d\uc5b4\uc911\uad6d)");
        com.github.javafaker.Business business10 = faker3.business();
        com.github.javafaker.Code code11 = faker3.code();
        com.github.javafaker.Lorem lorem12 = faker3.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str9, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(lorem12);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setExtension('u', "x-lvariant-eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: x [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.LongStream longStream6 = random0.longs();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random0);
        java.lang.String str10 = faker8.numerify("\u6cd5\u56fd");
        com.github.javafaker.Hacker hacker11 = faker8.hacker();
        com.github.javafaker.DateAndTime dateAndTime12 = faker8.date();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u56fd" + "'", str10, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.DoubleStream doubleStream8 = random0.doubles();
        float float9 = random0.nextFloat();
        boolean boolean10 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.12531447f + "'", float9 == 0.12531447f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        random0.setSeed((-6429587024962493419L));
        double double14 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.9635212553099337d) + "'", double4 == (-1.9635212553099337d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.3073064285163366d) + "'", double11 == (-0.3073064285163366d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.23510705542326327d) + "'", double14 == (-0.23510705542326327d));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        java.lang.String str10 = locale7.getVariant();
        java.lang.String str11 = locale7.getISO3Country();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        int int16 = random0.nextInt(65);
        java.util.stream.LongStream longStream17 = random0.longs();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.20679850489259588d + "'", double10 == 0.20679850489259588d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3698443863115237d + "'", double11 == 0.3698443863115237d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 423034239 + "'", int12 == 423034239);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.1390793268621109d) + "'", double13 == (-1.1390793268621109d));
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.App app2 = faker0.app();
        com.github.javafaker.Name name3 = faker0.name();
        java.lang.String str5 = faker0.regexify("\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(app2);
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str5, "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        java.util.Locale.Builder builder8 = builder7.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getVariant();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = locale7.stripExtensions();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale7);
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale14 = locale7.stripExtensions();
        java.util.Locale.Builder builder15 = builder6.setLocale(locale14);
        java.util.Locale.Builder builder16 = builder6.clearExtensions();
        java.util.Locale locale17 = builder6.build();
        java.lang.String str18 = locale17.getCountry();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = locale19.getVariant();
        java.lang.String str21 = locale0.getDisplayScript(locale19);
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet24 = locale22.getExtensionKeys();
        java.lang.String str25 = locale22.getDisplayScript();
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.lang.String str28 = locale26.getDisplayScript(locale27);
        java.lang.String str29 = locale27.getISO3Language();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = locale30.stripExtensions();
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale30);
        java.util.Locale locale34 = java.util.Locale.CHINA;
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale30.getDisplayVariant(locale34);
        java.lang.String str37 = locale27.getDisplayScript(locale34);
        java.util.Locale locale38 = locale27.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Locale locale40 = java.util.Locale.US;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.util.Locale locale43 = new java.util.Locale("Chine");
        java.util.Locale locale44 = java.util.Locale.ROOT;
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.lang.String str46 = locale43.getDisplayName(locale44);
        java.lang.String str47 = locale40.getDisplayName(locale43);
        java.lang.String str48 = locale27.getDisplayScript(locale43);
        java.lang.String str49 = locale22.getDisplayName(locale27);
        java.lang.String str50 = locale27.getDisplayCountry();
        java.lang.String str51 = locale19.getDisplayScript(locale27);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u570b" + "'", str12, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CN" + "'", str18, "CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "kor" + "'", str29, "kor");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u570b" + "'", str35, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale43.toString(), "chine");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "chine" + "'", str46, "chine");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "English (United States)" + "'", str47, "English (United States)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str49, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        java.lang.String str21 = locale11.getExtension('u');
        java.lang.String str22 = locale11.getDisplayScript();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale3.getDisplayName(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale3);
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(random8);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale3, random8);
        java.util.Locale.setDefault(locale3);
        java.lang.String str16 = locale3.getExtension('a');
        java.lang.String str17 = locale3.getDisplayName();
        java.lang.String str18 = locale3.getLanguage();
        java.util.Locale.setDefault(category0, locale3);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinesisch (Taiwan)" + "'", str6, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str17, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.App app5 = faker4.app();
        com.github.javafaker.App app6 = faker4.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(app6);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        java.lang.String str8 = locale5.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale5 = locale2.stripExtensions();
        java.util.Locale.setDefault(locale2);
        java.lang.String str7 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deutsch" + "'", str7, "Deutsch");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder5.setExtension('u', "zh");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("fra");
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale11);
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random16);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale11, random16);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getVariant();
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.lang.String str25 = locale22.getDisplayName(locale24);
        boolean boolean26 = locale22.hasExtensions();
        java.lang.String str27 = locale11.getDisplayLanguage(locale22);
        java.lang.String str28 = locale22.getScript();
        java.lang.String str29 = locale22.getDisplayVariant();
        java.lang.String str30 = locale22.getDisplayCountry();
        java.util.Locale.Builder builder31 = builder10.setLocale(locale22);
        java.lang.String str32 = locale0.getDisplayScript(locale22);
        java.lang.String str33 = locale22.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "France" + "'", str2, "France");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str14, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str25, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fran\347ais" + "'", str27, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "France" + "'", str30, "France");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fra" + "'", str33, "fra");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Options options4 = faker0.options();
        java.lang.String str6 = faker0.bothify("English (United Kingdom)");
        com.github.javafaker.Color color7 = faker0.color();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United Kingdom)" + "'", str6, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("DE");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale19.getDisplayName();
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.lang.String str23 = locale21.getCountry();
        java.lang.String str24 = locale2.getDisplayName(locale21);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale locale27 = builder26.build();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.getVariant();
        java.util.Locale.Builder builder30 = builder26.setLocale(locale28);
        java.lang.String str31 = locale28.toLanguageTag();
        java.lang.String str32 = locale28.getDisplayScript();
        java.lang.String str33 = locale28.getISO3Country();
        java.lang.String str34 = locale2.getDisplayVariant(locale28);
        java.lang.String str35 = locale28.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chine" + "'", str12, "Chine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chinois (Chine)" + "'", str14, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fran\347ais (Canada)" + "'", str20, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "US" + "'", str23, "US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CHN" + "'", str33, "CHN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        boolean boolean4 = locale2.equals((java.lang.Object) (-0.1522629092961875d));
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) 963875490);
        java.util.stream.LongStream longStream10 = random0.longs((long) (short) 0, (long) 1272557603);
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 0, (double) '#');
        double double15 = random11.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random11.doubles();
        java.util.stream.IntStream intStream19 = random11.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random11);
        java.util.stream.LongStream longStream21 = random11.longs();
        double double22 = random11.nextGaussian();
        java.util.Random random23 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream26 = random23.doubles((double) (byte) 0, (double) '#');
        double double27 = random23.nextGaussian();
        java.util.stream.DoubleStream doubleStream28 = random23.doubles();
        java.util.stream.IntStream intStream31 = random23.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker32 = new com.github.javafaker.Faker(random23);
        java.util.stream.LongStream longStream33 = random23.longs();
        java.util.Random random34 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream37 = random34.doubles((double) (byte) 0, (double) '#');
        double double38 = random34.nextGaussian();
        java.util.stream.DoubleStream doubleStream39 = random34.doubles();
        java.util.stream.IntStream intStream42 = random34.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream43 = random34.doubles();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random34.nextBytes(byteArray47);
        random23.nextBytes(byteArray47);
        random11.nextBytes(byteArray47);
        random0.nextBytes(byteArray47);
        java.util.stream.LongStream longStream52 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.27447926206951d + "'", double4 == 1.27447926206951d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.45590753953430657d + "'", double15 == 0.45590753953430657d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(longStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6919521030564155d + "'", double22 == 0.6919521030564155d);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.3708758600422533d + "'", double27 == 1.3708758600422533d);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertNotNull(longStream33);
        org.junit.Assert.assertNotNull(doubleStream37);
// flaky:         org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.4610347340848737d) + "'", double38 == (-0.4610347340848737d));
        org.junit.Assert.assertNotNull(doubleStream39);
        org.junit.Assert.assertNotNull(intStream42);
        org.junit.Assert.assertNotNull(doubleStream43);
        org.junit.Assert.assertNotNull(byteArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-60, -26, -19]");
        org.junit.Assert.assertNotNull(longStream52);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.IntStream intStream4 = random3.ints();
        java.util.stream.LongStream longStream7 = random3.longs((long) 1, (long) 100);
        boolean boolean8 = random3.nextBoolean();
        java.util.stream.DoubleStream doubleStream12 = random3.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream16 = random3.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream20 = random3.ints((long) 2109552831, (-1), (int) (byte) 0);
        int int21 = random3.nextInt();
        java.util.stream.IntStream intStream23 = random3.ints(20196651735143828L);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale0, random3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream26 = random3.doubles((-8605211458296689784L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(intStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 704741447 + "'", int21 == 704741447);
        org.junit.Assert.assertNotNull(intStream23);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-gb" + "'", str2, "en-gb");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-gb" + "'", str3, "en-gb");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        com.github.javafaker.Code code15 = faker10.code();
        com.github.javafaker.Options options16 = faker10.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "USA" + "'", str13, "USA");
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(code15);
        org.junit.Assert.assertNotNull(options16);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("GBR");
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Internet internet4 = faker0.internet();
        java.lang.String str6 = faker0.bothify("\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(internet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str6, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("coreano");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("ko");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setScript("\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        java.util.Locale locale10 = java.util.Locale.getDefault();
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.setDefault(category0, locale10);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale10);
        com.github.javafaker.Internet internet15 = faker14.internet();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine" + "'", str3, "Chine");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine" + "'", str4, "Chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(internet15);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setVariant("China");
        java.util.Locale.Builder builder7 = builder6.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "");
        java.util.Locale.Builder builder7 = builder2.clearExtensions();
        java.util.Locale.Builder builder8 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (??) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = locale13.stripExtensions();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale13);
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale13.getDisplayVariant(locale17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale17.getDisplayName(locale20);
        java.lang.String str22 = locale20.getDisplayName();
        java.lang.String str23 = locale11.getDisplayVariant(locale20);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleKeys();
        boolean boolean25 = locale20.hasExtensions();
        java.lang.String str26 = locale20.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine" + "'", str3, "Chine");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine" + "'", str4, "Chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "China" + "'", str18, "China");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese (China)" + "'", str21, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English" + "'", str22, "English");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        float float27 = random20.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream31 = random20.longs((-898210562305431527L), 7829883033568541535L, (-8364737658423095890L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str14, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fran\347ais" + "'", str16, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fra" + "'", str19, "fra");
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.1104294626213667d) + "'", double25 == (-1.1104294626213667d));
// flaky:         org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.18136406f + "'", float27 == 0.18136406f);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        boolean boolean1 = locale0.hasExtensions();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getScript();
        java.util.Random random5 = new java.util.Random(0L);
        java.util.stream.DoubleStream doubleStream8 = random5.doubles(0.3893588757268301d, (double) 1426876149034384144L);
        java.util.stream.IntStream intStream9 = random5.ints();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.lang.String str11 = locale0.getDisplayName();
        java.lang.String str12 = locale0.toLanguageTag();
        java.util.Locale locale16 = new java.util.Locale("\u82f1\u570b", "French (Canada)", "German");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale0.getDisplayName(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (France)" + "'", str11, "French (France)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-FR" + "'", str12, "fr-FR");
        org.junit.Assert.assertEquals(locale16.toString(), "\u82f1\u570b_FRENCH (CANADA)_German");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French (France)" + "'", str18, "French (France)");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CN");
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random3 = new java.util.Random();
        java.util.stream.IntStream intStream4 = random3.ints();
        java.util.stream.LongStream longStream7 = random3.longs((long) 1, (long) 100);
        boolean boolean8 = random3.nextBoolean();
        java.util.stream.DoubleStream doubleStream12 = random3.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double13 = random3.nextDouble();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale2, random3);
        double double15 = random3.nextDouble();
        boolean boolean16 = languageRange1.equals((java.lang.Object) double15);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7503278839876841d + "'", double13 == 0.7503278839876841d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9134679985834114d + "'", double15 == 0.9134679985834114d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CN");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        boolean boolean9 = languageRange1.equals((java.lang.Object) builder7);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        com.github.javafaker.Color color5 = faker3.color();
        com.github.javafaker.Options options6 = faker3.options();
        java.lang.String str8 = faker3.letterify("");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Address address6 = faker4.address();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.Name name8 = faker4.name();
        com.github.javafaker.Lorem lorem9 = faker4.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(name8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale locale7 = new java.util.Locale("cn (ZHO,Chine)");
        java.util.Locale locale8 = locale7.stripExtensions();
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale3.getDisplayName(locale8);
        java.util.Set<java.lang.String> strSet11 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "France" + "'", str4, "France");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "cn (zho,chine)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "cn (zho,chine)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (France)" + "'", str10, "French (France)");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str29 = locale28.toLanguageTag();
        java.lang.String str30 = locale28.toLanguageTag();
        java.util.Locale locale31 = locale28.stripExtensions();
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.lang.String str33 = locale31.getScript();
        java.lang.String str34 = locale31.getISO3Country();
        java.lang.String str35 = locale11.getDisplayName(locale31);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str14, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fran\347ais" + "'", str16, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fra" + "'", str19, "fra");
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.7445277368084593d) + "'", double25 == (-0.7445277368084593d));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-CN" + "'", str30, "zh-CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CHN" + "'", str34, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str35, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("zh_cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh_cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setExtension('#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getISO3Language();
        java.lang.String str4 = locale2.getDisplayVariant();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.lang.String str8 = locale5.getISO3Language();
        java.lang.String str9 = locale5.getDisplayLanguage();
        java.lang.String str10 = locale2.getDisplayCountry(locale5);
        java.util.Set<java.lang.String> strSet11 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale2.getDisplayName();
        java.lang.String str13 = locale2.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u56fd" + "'", str10, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French (France)" + "'", str12, "French (France)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fra" + "'", str13, "fra");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Deutsch");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale6.getDisplayName(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale6);
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random11);
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(locale6, random11);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getVariant();
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = locale17.getDisplayName(locale19);
        boolean boolean21 = locale17.hasExtensions();
        java.lang.String str22 = locale6.getDisplayLanguage(locale17);
        java.lang.String str23 = locale17.getScript();
        java.lang.String str24 = locale17.getDisplayVariant();
        boolean boolean25 = locale17.hasExtensions();
        java.lang.String str26 = locale17.getVariant();
        boolean boolean27 = languageRange1.equals((java.lang.Object) str26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deutsch" + "'", str2, "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deutsch" + "'", str3, "deutsch");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "deutsch" + "'", str4, "deutsch");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str9, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str20, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fran\347ais" + "'", str22, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        double double10 = languageRange1.getWeight();
        double double11 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale9);
        java.lang.String str13 = locale9.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale18.getExtension('u');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale18);
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale23.getISO3Country();
        java.util.Locale locale28 = new java.util.Locale("CN", "TW", "en-GB");
        java.lang.String str29 = locale23.getDisplayName(locale28);
        java.lang.String str30 = locale18.getDisplayName(locale28);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CAN" + "'", str24, "CAN");
        org.junit.Assert.assertEquals(locale28.toString(), "cn_TW_en-GB");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "French (Canada)" + "'", str29, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "French (Canada)" + "'", str30, "French (Canada)");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = null;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList12, filteringMode14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.Locale.FilteringMode filteringMode33 = null;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList31, filteringMode33);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Locale locale38 = java.util.Locale.CHINA;
        java.lang.String str39 = locale38.toLanguageTag();
        java.util.Locale locale40 = locale38.stripExtensions();
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.lang.String str43 = locale42.toLanguageTag();
        java.util.Locale locale44 = locale42.stripExtensions();
        java.util.Locale locale45 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale45);
        java.util.Locale locale47 = java.util.Locale.CHINA;
        java.lang.String str48 = locale47.toLanguageTag();
        java.util.Locale locale49 = java.util.Locale.UK;
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.lang.String str51 = locale50.toLanguageTag();
        java.util.Locale locale52 = locale50.stripExtensions();
        java.util.Locale locale53 = java.util.Locale.CHINA;
        java.lang.String str54 = locale53.getScript();
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale35, locale36, locale37, locale40, locale41, locale44, locale45, locale47, locale49, locale50, locale53 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList56);
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
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList73);
        java.util.Collection<java.util.Locale> localeCollection75 = null;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, localeCollection75);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList76);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-CN" + "'", str39, "zh-CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh-CN" + "'", str51, "zh-CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(localeList77);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        com.github.javafaker.Book book11 = faker10.book();
        com.github.javafaker.Lorem lorem12 = faker10.lorem();
        com.github.javafaker.Color color13 = faker10.color();
        com.github.javafaker.Color color14 = faker10.color();
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str9, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.util.Locale locale1 = new java.util.Locale("South Korea");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Locale locale6 = new java.util.Locale("US", "en-GB");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = locale1.getDisplayLanguage(locale6);
        org.junit.Assert.assertEquals(locale1.toString(), "south korea");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale6.toString(), "us_EN-GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "us" + "'", str7, "us");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "south korea" + "'", str8, "south korea");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setRegion("CA");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = builder9.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.util.Locale locale3 = new java.util.Locale("chinese", "Deutsch (Deutschland)", "CN");
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.lang.String str7 = locale4.getScript();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayLanguage(locale8);
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale4.getDisplayCountry(locale11);
        java.lang.String str15 = locale3.getDisplayScript(locale4);
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_DEUTSCH (DEUTSCHLAND)_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u56fd" + "'", str14, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.util.Random random1 = new java.util.Random((long) 180995420);
        boolean boolean2 = random1.nextBoolean();
        float float3 = random1.nextFloat();
        java.util.stream.IntStream intStream6 = random1.ints((-1291749778), 1790226314);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.096583426f + "'", float3 == 0.096583426f);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        java.util.stream.LongStream longStream21 = random8.longs((long) 1272557603);
        int int22 = random8.nextInt();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12750867492971416d + "'", double12 == 0.12750867492971416d);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2089325223448046659L + "'", long18 == 2089325223448046659L);
        org.junit.Assert.assertNotNull(longStream21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1312391968 + "'", int22 == 1312391968);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getLanguage();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        java.lang.String str7 = locale4.getCountry();
        java.util.Set<java.lang.Character> charSet8 = locale4.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale4);
        java.lang.String str10 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TW" + "'", str7, "TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u570b" + "'", str9, "\u4e2d\u570b");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str10, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "can_CN_en-gb");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("German");
        java.util.Locale.Builder builder10 = builder6.setScript("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        java.lang.String str8 = faker0.numerify("\u4e2d\u6587");
        com.github.javafaker.Color color9 = faker0.color();
        com.github.javafaker.Business business10 = faker0.business();
        com.github.javafaker.PhoneNumber phoneNumber11 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        java.lang.String str9 = faker7.numerify("GBR");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GBR" + "'", str9, "GBR");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("fra");
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Locale.Builder builder8 = builder1.setLocale(locale6);
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
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category19);
        java.util.Locale locale22 = java.util.Locale.getDefault(category19);
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale23.getDisplayCountry();
        java.lang.String str26 = locale23.getDisplayScript();
        java.util.Locale.setDefault(category19, locale23);
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.getScript();
        java.lang.String str30 = locale28.getDisplayCountry();
        java.util.Locale.setDefault(category19, locale28);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = java.util.Locale.CHINA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = locale33.stripExtensions();
        java.lang.String str36 = locale32.getDisplayVariant(locale33);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale33);
        java.util.Locale locale38 = locale33.stripExtensions();
        java.util.Locale.setDefault(locale33);
        java.util.Locale.setDefault(category19, locale33);
        java.util.Locale.setDefault(category9, locale33);
        java.util.Locale.Builder builder42 = builder8.setLocale(locale33);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fra");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
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
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd" + "'", str24, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u56fd" + "'", str25, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u56fd" + "'", str30, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet72 = locale71.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap74);
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
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(languageRangeList75);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) (short) 100);
        double double8 = random0.nextGaussian();
        java.util.stream.IntStream intStream9 = random0.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.8888458858004018d) + "'", double4 == (-0.8888458858004018d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.35322953397021223d) + "'", double8 == (-0.35322953397021223d));
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        double double15 = random0.nextDouble();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random0);
        int int17 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream21 = random0.longs((-6846519286938011730L), (-4445700532534197469L), 156434799473587714L);
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
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.20064342698243387d + "'", double15 == 0.20064342698243387d);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1028180260) + "'", int17 == (-1028180260));
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.getISO3Language();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale5.getLanguage();
        java.util.Random random10 = new java.util.Random();
        java.util.stream.IntStream intStream11 = random10.ints();
        java.util.stream.LongStream longStream14 = random10.longs((long) 1, (long) 100);
        boolean boolean15 = random10.nextBoolean();
        java.util.stream.DoubleStream doubleStream17 = random10.doubles(0L);
        java.util.stream.DoubleStream doubleStream18 = random10.doubles();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale5, random10);
        java.lang.String str20 = locale2.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str1, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587\u7f8e\u56fd)" + "'", str20, "\u82f1\u6587\u7f8e\u56fd)");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale.Builder builder6 = builder3.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayCountry();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi! (HI!,hi!)");
        java.util.Locale locale4 = new java.util.Locale("zh-CN", "Chinesisch (China)");
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale9.getCountry();
        java.lang.String str11 = locale9.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.getScript();
        java.lang.String str15 = locale12.getDisplayCountry(locale13);
        java.lang.String str16 = locale9.getDisplayCountry(locale12);
        java.lang.String str17 = locale7.getDisplayScript(locale9);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale18.getVariant();
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale18.getDisplayName(locale20);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale18);
        java.util.Random random23 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream26 = random23.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(random23);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale18, random23);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale29.getVariant();
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.lang.String str32 = locale29.getDisplayName(locale31);
        boolean boolean33 = locale29.hasExtensions();
        java.lang.String str34 = locale18.getDisplayLanguage(locale29);
        java.lang.String str35 = locale9.getDisplayVariant(locale29);
        java.lang.String str36 = locale4.getDisplayName(locale9);
        java.lang.String str37 = locale4.getDisplayVariant();
        java.util.Locale locale39 = new java.util.Locale("ko");
        java.lang.String str40 = locale39.getISO3Language();
        java.lang.String str41 = locale4.getDisplayCountry(locale39);
        java.lang.String str42 = locale1.getDisplayName(locale39);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "zh-cn_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GB" + "'", str10, "GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-GB" + "'", str11, "en-GB");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u82f1\u56fd" + "'", str16, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinesisch (China)" + "'", str21, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinesisch (China)" + "'", str32, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "zh-cn (CHINESISCH (CHINA))" + "'", str36, "zh-cn (CHINESISCH (CHINA))");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "kor" + "'", str40, "kor");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "CHINESISCH (CHINA)" + "'", str41, "CHINESISCH (CHINA)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        java.util.stream.LongStream longStream21 = random8.longs((long) 1272557603);
        java.util.stream.DoubleStream doubleStream25 = random8.doubles(9136968408200044446L, (double) (-700709580), 0.8401911799569864d);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random8);
        java.util.stream.IntStream intStream27 = random8.ints();
        java.util.stream.LongStream longStream29 = random8.longs((long) 17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.3693778715677396d) + "'", double12 == (-1.3693778715677396d));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-7501102069366529903L) + "'", long18 == (-7501102069366529903L));
        org.junit.Assert.assertNotNull(longStream21);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertNotNull(longStream29);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        com.github.javafaker.Finance finance7 = faker3.finance();
        com.github.javafaker.Options options8 = faker3.options();
        com.github.javafaker.App app9 = faker3.app();
        com.github.javafaker.DateAndTime dateAndTime10 = faker3.date();
        com.github.javafaker.App app11 = faker3.app();
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
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(app11);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        java.lang.String str11 = locale2.getExtension('a');
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        long long17 = random0.nextLong();
        java.util.stream.LongStream longStream19 = random0.longs(878358682076552699L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream23 = random0.ints(5192417783011311239L, 1238788619, (-2000885012));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0164516264812922d + "'", double4 == 1.0164516264812922d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1893855556791454d + "'", double6 == 0.1893855556791454d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.11748000797241523d) + "'", double11 == (-0.11748000797241523d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3422989099713268259L + "'", long17 == 3422989099713268259L);
        org.junit.Assert.assertNotNull(longStream19);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        java.lang.String str6 = locale0.getDisplayVariant(locale5);
        java.lang.String str7 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getLanguage();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.lang.String str13 = locale0.getDisplayScript(locale10);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale0.getDisplayLanguage(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CHN" + "'", str7, "CHN");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHN" + "'", str9, "CHN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        boolean boolean7 = random0.nextBoolean();
        int int9 = random0.nextInt(108279374);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5278723265455694d + "'", double4 == 0.5278723265455694d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86113160 + "'", int9 == 86113160);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) -1, (int) (byte) 10);
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Number number10 = faker9.number();
        com.github.javafaker.App app11 = faker9.app();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.89729923f + "'", float5 == 0.89729923f);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(app11);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap5);
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags(languageRangeList48, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList53, filteringMode54);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, strMap59);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList60, (java.util.Collection<java.lang.String>) strList63);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList65);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList66);
        java.lang.String str68 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList67);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeList6);
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
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "");
        java.util.Locale.Builder builder9 = builder2.setExtension('a', "Cina");
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale10.getScript();
        java.util.Locale.Builder builder12 = builder2.setLocale(locale10);
        boolean boolean13 = locale10.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        double double4 = random0.nextGaussian();
        float float5 = random0.nextFloat();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream9 = random0.longs((long) 361523860, 8299313697544275857L);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6457494152274472d) + "'", double2 == (-1.6457494152274472d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3962766723506361d + "'", double4 == 1.3962766723506361d);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.89944786f + "'", float5 == 0.89944786f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream9);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = null; // flaky: faker0.regexify("\uc911\uad6d\uc5b4\uc911\uad6d)");
        com.github.javafaker.Finance finance3 = faker0.finance();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d" + "'", str2, "\uc911\uad6d\uc5b4\uc911\uad6d");
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale3.getDisplayCountry(locale4);
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.lang.String str8 = locale2.getVariant();
        java.lang.String str9 = locale2.getDisplayScript();
        java.lang.String str10 = locale2.getDisplayName();
        java.lang.String str11 = locale2.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str10, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color10 = faker9.color();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = faker9.resolve("Chinesisch China");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.22555626922024352d) + "'", double4 == (-0.22555626922024352d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale7 = locale0.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale8.getCountry();
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale8.getVariant();
        java.lang.String str12 = locale0.getDisplayName(locale8);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale locale15 = builder14.build();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale.Builder builder18 = builder14.setLocale(locale16);
        java.util.Locale.Builder builder20 = builder18.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale locale21 = builder20.build();
        java.lang.String str22 = locale8.getDisplayVariant(locale21);
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GB" + "'", str9, "GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "zh_CN");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GB", (double) (-553397993856798634L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.5339799385679866E17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        java.lang.String str6 = locale0.getDisplayVariant(locale5);
        java.lang.String str7 = locale5.getCountry();
        java.lang.String str8 = locale5.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str7, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = new java.util.Locale("\uc911\uad6d\uc5b4\uc911\uad6d)", "us", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.lang.String str7 = locale5.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str7, "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 0, (double) '#');
        double double25 = random21.nextGaussian();
        java.util.stream.DoubleStream doubleStream26 = random21.doubles();
        java.util.stream.IntStream intStream29 = random21.ints((int) (byte) 10, (int) '#');
        random21.setSeed((long) (short) 1);
        random21.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream36 = random21.doubles(0.8372999373811125d, 1.1186852440711024d);
        java.util.stream.LongStream longStream38 = random21.longs(0L);
        java.util.Random random39 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream42 = random39.doubles((double) (byte) 0, (double) '#');
        double double43 = random39.nextGaussian();
        java.util.stream.DoubleStream doubleStream44 = random39.doubles();
        boolean boolean45 = random39.nextBoolean();
        java.util.stream.DoubleStream doubleStream48 = random39.doubles((double) (-4711220549636234721L), 0.04702830040266232d);
        java.util.Random random49 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream52 = random49.doubles((double) (byte) 0, (double) '#');
        double double53 = random49.nextGaussian();
        java.util.stream.DoubleStream doubleStream54 = random49.doubles();
        java.util.stream.IntStream intStream57 = random49.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random49);
        java.util.stream.LongStream longStream59 = random49.longs();
        java.util.Random random60 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream63 = random60.doubles((double) (byte) 0, (double) '#');
        double double64 = random60.nextGaussian();
        java.util.stream.DoubleStream doubleStream65 = random60.doubles();
        java.util.stream.IntStream intStream68 = random60.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream69 = random60.doubles();
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random60.nextBytes(byteArray73);
        random49.nextBytes(byteArray73);
        random39.nextBytes(byteArray73);
        random21.nextBytes(byteArray73);
        random0.nextBytes(byteArray73);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.4859292885231299d) + "'", double9 == (-1.4859292885231299d));
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(byteArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[120, -85, 40]");
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.11879413035756765d) + "'", double25 == (-0.11879413035756765d));
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(longStream38);
        org.junit.Assert.assertNotNull(doubleStream42);
// flaky:         org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.6589426695275481d) + "'", double43 == (-0.6589426695275481d));
        org.junit.Assert.assertNotNull(doubleStream44);
// flaky:         org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(doubleStream48);
        org.junit.Assert.assertNotNull(doubleStream52);
// flaky:         org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.2841014566599833d + "'", double53 == 1.2841014566599833d);
        org.junit.Assert.assertNotNull(doubleStream54);
        org.junit.Assert.assertNotNull(intStream57);
        org.junit.Assert.assertNotNull(longStream59);
        org.junit.Assert.assertNotNull(doubleStream63);
// flaky:         org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.2160114843107098d + "'", double64 == 0.2160114843107098d);
        org.junit.Assert.assertNotNull(doubleStream65);
        org.junit.Assert.assertNotNull(intStream68);
        org.junit.Assert.assertNotNull(doubleStream69);
        org.junit.Assert.assertNotNull(byteArray73);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-93, 32, 32]");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Deutsch", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("zh-CN", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("zh-TW", strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = null;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.Locale.FilteringMode filteringMode31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29, filteringMode31);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList38, (java.util.Collection<java.lang.String>) strList41);
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList43);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList8, (java.util.Collection<java.lang.String>) strList43, filteringMode45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strList46);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList47);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode45.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.IntStream intStream5 = random0.ints(10L);
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((-1.2675185409054992d), 0.21161470649848002d);
        boolean boolean9 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8459605484748531d + "'", double2 == 0.8459605484748531d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.Business business7 = faker3.business();
        java.lang.String str9 = faker3.bothify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str11 = faker3.letterify("\u82f1\u6587");
        com.github.javafaker.DateAndTime dateAndTime12 = faker3.date();
        com.github.javafaker.Hacker hacker13 = faker3.hacker();
        java.lang.String str15 = faker3.numerify("zh_tw");
        com.github.javafaker.Internet internet16 = faker3.internet();
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
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(hacker13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh_tw" + "'", str15, "zh_tw");
        org.junit.Assert.assertNotNull(internet16);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.lang.String str7 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        java.lang.String str16 = locale0.getUnicodeLocaleType("DE");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITA");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        com.github.javafaker.Business business8 = faker3.business();
        com.github.javafaker.Company company9 = faker3.company();
        com.github.javafaker.Book book10 = faker3.book();
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
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale0.getDisplayCountry(locale7);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("\u4e2d\u56fd");
        java.lang.String str14 = locale12.getExtension('x');
        java.lang.String str15 = locale12.getScript();
        java.lang.String str16 = locale12.getDisplayName();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale17.getScript();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str23 = locale17.getDisplayLanguage(locale21);
        java.lang.String str24 = locale12.getDisplayScript(locale17);
        java.lang.String str25 = locale0.getDisplayCountry(locale12);
        java.lang.String str26 = locale12.getScript();
        java.util.Set<java.lang.Character> charSet27 = locale12.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charSet27);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Options options4 = faker0.options();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Number number7 = faker0.number();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        java.util.Locale.Builder builder15 = builder6.addUnicodeLocaleAttribute("CHN");
        java.util.Locale locale16 = builder15.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.removeUnicodeLocaleAttribute("US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: US [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN_#u-chn");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Lorem lorem7 = faker3.lorem();
        com.github.javafaker.Finance finance8 = faker3.finance();
        com.github.javafaker.Address address9 = faker3.address();
        com.github.javafaker.Book book10 = faker3.book();
        com.github.javafaker.DateAndTime dateAndTime11 = faker3.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Franz\366sisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franzo?sisch(kanada)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        java.util.stream.LongStream longStream14 = random0.longs((long) 216977560, (-5987658548145048247L), (-3019054096168434161L));
        java.util.stream.DoubleStream doubleStream15 = random0.doubles();
        java.util.stream.DoubleStream doubleStream18 = random0.doubles((double) 0.3640855f, (double) 5447025628597271269L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.772080929659155d) + "'", double4 == (-1.772080929659155d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.DateAndTime dateAndTime5 = faker3.date();
        java.lang.String str7 = faker3.regexify("French (Canada)");
        java.lang.String str9 = faker3.letterify("fr_FR");
        com.github.javafaker.Business business10 = faker3.business();
        java.lang.String str12 = faker3.bothify("en-GB");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French Canada" + "'", str7, "French Canada");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr_FR" + "'", str9, "fr_FR");
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getISO3Language();
        java.lang.String str8 = locale4.getScript();
        java.lang.String str9 = locale4.getDisplayVariant();
        java.lang.String str10 = locale4.getCountry();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CN" + "'", str10, "CN");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        java.util.Locale locale2 = new java.util.Locale("TWN", "\u6cd5\u6587\u6cd5\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587\u6cd5\u56fd");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder5.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Color color6 = faker0.color();
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        com.github.javafaker.Name name8 = faker0.name();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getLanguage();
        java.util.Locale locale4 = locale2.stripExtensions();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        double double9 = random5.nextGaussian();
        java.util.stream.DoubleStream doubleStream10 = random5.doubles();
        java.util.stream.LongStream longStream12 = random5.longs((long) (short) 100);
        double double13 = random5.nextGaussian();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale2, random5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4259618133660777d + "'", double9 == 0.4259618133660777d);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(longStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.5724006746240884d + "'", double13 == 1.5724006746240884d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = locale5.stripExtensions();
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags(languageRangeList48, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList53, filteringMode54);
        boolean boolean56 = locale5.equals((java.lang.Object) strList53);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
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
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream31 = random15.doubles(4417417182883005686L, 0.15815778138274278d, (-0.1002479776165969d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.7836527540957999d) + "'", double19 == (-0.7836527540957999d));
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.040552676f + "'", float25 == 0.040552676f);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.7137263000581228d) + "'", double26 == (-0.7137263000581228d));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.setLanguage("deutsch");
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
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.toLanguageTag();
        java.lang.String str7 = locale3.getDisplayScript();
        java.lang.String str8 = locale3.getISO3Country();
        java.lang.String str10 = locale3.getExtension('x');
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.lang.String str19 = locale16.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.lang.String str23 = locale20.getDisplayVariant();
        java.lang.String str24 = locale16.getDisplayName(locale20);
        java.lang.String str25 = locale7.getDisplayCountry(locale20);
        java.util.Locale.setDefault(locale20);
        java.lang.String str27 = locale20.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str24, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u56fd" + "'", str27, "\u4e2d\u56fd");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.util.Random random1 = new java.util.Random((long) 50);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale5.getUnicodeLocaleType("zh");
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale5);
        java.lang.String str9 = locale5.toLanguageTag();
        java.lang.String str10 = locale0.getDisplayLanguage(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-TW" + "'", str9, "zh-TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\u4e2d\u56fd");
        java.lang.String str7 = locale5.getExtension('x');
        java.lang.String str8 = locale5.getScript();
        java.lang.String str9 = locale5.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = locale10.getScript();
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale10.getDisplayLanguage(locale14);
        java.lang.String str17 = locale5.getDisplayScript(locale10);
        java.util.Locale.Builder builder18 = builder1.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.addUnicodeLocaleAttribute("\uc911\uad6d\uc5b4\ub300\ub9cc)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???????? (?????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        java.lang.String str13 = faker10.numerify("Franz\366sisch (Frankreich)");
        com.github.javafaker.Finance finance14 = faker10.finance();
        java.lang.String str16 = null; // flaky: faker10.regexify("\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(finance14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587" + "'", str16, "\uc77c\ubcf8\uc5b4\uc77c\ubcf8\u82f1\u6587");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.util.Random random1 = new java.util.Random((long) 1780165113);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        java.lang.String str7 = faker0.regexify("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker0.resolve("can_CN_en-gb");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u570b");
        java.lang.String str2 = locale1.getLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u570b");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("cn (ZHO,Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: cn (ZHO,Chine) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        com.github.javafaker.Company company11 = faker0.company();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(company11);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        java.lang.String str3 = faker0.numerify("GB");
        java.lang.String str5 = faker0.bothify("\u6cd5\u6587\u6cd5\u56fd)");
        com.github.javafaker.Hacker hacker6 = faker0.hacker();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GB" + "'", str3, "GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.util.Locale locale2 = new java.util.Locale("\uc911\uad6d\uc5b4\ub300\ub9cc)_FRAN\347AIS (CANADA)", "\u4e2d\u6587\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\uc911\uad6d\uc5b4\ub300\ub9cc)_fran\347\u4e2d\u6587\u4e2d\u56fd");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale12.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.lang.String str19 = locale16.getScript();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale16.getDisplayLanguage(locale20);
        boolean boolean23 = locale20.hasExtensions();
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale locale26 = new java.util.Locale("Royaume-Uni");
        java.util.Locale.setDefault(category0, locale26);
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd" + "'", str13, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u56fd" + "'", str14, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals(locale26.toString(), "royaume-uni");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles((-1.0d), 0.028145596690574037d);
        double double10 = random2.nextDouble();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Name name12 = faker11.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u56fd" + "'", str1, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.27745569177083307d + "'", double10 == 0.27745569177083307d);
        org.junit.Assert.assertNotNull(name12);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.util.Locale locale8 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str9 = locale8.getDisplayCountry();
        boolean boolean10 = locale8.hasExtensions();
        boolean boolean11 = languageRange1.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream9 = random0.longs((long) 'a', (long) 401882126);
        float float10 = random0.nextFloat();
        java.util.stream.IntStream intStream13 = random0.ints((-2056097846), 252953418);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6688513145563846d) + "'", double4 == (-0.6688513145563846d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0968557f + "'", float10 == 0.0968557f);
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("Chine");
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("Taiwan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setRegion("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.numerify("chinois");
        com.github.javafaker.Company company6 = faker3.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = new java.util.Locale("Chine");
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale1.getDisplayName(locale4);
        java.lang.Object obj9 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "chine");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chine" + "'", str7, "chine");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English (United States)" + "'", str8, "English (United States)");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "en_US");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random12 = new java.util.Random();
        java.util.stream.IntStream intStream13 = random12.ints();
        java.util.stream.LongStream longStream16 = random12.longs((long) 1, (long) 100);
        boolean boolean17 = random12.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random12.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double22 = random12.nextDouble();
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale11, random12);
        java.util.stream.DoubleStream doubleStream26 = random12.doubles((double) (-2506914755829807295L), (double) 100.0f);
        double double27 = random12.nextDouble();
        boolean boolean28 = random12.nextBoolean();
        java.util.stream.IntStream intStream31 = random12.ints(352608531, 1575358308);
        java.util.Random random32 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream35 = random32.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream36 = random32.doubles();
        java.util.Random random37 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles((double) (byte) 0, (double) '#');
        double double41 = random37.nextGaussian();
        java.util.stream.DoubleStream doubleStream42 = random37.doubles();
        java.util.stream.IntStream intStream45 = random37.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream46 = random37.doubles();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random37.nextBytes(byteArray50);
        random32.nextBytes(byteArray50);
        random12.nextBytes(byteArray50);
        random5.nextBytes(byteArray50);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6816143142332501d + "'", double22 == 0.6816143142332501d);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.519656732421306d + "'", double27 == 0.519656732421306d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intStream31);
        org.junit.Assert.assertNotNull(doubleStream35);
        org.junit.Assert.assertNotNull(doubleStream36);
        org.junit.Assert.assertNotNull(doubleStream40);
// flaky:         org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-0.6217455674198319d) + "'", double41 == (-0.6217455674198319d));
        org.junit.Assert.assertNotNull(doubleStream42);
        org.junit.Assert.assertNotNull(intStream45);
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertNotNull(byteArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-22, 74, 101]");
    }
}
